package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameCameraChangeAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.data.useractions.FrameCameraProperties _afterProperties;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.data.useractions.FrameCameraProperties _beforeProperties;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _frameCameraRef;
    private int _lastChangedProperty;
    private boolean _needsAfterProperties;

    public FrameCameraChangeAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
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
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._frameCameraRef = r0
            r1._beforeProperties = r0
            r1._afterProperties = r0
            return
    }

    public org.fortheloss.sticknodes.animationscreen.FrameCamera getFrameCamera() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r1._frameCameraRef
            return r0
    }

    public int getLastChangedProperty() {
            r1 = this;
            int r0 = r1._lastChangedProperty
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r2) {
            r1 = this;
            r0 = 0
            r1.initialize(r2, r0)
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r15, float r16, float r17, float r18, int r19) {
            r14 = this;
            r0 = r14
            r1 = r15
            r0._frameCameraRef = r1
            r2 = r19
            r0._lastChangedProperty = r2
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2 = r0._beforeProperties
            if (r2 != 0) goto L43
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            float r7 = r15.getCameraRotationDeg()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r0._frameCameraRef
            boolean r8 = r1.isWidescreen()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r0._frameCameraRef
            boolean r9 = r1.isWobblingXY()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r0._frameCameraRef
            boolean r10 = r1.isWobblingRotation()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r0._frameCameraRef
            int r11 = r1.getWobbleXYIntensity()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r0._frameCameraRef
            float r12 = r1.getWobbleRotationIntensity()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r0._frameCameraRef
            float r13 = r1.getWobbleSpeed()
            r3 = r2
            r4 = r16
            r5 = r17
            r6 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0._beforeProperties = r2
            goto L91
        L43:
            r3 = r16
            r2.scale = r3
            r3 = r17
            r2.offsetX = r3
            r3 = r18
            r2.offsetY = r3
            float r1 = r15.getCameraRotationDeg()
            r2.rotationDeg = r1
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r0._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCameraRef
            boolean r2 = r2.isWidescreen()
            r1.isWidescreen = r2
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r0._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCameraRef
            boolean r2 = r2.isWobblingXY()
            r1.isWobblingXY = r2
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r0._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCameraRef
            boolean r2 = r2.isWobblingRotation()
            r1.isWobblingRotation = r2
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r0._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCameraRef
            int r2 = r2.getWobbleXYIntensity()
            r1.wobbleXYIntensity = r2
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r0._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCameraRef
            float r2 = r2.getWobbleRotationIntensity()
            r1.wobbleRotationIntensity = r2
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r0._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r2 = r0._frameCameraRef
            float r2 = r2.getWobbleSpeed()
            r1.wobbleSpeed = r2
        L91:
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r12, float r13, int r14) {
            r11 = this;
            r11._frameCameraRef = r12
            r11._lastChangedProperty = r14
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r14 = r11._beforeProperties
            if (r14 != 0) goto L46
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r14 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            float r1 = r12.getCameraScale()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r11._frameCameraRef
            float r2 = r12.getCameraOffsetX()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r11._frameCameraRef
            float r3 = r12.getCameraOffsetY()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r11._frameCameraRef
            boolean r5 = r12.isWidescreen()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r11._frameCameraRef
            boolean r6 = r12.isWobblingXY()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r11._frameCameraRef
            boolean r7 = r12.isWobblingRotation()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r11._frameCameraRef
            int r8 = r12.getWobbleXYIntensity()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r11._frameCameraRef
            float r9 = r12.getWobbleRotationIntensity()
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r11._frameCameraRef
            float r10 = r12.getWobbleSpeed()
            r0 = r14
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11._beforeProperties = r14
            goto L9e
        L46:
            float r12 = r12.getCameraScale()
            r14.scale = r12
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r12 = r11._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r14 = r11._frameCameraRef
            float r14 = r14.getCameraOffsetX()
            r12.offsetX = r14
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r12 = r11._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r14 = r11._frameCameraRef
            float r14 = r14.getCameraOffsetY()
            r12.offsetY = r14
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r12 = r11._beforeProperties
            r12.rotationDeg = r13
            org.fortheloss.sticknodes.animationscreen.FrameCamera r13 = r11._frameCameraRef
            boolean r13 = r13.isWidescreen()
            r12.isWidescreen = r13
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r12 = r11._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r13 = r11._frameCameraRef
            boolean r13 = r13.isWobblingXY()
            r12.isWobblingXY = r13
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r12 = r11._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r13 = r11._frameCameraRef
            boolean r13 = r13.isWobblingRotation()
            r12.isWobblingRotation = r13
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r12 = r11._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r13 = r11._frameCameraRef
            int r13 = r13.getWobbleXYIntensity()
            r12.wobbleXYIntensity = r13
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r12 = r11._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r13 = r11._frameCameraRef
            float r13 = r13.getWobbleRotationIntensity()
            r12.wobbleRotationIntensity = r13
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r12 = r11._beforeProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r13 = r11._frameCameraRef
            float r13 = r13.getWobbleSpeed()
            r12.wobbleSpeed = r13
        L9e:
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r1, int r2) {
            r0 = this;
            r0._frameCameraRef = r1
            r0._lastChangedProperty = r2
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2 = r0._beforeProperties
            if (r2 != 0) goto L10
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
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
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2._frameCameraRef
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r2._afterProperties
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameCameraAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._frameCameraRef = r0
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
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r2._afterProperties
            if (r0 != 0) goto L12
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r2._frameCameraRef
            r0.<init>(r1)
            r2._afterProperties = r0
            goto L17
        L12:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r2._frameCameraRef
            r0.getProperties(r1)
        L17:
            r0 = 0
            r2._needsAfterProperties = r0
        L1a:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2._frameCameraRef
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r2._beforeProperties
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameCameraAction()
            return
    }
}
