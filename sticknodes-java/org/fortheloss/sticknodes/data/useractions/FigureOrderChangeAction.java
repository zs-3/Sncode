package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FigureOrderChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure _figureRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private int _swapIndex1;
    private int _swapIndex2;

    public FigureOrderChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._swapIndex1 = r0
            r1._swapIndex2 = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._frameRef = r0
            r1._figureRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r1, int r2, int r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r0 = this;
            r0._frameRef = r1
            r0._swapIndex1 = r2
            r0._swapIndex2 = r3
            r0._figureRef = r4
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r3._frameRef
            int r1 = r3._swapIndex1
            int r2 = r3._swapIndex2
            r0.swapFigures(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r3._figureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._frameRef = r0
            r1 = 0
            r2._swapIndex1 = r1
            r2._swapIndex2 = r1
            r2._figureRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r3._frameRef
            int r1 = r3._swapIndex2
            int r2 = r3._swapIndex1
            r0.swapFigures(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r3._figureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
