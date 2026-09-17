package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class SubmitStickfigureFormDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    protected static float dialogLastScrollY = 0.0f;
    public static boolean hasShownGuidlines = false;
    protected static float lastScrollY = 0.0f;
    protected static java.lang.String lastSelectedString = null;
    protected static int lastSortMethod = 0;
    protected static java.lang.String rememberedAuthor = "";
    private org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule _animateToolsModuleRef;
    private org.fortheloss.framework.Assets _assetsRef;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _authorTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _buttonsScrollPane;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _categorySelectBox;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _clearSelectionButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextArea _descriptionTextArea;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _directionsLabel;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _figureList;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _filterAndSortTable;
    private java.lang.String _filterSubstring;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _filterTextfield;
    private boolean _flagDeselectAllOnFirstClick;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _hashtagTextfield1;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _hashtagTextfield2;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _hashtagTextfield3;
    private boolean _isMovieclipMode;
    private com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup _previewButtons;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _sortSelectBox;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _stickfigureTextField;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _submitButton;
    private java.lang.String _submitPackString;
    private java.lang.String _submitString;












    /* renamed from: -$$Nest$fget_assetsRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.Assets m644$$Nest$fget_assetsRef(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            org.fortheloss.framework.Assets r0 = r0._assetsRef
            return r0
    }

    /* renamed from: -$$Nest$fget_categorySelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m645$$Nest$fget_categorySelectBox(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._categorySelectBox
            return r0
    }

    /* renamed from: -$$Nest$fget_figureList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m646$$Nest$fget_figureList(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._figureList
            return r0
    }

    /* renamed from: -$$Nest$fget_filterTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m647$$Nest$fget_filterTextfield(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._filterTextfield
            return r0
    }

    /* renamed from: -$$Nest$fget_flagDeselectAllOnFirstClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m648$$Nest$fget_flagDeselectAllOnFirstClick(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            boolean r0 = r0._flagDeselectAllOnFirstClick
            return r0
    }

    /* renamed from: -$$Nest$fget_hashtagTextfield1, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m649$$Nest$fget_hashtagTextfield1(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._hashtagTextfield1
            return r0
    }

    /* renamed from: -$$Nest$fget_hashtagTextfield2, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m650$$Nest$fget_hashtagTextfield2(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._hashtagTextfield2
            return r0
    }

    /* renamed from: -$$Nest$fget_hashtagTextfield3, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m651$$Nest$fget_hashtagTextfield3(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._hashtagTextfield3
            return r0
    }

    /* renamed from: -$$Nest$fget_isMovieclipMode, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m652$$Nest$fget_isMovieclipMode(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            boolean r0 = r0._isMovieclipMode
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m653$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_sortSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m654$$Nest$fget_sortSelectBox(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._sortSelectBox
            return r0
    }

    /* renamed from: -$$Nest$fput_flagDeselectAllOnFirstClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m655$$Nest$fput_flagDeselectAllOnFirstClick(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0, boolean r1) {
            r0._flagDeselectAllOnFirstClick = r1
            return
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m656$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$msetNumSelections, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m657$$Nest$msetNumSelections(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0, int r1) {
            r0.setNumSelections(r1)
            return
    }

    /* renamed from: -$$Nest$mupdateSortMethod, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m658$$Nest$mupdateSortMethod(org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog r0, int r1) {
            r0.updateSortMethod(r1)
            return
    }

    static {
            return
    }

    public SubmitStickfigureFormDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r3, boolean r4) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1
            r1._flagDeselectAllOnFirstClick = r2
            r1._isMovieclipMode = r4
            r0 = 0
            if (r4 == 0) goto L1e
            java.lang.String r4 = "nodemc"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r1.setExtensions(r4)
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r4 = org.fortheloss.sticknodes.App.movieclipsPath
            r2[r0] = r4
            r1.setDirectories(r2)
            goto L30
        L1e:
            java.lang.String r4 = "nodes"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r1.setExtensions(r4)
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r4 = org.fortheloss.sticknodes.App.stickfiguresPath
            r2[r0] = r4
            r1.setDirectories(r2)
        L30:
            r1._animateToolsModuleRef = r3
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
            r0 = 1
            r3.updateFiles(r0, r0)
            return
    }

    private void setNumSelections(int r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r0._isMovieclipMode
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 != 0) goto L169
            java.lang.String r2 = "miscellaneous"
            java.lang.String r6 = "backgrounds"
            java.lang.String r8 = "effects"
            java.lang.String r10 = "objects"
            java.lang.String r12 = "weapons"
            java.lang.String r14 = "vehicles"
            java.lang.String r15 = "people"
            r5 = 7
            r7 = 1
            r9 = 0
            if (r1 > 0) goto L97
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            java.lang.String r11 = r0._submitString
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r11 = " (0)"
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r1.setText(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            com.badlogic.gdx.scenes.scene2d.Touchable r11 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            r1.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setTouchable(r11)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setColor(r4, r4, r4, r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            boolean r1 = r1.isDisabled()
            if (r1 == 0) goto L19f
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            r1.setDisabled(r9)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r15)
            r3[r9] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r14)
            r3[r7] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r12)
            r5 = 2
            r3[r5] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r10)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r8)
            r5 = 4
            r3[r5] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r6)
            r5 = 5
            r3[r5] = r4
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r4 = 6
            r3[r4] = r2
            r1.setItems(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            r1.setSelectedIndex(r9)
            goto L19f
        L97:
            if (r1 != r7) goto L111
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            java.lang.String r3 = r0._submitString
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.String r3 = " (1)"
            r11.append(r3)
            java.lang.String r3 = r11.toString()
            r1.setText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setColor(r4, r4, r4, r4)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            boolean r1 = r1.isDisabled()
            if (r1 == 0) goto L19f
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            r1.setDisabled(r9)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r15)
            r3[r9] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r14)
            r3[r7] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r12)
            r5 = 2
            r3[r5] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r10)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r8)
            r5 = 4
            r3[r5] = r4
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r6)
            r5 = 5
            r3[r5] = r4
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            r4 = 6
            r3[r4] = r2
            r1.setItems(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            r1.setSelectedIndex(r9)
            goto L19f
        L111:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r0._submitButton
            java.lang.String r3 = r0._submitPackString
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " ("
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = ")"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setColor(r4, r4, r4, r4)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            boolean r1 = r1.isDisabled()
            if (r1 != 0) goto L19f
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            r1.setDisabled(r7)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            java.lang.String[] r2 = new java.lang.String[r7]
            java.lang.String r3 = "pack"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r2[r9] = r3
            r1.setItems(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r0._categorySelectBox
            r1.setSelectedIndex(r9)
            goto L19f
        L169:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r0._submitButton
            java.lang.String r5 = r0._submitString
            r2.setText(r5)
            if (r1 > 0) goto L189
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            r1.setColor(r4, r4, r4, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setColor(r4, r4, r4, r3)
            goto L19f
        L189:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._submitButton
            r1.setColor(r4, r4, r4, r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r0._clearSelectionButton
            r1.setColor(r4, r4, r4, r4)
        L19f:
            return
    }

    private void updateFiles(boolean r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.updateFiles(r2, r3, r0)
            return
    }

    private void updateFiles(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 1
            if (r3 == 0) goto L33
            if (r4 != 0) goto L33
            boolean r3 = r1._isMovieclipMode
            if (r3 != 0) goto L1b
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = org.fortheloss.sticknodes.App.stickfiguresPath
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r4)
            com.badlogic.gdx.files.FileHandle[] r3 = r3.list()
            java.lang.String r4 = r1._filterSubstring
            r1.addToFiles(r3, r4, r0)
            goto L2c
        L1b:
            com.badlogic.gdx.Files r3 = com.badlogic.gdx.Gdx.files
            java.lang.String r4 = org.fortheloss.sticknodes.App.movieclipsPath
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r4)
            com.badlogic.gdx.files.FileHandle[] r3 = r3.list()
            java.lang.String r4 = r1._filterSubstring
            r1.addToFiles(r3, r4, r0)
        L2c:
            if (r2 == 0) goto L33
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r1._figureList
            r1.addCurrentSelectionToFiles(r2)
        L33:
            r1.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r1._figureList
            r1.setListItems(r2)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r1._previewButtons
            com.badlogic.gdx.utils.SnapshotArray r2 = r2.getChildren()
            int r3 = r2.size
            int r3 = r3 - r0
        L44:
            if (r3 < 0) goto L52
            java.lang.Object r4 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.Actor r4 = (com.badlogic.gdx.scenes.scene2d.Actor) r4
            r4.clear()
            int r3 = r3 + (-1)
            goto L44
        L52:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r2 = r1._previewButtons
            r2.clearChildren()
            r2 = 0
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r3 = r1._files
            int r3 = r3.size
        L5c:
            if (r2 >= r3) goto L88
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r4.<init>(r0)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta> r0 = r1._files
            java.lang.Object r0 = r0.get(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper$FileMeta r0 = (org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper.FileMeta) r0
            java.io.File r0 = r0.file
            java.lang.String r0 = r0.getAbsolutePath()
            r4.setUserObject(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$11 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$11
            r0.<init>(r1, r4)
            r4.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r0 = r1._previewButtons
            r0.addActor(r4)
            int r2 = r2 + 1
            goto L5c
        L88:
            return
    }

    private void updateSortMethod(int r2) {
            r1 = this;
            int r0 = r1._sortMethod
            if (r0 != r2) goto L5
            return
        L5:
            r1._sortMethod = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.lastSortMethod = r2
            r2 = 1
            r0 = 0
            r1.updateFiles(r0, r0, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r14) {
            r13 = this;
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r0 = 2
            r1 = 1
            if (r14 != r1) goto L1d1
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r14 = r13._figureList
            int r14 = r14.getSelectedIndex()
            if (r14 < 0) goto L1a4
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13._authorTextField
            java.lang.String r14 = r14.getText()
            java.lang.String r2 = ""
            boolean r14 = r14.equals(r2)
            if (r14 != 0) goto L1a4
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13._stickfigureTextField
            java.lang.String r14 = r14.getText()
            boolean r14 = r14.equals(r2)
            if (r14 != 0) goto L1a4
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r14 = r13._figureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r14 = r14.getSelection()
            java.util.Iterator r2 = r14.iterator()
            int r14 = r14.size()
            java.lang.String[] r14 = new java.lang.String[r14]
            r3 = 0
            r4 = 0
        L3e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r13._isMovieclipMode
            if (r6 != 0) goto L64
            int r6 = r4 + 1
            java.lang.String r7 = org.fortheloss.sticknodes.App.stickfiguresPath
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r14[r4] = r5
            goto L79
        L64:
            int r6 = r4 + 1
            java.lang.String r7 = org.fortheloss.sticknodes.App.movieclipsPath
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r14[r4] = r5
        L79:
            r4 = r6
            goto L3e
        L7b:
            org.fortheloss.framework.IPlatform r2 = org.fortheloss.sticknodes.App.platform
            java.lang.String r5 = "last_status_event"
            java.lang.String r6 = "about_to_send_submission"
            r2.setCrashlyticsKeyString(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r2 = r13._descriptionTextArea
            java.lang.String r2 = r2.getText()
            java.lang.String r2 = r2.trim()
            java.lang.String r5 = " +"
            java.lang.String r6 = " "
            java.lang.String r2 = r2.replaceAll(r5, r6)
            int r7 = r2.length()
            if (r7 <= 0) goto Lb7
            java.lang.String r3 = r2.substring(r3, r1)
            java.lang.String r3 = r3.toUpperCase()
            java.lang.String r2 = r2.substring(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
        Lb7:
            r9 = r2
            com.badlogic.gdx.scenes.scene2d.ui.TextField r2 = r13._authorTextField
            java.lang.String r2 = r2.getText()
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = r2.replaceAll(r5, r6)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._stickfigureTextField
            java.lang.String r3 = r3.getText()
            java.lang.String r3 = r3.trim()
            java.lang.String r8 = r3.replaceAll(r5, r6)
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.rememberedAuthor = r2
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            java.lang.String r5 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r3 = r3.getPreferences(r5)
            java.lang.String r5 = "submitAuthorName"
            r3.putString(r5, r2)
            r3.flush()
            if (r4 <= r1) goto L158
            r0 = 6
            if (r4 < r0) goto L11b
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r13._animationScreenRef
            r3 = r0
            r4 = r13
            r6 = r14
            r7 = r2
            r10 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r14 = "submitTestTitle"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            java.lang.String r1 = "submitTestMessage"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r2 = "yes"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "no"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.initialize(r14, r1, r2, r3)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r13._animationScreenRef
            r14.addDialogToStage(r0)
            r13.doNotHideDialog()
            return
        L11b:
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitPackRenameDialog
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r13._animationScreenRef
            r0.<init>(r3)
            org.fortheloss.framework.Assets r3 = r13._assetsRef
            java.lang.String r4 = org.fortheloss.sticknodes.App.animationMenuAtlas
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r5 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            java.lang.Object r1 = r3.get(r4, r5, r1)
            r4 = r1
            com.badlogic.gdx.graphics.g2d.TextureAtlas r4 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r4
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r13._categorySelectBox
            java.lang.Object r1 = r1.getSelected()
            java.lang.String r1 = (java.lang.String) r1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._hashtagTextfield1
            java.lang.String r10 = r3.getText()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._hashtagTextfield2
            java.lang.String r11 = r3.getText()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._hashtagTextfield3
            java.lang.String r12 = r3.getText()
            r3 = r0
            r5 = r14
            r6 = r2
            r7 = r8
            r8 = r1
            r3.initialize(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r13._animationScreenRef
            r14.addDialogToStage(r0)
            goto L1dd
        L158:
            org.fortheloss.framework.IPlatform r3 = org.fortheloss.sticknodes.App.platform
            r5 = 0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r13._categorySelectBox
            java.lang.Object r1 = r1.getSelected()
            java.lang.String r1 = (java.lang.String) r1
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield1
            java.lang.String r10 = r4.getText()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield2
            java.lang.String r11 = r4.getText()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield3
            java.lang.String r12 = r4.getText()
            r4 = r14
            r6 = r2
            r7 = r8
            r8 = r1
            int r14 = r3.emailStickfigureSubmission(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = "errorSubmittingTitle"
            if (r14 != r0) goto L191
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r13._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r1 = "errorSubmittingInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r14.showErrorDialog(r0, r1)
            goto L1dd
        L191:
            r0 = 3
            if (r14 != r0) goto L1dd
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r14 = r13._animationScreenRef
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r1 = "errorSubmittingInfo3"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            r14.showErrorDialog(r0, r1)
            goto L1dd
        L1a4:
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13._directionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r14 = r14.getStyle()
            com.badlogic.gdx.graphics.Color r14 = r14.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r0 = r0.fontColor
            r14.set(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13._directionsLabel
            java.lang.String r0 = "submitError3"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            r14.setText(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r14 = r13.getDialogScrollPane()
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r1 * r0
            r14.setScrollY(r1)
            r13.doNotHideDialog()
            return
        L1d1:
            if (r14 != r0) goto L1dd
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r14 = r13._figureList
            r0 = -1
            r14.setSelectedIndex(r0)
            r13.doNotHideDialog()
            return
        L1dd:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r14 = r13.getDialogScrollPane()
            float r14 = r14.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.dialogLastScrollY = r14
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper, org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._animateToolsModuleRef = r0
            r4._assetsRef = r0
            r4._filterTextfield = r0
            r4._filterSubstring = r0
            r4._sortSelectBox = r0
            r4._figureList = r0
            r4._buttonsScrollPane = r0
            r4._scrollPane = r0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r1 = r4._categorySelectBox
            if (r1 == 0) goto L1a
            r1.clear()
            r4._categorySelectBox = r0
        L1a:
            r4._directionsLabel = r0
            r4._stickfigureTextField = r0
            r4._authorTextField = r0
            r4._hashtagTextfield1 = r0
            r4._hashtagTextfield2 = r0
            r4._hashtagTextfield3 = r0
            r4._descriptionTextArea = r0
            r4._submitButton = r0
            r4._submitString = r0
            r4._submitPackString = r0
            r4._clearSelectionButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r4._filterAndSortTable
            if (r1 == 0) goto L52
            com.badlogic.gdx.utils.Array r1 = r1.getCells()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L3c:
            if (r2 < 0) goto L50
            java.lang.Object r3 = r1.get(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r3
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            if (r3 == 0) goto L4d
            r3.clear()
        L4d:
            int r2 = r2 + (-1)
            goto L3c
        L50:
            r4._filterAndSortTable = r0
        L52:
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.framework.Assets r14) {
            r13 = this;
            boolean r0 = r13._isMovieclipMode
            if (r0 == 0) goto L7
            java.lang.String r0 = "mcSubmissionTitle"
            goto L9
        L7:
            java.lang.String r0 = "submitTitle"
        L9:
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r13._assetsRef = r14
            com.badlogic.gdx.scenes.scene2d.ui.Table r14 = r13.getTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.defaults()
            r0 = 0
            r14.uniform(r0, r0)
            boolean r14 = r13._isMovieclipMode
            r1 = 2
            r2 = 1
            if (r14 != 0) goto L51
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "submitInfo3"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5)
            r14.<init>(r3, r4)
            r14.setWrap(r2)
            r14.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.addContent(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r14.width(r3)
            r13.addContentRow()
        L51:
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "submitInstructions"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r5)
            r14.<init>(r3, r4)
            r13._directionsLabel = r14
            r14.setWrap(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13._directionsLabel
            r14.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = r13._directionsLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.addContent(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r14.width(r3)
            r13.addContentRow()
            java.lang.String r14 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13.createTextField(r14)
            r13._filterTextfield = r3
            java.lang.String r4 = "filterList"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r3.setMessageText(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$2 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$2
            r4.<init>(r13)
            r3.setTextFieldListener(r4)
            org.fortheloss.framework.SelectBoxCustomItemHeight r3 = r13.createSelectBox()
            r13._sortSelectBox = r3
            r4 = 3
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r6 = "alphabetical"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r5[r0] = r6
            java.lang.String r6 = "newest"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r5[r2] = r6
            java.lang.String r6 = "oldest"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            r5[r1] = r6
            r3.setItems(r5)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r13._sortSelectBox
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$3 r5 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$3
            r5.<init>(r13)
            r3.addListener(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r13._filterAndSortTable = r3
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r3.align(r2)
            r5 = 0
            r3.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r13._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.pad(r5)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r7 = 1101004800(0x41a00000, float:20.0)
            float r6 = r6 * r7
            r3.space(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r13._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r13._filterTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r8 = 1060320051(0x3f333333, float:0.7)
            float r6 = r6 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r6 = (float) r6
            r3.height(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r13._filterAndSortTable
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r6 = r13._sortSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.add(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            r8 = 1050253722(0x3e99999a, float:0.3)
            float r6 = r6 * r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r6)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r6 = (float) r6
            r3.height(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = r13._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            r3.colspan(r1)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r3 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r3.<init>(r6)
            org.fortheloss.framework.ListCustomItemHeight r6 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r8 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r9 = r3.getHeight()
            int r10 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r10 = (float) r10
            float r11 = r3.getWidth()
            float r10 = r10 - r11
            r11 = 1063675494(0x3f666666, float:0.9)
            float r10 = r10 * r11
            r6.<init>(r8, r9, r10)
            r13._figureList = r6
            boolean r8 = r13._isMovieclipMode
            if (r8 != 0) goto L18d
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            r6.setMultiple(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r13._figureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            r6.setToggle(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r13._figureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            r6.setRangeSelect(r0)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r13._figureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            r6.setRequired(r0)
            goto L1af
        L18d:
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            r6.setMultiple(r0)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r13._figureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            r6.setToggle(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r13._figureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            r6.setRangeSelect(r0)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r13._figureList
            com.badlogic.gdx.scenes.scene2d.utils.ArraySelection r6 = r6.getSelection()
            r6.setRequired(r0)
        L1af:
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = new com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup
            r6.<init>()
            r13._previewButtons = r6
            r8 = 10
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r6.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r6 = r6.pad(r5)
            r6.space(r5)
            r13.updateFiles(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r8 = r13._figureList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r6.<init>(r8, r9)
            r13._scrollPane = r6
            r6.setFadeScrollBars(r0)
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$4 r6 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$4
            com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup r8 = r13._previewButtons
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneNoKnobStyle()
            r6.<init>(r13, r8, r9)
            r13._buttonsScrollPane = r6
            r6.setFadeScrollBars(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r13._buttonsScrollPane
            r6.clearListeners()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r13._buttonsScrollPane
            r6.setSmoothScrolling(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r6.<init>()
            r6.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.defaults()
            r9 = 1092616192(0x41200000, float:10.0)
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.space(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.align(r2)
            r8.uniform(r0, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r13.addContent(r6)
            r8.colspan(r1)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r8 = r13._buttonsScrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r6.add(r8)
            float r9 = r3.getWidth()
            float r10 = org.fortheloss.sticknodes.App.assetScaling
            float r10 = r10 * r7
            float r9 = r9 + r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r8.width(r9)
            int r8 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r8 = (float) r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.height(r8)
            r8 = 16
            r7.align(r8)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r7 = r13._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            float r3 = r3.getWidth()
            float r7 = r7 - r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r6.width(r7)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.height(r6)
            r6 = 8
            r3.align(r6)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r13._figureList
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$5 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$5
            r7.<init>(r13)
            r3.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "whoMadeThis"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r7, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            r3.align(r8)
            java.lang.String r3 = org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.rememberedAuthor
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13.createTextField(r3)
            r13._authorTextField = r3
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$6 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$6
            r7.<init>(r13)
            r3.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._authorTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            r9 = 1059648963(0x3f28f5c3, float:0.66)
            float r7 = r7 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.height(r7)
            r3.align(r6)
            r13.addContentRow()
            com.badlogic.gdx.Application r3 = com.badlogic.gdx.Gdx.app
            java.lang.String r7 = org.fortheloss.sticknodes.App.preferencesString
            com.badlogic.gdx.Preferences r3 = r3.getPreferences(r7)
            java.lang.String r7 = "submitAuthorName"
            r10 = 0
            java.lang.String r3 = r3.getString(r7, r10)
            if (r3 == 0) goto L2c7
            com.badlogic.gdx.scenes.scene2d.ui.TextField r7 = r13._authorTextField
            r7.setText(r3)
        L2c7:
            boolean r3 = r13._isMovieclipMode
            if (r3 != 0) goto L2e2
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "stickfigureName"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r7, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            r3.align(r8)
            goto L2f8
        L2e2:
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "movieclipName"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r7, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            r3.align(r8)
        L2f8:
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13.createTextField(r14)
            r13._stickfigureTextField = r3
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r7 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r7.<init>()
            r3.setTextFieldFilter(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._stickfigureTextField
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$7 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$7
            r7.<init>(r13)
            r3.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._stickfigureTextField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            float r7 = r7 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.height(r7)
            r3.align(r6)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r7 = "category"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r7, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            r3.align(r8)
            org.fortheloss.framework.SelectBoxCustomItemHeight r3 = r13.createSelectBox()
            r13._categorySelectBox = r3
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r3 = r3.getScrollPane()
            r3.setVariableSizeKnobs(r0)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r13._categorySelectBox
            r7 = 7
            r3.setMaxListCount(r7)
            boolean r3 = r13._isMovieclipMode
            r8 = 4
            if (r3 != 0) goto L3a0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r13._categorySelectBox
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.String r11 = "people"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r7[r0] = r11
            java.lang.String r11 = "vehicles"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r7[r2] = r11
            java.lang.String r11 = "weapons"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r7[r1] = r11
            java.lang.String r11 = "objects"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r7[r4] = r11
            java.lang.String r4 = "effects"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r7[r8] = r4
            r4 = 5
            java.lang.String r11 = "backgrounds"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r7[r4] = r11
            r4 = 6
            java.lang.String r11 = "miscellaneous"
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r11)
            r7[r4] = r11
            r3.setItems(r7)
            goto L3b9
        L3a0:
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r13._categorySelectBox
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.String r7 = "movieclip"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            r4[r0] = r7
            r3.setItems(r4)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r13._categorySelectBox
            r3.setDisabled(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r13._categorySelectBox
            r3.setSelectedIndex(r0)
        L3b9:
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r13._categorySelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            float r4 = r4 * r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.height(r4)
            r3.align(r6)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "description"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.String r6 = "optional"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            java.lang.String r4 = " ("
            r9.append(r4)
            r9.append(r7)
            java.lang.String r7 = ")"
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r9, r11)
            r3.setWrap(r2)
            r3.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r1)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            r3.width(r9)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r3 = new com.badlogic.gdx.scenes.scene2d.ui.TextArea
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTextAreaStyle()
            r3.<init>(r14, r9)
            r13._descriptionTextArea = r3
            java.lang.String r9 = "submitDescriptionInfo"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            r3.setMessageText(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r3 = r13._descriptionTextArea
            r3.setFocusTraversal(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r3 = r13._descriptionTextArea
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            r3.setBlinkTime(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r3 = r13._descriptionTextArea
            org.fortheloss.framework.CustomStopListener r9 = new org.fortheloss.framework.CustomStopListener
            r9.<init>()
            r3.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextArea r3 = r13._descriptionTextArea
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r1)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r9 = (float) r9
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.width(r9)
            int r9 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            int r9 = r9 * 2
            float r9 = (float) r9
            r3.height(r9)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r9 = "hashtags"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            java.lang.String r11 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r12.append(r4)
            r12.append(r11)
            r12.append(r7)
            java.lang.String r4 = r12.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r3.<init>(r4, r7)
            r3.setWrap(r2)
            r3.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r13.addContent(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r1)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r3.width(r4)
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Table r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r3.<init>()
            r3.pad(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.uniformX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r13.addContent(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.fillX()
            r13.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13.createTextField(r14)
            r13._hashtagTextfield1 = r4
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "#"
            r9.append(r11)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r4.setMessageText(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield1
            org.fortheloss.sticknodes.animationscreen.modules.Module$HashtagFilter r7 = new org.fortheloss.sticknodes.animationscreen.modules.Module$HashtagFilter
            r7.<init>()
            r4.setTextFieldFilter(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield1
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$8 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$8
            r7.<init>(r13)
            r4.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r2)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r7 = r7 / r8
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r7 = r13._stickfigureTextField
            float r7 = r7.getHeight()
            r9 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r9
            r4.height(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13.createTextField(r14)
            r13._hashtagTextfield2 = r4
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            r4.setMessageText(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield2
            org.fortheloss.sticknodes.animationscreen.modules.Module$HashtagFilter r7 = new org.fortheloss.sticknodes.animationscreen.modules.Module$HashtagFilter
            r7.<init>()
            r4.setTextFieldFilter(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield2
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$9 r7 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$9
            r7.<init>(r13)
            r4.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r13._hashtagTextfield2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r2)
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r7 = r7 / r8
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r7 = r13._stickfigureTextField
            float r7 = r7.getHeight()
            float r7 = r7 * r9
            r4.height(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13.createTextField(r14)
            r13._hashtagTextfield3 = r14
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r14.setMessageText(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13._hashtagTextfield3
            org.fortheloss.sticknodes.animationscreen.modules.Module$HashtagFilter r4 = new org.fortheloss.sticknodes.animationscreen.modules.Module$HashtagFilter
            r4.<init>()
            r14.setTextFieldFilter(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13._hashtagTextfield3
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$10 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog$10
            r4.<init>(r13)
            r14.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r14 = r13._hashtagTextfield3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r3.add(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.align(r2)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            int r3 = r3 / r8
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r13._stickfigureTextField
            float r3 = r3.getHeight()
            float r3 = r3 * r9
            r14.height(r3)
            boolean r14 = r13._isMovieclipMode
            if (r14 == 0) goto L607
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "movieclipSubmissionThumbnail"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r6)
            r14.<init>(r3, r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = r14.getStyle()
            com.badlogic.gdx.graphics.Color r3 = r3.fontColor
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            com.badlogic.gdx.graphics.Color r4 = r4.fontColor
            r3.set(r4)
            r14.setWrap(r2)
            r14.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.addContent(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r14.width(r3)
            r13.addContentRow()
            goto L634
        L607:
            com.badlogic.gdx.scenes.scene2d.ui.Label r14 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "submitInstructions2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r4.<init>(r6)
            r14.<init>(r3, r4)
            r14.setWrap(r2)
            r14.setAlignment(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.addContent(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r1)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r14.width(r3)
            r13.addContentRow()
        L634:
            com.badlogic.gdx.scenes.scene2d.ui.Widget r14 = new com.badlogic.gdx.scenes.scene2d.ui.Widget
            r14.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.addContent(r14)
            r3 = 1137180672(0x43c80000, float:400.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.height(r4)
            r14.colspan(r1)
            java.lang.String r14 = "submit"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            r13._submitString = r14
            java.lang.String r14 = "submitPack"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            r13._submitPackString = r14
            java.lang.String r14 = r13._submitString
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r13.createTextButton(r14)
            r13._submitButton = r14
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r13.addButton(r14, r3)
            java.lang.String r14 = "clearSelection"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r13.createTextButton(r14)
            r13._clearSelectionButton = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.addButton(r14, r1)
            java.lang.String r14 = "cancel"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r14 = r13.createTextButton(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r13.addButton(r14, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r14 = r13.getDialog()
            r14.validate()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r14 = r13._figureList
            com.badlogic.gdx.utils.Array r14 = r14.getItems()
            int r1 = r14.size
            r3 = -1
            if (r1 <= 0) goto L6df
            java.lang.String r4 = org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.lastSelectedString
            if (r4 == 0) goto L6b8
            int r1 = r1 - r2
        L6a4:
            if (r1 < 0) goto L6b8
            java.lang.Object r4 = r14.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.lastSelectedString
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L6b5
            goto L6b9
        L6b5:
            int r1 = r1 + (-1)
            goto L6a4
        L6b8:
            r1 = -1
        L6b9:
            if (r1 < 0) goto L6d6
            int r14 = r14.size
            if (r1 >= r14) goto L6d6
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r14 = r13._scrollPane
            float r0 = r14.getMaxY()
            float r3 = org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.lastScrollY
            float r0 = r0 - r3
            r14.scrollTo(r5, r0, r5, r5)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r14 = r13._figureList
            r14.setSelectedIndex(r1)
            r13.setNumSelections(r2)
            r13._flagDeselectAllOnFirstClick = r2
            goto L6eb
        L6d6:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r14 = r13._figureList
            r14.setSelectedIndex(r3)
            r13.setNumSelections(r0)
            goto L6eb
        L6df:
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.lastSelectedString = r10
            org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.lastScrollY = r5
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r14 = r13._figureList
            r14.setSelectedIndex(r3)
            r13.setNumSelections(r0)
        L6eb:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r14 = r13.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r13.getDialogScrollPane()
            float r0 = r0.getMaxY()
            float r1 = org.fortheloss.sticknodes.animationscreen.dialogs.SubmitStickfigureFormDialog.dialogLastScrollY
            float r0 = r0 - r1
            r14.scrollTo(r5, r0, r5, r5)
            return
    }
}
