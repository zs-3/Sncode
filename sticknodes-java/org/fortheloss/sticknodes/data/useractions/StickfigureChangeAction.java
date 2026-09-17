package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class StickfigureChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.data.useractions.StickfigureProperties _afterProperties;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.useractions.StickfigureProperties _beforeProperties;
    private int _lastChangedProperty;
    private boolean _needsAfterProperties;
    private float _startScale;
    private org.fortheloss.sticknodes.stickfigure.Stickfigure _stickfigureRef;

    public StickfigureChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._needsAfterProperties = r0
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1._startScale = r0
            r0 = 0
            r1._lastChangedProperty = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._stickfigureRef = r0
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r1 = r2._beforeProperties
            if (r1 == 0) goto Le
            r1.dispose()
            r2._beforeProperties = r0
        Le:
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r1 = r2._afterProperties
            if (r1 == 0) goto L17
            r1.dispose()
            r2._afterProperties = r0
        L17:
            return
    }

    public int getLastChangedProperty() {
            r1 = this;
            int r0 = r1._lastChangedProperty
            return r0
    }

    public org.fortheloss.sticknodes.stickfigure.Stickfigure getStickfigure() {
            r1 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r1._stickfigureRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r2) {
            r1 = this;
            r0 = 0
            r1.initialize(r2, r0)
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r1, float r2, int r3) {
            r0 = this;
            r0._startScale = r2
            r0.initialize(r1, r3)
            return
    }

    public void initialize(org.fortheloss.sticknodes.stickfigure.Stickfigure r1, int r2) {
            r0 = this;
            r0._stickfigureRef = r1
            r0._lastChangedProperty = r2
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r2 = r0._beforeProperties
            if (r2 != 0) goto L10
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r2 = new org.fortheloss.sticknodes.data.useractions.StickfigureProperties
            r2.<init>(r1)
            r0._beforeProperties = r2
            goto L13
        L10:
            r2.getProperties(r1)
        L13:
            float r1 = r0._startScale
            r2 = -915135504(0xffffffffc97423f0, float:-999999.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L25
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r2 = r0._beforeProperties
            r2.scale = r1
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r0._startScale = r1
        L25:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r1 = r2._afterProperties
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._stickfigureRef = r0
            r0 = 0
            r1._lastChangedProperty = r0
            r0 = 1
            r1._needsAfterProperties = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            boolean r0 = r2._needsAfterProperties
            if (r0 == 0) goto L1a
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r0 = r2._afterProperties
            if (r0 != 0) goto L12
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r0 = new org.fortheloss.sticknodes.data.useractions.StickfigureProperties
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            r0.<init>(r1)
            r2._afterProperties = r0
            goto L17
        L12:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            r0.getProperties(r1)
        L17:
            r0 = 0
            r2._needsAfterProperties = r0
        L1a:
            org.fortheloss.sticknodes.stickfigure.Stickfigure r0 = r2._stickfigureRef
            org.fortheloss.sticknodes.data.useractions.StickfigureProperties r1 = r2._beforeProperties
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            org.fortheloss.sticknodes.stickfigure.Stickfigure r1 = r2._stickfigureRef
            r0.onUndoRedoFigureAction(r1)
            return
    }
}
