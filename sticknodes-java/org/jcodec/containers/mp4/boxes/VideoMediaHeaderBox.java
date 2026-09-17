package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class VideoMediaHeaderBox extends org.jcodec.containers.mp4.boxes.FullBox {
    int bOpColor;
    int gOpColor;
    int graphicsMode;
    int rOpColor;

    public VideoMediaHeaderBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox createVideoMediaHeaderBox(int r3, int r4, int r5, int r6) {
            org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox r0 = new org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.graphicsMode = r3
            r0.rOpColor = r4
            r0.gOpColor = r5
            r0.bOpColor = r6
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "vmhd"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    protected void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            super.doWrite(r2)
            int r0 = r1.graphicsMode
            short r0 = (short) r0
            r2.putShort(r0)
            int r0 = r1.rOpColor
            short r0 = (short) r0
            r2.putShort(r0)
            int r0 = r1.gOpColor
            short r0 = (short) r0
            r2.putShort(r0)
            int r0 = r1.bOpColor
            short r0 = (short) r0
            r2.putShort(r0)
            return
    }

    @Override // org.jcodec.containers.mp4.boxes.FullBox, org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            super.parse(r2)
            short r0 = r2.getShort()
            r1.graphicsMode = r0
            short r0 = r2.getShort()
            r1.rOpColor = r0
            short r0 = r2.getShort()
            r1.gOpColor = r0
            short r2 = r2.getShort()
            r1.bOpColor = r2
            return
    }
}
