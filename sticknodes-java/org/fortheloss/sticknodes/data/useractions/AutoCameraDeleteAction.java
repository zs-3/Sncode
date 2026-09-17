package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class AutoCameraDeleteAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private boolean _autoCameraEaseIn;
    private boolean _autoCameraEaseOut;
    private int _autoCameraEndIndex;
    private short _autoCameraInterpolationID;
    private int _autoCameraStartIndex;
    private org.fortheloss.sticknodes.data.FrameData _frameDataRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;

    public AutoCameraDeleteAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._autoCameraStartIndex = r0
            r1._autoCameraEndIndex = r0
            r1._autoCameraEaseIn = r0
            r1._autoCameraEaseOut = r0
            r1._autoCameraInterpolationID = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._framesModuleRef = r0
            r1._frameDataRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r2, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3) {
            r1 = this;
            r1._framesModuleRef = r3
            org.fortheloss.sticknodes.data.FrameData r3 = r2.getFrame1()
            r1._frameDataRef = r3
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r1._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r0 = r2.getFrame1()
            int r3 = r3.getFrameIndex(r0)
            r1._autoCameraStartIndex = r3
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r1._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r0 = r2.getFrame2()
            int r3 = r3.getFrameIndex(r0)
            r1._autoCameraEndIndex = r3
            boolean r3 = r2.isEaseIn()
            r1._autoCameraEaseIn = r3
            boolean r3 = r2.isEaseOut()
            r1._autoCameraEaseOut = r3
            short r2 = r2.getInterpolationID()
            r1._autoCameraInterpolationID = r2
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r3 = this;
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r0 = r3._framesModuleRef
            org.fortheloss.sticknodes.data.FrameData r1 = r3._frameDataRef
            org.fortheloss.sticknodes.animationscreen.modules.AutoCameraBundle r1 = r1.getAutoCameraBundle()
            r2 = 0
            r0.deleteAutoCameraFromFrame(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r3._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._framesModuleRef = r0
            r1._frameDataRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
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
}
