package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class SpecialSegmentToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _addConnectorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _addPolyfillButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _angleLockAbsoluteButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _angleLockInfoAbsoluteLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> _angleLockInfoLabelCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _angleLockInfoRelativeLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _angleLockLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _angleLockNoneButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _angleLockOptionsTable;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _angleLockRelativeButton;
    private org.fortheloss.framework.LabelInputIncrementField _angleLockRelativeMultiplierField;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.LabelInputIncrementField> _angleLockRelativeMultiplierFieldCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> _connectorButtonsCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _copySegmentAndChildrenButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _copySegmentButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _deleteConnectorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _deleteOneSegment;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _deletePolyfillButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Button _deleteSegmentAndChildrenButton;
    private org.fortheloss.framework.DegreesLabelInputIncrementField _dragLockAngleField;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> _dragLockAngleFieldCellRef;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _dragLockCheckbox;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _dragLockLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _editConnectorButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _editConnectorTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _editPolyfillButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _editPolyfillTable;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable _horizontalPushTables;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _isStaticButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _isStaticLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _modifyBranchButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _nonMainNodesTable;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> _nonMainNodesTableCellRef;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu _pasteContextMenu;
    private org.fortheloss.sticknodes.ImageTextButtonLongPress _pasteSegmentButton;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _pasteUseGlobalAngleButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> _polyfillButtonsCellRef;
    private org.fortheloss.framework.RepeatingImageButton _pushBackButton;
    private org.fortheloss.framework.RepeatingImageButton _pushBackButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _pushBranchTable;
    private org.fortheloss.framework.RepeatingImageButton _pushForwardButton;
    private org.fortheloss.framework.RepeatingImageButton _pushForwardButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _pushTable;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _sendToBackButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _sendToBackButton2;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _sendToFrontButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _sendToFrontButton2;
    private org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu _splitContextMenu;
    private org.fortheloss.sticknodes.ImageTextButtonLongPress _splitSegmentButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;








































    /* renamed from: -$$Nest$fget_dragLockCheckbox, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m1163$$Nest$fget_dragLockCheckbox(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0._dragLockCheckbox
            return r0
    }

    /* renamed from: -$$Nest$fget_pasteContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu m1164$$Nest$fget_pasteContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r0 = r0._pasteContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_splitContextMenu, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu m1165$$Nest$fget_splitContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu r0 = r0._splitContextMenu
            return r0
    }

    /* renamed from: -$$Nest$fget_splitSegmentButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.ImageTextButtonLongPress m1166$$Nest$fget_splitSegmentButton(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            org.fortheloss.sticknodes.ImageTextButtonLongPress r0 = r0._splitSegmentButton
            return r0
    }

    /* renamed from: -$$Nest$monCopySegmentAndChildrenClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1167$$Nest$monCopySegmentAndChildrenClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onCopySegmentAndChildrenClick()
            return
    }

    /* renamed from: -$$Nest$monCopySegmentClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1168$$Nest$monCopySegmentClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onCopySegmentClick()
            return
    }

    /* renamed from: -$$Nest$monDeleteOneSegmentClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1169$$Nest$monDeleteOneSegmentClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onDeleteOneSegmentClick()
            return
    }

    /* renamed from: -$$Nest$monDeleteSegmentAndChildrenClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1170$$Nest$monDeleteSegmentAndChildrenClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onDeleteSegmentAndChildrenClick()
            return
    }

    /* renamed from: -$$Nest$monIsStaticClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1171$$Nest$monIsStaticClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onIsStaticClick()
            return
    }

    /* renamed from: -$$Nest$monModifyBranchClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1172$$Nest$monModifyBranchClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onModifyBranchClick()
            return
    }

    /* renamed from: -$$Nest$monPasteSegmentClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1173$$Nest$monPasteSegmentClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onPasteSegmentClick()
            return
    }

    /* renamed from: -$$Nest$monPushBranchBackClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1174$$Nest$monPushBranchBackClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onPushBranchBackClick()
            return
    }

    /* renamed from: -$$Nest$monPushBranchForwardClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1175$$Nest$monPushBranchForwardClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onPushBranchForwardClick()
            return
    }

    /* renamed from: -$$Nest$monPushSegmentBackClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1176$$Nest$monPushSegmentBackClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onPushSegmentBackClick()
            return
    }

    /* renamed from: -$$Nest$monPushSegmentForwardClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1177$$Nest$monPushSegmentForwardClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onPushSegmentForwardClick()
            return
    }

    /* renamed from: -$$Nest$monSendBranchToBackClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1178$$Nest$monSendBranchToBackClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onSendBranchToBackClick()
            return
    }

    /* renamed from: -$$Nest$monSendBranchToFrontClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1179$$Nest$monSendBranchToFrontClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onSendBranchToFrontClick()
            return
    }

    /* renamed from: -$$Nest$monSendSegmentToBackClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1180$$Nest$monSendSegmentToBackClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onSendSegmentToBackClick()
            return
    }

    /* renamed from: -$$Nest$monSendSegmentToFrontClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1181$$Nest$monSendSegmentToFrontClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0) {
            r0.onSendSegmentToFrontClick()
            return
    }

    /* renamed from: -$$Nest$monSplitSegmentClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1182$$Nest$monSplitSegmentClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable r0, int r1) {
            r0.onSplitSegmentClick(r1)
            return
    }

    public SpecialSegmentToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onCopySegmentAndChildrenClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            r1 = 1
            r0.copySegment(r1)
            return
    }

    private void onCopySegmentClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            r1 = 0
            r0.copySegment(r1)
            return
    }

    private void onDeleteOneSegmentClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.deleteOneSegment()
            return
    }

    private void onDeleteSegmentAndChildrenClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.deleteSegmentAndChildren()
            return
    }

    private void onIsStaticClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._isStaticButton
            boolean r1 = r1.isChecked()
            r0.setSegmentIsStatic(r1)
            return
    }

    private void onModifyBranchClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.modifyBranch()
            return
    }

    private void onPasteSegmentClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._pasteUseGlobalAngleButton
            boolean r1 = r1.isChecked()
            r0.pasteSegment(r1)
            return
    }

    private void onPushBranchBackClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.pushBranchBack()
            return
    }

    private void onPushBranchForwardClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.pushBranchForward()
            return
    }

    private void onPushSegmentBackClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.pushSegmentBack()
            return
    }

    private void onPushSegmentForwardClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.pushSegmentForward()
            return
    }

    private void onSendBranchToBackClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.sendBranchToBack()
            return
    }

    private void onSendBranchToFrontClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.sendBranchToFront()
            return
    }

    private void onSendSegmentToBackClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.sendSegmentToBack()
            return
    }

    private void onSendSegmentToFrontClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.sendSegmentToFront()
            return
    }

    private void onSplitSegmentClick(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.splitSegment(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._titleLabel = r0
            r2._isStaticLabel = r0
            r2._isStaticButton = r0
            r2._angleLockLabel = r0
            r2._dragLockLabel = r0
            r2._dragLockCheckbox = r0
            r2._pushBackButton = r0
            r2._pushBackButton2 = r0
            r2._pushForwardButton = r0
            r2._pushForwardButton2 = r0
            r2._sendToBackButton = r0
            r2._sendToBackButton2 = r0
            r2._sendToFrontButton = r0
            r2._sendToFrontButton2 = r0
            r2._splitSegmentButton = r0
            r2._deleteSegmentAndChildrenButton = r0
            r2._deleteOneSegment = r0
            r2._copySegmentButton = r0
            r2._copySegmentAndChildrenButton = r0
            r2._pasteSegmentButton = r0
            r2._pasteUseGlobalAngleButton = r0
            r2._modifyBranchButton = r0
            r2._addPolyfillButton = r0
            r2._addConnectorButton = r0
            r2._editPolyfillButton = r0
            r2._editConnectorButton = r0
            r2._deletePolyfillButton = r0
            r2._deleteConnectorButton = r0
            r2._dragLockAngleFieldCellRef = r0
            r2._angleLockNoneButton = r0
            r2._angleLockRelativeButton = r0
            r2._angleLockAbsoluteButton = r0
            r2._angleLockInfoLabelCellRef = r0
            r2._angleLockInfoRelativeLabel = r0
            r2._angleLockInfoAbsoluteLabel = r0
            r2._angleLockRelativeMultiplierFieldCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._editConnectorTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._editConnectorTable = r0
            r2._connectorButtonsCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._nonMainNodesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._nonMainNodesTable = r0
            r2._nonMainNodesTableCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._editPolyfillTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._editPolyfillTable = r0
            r2._polyfillButtonsCellRef = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._angleLockOptionsTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._angleLockOptionsTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._pushTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._pushTable = r0
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r2._pushBranchTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.clearTableCells(r1)
            r2._pushBranchTable = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2._angleLockRelativeMultiplierField
            if (r1 == 0) goto L82
            r1.dispose()
            r2._angleLockRelativeMultiplierField = r0
        L82:
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r2._dragLockAngleField
            if (r1 == 0) goto L8b
            r1.dispose()
            r2._dragLockAngleField = r0
        L8b:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r1 = r2._horizontalPushTables
            if (r1 == 0) goto L94
            r1.dispose()
            r2._horizontalPushTables = r0
        L94:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r1 = r2._pasteContextMenu
            if (r1 == 0) goto L9d
            r1.dispose()
            r2._pasteContextMenu = r0
        L9d:
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.SplitSegmentContextMenu r1 = r2._splitContextMenu
            if (r1 == 0) goto La6
            r1.dispose()
            r2._splitContextMenu = r0
        La6:
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r17, com.badlogic.gdx.scenes.scene2d.utils.Drawable r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Class<com.badlogic.gdx.graphics.g2d.TextureAtlas> r3 = com.badlogic.gdx.graphics.g2d.TextureAtlas.class
            super.initialize(r2)
            java.lang.String r4 = "specialSegmentTools"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r6 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6, r5)
            r0._titleLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.add(r4)
            r5 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            r4.fillX()
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r0._nonMainNodesTable = r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r4.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            r0._nonMainNodesTableCellRef = r4
            java.lang.String r4 = "staticNew"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6)
            r0._isStaticLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.add(r4)
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r4)
            r0._isStaticButton = r4
            r7 = 60
            r0.registerWidget(r4, r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r0._isStaticButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$1 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$1
            r7.<init>(r0)
            r4.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r0._isStaticButton
            r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            r4.row()
            java.lang.String r4 = "dragLock"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6)
            r0._dragLockLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.add(r4)
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r4)
            r0._dragLockCheckbox = r4
            r7 = 62
            r0.registerWidget(r4, r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r0._dragLockCheckbox
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$2 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$2
            r7.<init>(r0)
            r4.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r0._dragLockCheckbox
            r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            r4.row()
            org.fortheloss.framework.DegreesLabelInputIncrementField r4 = new org.fortheloss.framework.DegreesLabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r7 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r8 = r7.getContext()
            java.lang.String r7 = "dragLockAngle"
            java.lang.String r9 = org.fortheloss.sticknodes.App.localize(r7)
            java.lang.String r10 = "0"
            r11 = 3
            r12 = 0
            r13 = 1135837184(0x43b38000, float:359.0)
            r14 = 0
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0._dragLockAngleField = r4
            r7 = 63
            r0.registerWidget(r4, r7)
            org.fortheloss.framework.DegreesLabelInputIncrementField r4 = r0._dragLockAngleField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$3 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$3
            r7.<init>(r0)
            r4.setFieldListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            org.fortheloss.framework.DegreesLabelInputIncrementField r7 = r0._dragLockAngleField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            r0._dragLockAngleFieldCellRef = r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            r4.row()
            java.lang.String r4 = "angleLock"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6)
            r0._angleLockLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            r4.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r0._angleLockOptionsTable = r4
            r7 = 61
            r0.registerWidget(r4, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0._angleLockOptionsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            r4.row()
            java.lang.String r4 = "none"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0._angleLockOptionsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.add(r4)
            r4.fillX()
            java.lang.String r4 = "absolute"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0._angleLockOptionsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.add(r4)
            r4.fillX()
            java.lang.String r4 = "relative"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r7 = r0._angleLockOptionsTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r7.add(r4)
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._angleLockOptionsTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r4)
            r0._angleLockNoneButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$4 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$4
            r7.<init>(r0)
            r4.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._angleLockOptionsTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r0._angleLockNoneButton
            r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r4)
            r0._angleLockAbsoluteButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$5 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$5
            r7.<init>(r0)
            r4.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._angleLockOptionsTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r0._angleLockAbsoluteButton
            r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r4)
            r0._angleLockRelativeButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$6 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$6
            r7.<init>(r0)
            r4.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._angleLockOptionsTable
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r7 = r0._angleLockRelativeButton
            r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._angleLockOptionsTable
            r4.row()
            java.lang.String r4 = "angleLockRelativeInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6)
            r0._angleLockInfoRelativeLabel = r4
            java.lang.String r4 = "angleLockAbsoluteInfo"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r6)
            r0._angleLockInfoAbsoluteLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._angleLockOptionsTable
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r0._angleLockInfoRelativeLabel
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r7)
            r7 = 3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r6)
            r0._angleLockInfoLabelCellRef = r4
            org.fortheloss.framework.LabelInputIncrementField r4 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.Module r8 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r8.getContext()
            java.lang.String r8 = "multiplier"
            java.lang.String r10 = org.fortheloss.sticknodes.App.localize(r8)
            java.lang.String r11 = "1"
            r12 = 3
            r13 = -1027211264(0xffffffffc2c60000, float:-99.0)
            r14 = 1120272384(0x42c60000, float:99.0)
            r15 = 0
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0._angleLockRelativeMultiplierField = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable$NegativeDigitsOnlyFilter
            r8.<init>()
            r4.setTextFieldFilter(r8)
            org.fortheloss.framework.LabelInputIncrementField r4 = r0._angleLockRelativeMultiplierField
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$7 r8 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$7
            r8.<init>(r0)
            r4.setFieldListener(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            org.fortheloss.framework.LabelInputIncrementField r8 = r0._angleLockRelativeMultiplierField
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r8)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            r0._angleLockRelativeMultiplierFieldCellRef = r4
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r4 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r7 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r7]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r0._angleLockNoneButton
            r9 = 0
            r7[r9] = r8
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r0._angleLockAbsoluteButton
            r7[r6] = r8
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r8 = r0._angleLockRelativeButton
            r7[r5] = r8
            r4.<init>(r7)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r0._angleLockNoneButton
            r4.setChecked(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r7 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            java.lang.String r8 = "separator"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r10 = r1.findRegion(r8)
            r7.<init>(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r5)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padTop(r7)
            int r7 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r7 = (float) r7
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padBottom(r7)
            r4.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._nonMainNodesTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r4.<init>()
            r0._pushTable = r4
            r7 = 64
            r0.registerWidget(r4, r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r10 = 1101004800(0x41a00000, float:20.0)
            float r11 = r7 * r10
            float r7 = r7 * r10
            r12 = 0
            r4.pad(r11, r12, r7, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r12)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r11 = 1092616192(0x41200000, float:10.0)
            float r7 = r7 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceRight(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r7 = r7 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceBottom(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.uniformX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$8 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$8
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushBackwardStyle()
            r13 = 1045220557(0x3e4ccccd, float:0.2)
            r4.<init>(r0, r7, r13)
            r0._pushBackButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$9 r7 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$9
            r7.<init>(r0)
            r4.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            org.fortheloss.framework.RepeatingImageButton r7 = r0._pushBackButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r7)
            r7 = 16
            r4.align(r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$10 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$10
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r14 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushForwardStyle()
            r4.<init>(r0, r14, r13)
            r0._pushForwardButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$11 r14 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$11
            r14.<init>(r0)
            r4.addListener(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            org.fortheloss.framework.RepeatingImageButton r14 = r0._pushForwardButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r14)
            r14 = 8
            r4.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalSendToBackStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r4)
            r0._sendToBackButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$12 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$12
            r15.<init>(r0)
            r4.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r15 = r0._sendToBackButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r15)
            r4.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalSendToFrontStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r4)
            r0._sendToFrontButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$13 r15 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$13
            r15.<init>(r0)
            r4.addListener(r15)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r15 = r0._sendToFrontButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r15)
            r4.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushTable
            org.fortheloss.framework.SizeWidget r15 = new org.fortheloss.framework.SizeWidget
            int r9 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r9 = (float) r9
            r15.<init>(r9, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r15)
            r4.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = new com.badlogic.gdx.scenes.scene2d.ui.Table
            r4.<init>()
            r0._pushBranchTable = r4
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r15 = r9 * r10
            float r9 = r9 * r10
            r4.pad(r15, r12, r9, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushBranchTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.space(r12)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceRight(r9)
            float r9 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r9 * r11
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.spaceBottom(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.pad(r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.align(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.expandX()
            r4.uniformX()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$14 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$14
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushBackwardStyle()
            r4.<init>(r0, r9, r13)
            r0._pushBackButton2 = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$15 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$15
            r9.<init>(r0)
            r4.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushBranchTable
            org.fortheloss.framework.RepeatingImageButton r9 = r0._pushBackButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r9)
            r4.align(r7)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$16 r4 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$16
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalPushForwardStyle()
            r4.<init>(r0, r9, r13)
            r0._pushForwardButton2 = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$17 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$17
            r9.<init>(r0)
            r4.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushBranchTable
            org.fortheloss.framework.RepeatingImageButton r9 = r0._pushForwardButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r9)
            r4.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushBranchTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalSendToBackStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r4)
            r0._sendToBackButton2 = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$18 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$18
            r9.<init>(r0)
            r4.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushBranchTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r0._sendToBackButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r9)
            r4.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalSendToFrontStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r4)
            r0._sendToFrontButton2 = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$19 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$19
            r9.<init>(r0)
            r4.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushBranchTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r9 = r0._sendToFrontButton2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r9)
            r4.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushBranchTable
            r4.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r0._pushBranchTable
            org.fortheloss.framework.SizeWidget r9 = new org.fortheloss.framework.SizeWidget
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getLongInputWidth()
            float r10 = (float) r10
            r9.<init>(r10, r12)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.add(r9)
            r4.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Image r4 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.sticknodes.animationscreen.modules.Module r9 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r9 = r9.getContext()
            org.fortheloss.framework.Assets r9 = r9.getAssets()
            java.lang.String r10 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            java.lang.Object r9 = r9.get(r10, r3, r6)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r9 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r9
            java.lang.String r10 = "g_label_segment"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r9 = r9.findRegion(r10)
            r4.<init>(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Image r9 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            org.fortheloss.sticknodes.animationscreen.modules.Module r10 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r10 = r10.getContext()
            org.fortheloss.framework.Assets r10 = r10.getAssets()
            java.lang.String r11 = org.fortheloss.sticknodes.App.animationMenuAtlas3
            java.lang.Object r3 = r10.get(r11, r3, r6)
            com.badlogic.gdx.graphics.g2d.TextureAtlas r3 = (com.badlogic.gdx.graphics.g2d.TextureAtlas) r3
            java.lang.String r10 = "g_label_branch"
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r3 = r3.findRegion(r10)
            r9.<init>(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable
            r3.<init>(r0)
            r0._horizontalPushTables = r3
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r10 = r0._creationToolsModuleRef
            float r10 = r10.getWidth()
            r3.initialize(r10, r1, r2)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r2 = r0._horizontalPushTables
            com.badlogic.gdx.scenes.scene2d.ui.Table[] r3 = new com.badlogic.gdx.scenes.scene2d.ui.Table[r5]
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r0._pushTable
            r11 = 0
            r3[r11] = r10
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r0._pushBranchTable
            r3[r6] = r10
            java.lang.String[] r10 = new java.lang.String[r5]
            java.lang.String r13 = "reorderSegment"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            r10[r11] = r13
            java.lang.String r13 = "reorderBranch"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            r10[r6] = r13
            com.badlogic.gdx.scenes.scene2d.ui.Widget[] r13 = new com.badlogic.gdx.scenes.scene2d.ui.Widget[r5]
            r13[r11] = r4
            r13[r6] = r9
            r2.setTables(r3, r10, r13)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r2 = r0._horizontalPushTables
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r2.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r3 = r0._horizontalPushTables
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.expandX()
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r3 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r4 = r1.findRegion(r8)
            r3.<init>(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r5)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padTop(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padBottom(r3)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$20 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$20
            org.fortheloss.sticknodes.animationscreen.modules.Module r3 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r3.getContext()
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r9 = 50
            r2.<init>(r0, r3, r4, r9)
            r0._splitContextMenu = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$21 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$21
            java.lang.String r3 = "splitSegment"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " (1)"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextLongPressButtonLargeSplitStyle()
            r2.<init>(r0, r3, r4)
            r0._splitSegmentButton = r2
            r3 = 65
            r0.registerWidget(r2, r3)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r2 = r0._splitSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r2.getLabel()
            r2.setWrap(r6)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r2 = r0._splitSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.getCell(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1082130432(0x40800000, float:4.0)
            float r9 = r3 * r4
            float r3 = r3 * r4
            r2.pad(r12, r9, r12, r3)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r2 = r0._splitSegmentButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$22 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$22
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            org.fortheloss.sticknodes.ImageTextButtonLongPress r3 = r0._splitSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            r2.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r2.getContext()
            org.fortheloss.sticknodes.data.SessionData r2 = r2.getSessionData()
            boolean r2 = r2.getNerdModeEnabled()
            r3 = 69
            r9 = 68
            r10 = 67
            r11 = 66
            if (r2 != 0) goto L66f
            java.lang.String r2 = "deleteSegment"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeDeleteOneSegmentStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r2, r13)
            r0._deleteOneSegment = r2
            r0.registerWidget(r2, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._deleteOneSegment
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$23 r11 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$23
            r11.<init>(r0)
            r2.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r11 = r0._deleteOneSegment
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r11)
            r2.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            java.lang.String r2 = "deleteBranch"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r11 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeDeleteChildrenStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r2, r11)
            r0._deleteSegmentAndChildrenButton = r2
            r0.registerWidget(r2, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._deleteSegmentAndChildrenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$24 r10 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$24
            r10.<init>(r0)
            r2.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r10 = r0._deleteSegmentAndChildrenButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r10)
            r2.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r10 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r1.findRegion(r8)
            r10.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r5)
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padTop(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padBottom(r10)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            java.lang.String r2 = "copySegment"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r10 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeCopyOneSegmentStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r2, r10)
            r0._copySegmentButton = r2
            r0.registerWidget(r2, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._copySegmentButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$25 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$25
            r9.<init>(r0)
            r2.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r9 = r0._copySegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r9)
            r2.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            java.lang.String r2 = "copyBranch"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeCopyChildrenStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r2, r9)
            r0._copySegmentAndChildrenButton = r2
            r0.registerWidget(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._copySegmentAndChildrenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$26 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$26
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r0._copySegmentAndChildrenButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            r2.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            goto L72e
        L66f:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalDeleteOneSegmentStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r2)
            r0._deleteOneSegment = r2
            r0.registerWidget(r2, r11)
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._deleteOneSegment
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$27 r11 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$27
            r11.<init>(r0)
            r2.addListener(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r11 = r0._deleteOneSegment
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r11)
            r2.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalDeleteChildrenStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r2)
            r0._deleteSegmentAndChildrenButton = r2
            r0.registerWidget(r2, r10)
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._deleteSegmentAndChildrenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$28 r10 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$28
            r10.<init>(r0)
            r2.addListener(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r10 = r0._deleteSegmentAndChildrenButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r10)
            r2.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Image r10 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r11 = r1.findRegion(r8)
            r10.<init>(r11)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r10)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r5)
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padTop(r10)
            int r10 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r10 = (float) r10
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.padBottom(r10)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalCopyOneSegmentStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r2)
            r0._copySegmentButton = r2
            r0.registerWidget(r2, r9)
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._copySegmentButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$29 r9 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$29
            r9.<init>(r0)
            r2.addListener(r9)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r9 = r0._copySegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r9)
            r2.align(r7)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalCopyChildrenStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r2)
            r0._copySegmentAndChildrenButton = r2
            r0.registerWidget(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._copySegmentAndChildrenButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$30 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$30
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r0._copySegmentAndChildrenButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            r2.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._nonMainNodesTable
            r2.row()
        L72e:
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$31 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$31
            java.lang.String r3 = "pasteSegment"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            org.fortheloss.sticknodes.ImageTextButtonLongPress$ImageTextButtonLongPressStyle r9 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextLongPressButtonLargePasteStyle()
            r2.<init>(r0, r3, r9)
            r0._pasteSegmentButton = r2
            r3 = 70
            r0.registerWidget(r2, r3)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r2 = r0._pasteSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = r2.getLabel()
            r2.setWrap(r6)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r2 = r0._pasteSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r2.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.getCell(r3)
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r9 = r3 * r4
            float r3 = r3 * r4
            r2.pad(r12, r9, r12, r3)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r2 = r0._pasteSegmentButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$32 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$32
            r3.<init>(r0)
            r2.addListener(r3)
            r16.row()
            org.fortheloss.sticknodes.ImageTextButtonLongPress r2 = r0._pasteSegmentButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            r2.colspan(r5)
            r16.row()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r2 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu
            com.badlogic.gdx.scenes.scene2d.utils.Drawable r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getContextMenuBackgroundDrawable()
            r2.<init>(r3)
            r0._pasteContextMenu = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.defaults()
            r3 = 0
            r2.uniform(r3, r3)
            org.fortheloss.sticknodes.animationscreen.modules.Module r2 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r2 = r2.getContext()
            org.fortheloss.sticknodes.data.SessionData r2 = r2.getSessionData()
            boolean r2 = r2.getNerdModeEnabled()
            if (r2 != 0) goto L7c7
            java.lang.String r2 = "pasteAngleInfoNew"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r6)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r3 = r0._pasteContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.fillX()
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            r2.width(r3)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r2 = r0._pasteContextMenu
            r2.row()
        L7c7:
            java.lang.String r2 = "pasteAngleLabel"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r6)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r3 = r0._pasteContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r3.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.align(r7)
            r3 = 1128792064(0x43480000, float:200.0)
            float r4 = org.fortheloss.sticknodes.App.assetScaling
            float r4 = r4 * r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.minWidth(r4)
            r2.fillX()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r2)
            r0._pasteUseGlobalAngleButton = r2
            r2.setChecked(r6)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r2 = r0._pasteContextMenu
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r0._pasteUseGlobalAngleButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.add(r3)
            r2.align(r14)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu r2 = r0._pasteContextMenu
            r2.pack()
            com.badlogic.gdx.scenes.scene2d.ui.Image r2 = new com.badlogic.gdx.scenes.scene2d.ui.Image
            com.badlogic.gdx.graphics.g2d.TextureAtlas$AtlasRegion r1 = r1.findRegion(r8)
            r2.<init>(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r5)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padTop(r2)
            int r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.getSeparatorPadding()
            float r2 = (float) r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.padBottom(r2)
            r1.fillX()
            r16.row()
            org.fortheloss.sticknodes.animationscreen.modules.Module r1 = r16.getModule()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r1.getContext()
            org.fortheloss.sticknodes.data.SessionData r1 = r1.getSessionData()
            boolean r1 = r1.getNerdModeEnabled()
            if (r1 != 0) goto L858
            java.lang.String r1 = "modifyBranchInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r1, r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r1.colspan(r5)
            r1.fillX()
            r16.row()
        L858:
            java.lang.String r1 = "modifyBranchButton"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getModifyBranchButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r0._modifyBranchButton = r1
            r2 = 71
            r0.registerWidget(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r0._modifyBranchButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$33 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$33
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r0._modifyBranchButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            r1.colspan(r5)
            r16.row()
            java.lang.String r1 = "addConnector"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "..."
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeConnectorAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r2, r3)
            r0._addConnectorButton = r2
            r3 = 72
            r0.registerWidget(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r0._addConnectorButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$34 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$34
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r0._addConnectorButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r5)
            r0._connectorButtonsCellRef = r2
            r16.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r0._editConnectorTable = r2
            r3 = 73
            r0.registerWidget(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalConnectorAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r0._editConnectorButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$35 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$35
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._editConnectorTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r0._editConnectorButton
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalDeleteStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r2)
            r0._deleteConnectorButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$36 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$36
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r0._editConnectorTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r0._deleteConnectorButton
            r2.add(r3)
            java.lang.String r2 = "addPolyfill"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargePolyfillAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r2, r3)
            r0._addPolyfillButton = r2
            r3 = 74
            r0.registerWidget(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r0._addPolyfillButton
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$37 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$37
            r3.<init>(r0)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r0._addPolyfillButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r5)
            r0._polyfillButtonsCellRef = r2
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r0._editPolyfillTable = r2
            r3 = 75
            r0.registerWidget(r2, r3)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalPolyfillAddStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r0._editPolyfillButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$38 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$38
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._editPolyfillTable
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r2 = r0._editPolyfillButton
            r1.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageButtonNormalDeleteStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r1)
            r0._deletePolyfillButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$39 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SpecialSegmentToolTable$39
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r1 = r0._editPolyfillTable
            com.badlogic.gdx.scenes.scene2d.ui.Button r2 = r0._deletePolyfillButton
            r1.add(r2)
            r16.pack()
            return
    }

    public boolean isPreserveVisualAngleChecked() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r1._pasteUseGlobalAngleButton
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r6 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r6.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getCurrentlySelectedNode()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L1e1
            boolean r3 = r0 instanceof org.fortheloss.sticknodes.stickfigure.StickNode
            if (r3 != 0) goto L12
            goto L1e1
        L12:
            com.badlogic.gdx.scenes.scene2d.Touchable r3 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r6.setTouchable(r3)
            r6.setColor(r2, r2, r2, r2)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            boolean r4 = r0.isConnectorParent()
            if (r4 == 0) goto L32
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r6._connectorButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r6._editConnectorTable
            if (r4 == r5) goto L41
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r6._connectorButtonsCellRef
            r4.setActor(r5)
            goto L41
        L32:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r6._connectorButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r6._addConnectorButton
            if (r4 == r5) goto L41
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r6._connectorButtonsCellRef
            r4.setActor(r5)
        L41:
            boolean r4 = r0.isPolyfillAnchor()
            if (r4 == 0) goto L57
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r6._polyfillButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r6._editPolyfillTable
            if (r4 == r5) goto L66
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r6._polyfillButtonsCellRef
            r4.setActor(r5)
            goto L66
        L57:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r6._polyfillButtonsCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r5 = r6._addPolyfillButton
            if (r4 == r5) goto L66
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r4 = r6._polyfillButtonsCellRef
            r4.setActor(r5)
        L66:
            boolean r4 = r0.isMainNode()
            if (r4 == 0) goto L73
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r0 = r6._nonMainNodesTableCellRef
            r0.clearActor()
            goto L1e0
        L73:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r4 = r6._nonMainNodesTableCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r4 = r4.getActor()
            if (r4 != 0) goto L82
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Table> r4 = r6._nonMainNodesTableCellRef
            com.badlogic.gdx.scenes.scene2d.ui.Table r5 = r6._nonMainNodesTable
            r4.setActor(r5)
        L82:
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r6._isStaticLabel
            r4.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r6._isStaticButton
            com.badlogic.gdx.scenes.scene2d.Touchable r5 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r4.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r6._isStaticButton
            r4.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r6._angleLockOptionsTable
            r4.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r6._angleLockOptionsTable
            r4.setTouchable(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r6._dragLockLabel
            r4.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r6._dragLockCheckbox
            r4.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r4 = r6._dragLockCheckbox
            r4.setColor(r2, r2, r2, r2)
            org.fortheloss.framework.DegreesLabelInputIncrementField r4 = r6._dragLockAngleField
            r4.enable()
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r4 = r6._horizontalPushTables
            r4.setTouchable(r3)
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.HorizontalSubTable r3 = r6._horizontalPushTables
            r3.setColor(r2, r2, r2, r2)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r3 = r6._splitSegmentButton
            r3.setTouchable(r5)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r3 = r6._splitSegmentButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r6._deleteOneSegment
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r6._deleteOneSegment
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r6._deleteSegmentAndChildrenButton
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r6._deleteSegmentAndChildrenButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r6._copySegmentButton
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r6._copySegmentButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r6._copySegmentAndChildrenButton
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Button r3 = r6._copySegmentAndChildrenButton
            r3.setColor(r2, r2, r2, r2)
            org.fortheloss.sticknodes.data.SessionData r3 = r6.mSessionDataRef
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r3.getCopiedStickNode()
            if (r3 != 0) goto L10c
            org.fortheloss.sticknodes.ImageTextButtonLongPress r3 = r6._pasteSegmentButton
            com.badlogic.gdx.scenes.scene2d.Touchable r4 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r4)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r3 = r6._pasteSegmentButton
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._pasteUseGlobalAngleButton
            r3.setTouchable(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._pasteUseGlobalAngleButton
            r3.setColor(r2, r2, r2, r1)
            goto L120
        L10c:
            org.fortheloss.sticknodes.ImageTextButtonLongPress r3 = r6._pasteSegmentButton
            r3.setTouchable(r5)
            org.fortheloss.sticknodes.ImageTextButtonLongPress r3 = r6._pasteSegmentButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._pasteUseGlobalAngleButton
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._pasteUseGlobalAngleButton
            r3.setColor(r2, r2, r2, r2)
        L120:
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r6._modifyBranchButton
            r3.setTouchable(r5)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r6._modifyBranchButton
            r3.setColor(r2, r2, r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._isStaticButton
            boolean r4 = r0.isStatic()
            r3.setChecked(r4)
            org.fortheloss.framework.LabelInputIncrementField r3 = r6._angleLockRelativeMultiplierField
            byte r4 = r0.getSegmentRelativeAngleLockMultiplier()
            float r4 = (float) r4
            r3.setValue(r4)
            boolean r3 = r0.getIsAngleLocked()
            r4 = 1
            if (r3 != 0) goto L154
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._angleLockNoneButton
            r3.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r6._angleLockInfoLabelCellRef
            r3.clearActor()
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.LabelInputIncrementField> r3 = r6._angleLockRelativeMultiplierFieldCellRef
            r3.clearActor()
            goto L197
        L154:
            boolean r3 = r0.getAngleLockIsMainNode()
            if (r3 != 0) goto L17e
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._angleLockRelativeButton
            r3.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r6._angleLockInfoLabelCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r6._angleLockInfoRelativeLabel
            if (r3 == r4) goto L16e
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r6._angleLockInfoLabelCellRef
            r3.setActor(r4)
        L16e:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.LabelInputIncrementField> r3 = r6._angleLockRelativeMultiplierFieldCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            org.fortheloss.framework.LabelInputIncrementField r4 = r6._angleLockRelativeMultiplierField
            if (r3 == r4) goto L197
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.LabelInputIncrementField> r3 = r6._angleLockRelativeMultiplierFieldCellRef
            r3.setActor(r4)
            goto L197
        L17e:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._angleLockAbsoluteButton
            r3.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r6._angleLockInfoLabelCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r3 = r3.getActor()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r6._angleLockInfoAbsoluteLabel
            if (r3 == r4) goto L192
            com.badlogic.gdx.scenes.scene2d.ui.Cell<com.badlogic.gdx.scenes.scene2d.ui.Label> r3 = r6._angleLockInfoLabelCellRef
            r3.setActor(r4)
        L192:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<org.fortheloss.framework.LabelInputIncrementField> r3 = r6._angleLockRelativeMultiplierFieldCellRef
            r3.clearActor()
        L197:
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._dragLockCheckbox
            boolean r4 = r0.getIsDragLocked()
            r3.setChecked(r4)
            org.fortheloss.framework.DegreesLabelInputIncrementField r3 = r6._dragLockAngleField
            float r4 = r0.getDragLockAngle()
            r3.setValue(r4)
            boolean r3 = r0.getIsAngleLocked()
            if (r3 == 0) goto L1c5
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r6._dragLockLabel
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r6._dragLockCheckbox
            r3.setColor(r2, r2, r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r6._dragLockCheckbox
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r1.setTouchable(r2)
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r6._dragLockAngleField
            r1.disable()
        L1c5:
            boolean r0 = r0.getIsDragLocked()
            if (r0 == 0) goto L1db
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r6._dragLockAngleFieldCellRef
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 != 0) goto L1e0
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r6._dragLockAngleFieldCellRef
            org.fortheloss.framework.DegreesLabelInputIncrementField r1 = r6._dragLockAngleField
            r0.setActor(r1)
            goto L1e0
        L1db:
            com.badlogic.gdx.scenes.scene2d.ui.Cell<? extends com.badlogic.gdx.scenes.scene2d.Actor> r0 = r6._dragLockAngleFieldCellRef
            r0.clearActor()
        L1e0:
            return
        L1e1:
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r6.setTouchable(r0)
            r6.setColor(r2, r2, r2, r1)
            return
    }
}
