package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCSetRotationAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private float _endRotation;
    private org.fortheloss.sticknodes.movieclip.MCReference _mcRef;
    private float _startRotation;

    public MCSetRotationAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
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
            r1._mcRef = r0
            return
    }

    public org.fortheloss.sticknodes.movieclip.MCReference getMCRef() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._mcRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCReference r1) {
            r0 = this;
            r0._mcRef = r1
            float r1 = r1.getRotation()
            r0._startRotation = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcRef
            float r1 = r2._endRotation
            r0.setFigureRotation(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._mcRef
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._mcRef = r0
            r0 = 0
            r1._startRotation = r0
            r1._endRotation = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcRef
            float r0 = r0.getRotation()
            r2._endRotation = r0
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcRef
            float r1 = r2._startRotation
            r0.setFigureRotation(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._mcRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
