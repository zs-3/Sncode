package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class UserChooseStickfigureToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _acceptButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _cancelButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _promptLabel;
    private org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter _prompterRef;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;
    private com.badlogic.gdx.scenes.scene2d.ui.Table mExtrasTable;




    /* renamed from: -$$Nest$fget_prompterRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter m1258$$Nest$fget_prompterRef(org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r0 = r0._prompterRef
            return r0
    }

    public UserChooseStickfigureToolTable(org.fortheloss.sticknodes.animationscreen.modules.Module r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public void addExtras(com.badlogic.gdx.scenes.scene2d.Actor[] r5) {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Table r0 = r4.mExtrasTable
            r0.clearChildren()
            r4.invalidate()
            if (r5 == 0) goto L1d
            r0 = 0
            int r1 = r5.length
        Lc:
            if (r0 >= r1) goto L1d
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r4.mExtrasTable
            r3 = r5[r0]
            r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Table r2 = r4.mExtrasTable
            r2.row()
            int r0 = r0 + 1
            goto Lc
        L1d:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._prompterRef = r0
            r1._titleLabel = r0
            r1._promptLabel = r0
            r1._acceptButton = r0
            r1._cancelButton = r0
            r1.mExtrasTable = r0
            super.dispose()
            return
    }

    public void endPrompt() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r0 = r2._prompterRef
            if (r0 == 0) goto L8
            r1 = 0
            r0.userChoseNode(r1)
        L8:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void initialize(com.badlogic.gdx.scenes.scene2d.utils.Drawable r4) {
            r3 = this;
            super.initialize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            java.lang.String r0 = ""
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1, r4)
            r3._titleLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r2 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r2)
            r4.fillX()
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r1, r4)
            r3._promptLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.colspan(r2)
            r4.fillX()
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getApplyButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r0, r4)
            r3._acceptButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable$1
            r1.<init>(r3)
            r4.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._acceptButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r1 = 16
            r4.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r4 = org.fortheloss.sticknodes.animationscreen.modules.Module.getCancelButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r0, r4)
            r3._cancelButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable$2
            r0.<init>(r3)
            r4.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r4 = r3._cancelButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r0 = 8
            r4.align(r0)
            r3.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            r3.mExtrasTable = r4
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r4.setTouchable(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r3.mExtrasTable
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable$3 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserChooseStickfigureToolTable$3
            r0.<init>(r3)
            r4.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Table r4 = r3.mExtrasTable
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            r4.colspan(r2)
            return
    }

    public void setMessage(java.lang.String r1, java.lang.String r2, org.fortheloss.sticknodes.animationscreen.INodeChoosePrompter r3) {
            r0 = this;
            r0._prompterRef = r3
            com.badlogic.gdx.scenes.scene2d.ui.Label r3 = r0._titleLabel
            r3.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r1 = r0._promptLabel
            r1.setText(r2)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r0 = this;
            return
    }
}
