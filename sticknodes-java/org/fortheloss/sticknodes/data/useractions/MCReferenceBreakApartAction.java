package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MCReferenceBreakApartAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _addedFiguresRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.movieclip.MCReference _deletedMCRef;
    private org.fortheloss.sticknodes.data.FrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private int _owns;
    private int _position;

    public MCReferenceBreakApartAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._position = r0
            r1._owns = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._animationScreenRef = r0
            r3._frameRef = r0
            r3._framesContainerRef = r0
            int r1 = r3._owns
            if (r1 != 0) goto L13
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r3._deletedMCRef
            if (r1 == 0) goto L2d
            r1.dispose()
            goto L2d
        L13:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._addedFiguresRef
            if (r1 == 0) goto L2d
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L1d:
            if (r1 < 0) goto L2d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._addedFiguresRef
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L1d
        L2d:
            r3._deletedMCRef = r0
            r3._addedFiguresRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.movieclip.MCReference r1, java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2, int r3, org.fortheloss.sticknodes.data.FrameData r4, org.fortheloss.sticknodes.animationscreen.FramesContainer r5) {
            r0 = this;
            r0._deletedMCRef = r1
            r0._addedFiguresRef = r2
            r0._frameRef = r4
            r0._framesContainerRef = r5
            r0._position = r3
            r1 = 0
            r0._owns = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r6 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r6._frameRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r6._deletedMCRef
            r0.deleteFigure(r1)
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._addedFiguresRef
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Lf:
            if (r0 < 0) goto L31
            org.fortheloss.sticknodes.data.FrameData r1 = r6._frameRef
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._addedFiguresRef
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r6._addedFiguresRef
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r3 = r3.getID()
            int r4 = r6._position
            org.fortheloss.sticknodes.animationscreen.FramesContainer r5 = r6._framesContainerRef
            r1.addFigureAt(r2, r3, r4, r5)
            int r0 = r0 + (-1)
            goto Lf
        L31:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._addedFiguresRef
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L39:
            if (r0 < 0) goto L55
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._addedFiguresRef
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r2 = r1.isJoined()
            if (r2 == 0) goto L52
            org.fortheloss.sticknodes.data.FrameData r2 = r6._frameRef
            org.fortheloss.sticknodes.stickfigure.StickNode r3 = r1.getJoinedToNode()
            r2.onFigureJoined(r1, r3)
        L52:
            int r0 = r0 + (-1)
            goto L39
        L55:
            r0 = 0
            r6._owns = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._addedFiguresRef
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r3 = this;
            r0 = 0
            r3._frameRef = r0
            r3._framesContainerRef = r0
            int r1 = r3._owns
            if (r1 != 0) goto L11
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r3._deletedMCRef
            if (r1 == 0) goto L29
            r1.dispose()
            goto L29
        L11:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._addedFiguresRef
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L19:
            if (r1 < 0) goto L29
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._addedFiguresRef
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L19
        L29:
            r3._deletedMCRef = r0
            r3._addedFiguresRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r6 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._addedFiguresRef
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L1a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._addedFiguresRef
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            org.fortheloss.sticknodes.data.FrameData r3 = r6._frameRef
            r3.deleteFigure(r2)
            int r0 = r0 + (-1)
            goto L8
        L1a:
            org.fortheloss.sticknodes.data.FrameData r0 = r6._frameRef
            org.fortheloss.sticknodes.movieclip.MCReference r2 = r6._deletedMCRef
            int r3 = r2.getID()
            int r4 = r6._position
            org.fortheloss.sticknodes.animationscreen.FramesContainer r5 = r6._framesContainerRef
            r0.addFigureAt(r2, r3, r4, r5)
            r6._owns = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.movieclip.MCReference r1 = r6._deletedMCRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
