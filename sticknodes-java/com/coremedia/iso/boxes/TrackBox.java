package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class TrackBox extends com.googlecode.mp4parser.AbstractContainerBox {
    public static final java.lang.String TYPE = "trak";
    private com.coremedia.iso.boxes.SampleTableBox sampleTableBox;

    public TrackBox() {
            r1 = this;
            java.lang.String r0 = "trak"
            r1.<init>(r0)
            return
    }

    public com.coremedia.iso.boxes.MediaBox getMediaBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.MediaBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.MediaBox r1 = (com.coremedia.iso.boxes.MediaBox) r1
            return r1
    }

    public com.coremedia.iso.boxes.SampleTableBox getSampleTableBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleTableBox r0 = r1.sampleTableBox
            if (r0 == 0) goto L5
            return r0
        L5:
            com.coremedia.iso.boxes.MediaBox r0 = r1.getMediaBox()
            if (r0 == 0) goto L18
            com.coremedia.iso.boxes.MediaInformationBox r0 = r0.getMediaInformationBox()
            if (r0 == 0) goto L18
            com.coremedia.iso.boxes.SampleTableBox r0 = r0.getSampleTableBox()
            r1.sampleTableBox = r0
            return r0
        L18:
            r0 = 0
            return r0
    }

    public com.coremedia.iso.boxes.TrackHeaderBox getTrackHeaderBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.TrackHeaderBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.TrackHeaderBox r1 = (com.coremedia.iso.boxes.TrackHeaderBox) r1
            return r1
    }

    @Override // com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.Container
    public void setBoxes(java.util.List<com.coremedia.iso.boxes.Box> r1) {
            r0 = this;
            super.setBoxes(r1)
            r1 = 0
            r0.sampleTableBox = r1
            return
    }
}
