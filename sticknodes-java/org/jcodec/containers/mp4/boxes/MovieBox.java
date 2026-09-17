package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class MovieBox extends org.jcodec.containers.mp4.boxes.NodeBox {
    public MovieBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.MovieBox createMovieBox() {
            org.jcodec.containers.mp4.boxes.MovieBox r0 = new org.jcodec.containers.mp4.boxes.MovieBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "moov"
            return r0
    }

    public org.jcodec.containers.mp4.boxes.TrakBox[] getTracks() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.TrakBox> r0 = org.jcodec.containers.mp4.boxes.TrakBox.class
            java.lang.String r1 = "trak"
            org.jcodec.containers.mp4.boxes.Box[] r0 = org.jcodec.containers.mp4.boxes.Box.findAll(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.TrakBox[] r0 = (org.jcodec.containers.mp4.boxes.TrakBox[]) r0
            return r0
    }
}
