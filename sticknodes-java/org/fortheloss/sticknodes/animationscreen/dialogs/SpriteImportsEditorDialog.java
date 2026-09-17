package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SpriteImportsEditorDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper implements org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog {
    private static float dialogLastScrollY = 0.0f;
    private static float lastScrollY = 0.0f;
    private static int lastSelectedLibraryId = -1;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount> _allFiles;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _cleanupNamesButton;
    private java.lang.String _filterSubstring;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _filterTextfield;
    private org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount> _list;
    private org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule mAnimationBasedModuleRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mCalculateButton;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup mDeleteButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane mDeleteButtonsScrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup mEditButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane mEditButtonsScrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup mHideButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane mHideButtonsScrollPane;
    private org.fortheloss.sticknodes.movieclip.MCMovieclipSource mNonLibraryMCBeingEditedRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton mOkayButton;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup mPreviewButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane mPreviewButtonsScrollPane;
    private org.fortheloss.sticknodes.data.ProjectData mProjectDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane mScrollPane;
    private int[] mUseCounts;












    /* renamed from: -$$Nest$fget_allFiles, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.ArrayList m622$$Nest$fget_allFiles(org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r0) {
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r0 = r0._allFiles
            return r0
    }

    /* renamed from: -$$Nest$fgetmNonLibraryMCBeingEditedRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.movieclip.MCMovieclipSource m623$$Nest$fgetmNonLibraryMCBeingEditedRef(org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r0) {
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r0 = r0.mNonLibraryMCBeingEditedRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmOkayButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m624$$Nest$fgetmOkayButton(org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0.mOkayButton
            return r0
    }

    /* renamed from: -$$Nest$fgetmProjectDataRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.data.ProjectData m625$$Nest$fgetmProjectDataRef(org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r0) {
            org.fortheloss.sticknodes.data.ProjectData r0 = r0.mProjectDataRef
            return r0
    }

    /* renamed from: -$$Nest$fgetmScrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m626$$Nest$fgetmScrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0.mScrollPane
            return r0
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m627$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$mupdateFiles, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m628$$Nest$mupdateFiles(org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog r0, boolean r1) {
            r0.updateFiles(r1)
            return
    }

    static {
            return
    }

    public SpriteImportsEditorDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r2, org.fortheloss.sticknodes.data.ProjectData r3) {
            r0 = this;
            r0.<init>(r1)
            r0.mAnimationBasedModuleRef = r2
            r0.mProjectDataRef = r3
            return
    }

    private void calculateUseCountsAndUpdateFiles() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3.mOkayButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3.mOkayButton
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.Application r0 = com.badlogic.gdx.Gdx.app
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$7 r1 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$7
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
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.mCalculateButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r8.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.mCalculateButton
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
            org.fortheloss.sticknodes.data.ProjectData r8 = r7.mProjectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r8 = r8.librarySprites
            int r8 = r8.size()
            r2 = 0
        L37:
            if (r2 >= r8) goto L58
            org.fortheloss.sticknodes.data.ProjectData r3 = r7.mProjectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r3 = r3.librarySprites
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r3 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r3
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r7._allFiles
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount
            java.lang.String r6 = r3.getName()
            int r3 = r3.getLibraryId()
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
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7.mHideButtons
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
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7.mHideButtons
            r2.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7.mDeleteButtons
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
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7.mDeleteButtons
            r2.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7.mEditButtons
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
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7.mEditButtons
            r2.clearChildren()
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7.mPreviewButtons
            com.badlogic.gdx.utils.SnapshotArray r2 = r2.getChildren()
            int r3 = r2.size
            int r3 = r3 - r1
        L123:
            if (r3 < 0) goto L131
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = (com.badlogic.gdx.scenes.scene2d.Actor) r4
            r4.clear()
            int r3 = r3 + (-1)
            goto L123
        L131:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r7.mPreviewButtons
            r2.clearChildren()
            int r2 = r8.size
        L138:
            if (r0 >= r2) goto L1c9
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallShowHideCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3.setUserObject(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$8 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$8
            r4.<init>(r7, r3, r8)
            r3.addListener(r4)
            org.fortheloss.sticknodes.data.ProjectData r4 = r7.mProjectDataRef
            java.util.ArrayList<java.lang.Integer> r4 = r4.hiddenSpriteLibraryIDs
            java.lang.Object r5 = r8.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r5 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r5
            int r5 = r5.libraryId
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = r4.contains(r5)
            r4 = r4 ^ r1
            r3.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r7.mHideButtons
            r4.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r3 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallDeleteButtonStyle()
            r3.<init>(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3.setUserObject(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$9 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$9
            r4.<init>(r7, r3, r8)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r4 = r7.mDeleteButtons
            r4.addActor(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallEditButtonStyle()
            r4.<init>(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4.setUserObject(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$10 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$10
            r5.<init>(r7, r3, r8)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r7.mEditButtons
            r5.addActor(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r4.<init>(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r4.setUserObject(r5)
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$11 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$11
            r5.<init>(r7, r3, r8)
            r4.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r3 = r7.mPreviewButtons
            r3.addActor(r4)
            int r0 = r0 + 1
            goto L138
        L1c9:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.IImportsEditorDialog
    public void actuallyDeleteFigure(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.deleteSpriteFromProject(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r4) {
            r3 = this;
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 2
            if (r4 != r0) goto L20
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.mCalculateButton
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r4.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3.mCalculateButton
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
            org.fortheloss.sticknodes.data.ProjectData r1 = r3.mProjectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r1 = r1.librarySprites
            int r1 = r1.size()
        L31:
            if (r0 >= r1) goto L47
            org.fortheloss.sticknodes.data.ProjectData r2 = r3.mProjectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r2 = r2.librarySprites
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.sprite.ISpriteSource r2 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r2
            java.lang.String r2 = r2.getName()
            r4.add(r2)
            int r0 = r0 + 1
            goto L31
        L47:
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$1
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
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.lastSelectedLibraryId = r4
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r3.mScrollPane
            float r4 = r4.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.lastScrollY = r4
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r3.getDialogScrollPane()
            float r4 = r4.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.dialogLastScrollY = r4
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r4 = r3._animationScreenRef
            r4.updateSpriteLibraryList()
        L79:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3.mProjectDataRef = r0
            r3.mAnimationBasedModuleRef = r0
            r3.mHideButtonsScrollPane = r0
            r3.mDeleteButtonsScrollPane = r0
            r3.mEditButtonsScrollPane = r0
            r3.mPreviewButtonsScrollPane = r0
            r3.mScrollPane = r0
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
            r3.mHideButtons = r0
            r3.mDeleteButtons = r0
            r3.mEditButtons = r0
            r3.mPreviewButtons = r0
            r3.mOkayButton = r0
            r3.mCalculateButton = r0
            r3._cleanupNamesButton = r0
            r3.mUseCounts = r0
            r3.mNonLibraryMCBeingEditedRef = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCMovieclipSource r11) {
            r10 = this;
            java.lang.String r0 = "deleteHideTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r10.mNonLibraryMCBeingEditedRef = r11
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r11 = r10._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r11 = r11.getSessionData()
            boolean r11 = r11.getNerdModeEnabled()
            r0 = 5
            r1 = 1
            if (r11 != 0) goto L5b
            com.badlogic.gdx.scenes.scene2d.ui.Label r11 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r2 = "belowImportedSprites"
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
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$2 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$2
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
            r10.mHideButtons = r0
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.align(r2)
            r3 = 0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.pad(r3)
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r0.<init>()
            r10.mDeleteButtons = r0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.pad(r3)
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r0.<init>()
            r10.mEditButtons = r0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.pad(r3)
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r0.<init>()
            r10.mPreviewButtons = r0
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r0.pad(r3)
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r4 = r10._list
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r0.<init>(r4, r5)
            r10.mScrollPane = r0
            r4 = 0
            r0.setFadeScrollBars(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$3 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$3
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10.mHideButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r0.<init>(r10, r5, r6)
            r10.mHideButtonsScrollPane = r0
            r0.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.mHideButtonsScrollPane
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.mHideButtonsScrollPane
            r0.setSmoothScrolling(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$4 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$4
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10.mDeleteButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r0.<init>(r10, r5, r6)
            r10.mDeleteButtonsScrollPane = r0
            r0.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.mDeleteButtonsScrollPane
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.mDeleteButtonsScrollPane
            r0.setSmoothScrolling(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$5 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$5
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10.mEditButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r0.<init>(r10, r5, r6)
            r10.mEditButtonsScrollPane = r0
            r0.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.mEditButtonsScrollPane
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.mEditButtonsScrollPane
            r0.setSmoothScrolling(r4)
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$6 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog$6
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r5 = r10.mPreviewButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r0.<init>(r10, r5, r6)
            r10.mPreviewButtonsScrollPane = r0
            r0.setFadeScrollBars(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.mPreviewButtonsScrollPane
            r0.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.mPreviewButtonsScrollPane
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
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10.mHideButtonsScrollPane
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
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10.mDeleteButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r10.addContent(r5)
            float r7 = r11.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            float r7 = r7 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r4, r4)
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10.mEditButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r10.addContent(r5)
            float r7 = r11.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            float r7 = r7 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r4, r4)
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10.mPreviewButtonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r10.addContent(r5)
            float r7 = r11.getWidth()
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r8
            float r7 = r7 + r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.height(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r5.uniform(r4, r4)
            r5.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r5 = r10.mScrollPane
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
            r10.mOkayButton = r11
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
            r10.mCalculateButton = r11
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
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.lastSelectedLibraryId
            if (r4 == r2) goto L2b7
            int r0 = r0 - r1
        L2a5:
            if (r0 < 0) goto L2b7
            java.lang.Object r1 = r11.get(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount r1 = (org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog.FileNameIdUseCount) r1
            int r1 = r1.libraryId
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.lastSelectedLibraryId
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
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r11 = r10.mScrollPane
            float r1 = r11.getMaxY()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.lastScrollY
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
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.lastSelectedLibraryId = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.lastScrollY = r3
            org.fortheloss.framework.ListCustomItemHeight<org.fortheloss.sticknodes.animationscreen.dialogs.MovieclipImportsEditorDialog$FileNameIdUseCount> r11 = r10._list
            r11.setSelectedIndex(r2)
        L2df:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r11 = r10.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r10.getDialogScrollPane()
            float r0 = r0.getMaxY()
            float r1 = org.fortheloss.sticknodes.animationscreen.dialogs.SpriteImportsEditorDialog.dialogLastScrollY
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
