package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.data.useractions.FrameDataProperties _afterProperties;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.useractions.FrameDataProperties _beforeProperties;
    private org.fortheloss.sticknodes.data.IFrameData _frameDataRef;
    private int _lastChangedProperty;
    private boolean _needsAfterProperties;

    public FrameChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._needsAfterProperties = r0
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
            r2._frameDataRef = r0
            org.fortheloss.sticknodes.data.useractions.FrameDataProperties r1 = r2._beforeProperties
            if (r1 == 0) goto Le
            r1.dispose()
            r2._beforeProperties = r0
        Le:
            org.fortheloss.sticknodes.data.useractions.FrameDataProperties r1 = r2._afterProperties
            if (r1 == 0) goto L17
            r1.dispose()
            r2._afterProperties = r0
        L17:
            return
    }

    public org.fortheloss.sticknodes.data.IFrameData getFrameData() {
            r1 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r1._frameDataRef
            return r0
    }

    public int getLastChangedProperty() {
            r1 = this;
            int r0 = r1._lastChangedProperty
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r2) {
            r1 = this;
            r0 = 0
            r1.initialize(r2, r0)
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r1, int r2) {
            r0 = this;
            r0._frameDataRef = r1
            r0._lastChangedProperty = r2
            org.fortheloss.sticknodes.data.useractions.FrameDataProperties r2 = r0._beforeProperties
            if (r2 != 0) goto L10
            org.fortheloss.sticknodes.data.useractions.FrameDataProperties r2 = new org.fortheloss.sticknodes.data.useractions.FrameDataProperties
            r2.<init>(r1)
            r0._beforeProperties = r2
            goto L13
        L10:
            r2.getProperties(r1)
        L13:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.data.IFrameData r0 = r2._frameDataRef
            org.fortheloss.sticknodes.data.useractions.FrameDataProperties r1 = r2._afterProperties
            r0.setProperties(r1)
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
            org.fortheloss.sticknodes.data.useractions.FrameDataProperties r0 = r2._afterProperties
            if (r0 != 0) goto L12
            org.fortheloss.sticknodes.data.useractions.FrameDataProperties r0 = new org.fortheloss.sticknodes.data.useractions.FrameDataProperties
            org.fortheloss.sticknodes.data.IFrameData r1 = r2._frameDataRef
            r0.<init>(r1)
            r2._afterProperties = r0
            goto L17
        L12:
            org.fortheloss.sticknodes.data.IFrameData r1 = r2._frameDataRef
            r0.getProperties(r1)
        L17:
            r0 = 0
            r2._needsAfterProperties = r0
        L1a:
            org.fortheloss.sticknodes.data.IFrameData r0 = r2._frameDataRef
            org.fortheloss.sticknodes.data.useractions.FrameDataProperties r1 = r2._beforeProperties
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }
}
