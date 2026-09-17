package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class FigureCameraLockBundle {
    private float _camStartRotation;
    private float _camStartScale;
    private float _camStartX;
    private float _camStartY;
    private float _distanceAngleOffset;
    private float _distanceToStickfigure;
    private int _figureID;
    private float _figureStartScale;
    private int _figureType;
    private boolean _figureWillRotateAndScale;
    private int _libraryID;
    private float _parallax;
    private float _rotationOffset;

    public FigureCameraLockBundle(int r1, int r2, int r3, float r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, float r12, boolean r13) {
            r0 = this;
            r0.<init>()
            r0._figureID = r1
            r0._libraryID = r2
            r0._figureType = r3
            r0._camStartX = r4
            r0._camStartY = r5
            r0._camStartScale = r6
            r0._camStartRotation = r7
            r0._distanceToStickfigure = r8
            r0._distanceAngleOffset = r9
            r0._rotationOffset = r10
            r0._figureStartScale = r11
            r0._parallax = r12
            r0._figureWillRotateAndScale = r13
            return
    }

    public FigureCameraLockBundle(org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1._figureID = r0
            r1._libraryID = r0
            r0 = 0
            r1._camStartX = r0
            r1._camStartY = r0
            r1._camStartScale = r0
            r1._camStartRotation = r0
            r1._distanceToStickfigure = r0
            r1._distanceAngleOffset = r0
            r1._rotationOffset = r0
            r1._figureStartScale = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1._parallax = r0
            r0 = 0
            r1._figureWillRotateAndScale = r0
            r1._figureType = r0
            int r0 = r2._figureID
            r1._figureID = r0
            int r0 = r2._libraryID
            r1._libraryID = r0
            int r0 = r2._figureType
            r1._figureType = r0
            r1.copyDataFrom(r2)
            return
    }

    public void copyDataFrom(org.fortheloss.sticknodes.animationscreen.FigureCameraLockBundle r2) {
            r1 = this;
            float r0 = r2._camStartX
            r1._camStartX = r0
            float r0 = r2._camStartY
            r1._camStartY = r0
            float r0 = r2._camStartScale
            r1._camStartScale = r0
            float r0 = r2._camStartRotation
            r1._camStartRotation = r0
            float r0 = r2._distanceToStickfigure
            r1._distanceToStickfigure = r0
            float r0 = r2._distanceAngleOffset
            r1._distanceAngleOffset = r0
            float r0 = r2._rotationOffset
            r1._rotationOffset = r0
            float r0 = r2._figureStartScale
            r1._figureStartScale = r0
            float r0 = r2._parallax
            r1._parallax = r0
            boolean r2 = r2._figureWillRotateAndScale
            r1._figureWillRotateAndScale = r2
            return
    }

    public float getCamStartRotation() {
            r1 = this;
            float r0 = r1._camStartRotation
            return r0
    }

    public float getCamStartScale() {
            r1 = this;
            float r0 = r1._camStartScale
            return r0
    }

    public float getCamStartX() {
            r1 = this;
            float r0 = r1._camStartX
            return r0
    }

    public float getCamStartY() {
            r1 = this;
            float r0 = r1._camStartY
            return r0
    }

    public float getDistanceAngleOffset() {
            r1 = this;
            float r0 = r1._distanceAngleOffset
            return r0
    }

    public float getDistanceToStickfigure() {
            r1 = this;
            float r0 = r1._distanceToStickfigure
            return r0
    }

    public int getFigureID() {
            r1 = this;
            int r0 = r1._figureID
            return r0
    }

    public float getFigureStartScale() {
            r1 = this;
            float r0 = r1._figureStartScale
            return r0
    }

    public int getFigureType() {
            r1 = this;
            int r0 = r1._figureType
            return r0
    }

    public boolean getFigureWillRotateAndScale() {
            r1 = this;
            boolean r0 = r1._figureWillRotateAndScale
            return r0
    }

    public int getLibraryID() {
            r1 = this;
            int r0 = r1._libraryID
            return r0
    }

    public float getParallax() {
            r1 = this;
            float r0 = r1._parallax
            return r0
    }

    public float getRotationOffset() {
            r1 = this;
            float r0 = r1._rotationOffset
            return r0
    }

    public void setFigureWillRotateAndScale(boolean r1) {
            r0 = this;
            r0._figureWillRotateAndScale = r1
            return
    }

    public void setLibraryID(int r1) {
            r0 = this;
            r0._libraryID = r1
            return
    }

    public void setParallax(float r3) {
            r2 = this;
            r2._parallax = r3
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lb
            r2._parallax = r0
            goto L13
        Lb:
            r0 = 1073741824(0x40000000, float:2.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L13
            r2._parallax = r0
        L13:
            float r3 = r2._parallax
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r0
            r2._parallax = r3
            return
    }
}
