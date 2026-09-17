package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class FullBox extends org.jcodec.containers.mp4.boxes.Box {
    protected int flags;
    protected byte version;

    public FullBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r4) {
            r3 = this;
            byte r0 = r3.version
            int r0 = r0 << 24
            int r1 = r3.flags
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r2
            r0 = r0 | r1
            r4.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            int r2 = r2.getInt()
            int r0 = r2 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1.version = r0
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r1.flags = r2
            return
    }

    public void setFlags(int r1) {
            r0 = this;
            r0.flags = r1
            return
    }
}
