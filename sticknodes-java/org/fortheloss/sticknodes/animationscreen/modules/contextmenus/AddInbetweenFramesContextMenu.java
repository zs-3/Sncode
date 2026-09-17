package org.fortheloss.sticknodes.animationscreen.modules.contextmenus;

/* loaded from: classes2.dex */
public class AddInbetweenFramesContextMenu extends org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu {
    private com.badlogic.gdx.scenes.scene2d.ui.TextButton _addInbetweenFramesButton;
    private com.badlogic.gdx.scenes.scene2d.ui.Label _addInbetweenFramesLabel;
    private org.fortheloss.framework.RepeatingTextButton _decrementFramesToAddButton;
    private org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable _frameToolTableRef;
    private org.fortheloss.framework.RepeatingTextButton _incrementFramesToAddButton;
    private int _numFramesToAdd;






    /* renamed from: -$$Nest$monAddInbetweenFrames, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m840$$Nest$monAddInbetweenFrames(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu r0) {
            r0.onAddInbetweenFrames()
            return
    }

    /* renamed from: -$$Nest$monIncrementInbetweenFrames, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m841$$Nest$monIncrementInbetweenFrames(org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu r0, int r1) {
            r0.onIncrementInbetweenFrames(r1)
            return
    }

    public AddInbetweenFramesContextMenu(org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r6, com.badlogic.gdx.scenes.scene2d.utils.Drawable r7) {
            r5 = this;
            r5.<init>(r7)
            r7 = 3
            r5._numFramesToAdd = r7
            r5._frameToolTableRef = r6
            java.lang.String r6 = "addInbetweenFrames"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Label$LabelStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getToolsLabelStyle()
            r1 = 1
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r6, r1, r0)
            r5._addInbetweenFramesLabel = r6
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.fillX()
            r0 = 2
            r6.colspan(r0)
            r5.row()
            java.lang.String r6 = "frames"
            java.lang.String r6 = org.fortheloss.sticknodes.App.localize(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "3 "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r2 = org.fortheloss.sticknodes.animationscreen.modules.Module.getLargeButtonStyle()
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolTextButton(r6, r2)
            r5._addInbetweenFramesButton = r6
            r5._numFramesToAdd = r7
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$1 r7 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$1
            r7.<init>(r5)
            r6.addListener(r7)
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r6 = r5._addInbetweenFramesButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.align(r1)
            r6.colspan(r0)
            r5.row()
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$2 r6 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$2
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r0 = "-"
            r2 = 1045220557(0x3e4ccccd, float:0.2)
            r6.<init>(r5, r0, r7, r2)
            r5._decrementFramesToAddButton = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r6.getLabel()
            r6.setWrap(r1)
            org.fortheloss.framework.RepeatingTextButton r6 = r5._decrementFramesToAddButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r6.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.getCell(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1082130432(0x40800000, float:4.0)
            float r3 = r7 * r0
            float r7 = r7 * r0
            r4 = 0
            r6.pad(r4, r3, r4, r7)
            org.fortheloss.framework.RepeatingTextButton r6 = r5._decrementFramesToAddButton
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$3 r7 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$3
            r7.<init>(r5)
            r6.addListener(r7)
            org.fortheloss.framework.RepeatingTextButton r6 = r5._decrementFramesToAddButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            r7 = 8
            r6.align(r7)
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$4 r6 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$4
            com.badlogic.gdx.scenes.scene2d.ui.TextButton$TextButtonStyle r7 = org.fortheloss.sticknodes.animationscreen.modules.Module.getIncrementButtonStyle()
            java.lang.String r3 = "+"
            r6.<init>(r5, r3, r7, r2)
            r5._incrementFramesToAddButton = r6
            com.badlogic.gdx.scenes.scene2d.ui.Label r6 = r6.getLabel()
            r6.setWrap(r1)
            org.fortheloss.framework.RepeatingTextButton r6 = r5._incrementFramesToAddButton
            com.badlogic.gdx.scenes.scene2d.ui.Label r7 = r6.getLabel()
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r6.getCell(r7)
            float r7 = org.fortheloss.sticknodes.App.assetScaling
            float r1 = r7 * r0
            float r7 = r7 * r0
            r6.pad(r4, r1, r4, r7)
            org.fortheloss.framework.RepeatingTextButton r6 = r5._incrementFramesToAddButton
            org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$5 r7 = new org.fortheloss.sticknodes.animationscreen.modules.contextmenus.AddInbetweenFramesContextMenu$5
            r7.<init>(r5)
            r6.addListener(r7)
            org.fortheloss.framework.RepeatingTextButton r6 = r5._incrementFramesToAddButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r6 = r5.add(r6)
            r7 = 16
            r6.align(r7)
            r5.pack()
            return
    }

    private void onAddInbetweenFrames() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.FrameToolTable r0 = r2._frameToolTableRef
            int r1 = r2._numFramesToAdd
            r0.onAddInbetweenFrames(r1)
            return
    }

    private void onIncrementInbetweenFrames(int r4) {
            r3 = this;
            int r0 = r3._numFramesToAdd
            int r0 = r0 + r4
            r3._numFramesToAdd = r0
            r4 = 3
            if (r0 >= r4) goto Lb
            r3._numFramesToAdd = r4
            goto L11
        Lb:
            r4 = 60
            if (r0 <= r4) goto L11
            r3._numFramesToAdd = r4
        L11:
            com.badlogic.gdx.scenes.scene2d.ui.TextButton r4 = r3._addInbetweenFramesButton
            int r0 = r3._numFramesToAdd
            java.lang.String r1 = "frames"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r4.setText(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.contextmenus.ContextMenu, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._frameToolTableRef = r0
            r1._addInbetweenFramesLabel = r0
            r1._addInbetweenFramesButton = r0
            r1._decrementFramesToAddButton = r0
            r1._incrementFramesToAddButton = r0
            super.dispose()
            return
    }
}
