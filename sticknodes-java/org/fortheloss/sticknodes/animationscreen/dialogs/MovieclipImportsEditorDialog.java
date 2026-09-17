package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class MovieclipImportsEditorDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper implements org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog {
    private static float dialogLastScrollY = 0.0f;
    private static float lastScrollY = 0.0f;
    private static int lastSelectedLibraryId = -1;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount> _allFiles;
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _calculateButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _cleanupNamesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _deleteButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _deleteButtonsScrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _editButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _editButtonsScrollPane;
    private java.lang.String _filterSubstring;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _filterTextfield;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _hideButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _hideButtonsScrollPane;
    private org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount> _list;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _okayButton;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;










    public static class FileNameIdUseCount {
        public int libraryId;
        public java.lang.String name;
        public int useCount;

        public FileNameIdUseCount(java.lang.String r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.useCount = r0
                r1.name = r2
                r1.libraryId = r3
                return
        }

        public void dispose() {
                r1 = this;
                r0 = 0
                r1.name = r0
                return
        }

        public java.lang.String toString() {
                r4 = this;
                int r0 = r4.useCount
                if (r0 < 0) goto L20
                java.lang.String r1 = r4.name
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "("
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = ") "
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = r2.toString()
                goto L22
            L20:
                java.lang.String r0 = r4.name
            L22:
                return r0
        }
    }

    /* renamed from: -$$Nest$fget_allFiles, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m581$$Nest$fget_allFiles(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r0 = r0._allFiles
            return r0
    }

    /* renamed from: -$$Nest$fget_okayButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m582$$Nest$fget_okayButton(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0._okayButton
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m583$$Nest$fget_projectDataRef(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m584$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m585$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$mupdateFiles, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m586$$Nest$mupdateFiles(org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog r0, boolean r1) {
            r0.updateFiles(r1)
            return
    }

    static {
            return
    }

    public MovieclipImportsEditorDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3) {
            r0 = this;
            r0.<init>(r1)
            r0._animateToolsModuleRef = r2
            r0._projectDataRef = r3
            return
    }

    private void calculateUseCountsAndUpdateFiles() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._okayButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._okayButton
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$6 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$6
            r1.<init>(r3)
            r0.postRunnable(r1)
            return
    }

    private void onFilterTyped() {
            r2 = this;
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r2._filterTextfield     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = r1.getText()     // Catch: java.lang.Exception -> L19
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Exception -> L19
            if (r1 == 0) goto L10
            r2._filterSubstring = r0     // Catch: java.lang.Exception -> L19
            goto L1b
        L10:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r1 = r2._filterTextfield     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = r1.getText()     // Catch: java.lang.Exception -> L19
            r2._filterSubstring = r1     // Catch: java.lang.Exception -> L19
            goto L1b
        L19:
            r2._filterSubstring = r0
        L1b:
            r0 = 0
            r2.updateFiles(r0)
            return
    }

    private void updateFiles(boolean r8) {
            r7 = this;
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L58
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._calculateButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r8.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7._calculateButton
            r2 = 1065353216(0x3f800000, float:1.0)
            r8.setColor(r2, r2, r2, r2)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r8 = r7._allFiles
            int r8 = r8.size()
            int r8 = r8 - r1
        L19:
            if (r8 < 0) goto L29
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r2 = r7._allFiles
            java.lang.Object r2 = r2.get(r8)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r2
            r2.dispose()
            int r8 = r8 + (-1)
            goto L19
        L29:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r8 = r7._allFiles
            r8.clear()
            org.fortheloss.sticknodes.data.ProjectData r8 = r7._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r8 = r8.libraryMovieclips
            int r8 = r8.size()
            r2 = 0
        L37:
            if (r2 >= r8) goto L58
            org.fortheloss.sticknodes.data.ProjectData r3 = r7._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r3 = r3.libraryMovieclips
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r7._allFiles
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount
            java.lang.String r6 = r3.getName()
            int r3 = r3.getLibraryID()
            r5.<init>(r6, r3)
            r4.add(r5)
            int r2 = r2 + 1
            goto L37
        L58:
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r8 = r7._list
            com.badlogic.gdx.utils.Array r8 = r8.getItems()
            r8.clear()
            java.lang.String r2 = r7._filterSubstring
            if (r2 == 0) goto Laa
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r2 = r7._allFiles
            int r2 = r2.size()
            r3 = 0
        L6c:
            if (r3 >= r2) goto Lc1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r7._allFiles
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r4 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r4
            java.lang.String r4 = r4.name
            java.lang.String r5 = r7._filterSubstring
            int r5 = r5.length()
            if (r5 != r1) goto L94
            java.lang.String r5 = r7._filterSubstring
            boolean r4 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(r4, r5)
            if (r4 == 0) goto La7
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r7._allFiles
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r4 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r4
            r8.add(r4)
            goto La7
        L94:
            java.lang.String r5 = r7._filterSubstring
            boolean r4 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(r4, r5)
            if (r4 == 0) goto La7
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r7._allFiles
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r4 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r4
            r8.add(r4)
        La7:
            int r3 = r3 + 1
            goto L6c
        Laa:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r2 = r7._allFiles
            int r2 = r2.size()
            r3 = 0
        Lb1:
            if (r3 >= r2) goto Lc1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r7._allFiles
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r4 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r4
            r8.add(r4)
            int r3 = r3 + 1
            goto Lb1
        Lc1:
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r2 = r7._list
            r2.setItems(r8)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7._hideButtons
            com.badlogic.gdx.utils.SnapshotArray r2 = r2.getChildren()
            int r3 = r2.size
            int r3 = r3 - r1
        Lcf:
            if (r3 < 0) goto Ldd
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = (com.badlogic.gdx.scenes.scene2d.Actor) r4
            r4.clear()
            int r3 = r3 + (-1)
            goto Lcf
        Ldd:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7._hideButtons
            r2.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7._deleteButtons
            com.badlogic.gdx.utils.SnapshotArray r2 = r2.getChildren()
            int r3 = r2.size
            int r3 = r3 - r1
        Leb:
            if (r3 < 0) goto Lf9
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = (com.badlogic.gdx.scenes.scene2d.Actor) r4
            r4.clear()
            int r3 = r3 + (-1)
            goto Leb
        Lf9:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7._deleteButtons
            r2.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7._editButtons
            com.badlogic.gdx.utils.SnapshotArray r2 = r2.getChildren()
            int r3 = r2.size
            int r3 = r3 - r1
        L107:
            if (r3 < 0) goto L115
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = (com.badlogic.gdx.scenes.scene2d.Actor) r4
            r4.clear()
            int r3 = r3 + (-1)
            goto L107
        L115:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7._editButtons
            r2.clearChildren()
            int r2 = r8.size
        L11c:
            if (r0 >= r2) goto L18f
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallShowHideCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3.setUserObject(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$7 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$7
            r4.<init>(r7, r3, r8)
            r3.addListener(r4)
            org.fortheloss.sticknodes.data.ProjectData r4 = r7._projectDataRef
            java.util.ArrayList<java.lang.Integer> r4 = r4.hiddenMovieclipLibraryIDs
            java.lang.Object r5 = r8.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r5
            int r5 = r5.libraryId
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.contains(r5)
            r4 = r4 ^ r1
            r3.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r7._hideButtons
            r4.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r3 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallDeleteButtonStyle()
            r3.<init>(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3.setUserObject(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$8 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$8
            r4.<init>(r7, r3, r8)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r7._deleteButtons
            r4.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallEditButtonStyle()
            r4.<init>(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4.setUserObject(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$9 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$9
            r5.<init>(r7, r3, r8)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r7._editButtons
            r3.addActor(r4)
            int r0 = r0 + 1
            goto L11c
        L18f:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog
    public void actuallyDeleteFigure(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.deleteMCFromProject(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r4) {
            r3 = this;
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 2
            if (r4 != r0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._calculateButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._calculateButton
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.setColor(r1, r1, r1, r0)
            r3.calculateUseCountsAndUpdateFiles()
            r3.doNotHideDialog()
            goto L79
        L20:
            r0 = 3
            if (r4 != r0) goto L5a
            com.badlogic.gdx.utils.Array r4 = new com.badlogic.gdx.utils.Array
            r4.<init>()
            r0 = 0
            org.fortheloss.sticknodes.data.ProjectData r1 = r3._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r1 = r1.libraryMovieclips
            int r1 = r1.size()
        L31:
            if (r0 >= r1) goto L47
            org.fortheloss.sticknodes.data.ProjectData r2 = r3._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r2 = r2.libraryMovieclips
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r2 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r2
            java.lang.String r2 = r2.getName()
            r4.add(r2)
            int r0 = r0 + 1
            goto L31
        L47:
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r3._animationScreenRef
            r0.<init>(r3, r1)
            r0.initialize(r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            r4.addDialogToStage(r0)
            r3.doNotHideDialog()
            goto L79
        L5a:
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r3._list
            int r4 = r4.getSelectedIndex()
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.lastSelectedLibraryId = r4
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r3._scrollPane
            float r4 = r4.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.lastScrollY = r4
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r3.getDialogScrollPane()
            float r4 = r4.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.dialogLastScrollY = r4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            r4.updateMovieclipLibraryList()
        L79:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._projectDataRef = r0
            r3._animateToolsModuleRef = r0
            r3._hideButtonsScrollPane = r0
            r3._deleteButtonsScrollPane = r0
            r3._editButtonsScrollPane = r0
            r3._scrollPane = r0
            r3._filterTextfield = r0
            r3._filterSubstring = r0
            r3._list = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r1 = r3._allFiles
            if (r1 == 0) goto L2f
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L1d:
            if (r1 < 0) goto L2d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r2 = r3._allFiles
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L1d
        L2d:
            r3._allFiles = r0
        L2f:
            r3._hideButtons = r0
            r3._deleteButtons = r0
            r3._editButtons = r0
            r3._okayButton = r0
            r3._calculateButton = r0
            r3._cleanupNamesButton = r0
            super.dispose()
            return
    }

    public void initialize() {
            r11 = this;
            java.lang.String r0 = "deleteHideTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r11._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            r1 = 4
            r2 = 1
            if (r0 != 0) goto L59
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "belowImportedMCs"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.String r4 = "deleteHideInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "\n\n"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
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
        L59:
            java.lang.String r0 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r11.createTextField(r0)
            r11._filterTextfield = r0
            java.lang.String r3 = "filterList"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setMessageText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r11._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$2 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$2
            r3.<init>(r11)
            r0.setTextFieldListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r11._filterTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r11.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r3)
            r0.colspan(r1)
            r11.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r0.<init>(r1)
            org.fortheloss.framework.ListCustomItemHeight r1 = new org.fortheloss.framework.ListCustomItemHeight
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
            r1.<init>(r3, r4, r5)
            r11._list = r1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r1.<init>()
            r11._hideButtons = r1
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = r1.align(r3)
            r4 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = r1.pad(r4)
            r1.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r1.<init>()
            r11._deleteButtons = r1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = r1.pad(r4)
            r1.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r1.<init>()
            r11._editButtons = r1
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = r1.align(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r1 = r1.pad(r4)
            r1.space(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r5 = r11._list
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r1.<init>(r5, r6)
            r11._scrollPane = r1
            r5 = 0
            r1.setFadeScrollBars(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$3 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$3
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r11._hideButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r1.<init>(r11, r6, r7)
            r11._hideButtonsScrollPane = r1
            r1.setFadeScrollBars(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11._hideButtonsScrollPane
            r1.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11._hideButtonsScrollPane
            r1.setSmoothScrolling(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$4 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$4
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r11._deleteButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r1.<init>(r11, r6, r7)
            r11._deleteButtonsScrollPane = r1
            r1.setFadeScrollBars(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11._deleteButtonsScrollPane
            r1.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11._deleteButtonsScrollPane
            r1.setSmoothScrolling(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$5 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$5
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r11._editButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r1.<init>(r11, r6, r7)
            r11._editButtonsScrollPane = r1
            r1.setFadeScrollBars(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11._editButtonsScrollPane
            r1.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11._editButtonsScrollPane
            r1.setSmoothScrolling(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r11._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 == 0) goto L165
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getBiggerListHeight()
            goto L169
        L165:
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
        L169:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r11._hideButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r11.addContent(r6)
            float r7 = r0.getWidth()
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            r9 = 1101004800(0x41a00000, float:20.0)
            float r8 = r8 * r9
            float r7 = r7 + r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r7)
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r5, r5)
            r7 = 16
            r6.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r11._deleteButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r11.addContent(r6)
            float r8 = r0.getWidth()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r9
            float r8 = r8 + r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r5, r5)
            r6.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r11._editButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r11.addContent(r6)
            float r8 = r0.getWidth()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r9
            float r8 = r8 + r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.uniform(r5, r5)
            r6.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r11._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r11.addContent(r6)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            float r0 = r0.getWidth()
            r8 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r8
            float r7 = r7 - r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r6.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.height(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.uniform(r5, r5)
            r1 = 8
            r0.align(r1)
            java.lang.String r0 = "okay"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            r11._okayButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r11.addButton(r0, r1)
            java.lang.String r0 = "cleanupNames"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            r11._cleanupNamesButton = r0
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.addButton(r0, r1)
            java.lang.String r0 = "calculateUseCounts"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r11.createTextButton(r0)
            r11._calculateButton = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r11.addButton(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11._allFiles = r0
            r11.updateFiles(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r11.getDialog()
            r0.validate()
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r0 = r11._list
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r1 = r0.size
            r3 = -1
            if (r1 <= 0) goto L28a
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.lastSelectedLibraryId
            if (r5 == r3) goto L26b
            int r1 = r1 - r2
        L259:
            if (r1 < 0) goto L26b
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r2
            int r2 = r2.libraryId
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.lastSelectedLibraryId
            if (r2 != r5) goto L268
            goto L26c
        L268:
            int r1 = r1 + (-1)
            goto L259
        L26b:
            r1 = -1
        L26c:
            if (r1 < 0) goto L284
            int r0 = r0.size
            if (r1 >= r0) goto L284
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r11._scrollPane
            float r2 = r0.getMaxY()
            float r3 = org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.lastScrollY
            float r2 = r2 - r3
            r0.scrollTo(r4, r2, r4, r4)
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r0 = r11._list
            r0.setSelectedIndex(r1)
            goto L293
        L284:
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r0 = r11._list
            r0.setSelectedIndex(r3)
            goto L293
        L28a:
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.lastSelectedLibraryId = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.lastScrollY = r4
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r0 = r11._list
            r0.setSelectedIndex(r3)
        L293:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r11.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r11.getDialogScrollPane()
            float r1 = r1.getMaxY()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.dialogLastScrollY
            float r1 = r1 - r2
            r0.scrollTo(r4, r1, r4, r4)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog
    public void onFilesModified() {
            r1 = this;
            r0 = 1
            r1.updateFiles(r0)
            return
    }
}
