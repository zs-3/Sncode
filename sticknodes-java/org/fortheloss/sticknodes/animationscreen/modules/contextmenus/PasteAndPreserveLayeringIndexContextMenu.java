package org.fortheloss.sticknodes.animationscreen.modules.contextmenus;

/* loaded from: classes2.dex */
public class PasteAndPreserveLayeringIndexContextMenu extends org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu {
    private com.badlogic.gdx.scenes.scene2d.ui.Label _pasteIndexInfoLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _pasteIndexLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox _pasteStickfigureInCopiedIndexButton;
    private org.fortheloss.sticknodes.data.SessionData _sessionDataRef;


    /* renamed from: -$$Nest$monCheckboxClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m845$$Nest$monCheckboxClick(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu r0) {
            r0.onCheckboxClick()
            return
    }

    public PasteAndPreserveLayeringIndexContextMenu(org.fortheloss.sticknodes.data.SessionData r3, com.badlogic.gdx.scenes.scene2d.utils.Drawable r4) {
            r2 = this;
            r2.<init>(r4)
            r2._sessionDataRef = r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.defaults()
            r4 = 0
            r3.uniform(r4, r4)
            org.fortheloss.sticknodes.data.SessionData r3 = r2._sessionDataRef
            boolean r3 = r3.getNerdModeEnabled()
            r4 = 1
            if (r3 != 0) goto L3e
            java.lang.String r3 = "pasteInIndexInfo"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r4)
            r2._pasteIndexInfoLabel = r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            r0 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            int r0 = org.fortheloss.sticknodes.animationscreen.dialogs.DialogWrapper.getMaxDialogWidth()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            r3.width(r0)
            r2.row()
        L3e:
            java.lang.String r3 = "pasteInIndexLabel"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r3, r4)
            r2._pasteIndexLabel = r3
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            r4 = 16
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.align(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.fillX()
            r4 = 1128792064(0x43480000, float:200.0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r4
            r3.minWidth(r0)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCheckBoxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r3)
            r2._pasteStickfigureInCopiedIndexButton = r3
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu$1 r4 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PasteAndPreserveLayeringIndexContextMenu$1
            r4.<init>(r2)
            r3.addListener(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r2._pasteStickfigureInCopiedIndexButton
            org.fortheloss.sticknodes.data.SessionData r4 = r2._sessionDataRef
            boolean r4 = r4.getPasteWillTryToPreserveLayeringIndex()
            r3.setChecked(r4)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r2._pasteStickfigureInCopiedIndexButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            r4 = 8
            r3.align(r4)
            r2.pack()
            return
    }

    private void onCheckboxClick() {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2._sessionDataRef
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r1 = r2._pasteStickfigureInCopiedIndexButton
            boolean r1 = r1.isChecked()
            r0.setPasteWillTryToPreserveLayeringIndex(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._sessionDataRef = r0
            r1._pasteIndexInfoLabel = r0
            r1._pasteIndexLabel = r0
            r1._pasteStickfigureInCopiedIndexButton = r0
            super.dispose()
            return
    }

    public void update() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r2._pasteStickfigureInCopiedIndexButton
            org.fortheloss.sticknodes.data.SessionData r1 = r2._sessionDataRef
            boolean r1 = r1.getPasteWillTryToPreserveLayeringIndex()
            r0.setChecked(r1)
            return
    }
}
