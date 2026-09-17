package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class MP3TrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    private static final int[] BIT_RATE = null;
    private static final int ES_OBJECT_TYPE_INDICATION = 107;
    private static final int ES_STREAM_TYPE = 5;
    private static final int MPEG_L3 = 1;
    private static final int MPEG_V1 = 3;
    private static final int SAMPLES_PER_FRAME = 1152;
    private static final int[] SAMPLE_RATE = null;
    long avgBitRate;
    private final com.googlecode.mp4parser.DataSource dataSource;
    private long[] durations;
    com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl.MP3Header firstHeader;
    long maxBitRate;
    com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    private java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;

    class MP3Header {
        int bitRate;
        int bitRateIndex;
        int channelCount;
        int channelMode;
        int layer;
        int mpegVersion;
        int padding;
        int protectionAbsent;
        int sampleFrequencyIndex;
        int sampleRate;
        final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl this$0;

        MP3Header(com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        int getFrameLength() {
                r2 = this;
                int r0 = r2.bitRate
                int r0 = r0 * 144
                int r1 = r2.sampleRate
                int r0 = r0 / r1
                int r1 = r2.padding
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            r0 = 4
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 44100(0xac44, float:6.1797E-41)
            r1[r2] = r3
            r2 = 1
            r3 = 48000(0xbb80, float:6.7262E-41)
            r1[r2] = r3
            r4 = 2
            r5 = 32000(0x7d00, float:4.4842E-41)
            r1[r4] = r5
            com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl.SAMPLE_RATE = r1
            r1 = 16
            int[] r1 = new int[r1]
            r1[r2] = r5
            r2 = 40000(0x9c40, float:5.6052E-41)
            r1[r4] = r2
            r2 = 3
            r1[r2] = r3
            r2 = 56000(0xdac0, float:7.8473E-41)
            r1[r0] = r2
            r0 = 5
            r2 = 64000(0xfa00, float:8.9683E-41)
            r1[r0] = r2
            r0 = 6
            r2 = 80000(0x13880, float:1.12104E-40)
            r1[r0] = r2
            r0 = 7
            r2 = 96000(0x17700, float:1.34525E-40)
            r1[r0] = r2
            r0 = 8
            r2 = 112000(0x1b580, float:1.56945E-40)
            r1[r0] = r2
            r0 = 9
            r2 = 128000(0x1f400, float:1.79366E-40)
            r1[r0] = r2
            r0 = 10
            r2 = 160000(0x27100, float:2.24208E-40)
            r1[r0] = r2
            r0 = 11
            r2 = 192000(0x2ee00, float:2.6905E-40)
            r1[r0] = r2
            r0 = 12
            r2 = 224000(0x36b00, float:3.13891E-40)
            r1[r0] = r2
            r0 = 13
            r2 = 256000(0x3e800, float:3.58732E-40)
            r1[r0] = r2
            r0 = 14
            r2 = 320000(0x4e200, float:4.48416E-40)
            r1[r0] = r2
            com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl.BIT_RATE = r1
            return
    }

    public MP3TrackImpl(com.googlecode.mp4parser.DataSource r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "eng"
            r1.<init>(r2, r0)
            return
    }

    public MP3TrackImpl(com.googlecode.mp4parser.DataSource r13, java.lang.String r14) throws java.io.IOException {
            r12 = this;
            java.lang.String r0 = r13.toString()
            r12.<init>(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r12.trackMetaData = r0
            r12.dataSource = r13
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r12.samples = r0
            com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl$MP3Header r13 = r12.readSamples(r13)
            r12.firstHeader = r13
            int r13 = r13.sampleRate
            double r0 = (double) r13
            r2 = 4652781365027143680(0x4092000000000000, double:1152.0)
            double r0 = r0 / r2
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r13 = r12.samples
            int r13 = r13.size()
            double r2 = (double) r13
            double r2 = r2 / r0
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r4 = r12.samples
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L38:
            boolean r7 = r4.hasNext()
            r8 = 0
            if (r7 != 0) goto Lec
            r0 = 8
            long r5 = r5 * r0
            double r0 = (double) r5
            double r0 = r0 / r2
            int r13 = (int) r0
            long r0 = (long) r13
            r12.avgBitRate = r0
            com.coremedia.iso.boxes.SampleDescriptionBox r13 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r13.<init>()
            r12.sampleDescriptionBox = r13
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r13 = new com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            java.lang.String r0 = "mp4a"
            r13.<init>(r0)
            com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl$MP3Header r0 = r12.firstHeader
            int r0 = r0.channelCount
            r13.setChannelCount(r0)
            com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl$MP3Header r0 = r12.firstHeader
            int r0 = r0.sampleRate
            long r0 = (long) r0
            r13.setSampleRate(r0)
            r0 = 1
            r13.setDataReferenceIndex(r0)
            r0 = 16
            r13.setSampleSize(r0)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox r0 = new com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox
            r0.<init>()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor
            r1.<init>()
            r1.setEsId(r8)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor
            r2.<init>()
            r3 = 2
            r2.setPredefined(r3)
            r1.setSlConfigDescriptor(r2)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor
            r2.<init>()
            r3 = 107(0x6b, float:1.5E-43)
            r2.setObjectTypeIndication(r3)
            r3 = 5
            r2.setStreamType(r3)
            long r3 = r12.maxBitRate
            r2.setMaxBitRate(r3)
            long r3 = r12.avgBitRate
            r2.setAvgBitRate(r3)
            r1.setDecoderConfigDescriptor(r2)
            java.nio.ByteBuffer r1 = r1.serialize()
            r0.setData(r1)
            r13.addBox(r0)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r12.sampleDescriptionBox
            r0.addBox(r13)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r13.setCreationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r13.setModificationTime(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            r13.setLanguage(r14)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            r14 = 1065353216(0x3f800000, float:1.0)
            r13.setVolume(r14)
            com.googlecode.mp4parser.authoring.TrackMetaData r13 = r12.trackMetaData
            com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl$MP3Header r14 = r12.firstHeader
            int r14 = r14.sampleRate
            long r0 = (long) r14
            r13.setTimescale(r0)
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r13 = r12.samples
            int r13 = r13.size()
            long[] r13 = new long[r13]
            r12.durations = r13
            r0 = 1152(0x480, double:5.69E-321)
            java.util.Arrays.fill(r13, r0)
            return
        Lec:
            java.lang.Object r7 = r4.next()
            com.googlecode.mp4parser.authoring.Sample r7 = (com.googlecode.mp4parser.authoring.Sample) r7
            long r9 = r7.getSize()
            int r7 = (int) r9
            long r9 = (long) r7
            long r5 = r5 + r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.add(r7)
        L100:
            int r7 = r13.size()
            double r9 = (double) r7
            int r7 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r7 > 0) goto L140
            int r7 = r13.size()
            int r9 = (int) r0
            if (r7 != r9) goto L38
            java.util.Iterator r7 = r13.iterator()
        L114:
            boolean r9 = r7.hasNext()
            if (r9 != 0) goto L134
            r9 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r7 = (double) r8
            double r7 = r7 * r9
            int r9 = r13.size()
            double r9 = (double) r9
            double r7 = r7 / r9
            double r7 = r7 * r0
            long r9 = r12.maxBitRate
            double r9 = (double) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L38
            int r7 = (int) r7
            long r7 = (long) r7
            r12.maxBitRate = r7
            goto L38
        L134:
            java.lang.Object r9 = r7.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            int r8 = r8 + r9
            goto L114
        L140:
            r13.pop()
            goto L100
    }

    private com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl.MP3Header readMP3Header(com.googlecode.mp4parser.DataSource r7) throws java.io.IOException {
            r6 = this;
            com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl$MP3Header r0 = new com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl$MP3Header
            r0.<init>(r6)
            r1 = 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
        La:
            int r3 = r2.position()
            if (r3 < r1) goto L97
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r7 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            java.nio.Buffer r2 = r2.rewind()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r7.<init>(r2)
            r2 = 11
            int r2 = r7.readBits(r2)
            r3 = 2047(0x7ff, float:2.868E-42)
            if (r2 != r3) goto L8f
            r2 = 2
            int r3 = r7.readBits(r2)
            r0.mpegVersion = r3
            r4 = 3
            if (r3 != r4) goto L87
            int r3 = r7.readBits(r2)
            r0.layer = r3
            r5 = 1
            if (r3 != r5) goto L7f
            int r3 = r7.readBits(r5)
            r0.protectionAbsent = r3
            int r1 = r7.readBits(r1)
            r0.bitRateIndex = r1
            int[] r3 = com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl.BIT_RATE
            r1 = r3[r1]
            r0.bitRate = r1
            if (r1 == 0) goto L77
            int r1 = r7.readBits(r2)
            r0.sampleFrequencyIndex = r1
            int[] r3 = com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl.SAMPLE_RATE
            r1 = r3[r1]
            r0.sampleRate = r1
            if (r1 == 0) goto L6f
            int r1 = r7.readBits(r5)
            r0.padding = r1
            r7.readBits(r5)
            int r7 = r7.readBits(r2)
            r0.channelMode = r7
            if (r7 != r4) goto L6c
            r2 = 1
        L6c:
            r0.channelCount = r2
            return r0
        L6f:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Unexpected (reserved) sample rate frequency"
            r7.<init>(r0)
            throw r7
        L77:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Unexpected (free/bad) bit rate"
            r7.<init>(r0)
            throw r7
        L7f:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Expected Layer III"
            r7.<init>(r0)
            throw r7
        L87:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Expected MPEG Version 1 (ISO/IEC 11172-3)"
            r7.<init>(r0)
            throw r7
        L8f:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Expected Start Word 0x7ff"
            r7.<init>(r0)
            throw r7
        L97:
            int r3 = r7.read(r2)
            r4 = -1
            if (r3 != r4) goto La
            r7 = 0
            return r7
    }

    private com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl.MP3Header readSamples(com.googlecode.mp4parser.DataSource r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
        L1:
            long r1 = r5.position()
            com.googlecode.mp4parser.authoring.tracks.MP3TrackImpl$MP3Header r3 = r4.readMP3Header(r5)
            if (r3 != 0) goto Lc
            return r0
        Lc:
            if (r0 != 0) goto Lf
            r0 = r3
        Lf:
            r5.position(r1)
            int r1 = r3.getFrameLength()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r5.read(r1)
            r1.rewind()
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r2 = r4.samples
            com.googlecode.mp4parser.authoring.SampleImpl r3 = new com.googlecode.mp4parser.authoring.SampleImpl
            r3.<init>(r1)
            r2.add(r3)
            goto L1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "soun"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.sampleDescriptionBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r1 = this;
            long[] r0 = r1.durations
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "MP3TrackImpl"
            return r0
    }
}
