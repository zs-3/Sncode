package com.mp4parser.streaming;

/* loaded from: classes2.dex */
public class SingleTrackFragmentedMp4Writer implements com.mp4parser.streaming.StreamingMp4Writer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    com.mp4parser.streaming.extensions.CompositionTimeTrackExtension compositionTimeTrackExtension;
    java.util.Date creationTime;
    private long currentFragmentStartTime;
    private long currentTime;
    java.util.List<com.mp4parser.streaming.StreamingSample> fragment;
    private final java.io.OutputStream outputStream;
    com.mp4parser.streaming.extensions.SampleFlagsTrackExtension sampleDependencyTrackExtension;
    private long sequenceNumber;
    com.mp4parser.streaming.StreamingTrack source;


    static {
            java.lang.Class<com.mp4parser.streaming.SingleTrackFragmentedMp4Writer> r0 = com.mp4parser.streaming.SingleTrackFragmentedMp4Writer.class
            return
    }

    public SingleTrackFragmentedMp4Writer(com.mp4parser.streaming.StreamingTrack r3, java.io.OutputStream r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.fragment = r0
            r0 = 0
            r2.currentFragmentStartTime = r0
            r2.currentTime = r0
            r2.source = r3
            r2.outputStream = r4
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            r2.creationTime = r4
            java.lang.Class<com.mp4parser.streaming.extensions.CompositionTimeTrackExtension> r4 = com.mp4parser.streaming.extensions.CompositionTimeTrackExtension.class
            com.mp4parser.streaming.TrackExtension r4 = r3.getTrackExtension(r4)
            com.mp4parser.streaming.extensions.CompositionTimeTrackExtension r4 = (com.mp4parser.streaming.extensions.CompositionTimeTrackExtension) r4
            r2.compositionTimeTrackExtension = r4
            java.lang.Class<com.mp4parser.streaming.extensions.SampleFlagsTrackExtension> r4 = com.mp4parser.streaming.extensions.SampleFlagsTrackExtension.class
            com.mp4parser.streaming.TrackExtension r3 = r3.getTrackExtension(r4)
            com.mp4parser.streaming.extensions.SampleFlagsTrackExtension r3 = (com.mp4parser.streaming.extensions.SampleFlagsTrackExtension) r3
            r2.sampleDependencyTrackExtension = r3
            return
    }

    private void consumeSample(com.mp4parser.streaming.StreamingSample r10, java.nio.channels.WritableByteChannel r11) throws java.io.IOException {
            r9 = this;
            com.mp4parser.streaming.SampleExtension[] r0 = r10.getExtensions()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L7:
            if (r3 < r1) goto L56
            long r0 = r9.currentTime
            long r3 = r10.getDuration()
            long r0 = r0 + r3
            r9.currentTime = r0
            java.util.List<com.mp4parser.streaming.StreamingSample> r0 = r9.fragment
            r0.add(r10)
            long r0 = r9.currentTime
            long r3 = r9.currentFragmentStartTime
            r5 = 3
            com.mp4parser.streaming.StreamingTrack r10 = r9.source
            long r7 = r10.getTimescale()
            long r7 = r7 * r5
            long r3 = r3 + r7
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 <= 0) goto L55
            java.util.List<com.mp4parser.streaming.StreamingSample> r10 = r9.fragment
            int r10 = r10.size()
            if (r10 <= 0) goto L55
            com.mp4parser.streaming.extensions.SampleFlagsTrackExtension r10 = r9.sampleDependencyTrackExtension
            if (r10 == 0) goto L3e
            if (r2 == 0) goto L3e
            boolean r10 = r2.isSyncSample()
            if (r10 == 0) goto L55
        L3e:
            com.coremedia.iso.boxes.Box r10 = r9.createMoof()
            r10.getBox(r11)
            com.coremedia.iso.boxes.Box r10 = r9.createMdat()
            r10.getBox(r11)
            long r10 = r9.currentTime
            r9.currentFragmentStartTime = r10
            java.util.List<com.mp4parser.streaming.StreamingSample> r10 = r9.fragment
            r10.clear()
        L55:
            return
        L56:
            r4 = r0[r3]
            boolean r5 = r4 instanceof com.mp4parser.streaming.extensions.SampleFlagsSampleExtension
            if (r5 == 0) goto L60
            com.mp4parser.streaming.extensions.SampleFlagsSampleExtension r4 = (com.mp4parser.streaming.extensions.SampleFlagsSampleExtension) r4
            r2 = r4
            goto L66
        L60:
            boolean r5 = r4 instanceof com.mp4parser.streaming.extensions.CompositionTimeSampleExtension
            if (r5 == 0) goto L66
            com.mp4parser.streaming.extensions.CompositionTimeSampleExtension r4 = (com.mp4parser.streaming.extensions.CompositionTimeSampleExtension) r4
        L66:
            int r3 = r3 + 1
            goto L7
    }

    private com.coremedia.iso.boxes.Box createMdat() {
            r2 = this;
            com.mp4parser.streaming.SingleTrackFragmentedMp4Writer$1 r0 = new com.mp4parser.streaming.SingleTrackFragmentedMp4Writer$1
            java.lang.String r1 = "mdat"
            r0.<init>(r2, r1)
            return r0
    }

    private void createMfhd(long r2, com.coremedia.iso.boxes.fragment.MovieFragmentBox r4) {
            r1 = this;
            com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox r0 = new com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox
            r0.<init>()
            r0.setSequenceNumber(r2)
            r4.addBox(r0)
            return
    }

    private com.coremedia.iso.boxes.Box createMoof() {
            r6 = this;
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r0 = new com.coremedia.iso.boxes.fragment.MovieFragmentBox
            r0.<init>()
            long r1 = r6.sequenceNumber
            r6.createMfhd(r1, r0)
            long r1 = r6.sequenceNumber
            r6.createTraf(r1, r0)
            java.util.List r1 = r0.getTrackRunBoxes()
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.coremedia.iso.boxes.fragment.TrackRunBox r1 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r1
            r2 = 1
            r1.setDataOffset(r2)
            long r2 = r0.getSize()
            r4 = 8
            long r2 = r2 + r4
            int r3 = (int) r2
            r1.setDataOffset(r3)
            return r0
    }

    private void createTraf(long r1, com.coremedia.iso.boxes.fragment.MovieFragmentBox r3) {
            r0 = this;
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r1 = new com.coremedia.iso.boxes.fragment.TrackFragmentBox
            r1.<init>()
            r3.addBox(r1)
            r0.createTfhd(r1)
            r0.createTfdt(r1)
            r0.createTrun(r1)
            com.mp4parser.streaming.StreamingTrack r1 = r0.source
            java.lang.Class<com.mp4parser.streaming.extensions.CencEncryptTrackExtension> r2 = com.mp4parser.streaming.extensions.CencEncryptTrackExtension.class
            r1.getTrackExtension(r2)
            return
    }

    @Override // com.mp4parser.streaming.StreamingMp4Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    protected com.coremedia.iso.boxes.DataInformationBox createDinf() {
            r4 = this;
            com.coremedia.iso.boxes.DataInformationBox r0 = new com.coremedia.iso.boxes.DataInformationBox
            r0.<init>()
            com.coremedia.iso.boxes.DataReferenceBox r1 = new com.coremedia.iso.boxes.DataReferenceBox
            r1.<init>()
            r0.addBox(r1)
            com.coremedia.iso.boxes.DataEntryUrlBox r2 = new com.coremedia.iso.boxes.DataEntryUrlBox
            r2.<init>()
            r3 = 1
            r2.setFlags(r3)
            r1.addBox(r2)
            return r0
    }

    public com.coremedia.iso.boxes.Box createFtyp() {
            r5 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r1 = "isom"
            r0.add(r1)
            java.lang.String r2 = "iso6"
            r0.add(r2)
            java.lang.String r2 = "avc1"
            r0.add(r2)
            com.coremedia.iso.boxes.FileTypeBox r2 = new com.coremedia.iso.boxes.FileTypeBox
            r3 = 0
            r2.<init>(r1, r3, r0)
            return r2
    }

    protected com.coremedia.iso.boxes.Box createMdhd() {
            r3 = this;
            com.coremedia.iso.boxes.MediaHeaderBox r0 = new com.coremedia.iso.boxes.MediaHeaderBox
            r0.<init>()
            java.util.Date r1 = r3.creationTime
            r0.setCreationTime(r1)
            java.util.Date r1 = r3.creationTime
            r0.setModificationTime(r1)
            r1 = 0
            r0.setDuration(r1)
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            long r1 = r1.getTimescale()
            r0.setTimescale(r1)
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            java.lang.String r1 = r1.getLanguage()
            r0.setLanguage(r1)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMdia() {
            r2 = this;
            com.coremedia.iso.boxes.MediaBox r0 = new com.coremedia.iso.boxes.MediaBox
            r0.<init>()
            com.coremedia.iso.boxes.Box r1 = r2.createMdhd()
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r2.createMdiaHdlr()
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r2.createMinf()
            r0.addBox(r1)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMdiaHdlr() {
            r2 = this;
            com.coremedia.iso.boxes.HandlerBox r0 = new com.coremedia.iso.boxes.HandlerBox
            r0.<init>()
            com.mp4parser.streaming.StreamingTrack r1 = r2.source
            java.lang.String r1 = r1.getHandler()
            r0.setHandlerType(r1)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMinf() {
            r3 = this;
            com.coremedia.iso.boxes.MediaInformationBox r0 = new com.coremedia.iso.boxes.MediaInformationBox
            r0.<init>()
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            java.lang.String r1 = r1.getHandler()
            java.lang.String r2 = "vide"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1d
            com.coremedia.iso.boxes.VideoMediaHeaderBox r1 = new com.coremedia.iso.boxes.VideoMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L8f
        L1d:
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            java.lang.String r1 = r1.getHandler()
            java.lang.String r2 = "soun"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L34
            com.coremedia.iso.boxes.SoundMediaHeaderBox r1 = new com.coremedia.iso.boxes.SoundMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L8f
        L34:
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            java.lang.String r1 = r1.getHandler()
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4b
            com.coremedia.iso.boxes.NullMediaHeaderBox r1 = new com.coremedia.iso.boxes.NullMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L8f
        L4b:
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            java.lang.String r1 = r1.getHandler()
            java.lang.String r2 = "subt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L62
            com.coremedia.iso.boxes.SubtitleMediaHeaderBox r1 = new com.coremedia.iso.boxes.SubtitleMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L8f
        L62:
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            java.lang.String r1 = r1.getHandler()
            java.lang.String r2 = "hint"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L79
            com.coremedia.iso.boxes.HintMediaHeaderBox r1 = new com.coremedia.iso.boxes.HintMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L8f
        L79:
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            java.lang.String r1 = r1.getHandler()
            java.lang.String r2 = "sbtl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8f
            com.coremedia.iso.boxes.NullMediaHeaderBox r1 = new com.coremedia.iso.boxes.NullMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
        L8f:
            com.coremedia.iso.boxes.DataInformationBox r1 = r3.createDinf()
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r3.createStbl()
            r0.addBox(r1)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMoov() {
            r2 = this;
            com.coremedia.iso.boxes.MovieBox r0 = new com.coremedia.iso.boxes.MovieBox
            r0.<init>()
            com.coremedia.iso.boxes.Box r1 = r2.createMvhd()
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r2.createTrak()
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r2.createMvex()
            r0.addBox(r1)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMvex() {
            r4 = this;
            com.coremedia.iso.boxes.fragment.MovieExtendsBox r0 = new com.coremedia.iso.boxes.fragment.MovieExtendsBox
            r0.<init>()
            com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox r1 = new com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox
            r1.<init>()
            r2 = 1
            r1.setVersion(r2)
            r2 = 0
            r1.setFragmentDuration(r2)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r4.createTrex()
            r0.addBox(r1)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMvhd() {
            r3 = this;
            com.coremedia.iso.boxes.MovieHeaderBox r0 = new com.coremedia.iso.boxes.MovieHeaderBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            java.util.Date r1 = r3.creationTime
            r0.setCreationTime(r1)
            java.util.Date r1 = r3.creationTime
            r0.setModificationTime(r1)
            r1 = 0
            r0.setDuration(r1)
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            long r1 = r1.getTimescale()
            r0.setTimescale(r1)
            r1 = 2
            r0.setNextTrackId(r1)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createStbl() {
            r2 = this;
            com.coremedia.iso.boxes.SampleTableBox r0 = new com.coremedia.iso.boxes.SampleTableBox
            r0.<init>()
            com.mp4parser.streaming.StreamingTrack r1 = r2.source
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r1.getSampleDescriptionBox()
            r0.addBox(r1)
            com.coremedia.iso.boxes.TimeToSampleBox r1 = new com.coremedia.iso.boxes.TimeToSampleBox
            r1.<init>()
            r0.addBox(r1)
            com.coremedia.iso.boxes.SampleToChunkBox r1 = new com.coremedia.iso.boxes.SampleToChunkBox
            r1.<init>()
            r0.addBox(r1)
            com.coremedia.iso.boxes.SampleSizeBox r1 = new com.coremedia.iso.boxes.SampleSizeBox
            r1.<init>()
            r0.addBox(r1)
            com.coremedia.iso.boxes.StaticChunkOffsetBox r1 = new com.coremedia.iso.boxes.StaticChunkOffsetBox
            r1.<init>()
            r0.addBox(r1)
            return r0
    }

    protected void createTfdt(com.coremedia.iso.boxes.fragment.TrackFragmentBox r4) {
            r3 = this;
            com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox r0 = new com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            long r1 = r3.currentFragmentStartTime
            r0.setBaseMediaDecodeTime(r1)
            r4.addBox(r0)
            return
    }

    protected void createTfhd(com.coremedia.iso.boxes.fragment.TrackFragmentBox r4) {
            r3 = this;
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r0 = new com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox
            r0.<init>()
            com.coremedia.iso.boxes.fragment.SampleFlags r1 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r1.<init>()
            r0.setDefaultSampleFlags(r1)
            r1 = -1
            r0.setBaseDataOffset(r1)
            com.mp4parser.streaming.StreamingTrack r1 = r3.source
            java.lang.Class<com.mp4parser.streaming.extensions.TrackIdTrackExtension> r2 = com.mp4parser.streaming.extensions.TrackIdTrackExtension.class
            com.mp4parser.streaming.TrackExtension r1 = r1.getTrackExtension(r2)
            com.mp4parser.streaming.extensions.TrackIdTrackExtension r1 = (com.mp4parser.streaming.extensions.TrackIdTrackExtension) r1
            if (r1 == 0) goto L26
            long r1 = r1.getTrackId()
            r0.setTrackId(r1)
            goto L2b
        L26:
            r1 = 1
            r0.setTrackId(r1)
        L2b:
            r1 = 1
            r0.setDefaultBaseIsMoof(r1)
            r4.addBox(r0)
            return
    }

    protected com.coremedia.iso.boxes.Box createTrak() {
            r2 = this;
            com.coremedia.iso.boxes.TrackBox r0 = new com.coremedia.iso.boxes.TrackBox
            r0.<init>()
            com.mp4parser.streaming.StreamingTrack r1 = r2.source
            com.coremedia.iso.boxes.TrackHeaderBox r1 = r1.getTrackHeaderBox()
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r2.createMdia()
            r0.addBox(r1)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createTrex() {
            r4 = this;
            com.coremedia.iso.boxes.fragment.TrackExtendsBox r0 = new com.coremedia.iso.boxes.fragment.TrackExtendsBox
            r0.<init>()
            com.mp4parser.streaming.StreamingTrack r1 = r4.source
            com.coremedia.iso.boxes.TrackHeaderBox r1 = r1.getTrackHeaderBox()
            long r1 = r1.getTrackId()
            r0.setTrackId(r1)
            r1 = 1
            r0.setDefaultSampleDescriptionIndex(r1)
            r1 = 0
            r0.setDefaultSampleDuration(r1)
            r0.setDefaultSampleSize(r1)
            com.coremedia.iso.boxes.fragment.SampleFlags r1 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r1.<init>()
            com.mp4parser.streaming.StreamingTrack r2 = r4.source
            java.lang.String r2 = r2.getHandler()
            java.lang.String r3 = "soun"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L40
            com.mp4parser.streaming.StreamingTrack r2 = r4.source
            java.lang.String r2 = r2.getHandler()
            java.lang.String r3 = "subt"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L47
        L40:
            r2 = 2
            r1.setSampleDependsOn(r2)
            r1.setSampleIsDependedOn(r2)
        L47:
            r0.setDefaultSampleFlags(r1)
            return r0
    }

    protected void createTrun(com.coremedia.iso.boxes.fragment.TrackFragmentBox r10) {
            r9 = this;
            com.coremedia.iso.boxes.fragment.TrackRunBox r0 = new com.coremedia.iso.boxes.fragment.TrackRunBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            r0.setSampleDurationPresent(r1)
            r0.setSampleSizePresent(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<com.mp4parser.streaming.StreamingSample> r3 = r9.fragment
            int r3 = r3.size()
            r2.<init>(r3)
            com.mp4parser.streaming.StreamingTrack r3 = r9.source
            java.lang.Class<com.mp4parser.streaming.extensions.CompositionTimeTrackExtension> r4 = com.mp4parser.streaming.extensions.CompositionTimeTrackExtension.class
            com.mp4parser.streaming.TrackExtension r3 = r3.getTrackExtension(r4)
            r4 = 0
            if (r3 == 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = 0
        L28:
            r0.setSampleCompositionTimeOffsetPresent(r3)
            com.mp4parser.streaming.StreamingTrack r3 = r9.source
            java.lang.Class<com.mp4parser.streaming.extensions.SampleFlagsTrackExtension> r5 = com.mp4parser.streaming.extensions.SampleFlagsTrackExtension.class
            com.mp4parser.streaming.TrackExtension r3 = r3.getTrackExtension(r5)
            if (r3 == 0) goto L36
            goto L37
        L36:
            r1 = 0
        L37:
            r0.setSampleFlagsPresent(r1)
            java.util.List<com.mp4parser.streaming.StreamingSample> r3 = r9.fragment
            java.util.Iterator r3 = r3.iterator()
        L40:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L4d
            r0.setEntries(r2)
            r10.addBox(r0)
            return
        L4d:
            java.lang.Object r4 = r3.next()
            com.mp4parser.streaming.StreamingSample r4 = (com.mp4parser.streaming.StreamingSample) r4
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r5 = new com.coremedia.iso.boxes.fragment.TrackRunBox$Entry
            r5.<init>()
            java.nio.ByteBuffer r6 = r4.getContent()
            int r6 = r6.remaining()
            long r6 = (long) r6
            r5.setSampleSize(r6)
            if (r1 == 0) goto La7
            java.lang.Class<com.mp4parser.streaming.extensions.SampleFlagsSampleExtension> r6 = com.mp4parser.streaming.extensions.SampleFlagsSampleExtension.class
            com.mp4parser.streaming.SampleExtension r6 = com.mp4parser.streaming.StreamingSampleHelper.getSampleExtension(r4, r6)
            com.mp4parser.streaming.extensions.SampleFlagsSampleExtension r6 = (com.mp4parser.streaming.extensions.SampleFlagsSampleExtension) r6
            com.coremedia.iso.boxes.fragment.SampleFlags r7 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r7.<init>()
            byte r8 = r6.getIsLeading()
            r7.setIsLeading(r8)
            byte r8 = r6.getSampleIsDependedOn()
            r7.setSampleIsDependedOn(r8)
            byte r8 = r6.getSampleDependsOn()
            r7.setSampleDependsOn(r8)
            byte r8 = r6.getSampleHasRedundancy()
            r7.setSampleHasRedundancy(r8)
            boolean r8 = r6.isSampleIsNonSyncSample()
            r7.setSampleIsDifferenceSample(r8)
            byte r8 = r6.getSamplePaddingValue()
            r7.setSamplePaddingValue(r8)
            int r6 = r6.getSampleDegradationPriority()
            r7.setSampleDegradationPriority(r6)
            r5.setSampleFlags(r7)
        La7:
            long r6 = r4.getDuration()
            r5.setSampleDuration(r6)
            boolean r6 = r0.isSampleCompositionTimeOffsetPresent()
            if (r6 == 0) goto Lc3
            java.lang.Class<com.mp4parser.streaming.extensions.CompositionTimeSampleExtension> r6 = com.mp4parser.streaming.extensions.CompositionTimeSampleExtension.class
            com.mp4parser.streaming.SampleExtension r4 = com.mp4parser.streaming.StreamingSampleHelper.getSampleExtension(r4, r6)
            com.mp4parser.streaming.extensions.CompositionTimeSampleExtension r4 = (com.mp4parser.streaming.extensions.CompositionTimeSampleExtension) r4
            int r4 = r4.getCompositionTimeOffset()
            r5.setSampleCompositionTimeOffset(r4)
        Lc3:
            r2.add(r5)
            goto L40
    }

    @Override // com.mp4parser.streaming.StreamingMp4Writer
    public void write() throws java.io.IOException {
            r5 = this;
            java.io.OutputStream r0 = r5.outputStream
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            com.coremedia.iso.boxes.Box r1 = r5.createFtyp()
            r1.getBox(r0)
            com.coremedia.iso.boxes.Box r1 = r5.createMoov()
            r1.getBox(r0)
        L14:
            com.mp4parser.streaming.StreamingTrack r1 = r5.source     // Catch: java.lang.InterruptedException -> L2b
            java.util.concurrent.BlockingQueue r1 = r1.getSamples()     // Catch: java.lang.InterruptedException -> L2b
            r2 = 100
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L2b
            java.lang.Object r1 = r1.poll(r2, r4)     // Catch: java.lang.InterruptedException -> L2b
            com.mp4parser.streaming.StreamingSample r1 = (com.mp4parser.streaming.StreamingSample) r1     // Catch: java.lang.InterruptedException -> L2b
            if (r1 != 0) goto L27
            goto L2f
        L27:
            r5.consumeSample(r1, r0)     // Catch: java.lang.InterruptedException -> L2b
            goto L14
        L2b:
            r1 = move-exception
            r1.printStackTrace()
        L2f:
            com.mp4parser.streaming.StreamingTrack r1 = r5.source
            boolean r1 = r1.hasMoreSamples()
            if (r1 != 0) goto L14
            return
    }
}
