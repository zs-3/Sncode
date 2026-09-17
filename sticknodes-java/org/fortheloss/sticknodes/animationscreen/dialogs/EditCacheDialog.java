package org.fortheloss.sticknodes.animationscreen.dialogs;

/* loaded from: classes2.dex */
public class EditCacheDialog extends org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper {
    private java.util.ArrayList<java.lang.Integer> _cacheIndices;
    private org.fortheloss.framework.ListCustomItemHeight<java.lang.String> _cachedMCsList;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _deleteButton;
    private com.badlogic.gdx.utils.Array<java.lang.String> _nameStrings;
    private org.fortheloss.sticknodes.data.ProjectData _projectDataRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ScrollPane _scrollPane;


    /* renamed from: -$$Nest$fget_cachedMCsList, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.framework.ListCustomItemHeight m440$$Nest$fget_cachedMCsList(org.fortheloss.sticknodes.animationscreen.dialogs.EditCacheDialog r0) {
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r0._cachedMCsList
            return r0
    }

    /* renamed from: -$$Nest$fget_deleteButton, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.TextButton m441$$Nest$fget_deleteButton(org.fortheloss.sticknodes.animationscreen.dialogs.EditCacheDialog r0) {
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r0._deleteButton
            return r0
    }

    public EditCacheDialog(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void updateFiles() {
            r7 = this;
            com.badlogic.gdx.utils.Array<java.lang.String> r0 = r7._nameStrings
            if (r0 != 0) goto Lb
            com.badlogic.gdx.utils.Array r0 = new com.badlogic.gdx.utils.Array
            r0.<init>()
            r7._nameStrings = r0
        Lb:
            java.util.ArrayList<java.lang.Integer> r0 = r7._cacheIndices
            if (r0 != 0) goto L16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7._cacheIndices = r0
        L16:
            com.badlogic.gdx.utils.Array<java.lang.String> r0 = r7._nameStrings
            r0.clear()
            java.util.ArrayList<java.lang.Integer> r0 = r7._cacheIndices
            r0.clear()
            int[][] r0 = org.fortheloss.sticknodes.movieclip.MCCache.cachedLibraryIDs
            r1 = 0
            r2 = 0
        L24:
            r3 = 20
            if (r2 >= r3) goto L7c
            r3 = r0[r2]
            r3 = r3[r1]
            r4 = r0[r2]
            r5 = 1
            r4 = r4[r5]
            r6 = -1
            if (r3 != r6) goto L35
            goto L79
        L35:
            org.fortheloss.sticknodes.data.ProjectData r6 = r7._projectDataRef
            java.util.ArrayList<org.fortheloss.sticknodes.movieclip.MCMovieclipSource> r6 = r6.libraryMovieclips
            java.lang.Object r3 = r6.get(r3)
            org.fortheloss.sticknodes.movieclip.MCMovieclipSource r3 = (org.fortheloss.sticknodes.movieclip.MCMovieclipSource) r3
            java.lang.String r3 = r3.getName()
            java.lang.String r6 = "frame"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " ("
            r5.append(r3)
            r5.append(r6)
            java.lang.String r3 = " "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.badlogic.gdx.utils.Array<java.lang.String> r4 = r7._nameStrings
            r4.add(r3)
            java.util.ArrayList<java.lang.Integer> r3 = r7._cacheIndices
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.add(r4)
        L79:
            int r2 = r2 + 1
            goto L24
        L7c:
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r7._cachedMCsList
            com.badlogic.gdx.utils.Array<java.lang.String> r1 = r7._nameStrings
            r0.setItems(r1)
            com.badlogic.gdx.utils.Array<java.lang.String> r0 = r7._nameStrings
            int r0 = r0.size
            if (r0 > 0) goto L99
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._deleteButton
            com.badlogic.gdx.scenes.scene2d.Touchable r1 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r1)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r7._deleteButton
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r2, r2, r2, r1)
        L99:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper
    protected void dialogResult(java.lang.Object r2) {
            r1 = this;
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0 = 2
            if (r2 != r0) goto L2c
            java.util.ArrayList<java.lang.Integer> r2 = r1._cacheIndices
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r0 = r1._cachedMCsList
            int r0 = r0.getSelectedIndex()
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.removeIndexFromMCCache(r2)
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r1._cachedMCsList
            r0 = -1
            r2.setSelectedIndex(r0)
            r1.updateFiles()
            r1.doNotHideDialog()
        L2c:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._projectDataRef = r0
            r1._nameStrings = r0
            r1._cacheIndices = r0
            r1._cachedMCsList = r0
            r1._scrollPane = r0
            r1._deleteButton = r0
            super.dispose()
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.ProjectData r8) {
            r7 = this;
            java.lang.String r0 = "removeFromCacheTitle"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r0)
            super.initialize(r0)
            r7._projectDataRef = r8
            com.badlogic.gdx.scenes.scene2d.ui.Label r8 = new com.badlogic.gdx.scenes.scene2d.ui.Label
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "removeFromCacheInfo"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getWindowLabelStyle()
            r8.<init>(r1, r2)
            r8.setWrap(r0)
            r8.setAlignment(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r7.addContent(r8)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r1 = (float) r1
            r8.width(r1)
            r7.addContentRow()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r8 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getSmallPreviewImageButtonStyle()
            r8.<init>(r1)
            org.fortheloss.framework.ListCustomItemHeight r1 = new org.fortheloss.framework.ListCustomItemHeight
            com.badlogic.gdx.scenes.scene2d.ui.List$ListStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogListStyle()
            float r4 = r8.getHeight()
            int r5 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r5 = (float) r5
            float r6 = r8.getWidth()
            float r5 = r5 - r6
            r6 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r6
            r1.<init>(r2, r4, r5)
            r7._cachedMCsList = r1
            org.fortheloss.sticknodes.animationscreen.dialogs.EditCacheDialog$1 r2 = new org.fortheloss.sticknodes.animationscreen.dialogs.EditCacheDialog$1
            r2.<init>(r7)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane
            org.fortheloss.framework.ListCustomItemHeight<java.lang.String> r2 = r7._cachedMCsList
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane$ScrollPaneStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getDialogScrollPaneStyle()
            r1.<init>(r2, r4)
            r7._scrollPane = r1
            r1.setFadeScrollBars(r3)
            com.badlogic.gdx.scenes.scene2d.ui.ScrollPane r1 = r7._scrollPane
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r7.addContent(r1)
            int r2 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r2 = (float) r2
            float r8 = r8.getWidth()
            float r2 = r2 - r8
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r1.width(r2)
            int r1 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getListHeight()
            float r1 = (float) r1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r8 = r8.height(r1)
            r8.uniform(r3, r3)
            java.lang.String r8 = "okay"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.addButton(r8, r0)
            java.lang.String r8 = "remove"
            java.lang.String r8 = org.fortheloss.sticknodes.App.localize(r8)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r8 = r7.createTextButton(r8)
            r7._deleteButton = r8
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.addButton(r8, r0)
            r7.updateFiles()
            return
    }
}
