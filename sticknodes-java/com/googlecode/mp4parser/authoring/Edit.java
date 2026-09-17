package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public class Edit {
    private double mediaRate;
    private long mediaTime;
    private double segmentDuration;
    private long timeScale;

    public Edit(long r1, long r3, double r5, double r7) {
            r0 = this;
            r0.<init>()
            r0.timeScale = r3
            r0.segmentDuration = r7
            r0.mediaTime = r1
            r0.mediaRate = r5
            return
    }

    public double getMediaRate() {
            r2 = this;
            double r0 = r2.mediaRate
            return r0
    }

    public long getMediaTime() {
            r2 = this;
            long r0 = r2.mediaTime
            return r0
    }

    public double getSegmentDuration() {
            r2 = this;
            double r0 = r2.segmentDuration
            return r0
    }

    public long getTimeScale() {
            r2 = this;
            long r0 = r2.timeScale
            return r0
    }
}
