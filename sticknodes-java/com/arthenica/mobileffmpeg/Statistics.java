package com.arthenica.mobileffmpeg;

/* loaded from: classes.dex */
public class Statistics {
    private double bitrate;
    private long executionId;
    private long size;
    private double speed;
    private int time;
    private float videoFps;
    private int videoFrameNumber;
    private float videoQuality;

    public Statistics() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.executionId = r0
            r2 = 0
            r4.videoFrameNumber = r2
            r3 = 0
            r4.videoFps = r3
            r4.videoQuality = r3
            r4.size = r0
            r4.time = r2
            r0 = 0
            r4.bitrate = r0
            r4.speed = r0
            return
    }

    public Statistics(long r1, int r3, float r4, float r5, long r6, int r8, double r9, double r11) {
            r0 = this;
            r0.<init>()
            r0.executionId = r1
            r0.videoFrameNumber = r3
            r0.videoFps = r4
            r0.videoQuality = r5
            r0.size = r6
            r0.time = r8
            r0.bitrate = r9
            r0.speed = r11
            return
    }

    public double getBitrate() {
            r2 = this;
            double r0 = r2.bitrate
            return r0
    }

    public long getExecutionId() {
            r2 = this;
            long r0 = r2.executionId
            return r0
    }

    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    public double getSpeed() {
            r2 = this;
            double r0 = r2.speed
            return r0
    }

    public int getTime() {
            r1 = this;
            int r0 = r1.time
            return r0
    }

    public float getVideoFps() {
            r1 = this;
            float r0 = r1.videoFps
            return r0
    }

    public int getVideoFrameNumber() {
            r1 = this;
            int r0 = r1.videoFrameNumber
            return r0
    }

    public float getVideoQuality() {
            r1 = this;
            float r0 = r1.videoQuality
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Statistics{"
            r0.append(r1)
            java.lang.String r1 = "executionId="
            r0.append(r1)
            long r1 = r3.executionId
            r0.append(r1)
            java.lang.String r1 = ", videoFrameNumber="
            r0.append(r1)
            int r1 = r3.videoFrameNumber
            r0.append(r1)
            java.lang.String r1 = ", videoFps="
            r0.append(r1)
            float r1 = r3.videoFps
            r0.append(r1)
            java.lang.String r1 = ", videoQuality="
            r0.append(r1)
            float r1 = r3.videoQuality
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.size
            r0.append(r1)
            java.lang.String r1 = ", time="
            r0.append(r1)
            int r1 = r3.time
            r0.append(r1)
            java.lang.String r1 = ", bitrate="
            r0.append(r1)
            double r1 = r3.bitrate
            r0.append(r1)
            java.lang.String r1 = ", speed="
            r0.append(r1)
            double r1 = r3.speed
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void update(com.arthenica.mobileffmpeg.Statistics r6) {
            r5 = this;
            if (r6 == 0) goto L6b
            long r0 = r6.getExecutionId()
            r5.executionId = r0
            int r0 = r6.getVideoFrameNumber()
            if (r0 <= 0) goto L14
            int r0 = r6.getVideoFrameNumber()
            r5.videoFrameNumber = r0
        L14:
            float r0 = r6.getVideoFps()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L23
            float r0 = r6.getVideoFps()
            r5.videoFps = r0
        L23:
            float r0 = r6.getVideoQuality()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L31
            float r0 = r6.getVideoQuality()
            r5.videoQuality = r0
        L31:
            long r0 = r6.getSize()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L41
            long r0 = r6.getSize()
            r5.size = r0
        L41:
            int r0 = r6.getTime()
            if (r0 <= 0) goto L4d
            int r0 = r6.getTime()
            r5.time = r0
        L4d:
            double r0 = r6.getBitrate()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5d
            double r0 = r6.getBitrate()
            r5.bitrate = r0
        L5d:
            double r0 = r6.getSpeed()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L6b
            double r0 = r6.getSpeed()
            r5.speed = r0
        L6b:
            return
    }
}
