package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class ClipRegionBox extends org.jcodec.containers.mp4.boxes.Box {
    private short height;
    private short rgnSize;
    private short width;
    private short x;
    private short y;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "crgn"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            short r0 = r1.rgnSize
            r2.putShort(r0)
            short r0 = r1.y
            r2.putShort(r0)
            short r0 = r1.x
            r2.putShort(r0)
            short r0 = r1.height
            r2.putShort(r0)
            short r0 = r1.width
            r2.putShort(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            short r0 = r2.getShort()
            r1.rgnSize = r0
            short r0 = r2.getShort()
            r1.y = r0
            short r0 = r2.getShort()
            r1.x = r0
            short r0 = r2.getShort()
            r1.height = r0
            short r2 = r2.getShort()
            r1.width = r2
            return
    }
}
