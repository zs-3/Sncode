package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class AddTweenedFrameAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> _addedFrameDatasRef;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.animationscreen.modules.FramesModule _framesModuleRef;
    private boolean _ownsFrameDatas;
    private int _startFrameIndex;

    public AddTweenedFrameAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._ownsFrameDatas = r0
            r1._startFrameIndex = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            r0 = 0
            r3._animationScreenRef = r0
            r3._framesModuleRef = r0
            boolean r1 = r3._ownsFrameDatas
            if (r1 == 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r3._addedFrameDatasRef
            if (r1 == 0) goto L23
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L13:
            if (r1 < 0) goto L23
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r3._addedFrameDatasRef
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L13
        L23:
            r3._addedFrameDatasRef = r0
            return
    }

    public void initialize(int r5, int r6, org.fortheloss.sticknodes.animationscreen.modules.FramesModule r7) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4._addedFrameDatasRef = r0
            r0 = 0
            r4._ownsFrameDatas = r0
            org.fortheloss.sticknodes.animationscreen.FramesContainer r1 = r7.getFramesContainer()
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r1.frames
        L10:
            if (r0 >= r6) goto L22
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r4._addedFrameDatasRef
            int r3 = r5 + r0
            java.lang.Object r3 = r1.get(r3)
            org.fortheloss.sticknodes.data.IFrameData r3 = (org.fortheloss.sticknodes.data.IFrameData) r3
            r2.add(r3)
            int r0 = r0 + 1
            goto L10
        L22:
            r4._startFrameIndex = r5
            r4._framesModuleRef = r7
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r6 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r6._addedFrameDatasRef
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1d
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r3 = r6._framesModuleRef
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r4 = r6._addedFrameDatasRef
            java.lang.Object r4 = r4.get(r2)
            org.fortheloss.sticknodes.data.IFrameData r4 = (org.fortheloss.sticknodes.data.IFrameData) r4
            int r5 = r6._startFrameIndex
            int r5 = r5 + r2
            r3.addFrameAt(r4, r5)
            int r2 = r2 + 1
            goto L8
        L1d:
            r6._ownsFrameDatas = r1
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            r1.onUndoRedoFrameAction()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r6._animationScreenRef
            r1.onFrameAddDeleteAction()
            int r1 = r6._startFrameIndex
            int r0 = r0 + (-1)
            org.fortheloss.sticknodes.animationscreen.modules.HorizontalThumbnailContainer.setNewestFrameIndex(r1, r0)
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r3 = this;
            r0 = 0
            r3._framesModuleRef = r0
            boolean r1 = r3._ownsFrameDatas
            if (r1 == 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r1 = r3._addedFrameDatasRef
            if (r1 == 0) goto L21
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L11:
            if (r1 < 0) goto L21
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r2 = r3._addedFrameDatasRef
            java.lang.Object r2 = r2.get(r1)
            org.fortheloss.sticknodes.data.IFrameData r2 = (org.fortheloss.sticknodes.data.IFrameData) r2
            r2.dispose()
            int r1 = r1 + (-1)
            goto L11
        L21:
            r3._addedFrameDatasRef = r0
            r0 = 0
            r3._ownsFrameDatas = r0
            r3._startFrameIndex = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r5 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.data.IFrameData> r0 = r5._addedFrameDatasRef
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            r3 = 1
            if (r2 >= r0) goto L13
            org.fortheloss.sticknodes.animationscreen.modules.FramesModule r4 = r5._framesModuleRef
            r4.deleteFrame(r1, r3)
            int r2 = r2 + 1
            goto L8
        L13:
            r5._ownsFrameDatas = r3
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.onUndoRedoFrameAction()
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.onFrameAddDeleteAction()
            return
    }
}
