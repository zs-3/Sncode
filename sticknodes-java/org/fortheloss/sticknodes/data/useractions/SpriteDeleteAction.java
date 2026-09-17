package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class SpriteDeleteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.sprite.SpriteRef _deletedSpriteRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private boolean _ownsSprite;
    private boolean _spriteWasJoined;
    private int _stickfigureIndex;
    private int _stickfigureWasJoinedToNodeDrawOrderIndex;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureWasJoinedToRef;

    public SpriteDeleteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._ownsSprite = r0
            r0 = 0
            r1._stickfigureIndex = r0
            r1._spriteWasJoined = r0
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
            boolean r1 = r2._ownsSprite
            if (r1 == 0) goto L12
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r2._deletedSpriteRef
            if (r1 == 0) goto L12
            r1.dispose()
        L12:
            r2._deletedSpriteRef = r0
            r2._stickfigureWasJoinedToRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.sprite.SpriteRef r1, org.fortheloss.sticknodes.data.IFrameData r2, org.fortheloss.sticknodes.animationscreen.FramesContainer r3) {
            r0 = this;
            r0._deletedSpriteRef = r1
            r0._frameRef = r2
            r0._framesContainerRef = r3
            java.util.ArrayList r1 = r2.getDrawableFigures()
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r0._deletedSpriteRef
            int r1 = r1.indexOf(r2)
            r0._stickfigureIndex = r1
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0._deletedSpriteRef
            boolean r1 = r1.isJoined()
            if (r1 == 0) goto L35
            r1 = 1
            r0._spriteWasJoined = r1
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0._deletedSpriteRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getJoinedToNode()
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r1.getStickfigure()
            r0._stickfigureWasJoinedToRef = r1
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r0._deletedSpriteRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r1.getJoinedToNode()
            int r1 = r1.getDrawOrderIndex()
            r0._stickfigureWasJoinedToNodeDrawOrderIndex = r1
        L35:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r3._frameRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r3._deletedSpriteRef
            r0.deleteFigure(r1)
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r3._deletedSpriteRef
            boolean r0 = r0.isJoined()
            if (r0 == 0) goto L14
            org.fortheloss.sticknodes.sprite.SpriteRef r0 = r3._deletedSpriteRef
            r0.unjoin()
        L14:
            r0 = 1
            r3._ownsSprite = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r1 = 0
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r3._deletedSpriteRef
            r0.onUndoRedoFigureAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._frameRef = r0
            r2._framesContainerRef = r0
            boolean r1 = r2._ownsSprite
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r2._deletedSpriteRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r2._deletedSpriteRef = r0
            r1 = 1
            r2._ownsSprite = r1
            r1 = 0
            r2._stickfigureIndex = r1
            r2._spriteWasJoined = r1
            r2._stickfigureWasJoinedToRef = r0
            r2._stickfigureWasJoinedToNodeDrawOrderIndex = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r5 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r5._frameRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r5._deletedSpriteRef
            int r2 = r1.getID()
            int r3 = r5._stickfigureIndex
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r5._framesContainerRef
            r0.addFigureAt(r1, r2, r3, r4)
            boolean r0 = r5._spriteWasJoined
            if (r0 == 0) goto L29
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r5._stickfigureWasJoinedToRef
            int r1 = r5._stickfigureWasJoinedToNodeDrawOrderIndex
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getNodeAtDrawOrderIndex(r1)
            org.fortheloss.sticknodes.stickfigure.StickNode r0 = (org.fortheloss.sticknodes.stickfigure.StickNode) r0
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r5._deletedSpriteRef
            r1.joinTo(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r5._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r2 = r5._deletedSpriteRef
            r1.onUndoRedoFigureJoinAction(r2, r0)
        L29:
            r0 = 0
            r5._ownsSprite = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r5._deletedSpriteRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
