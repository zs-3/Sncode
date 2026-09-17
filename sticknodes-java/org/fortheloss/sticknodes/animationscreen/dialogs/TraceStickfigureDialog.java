package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class TraceStickfigureDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    protected static float lastScrollY;
    protected static java.lang.String lastSelectedString;
    private org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule _createToolsModuleRef;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _importedStickfigureList;
    private com.badlogic.gdx.utils.Array<java.lang.String> _libraryNameStrings;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;


    /* renamed from: -$$Nest$fget_importedStickfigureList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m661$$Nest$fget_importedStickfigureList(org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._importedStickfigureList
            return r0
    }

    /* renamed from: -$$Nest$fget_scrollPane, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.ScrollPane m662$$Nest$fget_scrollPane(org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r0._scrollPane
            return r0
    }

    static {
            return
    }

    public TraceStickfigureDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2) {
            r0 = this;
            r0.<init>(r1)
            r0._createToolsModuleRef = r2
            return
    }

    private void updateFiles() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.data.ProjectData r0 = r0.getProjectData()
            com.badlogic.gdx.utils.Array<java.lang.String> r1 = r5._libraryNameStrings
            r1.clear()
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r1 = r0.libraryStickfigures
            int r1 = r1.size()
            r2 = 0
        L12:
            if (r2 >= r1) goto L28
            com.badlogic.gdx.utils.Array<java.lang.String> r3 = r5._libraryNameStrings
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.Stickfigure> r4 = r0.libraryStickfigures
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r4
            java.lang.String r4 = r4.getName()
            r3.add(r4)
            int r2 = r2 + 1
            goto L12
        L28:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r5._importedStickfigureList
            com.badlogic.gdx.utils.Array<java.lang.String> r1 = r5._libraryNameStrings
            r0.setItems(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r2) {
            r1 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = 1
            if (r2 != r0) goto L1c
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r1._importedStickfigureList
            int r2 = r2.getSelectedIndex()
            if (r2 < 0) goto L1c
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2 = r1._createToolsModuleRef
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r1._importedStickfigureList
            int r0 = r0.getSelectedIndex()
            r2.setStickfigureToTraceFromLibrary(r0)
        L1c:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._libraryNameStrings = r0
            r1._importedStickfigureList = r0
            r1._scrollPane = r0
            r1._createToolsModuleRef = r0
            super.dispose()
            return
    }

    public void initialize() {
            r5 = this;
            java.lang.String r0 = "traceStickfigureTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            java.lang.String r1 = "traceStickfigureInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r0.<init>(r1, r2)
            r1 = 1
            r0.setWrap(r1)
            r0.setAlignment(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            r0.width(r2)
            r5.addContentRow()
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r5._libraryNameStrings = r0
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1120665600(0x42cc0000, float:102.0)
            float r0 = r0 * r2
            org.fortheloss.framework.ListCustomItemHeight r2 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            int r4 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r4 = (float) r4
            r2.<init>(r3, r0, r4)
            r5._importedStickfigureList = r2
            r5.updateFiles()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r5._importedStickfigureList
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog$1
            r2.<init>(r5)
            r0.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r5._importedStickfigureList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r0.<init>(r2, r3)
            r5._scrollPane = r0
            r2 = 0
            r0.setFadeScrollBars(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r5._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r5.addContent(r0)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r3 = (float) r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r0.width(r3)
            int r3 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r3 = (float) r3
            r4 = 1059984507(0x3f2e147b, float:0.68)
            float r3 = r3 * r4
            int r3 = (int) r3
            float r3 = (float) r3
            r0.height(r3)
            java.lang.String r0 = "traceThis"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.createTextButton(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5.addButton(r0, r3)
            java.lang.String r0 = "cancel"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r5.createTextButton(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.addButton(r0, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Dialog r0 = r5.getDialog()
            r0.validate()
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r5._importedStickfigureList
            com.badlogic.gdx.utils.Array r0 = r0.getItems()
            int r2 = r0.size
            r3 = 0
            if (r2 <= 0) goto Led
            java.lang.String r4 = org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog.lastSelectedString
            if (r4 == 0) goto Ld4
            int r2 = r2 - r1
        Lc0:
            if (r2 < 0) goto Ld4
            java.lang.Object r1 = r0.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog.lastSelectedString
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Ld1
            goto Ld5
        Ld1:
            int r2 = r2 + (-1)
            goto Lc0
        Ld4:
            r2 = -1
        Ld5:
            if (r2 < 0) goto Lf2
            int r0 = r0.size
            if (r2 >= r0) goto Lf2
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r0 = r5._scrollPane
            float r1 = r0.getMaxY()
            float r4 = org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog.lastScrollY
            float r1 = r1 - r4
            r0.scrollTo(r3, r1, r3, r3)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r5._importedStickfigureList
            r0.setSelectedIndex(r2)
            goto Lf2
        Led:
            r0 = 0
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog.lastSelectedString = r0
            org.fortheloss.sticknodes.animationscreen.dialogs.TraceStickfigureDialog.lastScrollY = r3
        Lf2:
            return
    }
}
