package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class UrlBox extends org.jcodec.containers.mp4.boxes.FullBox {
    private java.lang.String url;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "url "
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r3) {
            r2 = this;
            super.doWrite(r3)
            java.lang.String r0 = "utf-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = r2.url
            if (r1 == 0) goto L1c
            byte[] r0 = org.jcodec.platform.Platform.getBytesForCharset(r1, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            org.jcodec.common.io.NIOUtils.write(r3, r0)
            r0 = 0
            r3.put(r0)
        L1c:
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            super.parse(r2)
            int r0 = r1.flags
            r0 = r0 & 1
            if (r0 == 0) goto La
            return
        La:
            java.lang.String r0 = "utf-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r2 = org.jcodec.common.io.NIOUtils.readNullTermStringCharset(r2, r0)
            r1.url = r2
            return
    }
}
