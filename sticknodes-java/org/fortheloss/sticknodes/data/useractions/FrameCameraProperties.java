package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameCameraProperties {
    public boolean isWidescreen;
    public boolean isWobblingRotation;
    public boolean isWobblingXY;
    public float offsetX;
    public float offsetY;
    public float rotationDeg;
    public float scale;
    public float wobbleRotationIntensity;
    public boolean wobbleScaleEnabled;
    public float wobbleSpeed;
    public int wobbleXYIntensity;

    public FrameCameraProperties(float r2, float r3, float r4, float r5, boolean r6, boolean r7, boolean r8, int r9, float r10, float r11) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.wobbleScaleEnabled = r0
            r1.scale = r2
            r1.offsetX = r3
            r1.offsetY = r4
            r1.rotationDeg = r5
            r1.isWidescreen = r6
            r1.isWobblingXY = r7
            r1.isWobblingRotation = r8
            r1.wobbleXYIntensity = r9
            r1.wobbleRotationIntensity = r10
            r1.wobbleSpeed = r11
            return
    }

    public FrameCameraProperties(org.fortheloss.sticknodes.animationscreen.FrameCamera r2) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.scale = r0
            r0 = 0
            r1.offsetX = r0
            r1.offsetY = r0
            r1.rotationDeg = r0
            r0 = 0
            r1.isWidescreen = r0
            r1.isWobblingXY = r0
            r1.isWobblingRotation = r0
            r0 = 1
            r1.wobbleScaleEnabled = r0
            r0 = 8
            r1.wobbleXYIntensity = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.wobbleRotationIntensity = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r1.wobbleSpeed = r0
            r2.getProperties(r1)
            return
    }

    public FrameCameraProperties(org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2) {
            r1 = this;
            r1.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.scale = r0
            r0 = 0
            r1.offsetX = r0
            r1.offsetY = r0
            r1.rotationDeg = r0
            r0 = 0
            r1.isWidescreen = r0
            r1.isWobblingXY = r0
            r1.isWobblingRotation = r0
            r0 = 1
            r1.wobbleScaleEnabled = r0
            r0 = 8
            r1.wobbleXYIntensity = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.wobbleRotationIntensity = r0
            r0 = 1077936128(0x40400000, float:3.0)
            r1.wobbleSpeed = r0
            r1.cloneFrom(r2)
            return
    }

    public void cloneFrom(org.fortheloss.sticknodes.data.useractions.FrameCameraProperties r2) {
            r1 = this;
            float r0 = r2.scale
            r1.scale = r0
            float r0 = r2.offsetX
            r1.offsetX = r0
            float r0 = r2.offsetY
            r1.offsetY = r0
            float r0 = r2.rotationDeg
            r1.rotationDeg = r0
            boolean r0 = r2.isWidescreen
            r1.isWidescreen = r0
            boolean r0 = r2.isWobblingXY
            r1.isWobblingXY = r0
            boolean r0 = r2.isWobblingRotation
            r1.isWobblingRotation = r0
            int r0 = r2.wobbleXYIntensity
            r1.wobbleXYIntensity = r0
            float r0 = r2.wobbleRotationIntensity
            r1.wobbleRotationIntensity = r0
            float r2 = r2.wobbleSpeed
            r1.wobbleSpeed = r2
            return
    }

    public void getProperties(org.fortheloss.sticknodes.animationscreen.FrameCamera r1) {
            r0 = this;
            r1.getProperties(r0)
            return
    }
}
