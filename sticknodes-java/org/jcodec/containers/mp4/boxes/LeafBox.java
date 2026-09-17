package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class LeafBox extends org.jcodec.containers.mp4.boxes.Box {
    private java.nio.ByteBuffer data;

    public LeafBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.LeafBox createLeafBox(org.jcodec.containers.mp4.boxes.Header r1, java.nio.ByteBuffer r2) {
            org.jcodec.containers.mp4.boxes.LeafBox r0 = new org.jcodec.containers.mp4.boxes.LeafBox
            r0.<init>(r1)
            r0.data = r2
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            org.jcodec.common.io.NIOUtils.write(r2, r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r3) {
            r2 = this;
            org.jcodec.containers.mp4.boxes.Header r0 = r2.header
            long r0 = r0.getBodySize()
            int r1 = (int) r0
            java.nio.ByteBuffer r3 = org.jcodec.common.io.NIOUtils.read(r3, r1)
            r2.data = r3
            return
    }
}
