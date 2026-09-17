package com.coremedia.iso.boxes.fragment;

/* loaded from: classes.dex */
public class MovieFragmentBox extends com.googlecode.mp4parser.AbstractContainerBox {
    public static final java.lang.String TYPE = "moof";

    public MovieFragmentBox() {
            r1 = this;
            java.lang.String r0 = "moof"
            r1.<init>(r0)
            return
    }

    public com.googlecode.mp4parser.DataSource getFileChannel() {
            r1 = this;
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource
            return r0
    }

    public java.util.List<java.lang.Long> getSyncSamples(com.coremedia.iso.boxes.SampleDependencyTypeBox r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r8 = r8.getEntries()
            java.util.Iterator r8 = r8.iterator()
            r1 = 1
            r3 = r1
        L10:
            boolean r5 = r8.hasNext()
            if (r5 != 0) goto L17
            return r0
        L17:
            java.lang.Object r5 = r8.next()
            com.coremedia.iso.boxes.SampleDependencyTypeBox$Entry r5 = (com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry) r5
            int r5 = r5.getSampleDependsOn()
            r6 = 2
            if (r5 != r6) goto L2b
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r0.add(r5)
        L2b:
            long r3 = r3 + r1
            goto L10
    }

    public int getTrackCount() {
            r2 = this;
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r0 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            r1 = 0
            java.util.List r0 = r2.getBoxes(r0, r1)
            int r0 = r0.size()
            return r0
    }

    public java.util.List<com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox> getTrackFragmentHeaderBoxes() {
            r2 = this;
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox> r0 = com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox.class
            r1 = 1
            java.util.List r0 = r2.getBoxes(r0, r1)
            return r0
    }

    public long[] getTrackNumbers() {
            r5 = this;
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackFragmentBox> r0 = com.coremedia.iso.boxes.fragment.TrackFragmentBox.class
            r1 = 0
            java.util.List r0 = r5.getBoxes(r0, r1)
            int r2 = r0.size()
            long[] r2 = new long[r2]
        Ld:
            int r3 = r0.size()
            if (r1 < r3) goto L14
            return r2
        L14:
            java.lang.Object r3 = r0.get(r1)
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r3 = (com.coremedia.iso.boxes.fragment.TrackFragmentBox) r3
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r3 = r3.getTrackFragmentHeaderBox()
            long r3 = r3.getTrackId()
            r2[r1] = r3
            int r1 = r1 + 1
            goto Ld
    }

    public java.util.List<com.coremedia.iso.boxes.fragment.TrackRunBox> getTrackRunBoxes() {
            r2 = this;
            java.lang.Class<com.coremedia.iso.boxes.fragment.TrackRunBox> r0 = com.coremedia.iso.boxes.fragment.TrackRunBox.class
            r1 = 1
            java.util.List r0 = r2.getBoxes(r0, r1)
            return r0
    }
}
