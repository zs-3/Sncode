package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCReferencePlaymodeChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _endPlaymode;
    private org.fortheloss.sticknodes.movieclip.MCReference _mcRef;
    private int _startPlaymode;

    public MCReferencePlaymodeChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._startPlaymode = r0
            r1._endPlaymode = r0
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

    public void initialize(org.fortheloss.sticknodes.movieclip.MCReference r1, int r2, int r3) {
            r0 = this;
            r0._mcRef = r1
            r0._startPlaymode = r2
            r0._endPlaymode = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcRef
            int r1 = r2._endPlaymode
            r0.setPlaymode(r1)
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
            r1._startPlaymode = r0
            r1._endPlaymode = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcRef
            int r1 = r2._startPlaymode
            r0.setPlaymode(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._mcRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
