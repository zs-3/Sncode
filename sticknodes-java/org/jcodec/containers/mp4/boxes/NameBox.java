package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class NameBox extends org.jcodec.containers.mp4.boxes.Box {
    private java.lang.String name;

    private NameBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.NameBox createNameBox(java.lang.String r3) {
            org.jcodec.containers.mp4.boxes.NameBox r0 = new org.jcodec.containers.mp4.boxes.NameBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.name = r3
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "name"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r0 = r1.name
            byte[] r0 = org.jcodec.common.JCodecUtil.asciiString(r0)
            r2.put(r0)
            r0 = 0
            r2.putInt(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r1) {
            r0 = this;
            java.lang.String r1 = org.jcodec.common.io.NIOUtils.readNullTermString(r1)
            r0.name = r1
            return
    }
}
