package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class MediaBox extends org.jcodec.containers.mp4.boxes.NodeBox {
    public MediaBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.MediaBox createMediaBox() {
            org.jcodec.containers.mp4.boxes.MediaBox r0 = new org.jcodec.containers.mp4.boxes.MediaBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "mdia"
            return r0
    }
}
