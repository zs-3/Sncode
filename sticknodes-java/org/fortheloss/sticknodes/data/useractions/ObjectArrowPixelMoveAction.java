package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class ObjectArrowPixelMoveAction extends org.fortheloss.sticknodes.data.useractions.UserAction {
    private float _afterFigureX;
    private float _afterFigureY;
    private org.fortheloss.sticknodes.data.useractions.FrameCameraProperties _afterPropertiesCamera;
    private org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties _afterPropertiesTextfield;
    private org.fortheloss.sticknodes.animationscreen.AnimationScreen _animationScreenRef;
    private float _beforeFigureX;
    private float _beforeFigureY;
    private org.fortheloss.sticknodes.data.useractions.FrameCameraProperties _beforePropertiesCamera;
    private org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties _beforePropertiesTextfield;
    private org.fortheloss.sticknodes.animationscreen.FrameCamera _cameraRef;
    private org.fortheloss.sticknodes.animationscreen.IDrawableFigure _figureRef;
    private boolean _needsAfterProperties;
    private float _panDeltaX;
    private float _panDeltaY;
    private float _panStartX;
    private float _panStartY;
    private java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> _pannedFiguresRef;
    private java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> _pannedTextfieldsRef;
    private org.fortheloss.sticknodes.TextfieldBox _textfieldRef;

    public ObjectArrowPixelMoveAction(org.fortheloss.sticknodes.animationscreen.AnimationScreen r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._panStartX = r0
            r1._panStartY = r0
            r1._panDeltaX = r0
            r1._panDeltaY = r0
            r1._beforeFigureX = r0
            r1._beforeFigureY = r0
            r1._afterFigureX = r0
            r1._afterFigureY = r0
            r0 = 1
            r1._needsAfterProperties = r0
            r1._animationScreenRef = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            r0 = 0
            r2._animationScreenRef = r0
            r2._pannedFiguresRef = r0
            r2._pannedTextfieldsRef = r0
            r2._figureRef = r0
            r2._textfieldRef = r0
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r1 = r2._beforePropertiesTextfield
            if (r1 == 0) goto L14
            r1.dispose()
            r2._beforePropertiesTextfield = r0
        L14:
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r1 = r2._afterPropertiesTextfield
            if (r1 == 0) goto L1d
            r1.dispose()
            r2._afterPropertiesTextfield = r0
        L1d:
            r2._cameraRef = r0
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r2._beforePropertiesCamera
            if (r1 == 0) goto L25
            r2._beforePropertiesCamera = r0
        L25:
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r2._afterPropertiesCamera
            if (r1 == 0) goto L2b
            r2._afterPropertiesCamera = r0
        L2b:
            return
    }

    public org.fortheloss.sticknodes.animationscreen.FrameCamera getCamera() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r1._cameraRef
            return r0
    }

    public org.fortheloss.sticknodes.animationscreen.IDrawableFigure getFigure() {
            r1 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r1._figureRef
            return r0
    }

    public java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> getPannedFigures() {
            r1 = this;
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r1._pannedFiguresRef
            return r0
    }

    public org.fortheloss.sticknodes.TextfieldBox getTextfield() {
            r1 = this;
            org.fortheloss.sticknodes.TextfieldBox r0 = r1._textfieldRef
            return r0
    }

    public void initialize(java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3, java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r4) {
            r2 = this;
            r2._pannedFiguresRef = r3
            r2._pannedTextfieldsRef = r4
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2._panStartX = r4
            r2._panStartY = r4
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L11:
            if (r3 < 0) goto L3e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r2._pannedFiguresRef
            java.lang.Object r0 = r0.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r0
            boolean r1 = r0.isLocked()
            if (r1 != 0) goto L3b
            boolean r1 = r0.isJoined()
            if (r1 != 0) goto L3b
            byte r1 = r0.isLockedToCamera()
            if (r1 == 0) goto L2e
            goto L3b
        L2e:
            float r3 = r0.getX()
            r2._panStartX = r3
            float r3 = r0.getY()
            r2._panStartY = r3
            goto L3e
        L3b:
            int r3 = r3 + (-1)
            goto L11
        L3e:
            float r3 = r2._panDeltaX
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L75
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3 = r2._pannedTextfieldsRef
            if (r3 == 0) goto L75
            int r3 = r3.size()
            int r3 = r3 + (-1)
        L4e:
            if (r3 < 0) goto L75
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r4 = r2._pannedTextfieldsRef
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.TextfieldBox r4 = (org.fortheloss.sticknodes.TextfieldBox) r4
            boolean r0 = r4.isLocked()
            if (r0 != 0) goto L72
            boolean r0 = r4.isLockedToCamera()
            if (r0 == 0) goto L65
            goto L72
        L65:
            float r3 = r4.getX()
            r2._panStartX = r3
            float r3 = r4.getY()
            r2._panStartY = r3
            goto L75
        L72:
            int r3 = r3 + (-1)
            goto L4e
        L75:
            return
    }

    public void initialize(org.fortheloss.sticknodes.TextfieldBox r2) {
            r1 = this;
            r1._textfieldRef = r2
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r0 = r1._beforePropertiesTextfield
            if (r0 != 0) goto Le
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r0 = new org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties
            r0.<init>(r2)
            r1._beforePropertiesTextfield = r0
            goto L11
        Le:
            r0.getProperties(r2)
        L11:
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.FrameCamera r2) {
            r1 = this;
            r1._cameraRef = r2
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r1._beforePropertiesCamera
            if (r0 != 0) goto Le
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            r0.<init>(r2)
            r1._beforePropertiesCamera = r0
            goto L11
        Le:
            r0.getProperties(r2)
        L11:
            return
    }

    public void initialize(org.fortheloss.sticknodes.animationscreen.IDrawableFigure r2) {
            r1 = this;
            r1._figureRef = r2
            float r0 = r2.getX()
            r1._beforeFigureX = r0
            float r2 = r2.getY()
            r1._beforeFigureY = r2
            return
    }

    public void panningNeedsAfterProperties() {
            r1 = this;
            r0 = 1
            r1._needsAfterProperties = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void redo() {
            r5 = this;
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r5._figureRef
            if (r0 == 0) goto L14
            float r1 = r5._afterFigureX
            float r2 = r5._afterFigureY
            r0.setPosition(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r5._figureRef
            r0.onUndoRedoFigureAction(r1)
            goto Lb4
        L14:
            org.fortheloss.sticknodes.TextfieldBox r0 = r5._textfieldRef
            if (r0 == 0) goto L26
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r1 = r5._afterPropertiesTextfield
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r5._textfieldRef
            r0.onUndoRedoTextfieldAction(r1)
            goto Lb4
        L26:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r5._cameraRef
            if (r0 == 0) goto L36
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r5._afterPropertiesCamera
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.onUndoRedoFrameCameraAction()
            goto Lb4
        L36:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r5._pannedFiguresRef
            if (r0 == 0) goto Lb4
            float r1 = r5._panDeltaX
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto Lb4
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L49:
            if (r0 < 0) goto L7a
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r5._pannedFiguresRef
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r2 = r1.isLocked()
            if (r2 != 0) goto L77
            boolean r2 = r1.isJoined()
            if (r2 != 0) goto L77
            byte r2 = r1.isLockedToCamera()
            if (r2 == 0) goto L66
            goto L77
        L66:
            float r2 = r1.getX()
            float r3 = r5._panDeltaX
            float r2 = r2 + r3
            float r3 = r1.getY()
            float r4 = r5._panDeltaY
            float r3 = r3 + r4
            r1.setPosition(r2, r3)
        L77:
            int r0 = r0 + (-1)
            goto L49
        L7a:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r5._pannedTextfieldsRef
            if (r0 == 0) goto Laf
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L84:
            if (r0 < 0) goto Laf
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r1 = r5._pannedTextfieldsRef
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            boolean r2 = r1.isLocked()
            if (r2 != 0) goto Lac
            boolean r2 = r1.isLockedToCamera()
            if (r2 == 0) goto L9b
            goto Lac
        L9b:
            float r2 = r1.getX()
            float r3 = r5._panDeltaX
            float r2 = r2 + r3
            float r3 = r1.getY()
            float r4 = r5._panDeltaY
            float r3 = r3 + r4
            r1.setPosition(r2, r3)
        Lac:
            int r0 = r0 + (-1)
            goto L84
        Laf:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r5._animationScreenRef
            r0.onUndoRedoPanningAction()
        Lb4:
            return
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public void reset() {
            r1 = this;
            r0 = 0
            r1._figureRef = r0
            r1._textfieldRef = r0
            r1._cameraRef = r0
            r0 = 1
            r1._needsAfterProperties = r0
            return
    }

    @Override // org.fortheloss.sticknodes.data.useractions.UserAction
    public void undo() {
            r6 = this;
            boolean r0 = r6._needsAfterProperties
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2 = 1
            if (r0 == 0) goto Lc6
            r0 = 0
            r6._needsAfterProperties = r0
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r3 = r6._figureRef
            if (r3 == 0) goto L1f
            float r0 = r3.getX()
            r6._afterFigureX = r0
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r6._figureRef
            float r0 = r0.getY()
            r6._afterFigureY = r0
            goto Lc6
        L1f:
            org.fortheloss.sticknodes.TextfieldBox r3 = r6._textfieldRef
            if (r3 == 0) goto L35
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r0 = r6._afterPropertiesTextfield
            if (r0 != 0) goto L30
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r0 = new org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties
            r0.<init>(r3)
            r6._afterPropertiesTextfield = r0
            goto Lc6
        L30:
            r0.getProperties(r3)
            goto Lc6
        L35:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r3 = r6._cameraRef
            if (r3 == 0) goto L4b
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = r6._afterPropertiesCamera
            if (r0 != 0) goto L46
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r0 = new org.fortheloss.sticknodes.data.useractions.FrameCameraProperties
            r0.<init>(r3)
            r6._afterPropertiesCamera = r0
            goto Lc6
        L46:
            r0.getProperties(r3)
            goto Lc6
        L4b:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r3 = r6._pannedFiguresRef
            if (r3 == 0) goto Lc6
            float r4 = r6._panStartX
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto Lc6
            int r3 = r3.size()
            int r3 = r3 - r2
        L5a:
            if (r3 < 0) goto L8e
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r4 = r6._pannedFiguresRef
            java.lang.Object r4 = r4.get(r3)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r4 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r4
            boolean r5 = r4.isLocked()
            if (r5 != 0) goto L8b
            boolean r5 = r4.isJoined()
            if (r5 != 0) goto L8b
            byte r5 = r4.isLockedToCamera()
            if (r5 == 0) goto L77
            goto L8b
        L77:
            float r0 = r4.getX()
            float r3 = r6._panStartX
            float r0 = r0 - r3
            r6._panDeltaX = r0
            float r0 = r4.getY()
            float r3 = r6._panStartY
            float r0 = r0 - r3
            r6._panDeltaY = r0
            r0 = 1
            goto L8e
        L8b:
            int r3 = r3 + (-1)
            goto L5a
        L8e:
            if (r0 != 0) goto Lc6
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r6._pannedTextfieldsRef
            if (r0 == 0) goto Lc6
            int r0 = r0.size()
            int r0 = r0 - r2
        L99:
            if (r0 < 0) goto Lc6
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r3 = r6._pannedTextfieldsRef
            java.lang.Object r3 = r3.get(r0)
            org.fortheloss.sticknodes.TextfieldBox r3 = (org.fortheloss.sticknodes.TextfieldBox) r3
            boolean r4 = r3.isLocked()
            if (r4 != 0) goto Lc3
            boolean r4 = r3.isLockedToCamera()
            if (r4 == 0) goto Lb0
            goto Lc3
        Lb0:
            float r0 = r3.getX()
            float r4 = r6._panStartX
            float r0 = r0 - r4
            r6._panDeltaX = r0
            float r0 = r3.getY()
            float r3 = r6._panStartY
            float r0 = r0 - r3
            r6._panDeltaY = r0
            goto Lc6
        Lc3:
            int r0 = r0 + (-1)
            goto L99
        Lc6:
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r0 = r6._figureRef
            if (r0 == 0) goto Lda
            float r1 = r6._beforeFigureX
            float r2 = r6._beforeFigureY
            r0.setPosition(r1, r2)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = r6._figureRef
            r0.onUndoRedoFigureAction(r1)
            goto L175
        Lda:
            org.fortheloss.sticknodes.TextfieldBox r0 = r6._textfieldRef
            if (r0 == 0) goto Lec
            org.fortheloss.sticknodes.data.useractions.TextfieldBoxProperties r1 = r6._beforePropertiesTextfield
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            org.fortheloss.sticknodes.TextfieldBox r1 = r6._textfieldRef
            r0.onUndoRedoTextfieldAction(r1)
            goto L175
        Lec:
            org.fortheloss.sticknodes.animationscreen.FrameCamera r0 = r6._cameraRef
            if (r0 == 0) goto Lfc
            org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r1 = r6._beforePropertiesCamera
            r0.setProperties(r1)
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onUndoRedoFrameCameraAction()
            goto L175
        Lfc:
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r0 = r6._pannedFiguresRef
            if (r0 == 0) goto L175
            float r3 = r6._panStartX
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L175
            int r0 = r0.size()
            int r0 = r0 - r2
        L10b:
            if (r0 < 0) goto L13c
            java.util.ArrayList<org.fortheloss.sticknodes.animationscreen.IDrawableFigure> r1 = r6._pannedFiguresRef
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.animationscreen.IDrawableFigure r1 = (org.fortheloss.sticknodes.animationscreen.IDrawableFigure) r1
            boolean r3 = r1.isLocked()
            if (r3 != 0) goto L139
            boolean r3 = r1.isJoined()
            if (r3 != 0) goto L139
            byte r3 = r1.isLockedToCamera()
            if (r3 == 0) goto L128
            goto L139
        L128:
            float r3 = r1.getX()
            float r4 = r6._panDeltaX
            float r3 = r3 - r4
            float r4 = r1.getY()
            float r5 = r6._panDeltaY
            float r4 = r4 - r5
            r1.setPosition(r3, r4)
        L139:
            int r0 = r0 + (-1)
            goto L10b
        L13c:
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r0 = r6._pannedTextfieldsRef
            if (r0 == 0) goto L170
            int r0 = r0.size()
            int r0 = r0 - r2
        L145:
            if (r0 < 0) goto L170
            java.util.ArrayList<org.fortheloss.sticknodes.TextfieldBox> r1 = r6._pannedTextfieldsRef
            java.lang.Object r1 = r1.get(r0)
            org.fortheloss.sticknodes.TextfieldBox r1 = (org.fortheloss.sticknodes.TextfieldBox) r1
            boolean r2 = r1.isLocked()
            if (r2 != 0) goto L16d
            boolean r2 = r1.isLockedToCamera()
            if (r2 == 0) goto L15c
            goto L16d
        L15c:
            float r2 = r1.getX()
            float r3 = r6._panDeltaX
            float r2 = r2 - r3
            float r3 = r1.getY()
            float r4 = r6._panDeltaY
            float r3 = r3 - r4
            r1.setPosition(r2, r3)
        L16d:
            int r0 = r0 + (-1)
            goto L145
        L170:
            org.fortheloss.sticknodes.animationscreen.AnimationScreen r0 = r6._animationScreenRef
            r0.onUndoRedoPanningAction()
        L175:
            return
    }
}
