package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameDelayChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private boolean _afterDelay;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private boolean _beforeDelay;
    private org.fortheloss.sticknodes.data.FrameData _frameDataRef;
    private boolean _needsAfterProperties;

    public FrameDelayChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._beforeDelay = r0
            r1._afterDelay = r0
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
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.FrameData r1) {
            r0 = this;
            r0._frameDataRef = r1
            boolean r1 = r1.isDelayed()
            r0._beforeDelay = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r2._frameDataRef
            boolean r1 = r2._afterDelay
            r0.setIsDelayed(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._frameDataRef = r0
            r0 = 0
            r1._beforeDelay = r0
            r1._afterDelay = r0
            r0 = 1
            r1._needsAfterProperties = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            boolean r0 = r2._needsAfterProperties
            if (r0 == 0) goto Lf
            org.fortheloss.sticknodes.data.FrameData r0 = r2._frameDataRef
            boolean r0 = r0.isDelayed()
            r2._afterDelay = r0
            r0 = 0
            r2._needsAfterProperties = r0
        Lf:
            org.fortheloss.sticknodes.data.FrameData r0 = r2._frameDataRef
            boolean r1 = r2._beforeDelay
            r0.setIsDelayed(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }
}
