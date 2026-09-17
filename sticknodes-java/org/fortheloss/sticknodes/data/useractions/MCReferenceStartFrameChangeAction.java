package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCReferenceStartFrameChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private int _afterStartFrameIndex;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _beforeStartFrameIndex;
    private org.fortheloss.sticknodes.movieclip.MCReference _mcRef;
    private boolean _needsAfterProperties;

    public MCReferenceStartFrameChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._beforeStartFrameIndex = r0
            r1._afterStartFrameIndex = r0
            r0 = 1
            r1._needsAfterProperties = r0
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

    public org.fortheloss.sticknodes.movieclip.MCReference getMCReference() {
            r1 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r1._mcRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCReference r1) {
            r0 = this;
            r0._mcRef = r1
            int r1 = r1.getStartFrameIndex()
            r0._beforeStartFrameIndex = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcRef
            int r1 = r2._afterStartFrameIndex
            r0.setStartFrameIndex(r1)
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
            r1._beforeStartFrameIndex = r0
            r1._afterStartFrameIndex = r0
            r0 = 1
            r1._needsAfterProperties = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            boolean r0 = r2._needsAfterProperties
            if (r0 == 0) goto Lf
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcRef
            int r0 = r0.getStartFrameIndex()
            r2._afterStartFrameIndex = r0
            r0 = 0
            r2._needsAfterProperties = r0
        Lf:
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._mcRef
            int r1 = r2._beforeStartFrameIndex
            r0.setStartFrameIndex(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._mcRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
