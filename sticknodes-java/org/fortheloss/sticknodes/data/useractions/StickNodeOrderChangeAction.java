package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickNodeOrderChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private int _afterIndex;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _beforeIndex;
    private org.fortheloss.sticknodes.stickfigure.StickNode _stickNodeRef;

    public StickNodeOrderChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._beforeIndex = r0
            r1._afterIndex = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._stickNodeRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.StickNode r1, int r2, int r3) {
            r0 = this;
            r0._stickNodeRef = r1
            r0._beforeIndex = r2
            r0._afterIndex = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._stickNodeRef
            int r1 = r3._afterIndex
            r0.drawAt(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            r2 = 0
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._stickNodeRef = r0
            r0 = 0
            r1._beforeIndex = r0
            r1._afterIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r3._stickNodeRef
            int r1 = r3._beforeIndex
            r0.drawAt(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._stickNodeRef
            r2 = 0
            r0.onUndoRedoNodeAction(r1, r2)
            return
    }
}
