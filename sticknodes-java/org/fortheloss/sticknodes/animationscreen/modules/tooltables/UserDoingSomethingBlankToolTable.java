package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class UserDoingSomethingBlankToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _cancelAndSaveButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _cancelButton;
    private java.lang.String _message;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _promptLabel;
    private java.lang.String _title;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _titleLabel;



    /* renamed from: -$$Nest$monCancelAndSaveClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1259$$Nest$monCancelAndSaveClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable r0) {
            r0.onCancelAndSaveClick()
            return
    }

    /* renamed from: -$$Nest$monCancelClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1260$$Nest$monCancelClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable r0) {
            r0.onCancelClick()
            return
    }

    public UserDoingSomethingBlankToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    private void onCancelAndSaveClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            r1 = 1
            r0.cancelTestingSmartStretch(r1)
            return
    }

    private void onCancelClick() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            r1 = 0
            r0.cancelTestingSmartStretch(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._titleLabel = r0
            r1._promptLabel = r0
            r1._cancelButton = r0
            r1._cancelAndSaveButton = r0
            r1._title = r0
            r1._message = r0
            super.dispose()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void initialize(com.badlogic.gdx.scenes.scene2d.utils.Drawable r4) {
            r3 = this;
            super.initialize(r4)
            java.lang.String r4 = ""
            r3._title = r4
            r3._message = r4
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsTitleLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r1, r0)
            r3._titleLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r4.fillX()
            r3.row()
            java.lang.String r4 = r3._message
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            com.badlogic.gdx.scenes.scene2d.ui.Label r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r4, r1, r0)
            r3._promptLabel = r4
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.fillX()
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            r2 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r2
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r4.padLeft(r0)
            float r0 = org.fortheloss.sticknodes.App.assetScaling
            float r0 = r0 * r2
            r4.padRight(r0)
            r3.row()
            java.lang.String r4 = "cancel"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r4, r0)
            r3._cancelButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable$1
            r0.<init>(r3)
            r4.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._cancelButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r4.align(r1)
            r3.row()
            java.lang.String r4 = "cancelKeepChanges"
            java.lang.String r4 = org.fortheloss.sticknodes.App.localize(r4)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r4, r0)
            r3._cancelAndSaveButton = r4
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable$2 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.UserDoingSomethingBlankToolTable$2
            r0.<init>(r3)
            r4.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._cancelAndSaveButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r4 = r3.add(r4)
            r4.align(r1)
            return
    }

    public void setMessage(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0._title = r1
            r0._message = r2
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._titleLabel
            java.lang.String r1 = r2._title
            r0.setText(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._promptLabel
            java.lang.String r1 = r2._message
            r0.setText(r1)
            return
    }
}
