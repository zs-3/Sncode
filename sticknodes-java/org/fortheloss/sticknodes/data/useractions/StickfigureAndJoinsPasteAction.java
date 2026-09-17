package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigureAndJoinsPasteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private boolean _ownsStickfigure;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _pastedFigures;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _pastedFiguresJoinAnchorNodes;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _rootPastedStickfigureRef;
    private int _stickfigureIndex;

    public StickfigureAndJoinsPasteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._ownsStickfigure = r0
            r1._stickfigureIndex = r0
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
            boolean r1 = r3._ownsStickfigure
            if (r1 == 0) goto L25
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._pastedFigures
            if (r1 == 0) goto L25
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L15:
            if (r1 < 0) goto L25
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._pastedFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L15
        L25:
            r3._pastedFigures = r0
            r3._rootPastedStickfigureRef = r0
            r3._pastedFiguresJoinAnchorNodes = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r6, org.fortheloss.sticknodes.data.IFrameData r7, org.fortheloss.sticknodes.animationscreen.FramesContainer r8) {
            r5 = this;
            r5._rootPastedStickfigureRef = r6
            r5._frameRef = r7
            r5._framesContainerRef = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5._pastedFigures = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5._pastedFiguresJoinAnchorNodes = r8
            java.util.Stack r8 = new java.util.Stack
            r8.<init>()
            r8.add(r6)
        L1c:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L66
            java.lang.Object r0 = r8.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r5._pastedFigures
            r1.add(r0)
            boolean r1 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r1 == 0) goto L1c
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            boolean r1 = r0.hasJoinAnchorNode()
            if (r1 == 0) goto L1c
            java.util.ArrayList r0 = r0.getJoinAnchorNodes()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L43:
            if (r1 < 0) goto L1c
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            java.util.ArrayList r2 = r2.getJoinedFigures()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L55:
            if (r3 < 0) goto L63
            java.lang.Object r4 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            r8.add(r4)
            int r3 = r3 + (-1)
            goto L55
        L63:
            int r1 = r1 + (-1)
            goto L43
        L66:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r5._pastedFigures
            r7.sortFiguresArrayByLayerOrder(r8)
            org.fortheloss.sticknodes.data.IFrameData r7 = r5._frameRef
            java.util.ArrayList r7 = r7.getDrawableFigures()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r5._pastedFigures
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            int r7 = r7.indexOf(r8)
            r5._stickfigureIndex = r7
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r5._pastedFigures
            int r7 = r7.size()
        L84:
            if (r0 >= r7) goto Laf
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r5._pastedFigures
            java.lang.Object r8 = r8.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            r1 = 0
            if (r8 != r6) goto L97
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r8 = r5._pastedFiguresJoinAnchorNodes
            r8.add(r1)
            goto Lac
        L97:
            boolean r2 = r8.isJoined()
            if (r2 == 0) goto La7
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r5._pastedFiguresJoinAnchorNodes
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r8.getJoinedToNode()
            r1.add(r8)
            goto Lac
        La7:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r8 = r5._pastedFiguresJoinAnchorNodes
            r8.add(r1)
        Lac:
            int r0 = r0 + 1
            goto L84
        Laf:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r6 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._pastedFigures
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L22
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._pastedFigures
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            org.fortheloss.sticknodes.data.IFrameData r2 = r6._frameRef
            int r3 = r1.getID()
            int r4 = r6._stickfigureIndex
            org.fortheloss.sticknodes.animationscreen.FramesContainer r5 = r6._framesContainerRef
            r2.addFigureAt(r1, r3, r4, r5)
            int r0 = r0 + (-1)
            goto L8
        L22:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r6._pastedFiguresJoinAnchorNodes
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L2a:
            if (r0 < 0) goto L4a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r6._pastedFiguresJoinAnchorNodes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            if (r1 != 0) goto L37
            goto L47
        L37:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._pastedFigures
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.joinTo(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r6._animationScreenRef
            r3.onUndoRedoFigureJoinAction(r2, r1)
        L47:
            int r0 = r0 + (-1)
            goto L2a
        L4a:
            r0 = 0
            r6._ownsStickfigure = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r6._rootPastedStickfigureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r3 = this;
            r0 = 0
            r3._frameRef = r0
            r3._framesContainerRef = r0
            boolean r1 = r3._ownsStickfigure
            if (r1 == 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._pastedFigures
            if (r1 == 0) goto L23
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L13:
            if (r1 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._pastedFigures
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L13
        L23:
            r3._pastedFigures = r0
            r3._rootPastedStickfigureRef = r0
            r3._pastedFiguresJoinAnchorNodes = r0
            r0 = 0
            r3._ownsStickfigure = r0
            r3._stickfigureIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r5._pastedFigures
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 0
            if (r0 < 0) goto L2d
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r5._pastedFigures
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            org.fortheloss.sticknodes.data.IFrameData r4 = r5._frameRef
            r4.deleteFigure(r3)
            boolean r4 = r3.isJoined()
            if (r4 == 0) goto L21
            r3.unjoin()
        L21:
            boolean r4 = r3 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r4 == 0) goto L2a
            org.fortheloss.sticknodes.movieclip.MCReference r3 = (org.fortheloss.sticknodes.movieclip.MCReference) r3
            r3.setNewOrigin(r2)
        L2a:
            int r0 = r0 + (-1)
            goto L8
        L2d:
            r5._ownsStickfigure = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.onUndoRedoFigureAction(r2)
            return
    }
}
