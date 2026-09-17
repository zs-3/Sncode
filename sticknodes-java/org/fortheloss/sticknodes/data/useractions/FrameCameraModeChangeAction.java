package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameCameraModeChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private byte _modeAfter;
    private byte _modeBefore;

    public FrameCameraModeChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
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
            return
    }

    public void initialize(byte r1) {
            r0 = this;
            r0._modeBefore = r1
            r1 = -1
            r0._modeAfter = r1
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r1 = this;
            byte r0 = r1._modeAfter
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r1._animationScreenRef
            r0.onUndoRedoFrameCameraAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = -1
            r1._modeAfter = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r2 = this;
            byte r0 = r2._modeAfter
            r1 = -1
            if (r0 != r1) goto Lb
            byte r0 = org.fortheloss.sticknodes.animationscreen.FrameCamera.getMode()
            r2._modeAfter = r0
        Lb:
            byte r0 = r2._modeBefore
            org.fortheloss.sticknodes.animationscreen.FrameCamera.setMode(r0)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameCameraAction()
            return
    }
}
