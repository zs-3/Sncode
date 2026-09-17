package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class RemoveCameraFigureLockAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private float _camStartRotation;
    private float _camStartScale;
    private float _camStartX;
    private float _camStartY;
    private float _distanceAngleOffset;
    private float _distanceToStickfigure;
    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure _figureRef;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _frameCameraRef;
    private float _parallax;
    private float _rotationOffset;
    private float _stickfigureStartScale;
    private boolean _stickfigureWillRotateAndScale;

    public RemoveCameraFigureLockAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._camStartX = r0
            r1._camStartY = r0
            r1._camStartScale = r0
            r1._camStartRotation = r0
            r1._distanceToStickfigure = r0
            r1._distanceAngleOffset = r0
            r1._rotationOffset = r0
            r1._stickfigureStartScale = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1._parallax = r0
            r0 = 0
            r1._stickfigureWillRotateAndScale = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1._animationScreenRef = r0
            r1._frameCameraRef = r0
            r1._figureRef = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r3, org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4) {
            r2 = this;
            r2._frameCameraRef = r3
            r2._figureRef = r4
            java.util.ArrayList r3 = r3.getLockedStickfigureBundles()
            int r4 = r3.size()
            int r4 = r4 + (-1)
        Le:
            if (r4 < 0) goto L2c
            java.lang.Object r0 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r0 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r0
            int r0 = r0.getFigureID()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r2._figureRef
            int r1 = r1.getID()
            if (r0 != r1) goto L29
            java.lang.Object r3 = r3.get(r4)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r3 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r3
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
            float r4 = r3.getDistanceToStickfigure()
            r2._distanceToStickfigure = r4
            float r4 = r3.getDistanceAngleOffset()
            r2._distanceAngleOffset = r4
            float r4 = r3.getRotationOffset()
            r2._rotationOffset = r4
            float r4 = r3.getFigureStartScale()
            r2._stickfigureStartScale = r4
            float r4 = r3.getParallax()
            r2._parallax = r4
            boolean r3 = r3.getFigureWillRotateAndScale()
            r2._stickfigureWillRotateAndScale = r3
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r2 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r2._frameCameraRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r2._figureRef
            r0.removeLockedFigure(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r2._animationScreenRef
            r0.onUndoRedoFrameAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._frameCameraRef = r0
            r1._figureRef = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r17 = this;
            r0 = r17
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r0._figureRef
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r2 == 0) goto Lb
            r2 = 2
            r6 = 2
            goto L14
        Lb:
            boolean r2 = r1 instanceof org.fortheloss.sticknodes.movieclip.MCReference
            if (r2 == 0) goto L12
            r2 = 1
            r6 = 1
            goto L14
        L12:
            r2 = 0
            r6 = 0
        L14:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r0._frameCameraRef
            int r4 = r1.getID()
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r0._figureRef
            int r5 = r1.getLibraryID()
            float r7 = r0._camStartX
            float r8 = r0._camStartY
            float r9 = r0._camStartScale
            float r10 = r0._camStartRotation
            float r11 = r0._distanceToStickfigure
            float r12 = r0._distanceAngleOffset
            float r13 = r0._rotationOffset
            float r14 = r0._stickfigureStartScale
            float r15 = r0._parallax
            boolean r1 = r0._stickfigureWillRotateAndScale
            r16 = r1
            r3.addLockedFigure(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r1.onUndoRedoFrameAction()
            return
    }
}
