package org.jcodec.containers.mp4.muxer;

/* loaded from: classes2.dex */
public abstract class AbstractMP4MuxerTrack {
    protected long chunkDuration;
    protected int chunkNo;
    protected java.util.List<java.nio.ByteBuffer> curChunk;
    protected java.util.List<org.jcodec.containers.mp4.boxes.Edit> edits;
    protected boolean finished;
    private java.lang.String name;
    protected java.util.List<org.jcodec.containers.mp4.boxes.SampleEntry> sampleEntries;
    protected java.util.List<org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry> samplesInChunks;
    protected int samplesInLastChunk;
    protected org.jcodec.common.model.Rational tgtChunkDuration;
    protected org.jcodec.common.model.Unit tgtChunkDurationUnit;
    protected int timescale;
    protected int trackId;
    protected org.jcodec.containers.mp4.TrackType type;

    public AbstractMP4MuxerTrack(int r2, org.jcodec.containers.mp4.TrackType r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.samplesInLastChunk = r0
            r0 = 0
            r1.chunkNo = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.curChunk = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.samplesInChunks = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.sampleEntries = r0
            r1.trackId = r2
            r1.type = r3
            r1.timescale = r4
            return
    }

    protected void addDref(org.jcodec.containers.mp4.boxes.NodeBox r4) {
            r3 = this;
            org.jcodec.containers.mp4.boxes.DataInfoBox r0 = org.jcodec.containers.mp4.boxes.DataInfoBox.createDataInfoBox()
            r4.add(r0)
            org.jcodec.containers.mp4.boxes.DataRefBox r4 = org.jcodec.containers.mp4.boxes.DataRefBox.createDataRefBox()
            r0.add(r4)
            java.lang.String r0 = "alis"
            r1 = 0
            org.jcodec.containers.mp4.boxes.Header r0 = org.jcodec.containers.mp4.boxes.Header.createHeader(r0, r1)
            r1 = 4
            byte[] r1 = new byte[r1]
            r1 = {x0028: FILL_ARRAY_DATA , data: [0, 0, 0, 1} // fill-array
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            org.jcodec.containers.mp4.boxes.LeafBox r0 = org.jcodec.containers.mp4.boxes.LeafBox.createLeafBox(r0, r1)
            r4.add(r0)
            return
    }

    public void addSampleEntry(org.jcodec.containers.mp4.boxes.SampleEntry r2) {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto La
            java.util.List<org.jcodec.containers.mp4.boxes.SampleEntry> r0 = r1.sampleEntries
            r0.add(r2)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "The muxer track has finished muxing"
            r2.<init>(r0)
            throw r2
    }

    protected abstract org.jcodec.containers.mp4.boxes.Box finish(org.jcodec.containers.mp4.boxes.MovieHeaderBox r1) throws java.io.IOException;

    public org.jcodec.common.model.Size getDisplayDimensions() {
            r4 = this;
            java.util.List<org.jcodec.containers.mp4.boxes.SampleEntry> r0 = r4.sampleEntries
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof org.jcodec.containers.mp4.boxes.VideoSampleEntry
            if (r0 == 0) goto L41
            java.util.List<org.jcodec.containers.mp4.boxes.SampleEntry> r0 = r4.sampleEntries
            java.lang.Object r0 = r0.get(r1)
            org.jcodec.containers.mp4.boxes.VideoSampleEntry r0 = (org.jcodec.containers.mp4.boxes.VideoSampleEntry) r0
            java.lang.Class<org.jcodec.containers.mp4.boxes.PixelAspectExt> r1 = org.jcodec.containers.mp4.boxes.PixelAspectExt.class
            java.lang.String r2 = org.jcodec.containers.mp4.boxes.PixelAspectExt.fourcc()
            org.jcodec.containers.mp4.boxes.Box r1 = org.jcodec.containers.mp4.boxes.Box.findFirst(r0, r1, r2)
            org.jcodec.containers.mp4.boxes.PixelAspectExt r1 = (org.jcodec.containers.mp4.boxes.PixelAspectExt) r1
            if (r1 == 0) goto L26
            org.jcodec.common.model.Rational r1 = r1.getRational()
            goto L2c
        L26:
            org.jcodec.common.model.Rational r1 = new org.jcodec.common.model.Rational
            r2 = 1
            r1.<init>(r2, r2)
        L2c:
            int r2 = r1.getNum()
            int r3 = r0.getWidth()
            int r2 = r2 * r3
            int r1 = r1.getDen()
            int r1 = r2 / r1
            int r0 = r0.getHeight()
            goto L42
        L41:
            r0 = 0
        L42:
            org.jcodec.common.model.Size r2 = new org.jcodec.common.model.Size
            r2.<init>(r1, r0)
            return r2
    }

    public int getTimescale() {
            r1 = this;
            int r0 = r1.timescale
            return r0
    }

    public abstract long getTrackTotalDuration();

    public boolean isVideo() {
            r2 = this;
            org.jcodec.containers.mp4.TrackType r0 = r2.type
            org.jcodec.containers.mp4.TrackType r1 = org.jcodec.containers.mp4.TrackType.VIDEO
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    protected void mediaHeader(org.jcodec.containers.mp4.boxes.MediaInfoBox r10, org.jcodec.containers.mp4.TrackType r11) {
            r9 = this;
            org.jcodec.containers.mp4.TrackType r0 = org.jcodec.containers.mp4.TrackType.VIDEO
            r1 = 1
            if (r0 != r11) goto L11
            r11 = 0
            org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox r11 = org.jcodec.containers.mp4.boxes.VideoMediaHeaderBox.createVideoMediaHeaderBox(r11, r11, r11, r11)
            r11.setFlags(r1)
            r10.add(r11)
            goto L61
        L11:
            org.jcodec.containers.mp4.TrackType r0 = org.jcodec.containers.mp4.TrackType.SOUND
            if (r0 != r11) goto L20
            org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox r11 = org.jcodec.containers.mp4.boxes.SoundMediaHeaderBox.createSoundMediaHeaderBox()
            r11.setFlags(r1)
            r10.add(r11)
            goto L61
        L20:
            org.jcodec.containers.mp4.TrackType r0 = org.jcodec.containers.mp4.TrackType.TIMECODE
            if (r0 != r11) goto L62
            org.jcodec.containers.mp4.boxes.NodeBox r11 = new org.jcodec.containers.mp4.boxes.NodeBox
            org.jcodec.containers.mp4.boxes.Header r0 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r1 = "gmhd"
            r0.<init>(r1)
            r11.<init>(r0)
            org.jcodec.containers.mp4.boxes.GenericMediaInfoBox r0 = org.jcodec.containers.mp4.boxes.GenericMediaInfoBox.createGenericMediaInfoBox()
            r11.add(r0)
            org.jcodec.containers.mp4.boxes.NodeBox r0 = new org.jcodec.containers.mp4.boxes.NodeBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = "tmcd"
            r1.<init>(r2)
            r0.<init>(r1)
            r11.add(r0)
            r3 = 0
            r4 = 0
            r5 = 12
            r1 = 3
            short[] r6 = new short[r1]
            r6 = {x0082: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            short[] r7 = new short[r1]
            r7 = {x008a: FILL_ARRAY_DATA , data: [255, 255, 255} // fill-array
            java.lang.String r8 = "Lucida Grande"
            org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox r1 = org.jcodec.containers.mp4.boxes.TimecodeMediaInfoBox.createTimecodeMediaInfoBox(r3, r4, r5, r6, r7, r8)
            r0.add(r1)
            r10.add(r11)
        L61:
            return
        L62:
            org.jcodec.api.UnhandledStateException r10 = new org.jcodec.api.UnhandledStateException
            java.lang.String r11 = r11.getHandler()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Handler "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = " not supported"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
    }

    protected void putEdits(org.jcodec.containers.mp4.boxes.TrakBox r4) {
            r3 = this;
            java.util.List<org.jcodec.containers.mp4.boxes.Edit> r0 = r3.edits
            if (r0 == 0) goto L1c
            org.jcodec.containers.mp4.boxes.NodeBox r0 = new org.jcodec.containers.mp4.boxes.NodeBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = "edts"
            r1.<init>(r2)
            r0.<init>(r1)
            java.util.List<org.jcodec.containers.mp4.boxes.Edit> r1 = r3.edits
            org.jcodec.containers.mp4.boxes.EditListBox r1 = org.jcodec.containers.mp4.boxes.EditListBox.createEditListBox(r1)
            r0.add(r1)
            r4.add(r0)
        L1c:
            return
    }

    protected void putName(org.jcodec.containers.mp4.boxes.TrakBox r4) {
            r3 = this;
            java.lang.String r0 = r3.name
            if (r0 == 0) goto L1c
            org.jcodec.containers.mp4.boxes.NodeBox r0 = new org.jcodec.containers.mp4.boxes.NodeBox
            org.jcodec.containers.mp4.boxes.Header r1 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r2 = "udta"
            r1.<init>(r2)
            r0.<init>(r1)
            java.lang.String r1 = r3.name
            org.jcodec.containers.mp4.boxes.NameBox r1 = org.jcodec.containers.mp4.boxes.NameBox.createNameBox(r1)
            r0.add(r1)
            r4.add(r0)
        L1c:
            return
    }

    public void setTgtChunkDuration(org.jcodec.common.model.Rational r1, org.jcodec.common.model.Unit r2) {
            r0 = this;
            r0.tgtChunkDuration = r1
            r0.tgtChunkDurationUnit = r2
            return
    }

    public void tapt(org.jcodec.containers.mp4.boxes.TrakBox r5) {
            r4 = this;
            org.jcodec.common.model.Size r0 = r4.getDisplayDimensions()
            org.jcodec.containers.mp4.TrackType r1 = r4.type
            org.jcodec.containers.mp4.TrackType r2 = org.jcodec.containers.mp4.TrackType.VIDEO
            if (r1 != r2) goto L46
            org.jcodec.containers.mp4.boxes.NodeBox r1 = new org.jcodec.containers.mp4.boxes.NodeBox
            org.jcodec.containers.mp4.boxes.Header r2 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r3 = "tapt"
            r2.<init>(r3)
            r1.<init>(r2)
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            org.jcodec.containers.mp4.boxes.ClearApertureBox r2 = org.jcodec.containers.mp4.boxes.ClearApertureBox.createClearApertureBox(r2, r3)
            r1.add(r2)
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            org.jcodec.containers.mp4.boxes.ProductionApertureBox r2 = org.jcodec.containers.mp4.boxes.ProductionApertureBox.createProductionApertureBox(r2, r3)
            r1.add(r2)
            int r2 = r0.getWidth()
            int r0 = r0.getHeight()
            org.jcodec.containers.mp4.boxes.EncodedPixelBox r0 = org.jcodec.containers.mp4.boxes.EncodedPixelBox.createEncodedPixelBox(r2, r0)
            r1.add(r0)
            r5.add(r1)
        L46:
            return
    }
}
