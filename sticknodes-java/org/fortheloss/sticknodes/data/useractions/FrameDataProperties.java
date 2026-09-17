package org.fortheloss.sticknodes.data.useractions;

/* loaded from: classes2.dex */
public class FrameDataProperties implements com.badlogic.gdx.utils.Disposable {
    public com.badlogic.gdx.graphics.Color backgroundColor;
    public boolean cameraIsMovingDuringDelay;
    public boolean cameraMoveDuringDelayEaseIn;
    public boolean cameraMoveDuringDelayEaseOut;
    public short cameraMoveDuringDelayInterpolationID;
    public float delaySeconds;
    public com.badlogic.gdx.graphics.Color gradientColor;
    public boolean isDelayed;
    public boolean isExpandedGradient;
    public boolean isRepeating;
    public boolean isTweened;
    public boolean isUsingGradient;
    public boolean isUsingImageBackground;
    public boolean isUsingSlowMotionTweenedFrames;
    public int repeatGoBackFrames;
    public int repeatLoops;
    public int slowMotionTweenedFrames;
    public int soundLibraryID;
    public float soundPan;
    public float soundPitch;
    public float soundVolume;
    public boolean useTweenPropertiesDuringRepeating;
    public boolean willStopSounds;

    public FrameDataProperties(org.fortheloss.sticknodes.data.IFrameData r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.isTweened = r0
            r3.isUsingImageBackground = r0
            r3.isUsingGradient = r0
            r3.isExpandedGradient = r0
            r3.willStopSounds = r0
            r3.isDelayed = r0
            r1 = 0
            r3.delaySeconds = r1
            r3.isUsingSlowMotionTweenedFrames = r0
            r2 = 1
            r3.slowMotionTweenedFrames = r2
            r3.isRepeating = r0
            r3.repeatGoBackFrames = r2
            r3.repeatLoops = r2
            r3.useTweenPropertiesDuringRepeating = r0
            r3.cameraIsMovingDuringDelay = r0
            r3.cameraMoveDuringDelayEaseIn = r0
            r3.cameraMoveDuringDelayEaseOut = r0
            r3.cameraMoveDuringDelayInterpolationID = r0
            r0 = -1
            r3.soundLibraryID = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.soundVolume = r0
            r3.soundPan = r1
            r3.soundPitch = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r3.backgroundColor = r0
            com.badlogic.gdx.graphics.Color r0 = new com.badlogic.gdx.graphics.Color
            r0.<init>()
            r3.gradientColor = r0
            r3.getProperties(r4)
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.backgroundColor = r0
            r1.gradientColor = r0
            return
    }

    public void getProperties(org.fortheloss.sticknodes.data.IFrameData r1) {
            r0 = this;
            r1.getProperties(r0)
            return
    }
}
