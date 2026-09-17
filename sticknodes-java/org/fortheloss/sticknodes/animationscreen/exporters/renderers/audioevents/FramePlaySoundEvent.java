package org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents;

/* loaded from: classes2.dex */
public class FramePlaySoundEvent extends org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent {
    public java.io.File mp3FileToEncode;
    public int soundFrameIndex;
    public float soundPan;
    public float soundPitch;
    public float soundVolume;

    public FramePlaySoundEvent(int r1, java.io.File r2, float r3, float r4, float r5) {
            r0 = this;
            r0.<init>()
            r0.soundFrameIndex = r1
            r0.mp3FileToEncode = r2
            r0.soundVolume = r3
            r0.soundPan = r4
            r0.soundPitch = r5
            return
    }

    @Override // org.fortheloss.sticknodes.animationscreen.exporters.renderers.audioevents.AudioEvent, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            r0 = 0
            r1.mp3FileToEncode = r0
            super.dispose()
            return
    }
}
