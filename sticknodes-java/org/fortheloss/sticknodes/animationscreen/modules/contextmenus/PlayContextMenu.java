package org.fortheloss.sticknodes.animationscreen.modules.contextmenus;

/* loaded from: classes2.dex */
public class PlayContextMenu extends org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu {
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mCheckboxFrame1;
    private com.badlogic.gdx.scenes.scene2d.ui.CheckBox mCheckboxStartFrame;
    private org.fortheloss.framework.LabelInputIncrementField mFieldEndFrame;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule mFramesModuleRef;
    private org.fortheloss.sticknodes.data.SessionData mSessionDataRef;






    /* renamed from: -$$Nest$fgetmCheckboxFrame1, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.badlogic.gdx.scenes.scene2d.ui.CheckBox m846$$Nest$fgetmCheckboxFrame1(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu r0) {
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r0.mCheckboxFrame1
            return r0
    }

    /* renamed from: -$$Nest$msetPlaybackEndFrame, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m847$$Nest$msetPlaybackEndFrame(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu r0, int r1) {
            r0.setPlaybackEndFrame(r1)
            return
    }

    /* renamed from: -$$Nest$msetPlaybackStartFrame, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m848$$Nest$msetPlaybackStartFrame(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu r0, int r1) {
            r0.setPlaybackStartFrame(r1)
            return
    }

    public PlayContextMenu(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r13, com.badlogic.gdx.scenes.scene2d.utils.Drawable r14) {
            r12 = this;
            r12.<init>(r14)
            r14 = 1137180672(0x43c80000, float:400.0)
            r12.setWidth(r14)
            r12.mFramesModuleRef = r13
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r13 = r13.getContext()
            org.fortheloss.sticknodes.data.SessionData r13 = r13.getSessionData()
            r12.mSessionDataRef = r13
            java.lang.String r13 = "loopTo"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            r14 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r0 = 2
            r13.colspan(r0)
            r12.row()
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 0
            r13[r2] = r1
            java.lang.String r1 = "frameNum"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r1, r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r13.align(r14)
            java.lang.String r13 = "startFrame2"
            java.lang.String r13 = org.fortheloss.sticknodes.App.localize(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Label r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r13, r14)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r13.align(r14)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r13)
            r12.mCheckboxFrame1 = r13
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$1
            r1.<init>(r12)
            r13.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r12.mCheckboxFrame1
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            r13.align(r14)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox$CheckBoxStyle r13 = org.fortheloss.sticknodes.animationscreen.modules.Module.getRadioCheckboxStyle()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolCheckbox(r13)
            r12.mCheckboxStartFrame = r13
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$2
            r1.<init>(r12)
            r13.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r13 = r12.mCheckboxStartFrame
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            r13.align(r14)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup r13 = new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup
            r13.<init>()
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox[] r1 = new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[r0]
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mCheckboxFrame1
            r1[r2] = r3
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r3 = r12.mCheckboxStartFrame
            r1[r14] = r3
            r13.add(r1)
            org.fortheloss.framework.LabelInputIncrementField r13 = new org.fortheloss.framework.LabelInputIncrementField
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r12.mFramesModuleRef
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r1.getContext()
            java.lang.String r1 = "endFrame"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.String r7 = "0"
            r8 = 5
            r9 = 0
            r10 = 1203982208(0x47c34f80, float:99999.0)
            r11 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.mFieldEndFrame = r13
            r13.setIncrementButtonVisibilityPermanent(r14)
            org.fortheloss.framework.LabelInputIncrementField r13 = r12.mFieldEndFrame
            r13.setIncrementType(r2)
            org.fortheloss.framework.LabelInputIncrementField r13 = r12.mFieldEndFrame
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$3 r14 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$3
            r14.<init>(r12)
            r13.setFieldListener(r14)
            org.fortheloss.framework.LabelInputIncrementField r13 = r12.mFieldEndFrame
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r12.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.fillX()
            r13.colspan(r0)
            r12.row()
            com.badlogic.gdx.scenes.scene2d.ui.Table r13 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createTable()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r13.defaults()
            r14.uniform(r2, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r12.add(r13)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.colspan(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r14 = r14.expandX()
            r14.fillX()
            r12.row()
            java.lang.String r14 = "resetAll"
            java.lang.String r14 = org.fortheloss.sticknodes.App.localize(r14)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonLargeUndoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r14 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r14, r0)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$4 r0 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$4
            r0.<init>(r12)
            r14.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r13.add(r14)
            float r1 = r14.getWidth()
            r2 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r2
            r0.width(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = new com.badlogic.gdx.scenes.scene2d.ui.ImageButton
            org.fortheloss.sticknodes.ImageButtonLongPress$ImageButtonLongPressStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getPlayButtonLongPressStyle()
            r0.<init>(r1)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$5 r1 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.PlayContextMenu$5
            r1.<init>(r12)
            r0.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r13 = r13.add(r0)
            float r14 = r14.getWidth()
            r0 = 1048576000(0x3e800000, float:0.25)
            float r14 = r14 * r0
            r13.width(r14)
            r12.update()
            r12.pack()
            return
    }

    private void setPlaybackEndFrame(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1.mFramesModuleRef
            r0.setPlaybackEndFrame(r2)
            org.fortheloss.framework.LabelInputIncrementField r2 = r1.mFieldEndFrame
            org.fortheloss.sticknodes.data.SessionData r0 = r1.mSessionDataRef
            int r0 = r0.getPlaybackEndFrame()
            float r0 = (float) r0
            r2.setValue(r0)
            return
    }

    private void setPlaybackStartFrame(int r2) {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r1.mFramesModuleRef
            r0.setPlaybackStartFrame(r2)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r2 = r1.mCheckboxFrame1
            org.fortheloss.sticknodes.data.SessionData r0 = r1.mSessionDataRef
            int r0 = r0.getPlaybackStartFrame()
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            r2.setChecked(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2.mFramesModuleRef = r0
            r2.mSessionDataRef = r0
            r2.mCheckboxFrame1 = r0
            r2.mCheckboxStartFrame = r0
            org.fortheloss.framework.LabelInputIncrementField r1 = r2.mFieldEndFrame
            if (r1 == 0) goto L12
            r1.dispose()
            r2.mFieldEndFrame = r0
        L12:
            super.dispose()
            return
    }

    protected void onPlayClick() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu
    public void show(com.badlogic.gdx.scenes.scene2d.Actor r1, com.badlogic.gdx.scenes.scene2d.Stage r2, int r3) {
            r0 = this;
            r0.update()
            super.show(r1, r2, r3)
            return
    }

    public void update() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4.mCheckboxFrame1
            org.fortheloss.sticknodes.data.SessionData r1 = r4.mSessionDataRef
            int r1 = r1.getPlaybackStartFrame()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r0.setChecked(r1)
            com.badlogic.gdx.scenes.scene2d.ui.CheckBox r0 = r4.mCheckboxStartFrame
            org.fortheloss.sticknodes.data.SessionData r1 = r4.mSessionDataRef
            int r1 = r1.getPlaybackStartFrame()
            if (r1 != r3) goto L1d
            r2 = 1
        L1d:
            r0.setChecked(r2)
            org.fortheloss.framework.LabelInputIncrementField r0 = r4.mFieldEndFrame
            org.fortheloss.sticknodes.data.SessionData r1 = r4.mSessionDataRef
            int r1 = r1.getPlaybackEndFrame()
            float r1 = (float) r1
            r0.setValue(r1)
            return
    }
}
