package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class OpenDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper {
    protected static float dialogLastScrollY;
    protected static float lastScrollY;
    protected static java.lang.String lastSelectedString;
    protected static int lastSortMethod;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _filterAndSortTable;
    private java.lang.String _filterSubstring;
    private com.badlogic.gdx.scenes.scene2d.ui.TextField _filterTextfield;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _openFromBeginningButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _openFromEndButton;
    private float _openPercentage;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _percentageLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Slider _percentageSlider;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _projectList;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> _sortSelectBox;





    /* renamed from: -$$Nest$fget_filterTextfield, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextField m596$$Nest$fget_filterTextfield(org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r0._filterTextfield
            return r0
    }

    /* renamed from: -$$Nest$fget_percentageSlider, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Slider m597$$Nest$fget_percentageSlider(org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r0._percentageSlider
            return r0
    }

    /* renamed from: -$$Nest$fget_projectList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m598$$Nest$fget_projectList(org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._projectList
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m599$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fget_sortSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeight m600$$Nest$fget_sortSelectBox(org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r0._sortSelectBox
            return r0
    }

    /* renamed from: -$$Nest$monFilterTyped, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m601$$Nest$monFilterTyped(org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0) {
            r0.onFilterTyped()
            return
    }

    /* renamed from: -$$Nest$msetOpenPercentage, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m602$$Nest$msetOpenPercentage(org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0, float r1) {
            r0.setOpenPercentage(r1)
            return
    }

    /* renamed from: -$$Nest$mupdateSortMethod, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m603$$Nest$mupdateSortMethod(org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog r0, int r1) {
            r0.updateSortMethod(r1)
            return
    }

    static {
            return
    }

    public OpenDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0._openPercentage = r1
            java.lang.String r1 = "stknds"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0.setExtensions(r1)
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

    private void setOpenPercentage(float r4) {
            r3 = this;
            r3._openPercentage = r4
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lc
            r3._openPercentage = r0
            goto L14
        Lc:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L14
            r3._openPercentage = r0
        L14:
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r3._percentageLabel
            java.lang.String r0 = "openHavingProblemsPercent"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            float r1 = r3._openPercentage
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "%"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.setText(r0)
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
            java.lang.String r0 = org.fortheloss.sticknodes.App.projectsPath
            com.badlogic.gdx.files.FileHandle r3 = r3.absolute(r0)
            com.badlogic.gdx.files.FileHandle[] r3 = r3.list()
            java.lang.String r0 = r2._filterSubstring
            r1 = 1
            r2.addToFiles(r3, r0, r1)
        L14:
            r2.sortFileList()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r3 = r2._projectList
            r2.setListItems(r3)
            return
    }

    private void updateSortMethod(int r2) {
            r1 = this;
            int r0 = r1._sortMethod
            if (r0 != r2) goto L5
            return
        L5:
            r1._sortMethod = r2
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.lastSortMethod = r2
            r2 = 1
            r1.updateFiles(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r6) {
            r5 = this;
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r0 = r6.intValue()
            r1 = 1
            if (r0 != r1) goto L3e
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r5._projectList
            int r6 = r6.getSelectedIndex()
            if (r6 < 0) goto L74
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r5._projectList
            java.lang.Object r6 = r6.getSelected()
            java.lang.String r6 = (java.lang.String) r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r5._openFromBeginningButton
            boolean r0 = r0.isChecked()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r5._animationScreenRef
            com.badlogic.gdx.Files r2 = com.badlogic.gdx.Gdx.files
            java.lang.String r3 = org.fortheloss.sticknodes.App.projectsPath
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            com.badlogic.gdx.files.FileHandle r6 = r2.absolute(r6)
            float r2 = r5._openPercentage
            r1.openProject(r6, r2, r0)
            goto L74
        L3e:
            int r6 = r6.intValue()
            r0 = 2
            if (r6 != r0) goto L74
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r5._projectList
            int r6 = r6.getSelectedIndex()
            if (r6 < 0) goto L74
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r6 = r5._projectList
            java.lang.Object r6 = r6.getSelected()
            java.lang.String r6 = (java.lang.String) r6
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            com.badlogic.gdx.Files r1 = com.badlogic.gdx.Gdx.files
            java.lang.String r2 = org.fortheloss.sticknodes.App.projectsPath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.badlogic.gdx.files.FileHandle r6 = r1.absolute(r6)
            r0.deleteProjectFile(r6, r5)
            r5.doNotHideDialog()
        L74:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r6 = r5.getDialogScrollPane()
            float r6 = r6.getScrollY()
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.dialogLastScrollY = r6
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.SortableDialogWrapper, org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 0
            r4._filterTextfield = r0
            r4._filterSubstring = r0
            r4._sortSelectBox = r0
            r4._projectList = r0
            r4._scrollPane = r0
            r4._percentageSlider = r0
            r4._percentageLabel = r0
            r4._openFromBeginningButton = r0
            r4._openFromEndButton = r0
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

    public void initialize() {
            r12 = this;
            java.lang.String r0 = "openProjectTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "openProjectInfo1"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r2)
            r2 = 2
            r0.colspan(r2)
            r12.addContentRow()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r12._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 != 0) goto L67
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "openProjectInfo2"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r3, r4)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.colspan(r2)
            r12.addContentRow()
        L67:
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r3 = "openHavingProblems"
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
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            r0.colspan(r2)
            r12.addContentRow()
            java.lang.String r0 = ""
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r12.createTextField(r0)
            r12._filterTextfield = r0
            java.lang.String r3 = "filterList"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            r0.setMessageText(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r12._filterTextfield
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog$1 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog$1
            r3.<init>(r12)
            r0.setTextFieldListener(r3)
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = r12.createSelectBox()
            r12._sortSelectBox = r0
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = "alphabetical"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "newest"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r3[r1] = r4
            java.lang.String r4 = "oldest"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            r3[r2] = r4
            r0.setItems(r3)
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.lastSortMethod
            r12._sortMethod = r0
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r3 = r12._sortSelectBox
            r3.setSelectedIndex(r0)
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r0 = r12._sortSelectBox
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog$2 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog$2
            r3.<init>(r12)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            r12._filterAndSortTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.align(r1)
            r3 = 0
            r0.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r12._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.pad(r3)
            r4 = 1101004800(0x41a00000, float:20.0)
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            float r6 = r6 * r4
            r0.space(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r12._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.TextField r4 = r12._filterTextfield
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r6 = 1060320051(0x3f333333, float:0.7)
            float r4 = r4 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r4 = (float) r4
            r0.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r12._filterAndSortTable
            org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> r4 = r12._sortSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r6 = 1050253722(0x3e99999a, float:0.3)
            float r4 = r4 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getInputHeight()
            float r4 = (float) r4
            r0.height(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r12._filterAndSortTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            r0.colspan(r2)
            r12.addContentRow()
            r0 = 1120665600(0x42cc0000, float:102.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r0
            org.fortheloss.framework.ListCustomItemHeight r0 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            int r7 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r7 = (float) r7
            r0.<init>(r6, r4, r7)
            r12._projectList = r0
            r12.updateFiles()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._projectList
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog$3 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog$3
            r4.<init>(r12)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r4 = r12._projectList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r0.<init>(r4, r6)
            r12._scrollPane = r0
            r0.setFadeScrollBars(r5)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r12._animationScreenRef
            org.fortheloss.sticknodes.data.SessionData r0 = r0.getSessionData()
            boolean r0 = r0.getNerdModeEnabled()
            if (r0 == 0) goto L1ac
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getBiggerListHeight()
            goto L1b0
        L1ac:
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
        L1b0:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r4 = r12._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r12.addContent(r4)
            int r6 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r6 = (float) r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.width(r6)
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.height(r0)
            r0.colspan(r2)
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "openHavingProblemsTitle"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r0.<init>(r4, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            r0.colspan(r2)
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "openHavingProblemsInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r4, r6)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            r0.colspan(r2)
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "openHavingProblemsPercent"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = ": 100%"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r4, r6)
            r12._percentageLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            r0.colspan(r2)
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = new com.badlogic.gdx.scenes.scene2d.ui.Slider
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 1017370378(0x3ca3d70a, float:0.02)
            r10 = 0
            com.badlogic.gdx.scenes.scene2d.ui.Slider$SliderStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsSliderStyle()
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r12._percentageSlider = r0
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.setValue(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r12._percentageSlider
            org.fortheloss.framework.CustomStopListener r4 = new org.fortheloss.framework.CustomStopListener
            r4.<init>()
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r12._percentageSlider
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog$4 r4 = new org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog$4
            r4.<init>(r12)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Slider r0 = r12._percentageSlider
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r6 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r4)
            r0.colspan(r2)
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "openPercentageFrom"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r4, r6)
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r12.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            r0.fillX()
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "theFirstFrame"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r4, r6)
            r12.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r4 = "theLastFrame"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r6 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r4, r6)
            r12.addContent(r0)
            r12.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r12._openFromBeginningButton = r0
            r12.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.createCheckbox(r0)
            r12._openFromEndButton = r0
            r12.addContent(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r0 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Button[] r4 = new com.badlogic.gdx.scenes.scene2d.ui.Button[r2]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r12._openFromBeginningButton
            r4[r5] = r6
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r6 = r12._openFromEndButton
            r4[r1] = r6
            r0.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r12._openFromBeginningButton
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r12._openFromEndButton
            r0.setChecked(r5)
            java.lang.String r0 = "open"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r12.createTextButton(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r12.addButton(r0, r4)
            java.lang.String r0 = "deleteDevice"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r12.createTextButton(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.addButton(r0, r2)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r12.createTextButton(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r12.addButton(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r12.getDialog()
            r0.validate()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._projectList
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r2 = r0.size
            if (r2 <= 0) goto L37c
            java.lang.String r4 = org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.lastSelectedString
            if (r4 == 0) goto L363
            int r2 = r2 - r1
        L34f:
            if (r2 < 0) goto L363
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.lastSelectedString
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L360
            goto L364
        L360:
            int r2 = r2 + (-1)
            goto L34f
        L363:
            r2 = -1
        L364:
            if (r2 < 0) goto L381
            int r0 = r0.size
            if (r2 >= r0) goto L381
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r12._scrollPane
            float r1 = r0.getMaxY()
            float r4 = org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.lastScrollY
            float r1 = r1 - r4
            r0.scrollTo(r3, r1, r3, r3)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r12._projectList
            r0.setSelectedIndex(r2)
            goto L381
        L37c:
            r0 = 0
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.lastSelectedString = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.lastScrollY = r3
        L381:
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r12.getDialogScrollPane()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r12.getDialogScrollPane()
            float r1 = r1.getMaxY()
            float r2 = org.fortheloss.sticknodes.animationscreen.dialogs.OpenDialog.dialogLastScrollY
            float r1 = r1 - r2
            r0.scrollTo(r3, r1, r3, r3)
            return
    }

    public void onFilesModified() {
            r0 = this;
            r0.updateFiles()
            return
    }
}
