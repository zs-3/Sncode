package org.fortheloss.sticknodes.animationscreen.modules.contextmenus;

/* loaded from: classes2.dex */
public class DeleteStickfigureContextMenu extends org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu {
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _deleteButton;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable _stickfigureToolTableRef;


    /* renamed from: -$$Nest$monDeleteClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m842$$Nest$monDeleteClick(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu r0) {
            r0.onDeleteClick()
            return
    }

    public DeleteStickfigureContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r1, com.badlogic.gdx.scenes.scene2d.utils.Drawable r2) {
            r0 = this;
            r0.<init>(r2)
            r0._stickfigureToolTableRef = r1
            java.lang.String r1 = "deleteStickfigureAndJoins"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeDeleteButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton2(r1, r2)
            r0._deleteButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu$1 r2 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.DeleteStickfigureContextMenu$1
            r2.<init>(r0)
            r1.addListener(r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r1 = r0._deleteButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r0.add(r1)
            r2 = 1
            r1.align(r2)
            r0.pack()
            return
    }

    private void onDeleteClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.StickfigureToolTable r0 = r1._stickfigureToolTableRef
            r0.onDeleteStickfigureWithJoinsClick()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._stickfigureToolTableRef = r0
            r1._deleteButton = r0
            super.dispose()
            return
    }
}
