package org.jcodec.containers.mp4.muxer;

/* loaded from: classes2.dex */
public class FramesMP4MuxerTrack extends org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack {
    private boolean allIframes;
    private org.jcodec.common.LongArrayList chunkOffsets;
    private java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry> compositionOffsets;
    private long curDuration;
    private int curFrame;
    private org.jcodec.common.IntArrayList iframes;
    private int lastCompositionOffset;
    private int lastCompositionSamples;
    private int lastEntry;
    private org.jcodec.common.io.SeekableByteChannel out;
    private long ptsEstimate;
    private long sameDurCount;
    private java.util.List<org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry> sampleDurations;
    private org.jcodec.common.IntArrayList sampleSizes;
    private long trackTotalDuration;

    public FramesMP4MuxerTrack(org.jcodec.common.io.SeekableByteChannel r3, int r4, org.jcodec.containers.mp4.TrackType r5, int r6) {
            r2 = this;
            r2.<init>(r4, r5, r6)
            r4 = 0
            r2.sameDurCount = r4
            r0 = -1
            r2.curDuration = r0
            r6 = 0
            r2.lastCompositionOffset = r6
            r2.lastCompositionSamples = r6
            r2.ptsEstimate = r4
            r4 = -1
            r2.lastEntry = r4
            r4 = 1
            r2.allIframes = r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.sampleDurations = r5
            org.jcodec.common.LongArrayList r5 = org.jcodec.common.LongArrayList.createLongArrayList()
            r2.chunkOffsets = r5
            org.jcodec.common.IntArrayList r5 = org.jcodec.common.IntArrayList.createIntArrayList()
            r2.sampleSizes = r5
            org.jcodec.common.IntArrayList r5 = org.jcodec.common.IntArrayList.createIntArrayList()
            r2.iframes = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.compositionOffsets = r5
            r2.out = r3
            org.jcodec.common.model.Rational r3 = new org.jcodec.common.model.Rational
            r3.<init>(r4, r4)
            org.jcodec.common.model.Unit r4 = org.jcodec.common.model.Unit.FRAME
            r2.setTgtChunkDuration(r3, r4)
            return
    }

    public static int minOffset(java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry> r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 2147483647(0x7fffffff, float:NaN)
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r3.next()
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry r1 = (org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry) r1
            int r2 = r1.getOffset()
            if (r2 >= r0) goto L7
            int r0 = r1.getOffset()
            goto L7
        L1e:
            return r0
    }

    private void outChunkIfNeeded(int r6) throws java.io.IOException {
            r5 = this;
            org.jcodec.common.model.Unit r0 = r5.tgtChunkDurationUnit
            org.jcodec.common.model.Unit r1 = org.jcodec.common.model.Unit.FRAME
            if (r0 == r1) goto Ld
            org.jcodec.common.model.Unit r2 = org.jcodec.common.model.Unit.SEC
            if (r0 != r2) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            org.jcodec.common.Assert.assertTrue(r0)
            org.jcodec.common.model.Unit r0 = r5.tgtChunkDurationUnit
            if (r0 != r1) goto L2f
            java.util.List<java.nio.ByteBuffer> r0 = r5.curChunk
            int r0 = r0.size()
            org.jcodec.common.model.Rational r1 = r5.tgtChunkDuration
            int r1 = r1.getDen()
            int r0 = r0 * r1
            org.jcodec.common.model.Rational r1 = r5.tgtChunkDuration
            int r1 = r1.getNum()
            if (r0 != r1) goto L2f
            r5.outChunk(r6)
            goto L58
        L2f:
            org.jcodec.common.model.Unit r0 = r5.tgtChunkDurationUnit
            org.jcodec.common.model.Unit r1 = org.jcodec.common.model.Unit.SEC
            if (r0 != r1) goto L58
            long r0 = r5.chunkDuration
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L58
            org.jcodec.common.model.Rational r2 = r5.tgtChunkDuration
            int r2 = r2.getDen()
            long r2 = (long) r2
            long r0 = r0 * r2
            org.jcodec.common.model.Rational r2 = r5.tgtChunkDuration
            int r2 = r2.getNum()
            int r3 = r5.timescale
            int r2 = r2 * r3
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L58
            r5.outChunk(r6)
        L58:
            return
    }

    private void processTimecode(org.jcodec.containers.mp4.MP4Packet r1) throws java.io.IOException {
            r0 = this;
            return
    }

    private void putCompositionOffsets(org.jcodec.containers.mp4.boxes.NodeBox r11) {
            r10 = this;
            java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry> r0 = r10.compositionOffsets
            int r0 = r0.size()
            if (r0 <= 0) goto L92
            java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry> r0 = r10.compositionOffsets
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry r1 = new org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry
            int r2 = r10.lastCompositionSamples
            int r3 = r10.lastCompositionOffset
            r1.<init>(r2, r3)
            r0.add(r1)
            java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry> r0 = r10.compositionOffsets
            int r0 = minOffset(r0)
            if (r0 <= 0) goto L36
            java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry> r1 = r10.compositionOffsets
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry r2 = (org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry) r2
            int r3 = r2.offset
            int r3 = r3 - r0
            r2.offset = r3
            goto L24
        L36:
            java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry> r0 = r10.compositionOffsets
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry r0 = (org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry) r0
            int r2 = r0.getOffset()
            if (r2 <= 0) goto L81
            java.util.List<org.jcodec.containers.mp4.boxes.Edit> r2 = r10.edits
            if (r2 != 0) goto L63
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.edits = r2
            org.jcodec.containers.mp4.boxes.Edit r9 = new org.jcodec.containers.mp4.boxes.Edit
            long r4 = r10.trackTotalDuration
            int r0 = r0.getOffset()
            long r6 = (long) r0
            r8 = 1065353216(0x3f800000, float:1.0)
            r3 = r9
            r3.<init>(r4, r6, r8)
            r2.add(r9)
            goto L81
        L63:
            java.util.Iterator r2 = r2.iterator()
        L67:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()
            org.jcodec.containers.mp4.boxes.Edit r3 = (org.jcodec.containers.mp4.boxes.Edit) r3
            long r4 = r3.getMediaTime()
            int r6 = r0.getOffset()
            long r6 = (long) r6
            long r4 = r4 + r6
            r3.setMediaTime(r4)
            goto L67
        L81:
            java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry> r0 = r10.compositionOffsets
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r1 = new org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry[] r0 = (org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.Entry[]) r0
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox r0 = org.jcodec.containers.mp4.boxes.CompositionOffsetsBox.createCompositionOffsetsBox(r0)
            r11.add(r0)
        L92:
            return
    }

    public void addFrame(org.jcodec.containers.mp4.MP4Packet r8) throws java.io.IOException {
            r7 = this;
            boolean r0 = r7.finished
            if (r0 != 0) goto Lb1
            int r0 = r8.getEntryNo()
            int r0 = r0 + 1
            long r1 = r8.getPts()
            long r3 = r7.ptsEstimate
            long r1 = r1 - r3
            int r2 = (int) r1
            int r1 = r7.lastCompositionOffset
            r3 = 0
            if (r2 == r1) goto L29
            int r4 = r7.lastCompositionSamples
            if (r4 <= 0) goto L25
            java.util.List<org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry> r5 = r7.compositionOffsets
            org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry r6 = new org.jcodec.containers.mp4.boxes.CompositionOffsetsBox$Entry
            r6.<init>(r4, r1)
            r5.add(r6)
        L25:
            r7.lastCompositionOffset = r2
            r7.lastCompositionSamples = r3
        L29:
            int r1 = r7.lastCompositionSamples
            int r1 = r1 + 1
            r7.lastCompositionSamples = r1
            long r1 = r7.ptsEstimate
            long r4 = r8.getDuration()
            long r1 = r1 + r4
            r7.ptsEstimate = r1
            int r1 = r7.lastEntry
            r2 = -1
            if (r1 == r2) goto L44
            if (r1 == r0) goto L44
            r7.outChunk(r1)
            r7.samplesInLastChunk = r2
        L44:
            java.util.List<java.nio.ByteBuffer> r1 = r7.curChunk
            java.nio.ByteBuffer r2 = r8.getData()
            r1.add(r2)
            boolean r1 = r8.isKeyFrame()
            if (r1 == 0) goto L5d
            org.jcodec.common.IntArrayList r1 = r7.iframes
            int r2 = r7.curFrame
            int r2 = r2 + 1
            r1.add(r2)
            goto L5f
        L5d:
            r7.allIframes = r3
        L5f:
            int r1 = r7.curFrame
            int r1 = r1 + 1
            r7.curFrame = r1
            long r1 = r7.chunkDuration
            long r3 = r8.getDuration()
            long r1 = r1 + r3
            r7.chunkDuration = r1
            long r1 = r7.curDuration
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L92
            long r1 = r8.getDuration()
            long r3 = r7.curDuration
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L92
            java.util.List<org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry> r1 = r7.sampleDurations
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry r2 = new org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry
            long r5 = r7.sameDurCount
            int r6 = (int) r5
            int r4 = (int) r3
            r2.<init>(r6, r4)
            r1.add(r2)
            r1 = 0
            r7.sameDurCount = r1
        L92:
            long r1 = r8.getDuration()
            r7.curDuration = r1
            long r1 = r7.sameDurCount
            r3 = 1
            long r1 = r1 + r3
            r7.sameDurCount = r1
            long r1 = r7.trackTotalDuration
            long r3 = r8.getDuration()
            long r1 = r1 + r3
            r7.trackTotalDuration = r1
            r7.outChunkIfNeeded(r0)
            r7.processTimecode(r8)
            r7.lastEntry = r0
            return
        Lb1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "The muxer track has finished muxing"
            r8.<init>(r0)
            throw r8
    }

    @Override // org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack
    protected org.jcodec.containers.mp4.boxes.Box finish(org.jcodec.containers.mp4.boxes.MovieHeaderBox r18) throws java.io.IOException {
            r17 = this;
            r0 = r17
            boolean r1 = r0.finished
            if (r1 != 0) goto L144
            int r1 = r0.lastEntry
            r0.outChunk(r1)
            long r1 = r0.sameDurCount
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L21
            java.util.List<org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry> r3 = r0.sampleDurations
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry r4 = new org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry
            int r2 = (int) r1
            long r5 = r0.curDuration
            int r1 = (int) r5
            r4.<init>(r2, r1)
            r3.add(r4)
        L21:
            r1 = 1
            r0.finished = r1
            org.jcodec.containers.mp4.boxes.TrakBox r1 = org.jcodec.containers.mp4.boxes.TrakBox.createTrakBox()
            org.jcodec.common.model.Size r2 = r17.getDisplayDimensions()
            int r3 = r0.trackId
            int r4 = r18.getTimescale()
            long r4 = (long) r4
            long r6 = r0.trackTotalDuration
            long r4 = r4 * r6
            int r6 = r0.timescale
            long r6 = (long) r6
            long r4 = r4 / r6
            int r6 = r2.getWidth()
            float r6 = (float) r6
            int r2 = r2.getHeight()
            float r7 = (float) r2
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r8 = r2.getTime()
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r10 = r2.getTime()
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r14 = 0
            r2 = 9
            int[] r2 = new int[r2]
            r2 = {x014c: FILL_ARRAY_DATA , data: [65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824} // fill-array
            r16 = r2
            org.jcodec.containers.mp4.boxes.TrackHeaderBox r2 = org.jcodec.containers.mp4.boxes.TrackHeaderBox.createTrackHeaderBox(r3, r4, r6, r7, r8, r10, r12, r13, r14, r16)
            r3 = 15
            r2.setFlags(r3)
            r1.add(r2)
            r0.tapt(r1)
            org.jcodec.containers.mp4.boxes.MediaBox r2 = org.jcodec.containers.mp4.boxes.MediaBox.createMediaBox()
            r1.add(r2)
            int r3 = r0.timescale
            long r4 = r0.trackTotalDuration
            r6 = 0
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            long r7 = r7.getTime()
            java.util.Date r9 = new java.util.Date
            r9.<init>()
            long r9 = r9.getTime()
            r11 = 0
            org.jcodec.containers.mp4.boxes.MediaHeaderBox r3 = org.jcodec.containers.mp4.boxes.MediaHeaderBox.createMediaHeaderBox(r3, r4, r6, r7, r9, r11)
            r2.add(r3)
            org.jcodec.containers.mp4.TrackType r3 = r0.type
            java.lang.String r3 = r3.getHandler()
            java.lang.String r4 = "mhlr"
            java.lang.String r5 = "appl"
            org.jcodec.containers.mp4.boxes.HandlerBox r3 = org.jcodec.containers.mp4.boxes.HandlerBox.createHandlerBox(r4, r3, r5, r6, r6)
            r2.add(r3)
            org.jcodec.containers.mp4.boxes.MediaInfoBox r3 = org.jcodec.containers.mp4.boxes.MediaInfoBox.createMediaInfoBox()
            r2.add(r3)
            org.jcodec.containers.mp4.TrackType r2 = r0.type
            r0.mediaHeader(r3, r2)
            java.lang.String r2 = "dhlr"
            java.lang.String r4 = "url "
            org.jcodec.containers.mp4.boxes.HandlerBox r2 = org.jcodec.containers.mp4.boxes.HandlerBox.createHandlerBox(r2, r4, r5, r6, r6)
            r3.add(r2)
            r0.addDref(r3)
            org.jcodec.containers.mp4.boxes.NodeBox r2 = new org.jcodec.containers.mp4.boxes.NodeBox
            org.jcodec.containers.mp4.boxes.Header r4 = new org.jcodec.containers.mp4.boxes.Header
            java.lang.String r5 = "stbl"
            r4.<init>(r5)
            r2.<init>(r4)
            r3.add(r2)
            r0.putCompositionOffsets(r2)
            r0.putEdits(r1)
            r0.putName(r1)
            java.util.List<org.jcodec.containers.mp4.boxes.SampleEntry> r3 = r0.sampleEntries
            org.jcodec.containers.mp4.boxes.SampleEntry[] r4 = new org.jcodec.containers.mp4.boxes.SampleEntry[r6]
            java.lang.Object[] r3 = r3.toArray(r4)
            org.jcodec.containers.mp4.boxes.SampleEntry[] r3 = (org.jcodec.containers.mp4.boxes.SampleEntry[]) r3
            org.jcodec.containers.mp4.boxes.SampleDescriptionBox r3 = org.jcodec.containers.mp4.boxes.SampleDescriptionBox.createSampleDescriptionBox(r3)
            r2.add(r3)
            java.util.List<org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry> r3 = r0.samplesInChunks
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r4 = new org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry[r6]
            java.lang.Object[] r3 = r3.toArray(r4)
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry[] r3 = (org.jcodec.containers.mp4.boxes.SampleToChunkBox.SampleToChunkEntry[]) r3
            org.jcodec.containers.mp4.boxes.SampleToChunkBox r3 = org.jcodec.containers.mp4.boxes.SampleToChunkBox.createSampleToChunkBox(r3)
            r2.add(r3)
            org.jcodec.common.IntArrayList r3 = r0.sampleSizes
            int[] r3 = r3.toArray()
            org.jcodec.containers.mp4.boxes.SampleSizesBox r3 = org.jcodec.containers.mp4.boxes.SampleSizesBox.createSampleSizesBox2(r3)
            r2.add(r3)
            java.util.List<org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry> r3 = r0.sampleDurations
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry[] r4 = new org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry[r6]
            java.lang.Object[] r3 = r3.toArray(r4)
            org.jcodec.containers.mp4.boxes.TimeToSampleBox$TimeToSampleEntry[] r3 = (org.jcodec.containers.mp4.boxes.TimeToSampleBox.TimeToSampleEntry[]) r3
            org.jcodec.containers.mp4.boxes.TimeToSampleBox r3 = org.jcodec.containers.mp4.boxes.TimeToSampleBox.createTimeToSampleBox(r3)
            r2.add(r3)
            org.jcodec.common.LongArrayList r3 = r0.chunkOffsets
            long[] r3 = r3.toArray()
            org.jcodec.containers.mp4.boxes.ChunkOffsets64Box r3 = org.jcodec.containers.mp4.boxes.ChunkOffsets64Box.createChunkOffsets64Box(r3)
            r2.add(r3)
            boolean r3 = r0.allIframes
            if (r3 != 0) goto L143
            org.jcodec.common.IntArrayList r3 = r0.iframes
            int r3 = r3.size()
            if (r3 <= 0) goto L143
            org.jcodec.common.IntArrayList r3 = r0.iframes
            int[] r3 = r3.toArray()
            org.jcodec.containers.mp4.boxes.SyncSamplesBox r3 = org.jcodec.containers.mp4.boxes.SyncSamplesBox.createSyncSamplesBox(r3)
            r2.add(r3)
        L143:
            return r1
        L144:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The muxer track has finished muxing"
            r1.<init>(r2)
            throw r1
    }

    @Override // org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack
    public long getTrackTotalDuration() {
            r2 = this;
            long r0 = r2.trackTotalDuration
            return r0
    }

    void outChunk(int r6) throws java.io.IOException {
            r5 = this;
            java.util.List<java.nio.ByteBuffer> r0 = r5.curChunk
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            org.jcodec.common.LongArrayList r0 = r5.chunkOffsets
            org.jcodec.common.io.SeekableByteChannel r1 = r5.out
            long r1 = r1.position()
            r0.add(r1)
            java.util.List<java.nio.ByteBuffer> r0 = r5.curChunk
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            org.jcodec.common.IntArrayList r2 = r5.sampleSizes
            int r3 = r1.remaining()
            r2.add(r3)
            org.jcodec.common.io.SeekableByteChannel r2 = r5.out
            r2.write(r1)
            goto L1a
        L35:
            int r0 = r5.samplesInLastChunk
            r1 = -1
            if (r0 == r1) goto L42
            java.util.List<java.nio.ByteBuffer> r1 = r5.curChunk
            int r1 = r1.size()
            if (r0 == r1) goto L57
        L42:
            java.util.List<org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry> r0 = r5.samplesInChunks
            org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry r1 = new org.jcodec.containers.mp4.boxes.SampleToChunkBox$SampleToChunkEntry
            int r2 = r5.chunkNo
            int r2 = r2 + 1
            long r2 = (long) r2
            java.util.List<java.nio.ByteBuffer> r4 = r5.curChunk
            int r4 = r4.size()
            r1.<init>(r2, r4, r6)
            r0.add(r1)
        L57:
            java.util.List<java.nio.ByteBuffer> r6 = r5.curChunk
            int r6 = r6.size()
            r5.samplesInLastChunk = r6
            int r6 = r5.chunkNo
            int r6 = r6 + 1
            r5.chunkNo = r6
            r0 = 0
            r5.chunkDuration = r0
            java.util.List<java.nio.ByteBuffer> r6 = r5.curChunk
            r6.clear()
            return
    }
}
