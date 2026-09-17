package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class FormatBox extends org.jcodec.containers.mp4.boxes.Box {
    private java.lang.String fmt;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "frma"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.fmt
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r2.put(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            r0 = 4
            java.lang.String r2 = org.jcodec.common.io.NIOUtils.readString(r2, r0)
            r1.fmt = r2
            return
    }
}
