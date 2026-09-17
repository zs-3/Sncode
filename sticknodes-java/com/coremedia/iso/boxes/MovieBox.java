package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class MovieBox extends com.googlecode.mp4parser.AbstractContainerBox {
    public static final java.lang.String TYPE = "moov";

    public MovieBox() {
            r1 = this;
            java.lang.String r0 = "moov"
            r1.<init>(r0)
            return
    }

    public com.coremedia.iso.boxes.MovieHeaderBox getMovieHeaderBox() {
            r3 = this;
            java.util.List r0 = r3.getBoxes()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L10
            r0 = 0
            return r0
        L10:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.MovieHeaderBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.MovieHeaderBox r1 = (com.coremedia.iso.boxes.MovieHeaderBox) r1
            return r1
    }

    public int getTrackCount() {
            r1 = this;
            java.lang.Class<com.coremedia.iso.boxes.TrackBox> r0 = com.coremedia.iso.boxes.TrackBox.class
            java.util.List r0 = r1.getBoxes(r0)
            int r0 = r0.size()
            return r0
    }

    public long[] getTrackNumbers() {
            r5 = this;
            java.lang.Class<com.coremedia.iso.boxes.TrackBox> r0 = com.coremedia.iso.boxes.TrackBox.class
            java.util.List r0 = r5.getBoxes(r0)
            int r1 = r0.size()
            long[] r1 = new long[r1]
            r2 = 0
        Ld:
            int r3 = r0.size()
            if (r2 < r3) goto L14
            return r1
        L14:
            java.lang.Object r3 = r0.get(r2)
            com.coremedia.iso.boxes.TrackBox r3 = (com.coremedia.iso.boxes.TrackBox) r3
            com.coremedia.iso.boxes.TrackHeaderBox r3 = r3.getTrackHeaderBox()
            long r3 = r3.getTrackId()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Ld
    }
}
