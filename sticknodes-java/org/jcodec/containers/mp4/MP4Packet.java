package org.jcodec.containers.mp4;

/* loaded from: classes2.dex */
public class MP4Packet extends org.jcodec.common.model.Packet {
    private int entryNo;
    private long fileOff;
    private long mediaPts;
    private boolean psync;
    private int size;

    public MP4Packet(java.nio.ByteBuffer r4, long r5, long r7, long r9, long r11, boolean r13, org.jcodec.common.model.TapeTimecode r14, int r15, long r16, int r18, long r19, int r21, boolean r22) {
            r3 = this;
            r0 = r3
            r3.<init>(r4, r5, r7, r9, r11, r13, r14, r15)
            r1 = r16
            r0.mediaPts = r1
            r1 = r18
            r0.entryNo = r1
            r1 = r19
            r0.fileOff = r1
            r1 = r21
            r0.size = r1
            r1 = r22
            r0.psync = r1
            return
    }

    public static org.jcodec.containers.mp4.MP4Packet createMP4Packet(java.nio.ByteBuffer r21, long r22, long r24, long r26, long r28, boolean r30, org.jcodec.common.model.TapeTimecode r31, int r32, long r33, int r35) {
            r1 = r21
            r2 = r22
            r4 = r24
            r6 = r26
            r8 = r28
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r15 = r35
            org.jcodec.containers.mp4.MP4Packet r20 = new org.jcodec.containers.mp4.MP4Packet
            r0 = r20
            r16 = 0
            r18 = 0
            r19 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12, r13, r15, r16, r18, r19)
            return r20
    }

    public int getEntryNo() {
            r1 = this;
            int r0 = r1.entryNo
            return r0
    }
}
