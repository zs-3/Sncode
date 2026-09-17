package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FigureJoinAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure _figureRef;
    private org.fortheloss.sticknodes.stickfigure.StickNode _joinedToNodeRef;
    private float _newX;
    private float _newY;
    private float _oldX;
    private float _oldY;

    public FigureJoinAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._oldX = r0
            r1._oldY = r0
            r1._newX = r0
            r1._newY = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._figureRef = r0
            r1._joinedToNodeRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1, float r2, float r3, float r4, float r5, org.fortheloss.sticknodes.stickfigure.StickNode r6) {
            r0 = this;
            r0._figureRef = r1
            r0._oldX = r2
            r0._oldY = r3
            r0._newX = r4
            r0._newY = r5
            r0._joinedToNodeRef = r6
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3._figureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r1 = r3._joinedToNodeRef
            r0.joinTo(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3._figureRef
            float r1 = r3._newX
            float r2 = r3._newY
            r0.setPosition(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r3._figureRef
            r0.onUndoRedoFigureAction(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r3._figureRef
            org.fortheloss.sticknodes.stickfigure.StickNode r2 = r3._joinedToNodeRef
            r0.onUndoRedoFigureJoinAction(r1, r2)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._figureRef = r0
            r1._joinedToNodeRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3._figureRef
            r0.unjoin()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3._figureRef
            float r1 = r3._oldX
            float r2 = r3._oldY
            r0.setPosition(r1, r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r3._figureRef
            org.fortheloss.sticknodes.stickfigure.INode r0 = r0.getMainNode()
            r0.flagPositionAsDirty()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r3._figureRef
            r0.onUndoRedoFigureAction(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r3._figureRef
            r2 = 0
            r0.onUndoRedoFigureJoinAction(r1, r2)
            return
    }
}
