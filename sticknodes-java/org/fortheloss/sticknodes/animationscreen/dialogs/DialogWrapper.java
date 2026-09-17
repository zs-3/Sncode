package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public abstract class DialogWrapper implements com.badlogic.gdx.utils.Disposable {
    protected org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Dialog _dialog;
    protected int _dialogAlign;
    private boolean _flagDoNotPreserveScrollPercent;
    private boolean _hideDialogIsCancelled;
    private boolean _isDisposed;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;
    private com.badlogic.gdx.scenes.scene2d.ui.Table _table;






    /* renamed from: -$$Nest$fget_dialog, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.Dialog m433$$Nest$fget_dialog(org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r0) {
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r0._dialog
            return r0
    }

    /* renamed from: -$$Nest$fget_flagDoNotPreserveScrollPercent, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m434$$Nest$fget_flagDoNotPreserveScrollPercent(org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r0) {
            boolean r0 = r0._flagDoNotPreserveScrollPercent
            return r0
    }

    /* renamed from: -$$Nest$fget_hideDialogIsCancelled, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m435$$Nest$fget_hideDialogIsCancelled(org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r0) {
            boolean r0 = r0._hideDialogIsCancelled
            return r0
    }

    /* renamed from: -$$Nest$fget_isDisposed, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m436$$Nest$fget_isDisposed(org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r0) {
            boolean r0 = r0._isDisposed
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m437$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    /* renamed from: -$$Nest$fput_flagDoNotPreserveScrollPercent, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m438$$Nest$fput_flagDoNotPreserveScrollPercent(org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r0, boolean r1) {
            r0._flagDoNotPreserveScrollPercent = r1
            return
    }

    /* renamed from: -$$Nest$fput_hideDialogIsCancelled, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m439$$Nest$fput_hideDialogIsCancelled(org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper r0, boolean r1) {
            r0._hideDialogIsCancelled = r1
            return
    }

    public DialogWrapper(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._dialogAlign = r0
            r0 = 0
            r1._hideDialogIsCancelled = r0
            r1._isDisposed = r0
            r1._flagDoNotPreserveScrollPercent = r0
            r1._animationScreenRef = r2
            return
    }

    public static com.badlogic.gdx.scenes.scene2d.ui.CheckBox createCheckbox(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle r2) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox
            java.lang.String r1 = ""
            r0.<init>(r1, r2)
            r2 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r2)
            return r0
    }

    public static int getBiggerListHeight() {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1147207680(0x44610000, float:900.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    public static int getInputHeight() {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1123024896(0x42f00000, float:120.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    public static int getListHeight() {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1143930880(0x442f0000, float:700.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    public static int getMaxDialogWidth() {
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    protected void addButton(com.badlogic.gdx.scenes.scene2d.ui.Button r2, java.lang.Object r3) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r1._dialog
            r0.button(r2, r3)
            return
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Cell addContent(com.badlogic.gdx.scenes.scene2d.Actor r2) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r0.add(r2)
            return r2
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Cell addContentRow() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.row()
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton createImageTextButton(java.lang.String r2, com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton.ImageTextButtonStyle r3) {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton
            r0.<init>(r2, r3)
            r2 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r2)
            return r0
    }

    protected org.fortheloss.framework.SelectBoxCustomItemHeight<java.lang.String> createSelectBox() {
            r4 = this;
            org.fortheloss.framework.SelectBoxCustomItemHeight r0 = new org.fortheloss.framework.SelectBoxCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.SelectBox$SelectBoxStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSelectBoxStyle()
            float r2 = org.fortheloss.sticknodes.App.assetScaling
            r3 = 1120927744(0x42d00000, float:104.0)
            float r2 = r2 * r3
            r0.<init>(r1, r2)
            org.fortheloss.framework.CustomStopListener r1 = new org.fortheloss.framework.CustomStopListener
            r1.<init>()
            r0.addListener(r1)
            r1 = 7
            r0.setMaxListCount(r1)
            r1 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r1)
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextButton createTextButton(java.lang.String r2) {
            r1 = this;
            r0 = 0
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1.createTextButton(r2, r0)
            return r2
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextButton createTextButton(java.lang.String r4, com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle r5) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            r0.<init>(r4, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r0.getLabel()
            r5 = 1
            r4.setWrap(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.getCell(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1082130432(0x40800000, float:4.0)
            float r2 = r5 * r1
            float r5 = r5 * r1
            r1 = 0
            r4.pad(r1, r2, r1, r5)
            r4 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r4)
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextButton createTextButton(java.lang.String r4, boolean r5) {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextButton
            if (r5 == 0) goto L9
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            goto Ld
        L9:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r5 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
        Ld:
            r0.<init>(r4, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r0.getLabel()
            r5 = 1
            r4.setWrap(r5)
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = r0.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r0.getCell(r4)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            r1 = 1082130432(0x40800000, float:4.0)
            float r2 = r5 * r1
            float r5 = r5 * r1
            r1 = 0
            r4.pad(r1, r2, r1, r5)
            r4 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r4)
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextField createTextField(java.lang.String r3) {
            r2 = this;
            r0 = -1
            r1 = 0
            com.badlogic.gdx.scenes.scene2d.ui.TextField r3 = r2.createTextField(r3, r0, r1)
            return r3
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.TextField createTextField(java.lang.String r3, int r4, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter r5) {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.TextField r0 = new com.badlogic.gdx.scenes.scene2d.ui.TextField
            com.badlogic.gdx.scenes.scene2d.ui.TextField$TextFieldStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getTextFieldStyle()
            r0.<init>(r3, r1)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r0.setBlinkTime(r3)
            if (r4 < 0) goto L14
            r0.setMaxLength(r4)
        L14:
            r0.setMaxLength(r4)
            org.fortheloss.framework.CustomStopListener r3 = new org.fortheloss.framework.CustomStopListener
            r3.<init>()
            r0.addListener(r3)
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$5 r3 = new org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$5
            r3.<init>(r2)
            r0.addListener(r3)
            if (r5 == 0) goto L2c
            r0.setTextFieldFilter(r5)
        L2c:
            r3 = 0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.addVibration(r0, r3)
            return r0
    }

    protected void dialogResult(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r4 = this;
            r0 = 1
            r4._isDisposed = r0
            r1 = 0
            r4._animationScreenRef = r1
            r4._scrollPane = r1
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r2 = r4._dialog
            if (r2 == 0) goto L16
            r2.clear()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r2 = r4._dialog
            r2.hide(r1)
            r4._dialog = r1
        L16:
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r4._table
            if (r2 == 0) goto L3c
            com.badlogic.gdx.utils.Array r2 = r2.getCells()
            int r3 = r2.size
            int r3 = r3 - r0
        L21:
            if (r3 < 0) goto L35
            java.lang.Object r0 = r2.get(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = (com.badlogic.gdx.scenes.scene2d.ui.Cell) r0
            com.badlogic.gdx.scenes.scene2d.Actor r0 = r0.getActor()
            if (r0 == 0) goto L32
            r0.clear()
        L32:
            int r3 = r3 + (-1)
            goto L21
        L35:
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4._table
            r0.clear()
            r4._table = r1
        L3c:
            return
    }

    protected void doNotHideDialog() {
            r1 = this;
            r0 = 1
            r1._hideDialogIsCancelled = r0
            return
    }

    public com.badlogic.gdx.scenes.scene2d.ui.Dialog getDialog() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r1._dialog
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.ScrollPane getDialogScrollPane() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r1._scrollPane
            return r0
    }

    protected com.badlogic.gdx.scenes.scene2d.ui.Table getTable() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r1._table
            return r0
    }

    public void hideImmediately() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r2._dialog
            if (r0 == 0) goto L8
            r1 = 0
            r0.hide(r1)
        L8:
            return
    }

    public void initialize(java.lang.String r10) {
            r9 = this;
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$1 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$1
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowStyle()
            r0.<init>(r9, r10, r1)
            r9._dialog = r0
            r1 = 1
            r0.setModal(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            r2 = 0
            r0.setMovable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            r0.setResizable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            r4 = 1101004800(0x41a00000, float:20.0)
            float r5 = r3 * r4
            r6 = 1109393408(0x42200000, float:40.0)
            float r7 = r3 * r6
            float r8 = r3 * r6
            float r3 = r3 * r6
            r0.pad(r5, r7, r8, r3)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r0.getTitleLabel()
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            r3 = 0
            r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.getContentTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r3)
            r0.expand()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.getButtonTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.defaults()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.space(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.expand()
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r4
            r0.padTop(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.getTitleTable()
            r0.reset()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.getTitleTable()
            r0.remove()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r0.getContentTable()
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r5 = new com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r7 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r7 = r7.getStyle()
            com.badlogic.gdx.graphics.g2d.BitmapFont r7 = r7.titleFont
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r8 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Window$WindowStyle r8 = r8.getStyle()
            com.badlogic.gdx.graphics.Color r8 = r8.titleFontColor
            r5.<init>(r7, r8)
            r3.<init>(r10, r5)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r0.add(r3)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r4
            r10.spaceBottom(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r10 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r10.getContentTable()
            r10.row()
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$2 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$2
            r10.<init>(r9)
            r9._table = r10
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r0 * r4
            float r5 = r0 * r6
            float r7 = r0 * r4
            float r0 = r0 * r6
            r10.pad(r3, r5, r7, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._table
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.defaults()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.space(r0)
            r10.uniformX()
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r9._table
            r10.setRound(r2)
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$3 r10 = new org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$3
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r9._table
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r10.<init>(r9, r0, r3)
            r9._scrollPane = r10
            r10.setFadeScrollBars(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            r10.setScrollbarsOnTop(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r10 = r9._scrollPane
            r10.setScrollingDisabled(r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r10 = r9._dialog
            com.badlogic.gdx.scenes.scene2d.ui.Table r10 = r10.getContentTable()
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r9._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r10 = r10.add(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r9._animationScreenRef
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            float r0 = r0.getHeight()
            float r1 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1138491392(0x43dc0000, float:440.0)
            float r1 = r1 * r2
            float r0 = r0 - r1
            r10.maxHeight(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r10 = r9._dialog
            org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$4 r0 = new org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper$4
            r0.<init>(r9)
            r10.addListener(r0)
            return
    }

    public boolean isReadyToBeDisposed() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r2._dialog
            r1 = 1
            if (r0 == 0) goto Ld
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public boolean isShowing() {
            r1 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r1._dialog
            if (r0 == 0) goto Lc
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    protected void onTablePositionChanged() {
            r0 = this;
            return
    }

    protected void scrollToTop() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r2._scrollPane
            r1 = 0
            r0.setScrollY(r1)
            return
    }

    protected void setDoNotPreserveScrollPercentFlag(boolean r1) {
            r0 = this;
            r0._flagDoNotPreserveScrollPercent = r1
            return
    }

    public void show(com.badlogic.gdx.scenes.scene2d.Stage r7, int r8) {
            r6 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r6._dialog
            if (r0 == 0) goto Lc4
            com.badlogic.gdx.scenes.scene2d.Stage r0 = r0.getStage()
            if (r0 != 0) goto Lc4
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r6._dialog
            r0.pack()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r6._dialog
            r1 = 2
            r0.align(r1)
            int r0 = r6._dialogAlign
            r1 = 1
            r2 = 1101004800(0x41a00000, float:20.0)
            if (r0 != r1) goto L4c
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r6._dialog
            float r1 = r7.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r3 = r6._dialog
            float r3 = r3.getPrefWidth()
            float r1 = r1 - r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r3 = r7.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r4 = r6._dialog
            float r4 = r4.getPrefHeight()
            float r3 = r3 - r4
            float r8 = (float) r8
            float r3 = r3 - r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r2
            float r3 = r3 - r8
            int r8 = java.lang.Math.round(r3)
            float r8 = (float) r8
            r0.setPosition(r1, r8)
            goto La3
        L4c:
            r1 = 8
            if (r0 != r1) goto L72
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r6._dialog
            float r8 = (float) r8
            int r1 = java.lang.Math.round(r8)
            float r1 = (float) r1
            float r3 = r7.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r4 = r6._dialog
            float r4 = r4.getPrefHeight()
            float r3 = r3 - r4
            float r3 = r3 - r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r2
            float r3 = r3 - r8
            int r8 = java.lang.Math.round(r3)
            float r8 = (float) r8
            r0.setPosition(r1, r8)
            goto La3
        L72:
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r6._dialog
            float r1 = r7.getWidth()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r3 = r6._dialog
            float r3 = r3.getPrefWidth()
            float r1 = r1 - r3
            float r3 = org.fortheloss.sticknodes.App.assetScaling
            float r3 = r3 * r2
            float r1 = r1 - r3
            int r1 = java.lang.Math.round(r1)
            float r1 = (float) r1
            float r3 = r7.getHeight()
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r4 = r6._dialog
            float r4 = r4.getPrefHeight()
            float r3 = r3 - r4
            float r8 = (float) r8
            float r3 = r3 - r8
            float r8 = org.fortheloss.sticknodes.App.assetScaling
            float r8 = r8 * r2
            float r3 = r3 - r8
            int r8 = java.lang.Math.round(r3)
            float r8 = (float) r8
            r0.setPosition(r1, r8)
        La3:
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r8 = r6._dialog
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r8.setColor(r0, r0, r0, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r8 = r6._dialog
            com.badlogic.gdx.math.Interpolation r0 = com.badlogic.gdx.math.Interpolation.sineOut
            r3 = 1048576000(0x3e800000, float:0.25)
            com.badlogic.gdx.scenes.scene2d.actions.AlphaAction r4 = com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn(r3, r0)
            float r5 = org.fortheloss.sticknodes.App.assetScaling
            float r5 = r5 * r2
            com.badlogic.gdx.scenes.scene2d.actions.MoveByAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy(r1, r5, r3, r0)
            com.badlogic.gdx.scenes.scene2d.actions.ParallelAction r0 = com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel(r4, r0)
            r8.show(r7, r0)
        Lc4:
            return
    }
}
