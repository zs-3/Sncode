package org.fortheloss.sticknodes.animationscreen.modules.tooltables;

/* loaded from: classes2.dex */
public class PermanentCreationToolTable extends org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable {
    private com.badlogic.gdx.scenes.scene2d.ui.Label _infoLabel;
    private int _nodeCount;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _redoButton;
    private com.badlogic.gdx.scenes.scene2d.ui.ImageButton _undoButton;
    private int _zoom;



    /* renamed from: -$$Nest$monRedoClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1065$$Nest$monRedoClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r0) {
            r0.onRedoClick()
            return
    }

    /* renamed from: -$$Nest$monUndoClick, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1066$$Nest$monUndoClick(org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable r0) {
            r0.onUndoClick()
            return
    }

    public PermanentCreationToolTable(org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r1, org.fortheloss.sticknodes.data.ProjectData r2, org.fortheloss.sticknodes.data.SessionData r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 0
            r0._zoom = r1
            r0._nodeCount = r1
            return
    }

    private void onRedoClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.redo()
            return
    }

    private void onUndoClick() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.modules.CreateToolsModule r0 = r1._creationToolsModuleRef
            r0.undo()
            return
    }

    private void setInfoLabel() {
            r4 = this;
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r4._infoLabel
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4._zoom
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r4._nodeCount
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            r2 = 400(0x190, float:5.6E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "zoomNodeCount"
            java.lang.String r1 = org.fortheloss.sticknodes.App.localize(r2, r1)
            r0.setText(r1)
            return
    }

    public void disable() {
            r3 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._undoButton
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r3._redoButton
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r3._infoLabel
            r0.setColor(r1, r1, r1, r2)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.disabled
            r3.setTouchable(r0)
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._undoButton = r0
            r1._redoButton = r0
            r1._infoLabel = r0
            super.dispose()
            return
    }

    public void enable() {
            r2 = this;
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r2._undoButton
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r2._redoButton
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = r2._infoLabel
            r0.setColor(r1, r1, r1, r1)
            com.badlogic.gdx.scenes.scene2d.Touchable r0 = com.badlogic.gdx.scenes.scene2d.Touchable.childrenOnly
            r2.setTouchable(r0)
            return
    }

    public void initialize(com.badlogic.gdx.graphics.g2d.TextureAtlas r5, com.badlogic.gdx.scenes.scene2d.utils.Drawable r6) {
            r4 = this;
            super.initialize(r6)
            r5 = 2
            r4.align(r5)
            org.fortheloss.sticknodes.data.SessionData r6 = r4.mSessionDataRef
            boolean r6 = r6.getIsLeftHandMode()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r0 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalUndoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r0)
            r4._undoButton = r0
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable$1 r1 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable$1
            r1.<init>(r4)
            r0.addListener(r1)
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 16
            if (r6 != 0) goto L3b
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r4._undoButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r4._undoButton
            float r2 = r2.getHeight()
            float r2 = r2 * r0
            r1.height(r2)
            goto L44
        L3b:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r4._undoButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.add(r2)
            r2.align(r1)
        L44:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton$ImageButtonStyle r1 = org.fortheloss.sticknodes.animationscreen.modules.Module.getImageTextButtonNormalRedoStyle()
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r1 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolImageButton(r1)
            r4._redoButton = r1
            org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable$2 r2 = new org.fortheloss.sticknodes.animationscreen.modules.tooltables.PermanentCreationToolTable$2
            r2.<init>(r4)
            r1.addListener(r2)
            r1 = 8
            if (r6 != 0) goto L70
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r4._redoButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r2 = r4.add(r2)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r1 = r2.align(r1)
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r2 = r4._redoButton
            float r2 = r2.getHeight()
            float r2 = r2 * r0
            r1.height(r2)
            goto L79
        L70:
            com.badlogic.gdx.scenes.scene2d.ui.ImageButton r0 = r4._redoButton
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.add(r0)
            r0.align(r1)
        L79:
            r4.row()
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 1
            r0[r3] = r2
            r2 = 400(0x190, float:5.6E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "zoomNodeCount"
            java.lang.String r0 = org.fortheloss.sticknodes.App.localize(r2, r0)
            com.badlogic.gdx.scenes.scene2d.ui.Label r0 = org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable.createToolLabel(r0, r3)
            r4._infoLabel = r0
            com.badlogic.gdx.scenes.scene2d.ui.Cell r0 = r4.add(r0)
            com.badlogic.gdx.scenes.scene2d.ui.Cell r5 = r0.colspan(r5)
            r5.fillX()
            r4.pack()
            if (r6 == 0) goto Lc6
            float r5 = r4.getHeight()
            float r6 = org.fortheloss.sticknodes.App.assetScaling
            r0 = 1135345664(0x43ac0000, float:344.0)
            float r2 = r6 * r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto Lc6
            float r6 = r6 * r0
            r4.setHeight(r6)
        Lc6:
            r4._zoom = r1
            r4._nodeCount = r3
            return
    }

    public void setNodeCount(int r2) {
            r1 = this;
            r1._nodeCount = r2
            if (r2 >= 0) goto L8
            r2 = 0
            r1._nodeCount = r2
            goto Le
        L8:
            r0 = 400(0x190, float:5.6E-43)
            if (r2 <= r0) goto Le
            r1._nodeCount = r0
        Le:
            return
    }

    public void setZoom(float r2) {
            r1 = this;
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            r1._zoom = r2
            r0 = 30
            if (r2 >= r0) goto Le
            r1._zoom = r0
            goto L14
        Le:
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 <= r0) goto L14
            r1._zoom = r0
        L14:
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.modules.tooltables.ToolTable
    public void update() {
            r0 = this;
            r0.setInfoLabel()
            return
    }
}
