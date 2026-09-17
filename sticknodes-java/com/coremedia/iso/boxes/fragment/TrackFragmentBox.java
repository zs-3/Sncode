package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class TrackFragmentBox extends com.googlecode.mp4parser.AbstractContainerBox {
    public static final java.lang.String TYPE = "traf";

    public TrackFragmentBox() {
            r1 = this;
            java.lang.String r0 = "traf"
            r1.<init>(r0)
            return
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r1 = (com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox) r1
            return r1
    }
}
