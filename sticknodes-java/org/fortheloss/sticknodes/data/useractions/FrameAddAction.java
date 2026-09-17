package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameAddAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.data.IFrameData _addedFrameRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _frameIndex;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private boolean _ownsFrameData;

    public FrameAddAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._ownsFrameData = r0
            r1._frameIndex = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._framesModuleRef = r0
            boolean r1 = r2._ownsFrameData
            if (r1 == 0) goto L10
            org.fortheloss.sticknodes.data.IFrameData r1 = r2._addedFrameRef
            if (r1 == 0) goto L10
            r1.dispose()
        L10:
            r2._addedFrameRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.IFrameData r1, int r2, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3) {
            r0 = this;
            r0._addedFrameRef = r1
            r0._frameIndex = r2
            r0._framesModuleRef = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r3._addedFrameRef
            int r2 = r3._frameIndex
            r0.addFrameAt(r1, r2)
            r0 = 0
            r3._ownsFrameData = r0
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.onUndoRedoFrameAction()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.onFrameAddDeleteAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r2 = this;
            r0 = 0
            r2._framesModuleRef = r0
            boolean r1 = r2._ownsFrameData
            if (r1 == 0) goto Le
            org.fortheloss.sticknodes.data.IFrameData r1 = r2._addedFrameRef
            if (r1 == 0) goto Le
            r1.dispose()
        Le:
            r2._addedFrameRef = r0
            r0 = 0
            r2._ownsFrameData = r0
            r2._frameIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModuleRef
            r1 = 0
            r2 = 1
            r0.deleteFrame(r1, r2)
            r3._ownsFrameData = r2
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.onUndoRedoFrameAction()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.onFrameAddDeleteAction()
            return
    }
}
