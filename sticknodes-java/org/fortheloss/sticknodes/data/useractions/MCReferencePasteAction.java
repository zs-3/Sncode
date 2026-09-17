package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCReferencePasteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.movieclip.MCReference _addedMCRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _figureIndex;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private org.fortheloss.sticknodes.movieclip.MCReference _nextFrameOldOriginMC;
    private int _nextFrameOldOriginStartFrameIndex;
    private boolean _ownsMCRef;

    public MCReferencePasteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._ownsMCRef = r0
            r1 = -1
            r2._nextFrameOldOriginStartFrameIndex = r1
            r2._figureIndex = r0
            r2._animationScreenRef = r3
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
            r2._nextFrameOldOriginMC = r0
            r0 = 0
            r2._figureIndex = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCReference r1, int r2, org.fortheloss.sticknodes.data.IFrameData r3, org.fortheloss.sticknodes.data.IFrameData r4, org.fortheloss.sticknodes.animationscreen.FramesContainer r5) {
            r0 = this;
            r0._addedMCRef = r1
            r0._frameRef = r3
            r0._framesContainerRef = r5
            r0._figureIndex = r2
            if (r4 == 0) goto L3e
            int r1 = r1.getID()
            java.util.ArrayList r2 = r4.getDrawableFigures()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L18:
            if (r3 < 0) goto L3e
            java.lang.Object r4 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r5 = r4 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r5 == 0) goto L3b
            org.fortheloss.sticknodes.movieclip.MCReference r4 = (org.fortheloss.sticknodes.movieclip.MCReference) r4
            int r2 = r4.getID()
            if (r2 != r1) goto L3e
            boolean r1 = r4.isOriginMCRef()
            if (r1 == 0) goto L3e
            r0._nextFrameOldOriginMC = r4
            int r1 = r4.getStartFrameIndex()
            r0._nextFrameOldOriginStartFrameIndex = r1
            goto L3e
        L3b:
            int r3 = r3 + (-1)
            goto L18
        L3e:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r5 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r5._frameRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r5._addedMCRef
            int r2 = r1.getID()
            int r3 = r5._figureIndex
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r5._framesContainerRef
            r0.addFigureAt(r1, r2, r3, r4)
            r0 = 0
            r5._ownsMCRef = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r5._addedMCRef
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
            r1 = 0
            r2._ownsMCRef = r1
            r1 = -1
            r2._nextFrameOldOriginStartFrameIndex = r1
            r2._nextFrameOldOriginMC = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r2._frameRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._addedMCRef
            r0.deleteFigure(r1)
            r0 = 1
            r2._ownsMCRef = r0
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r2._nextFrameOldOriginMC
            if (r0 == 0) goto L13
            int r1 = r2._nextFrameOldOriginStartFrameIndex
            r0.setStartFrameIndex(r1)
        L13:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r1 = 0
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
