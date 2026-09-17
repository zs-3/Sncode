package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigureJoinsStateChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private int _afterState;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _beforeState;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureRef;

    public StickfigureJoinsStateChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1._beforeState = r0
            r1._afterState = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._stickfigureRef = r0
            return
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getStickfigure() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r1) {
            r0 = this;
            r0._stickfigureRef = r1
            int r1 = r1.getStateIndexOfJoins()
            r0._beforeState = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            int r1 = r2._afterState
            r0.setStateIndexOfJoins(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._stickfigureRef = r0
            r0 = -1
            r1._beforeState = r0
            r1._afterState = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            int r0 = r2._afterState
            r1 = -1
            if (r0 != r1) goto Ld
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            int r0 = r0.getStateIndexOfJoins()
            r2._afterState = r0
        Ld:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            int r1 = r2._beforeState
            r0.setStateIndexOfJoins(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
