package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class Edit {
    private long duration;
    private long mediaTime;
    private float rate;

    public Edit(long r1, long r3, float r5) {
            r0 = this;
            r0.<init>()
            r0.duration = r1
            r0.mediaTime = r3
            r0.rate = r5
            return
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.duration
            return r0
    }

    public long getMediaTime() {
            r2 = this;
            long r0 = r2.mediaTime
            return r0
    }

    public float getRate() {
            r1 = this;
            float r0 = r1.rate
            return r0
    }

    public void setMediaTime(long r1) {
            r0 = this;
            r0.mediaTime = r1
            return
    }
}
