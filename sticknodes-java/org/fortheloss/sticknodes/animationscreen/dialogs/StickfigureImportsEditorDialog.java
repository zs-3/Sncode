package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class StickfigureImportsEditorDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper implements org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog {
    private static float dialogLastScrollY = 0.0f;
    private static float lastScrollY = 0.0f;
    private static int lastSelectedLibraryId = -1;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount> _allFiles;
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule _animationBasedModuleRef;
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
    private org.fortheloss.sticknodes.movieclip.MCMovieclipSource _nonLibraryMCBeingEditedRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _okayButton;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _previewButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _previewButtonsScrollPane;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private int[] _useCounts;












    /* renamed from: -$$Nest$fget_allFiles, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m634$$Nest$fget_allFiles(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r0 = r0._allFiles
            return r0
    }

    /* renamed from: -$$Nest$fget_nonLibraryMCBeingEditedRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.movieclip.MCMovieclipSource m635$$Nest$fget_nonLibraryMCBeingEditedRef(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r0) {
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0._nonLibraryMCBeingEditedRef
            return r0
    }

    /* renamed from: -$$Nest$fget_okayButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m636$$Nest$fget_okayButton(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0._okayButton
            return r0
    }

    /* renamed from: -$$Nest$fget_projectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m637$$Nest$fget_projectDataRef(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0._projectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m638$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m639$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$mupdateFiles, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m640$$Nest$mupdateFiles(org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog r0, boolean r1) {
            r0.updateFiles(r1)
            return
    }

    static {
            return
    }

    public StickfigureImportsEditorDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r2, org.fortheloss.sticknodes.data.ProjectData r3) {
            r0 = this;
            r0.<init>(r1)
            r0._animationBasedModuleRef = r2
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
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$7 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$7
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

    private void updateFiles(boolean r9) {
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L58
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r8._calculateButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r9.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r8._calculateButton
            r9.setColor(r2, r2, r2, r2)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r9 = r8._allFiles
            int r9 = r9.size()
            int r9 = r9 - r1
        L19:
            if (r9 < 0) goto L29
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r3 = r8._allFiles
            java.lang.Object r3 = r3.get(r9)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r3 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r3
            r3.dispose()
            int r9 = r9 + (-1)
            goto L19
        L29:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r9 = r8._allFiles
            r9.clear()
            org.fortheloss.sticknodes.data.ProjectData r9 = r8._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r9 = r9.libraryStickfigures
            int r9 = r9.size()
            r3 = 0
        L37:
            if (r3 >= r9) goto L58
            org.fortheloss.sticknodes.data.ProjectData r4 = r8._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r4 = r4.libraryStickfigures
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r5 = r8._allFiles
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount
            java.lang.String r7 = r4.getName()
            int r4 = r4.getLibraryID()
            r6.<init>(r7, r4)
            r5.add(r6)
            int r3 = r3 + 1
            goto L37
        L58:
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r9 = r8._list
            com.badlogic.gdx.utils.Array r9 = r9.getItems()
            r9.clear()
            java.lang.String r3 = r8._filterSubstring
            if (r3 == 0) goto Laa
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r3 = r8._allFiles
            int r3 = r3.size()
            r4 = 0
        L6c:
            if (r4 >= r3) goto Lc1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r5 = r8._allFiles
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r5
            java.lang.String r5 = r5.name
            java.lang.String r6 = r8._filterSubstring
            int r6 = r6.length()
            if (r6 != r1) goto L94
            java.lang.String r6 = r8._filterSubstring
            boolean r5 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(r5, r6)
            if (r5 == 0) goto La7
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r5 = r8._allFiles
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r5
            r9.add(r5)
            goto La7
        L94:
            java.lang.String r6 = r8._filterSubstring
            boolean r5 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(r5, r6)
            if (r5 == 0) goto La7
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r5 = r8._allFiles
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r5
            r9.add(r5)
        La7:
            int r4 = r4 + 1
            goto L6c
        Laa:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r3 = r8._allFiles
            int r3 = r3.size()
            r4 = 0
        Lb1:
            if (r4 >= r3) goto Lc1
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r5 = r8._allFiles
            java.lang.Object r5 = r5.get(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r5
            r9.add(r5)
            int r4 = r4 + 1
            goto Lb1
        Lc1:
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r3 = r8._list
            r3.setItems(r9)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r8._hideButtons
            com.badlogic.gdx.utils.SnapshotArray r3 = r3.getChildren()
            int r4 = r3.size
            int r4 = r4 - r1
        Lcf:
            if (r4 < 0) goto Ldd
            java.lang.Object r5 = r3.get(r4)
            com.badlogic.gdx.scenes.scene2d.Actor r5 = (com.badlogic.gdx.scenes.scene2d.Actor) r5
            r5.clear()
            int r4 = r4 + (-1)
            goto Lcf
        Ldd:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r8._hideButtons
            r3.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r8._deleteButtons
            com.badlogic.gdx.utils.SnapshotArray r3 = r3.getChildren()
            int r4 = r3.size
            int r4 = r4 - r1
        Leb:
            if (r4 < 0) goto Lf9
            java.lang.Object r5 = r3.get(r4)
            com.badlogic.gdx.scenes.scene2d.Actor r5 = (com.badlogic.gdx.scenes.scene2d.Actor) r5
            r5.clear()
            int r4 = r4 + (-1)
            goto Leb
        Lf9:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r8._deleteButtons
            r3.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r8._editButtons
            com.badlogic.gdx.utils.SnapshotArray r3 = r3.getChildren()
            int r4 = r3.size
            int r4 = r4 - r1
        L107:
            if (r4 < 0) goto L115
            java.lang.Object r5 = r3.get(r4)
            com.badlogic.gdx.scenes.scene2d.Actor r5 = (com.badlogic.gdx.scenes.scene2d.Actor) r5
            r5.clear()
            int r4 = r4 + (-1)
            goto L107
        L115:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r8._editButtons
            r3.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r8._previewButtons
            com.badlogic.gdx.utils.SnapshotArray r3 = r3.getChildren()
            int r4 = r3.size
            int r4 = r4 - r1
        L123:
            if (r4 < 0) goto L131
            java.lang.Object r5 = r3.get(r4)
            com.badlogic.gdx.scenes.scene2d.Actor r5 = (com.badlogic.gdx.scenes.scene2d.Actor) r5
            r5.clear()
            int r4 = r4 + (-1)
            goto L123
        L131:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r8._previewButtons
            r3.clearChildren()
            int r3 = r9.size
        L138:
            if (r0 >= r3) goto L201
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallShowHideCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4.setUserObject(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$8 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$8
            r5.<init>(r8, r4, r9)
            r4.addListener(r5)
            org.fortheloss.sticknodes.data.ProjectData r5 = r8._projectDataRef
            java.util.ArrayList<java.lang.Integer> r5 = r5.hiddenStickfigureLibraryIDs
            java.lang.Object r6 = r9.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r6 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r6
            int r6 = r6.libraryId
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            r5 = r5 ^ r1
            r4.setChecked(r5)
            java.lang.Object r5 = r9.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r5
            int r5 = r5.libraryId
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r5 != 0) goto L17d
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r5)
            r4.setColor(r2, r2, r2, r6)
        L17d:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r8._hideButtons
            r5.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallDeleteButtonStyle()
            r4.<init>(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4.setUserObject(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$9 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$9
            r5.<init>(r8, r4, r9)
            r4.addListener(r5)
            java.lang.Object r5 = r9.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r5
            int r5 = r5.libraryId
            if (r5 != 0) goto L1ac
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r5)
            r4.setColor(r2, r2, r2, r6)
        L1ac:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r8._deleteButtons
            r5.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallEditButtonStyle()
            r5.<init>(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r5.setUserObject(r7)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$10 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$10
            r7.<init>(r8, r4, r9)
            r5.addListener(r7)
            java.lang.Object r7 = r9.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r7 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r7
            int r7 = r7.libraryId
            if (r7 != 0) goto L1db
            com.badlogic.gdx.scenes.scene2d.Touchable r7 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r7)
            r5.setColor(r2, r2, r2, r6)
        L1db:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r8._editButtons
            r6.addActor(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r5 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r5.<init>(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5.setUserObject(r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$11 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$11
            r6.<init>(r8, r4, r9)
            r5.addListener(r6)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r8._previewButtons
            r4.addActor(r5)
            int r0 = r0 + 1
            goto L138
        L201:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog
    public void actuallyDeleteFigure(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.deleteStickfigureFromProject(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r5) {
            r4 = this;
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r0 = 2
            if (r5 != r0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._calculateButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r5.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r5 = r4._calculateButton
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.setColor(r1, r1, r1, r0)
            r4.calculateUseCountsAndUpdateFiles()
            r4.doNotHideDialog()
            goto L90
        L20:
            r0 = 3
            if (r5 != r0) goto L71
            com.badlogic.gdx.utils.Array r5 = new com.badlogic.gdx.utils.Array
            r5.<init>()
            org.fortheloss.sticknodes.data.ProjectData r0 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r0 = r0.libraryStickfigures
            int r0 = r0.size()
            r1 = 1
            r2 = 1
        L32:
            if (r2 >= r0) goto L48
            org.fortheloss.sticknodes.data.ProjectData r3 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r3 = r3.libraryStickfigures
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r3 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r3
            java.lang.String r3 = r3.getName()
            r5.add(r3)
            int r2 = r2 + 1
            goto L32
        L48:
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r4._animationScreenRef
            r0.<init>(r4, r2)
            java.lang.String[] r1 = new java.lang.String[r1]
            org.fortheloss.sticknodes.data.ProjectData r2 = r4._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r2 = r2.libraryStickfigures
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r2
            java.lang.String r2 = r2.getName()
            r1[r3] = r2
            r0.setExtraPermanentFilenames(r1)
            r0.initialize(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            r5.addDialogToStage(r0)
            r4.doNotHideDialog()
            goto L90
        L71:
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r5 = r4._list
            int r5 = r5.getSelectedIndex()
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.lastSelectedLibraryId = r5
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r4._scrollPane
            float r5 = r5.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.lastScrollY = r5
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r4.getDialogScrollPane()
            float r5 = r5.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.dialogLastScrollY = r5
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r4._animationScreenRef
            r5.updateStickfigureLibraryList()
        L90:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._projectDataRef = r0
            r3._animationBasedModuleRef = r0
            r3._hideButtonsScrollPane = r0
            r3._deleteButtonsScrollPane = r0
            r3._editButtonsScrollPane = r0
            r3._previewButtonsScrollPane = r0
            r3._scrollPane = r0
            r3._filterTextfield = r0
            r3._filterSubstring = r0
            r3._list = r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r1 = r3._allFiles
            if (r1 == 0) goto L31
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L1f:
            if (r1 < 0) goto L2f
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r2 = r3._allFiles
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r2 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L1f
        L2f:
            r3._allFiles = r0
        L31:
            r3._hideButtons = r0
            r3._deleteButtons = r0
            r3._editButtons = r0
            r3._previewButtons = r0
            r3._okayButton = r0
            r3._calculateButton = r0
            r3._cleanupNamesButton = r0
            r3._useCounts = r0
            r3._nonLibraryMCBeingEditedRef = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r11) {
            r10 = this;
            java.lang.String r0 = "deleteHideTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r10._nonLibraryMCBeingEditedRef = r11
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r11 = r11.getSessionData()
            boolean r11 = r11.getNerdModeEnabled()
            r0 = 5
            r1 = 1
            if (r11 != 0) goto L5b
            com.badlogic.gdx.scenes.scene2d.ui.Label r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "belowImportedStickfigures"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "deleteHideInfo"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "\n\n"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r11.<init>(r2, r3)
            r11.setWrap(r1)
            r11.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r10.addContent(r11)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.width(r2)
            r11.colspan(r0)
            r10.addContentRow()
        L5b:
            java.lang.String r11 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10.createTextField(r11)
            r10._filterTextfield = r11
            java.lang.String r2 = "filterList"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r11.setMessageText(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$2 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$2
            r2.<init>(r10)
            r11.setTextFieldListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r11 = r10._filterTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r10.addContent(r11)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.width(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.height(r2)
            r11.colspan(r0)
            r10.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r11 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r11.<init>(r0)
            org.fortheloss.framework.ListCustomItemHeight r0 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r3 = r11.getHeight()
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            float r5 = r11.getWidth()
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r6
            float r4 = r4 - r5
            r5 = 1063675494(0x3f666666, float:0.9)
            float r4 = r4 * r5
            r0.<init>(r2, r3, r4)
            r10._list = r0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r0.<init>()
            r10._hideButtons = r0
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.align(r2)
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.pad(r3)
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r0.<init>()
            r10._deleteButtons = r0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.pad(r3)
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r0.<init>()
            r10._editButtons = r0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.pad(r3)
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r0.<init>()
            r10._previewButtons = r0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.pad(r3)
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r10._list
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r0.<init>(r4, r5)
            r10._scrollPane = r0
            r4 = 0
            r0.setFadeScrollBars(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$3 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$3
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10._hideButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r0.<init>(r10, r5, r6)
            r10._hideButtonsScrollPane = r0
            r0.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10._hideButtonsScrollPane
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10._hideButtonsScrollPane
            r0.setSmoothScrolling(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$4 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$4
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10._deleteButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r0.<init>(r10, r5, r6)
            r10._deleteButtonsScrollPane = r0
            r0.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10._deleteButtonsScrollPane
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10._deleteButtonsScrollPane
            r0.setSmoothScrolling(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$5 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$5
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10._editButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r0.<init>(r10, r5, r6)
            r10._editButtonsScrollPane = r0
            r0.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10._editButtonsScrollPane
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10._editButtonsScrollPane
            r0.setSmoothScrolling(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$6 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog$6
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10._previewButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r0.<init>(r10, r5, r6)
            r10._previewButtonsScrollPane = r0
            r0.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10._previewButtonsScrollPane
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10._previewButtonsScrollPane
            r0.setSmoothScrolling(r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r10._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 == 0) goto L193
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getBiggerListHeight()
            goto L197
        L193:
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
        L197:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10._hideButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r10.addContent(r5)
            float r6 = r11.getWidth()
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r8 = 1101004800(0x41a00000, float:20.0)
            float r7 = r7 * r8
            float r6 = r6 + r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r6)
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r4, r4)
            r6 = 16
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10._deleteButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r10.addContent(r5)
            float r7 = r11.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            float r7 = r7 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r4, r4)
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10._editButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r10.addContent(r5)
            float r7 = r11.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            float r7 = r7 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r4, r4)
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10._previewButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r10.addContent(r5)
            float r7 = r11.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            float r7 = r7 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r4, r4)
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r10.addContent(r5)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            float r11 = r11.getWidth()
            r7 = 1082130432(0x40800000, float:4.0)
            float r11 = r11 * r7
            float r6 = r6 - r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r5.width(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r11 = r11.uniform(r4, r4)
            r0 = 8
            r11.align(r0)
            java.lang.String r11 = "okay"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r11 = r10.createTextButton(r11)
            r10._okayButton = r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r10.addButton(r11, r0)
            java.lang.String r11 = "cleanupNames"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = "..."
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r11 = r10.createTextButton(r11)
            r10._cleanupNamesButton = r11
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.addButton(r11, r0)
            java.lang.String r11 = "calculateUseCounts"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r11 = r10.createTextButton(r11)
            r10._calculateButton = r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r10.addButton(r11, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10._allFiles = r11
            r10.updateFiles(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r11 = r10.getDialog()
            r11.validate()
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r11 = r10._list
            com.badlogic.gdx.utils.Array r11 = r11.getItems()
            int r0 = r11.size
            r2 = -1
            if (r0 <= 0) goto L2d6
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.lastSelectedLibraryId
            if (r4 == r2) goto L2b7
            int r0 = r0 - r1
        L2a5:
            if (r0 < 0) goto L2b7
            java.lang.Object r1 = r11.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r1 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r1
            int r1 = r1.libraryId
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.lastSelectedLibraryId
            if (r1 != r4) goto L2b4
            goto L2b8
        L2b4:
            int r0 = r0 + (-1)
            goto L2a5
        L2b7:
            r0 = -1
        L2b8:
            if (r0 < 0) goto L2d0
            int r11 = r11.size
            if (r0 >= r11) goto L2d0
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r11 = r10._scrollPane
            float r1 = r11.getMaxY()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.lastScrollY
            float r1 = r1 - r2
            r11.scrollTo(r3, r1, r3, r3)
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r11 = r10._list
            r11.setSelectedIndex(r0)
            goto L2df
        L2d0:
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r11 = r10._list
            r11.setSelectedIndex(r2)
            goto L2df
        L2d6:
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.lastSelectedLibraryId = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.lastScrollY = r3
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r11 = r10._list
            r11.setSelectedIndex(r2)
        L2df:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r11 = r10.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.getDialogScrollPane()
            float r0 = r0.getMaxY()
            float r1 = org.fortheloss.sticknodes.animationscreen.dialogs.StickfigureImportsEditorDialog.dialogLastScrollY
            float r0 = r0 - r1
            r11.scrollTo(r3, r0, r3, r3)
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
