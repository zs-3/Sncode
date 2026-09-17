package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class MassFigureOrderChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private short _direction;
    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure _figureRef;
    private org.fortheloss.sticknodes.data.IFrameData _frameRef;
    private java.util.ArrayList<java.lang.Integer> _orderAfter;
    private java.util.ArrayList<java.lang.Integer> _orderBefore;

    public MassFigureOrderChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._direction = r0
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
            r1._orderBefore = r0
            r1._orderAfter = r0
            return
    }

    public short getDirection() {
            r1 = this;
            short r0 = r1._direction
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.IDrawableFigure getInitiatingFigure() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r1._figureRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r1, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2, short r3) {
            r0 = this;
            r0._frameRef = r1
            r0._figureRef = r2
            r0._direction = r3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0._orderBefore = r1
            org.fortheloss.sticknodes.data.IFrameData r2 = r0._frameRef
            r2.getFigureOrder(r1)
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r2._frameRef
            java.util.ArrayList<java.lang.Integer> r1 = r2._orderAfter
            r0.setFigureOrder(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r2._figureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._frameRef = r0
            r1._figureRef = r0
            r1._orderBefore = r0
            r1._orderAfter = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r2._orderAfter
            if (r0 != 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2._orderAfter = r0
            org.fortheloss.sticknodes.data.IFrameData r1 = r2._frameRef
            r1.getFigureOrder(r0)
        L10:
            org.fortheloss.sticknodes.data.IFrameData r0 = r2._frameRef
            java.util.ArrayList<java.lang.Integer> r1 = r2._orderBefore
            r0.setFigureOrder(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r2._figureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
