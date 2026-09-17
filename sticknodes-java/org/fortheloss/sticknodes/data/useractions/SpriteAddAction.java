package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class SpriteAddAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.sprite.SpriteRef _addedSpriteRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private org.fortheloss.sticknodes.animationscreen.FramesContainer _framesContainerRef;
    private int _layeringIndex;
    private boolean _ownsSprite;

    public SpriteAddAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._ownsSprite = r0
            r0 = -1
            r1._layeringIndex = r0
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
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r2._addedSpriteRef
            if (r1 == 0) goto L12
            r1.dispose()
        L12:
            r2._addedSpriteRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.sprite.SpriteRef r1, int r2, org.fortheloss.sticknodes.data.IFrameData r3, org.fortheloss.sticknodes.animationscreen.FramesContainer r4) {
            r0 = this;
            r0._addedSpriteRef = r1
            r0._layeringIndex = r2
            r0._frameRef = r3
            r0._framesContainerRef = r4
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r5 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r5._frameRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r5._addedSpriteRef
            int r2 = r1.getID()
            int r3 = r5._layeringIndex
            org.fortheloss.sticknodes.animationscreen.FramesContainer r4 = r5._framesContainerRef
            r0.addFigureAt(r1, r2, r3, r4)
            r0 = 0
            r5._ownsSprite = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r5._addedSpriteRef
            r0.onUndoRedoFigureAction(r1)
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
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r2._addedSpriteRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r2._addedSpriteRef = r0
            r0 = 0
            r2._ownsSprite = r0
            r0 = -1
            r2._layeringIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r3._frameRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r3._addedSpriteRef
            r0.deleteFigure(r1)
            r0 = 1
            r3._ownsSprite = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.sprite.SpriteRef r1 = r3._addedSpriteRef
            r2 = 0
            r0.onUndoRedoFigureAction(r2, r1)
            return
    }
}
