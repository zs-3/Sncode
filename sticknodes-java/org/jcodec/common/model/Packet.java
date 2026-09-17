package org.jcodec.common.model;

/* loaded from: classes2.dex */
public class Packet {
    public static final java.util.Comparator<org.jcodec.common.model.Packet> FRAME_ASC = null;
    public java.nio.ByteBuffer data;
    public int displayOrder;
    public long duration;
    public long frameNo;
    public boolean keyFrame;
    public long pts;
    public long timescale;


    static {
            org.jcodec.common.model.Packet$1 r0 = new org.jcodec.common.model.Packet$1
            r0.<init>()
            org.jcodec.common.model.Packet.FRAME_ASC = r0
            return
    }

    public Packet(java.nio.ByteBuffer r1, long r2, long r4, long r6, long r8, boolean r10, org.jcodec.common.model.TapeTimecode r11, int r12) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            r0.pts = r2
            r0.timescale = r4
            r0.duration = r6
            r0.frameNo = r8
            r0.keyFrame = r10
            r0.displayOrder = r12
            return
    }

    public java.nio.ByteBuffer getData() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            java.nio.ByteBuffer r0 = r0.duplicate()
            return r0
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.duration
            return r0
    }

    public long getPts() {
            r2 = this;
            long r0 = r2.pts
            return r0
    }

    public boolean isKeyFrame() {
            r1 = this;
            boolean r0 = r1.keyFrame
            return r0
    }
}
