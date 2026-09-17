package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class PolyfillConvertAnchorAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode _polyAnchorRef;

    public PolyfillConvertAnchorAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
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
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r1) {
            r0 = this;
            r0._polyAnchorRef = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._polyAnchorRef
            r0.convertToPolyAnchor()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._polyAnchorRef
            r0.onUndoRedoPolyfillActionBegin(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._polyAnchorRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r2._polyAnchorRef
            r0.deletePolyAnchor()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r2._polyAnchorRef
            r0.onUndoRedoPolyfillActionCancel(r1)
            return
    }
}
