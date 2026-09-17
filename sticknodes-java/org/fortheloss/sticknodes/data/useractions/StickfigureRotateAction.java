package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigureRotateAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private float _endRotation;
    private float _startRotation;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureRef;

    public StickfigureRotateAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._startRotation = r0
            r1._endRotation = r0
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

    public org.fortheloss.sticknodes.animationscreen.IDrawableFigure getFigure() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r2) {
            r1 = this;
            r1._stickfigureRef = r2
            boolean r0 = r2.isJoined()
            if (r0 == 0) goto Ld
            float r2 = r2.getJoinOffsetAngle()
            goto L11
        Ld:
            float r2 = r2.getRotation()
        L11:
            r1._startRotation = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            float r1 = r2._endRotation
            r0.setFigureRotation(r1)
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
            r0 = 0
            r1._startRotation = r0
            r1._endRotation = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto Lf
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            float r0 = r0.getJoinOffsetAngle()
            goto L15
        Lf:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            float r0 = r0.getRotation()
        L15:
            r2._endRotation = r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            float r1 = r2._startRotation
            r0.setFigureRotation(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
