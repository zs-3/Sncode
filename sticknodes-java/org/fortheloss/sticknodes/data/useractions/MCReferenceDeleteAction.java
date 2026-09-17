package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCReferenceDeleteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.movieclip.MCReference _deletedMCRef;
    private int _figureIndex;
    private org.fortheloss.sticknodes.data.FrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private boolean _mcWasJoined;
    private boolean _ownsMC;
    private int _stickfigureWasJoinedToNodeDrawOrderIndex;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureWasJoinedToRef;

    public MCReferenceDeleteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._ownsMC = r0
            r0 = 0
            r1._figureIndex = r0
            r1._mcWasJoined = r0
            r1._stickfigureWasJoinedToNodeDrawOrderIndex = r0
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
            boolean r1 = r2._ownsMC
            if (r1 == 0) goto L12
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._deletedMCRef
            if (r1 == 0) goto L12
            r1.dispose()
        L12:
            r2._deletedMCRef = r0
            r2._stickfigureWasJoinedToRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCReference r1, int r2, org.fortheloss.sticknodes.data.FrameData r3, org.fortheloss.sticknodes.animationscreen.FramesContainer r4) {
            r0 = this;
            r0._deletedMCRef = r1
            r0._frameRef = r3
            r0._framesContainerRef = r4
            r0._figureIndex = r2
            r2 = 0
            r1.setNewOrigin(r2)
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r0._deletedMCRef
            boolean r1 = r1.isJoined()
            if (r1 == 0) goto L2f
            r1 = 1
            r0._mcWasJoined = r1
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r0._deletedMCRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            r0._stickfigureWasJoinedToRef = r1
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r0._deletedMCRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getJoinedToNode()
            int r1 = r1.getDrawOrderIndex()
            r0._stickfigureWasJoinedToNodeDrawOrderIndex = r1
        L2f:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r3._frameRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r3._deletedMCRef
            r0.deleteFigure(r1)
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r3._deletedMCRef
            r1 = 0
            r0.setNewOrigin(r1)
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r3._deletedMCRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto L1a
            org.fortheloss.sticknodes.movieclip.MCReference r0 = r3._deletedMCRef
            r0.unjoin()
        L1a:
            r0 = 1
            r3._ownsMC = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r2 = r3._deletedMCRef
            r0.onUndoRedoFigureAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._frameRef = r0
            r2._framesContainerRef = r0
            boolean r1 = r2._ownsMC
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r2._deletedMCRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r2._deletedMCRef = r0
            r1 = 1
            r2._ownsMC = r1
            r1 = 0
            r2._figureIndex = r1
            r2._mcWasJoined = r1
            r2._stickfigureWasJoinedToRef = r0
            r2._stickfigureWasJoinedToNodeDrawOrderIndex = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r5 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r5._frameRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r5._deletedMCRef
            int r2 = r1.getID()
            int r3 = r5._figureIndex
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r5._framesContainerRef
            r0.addFigureAt(r1, r2, r3, r4)
            boolean r0 = r5._mcWasJoined
            if (r0 == 0) goto L29
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r5._stickfigureWasJoinedToRef
            int r1 = r5._stickfigureWasJoinedToNodeDrawOrderIndex
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r5._deletedMCRef
            r1.joinTo(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r5._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r2 = r5._deletedMCRef
            r1.onUndoRedoFigureJoinAction(r2, r0)
        L29:
            r0 = 0
            r5._ownsMC = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r5._deletedMCRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
