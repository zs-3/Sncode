package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class JumpToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _downButton;
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _memoryButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton _upButton;




    /* renamed from: -$$Nest$fget_animationScreenRef, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.fortheloss.sticknodes.animationscreen.AnimationScreen m987$$Nest$fget_animationScreenRef(org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0) {
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r0._animationScreenRef
            return r0
    }

    /* renamed from: -$$Nest$monJumpClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m988$$Nest$monJumpClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable r0, int r1) {
            r0.onJumpClick(r1)
            return
    }

    public JumpToolTable(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0._animationScreenRef = r1
            return
    }

    public JumpToolTable(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0._animationScreenRef = r1
            return
    }

    public JumpToolTable(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1, org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r2, org.fortheloss.sticknodes.data.ProjectData r3, org.fortheloss.sticknodes.data.SessionData r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0._animationScreenRef = r1
            return
    }

    private void onJumpClick(int r3) {
            r2 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r2.mSessionDataRef
            int r0 = r0.getScreen()
            if (r0 != 0) goto Le
            org.fortheloss.sticknodes.animationscreen.modules.AnimateToolsModule r0 = r2._animationToolsModuleRef
            r0.jumpToNextSubmenu(r3)
            goto L2b
        Le:
            org.fortheloss.sticknodes.data.SessionData r0 = r2.mSessionDataRef
            int r0 = r0.getScreen()
            r1 = 1
            if (r0 != r1) goto L1d
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r2._creationToolsModuleRef
            r0.jumpToNextSubmenu(r3)
            goto L2b
        L1d:
            org.fortheloss.sticknodes.data.SessionData r0 = r2.mSessionDataRef
            int r0 = r0.getScreen()
            r1 = 2
            if (r0 != r1) goto L2b
            org.fortheloss.sticknodes.animationscreen.modules.MovieclipToolsModule r0 = r2._movieclipToolsModuleRef
            r0.jumpToNextSubmenu(r3)
        L2b:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._memoryButton = r0
            r1._downButton = r0
            r1._upButton = r0
            super.dispose()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void initialize(com.badlogic.gdx.scenes.scene2d.utils.Drawable r3) {
            r2 = this;
            super.initialize(r3)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortLargeButtonStyle()
            java.lang.String r0 = "(?)"
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r0, r3)
            r2._memoryButton = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable$1 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable$1
            r0.<init>(r2)
            r3.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r3 = r2._memoryButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r3.expandX()
            r0 = 2
            r3.colspan(r0)
            r2.row()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortJumpArrowUpButtonStyle()
            java.lang.String r0 = ""
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r0, r3)
            r2._upButton = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable$2 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable$2
            r1.<init>(r2)
            r3.addListener(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r2._upButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            r1 = 16
            r3.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton$ImageTextButtonStyle r3 = org.fortheloss.sticknodes.animationscreen.modules.Module.getShortJumpArrowDownButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageTextButton(r0, r3)
            r2._downButton = r3
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable$3 r0 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.JumpToolTable$3
            r0.<init>(r2)
            r3.addListener(r0)
            com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton r3 = r2._downButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r3 = r2.add(r3)
            r0 = 8
            r3.align(r0)
            r2.pack()
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r7 = this;
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            int r0 = r0.getMode()
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 3
            if (r0 != r2) goto L17
            r0 = 1056964608(0x3f000000, float:0.5)
            r7.setColor(r1, r1, r1, r0)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r7.setTouchable(r0)
            goto L92
        L17:
            r7.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r7.setTouchable(r0)
            org.fortheloss.sticknodes.data.SessionData r0 = r7.mSessionDataRef
            org.fortheloss.sticknodes.data.SessionMemoryData r0 = r0.getMemoryData()
            if (r0 == 0) goto L92
            long r1 = r0.numSpritePixels
            int r0 = r0.memoryMB
            r3 = 10000000(0x989680, double:4.9406565E-317)
            java.lang.String r5 = " (!!!)"
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L65
            r3 = 20000000(0x1312d00, double:9.881313E-317)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L3e
            java.lang.String r5 = " (!)"
            goto L67
        L3e:
            r3 = 40000000(0x2625a00, double:1.9762626E-316)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L48
            java.lang.String r5 = " (!!)"
            goto L67
        L48:
            r3 = 60000000(0x3938700, double:2.96439388E-316)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L50
            goto L67
        L50:
            r3 = 80000000(0x4c4b400, double:3.95252517E-316)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L58
            goto L67
        L58:
            r3 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L62
            java.lang.String r5 = " (!!!!)"
            goto L67
        L62:
            java.lang.String r5 = " >:("
            goto L67
        L65:
            java.lang.String r5 = ""
        L67:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r1 = r7._memoryButton
            java.lang.String r2 = "memory"
            java.lang.String r2 = org.fortheloss.sticknodes.App.localize(r2)
            java.lang.String r3 = "mb"
            java.lang.String r3 = org.fortheloss.sticknodes.App.localize(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = ": "
            r4.append(r2)
            r4.append(r0)
            r4.append(r3)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            r1.setText(r0)
        L92:
            return
    }
}
