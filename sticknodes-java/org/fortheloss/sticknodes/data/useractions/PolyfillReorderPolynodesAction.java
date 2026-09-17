package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class PolyfillReorderPolynodesAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _afterOrder;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _beforeOrder;
    private org.fortheloss.sticknodes.stickfigure.StickNode _polyAnchorRef;

    public PolyfillReorderPolynodesAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>()
            r0._animationScreenRef = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._polyAnchorRef = r0
            r1._beforeOrder = r0
            r1._afterOrder = r0
            return
    }

    public org.fortheloss.sticknodes.stickfigure.StickNode getPolyAnchor() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r1._polyAnchorRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r5) {
            r4 = this;
            r4._polyAnchorRef = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4._beforeOrder = r5
            org.fortheloss.sticknodes.stickfigure.StickNode r5 = r4._polyAnchorRef
            java.util.ArrayList r5 = r5.getPolynodeChildren()
            int r0 = r5.size()
            r1 = 0
        L14:
            if (r1 >= r0) goto L24
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r4._beforeOrder
            java.lang.Object r3 = r5.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = (org.fortheloss.sticknodes.stickfigure.StickNode) r3
            r2.add(r3)
            int r1 = r1 + 1
            goto L14
        L24:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._polyAnchorRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r2._afterOrder
            r0.polyfillSetPolynodesOrder(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._polyAnchorRef
            r0.onUndoRedoPolyfillAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._polyAnchorRef = r0
            r1._beforeOrder = r0
            r1._afterOrder = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r5._afterOrder
            if (r0 != 0) goto L26
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5._afterOrder = r0
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._polyAnchorRef
            java.util.ArrayList r0 = r0.getPolynodeChildren()
            r1 = 0
            int r2 = r0.size()
        L16:
            if (r1 >= r2) goto L26
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r3 = r5._afterOrder
            java.lang.Object r4 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            r3.add(r4)
            int r1 = r1 + 1
            goto L16
        L26:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r5._polyAnchorRef
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r5._beforeOrder
            r0.polyfillSetPolynodesOrder(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r5._polyAnchorRef
            r0.onUndoRedoPolyfillAction(r1)
            return
    }
}
