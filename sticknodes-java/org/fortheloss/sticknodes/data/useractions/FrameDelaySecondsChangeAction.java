package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameDelaySecondsChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private float _afterDelaySeconds;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private float _beforeDelaySeconds;
    private org.fortheloss.sticknodes.data.FrameData _frameDataRef;
    private boolean _needsAfterProperties;

    public FrameDelaySecondsChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._beforeDelaySeconds = r0
            r1._afterDelaySeconds = r0
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

    public org.fortheloss.sticknodes.data.FrameData getFrameData() {
            r1 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r1._frameDataRef
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.data.FrameData r1) {
            r0 = this;
            r0._frameDataRef = r1
            float r1 = r1.getDelaySeconds()
            r0._beforeDelaySeconds = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.data.FrameData r0 = r2._frameDataRef
            float r1 = r2._afterDelaySeconds
            r0.setDelaySeconds(r1)
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
            r1._beforeDelaySeconds = r0
            r1._afterDelaySeconds = r0
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
            float r0 = r0.getDelaySeconds()
            r2._afterDelaySeconds = r0
            r0 = 0
            r2._needsAfterProperties = r0
        Lf:
            org.fortheloss.sticknodes.data.FrameData r0 = r2._frameDataRef
            float r1 = r2._beforeDelaySeconds
            r0.setDelaySeconds(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }
}
