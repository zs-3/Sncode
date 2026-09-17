package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigureAndJoinsDeleteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> _deletedFiguresJoinAnchorNodes;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _deletedFiguresRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private boolean _ownsStickfigure;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _rootDeletedStickfigureRef;
    private int _stickfigureIndex;
    private org.fortheloss.sticknodes.stickfigure.StickNode _stickfigureWasJoinedToThisAnchorNodeRef;

    public StickfigureAndJoinsDeleteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._ownsStickfigure = r0
            r0 = 0
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
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r3._deletedFiguresRef
            if (r1 == 0) goto L25
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L15:
            if (r1 < 0) goto L25
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r3._deletedFiguresRef
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L15
        L25:
            r3._deletedFiguresRef = r0
            r3._rootDeletedStickfigureRef = r0
            r3._deletedFiguresJoinAnchorNodes = r0
            r3._stickfigureWasJoinedToThisAnchorNodeRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r6, org.fortheloss.sticknodes.data.IFrameData r7, org.fortheloss.sticknodes.animationscreen.FramesContainer r8) {
            r5 = this;
            r5._rootDeletedStickfigureRef = r6
            r5._frameRef = r7
            r5._framesContainerRef = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5._deletedFiguresRef = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5._deletedFiguresJoinAnchorNodes = r8
            java.util.Stack r8 = new java.util.Stack
            r8.<init>()
            r8.add(r6)
        L1c:
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 != 0) goto L71
            java.lang.Object r0 = r8.pop()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r5._deletedFiguresRef
            r2.add(r0)
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.stickfigure.Stickfigure
            if (r2 == 0) goto L67
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = (org.fortheloss.sticknodes.stickfigure.Stickfigure) r0
            boolean r1 = r0.hasJoinAnchorNode()
            if (r1 == 0) goto L1c
            java.util.ArrayList r0 = r0.getJoinAnchorNodes()
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L44:
            if (r1 < 0) goto L1c
            java.lang.Object r2 = r0.get(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = (org.fortheloss.sticknodes.stickfigure.StickNode) r2
            java.util.ArrayList r2 = r2.getJoinedFigures()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L56:
            if (r3 < 0) goto L64
            java.lang.Object r4 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            r8.add(r4)
            int r3 = r3 + (-1)
            goto L56
        L64:
            int r1 = r1 + (-1)
            goto L44
        L67:
            boolean r2 = r0 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto L1c
            org.fortheloss.sticknodes.movieclip.MCReference r0 = (org.fortheloss.sticknodes.movieclip.MCReference) r0
            r0.setNewOrigin(r1)
            goto L1c
        L71:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r5._deletedFiguresRef
            r7.sortFiguresArrayByLayerOrder(r8)
            org.fortheloss.sticknodes.data.IFrameData r7 = r5._frameRef
            java.util.ArrayList r7 = r7.getDrawableFigures()
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r5._deletedFiguresRef
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            int r7 = r7.indexOf(r8)
            r5._stickfigureIndex = r7
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r7 = r5._deletedFiguresRef
            int r7 = r7.size()
        L8f:
            if (r0 >= r7) goto Lb9
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r8 = r5._deletedFiguresRef
            java.lang.Object r8 = r8.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r8 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r8
            if (r8 != r6) goto La1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r8 = r5._deletedFiguresJoinAnchorNodes
            r8.add(r1)
            goto Lb6
        La1:
            boolean r2 = r8.isJoined()
            if (r2 == 0) goto Lb1
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r2 = r5._deletedFiguresJoinAnchorNodes
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r8.getJoinedToNode()
            r2.add(r8)
            goto Lb6
        Lb1:
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r8 = r5._deletedFiguresJoinAnchorNodes
            r8.add(r1)
        Lb6:
            int r0 = r0 + 1
            goto L8f
        Lb9:
            boolean r7 = r6.isJoined()
            if (r7 == 0) goto Lc5
            org.fortheloss.sticknodes.stickfigure.StickNode r6 = r6.getJoinedToNode()
            r5._stickfigureWasJoinedToThisAnchorNodeRef = r6
        Lc5:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r4 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r4._deletedFiguresRef
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r4._deletedFiguresRef
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            org.fortheloss.sticknodes.data.IFrameData r3 = r4._frameRef
            r3.deleteFigure(r2)
            boolean r3 = r2.isJoined()
            if (r3 == 0) goto L20
            r2.unjoin()
        L20:
            int r0 = r0 + (-1)
            goto L8
        L23:
            r4._ownsStickfigure = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r1 = 0
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r4 = this;
            r0 = 0
            r4._frameRef = r0
            r4._framesContainerRef = r0
            boolean r1 = r4._ownsStickfigure
            r2 = 1
            if (r1 == 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r4._deletedFiguresRef
            if (r1 == 0) goto L23
            int r1 = r1.size()
            int r1 = r1 - r2
        L13:
            if (r1 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r4._deletedFiguresRef
            java.lang.Object r3 = r3.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            r3.dispose()
            int r1 = r1 + (-1)
            goto L13
        L23:
            r4._deletedFiguresRef = r0
            r4._rootDeletedStickfigureRef = r0
            r4._deletedFiguresJoinAnchorNodes = r0
            r4._stickfigureWasJoinedToThisAnchorNodeRef = r0
            r4._ownsStickfigure = r2
            r0 = 0
            r4._stickfigureIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r6 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._deletedFiguresRef
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L22
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._deletedFiguresRef
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
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r0 = r6._deletedFiguresJoinAnchorNodes
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L2a:
            if (r0 < 0) goto L4a
            java.util.ArrayList<org.fortheloss.sticknodes.stickfigure.StickNode> r1 = r6._deletedFiguresJoinAnchorNodes
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            if (r1 != 0) goto L37
            goto L47
        L37:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r2 = r6._deletedFiguresRef
            java.lang.Object r2 = r2.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r2
            r2.joinTo(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r3 = r6._animationScreenRef
            r3.onUndoRedoFigureJoinAction(r2, r1)
        L47:
            int r0 = r0 + (-1)
            goto L2a
        L4a:
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = r6._stickfigureWasJoinedToThisAnchorNodeRef
            if (r0 == 0) goto L5c
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r6._rootDeletedStickfigureRef
            r1.joinTo(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r6._rootDeletedStickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r6._stickfigureWasJoinedToThisAnchorNodeRef
            r0.onUndoRedoFigureJoinAction(r1, r2)
        L5c:
            r0 = 0
            r6._ownsStickfigure = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r6._rootDeletedStickfigureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
