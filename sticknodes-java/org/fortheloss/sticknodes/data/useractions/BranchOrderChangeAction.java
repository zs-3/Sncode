package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class BranchOrderChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.animationscreen.modules.CanvasModule _canvasModuleRef;
    private java.util.ArrayList<java.lang.Integer> _drawOrdersAfter;
    private java.util.ArrayList<java.lang.Integer> _drawOrdersBefore;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureRef;

    public BranchOrderChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>()
            r0._animationScreenRef = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._stickfigureRef = r0
            r2._canvasModuleRef = r0
            java.util.ArrayList<java.lang.Integer> r1 = r2._drawOrdersBefore
            if (r1 == 0) goto Le
            r1.clear()
        Le:
            r2._drawOrdersBefore = r0
            java.util.ArrayList<java.lang.Integer> r1 = r2._drawOrdersAfter
            if (r1 == 0) goto L17
            r1.clear()
        L17:
            r2._drawOrdersAfter = r0
            return
    }

    public java.util.ArrayList<java.lang.Integer> getDrawOrdersBeforeList() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1._drawOrdersBefore
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r2, org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r3) {
            r1 = this;
            r1._stickfigureRef = r2
            r1._canvasModuleRef = r3
            java.util.ArrayList<java.lang.Integer> r3 = r1._drawOrdersBefore
            if (r3 != 0) goto L11
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 400(0x190, float:5.6E-43)
            r3.<init>(r0)
            r1._drawOrdersBefore = r3
        L11:
            java.util.ArrayList<java.lang.Integer> r3 = r1._drawOrdersBefore
            r2.getAllNodeDrawOrderIndices(r3)
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            java.util.ArrayList<java.lang.Integer> r1 = r2._drawOrdersAfter
            r0.drawAllNodesAt(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            r0.setNeedsToBeDrawn()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._stickfigureRef = r0
            r1._canvasModuleRef = r0
            java.util.ArrayList<java.lang.Integer> r0 = r1._drawOrdersBefore
            if (r0 == 0) goto Lc
            r0.clear()
        Lc:
            java.util.ArrayList<java.lang.Integer> r0 = r1._drawOrdersAfter
            if (r0 == 0) goto L13
            r0.clear()
        L13:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r2._drawOrdersAfter
            if (r0 != 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 400(0x190, float:5.6E-43)
            r0.<init>(r1)
            r2._drawOrdersAfter = r0
        Ld:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            java.util.ArrayList<java.lang.Integer> r1 = r2._drawOrdersAfter
            r0.getAllNodeDrawOrderIndices(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            java.util.ArrayList<java.lang.Integer> r1 = r2._drawOrdersBefore
            r0.drawAllNodesAt(r1)
            org.fortheloss.sticknodes.animationscreen.modules.CanvasModule r0 = r2._canvasModuleRef
            r0.setNeedsToBeDrawn()
            return
    }
}
