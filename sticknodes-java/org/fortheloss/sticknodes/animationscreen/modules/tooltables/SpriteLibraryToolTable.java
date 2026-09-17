package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class SpriteLibraryToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _addSpriteButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _editImportsButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _importSpriteButton;
    private com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> _libraryNameStrings;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu _pasteContextMenu;
    private org.fortheloss.sticknodes.TextButtonLongPress _pasteSpriteButton;
    private org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> _spriteSelectBox;







    /* renamed from: -$$Nest$fget_pasteContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu m1183$$Nest$fget_pasteContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r0._pasteContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_spriteSelectBox, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter m1184$$Nest$fget_spriteSelectBox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0) {
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r0._spriteSelectBox
            return r0
    }

    /* renamed from: -$$Nest$monAddSpriteClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1185$$Nest$monAddSpriteClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0, int r1) {
            r0.onAddSpriteClick(r1)
            return
    }

    /* renamed from: -$$Nest$monEditImportsButtonClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1186$$Nest$monEditImportsButtonClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0) {
            r0.onEditImportsButtonClick()
            return
    }

    /* renamed from: -$$Nest$monImportSpriteClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1187$$Nest$monImportSpriteClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0) {
            r0.onImportSpriteClick()
            return
    }

    /* renamed from: -$$Nest$monPasteSpriteClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1188$$Nest$monPasteSpriteClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable r0) {
            r0.onPasteSpriteClick()
            return
    }

    public SpriteLibraryToolTable(org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onAddSpriteClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.addSprite(r2)
            return
    }

    private void onEditImportsButtonClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.editSpriteImportsList()
            return
    }

    private void onImportSpriteClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.loadSpriteImage()
            return
    }

    private void onPasteSpriteClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.IAnimationBasedModule r0 = r1.mAnimationBasedModuleRef
            r0.pasteSprite()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._pasteSpriteButton = r0
            r2._importSpriteButton = r0
            r2._editImportsButton = r0
            r2._spriteSelectBox = r0
            r2._addSpriteButton = r0
            r2._libraryNameStrings = r0
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r1 = r2._pasteContextMenu
            if (r1 == 0) goto L16
            r1.dispose()
            r2._pasteContextMenu = r0
        L16:
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
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$1 r6 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$1
            java.lang.String r7 = "pasteSprite"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            org.fortheloss.sticknodes.TextButtonLongPress$TextButtonLongPressStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonLongPressStyle()
            r6.<init>(r5, r7, r0)
            r5._pasteSpriteButton = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r6.getLabel()
            r7 = 1
            r6.setWrap(r7)
            org.fortheloss.sticknodes.TextButtonLongPress r6 = r5._pasteSpriteButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r6.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.getCell(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1082130432(0x40800000, float:4.0)
            float r2 = r0 * r1
            float r0 = r0 * r1
            r1 = 0
            r6.pad(r1, r2, r1, r0)
            org.fortheloss.sticknodes.TextButtonLongPress r6 = r5._pasteSpriteButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$2
            r0.<init>(r5)
            r6.addListener(r0)
            org.fortheloss.sticknodes.TextButtonLongPress r6 = r5._pasteSpriteButton
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
            java.lang.String r7 = "createSprite"
            java.lang.String r7 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = "..."
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeSpriteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r5._importSpriteButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$3 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$3
            r2.<init>(r5)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r5._importSpriteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r6.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r5._importSpriteButton
            float r2 = r2.getWidth()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            r1.width(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getEditButtonStyle()
            java.lang.String r2 = ""
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r2, r1)
            r5._editImportsButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$4 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$4
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
            r5._spriteSelectBox = r6
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r7 = r5._libraryNameStrings
            r6.setItems(r7)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r6 = r5._spriteSelectBox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$5 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$5
            r7.<init>(r5)
            r6.addListener(r7)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r6 = r5._spriteSelectBox
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.colspan(r0)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.width(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getInputHeight()
            float r7 = (float) r7
            r6.height(r7)
            r5.row()
            java.lang.String r6 = "addSprite"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "(+) "
            r7.append(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r6, r7)
            r5._addSpriteButton = r6
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$6 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpriteLibraryToolTable$6
            r7.<init>(r5)
            r6.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5._addSpriteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            r6.colspan(r0)
            r5.row()
            r5.pack()
            return
    }

    public void selectLastImportedSprite() {
            r2 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r2._spriteSelectBox
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
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r0.getCopiedSprite()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L19
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteSpriteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteSpriteButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            goto L25
        L19:
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteSpriteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            org.fortheloss.sticknodes.TextButtonLongPress r0 = r3._pasteSpriteButton
            r0.setColor(r1, r1, r1, r1)
        L25:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0 = r3._pasteContextMenu
            r0.update()
            return
    }

    public void updateSpriteLibrary() {
            r6 = this;
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._libraryNameStrings
            r0.clear()
            org.fortheloss.sticknodes.data.ProjectData r0 = r6._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r0 = r0.librarySprites
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L3b
            org.fortheloss.sticknodes.data.ProjectData r3 = r6._projectDataRef
            java.util.ArrayList<java.lang.Integer> r3 = r3.hiddenSpriteLibraryIDs
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L20
            goto L38
        L20:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r3 = r6._libraryNameStrings
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex
            org.fortheloss.sticknodes.data.ProjectData r5 = r6._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.sprite.ISpriteSource> r5 = r5.librarySprites
            java.lang.Object r5 = r5.get(r2)
            org.fortheloss.sticknodes.sprite.ISpriteSource r5 = (org.fortheloss.sticknodes.sprite.ISpriteSource) r5
            java.lang.String r5 = r5.getName()
            r4.<init>(r5, r2)
            r3.add(r4)
        L38:
            int r2 = r2 + 1
            goto Lf
        L3b:
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._libraryNameStrings
            int r0 = r0.size
            if (r0 > 0) goto L4f
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._spriteSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._spriteSelectBox
            r1 = 1
            r0.setDisabled(r1)
            goto L5b
        L4f:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._spriteSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._spriteSelectBox
            r0.setDisabled(r1)
        L5b:
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._spriteSelectBox
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r1 = r6._libraryNameStrings
            r0.setItems(r1)
            com.badlogic.gdx.utils.Array<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._libraryNameStrings
            int r0 = r0.size
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L82
            org.fortheloss.framework.SelectBoxCustomItemHeightWithFilter<org.fortheloss.sticknodes.animationscreen.modules.tooltables.NameIndex> r0 = r6._spriteSelectBox
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = r0.getTouchable()
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            if (r0 != r2) goto L75
            goto L82
        L75:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6._addSpriteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6._addSpriteButton
            r0.setColor(r1, r1, r1, r1)
            goto L90
        L82:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6._addSpriteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r6._addSpriteButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
        L90:
            return
    }
}
