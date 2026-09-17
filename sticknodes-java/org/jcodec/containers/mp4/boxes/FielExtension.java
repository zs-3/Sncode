package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class FielExtension extends org.jcodec.containers.mp4.boxes.Box {
    private int order;
    private int type;

    public static java.lang.String fourcc() {
            java.lang.String r0 = "fiel"
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void doWrite(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r1.type
            byte r0 = (byte) r0
            r2.put(r0)
            int r0 = r1.order
            byte r0 = (byte) r0
            r2.put(r0)
            return
    }

    public boolean isInterlaced() {
            r2 = this;
            int r0 = r2.type
            r1 = 2
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // org.jcodec.containers.mp4.boxes.Box
    public void parse(java.nio.ByteBuffer r2) {
            r1 = this;
            byte r0 = r2.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.type = r0
            boolean r0 = r1.isInterlaced()
            if (r0 == 0) goto L16
            byte r2 = r2.get()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.order = r2
        L16:
            return
    }
}
