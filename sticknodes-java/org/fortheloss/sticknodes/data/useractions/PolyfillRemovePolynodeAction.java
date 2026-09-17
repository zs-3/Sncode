package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class PolyfillRemovePolynodeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _index;
    private org.fortheloss.sticknodes.stickfigure.StickNode _polyAnchorRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode _removedPolyNodeRef;

    public PolyfillRemovePolynodeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1._index = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._polyAnchorRef = r0
            r1._removedPolyNodeRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r1, int r2, org.fortheloss.sticknodes.stickfigure.StickNode r3) {
            r0 = this;
            r0._removedPolyNodeRef = r1
            r0._polyAnchorRef = r3
            r0._index = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._polyAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._removedPolyNodeRef
            r0.removePolynodeChild(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._polyAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getLastPolynodeInPolyfill()
            r0.onUndoRedoPolyfillAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._polyAnchorRef = r0
            r1._removedPolyNodeRef = r0
            r0 = -1
            r1._index = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._polyAnchorRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._removedPolyNodeRef
            int r2 = r3._index
            r0.addPolynodeChild(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._removedPolyNodeRef
            r0.onUndoRedoPolyfillAction(r1)
            return
    }
}
