package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ReplaceCameraFigureLocksAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] _afterCameraLockBundles;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] _beforeCameraLockBundles;
    private org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction.FigurePositionalData[] _beforeFigurePositionalData;
    private org.fortheloss.sticknodes.data.FrameData _frameDataRef;

    private static class FigurePositionalData {
        public float rotation;
        public float scale;
        public float spriteScaleY;
        public float x;
        public float y;

        public FigurePositionalData(float r1, float r2, float r3, float r4, float r5) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.scale = r3
                r0.spriteScaleY = r4
                r0.rotation = r5
                return
        }
    }

    public ReplaceCameraFigureLocksAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r1) {
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
            r1._frameDataRef = r0
            r1._beforeCameraLockBundles = r0
            r1._afterCameraLockBundles = r0
            r1._beforeFigurePositionalData = r0
            return
    }

    public void initialize(org.fortheloss.sticknodes.data.FrameData r12) {
            r11 = this;
            r11._frameDataRef = r12
            org.fortheloss.sticknodes.animationscreen.FrameCamera r12 = r12.getFrameCamera()
            java.util.ArrayList r12 = r12.getLockedStickfigureBundles()
            org.fortheloss.sticknodes.data.FrameData r0 = r11._frameDataRef
            java.util.ArrayList r0 = r0.getDrawableFigures()
            int r1 = r0.size()
            r2 = 0
            if (r12 == 0) goto L34
            int r3 = r12.size()
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r4 = new org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[r3]
            r11._beforeCameraLockBundles = r4
            r4 = 0
        L20:
            if (r4 >= r3) goto L34
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r5 = new org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle
            java.lang.Object r6 = r12.get(r4)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r6 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r6
            r5.<init>(r6)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r6 = r11._beforeCameraLockBundles
            r6[r4] = r5
            int r4 = r4 + 1
            goto L20
        L34:
            org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction$FigurePositionalData[] r12 = new org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction.FigurePositionalData[r1]
            r11._beforeFigurePositionalData = r12
        L38:
            if (r2 >= r1) goto L74
            java.lang.Object r12 = r0.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r12 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r12
            r3 = 1065353216(0x3f800000, float:1.0)
            boolean r4 = r12 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r4 == 0) goto L54
            r3 = r12
            org.fortheloss.sticknodes.sprite.SpriteRef r3 = (org.fortheloss.sticknodes.sprite.SpriteRef) r3
            float r4 = r3.getScaleX()
            float r3 = r3.getScaleY()
            r9 = r3
            r8 = r4
            goto L5b
        L54:
            float r4 = r12.getScale()
            r8 = r4
            r9 = 1065353216(0x3f800000, float:1.0)
        L5b:
            org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction$FigurePositionalData r3 = new org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction$FigurePositionalData
            float r6 = r12.getX()
            float r7 = r12.getY()
            float r10 = r12.getRotation()
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction$FigurePositionalData[] r12 = r11._beforeFigurePositionalData
            r12[r2] = r3
            int r2 = r2 + 1
            goto L38
        L74:
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r20 = this;
            r0 = r20
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            org.fortheloss.sticknodes.data.FrameData r2 = r0._frameDataRef
            java.util.ArrayList r15 = r2.getDrawableFigures()
            r1.removeLockedFigures()
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r2 = r0._afterCameraLockBundles
            int r14 = r2.length
            r2 = 0
            r13 = 0
        L16:
            if (r13 >= r14) goto L67
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r2 = r0._afterCameraLockBundles
            r2 = r2[r13]
            int r3 = r2.getFigureID()
            int r4 = r2.getLibraryID()
            int r5 = r2.getFigureType()
            float r6 = r2.getCamStartX()
            float r7 = r2.getCamStartY()
            float r8 = r2.getFigureStartScale()
            float r9 = r2.getCamStartRotation()
            float r10 = r2.getDistanceToStickfigure()
            float r11 = r2.getDistanceAngleOffset()
            float r12 = r2.getRotationOffset()
            float r16 = r2.getFigureStartScale()
            float r17 = r2.getParallax()
            boolean r18 = r2.getFigureWillRotateAndScale()
            r2 = r1
            r19 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            r0 = r15
            r15 = r18
            r2.addLockedFigure(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            int r13 = r19 + 1
            r15 = r0
            r14 = r16
            r0 = r20
            goto L16
        L67:
            r0 = r15
            r1.onFigureLockBundlesModified(r0)
            r0 = r20
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r1.onUndoRedoFrameAction()
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._frameDataRef = r0
            r1._beforeCameraLockBundles = r0
            r1._afterCameraLockBundles = r0
            r1._beforeFigurePositionalData = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r20 = this;
            r0 = r20
            org.fortheloss.sticknodes.data.FrameData r1 = r0._frameDataRef
            org.fortheloss.sticknodes.animationscreen.FrameCamera r1 = r1.getFrameCamera()
            java.util.ArrayList r2 = r1.getLockedStickfigureBundles()
            org.fortheloss.sticknodes.data.FrameData r3 = r0._frameDataRef
            java.util.ArrayList r15 = r3.getDrawableFigures()
            int r3 = r15.size()
            int r4 = r2.size()
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r5 = new org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[r4]
            r0._afterCameraLockBundles = r5
            r5 = 0
            r6 = 0
        L20:
            if (r6 >= r4) goto L34
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r7 = new org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle
            java.lang.Object r8 = r2.get(r6)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r8 = (org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle) r8
            r7.<init>(r8)
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r8 = r0._afterCameraLockBundles
            r8[r6] = r7
            int r6 = r6 + 1
            goto L20
        L34:
            r1.removeLockedFigures()
            r2 = 0
        L38:
            if (r2 >= r3) goto L6a
            org.fortheloss.sticknodes.data.useractions.ReplaceCameraFigureLocksAction$FigurePositionalData[] r4 = r0._beforeFigurePositionalData
            r4 = r4[r2]
            java.lang.Object r6 = r15.get(r2)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r6 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r6
            float r7 = r4.x
            float r8 = r4.y
            r6.setPosition(r7, r8)
            boolean r7 = r6 instanceof org.fortheloss.sticknodes.sprite.SpriteRef
            if (r7 == 0) goto L5d
            r7 = r6
            org.fortheloss.sticknodes.sprite.SpriteRef r7 = (org.fortheloss.sticknodes.sprite.SpriteRef) r7
            float r8 = r4.scale
            r7.setScaleX(r8)
            float r8 = r4.spriteScaleY
            r7.setScaleY(r8)
            goto L62
        L5d:
            float r7 = r4.scale
            r6.setScale(r7)
        L62:
            float r4 = r4.rotation
            r6.setFigureRotation(r4)
            int r2 = r2 + 1
            goto L38
        L6a:
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r2 = r0._beforeCameraLockBundles
            if (r2 == 0) goto Lc1
            int r14 = r2.length
            r13 = 0
        L70:
            if (r13 >= r14) goto Lc1
            org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle[] r2 = r0._beforeCameraLockBundles
            r2 = r2[r13]
            int r3 = r2.getFigureID()
            int r4 = r2.getLibraryID()
            int r5 = r2.getFigureType()
            float r6 = r2.getCamStartX()
            float r7 = r2.getCamStartY()
            float r8 = r2.getFigureStartScale()
            float r9 = r2.getCamStartRotation()
            float r10 = r2.getDistanceToStickfigure()
            float r11 = r2.getDistanceAngleOffset()
            float r12 = r2.getRotationOffset()
            float r16 = r2.getFigureStartScale()
            float r17 = r2.getParallax()
            boolean r18 = r2.getFigureWillRotateAndScale()
            r2 = r1
            r19 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            r0 = r15
            r15 = r18
            r2.addLockedFigure(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            int r13 = r19 + 1
            r15 = r0
            r14 = r16
            r0 = r20
            goto L70
        Lc1:
            r0 = r15
            r1.onFigureLockBundlesModified(r0)
            r0 = r20
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r1 = r0._animationScreenRef
            r1.onUndoRedoFrameAction()
            return
    }
}
