package org.jcodec.containers.mp4.boxes;

/* loaded from: classes2.dex */
public class TrakBox extends org.jcodec.containers.mp4.boxes.NodeBox {
    public TrakBox(org.jcodec.containers.mp4.boxes.Header r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.jcodec.containers.mp4.boxes.TrakBox createTrakBox() {
            org.jcodec.containers.mp4.boxes.TrakBox r0 = new org.jcodec.containers.mp4.boxes.TrakBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = fourcc()
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String fourcc() {
            java.lang.String r0 = "trak"
            return r0
    }

    public org.jcodec.containers.mp4.boxes.ChunkOffsets64Box getCo64() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.ChunkOffsets64Box> r0 = org.jcodec.containers.mp4.boxes.ChunkOffsets64Box.class
            java.lang.String r1 = "mdia.minf.stbl.co64"
            java.lang.String[] r1 = org.jcodec.containers.mp4.boxes.Box.path(r1)
            org.jcodec.containers.mp4.boxes.Box r0 = org.jcodec.containers.mp4.boxes.Box.findFirstPath(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.ChunkOffsets64Box r0 = (org.jcodec.containers.mp4.boxes.ChunkOffsets64Box) r0
            return r0
    }

    public org.jcodec.containers.mp4.boxes.CompositionOffsetsBox getCtts() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox> r0 = org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.class
            java.lang.String r1 = "mdia.minf.stbl.ctts"
            java.lang.String[] r1 = org.jcodec.containers.mp4.boxes.Box.path(r1)
            org.jcodec.containers.mp4.boxes.Box r0 = org.jcodec.containers.mp4.boxes.Box.findFirstPath(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox r0 = (org.jcodec.containers.mp4.boxes.CompositionOffsetsBox) r0
            return r0
    }

    public java.util.List<org.jcodec.containers.mp4.boxes.Edit> getEdits() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.EditListBox> r0 = org.jcodec.containers.mp4.boxes.EditListBox.class
            java.lang.String r1 = "edts.elst"
            java.lang.String[] r1 = org.jcodec.containers.mp4.boxes.Box.path(r1)
            org.jcodec.containers.mp4.boxes.Box r0 = org.jcodec.containers.mp4.boxes.Box.findFirstPath(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.EditListBox r0 = (org.jcodec.containers.mp4.boxes.EditListBox) r0
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            java.util.List r0 = r0.getEdits()
            return r0
    }

    public org.jcodec.containers.mp4.boxes.ChunkOffsetsBox getStco() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.ChunkOffsetsBox> r0 = org.jcodec.containers.mp4.boxes.ChunkOffsetsBox.class
            java.lang.String r1 = "mdia.minf.stbl.stco"
            java.lang.String[] r1 = org.jcodec.containers.mp4.boxes.Box.path(r1)
            org.jcodec.containers.mp4.boxes.Box r0 = org.jcodec.containers.mp4.boxes.Box.findFirstPath(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.ChunkOffsetsBox r0 = (org.jcodec.containers.mp4.boxes.ChunkOffsetsBox) r0
            return r0
    }

    public org.jcodec.containers.mp4.boxes.SampleToChunkBox getStsc() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.SampleToChunkBox> r0 = org.jcodec.containers.mp4.boxes.SampleToChunkBox.class
            java.lang.String r1 = "mdia.minf.stbl.stsc"
            java.lang.String[] r1 = org.jcodec.containers.mp4.boxes.Box.path(r1)
            org.jcodec.containers.mp4.boxes.Box r0 = org.jcodec.containers.mp4.boxes.Box.findFirstPath(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.SampleToChunkBox r0 = (org.jcodec.containers.mp4.boxes.SampleToChunkBox) r0
            return r0
    }

    public org.jcodec.containers.mp4.boxes.SyncSamplesBox getStss() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.SyncSamplesBox> r0 = org.jcodec.containers.mp4.boxes.SyncSamplesBox.class
            java.lang.String r1 = "mdia.minf.stbl.stss"
            java.lang.String[] r1 = org.jcodec.containers.mp4.boxes.Box.path(r1)
            org.jcodec.containers.mp4.boxes.Box r0 = org.jcodec.containers.mp4.boxes.Box.findFirstPath(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.SyncSamplesBox r0 = (org.jcodec.containers.mp4.boxes.SyncSamplesBox) r0
            return r0
    }

    public org.jcodec.containers.mp4.boxes.SampleSizesBox getStsz() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.SampleSizesBox> r0 = org.jcodec.containers.mp4.boxes.SampleSizesBox.class
            java.lang.String r1 = "mdia.minf.stbl.stsz"
            java.lang.String[] r1 = org.jcodec.containers.mp4.boxes.Box.path(r1)
            org.jcodec.containers.mp4.boxes.Box r0 = org.jcodec.containers.mp4.boxes.Box.findFirstPath(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.SampleSizesBox r0 = (org.jcodec.containers.mp4.boxes.SampleSizesBox) r0
            return r0
    }

    public org.jcodec.containers.mp4.boxes.TimeToSampleBox getStts() {
            r2 = this;
            java.lang.Class<org.jcodec.containers.mp4.boxes.TimeToSampleBox> r0 = org.jcodec.containers.mp4.boxes.TimeToSampleBox.class
            java.lang.String r1 = "mdia.minf.stbl.stts"
            java.lang.String[] r1 = org.jcodec.containers.mp4.boxes.Box.path(r1)
            org.jcodec.containers.mp4.boxes.Box r0 = org.jcodec.containers.mp4.boxes.Box.findFirstPath(r2, r0, r1)
            org.jcodec.containers.mp4.boxes.TimeToSampleBox r0 = (org.jcodec.containers.mp4.boxes.TimeToSampleBox) r0
            return r0
    }
}
