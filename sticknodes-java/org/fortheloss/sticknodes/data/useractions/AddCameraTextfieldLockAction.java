package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class AddCameraTextfieldLockAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _frameCameraRef;
    private org.fortheloss.sticknodes.TextfieldBox _textfieldBoxRef;

    public AddCameraTextfieldLockAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
            r0 = this;
            r0.<init>()
            r0._animationScreenRef = r1
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._frameCameraRef = r0
            r1._textfieldBoxRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r1, org.fortheloss.sticknodes.TextfieldBox r2) {
            r0 = this;
            r0._frameCameraRef = r1
            r0._textfieldBoxRef = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2._frameCameraRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._textfieldBoxRef
            r0.addLockedTextfield(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._frameCameraRef = r0
            r1._textfieldBoxRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2._frameCameraRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._textfieldBoxRef
            r0.removeLockedTextfield(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }
}
