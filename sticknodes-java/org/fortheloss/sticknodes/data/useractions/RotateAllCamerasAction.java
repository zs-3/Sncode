package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class RotateAllCamerasAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private float _degrees;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;

    public RotateAllCamerasAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._degrees = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._framesModuleRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1, float r2) {
            r0 = this;
            r0._framesModuleRef = r1
            r0._degrees = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModuleRef
            float r1 = r3._degrees
            r2 = 0
            r0.rotateAllCameras(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.onUndoRedoGeneralAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._framesModuleRef = r0
            r0 = 0
            r1._degrees = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModuleRef
            float r1 = r3._degrees
            float r1 = -r1
            r2 = 0
            r0.rotateAllCameras(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.onUndoRedoGeneralAction()
            return
    }
}
