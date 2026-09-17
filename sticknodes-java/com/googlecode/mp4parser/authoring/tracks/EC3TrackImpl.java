package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class EC3TrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    private static final long MAX_FRAMES_PER_MMAP = 20;
    private java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.BitStreamInfo> bitStreamInfos;
    private int bitrate;
    private final com.googlecode.mp4parser.DataSource dataSource;
    private long[] decodingTimes;
    private int frameSize;
    com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    private java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;


    public static class BitStreamInfo extends com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry {
        public int bitrate;
        public int chanmap;
        public int frameSize;
        public int samplerate;
        public int strmtyp;
        public int substreamid;

        public BitStreamInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "BitStreamInfo{frameSize="
                r0.<init>(r1)
                int r1 = r2.frameSize
                r0.append(r1)
                java.lang.String r1 = ", substreamid="
                r0.append(r1)
                int r1 = r2.substreamid
                r0.append(r1)
                java.lang.String r1 = ", bitrate="
                r0.append(r1)
                int r1 = r2.bitrate
                r0.append(r1)
                java.lang.String r1 = ", samplerate="
                r0.append(r1)
                int r1 = r2.samplerate
                r0.append(r1)
                java.lang.String r1 = ", strmtyp="
                r0.append(r1)
                int r1 = r2.strmtyp
                r0.append(r1)
                java.lang.String r1 = ", chanmap="
                r0.append(r1)
                int r1 = r2.chanmap
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public EC3TrackImpl(com.googlecode.mp4parser.DataSource r14) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = r14.toString()
            r13.<init>(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r13.trackMetaData = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r13.bitStreamInfos = r0
            r13.dataSource = r14
            r0 = 0
            r1 = 0
        L19:
            r2 = 1
            if (r1 == 0) goto L12b
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r1 = r13.bitStreamInfos
            int r1 = r1.size()
            if (r1 == 0) goto L125
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r1 = r13.bitStreamInfos
            java.lang.Object r1 = r1.get(r0)
            com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo r1 = (com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.BitStreamInfo) r1
            int r1 = r1.samplerate
            com.coremedia.iso.boxes.SampleDescriptionBox r3 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r3.<init>()
            r13.sampleDescriptionBox = r3
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r3 = new com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            java.lang.String r4 = "ec-3"
            r3.<init>(r4)
            r4 = 2
            r3.setChannelCount(r4)
            long r4 = (long) r1
            r3.setSampleRate(r4)
            r3.setDataReferenceIndex(r2)
            r1 = 16
            r3.setSampleSize(r1)
            com.googlecode.mp4parser.boxes.EC3SpecificBox r1 = new com.googlecode.mp4parser.boxes.EC3SpecificBox
            r1.<init>()
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r6 = r13.bitStreamInfos
            int r6 = r6.size()
            int[] r6 = new int[r6]
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r7 = r13.bitStreamInfos
            int r7 = r7.size()
            int[] r7 = new int[r7]
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r8 = r13.bitStreamInfos
            java.util.Iterator r8 = r8.iterator()
        L67:
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L105
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r8 = r13.bitStreamInfos
            java.util.Iterator r9 = r8.iterator()
        L73:
            boolean r8 = r9.hasNext()
            if (r8 != 0) goto Lc1
            int r0 = r13.bitrate
            int r0 = r0 / 1000
            r1.setDataRate(r0)
            r3.addBox(r1)
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r13.sampleDescriptionBox
            r0.addBox(r3)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r13.trackMetaData
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setCreationTime(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r13.trackMetaData
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setModificationTime(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r13.trackMetaData
            r0.setTimescale(r4)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r13.trackMetaData
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setVolume(r1)
            r0 = 0
            r14.position(r0)
            java.util.List r14 = r13.readSamples()
            r13.samples = r14
            int r14 = r14.size()
            long[] r14 = new long[r14]
            r13.decodingTimes = r14
            r0 = 1536(0x600, double:7.59E-321)
            java.util.Arrays.fill(r14, r0)
            return
        Lc1:
            java.lang.Object r8 = r9.next()
            com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo r8 = (com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.BitStreamInfo) r8
            int r10 = r8.strmtyp
            if (r10 == r2) goto Lf5
            com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry r10 = new com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry
            r10.<init>()
            int r11 = r8.fscod
            r10.fscod = r11
            int r11 = r8.bsid
            r10.bsid = r11
            int r11 = r8.bsmod
            r10.bsmod = r11
            int r11 = r8.acmod
            r10.acmod = r11
            int r11 = r8.lfeon
            r10.lfeon = r11
            r10.reserved = r0
            int r11 = r8.substreamid
            r12 = r6[r11]
            r10.num_dep_sub = r12
            r11 = r7[r11]
            r10.chan_loc = r11
            r10.reserved2 = r0
            r1.addEntry(r10)
        Lf5:
            int r10 = r13.bitrate
            int r11 = r8.bitrate
            int r10 = r10 + r11
            r13.bitrate = r10
            int r10 = r13.frameSize
            int r8 = r8.frameSize
            int r10 = r10 + r8
            r13.frameSize = r10
            goto L73
        L105:
            java.lang.Object r9 = r8.next()
            com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo r9 = (com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.BitStreamInfo) r9
            int r10 = r9.strmtyp
            if (r10 != r2) goto L67
            int r10 = r9.substreamid
            r11 = r6[r10]
            int r11 = r11 + r2
            r6[r10] = r11
            int r9 = r9.chanmap
            int r11 = r9 >> 6
            r11 = r11 & 256(0x100, float:3.59E-43)
            int r9 = r9 >> 5
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r11
            r7[r10] = r9
            goto L67
        L125:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>()
            throw r14
        L12b:
            com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo r3 = r13.readVariables()
            if (r3 == 0) goto L158
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r4 = r13.bitStreamInfos
            java.util.Iterator r4 = r4.iterator()
        L137:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L146
            if (r1 != 0) goto L19
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r2 = r13.bitStreamInfos
            r2.add(r3)
            goto L19
        L146:
            java.lang.Object r5 = r4.next()
            com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo r5 = (com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.BitStreamInfo) r5
            int r6 = r3.strmtyp
            if (r6 == r2) goto L137
            int r5 = r5.substreamid
            int r6 = r3.substreamid
            if (r5 != r6) goto L137
            r1 = 1
            goto L137
        L158:
            java.io.IOException r14 = new java.io.IOException
            r14.<init>()
            throw r14
    }

    static /* synthetic */ com.googlecode.mp4parser.DataSource access$0(com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl r0) {
            com.googlecode.mp4parser.DataSource r0 = r0.dataSource
            return r0
    }

    static /* synthetic */ int access$1(com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl r0) {
            int r0 = r0.frameSize
            return r0
    }

    private java.util.List<com.googlecode.mp4parser.authoring.Sample> readSamples() throws java.io.IOException {
            r5 = this;
            com.googlecode.mp4parser.DataSource r0 = r5.dataSource
            long r0 = r0.size()
            com.googlecode.mp4parser.DataSource r2 = r5.dataSource
            long r2 = r2.position()
            long r0 = r0 - r2
            int r2 = r5.frameSize
            long r2 = (long) r2
            long r0 = r0 / r2
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L1b:
            if (r2 < r0) goto L1e
            return r1
        L1e:
            int r3 = r5.frameSize
            int r3 = r3 * r2
            com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$1 r4 = new com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$1
            r4.<init>(r5, r3)
            r1.add(r4)
            int r2 = r2 + 1
            goto L1b
    }

    private com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl.BitStreamInfo readVariables() throws java.io.IOException {
            r17 = this;
            r0 = r17
            com.googlecode.mp4parser.DataSource r1 = r0.dataSource
            long r1 = r1.position()
            r3 = 200(0xc8, float:2.8E-43)
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            com.googlecode.mp4parser.DataSource r4 = r0.dataSource
            r4.read(r3)
            r3.rewind()
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r4 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r4.<init>(r3)
            r3 = 16
            int r5 = r4.readBits(r3)
            r6 = 0
            r7 = 2935(0xb77, float:4.113E-42)
            if (r5 == r7) goto L27
            return r6
        L27:
            com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo r5 = new com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo
            r5.<init>()
            r7 = 2
            int r8 = r4.readBits(r7)
            r5.strmtyp = r8
            r8 = 3
            int r9 = r4.readBits(r8)
            r5.substreamid = r9
            r9 = 11
            int r9 = r4.readBits(r9)
            r10 = 1
            int r9 = r9 + r10
            int r9 = r9 * 2
            r5.frameSize = r9
            int r9 = r4.readBits(r7)
            r5.fscod = r9
            r11 = -1
            if (r9 != r8) goto L55
            int r11 = r4.readBits(r7)
            r9 = 3
            goto L59
        L55:
            int r9 = r4.readBits(r7)
        L59:
            r13 = 6
            if (r9 == 0) goto L6a
            if (r9 == r10) goto L68
            if (r9 == r7) goto L66
            if (r9 == r8) goto L64
            r14 = 0
            goto L6b
        L64:
            r14 = 6
            goto L6b
        L66:
            r14 = 3
            goto L6b
        L68:
            r14 = 2
            goto L6b
        L6a:
            r14 = 1
        L6b:
            int r15 = r5.frameSize
            int r16 = r13 / r14
            int r15 = r15 * r16
            r5.frameSize = r15
            int r15 = r4.readBits(r8)
            r5.acmod = r15
            int r15 = r4.readBits(r10)
            r5.lfeon = r15
            r15 = 5
            int r6 = r4.readBits(r15)
            r5.bsid = r6
            r4.readBits(r15)
            int r6 = r4.readBits(r10)
            r12 = 8
            if (r10 != r6) goto L94
            r4.readBits(r12)
        L94:
            int r6 = r5.acmod
            if (r6 != 0) goto La4
            r4.readBits(r15)
            int r6 = r4.readBits(r10)
            if (r10 != r6) goto La4
            r4.readBits(r12)
        La4:
            int r6 = r5.strmtyp
            if (r10 != r6) goto Lb4
            int r6 = r4.readBits(r10)
            if (r10 != r6) goto Lb4
            int r3 = r4.readBits(r3)
            r5.chanmap = r3
        Lb4:
            int r3 = r4.readBits(r10)
            if (r10 != r3) goto L1e8
            int r3 = r5.acmod
            if (r3 <= r7) goto Lc1
            r4.readBits(r7)
        Lc1:
            int r3 = r5.acmod
            r6 = r3 & 1
            if (r10 != r6) goto Lcf
            if (r3 <= r7) goto Lcf
            r4.readBits(r8)
            r4.readBits(r8)
        Lcf:
            int r3 = r5.acmod
            r6 = 4
            r3 = r3 & r6
            if (r3 <= 0) goto Ldb
            r4.readBits(r8)
            r4.readBits(r8)
        Ldb:
            int r3 = r5.lfeon
            if (r10 != r3) goto Le8
            int r3 = r4.readBits(r10)
            if (r10 != r3) goto Le8
            r4.readBits(r15)
        Le8:
            int r3 = r5.strmtyp
            if (r3 != 0) goto L1e8
            int r3 = r4.readBits(r10)
            if (r10 != r3) goto Lf5
            r4.readBits(r13)
        Lf5:
            int r3 = r5.acmod
            if (r3 != 0) goto L102
            int r3 = r4.readBits(r10)
            if (r10 != r3) goto L102
            r4.readBits(r13)
        L102:
            int r3 = r4.readBits(r10)
            if (r10 != r3) goto L10b
            r4.readBits(r13)
        L10b:
            int r3 = r4.readBits(r7)
            if (r10 != r3) goto L116
            r4.readBits(r15)
            goto L1b0
        L116:
            if (r7 != r3) goto L11f
            r3 = 12
            r4.readBits(r3)
            goto L1b0
        L11f:
            if (r8 != r3) goto L1b0
            int r3 = r4.readBits(r15)
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L185
            r4.readBits(r15)
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L137
            r4.readBits(r6)
        L137:
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L140
            r4.readBits(r6)
        L140:
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L149
            r4.readBits(r6)
        L149:
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L152
            r4.readBits(r6)
        L152:
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L15b
            r4.readBits(r6)
        L15b:
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L164
            r4.readBits(r6)
        L164:
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L16d
            r4.readBits(r6)
        L16d:
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L185
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L17c
            r4.readBits(r6)
        L17c:
            int r13 = r4.readBits(r10)
            if (r10 != r13) goto L185
            r4.readBits(r6)
        L185:
            int r6 = r4.readBits(r10)
            if (r10 != r6) goto L1a1
            r4.readBits(r15)
            int r6 = r4.readBits(r10)
            if (r10 != r6) goto L1a1
            r6 = 7
            r4.readBits(r6)
            int r6 = r4.readBits(r10)
            if (r10 != r6) goto L1a1
            r4.readBits(r12)
        L1a1:
            r6 = 0
        L1a2:
            int r13 = r3 + 2
            if (r6 < r13) goto L1aa
            r4.byteSync()
            goto L1b0
        L1aa:
            r4.readBits(r12)
            int r6 = r6 + 1
            goto L1a2
        L1b0:
            int r3 = r5.acmod
            if (r3 >= r7) goto L1e8
            int r3 = r4.readBits(r10)
            r6 = 14
            if (r10 != r3) goto L1bf
            r4.readBits(r6)
        L1bf:
            int r3 = r5.acmod
            if (r3 != 0) goto L1cc
            int r3 = r4.readBits(r10)
            if (r10 != r3) goto L1cc
            r4.readBits(r6)
        L1cc:
            int r3 = r4.readBits(r10)
            if (r10 != r3) goto L1e8
            if (r9 != 0) goto L1d8
            r4.readBits(r15)
            goto L1e8
        L1d8:
            r3 = 0
        L1d9:
            if (r3 < r14) goto L1dc
            goto L1e8
        L1dc:
            int r6 = r4.readBits(r10)
            if (r10 != r6) goto L1e5
            r4.readBits(r15)
        L1e5:
            int r3 = r3 + 1
            goto L1d9
        L1e8:
            int r3 = r4.readBits(r10)
            if (r10 != r3) goto L1f4
            int r3 = r4.readBits(r8)
            r5.bsmod = r3
        L1f4:
            int r3 = r5.fscod
            if (r3 == 0) goto L226
            if (r3 == r10) goto L220
            if (r3 == r7) goto L21b
            if (r3 == r8) goto L1ff
            goto L22b
        L1ff:
            if (r11 == 0) goto L216
            if (r11 == r10) goto L211
            if (r11 == r7) goto L20c
            if (r11 == r8) goto L208
            goto L22b
        L208:
            r3 = 0
            r5.samplerate = r3
            goto L22b
        L20c:
            r3 = 16000(0x3e80, float:2.2421E-41)
            r5.samplerate = r3
            goto L22b
        L211:
            r3 = 22050(0x5622, float:3.0899E-41)
            r5.samplerate = r3
            goto L22b
        L216:
            r3 = 24000(0x5dc0, float:3.3631E-41)
            r5.samplerate = r3
            goto L22b
        L21b:
            r3 = 32000(0x7d00, float:4.4842E-41)
            r5.samplerate = r3
            goto L22b
        L220:
            r3 = 44100(0xac44, float:6.1797E-41)
            r5.samplerate = r3
            goto L22b
        L226:
            r3 = 48000(0xbb80, float:6.7262E-41)
            r5.samplerate = r3
        L22b:
            int r3 = r5.samplerate
            if (r3 != 0) goto L231
            r4 = 0
            return r4
        L231:
            double r3 = (double) r3
            r6 = 4654470214887407616(0x4098000000000000, double:1536.0)
            double r3 = r3 / r6
            int r6 = r5.frameSize
            double r7 = (double) r6
            double r3 = r3 * r7
            r7 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r3 = r3 * r7
            int r3 = (int) r3
            r5.bitrate = r3
            com.googlecode.mp4parser.DataSource r3 = r0.dataSource
            long r6 = (long) r6
            long r1 = r1 + r6
            r3.position(r1)
            return r5
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource
            r0.close()
            return
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.CompositionTimeToSample.Entry> getCompositionTimeEntries() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "soun"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.coremedia.iso.boxes.SampleDependencyTypeBox.Entry> getSampleDependencies() {
            r1 = this;
            r0 = 0
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
            long[] r0 = r1.decodingTimes
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public long[] getSyncSamples() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EC3TrackImpl{bitrate="
            r0.<init>(r1)
            int r1 = r2.bitrate
            r0.append(r1)
            java.lang.String r1 = ", bitStreamInfos="
            r0.append(r1)
            java.util.List<com.googlecode.mp4parser.authoring.tracks.EC3TrackImpl$BitStreamInfo> r1 = r2.bitStreamInfos
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
