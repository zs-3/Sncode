package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class LibraryToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _addStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _createNewStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _downloadStickfiguresButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _editImportsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _editStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _importStickfigureButton;
    private com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> _libraryNameStrings;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu _pasteContextMenu;
    private org.fortheloss.sticknodes.TextButtonLongPress _pasteStickfigureButton;
    private org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> _stickfigureSelectBox;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _submitStickfigureButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;











    /* renamed from: -$$Nest$fget_pasteContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu m989$$Nest$fget_pasteContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r0._pasteContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_stickfigureSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter m990$$Nest$fget_stickfigureSelectBox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r0._stickfigureSelectBox
            return r0
    }

    /* renamed from: -$$Nest$monAddStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m991$$Nest$monAddStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0, int r1) {
            r0.onAddStickfigureClick(r1)
            return
    }

    /* renamed from: -$$Nest$monCreateNewStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m992$$Nest$monCreateNewStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0) {
            r0.onCreateNewStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monDownloadStickfiguresClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m993$$Nest$monDownloadStickfiguresClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0) {
            r0.onDownloadStickfiguresClick()
            return
    }

    /* renamed from: -$$Nest$monEditImportsButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m994$$Nest$monEditImportsButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0) {
            r0.onEditImportsButtonClick()
            return
    }

    /* renamed from: -$$Nest$monEditStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m995$$Nest$monEditStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0, int r1) {
            r0.onEditStickfigureClick(r1)
            return
    }

    /* renamed from: -$$Nest$monImportStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m996$$Nest$monImportStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0) {
            r0.onImportStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monPasteStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m997$$Nest$monPasteStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0) {
            r0.onPasteStickfigureClick()
            return
    }

    /* renamed from: -$$Nest$monSubmitStickfigureClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m998$$Nest$monSubmitStickfigureClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable r0) {
            r0.onSubmitStickfigureClick()
            return
    }

    public LibraryToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onAddStickfigureClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.addStickfigure(r2)
            return
    }

    private void onCreateNewStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.createNewStickfigure()
            return
    }

    private void onDownloadStickfiguresClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            r0.downloadStickfigures()
            return
    }

    private void onEditImportsButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.editStickfigureImportsList()
            return
    }

    private void onEditStickfigureClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.editStickfigure(r2)
            return
    }

    private void onImportStickfigureClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r2.mAnimationBasedModuleRef
            r1 = 0
            r0.importStickfigure(r1)
            return
    }

    private void onPasteStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.pasteStickfigure()
            return
    }

    private void onSubmitStickfigureClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = (org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule) r0
            r0.submitStickfigure()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2._pasteStickfigureButton = r0
            r2._importStickfigureButton = r0
            r2._editImportsButton = r0
            r2._stickfigureSelectBox = r0
            r2._addStickfigureButton = r0
            r2._editStickfigureButton = r0
            r2._createNewStickfigureButton = r0
            r2._downloadStickfiguresButton = r0
            r2._submitStickfigureButton = r0
            r2._libraryNameStrings = r0
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r1 = r2._pasteContextMenu
            if (r1 == 0) goto L20
            r1.dispose()
            r2._pasteContextMenu = r0
        L20:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r9, com.badlogic.gdx.scenes.scene2d.utils.Drawable r10) {
            r8 = this;
            super.initialize(r10)
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r10 = r8.mAnimationBasedModuleRef
            boolean r10 = r10 instanceof org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu
            org.fortheloss.sticknodes.data.SessionData r1 = r8.mSessionDataRef
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r0.<init>(r1, r2)
            r8._pasteContextMenu = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$1
            java.lang.String r1 = "pasteStickfigure"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonLongPressStyle()
            r0.<init>(r8, r1, r2)
            r8._pasteStickfigureButton = r0
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getLabel()
            r1 = 1
            r0.setWrap(r1)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r8._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.getCell(r2)
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1082130432(0x40800000, float:4.0)
            float r4 = r2 * r3
            float r2 = r2 * r3
            r3 = 0
            r0.pad(r3, r4, r3, r2)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r8._pasteStickfigureButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$2 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$2
            r2.<init>(r8)
            r0.addListener(r2)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r8._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.add(r0)
            r2 = 2
            r0.colspan(r2)
            r8.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r0.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0.pad(r3)
            r4.align(r1)
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r4
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto La0
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "is_"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "spaceRight_assetscaling"
            r4.setCrashlyticsKeyString(r6, r5)
            org.fortheloss.framework.IPlatform r4 = org.fortheloss.sticknodes.App.platform
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "spaceRight_value"
            r4.setCrashlyticsKeyString(r6, r5)
        La0:
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r4.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r3.spaceRight(r1)
            r1.expandX()
            r1 = 0
            r0.setRound(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r8.add(r0)
            r1.colspan(r2)
            r8.row()
            java.lang.String r1 = "importStickfigure"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeStickfigureButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r3)
            r8._importStickfigureButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$3 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$3
            r3.<init>(r8)
            r1.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r8._importStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r8._importStickfigureButton
            float r3 = r3.getWidth()
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            float r3 = r3 * r4
            r1.width(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getEditButtonStyle()
            java.lang.String r3 = ""
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r3, r1)
            r8._editImportsButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$4 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$4
            r4.<init>(r8)
            r1.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r8._editImportsButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r8._editImportsButton
            float r1 = r1.getWidth()
            r4 = 1051931443(0x3eb33333, float:0.35)
            float r1 = r1 * r4
            r0.width(r1)
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r8._libraryNameStrings = r0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = r8.createTextField(r3)
            java.lang.String r1 = "filter"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "..."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.setMessageText(r1)
            org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter r1 = new org.fortheloss.sticknodes.animationscreen.modules.Module$FileNameFilter
            r1.<init>()
            r0.setTextFieldFilter(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r1 = (float) r1
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r3 = (float) r3
            r0.setSize(r1, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getFilterClearButtonStyle()
            r1.<init>(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            java.lang.String r4 = "noneLowercase"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "<"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ">"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = -1
            r3.<init>(r4, r5)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createSelectBoxWithFilter(r0, r1, r3)
            r8._stickfigureSelectBox = r0
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r8._libraryNameStrings
            r0.setItems(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r8._stickfigureSelectBox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$5 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$5
            r1.<init>(r8)
            r0.addListener(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r8._stickfigureSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.colspan(r2)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r1)
            int r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r1 = (float) r1
            r0.height(r1)
            r8.row()
            java.lang.String r0 = "addStickfigure"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "(+) "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r1)
            r8._addStickfigureButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$6 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$6
            r1.<init>(r8)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8._addStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.add(r0)
            r1 = 16
            r0.align(r1)
            java.lang.String r0 = "editStickfigure"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r3)
            r8._editStickfigureButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$7 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$7
            r3.<init>(r8)
            r0.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8._editStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.add(r0)
            r3 = 8
            r0.align(r3)
            r8.row()
            java.lang.String r0 = "createNewStickfigure"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r4)
            r8._createNewStickfigureButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$8 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$8
            r4.<init>(r8)
            r0.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r8._createNewStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r8.add(r0)
            r0.colspan(r2)
            r8.row()
            if (r10 == 0) goto L2a2
            com.badlogic.gdx.scenes.scene2d.ui.Image r10 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r0 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r9.findRegion(r0)
            r10.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.colspan(r2)
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.padTop(r0)
            int r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r0 = (float) r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.padBottom(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r9.fillX()
            float r10 = r10.getHeight()
            r9.height(r10)
            r8.row()
            java.lang.String r9 = "downloadStickfigures"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r9, r10)
            r8._downloadStickfiguresButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$9 r10 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$9
            r10.<init>(r8)
            r9.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r8._downloadStickfiguresButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.add(r9)
            r9.align(r1)
            java.lang.String r9 = "submitStickfigure"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r9)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r9, r10)
            r8._submitStickfigureButton = r9
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$10 r10 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.LibraryToolTable$10
            r10.<init>(r8)
            r9.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r9 = r8._submitStickfigureButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r9 = r8.add(r9)
            r9.align(r3)
        L2a2:
            r8.pack()
            return
    }

    public void selectLastImportedStickfigure() {
            r2 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r2._stickfigureSelectBox
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
            java.util.ArrayList r0 = r0.getCopiedStickfigureWithJoins()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L19
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteStickfigureButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            goto L25
        L19:
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteStickfigureButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteStickfigureButton
            r0.setColor(r1, r1, r1, r1)
        L25:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r3._pasteContextMenu
            r0.update()
            return
    }

    public void updateStickfigureLibrary() {
            r6 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._stickfigureSelectBox
            java.lang.Object r0 = r0.getSelected()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r0 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex) r0
            java.lang.String r0 = r0.getName()
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r6._libraryNameStrings
            r1.clear()
            org.fortheloss.sticknodes.data.ProjectData r1 = r6._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = r1.libraryStickfigures
            int r1 = r1.size()
            r2 = 0
        L1a:
            if (r2 >= r1) goto L46
            org.fortheloss.sticknodes.data.ProjectData r3 = r6._projectDataRef
            java.util.ArrayList<java.lang.Integer> r3 = r3.hiddenStickfigureLibraryIDs
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L2b
            goto L43
        L2b:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r3 = r6._libraryNameStrings
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            org.fortheloss.sticknodes.data.ProjectData r5 = r6._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r5 = r5.libraryStickfigures
            java.lang.Object r5 = r5.get(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r5 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r5
            java.lang.String r5 = r5.getName()
            r4.<init>(r5, r2)
            r3.add(r4)
        L43:
            int r2 = r2 + 1
            goto L1a
        L46:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r6._stickfigureSelectBox
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r2 = r6._libraryNameStrings
            r1.setItems(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r6._stickfigureSelectBox
            com.badlogic.gdx.utils.Array r1 = r1.getItems()
            int r2 = r1.size
            int r2 = r2 + (-1)
        L57:
            if (r2 < 0) goto L72
            java.lang.Object r3 = r1.get(r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r3 = (org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L6f
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._stickfigureSelectBox
            r0.setSelectedIndex(r2)
            goto L72
        L6f:
            int r2 = r2 + (-1)
            goto L57
        L72:
            return
    }
}
