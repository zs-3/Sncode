package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigureDeleteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _deletedStickfigureRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction.JoinAnchorProperties> _joinAnchorProperties;
    private boolean _ownsStickfigure;
    private int _stickfigureIndex;
    private boolean _stickfigureWasJoinAnchor;
    private boolean _stickfigureWasJoined;
    private int _stickfigureWasJoinedToNodeDrawOrderIndex;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureWasJoinedToRef;

    public static class JoinAnchorProperties {
        public int joinAnchorDrawOrderIndex;
        public org.fortheloss.sticknodes.animationscreen.IDrawableFigure joinedFigureRef;

        public JoinAnchorProperties() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.joinAnchorDrawOrderIndex = r0
                return
        }

        public void dispose() {
                r1 = this;
                r0 = 0
                r1.joinedFigureRef = r0
                return
        }
    }

    public StickfigureDeleteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._ownsStickfigure = r0
            r0 = 0
            r1._stickfigureIndex = r0
            r1._stickfigureWasJoined = r0
            r1._stickfigureWasJoinedToNodeDrawOrderIndex = r0
            r1._stickfigureWasJoinAnchor = r0
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
            if (r1 == 0) goto L12
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._deletedStickfigureRef
            if (r1 == 0) goto L12
            r1.dispose()
        L12:
            r3._deletedStickfigureRef = r0
            r3._stickfigureWasJoinedToRef = r0
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties> r1 = r3._joinAnchorProperties
            if (r1 == 0) goto L32
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L20:
            if (r1 < 0) goto L30
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties> r2 = r3._joinAnchorProperties
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties r2 = (org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction.JoinAnchorProperties) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L20
        L30:
            r3._joinAnchorProperties = r0
        L32:
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r8, org.fortheloss.sticknodes.data.IFrameData r9, org.fortheloss.sticknodes.animationscreen.FramesContainer r10) {
            r7 = this;
            r7._deletedStickfigureRef = r8
            r7._frameRef = r9
            r7._framesContainerRef = r10
            java.util.ArrayList r8 = r9.getDrawableFigures()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r9 = r7._deletedStickfigureRef
            int r8 = r8.indexOf(r9)
            r7._stickfigureIndex = r8
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r7._deletedStickfigureRef
            boolean r8 = r8.isJoined()
            r9 = 1
            if (r8 == 0) goto L35
            r7._stickfigureWasJoined = r9
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r7._deletedStickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r8.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r8.getStickfigure()
            r7._stickfigureWasJoinedToRef = r8
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r7._deletedStickfigureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r8 = r8.getJoinedToNode()
            int r8 = r8.getDrawOrderIndex()
            r7._stickfigureWasJoinedToNodeDrawOrderIndex = r8
        L35:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r7._deletedStickfigureRef
            boolean r8 = r8.hasJoinAnchorNode()
            if (r8 == 0) goto L83
            r7._stickfigureWasJoinAnchor = r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7._joinAnchorProperties = r8
            org.fortheloss.sticknodes.stickfigure.Stickfigure r8 = r7._deletedStickfigureRef
            java.util.ArrayList r8 = r8.getJoinAnchorNodes()
            int r9 = r8.size()
            r10 = 0
            r0 = 0
        L52:
            if (r0 >= r9) goto L83
            java.lang.Object r1 = r8.get(r0)
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = (org.fortheloss.sticknodes.stickfigure.StickNode) r1
            int r2 = r1.getDrawOrderIndex()
            java.util.ArrayList r1 = r1.getJoinedFigures()
            int r3 = r1.size()
            r4 = 0
        L67:
            if (r4 >= r3) goto L80
            org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties r5 = new org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties
            r5.<init>()
            r5.joinAnchorDrawOrderIndex = r2
            java.lang.Object r6 = r1.get(r4)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            r5.joinedFigureRef = r6
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties> r6 = r7._joinAnchorProperties
            r6.add(r5)
            int r4 = r4 + 1
            goto L67
        L80:
            int r0 = r0 + 1
            goto L52
        L83:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r3._frameRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._deletedStickfigureRef
            r0.deleteFigure(r1)
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._deletedStickfigureRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto L14
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._deletedStickfigureRef
            r0.unjoin()
        L14:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._deletedStickfigureRef
            boolean r0 = r0.hasJoinAnchorNode()
            if (r0 == 0) goto L21
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r3._deletedStickfigureRef
            r0.removeAllJoinedFigures()
        L21:
            r0 = 1
            r3._ownsStickfigure = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r1 = 0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r3._deletedStickfigureRef
            r0.onUndoRedoFigureAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r3 = this;
            r0 = 0
            r3._frameRef = r0
            r3._framesContainerRef = r0
            boolean r1 = r3._ownsStickfigure
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r3._deletedStickfigureRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r3._deletedStickfigureRef = r0
            r1 = 1
            r3._ownsStickfigure = r1
            r2 = 0
            r3._stickfigureIndex = r2
            r3._stickfigureWasJoined = r2
            r3._stickfigureWasJoinedToRef = r0
            r3._stickfigureWasJoinedToNodeDrawOrderIndex = r2
            r3._stickfigureWasJoinAnchor = r2
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties> r2 = r3._joinAnchorProperties
            if (r2 == 0) goto L3b
            int r2 = r2.size()
            int r2 = r2 - r1
        L29:
            if (r2 < 0) goto L39
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties> r1 = r3._joinAnchorProperties
            java.lang.Object r1 = r1.get(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties r1 = (org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction.JoinAnchorProperties) r1
            r1.dispose()
            int r2 = r2 + (-1)
            goto L29
        L39:
            r3._joinAnchorProperties = r0
        L3b:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r6 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._frameRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r6._deletedStickfigureRef
            int r2 = r1.getID()
            int r3 = r6._stickfigureIndex
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r6._framesContainerRef
            r0.addFigureAt(r1, r2, r3, r4)
            boolean r0 = r6._stickfigureWasJoined
            if (r0 == 0) goto L29
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r6._stickfigureWasJoinedToRef
            int r1 = r6._stickfigureWasJoinedToNodeDrawOrderIndex
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r6._deletedStickfigureRef
            r1.joinTo(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r2 = r6._deletedStickfigureRef
            r1.onUndoRedoFigureJoinAction(r2, r0)
        L29:
            boolean r0 = r6._stickfigureWasJoinAnchor
            r1 = 0
            if (r0 == 0) goto L58
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties> r0 = r6._joinAnchorProperties
            int r0 = r0.size()
            r2 = 0
        L35:
            if (r2 >= r0) goto L58
            java.util.ArrayList<org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties> r3 = r6._joinAnchorProperties
            java.lang.Object r3 = r3.get(r2)
            org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction$JoinAnchorProperties r3 = (org.fortheloss.sticknodes.data.useractions.StickfigureDeleteAction.JoinAnchorProperties) r3
            org.fortheloss.sticknodes.stickfigure.Stickfigure r4 = r6._deletedStickfigureRef
            int r5 = r3.joinAnchorDrawOrderIndex
            org.fortheloss.sticknodes.stickfigure.INode r4 = r4.getNodeAtDrawOrderIndex(r5)
            org.fortheloss.sticknodes.stickfigure.StickNode r4 = (org.fortheloss.sticknodes.stickfigure.StickNode) r4
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = r3.joinedFigureRef
            r5.joinTo(r4)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r5 = r6._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = r3.joinedFigureRef
            r5.onUndoRedoFigureJoinAction(r3, r4)
            int r2 = r2 + 1
            goto L35
        L58:
            r6._ownsStickfigure = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r6._deletedStickfigureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
