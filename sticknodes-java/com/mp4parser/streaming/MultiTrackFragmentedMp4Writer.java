package com.mp4parser.streaming;

/* loaded from: classes2.dex */
public class MultiTrackFragmentedMp4Writer implements com.mp4parser.streaming.StreamingMp4Writer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    com.mp4parser.streaming.extensions.CompositionTimeTrackExtension compositionTimeTrackExtension;
    java.util.Date creationTime;
    private long currentFragmentStartTime;
    private long currentTime;
    java.util.Map<com.mp4parser.streaming.StreamingTrack, java.util.List<com.mp4parser.streaming.StreamingSample>> fragmentBuffers;
    private final java.io.OutputStream outputStream;
    com.mp4parser.streaming.extensions.SampleFlagsTrackExtension sampleDependencyTrackExtension;
    private long sequenceNumber;
    com.mp4parser.streaming.StreamingTrack[] source;


    class ConsumeSamplesCallable implements java.util.concurrent.Callable {
        private com.mp4parser.streaming.StreamingTrack streamingTrack;
        final /* synthetic */ com.mp4parser.streaming.MultiTrackFragmentedMp4Writer this$0;

        public ConsumeSamplesCallable(com.mp4parser.streaming.MultiTrackFragmentedMp4Writer r1, com.mp4parser.streaming.StreamingTrack r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.streamingTrack = r2
                return
        }

        @Override // java.util.concurrent.Callable
        public java.lang.Object call() throws java.lang.Exception {
                r4 = this;
            L0:
                com.mp4parser.streaming.StreamingTrack r0 = r4.streamingTrack     // Catch: java.lang.InterruptedException -> L1b
                java.util.concurrent.BlockingQueue r0 = r0.getSamples()     // Catch: java.lang.InterruptedException -> L1b
                r1 = 100
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L1b
                java.lang.Object r0 = r0.poll(r1, r3)     // Catch: java.lang.InterruptedException -> L1b
                com.mp4parser.streaming.StreamingSample r0 = (com.mp4parser.streaming.StreamingSample) r0     // Catch: java.lang.InterruptedException -> L1b
                if (r0 != 0) goto L13
                goto L1f
            L13:
                com.mp4parser.streaming.MultiTrackFragmentedMp4Writer r1 = r4.this$0     // Catch: java.lang.InterruptedException -> L1b
                com.mp4parser.streaming.StreamingTrack r2 = r4.streamingTrack     // Catch: java.lang.InterruptedException -> L1b
                com.mp4parser.streaming.MultiTrackFragmentedMp4Writer.access$0(r1, r2, r0)     // Catch: java.lang.InterruptedException -> L1b
                goto L0
            L1b:
                r0 = move-exception
                r0.printStackTrace()
            L1f:
                com.mp4parser.streaming.StreamingTrack r0 = r4.streamingTrack
                boolean r0 = r0.hasMoreSamples()
                if (r0 != 0) goto L0
                r0 = 0
                return r0
        }
    }

    static {
            java.lang.Class<com.mp4parser.streaming.MultiTrackFragmentedMp4Writer> r0 = com.mp4parser.streaming.MultiTrackFragmentedMp4Writer.class
            return
    }

    public MultiTrackFragmentedMp4Writer(com.mp4parser.streaming.StreamingTrack[] r11, java.io.OutputStream r12) {
            r10 = this;
            java.lang.Class<com.mp4parser.streaming.extensions.TrackIdTrackExtension> r0 = com.mp4parser.streaming.extensions.TrackIdTrackExtension.class
            r10.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r10.fragmentBuffers = r1
            r1 = 1
            r10.sequenceNumber = r1
            r3 = 0
            r10.currentFragmentStartTime = r3
            r10.currentTime = r3
            r10.source = r11
            r10.outputStream = r12
            java.util.Date r12 = new java.util.Date
            r12.<init>()
            r10.creationTime = r12
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            int r3 = r11.length
            r4 = 0
            r5 = 0
        L29:
            if (r5 < r3) goto L63
            int r6 = r11.length
        L2c:
            if (r4 < r6) goto L2f
            return
        L2f:
            r3 = r11[r4]
            com.mp4parser.streaming.TrackExtension r5 = r3.getTrackExtension(r0)
            if (r5 == 0) goto L60
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r12)
            java.util.Collections.sort(r5)
            com.mp4parser.streaming.extensions.TrackIdTrackExtension r7 = new com.mp4parser.streaming.extensions.TrackIdTrackExtension
            int r8 = r5.size()
            if (r8 <= 0) goto L59
            int r8 = r5.size()
            int r8 = r8 + (-1)
            java.lang.Object r5 = r5.get(r8)
            java.lang.Long r5 = (java.lang.Long) r5
            long r8 = r5.longValue()
            long r8 = r8 + r1
            goto L5a
        L59:
            r8 = r1
        L5a:
            r7.<init>(r8)
            r3.addTrackExtension(r7)
        L60:
            int r4 = r4 + 1
            goto L2c
        L63:
            r6 = r11[r5]
            com.mp4parser.streaming.TrackExtension r7 = r6.getTrackExtension(r0)
            if (r7 == 0) goto L88
            com.mp4parser.streaming.TrackExtension r6 = r6.getTrackExtension(r0)
            com.mp4parser.streaming.extensions.TrackIdTrackExtension r6 = (com.mp4parser.streaming.extensions.TrackIdTrackExtension) r6
            long r6 = r6.getTrackId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            boolean r6 = r12.contains(r6)
            if (r6 != 0) goto L80
            goto L88
        L80:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "There may not be two tracks with the same trackID within one file"
            r11.<init>(r12)
            throw r11
        L88:
            int r5 = r5 + 1
            goto L29
    }

    static /* synthetic */ void access$0(com.mp4parser.streaming.MultiTrackFragmentedMp4Writer r0, com.mp4parser.streaming.StreamingTrack r1, com.mp4parser.streaming.StreamingSample r2) throws java.io.IOException {
            r0.consumeSample(r1, r2)
            return
    }

    private synchronized void consumeSample(com.mp4parser.streaming.StreamingTrack r10, com.mp4parser.streaming.StreamingSample r11) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            com.mp4parser.streaming.SampleExtension[] r1 = r11.getExtensions()     // Catch: java.lang.Throwable -> L78
            int r2 = r1.length     // Catch: java.lang.Throwable -> L78
            r3 = 0
        L8:
            if (r3 < r2) goto L65
            long r1 = r9.currentTime     // Catch: java.lang.Throwable -> L78
            long r3 = r11.getDuration()     // Catch: java.lang.Throwable -> L78
            long r1 = r1 + r3
            r9.currentTime = r1     // Catch: java.lang.Throwable -> L78
            java.util.Map<com.mp4parser.streaming.StreamingTrack, java.util.List<com.mp4parser.streaming.StreamingSample>> r1 = r9.fragmentBuffers     // Catch: java.lang.Throwable -> L78
            java.lang.Object r1 = r1.get(r10)     // Catch: java.lang.Throwable -> L78
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L78
            r1.add(r11)     // Catch: java.lang.Throwable -> L78
            long r1 = r9.currentTime     // Catch: java.lang.Throwable -> L78
            long r3 = r9.currentFragmentStartTime     // Catch: java.lang.Throwable -> L78
            r5 = 3
            long r7 = r10.getTimescale()     // Catch: java.lang.Throwable -> L78
            java.lang.Long.signum(r7)
            long r7 = r7 * r5
            long r3 = r3 + r7
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 <= 0) goto L63
            java.util.Map<com.mp4parser.streaming.StreamingTrack, java.util.List<com.mp4parser.streaming.StreamingSample>> r11 = r9.fragmentBuffers     // Catch: java.lang.Throwable -> L78
            int r11 = r11.size()     // Catch: java.lang.Throwable -> L78
            if (r11 <= 0) goto L63
            com.mp4parser.streaming.extensions.SampleFlagsTrackExtension r11 = r9.sampleDependencyTrackExtension     // Catch: java.lang.Throwable -> L78
            if (r11 == 0) goto L46
            if (r0 == 0) goto L46
            boolean r11 = r0.isSyncSample()     // Catch: java.lang.Throwable -> L78
            if (r11 == 0) goto L63
        L46:
            java.io.OutputStream r11 = r9.outputStream     // Catch: java.lang.Throwable -> L78
            java.nio.channels.WritableByteChannel r11 = java.nio.channels.Channels.newChannel(r11)     // Catch: java.lang.Throwable -> L78
            com.coremedia.iso.boxes.Box r0 = r9.createMoof(r10)     // Catch: java.lang.Throwable -> L78
            r0.getBox(r11)     // Catch: java.lang.Throwable -> L78
            com.coremedia.iso.boxes.Box r10 = r9.createMdat(r10)     // Catch: java.lang.Throwable -> L78
            r10.getBox(r11)     // Catch: java.lang.Throwable -> L78
            long r10 = r9.currentTime     // Catch: java.lang.Throwable -> L78
            r9.currentFragmentStartTime = r10     // Catch: java.lang.Throwable -> L78
            java.util.Map<com.mp4parser.streaming.StreamingTrack, java.util.List<com.mp4parser.streaming.StreamingSample>> r10 = r9.fragmentBuffers     // Catch: java.lang.Throwable -> L78
            r10.clear()     // Catch: java.lang.Throwable -> L78
        L63:
            monitor-exit(r9)
            return
        L65:
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L78
            boolean r5 = r4 instanceof com.mp4parser.streaming.extensions.SampleFlagsSampleExtension     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L6f
            com.mp4parser.streaming.extensions.SampleFlagsSampleExtension r4 = (com.mp4parser.streaming.extensions.SampleFlagsSampleExtension) r4     // Catch: java.lang.Throwable -> L78
            r0 = r4
            goto L75
        L6f:
            boolean r5 = r4 instanceof com.mp4parser.streaming.extensions.CompositionTimeSampleExtension     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L75
            com.mp4parser.streaming.extensions.CompositionTimeSampleExtension r4 = (com.mp4parser.streaming.extensions.CompositionTimeSampleExtension) r4     // Catch: java.lang.Throwable -> L78
        L75:
            int r3 = r3 + 1
            goto L8
        L78:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    private com.coremedia.iso.boxes.Box createMdat(com.mp4parser.streaming.StreamingTrack r3) {
            r2 = this;
            com.mp4parser.streaming.MultiTrackFragmentedMp4Writer$1 r0 = new com.mp4parser.streaming.MultiTrackFragmentedMp4Writer$1
            java.lang.String r1 = "mdat"
            r0.<init>(r2, r1, r3)
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

    private com.coremedia.iso.boxes.Box createMoof(com.mp4parser.streaming.StreamingTrack r6) {
            r5 = this;
            com.coremedia.iso.boxes.fragment.MovieFragmentBox r0 = new com.coremedia.iso.boxes.fragment.MovieFragmentBox
            r0.<init>()
            long r1 = r5.sequenceNumber
            r5.createMfhd(r1, r0)
            r5.createTraf(r6, r0)
            java.util.List r6 = r0.getTrackRunBoxes()
            r1 = 0
            java.lang.Object r6 = r6.get(r1)
            com.coremedia.iso.boxes.fragment.TrackRunBox r6 = (com.coremedia.iso.boxes.fragment.TrackRunBox) r6
            r1 = 1
            r6.setDataOffset(r1)
            long r1 = r0.getSize()
            r3 = 8
            long r1 = r1 + r3
            int r2 = (int) r1
            r6.setDataOffset(r2)
            long r1 = r5.sequenceNumber
            r3 = 1
            long r1 = r1 + r3
            r5.sequenceNumber = r1
            return r0
    }

    private void createTraf(com.mp4parser.streaming.StreamingTrack r2, com.coremedia.iso.boxes.fragment.MovieFragmentBox r3) {
            r1 = this;
            com.coremedia.iso.boxes.fragment.TrackFragmentBox r0 = new com.coremedia.iso.boxes.fragment.TrackFragmentBox
            r0.<init>()
            r3.addBox(r0)
            r1.createTfhd(r2, r0)
            r1.createTfdt(r0)
            r1.createTrun(r2, r0)
            java.lang.Class<com.mp4parser.streaming.extensions.CencEncryptTrackExtension> r3 = com.mp4parser.streaming.extensions.CencEncryptTrackExtension.class
            r2.getTrackExtension(r3)
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

    protected com.coremedia.iso.boxes.Box createMdhd(com.mp4parser.streaming.StreamingTrack r4) {
            r3 = this;
            com.coremedia.iso.boxes.MediaHeaderBox r0 = new com.coremedia.iso.boxes.MediaHeaderBox
            r0.<init>()
            java.util.Date r1 = r3.creationTime
            r0.setCreationTime(r1)
            java.util.Date r1 = r3.creationTime
            r0.setModificationTime(r1)
            r1 = 0
            r0.setDuration(r1)
            long r1 = r4.getTimescale()
            r0.setTimescale(r1)
            java.lang.String r4 = r4.getLanguage()
            r0.setLanguage(r4)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMdia(com.mp4parser.streaming.StreamingTrack r3) {
            r2 = this;
            com.coremedia.iso.boxes.MediaBox r0 = new com.coremedia.iso.boxes.MediaBox
            r0.<init>()
            com.coremedia.iso.boxes.Box r1 = r2.createMdhd(r3)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r1 = r2.createMdiaHdlr(r3)
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r3 = r2.createMinf(r3)
            r0.addBox(r3)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMdiaHdlr(com.mp4parser.streaming.StreamingTrack r2) {
            r1 = this;
            com.coremedia.iso.boxes.HandlerBox r0 = new com.coremedia.iso.boxes.HandlerBox
            r0.<init>()
            java.lang.String r2 = r2.getHandler()
            r0.setHandlerType(r2)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMinf(com.mp4parser.streaming.StreamingTrack r4) {
            r3 = this;
            com.coremedia.iso.boxes.MediaInformationBox r0 = new com.coremedia.iso.boxes.MediaInformationBox
            r0.<init>()
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "vide"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1a
            com.coremedia.iso.boxes.VideoMediaHeaderBox r1 = new com.coremedia.iso.boxes.VideoMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L1a:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "soun"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            com.coremedia.iso.boxes.SoundMediaHeaderBox r1 = new com.coremedia.iso.boxes.SoundMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L2f:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L44
            com.coremedia.iso.boxes.NullMediaHeaderBox r1 = new com.coremedia.iso.boxes.NullMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L44:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "subt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L59
            com.coremedia.iso.boxes.SubtitleMediaHeaderBox r1 = new com.coremedia.iso.boxes.SubtitleMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L59:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "hint"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6e
            com.coremedia.iso.boxes.HintMediaHeaderBox r1 = new com.coremedia.iso.boxes.HintMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
            goto L82
        L6e:
            java.lang.String r1 = r4.getHandler()
            java.lang.String r2 = "sbtl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L82
            com.coremedia.iso.boxes.NullMediaHeaderBox r1 = new com.coremedia.iso.boxes.NullMediaHeaderBox
            r1.<init>()
            r0.addBox(r1)
        L82:
            com.coremedia.iso.boxes.DataInformationBox r1 = r3.createDinf()
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r4 = r3.createStbl(r4)
            r0.addBox(r4)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createMoov() {
            r5 = this;
            com.coremedia.iso.boxes.MovieBox r0 = new com.coremedia.iso.boxes.MovieBox
            r0.<init>()
            com.coremedia.iso.boxes.Box r1 = r5.createMvhd()
            r0.addBox(r1)
            com.mp4parser.streaming.StreamingTrack[] r1 = r5.source
            int r2 = r1.length
            r3 = 0
        L10:
            if (r3 < r2) goto L1a
            com.coremedia.iso.boxes.Box r1 = r5.createMvex()
            r0.addBox(r1)
            return r0
        L1a:
            r4 = r1[r3]
            com.coremedia.iso.boxes.Box r4 = r5.createTrak(r4)
            r0.addBox(r4)
            int r3 = r3 + 1
            goto L10
    }

    protected com.coremedia.iso.boxes.Box createMvex() {
            r5 = this;
            com.coremedia.iso.boxes.fragment.MovieExtendsBox r0 = new com.coremedia.iso.boxes.fragment.MovieExtendsBox
            r0.<init>()
            com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox r1 = new com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox
            r1.<init>()
            r2 = 1
            r1.setVersion(r2)
            r2 = 0
            r1.setFragmentDuration(r2)
            r0.addBox(r1)
            com.mp4parser.streaming.StreamingTrack[] r1 = r5.source
            int r2 = r1.length
            r3 = 0
        L1a:
            if (r3 < r2) goto L1d
            return r0
        L1d:
            r4 = r1[r3]
            com.coremedia.iso.boxes.Box r4 = r5.createTrex(r4)
            r0.addBox(r4)
            int r3 = r3 + 1
            goto L1a
    }

    protected com.coremedia.iso.boxes.Box createMvhd() {
            r11 = this;
            com.coremedia.iso.boxes.MovieHeaderBox r0 = new com.coremedia.iso.boxes.MovieHeaderBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            java.util.Date r2 = r11.creationTime
            r0.setCreationTime(r2)
            java.util.Date r2 = r11.creationTime
            r0.setModificationTime(r2)
            r2 = 0
            r0.setDuration(r2)
            r2 = 0
            long[] r3 = new long[r2]
            com.mp4parser.streaming.StreamingTrack[] r4 = r11.source
            int r5 = r4.length
            r6 = 0
        L1f:
            if (r6 < r5) goto L2e
            long r1 = com.googlecode.mp4parser.util.Math.lcm(r3)
            r0.setTimescale(r1)
            r1 = 2
            r0.setNextTrackId(r1)
            return r0
        L2e:
            r7 = r4[r6]
            long[] r8 = new long[r1]
            long r9 = r7.getTimescale()
            r8[r2] = r9
            com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r3, r8)
            int r6 = r6 + 1
            goto L1f
    }

    protected com.coremedia.iso.boxes.Box createStbl(com.mp4parser.streaming.StreamingTrack r2) {
            r1 = this;
            com.coremedia.iso.boxes.SampleTableBox r0 = new com.coremedia.iso.boxes.SampleTableBox
            r0.<init>()
            com.coremedia.iso.boxes.SampleDescriptionBox r2 = r2.getSampleDescriptionBox()
            r0.addBox(r2)
            com.coremedia.iso.boxes.TimeToSampleBox r2 = new com.coremedia.iso.boxes.TimeToSampleBox
            r2.<init>()
            r0.addBox(r2)
            com.coremedia.iso.boxes.SampleToChunkBox r2 = new com.coremedia.iso.boxes.SampleToChunkBox
            r2.<init>()
            r0.addBox(r2)
            com.coremedia.iso.boxes.SampleSizeBox r2 = new com.coremedia.iso.boxes.SampleSizeBox
            r2.<init>()
            r0.addBox(r2)
            com.coremedia.iso.boxes.StaticChunkOffsetBox r2 = new com.coremedia.iso.boxes.StaticChunkOffsetBox
            r2.<init>()
            r0.addBox(r2)
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

    protected void createTfhd(com.mp4parser.streaming.StreamingTrack r4, com.coremedia.iso.boxes.fragment.TrackFragmentBox r5) {
            r3 = this;
            com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox r0 = new com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox
            r0.<init>()
            com.coremedia.iso.boxes.fragment.SampleFlags r1 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r1.<init>()
            r0.setDefaultSampleFlags(r1)
            r1 = -1
            r0.setBaseDataOffset(r1)
            java.lang.Class<com.mp4parser.streaming.extensions.TrackIdTrackExtension> r1 = com.mp4parser.streaming.extensions.TrackIdTrackExtension.class
            com.mp4parser.streaming.TrackExtension r4 = r4.getTrackExtension(r1)
            com.mp4parser.streaming.extensions.TrackIdTrackExtension r4 = (com.mp4parser.streaming.extensions.TrackIdTrackExtension) r4
            long r1 = r4.getTrackId()
            r0.setTrackId(r1)
            r4 = 1
            r0.setDefaultBaseIsMoof(r4)
            r5.addBox(r0)
            return
    }

    protected com.coremedia.iso.boxes.Box createTrak(com.mp4parser.streaming.StreamingTrack r3) {
            r2 = this;
            com.coremedia.iso.boxes.TrackBox r0 = new com.coremedia.iso.boxes.TrackBox
            r0.<init>()
            com.coremedia.iso.boxes.TrackHeaderBox r1 = r3.getTrackHeaderBox()
            r0.addBox(r1)
            com.coremedia.iso.boxes.TrackHeaderBox r1 = r3.getTrackHeaderBox()
            r0.addBox(r1)
            com.coremedia.iso.boxes.Box r3 = r2.createMdia(r3)
            r0.addBox(r3)
            return r0
    }

    protected com.coremedia.iso.boxes.Box createTrex(com.mp4parser.streaming.StreamingTrack r5) {
            r4 = this;
            com.coremedia.iso.boxes.fragment.TrackExtendsBox r0 = new com.coremedia.iso.boxes.fragment.TrackExtendsBox
            r0.<init>()
            com.coremedia.iso.boxes.TrackHeaderBox r1 = r5.getTrackHeaderBox()
            long r1 = r1.getTrackId()
            r0.setTrackId(r1)
            r1 = 1
            r0.setDefaultSampleDescriptionIndex(r1)
            r1 = 0
            r0.setDefaultSampleDuration(r1)
            r0.setDefaultSampleSize(r1)
            com.coremedia.iso.boxes.fragment.SampleFlags r1 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r1.<init>()
            java.lang.String r2 = r5.getHandler()
            java.lang.String r3 = "soun"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3a
            java.lang.String r5 = r5.getHandler()
            java.lang.String r2 = "subt"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L41
        L3a:
            r5 = 2
            r1.setSampleDependsOn(r5)
            r1.setSampleIsDependedOn(r5)
        L41:
            r0.setDefaultSampleFlags(r1)
            return r0
    }

    protected void createTrun(com.mp4parser.streaming.StreamingTrack r9, com.coremedia.iso.boxes.fragment.TrackFragmentBox r10) {
            r8 = this;
            com.coremedia.iso.boxes.fragment.TrackRunBox r0 = new com.coremedia.iso.boxes.fragment.TrackRunBox
            r0.<init>()
            r1 = 1
            r0.setVersion(r1)
            r0.setSampleDurationPresent(r1)
            r0.setSampleSizePresent(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Map<com.mp4parser.streaming.StreamingTrack, java.util.List<com.mp4parser.streaming.StreamingSample>> r3 = r8.fragmentBuffers
            int r3 = r3.size()
            r2.<init>(r3)
            java.lang.Class<com.mp4parser.streaming.extensions.CompositionTimeTrackExtension> r3 = com.mp4parser.streaming.extensions.CompositionTimeTrackExtension.class
            com.mp4parser.streaming.TrackExtension r3 = r9.getTrackExtension(r3)
            r4 = 0
            if (r3 == 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            r0.setSampleCompositionTimeOffsetPresent(r3)
            java.lang.Class<com.mp4parser.streaming.extensions.SampleFlagsTrackExtension> r3 = com.mp4parser.streaming.extensions.SampleFlagsTrackExtension.class
            com.mp4parser.streaming.TrackExtension r3 = r9.getTrackExtension(r3)
            if (r3 == 0) goto L32
            goto L33
        L32:
            r1 = 0
        L33:
            r0.setSampleFlagsPresent(r1)
            java.util.Map<com.mp4parser.streaming.StreamingTrack, java.util.List<com.mp4parser.streaming.StreamingSample>> r3 = r8.fragmentBuffers
            java.lang.Object r9 = r3.get(r9)
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
        L42:
            boolean r3 = r9.hasNext()
            if (r3 != 0) goto L4f
            r0.setEntries(r2)
            r10.addBox(r0)
            return
        L4f:
            java.lang.Object r3 = r9.next()
            com.mp4parser.streaming.StreamingSample r3 = (com.mp4parser.streaming.StreamingSample) r3
            com.coremedia.iso.boxes.fragment.TrackRunBox$Entry r4 = new com.coremedia.iso.boxes.fragment.TrackRunBox$Entry
            r4.<init>()
            java.nio.ByteBuffer r5 = r3.getContent()
            int r5 = r5.remaining()
            long r5 = (long) r5
            r4.setSampleSize(r5)
            if (r1 == 0) goto La9
            java.lang.Class<com.mp4parser.streaming.extensions.SampleFlagsSampleExtension> r5 = com.mp4parser.streaming.extensions.SampleFlagsSampleExtension.class
            com.mp4parser.streaming.SampleExtension r5 = com.mp4parser.streaming.StreamingSampleHelper.getSampleExtension(r3, r5)
            com.mp4parser.streaming.extensions.SampleFlagsSampleExtension r5 = (com.mp4parser.streaming.extensions.SampleFlagsSampleExtension) r5
            com.coremedia.iso.boxes.fragment.SampleFlags r6 = new com.coremedia.iso.boxes.fragment.SampleFlags
            r6.<init>()
            byte r7 = r5.getIsLeading()
            r6.setIsLeading(r7)
            byte r7 = r5.getSampleIsDependedOn()
            r6.setSampleIsDependedOn(r7)
            byte r7 = r5.getSampleDependsOn()
            r6.setSampleDependsOn(r7)
            byte r7 = r5.getSampleHasRedundancy()
            r6.setSampleHasRedundancy(r7)
            boolean r7 = r5.isSampleIsNonSyncSample()
            r6.setSampleIsDifferenceSample(r7)
            byte r7 = r5.getSamplePaddingValue()
            r6.setSamplePaddingValue(r7)
            int r5 = r5.getSampleDegradationPriority()
            r6.setSampleDegradationPriority(r5)
            r4.setSampleFlags(r6)
        La9:
            long r5 = r3.getDuration()
            r4.setSampleDuration(r5)
            boolean r5 = r0.isSampleCompositionTimeOffsetPresent()
            if (r5 == 0) goto Lc5
            java.lang.Class<com.mp4parser.streaming.extensions.CompositionTimeSampleExtension> r5 = com.mp4parser.streaming.extensions.CompositionTimeSampleExtension.class
            com.mp4parser.streaming.SampleExtension r3 = com.mp4parser.streaming.StreamingSampleHelper.getSampleExtension(r3, r5)
            com.mp4parser.streaming.extensions.CompositionTimeSampleExtension r3 = (com.mp4parser.streaming.extensions.CompositionTimeSampleExtension) r3
            int r3 = r3.getCompositionTimeOffset()
            r4.setSampleCompositionTimeOffset(r3)
        Lc5:
            r2.add(r4)
            goto L42
    }

    @Override // com.mp4parser.streaming.StreamingMp4Writer
    public void write() throws java.io.IOException {
            r6 = this;
            java.io.OutputStream r0 = r6.outputStream
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            com.coremedia.iso.boxes.Box r1 = r6.createFtyp()
            r1.getBox(r0)
            com.coremedia.iso.boxes.Box r1 = r6.createMoov()
            r1.getBox(r0)
            com.mp4parser.streaming.StreamingTrack[] r0 = r6.source
            int r0 = r0.length
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0)
            com.mp4parser.streaming.StreamingTrack[] r1 = r6.source
            int r2 = r1.length
            r3 = 0
        L1f:
            if (r3 < r2) goto L22
            return
        L22:
            r4 = r1[r3]
            com.mp4parser.streaming.MultiTrackFragmentedMp4Writer$ConsumeSamplesCallable r5 = new com.mp4parser.streaming.MultiTrackFragmentedMp4Writer$ConsumeSamplesCallable
            r5.<init>(r6, r4)
            r0.submit(r5)
            int r3 = r3 + 1
            goto L1f
    }
}
