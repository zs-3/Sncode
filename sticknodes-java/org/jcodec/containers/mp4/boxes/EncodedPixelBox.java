package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class EncodedPixelBox extends org.jcodec.containers.mp4.boxes.ClearApertureBox {
    public EncodedPixelBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.EncodedPixelBox createEncodedPixelBox(int r3, int r4) {
            org.jcodec.containers.mp4.boxes.EncodedPixelBox r0 = new org.jcodec.containers.mp4.boxes.EncodedPixelBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = "enof"
            r1.<init>(r2)
            r0.<init>(r1)
            float r3 = (float) r3
            r0.width = r3
            float r3 = (float) r4
            r0.height = r3
            return r0
    }
}
