package org.fortheloss.sticknodes.animationscreen;

/* loaded from: classes2.dex */
public class TextfieldCameraLockBundle {
    private float _camStartRotation;
    private float _camStartScale;
    private float _camStartX;
    private float _camStartY;
    private float _distanceAngleOffset;
    private float _distanceToTextfield;
    private float _rotationOffset;
    private int _textfieldID;
    private float _textfieldStartScale;

    public TextfieldCameraLockBundle(int r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
            r0 = this;
            r0.<init>()
            r0._textfieldID = r1
            r0._camStartX = r2
            r0._camStartY = r3
            r0._camStartScale = r4
            r0._camStartRotation = r5
            r0._distanceToTextfield = r6
            r0._distanceAngleOffset = r7
            r0._rotationOffset = r8
            r0._textfieldStartScale = r9
            return
    }

    public TextfieldCameraLockBundle(org.fortheloss.sticknodes.animationscreen.TextfieldCameraLockBundle r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1._textfieldID = r0
            r0 = 0
            r1._camStartX = r0
            r1._camStartY = r0
            r1._camStartScale = r0
            r1._camStartRotation = r0
            r1._distanceToTextfield = r0
            r1._distanceAngleOffset = r0
            r1._rotationOffset = r0
            r1._textfieldStartScale = r0
            int r0 = r2._textfieldID
            r1._textfieldID = r0
            float r0 = r2._camStartX
            r1._camStartX = r0
            float r0 = r2._camStartY
            r1._camStartY = r0
            float r0 = r2._camStartScale
            r1._camStartScale = r0
            float r0 = r2._camStartRotation
            r1._camStartRotation = r0
            float r0 = r2._distanceToTextfield
            r1._distanceToTextfield = r0
            float r0 = r2._distanceAngleOffset
            r1._distanceAngleOffset = r0
            float r0 = r2._rotationOffset
            r1._rotationOffset = r0
            float r2 = r2._textfieldStartScale
            r1._textfieldStartScale = r2
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

    public float getDistanceToTextfield() {
            r1 = this;
            float r0 = r1._distanceToTextfield
            return r0
    }

    public float getRotationOffset() {
            r1 = this;
            float r0 = r1._rotationOffset
            return r0
    }

    public int getTextfieldID() {
            r1 = this;
            int r0 = r1._textfieldID
            return r0
    }

    public float getTextfieldStartScale() {
            r1 = this;
            float r0 = r1._textfieldStartScale
            return r0
    }
}
