package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCReferenceAddAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.movieclip.MCReference _addedMCRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private boolean _ownsMCRef;

    public MCReferenceAddAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._ownsMCRef = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._frameRef = r0
            r2._framesContainerRef = r0
            boolean r1 = r2._ownsMCRef
            if (r1 == 0) goto L12
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._addedMCRef
            if (r1 == 0) goto L12
            r1.dispose()
        L12:
            r2._addedMCRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCReference r1, org.fortheloss.sticknodes.data.IFrameData r2, org.fortheloss.sticknodes.animationscreen.FramesContainer r3) {
            r0 = this;
            r0._addedMCRef = r1
            r0._frameRef = r2
            r0._framesContainerRef = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r4 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r4._frameRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r4._addedMCRef
            int r2 = r1.getID()
            org.fortheloss.sticknodes.animationscreen.FramesContainer r3 = r4._framesContainerRef
            r0.addFigure(r1, r2, r3)
            r0 = 0
            r4._ownsMCRef = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r4._addedMCRef
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._frameRef = r0
            r2._framesContainerRef = r0
            boolean r1 = r2._ownsMCRef
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._addedMCRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r2._addedMCRef = r0
            r0 = 0
            r2._ownsMCRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r3._frameRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r3._addedMCRef
            r0.deleteFigure(r1)
            r0 = 1
            r3._ownsMCRef = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r3._addedMCRef
            r2 = 0
            r0.onUndoRedoFigureAction(r2, r1)
            return
    }
}
