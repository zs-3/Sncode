package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameStickfigureOrderSetAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private java.lang.Integer[] _afterIDsOrder;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private java.lang.Integer[] _beforeIDsOrder;
    private org.fortheloss.sticknodes.data.IFrameData _frameDataRef;
    private boolean _needsAfterProperties;

    public FrameStickfigureOrderSetAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._needsAfterProperties = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._frameDataRef = r0
            r1._beforeIDsOrder = r0
            r1._afterIDsOrder = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r5) {
            r4 = this;
            r4._frameDataRef = r5
            java.util.ArrayList r5 = r5.getDrawableFigures()
            int r0 = r5.size()
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r4._beforeIDsOrder = r1
            r1 = 0
        Lf:
            if (r1 >= r0) goto L26
            java.lang.Integer[] r2 = r4._beforeIDsOrder
            java.lang.Object r3 = r5.get(r1)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r3
            int r3 = r3.getID()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lf
        L26:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r2._frameDataRef
            java.lang.Integer[] r1 = r2._afterIDsOrder
            r0.setFigureOrderUndoRedo(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._frameDataRef = r0
            r1 = 1
            r2._needsAfterProperties = r1
            r2._beforeIDsOrder = r0
            r2._afterIDsOrder = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r6 = this;
            boolean r0 = r6._needsAfterProperties
            if (r0 == 0) goto L2d
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._frameDataRef
            java.util.ArrayList r0 = r0.getDrawableFigures()
            int r1 = r0.size()
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            r6._afterIDsOrder = r2
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r1) goto L2b
            java.lang.Integer[] r4 = r6._afterIDsOrder
            java.lang.Object r5 = r0.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r5 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r5
            int r5 = r5.getID()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L2b:
            r6._needsAfterProperties = r2
        L2d:
            org.fortheloss.sticknodes.data.IFrameData r0 = r6._frameDataRef
            java.lang.Integer[] r1 = r6._beforeIDsOrder
            r0.setFigureOrderUndoRedo(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }
}
