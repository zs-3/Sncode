package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class AutoCameraAddAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private boolean _autoCameraEaseIn;
    private boolean _autoCameraEaseOut;
    private int _autoCameraEndIndex;
    private short _autoCameraInterpolationID;
    private int _autoCameraStartIndex;
    private float[] _cameraProperties;
    private org.fortheloss.sticknodes.data.FrameData _frameDataRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private boolean _oldEaseIn;
    private boolean _oldEaseOut;
    private int _oldEndIndex;
    private short _oldInterpolationID;

    public AutoCameraAddAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2._autoCameraStartIndex = r0
            r2._autoCameraEndIndex = r0
            r2._autoCameraEaseIn = r0
            r2._autoCameraEaseOut = r0
            r2._autoCameraInterpolationID = r0
            r1 = -1
            r2._oldEndIndex = r1
            r2._oldEaseIn = r0
            r2._oldEaseOut = r0
            r2._oldInterpolationID = r0
            r2._animationScreenRef = r3
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._framesModuleRef = r0
            r1._frameDataRef = r0
            r1._cameraProperties = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.FrameData r5, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6) {
            r4 = this;
            r4._framesModuleRef = r6
            r4._frameDataRef = r5
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r5 = r5.getAutoCameraBundle()
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r4._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r0 = r5.getFrame1()
            int r6 = r6.getFrameIndex(r0)
            r4._autoCameraStartIndex = r6
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r6 = r4._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r0 = r5.getFrame2()
            int r6 = r6.getFrameIndex(r0)
            r4._autoCameraEndIndex = r6
            boolean r6 = r5.isEaseIn()
            r4._autoCameraEaseIn = r6
            boolean r6 = r5.isEaseOut()
            r4._autoCameraEaseOut = r6
            short r5 = r5.getInterpolationID()
            r4._autoCameraInterpolationID = r5
            int r5 = r4._autoCameraEndIndex
            int r6 = r4._autoCameraStartIndex
            int r5 = r5 - r6
            int r5 = r5 + (-1)
            int r5 = r5 * 4
            float[] r5 = new float[r5]
            r4._cameraProperties = r5
            int r6 = r6 + 1
            r5 = 0
        L42:
            int r0 = r4._autoCameraEndIndex
            if (r6 >= r0) goto L7e
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r4._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r0 = r0.getFrameAt(r6)
            org.fortheloss.sticknodes.data.FrameData r0 = (org.fortheloss.sticknodes.data.FrameData) r0
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r0.getFrameCamera()
            float[] r1 = r4._cameraProperties
            int r2 = r5 + 1
            float r3 = r0.getCameraOffsetX()
            r1[r5] = r3
            float[] r5 = r4._cameraProperties
            int r1 = r2 + 1
            float r3 = r0.getCameraOffsetY()
            r5[r2] = r3
            float[] r5 = r4._cameraProperties
            int r2 = r1 + 1
            float r3 = r0.getCameraRotationDeg()
            r5[r1] = r3
            float[] r5 = r4._cameraProperties
            int r1 = r2 + 1
            float r0 = r0.getCameraScale()
            r5[r2] = r0
            int r6 = r6 + 1
            r5 = r1
            goto L42
        L7e:
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.FrameData r1, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r2, int r3, boolean r4, boolean r5, short r6) {
            r0 = this;
            r0._oldEndIndex = r3
            r0._oldEaseIn = r4
            r0._oldEaseOut = r5
            r0._oldInterpolationID = r6
            r0.initialize(r1, r2)
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r7 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r7._framesModuleRef
            int r1 = r7._autoCameraStartIndex
            int r2 = r7._autoCameraEndIndex
            boolean r3 = r7._autoCameraEaseIn
            boolean r4 = r7._autoCameraEaseOut
            short r5 = r7._autoCameraInterpolationID
            r6 = 0
            r0.addAutoCameraToFrame(r1, r2, r3, r4, r5, r6)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r7._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._framesModuleRef = r0
            r1._frameDataRef = r0
            r1._cameraProperties = r0
            r0 = -1
            r1._oldEndIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r11 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r11._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r1 = r11._frameDataRef
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1 = r1.getAutoCameraBundle()
            r2 = 0
            r0.deleteAutoCameraFromFrame(r1, r2)
            int r0 = r11._autoCameraStartIndex
            int r0 = r0 + 1
        L10:
            int r1 = r11._autoCameraEndIndex
            if (r0 >= r1) goto L48
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r1 = r11._framesModuleRef
            org.fortheloss.sticknodes.data.IFrameData r1 = r1.getFrameAt(r0)
            org.fortheloss.sticknodes.data.FrameData r1 = (org.fortheloss.sticknodes.data.FrameData) r1
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            float[] r3 = r11._cameraProperties
            int r4 = r2 + 1
            r2 = r3[r2]
            r1.setCameraOffsetX(r2)
            float[] r2 = r11._cameraProperties
            int r3 = r4 + 1
            r2 = r2[r4]
            r1.setCameraOffsetY(r2)
            float[] r2 = r11._cameraProperties
            int r4 = r3 + 1
            r2 = r2[r3]
            r1.setCameraRotation(r2)
            float[] r2 = r11._cameraProperties
            int r3 = r4 + 1
            r2 = r2[r4]
            r1.setCameraScale(r2)
            int r0 = r0 + 1
            r2 = r3
            goto L10
        L48:
            int r6 = r11._oldEndIndex
            if (r6 < 0) goto L5a
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r11._framesModuleRef
            int r5 = r11._autoCameraStartIndex
            boolean r7 = r11._oldEaseIn
            boolean r8 = r11._oldEaseOut
            short r9 = r11._oldInterpolationID
            r10 = 0
            r4.addAutoCameraToFrame(r5, r6, r7, r8, r9, r10)
        L5a:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r11._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }
}
