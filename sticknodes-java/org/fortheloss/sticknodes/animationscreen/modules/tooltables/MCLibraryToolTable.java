package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class MCLibraryToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _addMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _createNewMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _downloadMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _editImportsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _editMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _importMCButton;
    private com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> _libraryNameStrings;
    private org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> _mcSelectBox;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu _pasteContextMenu;
    private org.fortheloss.sticknodes.TextButtonLongPress _pasteMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _submitMCButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;









    /* renamed from: -$$Nest$fget_mcSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter m999$$Nest$fget_mcSelectBox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r0._mcSelectBox
            return r0
    }

    /* renamed from: -$$Nest$fget_pasteContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu m1000$$Nest$fget_pasteContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r0._pasteContextMenu
            return r0
    }

    /* renamed from: -$$Nest$monAddMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1001$$Nest$monAddMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0, int r1) {
            r0.onAddMCClick(r1)
            return
    }

    /* renamed from: -$$Nest$monCreateNewMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1002$$Nest$monCreateNewMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0) {
            r0.onCreateNewMCClick()
            return
    }

    /* renamed from: -$$Nest$monEditImportsButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1003$$Nest$monEditImportsButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0) {
            r0.onEditImportsButtonClick()
            return
    }

    /* renamed from: -$$Nest$monEditMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1004$$Nest$monEditMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0, int r1) {
            r0.onEditMCClick(r1)
            return
    }

    /* renamed from: -$$Nest$monImportMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1005$$Nest$monImportMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0) {
            r0.onImportMCClick()
            return
    }

    /* renamed from: -$$Nest$monPasteMCClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1006$$Nest$monPasteMCClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable r0) {
            r0.onPasteMCClick()
            return
    }

    public MCLibraryToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onAddMCClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.addMovieclip(r2)
            return
    }

    private void onCreateNewMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.createNewMC()
            return
    }

    private void onEditImportsButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.editMovieclipImportsList()
            return
    }

    private void onEditMCClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.editMC(r2)
            return
    }

    private void onImportMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.importMovieclip()
            return
    }

    private void onPasteMCClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pasteMC()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2._pasteMCButton = r0
            r2._importMCButton = r0
            r2._editImportsButton = r0
            r2._mcSelectBox = r0
            r2._addMCButton = r0
            r2._editMCButton = r0
            r2._createNewMCButton = r0
            r2._downloadMCButton = r0
            r2._submitMCButton = r0
            r2._libraryNameStrings = r0
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r1 = r2._pasteContextMenu
            if (r1 == 0) goto L20
            r1.dispose()
            r2._pasteContextMenu = r0
        L20:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r6, com.badlogic.gdx.scenes.scene2d.utils.Drawable r7) {
            r5 = this;
            super.initialize(r7)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r6 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu
            org.fortheloss.sticknodes.data.SessionData r7 = r5.mSessionDataRef
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r6.<init>(r7, r0)
            r5._pasteContextMenu = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$1 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$1
            java.lang.String r7 = "pasteMC"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonLongPressStyle()
            r6.<init>(r5, r7, r0)
            r5._pasteMCButton = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r6.getLabel()
            r7 = 1
            r6.setWrap(r7)
            org.fortheloss.sticknodes.TextButtonLongPress r6 = r5._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.getCell(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1082130432(0x40800000, float:4.0)
            float r2 = r0 * r1
            float r0 = r0 * r1
            r1 = 0
            r6.pad(r1, r2, r1, r0)
            org.fortheloss.sticknodes.TextButtonLongPress r6 = r5._pasteMCButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$2
            r0.<init>(r5)
            r6.addListener(r0)
            org.fortheloss.sticknodes.TextButtonLongPress r6 = r5._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            r0 = 2
            r6.colspan(r0)
            r5.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r6 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r6.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r6.pad(r1)
            r2.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r6.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.pad(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.space(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r7.spaceRight(r1)
            r7.expandX()
            r7 = 0
            r6.setRound(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r5.add(r6)
            r7.colspan(r0)
            r5.row()
            java.lang.String r7 = "importMC"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = "..."
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeMovieclipButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r5._importMCButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$3
            r2.<init>(r5)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r5._importMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r5._importMCButton
            float r2 = r2.getWidth()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            r1.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getEditButtonStyle()
            java.lang.String r2 = ""
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r1)
            r5._editImportsButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$4 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$4
            r3.<init>(r5)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r5._editImportsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r5._editImportsButton
            float r1 = r1.getWidth()
            r3 = 1051931443(0x3eb33333, float:0.35)
            float r1 = r1 * r3
            r6.width(r1)
            com.badlogic.gdx.utils.Array r6 = new com.badlogic.gdx.utils.Array
            r6.<init>()
            r5._libraryNameStrings = r6
            com.badlogic.gdx.scenes.scene2d.ui.TextField r6 = r5.createTextField(r2)
            java.lang.String r1 = "filter"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r6.setMessageText(r7)
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r7 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r7.<init>()
            r6.setTextFieldFilter(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r7 = (float) r7
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            r6.setSize(r7, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r7 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getFilterClearButtonStyle()
            r7.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            java.lang.String r2 = "noneLowercase"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ">"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = -1
            r1.<init>(r2, r3)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createSelectBoxWithFilter(r6, r7, r1)
            r5._mcSelectBox = r6
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r7 = r5._libraryNameStrings
            r6.setItems(r7)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r6 = r5._mcSelectBox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$5 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$5
            r7.<init>(r5)
            r6.addListener(r7)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r6 = r5._mcSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.colspan(r0)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r7 = (float) r7
            r6.height(r7)
            r5.row()
            java.lang.String r6 = "addMC"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "(+) "
            r7.append(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r6, r7)
            r5._addMCButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$6 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$6
            r7.<init>(r5)
            r6.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5._addMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            r7 = 16
            r6.align(r7)
            java.lang.String r6 = "editMC"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " >"
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r7, r1)
            r5._editMCButton = r7
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$7 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$7
            r1.<init>(r5)
            r7.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r7 = r5._editMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r7 = r5.add(r7)
            r1 = 8
            r7.align(r1)
            r5.row()
            java.lang.String r7 = "createNewMC"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r6, r7)
            r5._createNewMCButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$8 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.MCLibraryToolTable$8
            r7.<init>(r5)
            r6.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5._createNewMCButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            r6.colspan(r0)
            r5.row()
            r5.pack()
            return
    }

    public void selectLastImportedMC() {
            r2 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r2._mcSelectBox
            com.badlogic.gdx.utils.Array r1 = r0.getItems()
            int r1 = r1.size
            int r1 = r1 + (-1)
            r0.setSelectedIndex(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3.mSessionDataRef
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r0.getCopiedMovieclip()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L19
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteMCButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            goto L25
        L19:
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteMCButton
            r0.setColor(r1, r1, r1, r1)
        L25:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r3._pasteContextMenu
            r0.update()
            return
    }

    public void updateMCLibrary() {
            r7 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r7._mcSelectBox
            java.lang.Object r0 = r0.getSelected()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r0 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex) r0
            java.lang.String r0 = r0.getName()
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r7._libraryNameStrings
            r1.clear()
            org.fortheloss.sticknodes.data.ProjectData r1 = r7._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r1 = r1.libraryMovieclips
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L1b:
            if (r3 >= r1) goto L47
            org.fortheloss.sticknodes.data.ProjectData r4 = r7._projectDataRef
            java.util.ArrayList<java.lang.Integer> r4 = r4.hiddenMovieclipLibraryIDs
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L2c
            goto L44
        L2c:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r4 = r7._libraryNameStrings
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r5 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            org.fortheloss.sticknodes.data.ProjectData r6 = r7._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r6 = r6.libraryMovieclips
            java.lang.Object r6 = r6.get(r3)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r6 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r6
            java.lang.String r6 = r6.getName()
            r5.<init>(r6, r3)
            r4.add(r5)
        L44:
            int r3 = r3 + 1
            goto L1b
        L47:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r7._libraryNameStrings
            int r1 = r1.size
            r3 = 1
            if (r1 > 0) goto L5b
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r7._mcSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r7._mcSelectBox
            r1.setDisabled(r3)
            goto L67
        L5b:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r7._mcSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r1.setTouchable(r4)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r7._mcSelectBox
            r1.setDisabled(r2)
        L67:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r7._mcSelectBox
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r2 = r7._libraryNameStrings
            r1.setItems(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r7._mcSelectBox
            com.badlogic.gdx.utils.Array r1 = r1.getItems()
            int r2 = r1.size
            int r2 = r2 - r3
        L77:
            if (r2 < 0) goto L92
            java.lang.Object r3 = r1.get(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r3 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8f
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r7._mcSelectBox
            r0.setSelectedIndex(r2)
            goto L92
        L8f:
            int r2 = r2 + (-1)
            goto L77
        L92:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r7._libraryNameStrings
            int r0 = r0.size
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto Lbc
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r7._mcSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = r0.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            if (r0 != r2) goto La5
            goto Lbc
        La5:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._addMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._addMCButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._editMCButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._editMCButton
            r0.setColor(r1, r1, r1, r1)
            goto Ld4
        Lbc:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._addMCButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._addMCButton
            r3 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._editMCButton
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._editMCButton
            r0.setColor(r1, r1, r1, r3)
        Ld4:
            return
    }
}
