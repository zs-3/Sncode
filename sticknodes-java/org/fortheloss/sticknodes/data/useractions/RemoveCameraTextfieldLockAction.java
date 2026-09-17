package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class RemoveCameraTextfieldLockAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private float _camStartRotation;
    private float _camStartScale;
    private float _camStartX;
    private float _camStartY;
    private float _distanceAngleOffset;
    private float _distanceToTextfield;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _frameCameraRef;
    private float _rotationOffset;
    private org.fortheloss.sticknodes.TextfieldBox _textfieldBoxRef;
    private float _textfieldStartScale;

    public RemoveCameraTextfieldLockAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._camStartX = r0
            r1._camStartY = r0
            r1._camStartScale = r0
            r1._camStartRotation = r0
            r1._distanceToTextfield = r0
            r1._distanceAngleOffset = r0
            r1._rotationOffset = r0
            r1._textfieldStartScale = r0
            r1._animationScreenRef = r2
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

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r3, org.fortheloss.sticknodes.TextfieldBox r4) {
            r2 = this;
            r2._frameCameraRef = r3
            r2._textfieldBoxRef = r4
            java.util.ArrayList r3 = r3.getLockedTextfieldBundles()
            int r4 = r3.size()
            int r4 = r4 + (-1)
        Le:
            if (r4 < 0) goto L2c
            java.lang.Object r0 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r0 = (org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle) r0
            int r0 = r0.getTextfieldID()
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._textfieldBoxRef
            int r1 = r1.getID()
            if (r0 != r1) goto L29
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r3 = (org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle) r3
            goto L2d
        L29:
            int r4 = r4 + (-1)
            goto Le
        L2c:
            r3 = 0
        L2d:
            float r4 = r3.getCamStartX()
            r2._camStartX = r4
            float r4 = r3.getCamStartY()
            r2._camStartY = r4
            float r4 = r3.getCamStartScale()
            r2._camStartScale = r4
            float r4 = r3.getCamStartRotation()
            r2._camStartRotation = r4
            float r4 = r3.getDistanceToTextfield()
            r2._distanceToTextfield = r4
            float r4 = r3.getDistanceAngleOffset()
            r2._distanceAngleOffset = r4
            float r4 = r3.getRotationOffset()
            r2._rotationOffset = r4
            float r3 = r3.getTextfieldStartScale()
            r2._textfieldStartScale = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2._frameCameraRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r2._textfieldBoxRef
            r0.removeLockedTextfield(r1)
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
            r10 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r10._frameCameraRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r10._textfieldBoxRef
            int r1 = r1.getID()
            float r2 = r10._camStartX
            float r3 = r10._camStartY
            float r4 = r10._camStartScale
            float r5 = r10._camStartRotation
            float r6 = r10._distanceToTextfield
            float r7 = r10._distanceAngleOffset
            float r8 = r10._rotationOffset
            float r9 = r10._textfieldStartScale
            r0.addLockedTextfield(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r10._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }
}
