package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ModifyCameraStickfigureLockAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private int _figureID;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _frameCameraRef;
    private int _lastChangedProperty;
    private boolean _needsAfterProperies;
    private float _parallaxAfter;
    private float _parallaxBefore;
    private boolean _stickfigureScaleWithCameraBefore;

    public ModifyCameraStickfigureLockAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2._figureID = r0
            r0 = 1
            r2._needsAfterProperies = r0
            r0 = 0
            r2._stickfigureScaleWithCameraBefore = r0
            r1 = 0
            r2._parallaxBefore = r1
            r2._parallaxAfter = r1
            r2._lastChangedProperty = r0
            r2._animationScreenRef = r3
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._frameCameraRef = r0
            return
    }

    public int getFigureID() {
            r1 = this;
            int r0 = r1._figureID
            return r0
    }

    public int getLastChangedProperty() {
            r1 = this;
            int r0 = r1._lastChangedProperty
            return r0
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r2, int r3, int r4) {
            r1 = this;
            r1._frameCameraRef = r2
            r1._figureID = r3
            r1._lastChangedProperty = r4
            java.util.ArrayList r2 = r2.getLockedStickfigureBundles()
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L10:
            if (r3 < 0) goto L2a
            java.lang.Object r4 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r4 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r4
            int r4 = r4.getFigureID()
            int r0 = r1._figureID
            if (r4 != r0) goto L27
            java.lang.Object r2 = r2.get(r3)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r2 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r2
            goto L2b
        L27:
            int r3 = r3 + (-1)
            goto L10
        L2a:
            r2 = 0
        L2b:
            if (r2 == 0) goto L3a
            boolean r3 = r2.getFigureWillRotateAndScale()
            r1._stickfigureScaleWithCameraBefore = r3
            float r2 = r2.getParallax()
            r1._parallaxBefore = r2
            return
        L3a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Problem creating a ModifyCameraStickfigureLockAction, can't find correct lock bundle with figure."
            r2.<init>(r3)
            throw r2
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r4 = this;
            int r0 = r4._lastChangedProperty
            if (r0 != 0) goto Le
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r4._frameCameraRef
            int r1 = r4._figureID
            float r2 = r4._parallaxAfter
            r0.setLockedFigureParallax(r1, r2)
            goto L1b
        Le:
            r1 = 1
            if (r0 != r1) goto L1b
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r4._frameCameraRef
            int r2 = r4._figureID
            boolean r3 = r4._stickfigureScaleWithCameraBefore
            r1 = r1 ^ r3
            r0.setLockedFigureRotateAndScaleWithCamera(r2, r1)
        L1b:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r4._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._frameCameraRef = r0
            r0 = -1
            r1._figureID = r0
            r0 = 1
            r1._needsAfterProperies = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r6 = this;
            boolean r0 = r6._needsAfterProperies
            r1 = 1
            if (r0 == 0) goto L40
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r6._frameCameraRef
            java.util.ArrayList r0 = r0.getLockedStickfigureBundles()
            r2 = 0
            int r3 = r0.size()
            int r3 = r3 - r1
        L11:
            if (r3 < 0) goto L2c
            java.lang.Object r4 = r0.get(r3)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r4 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r4
            int r4 = r4.getFigureID()
            int r5 = r6._figureID
            if (r4 != r5) goto L29
            java.lang.Object r0 = r0.get(r3)
            r2 = r0
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r2 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r2
            goto L2c
        L29:
            int r3 = r3 + (-1)
            goto L11
        L2c:
            if (r2 == 0) goto L38
            r0 = 0
            r6._needsAfterProperies = r0
            float r0 = r2.getParallax()
            r6._parallaxAfter = r0
            goto L40
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Problem creating a ModifyCameraStickfigureLockAction, can't find correct lock bundle with figure."
            r0.<init>(r1)
            throw r0
        L40:
            int r0 = r6._lastChangedProperty
            if (r0 != 0) goto L4e
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r6._frameCameraRef
            int r1 = r6._figureID
            float r2 = r6._parallaxBefore
            r0.setLockedFigureParallax(r1, r2)
            goto L59
        L4e:
            if (r0 != r1) goto L59
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r6._frameCameraRef
            int r1 = r6._figureID
            boolean r2 = r6._stickfigureScaleWithCameraBefore
            r0.setLockedFigureRotateAndScaleWithCamera(r1, r2)
        L59:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }
}
