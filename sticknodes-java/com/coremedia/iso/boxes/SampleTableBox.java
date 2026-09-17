package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class SampleTableBox extends com.googlecode.mp4parser.AbstractContainerBox {
    public static final java.lang.String TYPE = "stbl";
    private com.coremedia.iso.boxes.SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
            r1 = this;
            java.lang.String r0 = "stbl"
            r1.<init>(r0)
            return
    }

    public com.coremedia.iso.boxes.ChunkOffsetBox getChunkOffsetBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.ChunkOffsetBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.ChunkOffsetBox r1 = (com.coremedia.iso.boxes.ChunkOffsetBox) r1
            return r1
    }

    public com.coremedia.iso.boxes.CompositionTimeToSample getCompositionTimeToSample() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.CompositionTimeToSample
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.CompositionTimeToSample r1 = (com.coremedia.iso.boxes.CompositionTimeToSample) r1
            return r1
    }

    public com.coremedia.iso.boxes.SampleDependencyTypeBox getSampleDependencyTypeBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.SampleDependencyTypeBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.SampleDependencyTypeBox r1 = (com.coremedia.iso.boxes.SampleDependencyTypeBox) r1
            return r1
    }

    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.SampleDescriptionBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = (com.coremedia.iso.boxes.SampleDescriptionBox) r1
            return r1
    }

    public com.coremedia.iso.boxes.SampleSizeBox getSampleSizeBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.SampleSizeBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.SampleSizeBox r1 = (com.coremedia.iso.boxes.SampleSizeBox) r1
            return r1
    }

    public com.coremedia.iso.boxes.SampleToChunkBox getSampleToChunkBox() {
            r3 = this;
            com.coremedia.iso.boxes.SampleToChunkBox r0 = r3.sampleToChunkBox
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.List r0 = r3.getBoxes()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L15
            r0 = 0
            return r0
        L15:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.SampleToChunkBox
            if (r2 == 0) goto Ld
            com.coremedia.iso.boxes.SampleToChunkBox r1 = (com.coremedia.iso.boxes.SampleToChunkBox) r1
            r3.sampleToChunkBox = r1
            return r1
    }

    public com.coremedia.iso.boxes.SyncSampleBox getSyncSampleBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.SyncSampleBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.SyncSampleBox r1 = (com.coremedia.iso.boxes.SyncSampleBox) r1
            return r1
    }

    public com.coremedia.iso.boxes.TimeToSampleBox getTimeToSampleBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.TimeToSampleBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.TimeToSampleBox r1 = (com.coremedia.iso.boxes.TimeToSampleBox) r1
            return r1
    }
}
