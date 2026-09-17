package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class MovieExtendsHeaderBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private int fragmentDuration;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "mehd"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            super.doWrite(r2)
            int r0 = r1.fragmentDuration
            r2.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r1) {
            r0 = this;
            super.parse(r1)
            int r1 = r1.getInt()
            r0.fragmentDuration = r1
            return
    }
}
