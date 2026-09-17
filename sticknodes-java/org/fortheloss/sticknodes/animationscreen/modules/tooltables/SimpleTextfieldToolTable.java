package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class SimpleTextfieldToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _addTextfieldButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _pasteTextfieldButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;



    /* renamed from: -$$Nest$monAddTextfieldClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1161$$Nest$monAddTextfieldClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable r0) {
            r0.onAddTextfieldClick()
            return
    }

    /* renamed from: -$$Nest$monPasteTextfieldClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1162$$Nest$monPasteTextfieldClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable r0) {
            r0.onPasteTextfieldClick()
            return
    }

    public SimpleTextfieldToolTable(org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onAddTextfieldClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.addTextfield()
            return
    }

    private void onPasteTextfieldClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r1._animationToolsModuleRef
            r0.pasteTextfield()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._titleLabel = r0
            r1._addTextfieldButton = r0
            r1._pasteTextfieldButton = r0
            super.dispose()
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r2, com.badlogic.gdx.scenes.scene2d.utils.Drawable r3) {
            r1 = this;
            super.initialize(r3)
            java.lang.String r2 = "textfieldTools"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r0 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r2, r0, r3)
            r1._titleLabel = r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r2)
            r3 = 2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r2.colspan(r3)
            r2.fillX()
            r1.row()
            java.lang.String r2 = "addTextfield"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r2, r3)
            r1._addTextfieldButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable$1 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable$1
            r3.<init>(r1)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1._addTextfieldButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r2)
            r3 = 16
            r2.align(r3)
            java.lang.String r2 = "pasteTextfield"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getNormalButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r2, r3)
            r1._pasteTextfieldButton = r2
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable$2 r3 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.SimpleTextfieldToolTable$2
            r3.<init>(r1)
            r2.addListener(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r2 = r1._pasteTextfieldButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r1.add(r2)
            r3 = 8
            r2.align(r3)
            r1.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r3 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r3.mSessionDataRef
            org.fortheloss.sticknodes.TextfieldBox r0 = r0.getCopiedTextfield()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L19
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._pasteTextfieldButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._pasteTextfieldButton
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            goto L25
        L19:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._pasteTextfieldButton
            com.badlogic.gdx.scenes.scene2d.Touchable r2 = com.badlogic.gdx.scenes.scene2d.Touchable.enabled
            r0.setTouchable(r2)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r0 = r3._pasteTextfieldButton
            r0.setColor(r1, r1, r1, r1)
        L25:
            return
    }
}
