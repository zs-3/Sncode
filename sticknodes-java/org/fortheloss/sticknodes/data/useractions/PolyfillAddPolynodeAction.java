package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class PolyfillAddPolynodeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.stickfigure.StickNode _addedPolyNodeRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode _polyAnchorRef;

    public PolyfillAddPolynodeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
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
            r1._addedPolyNodeRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r1, org.fortheloss.sticknodes.stickfigure.StickNode r2) {
            r0 = this;
            r0._addedPolyNodeRef = r1
            r0._polyAnchorRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._polyAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._addedPolyNodeRef
            r0.addPolynodeChild(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._addedPolyNodeRef
            r0.onUndoRedoPolyfillAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._polyAnchorRef = r0
            r1._addedPolyNodeRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._polyAnchorRef
            r0.removeLastPolynodeChild()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._polyAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getLastPolynodeInPolyfill()
            r0.onUndoRedoPolyfillAction(r1)
            return
    }
}
