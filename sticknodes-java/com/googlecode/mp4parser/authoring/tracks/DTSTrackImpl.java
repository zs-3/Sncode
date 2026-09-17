package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class DTSTrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    private static final int BUFFER = 67108864;
    int bcCoreBitRate;
    int bcCoreChannelMask;
    int bcCoreMaxSampleRate;
    int bitrate;
    int channelCount;
    int channelMask;
    int codecDelayAtMaxFs;
    int coreBitRate;
    int coreChannelMask;
    int coreFramePayloadInBytes;
    int coreMaxSampleRate;
    boolean coreSubStreamPresent;
    private int dataOffset;
    private com.googlecode.mp4parser.DataSource dataSource;
    com.googlecode.mp4parser.boxes.DTSSpecificBox ddts;
    int extAvgBitrate;
    int extFramePayloadInBytes;
    int extPeakBitrate;
    int extSmoothBuffSize;
    boolean extensionSubStreamPresent;
    int frameSize;
    boolean isVBR;
    private java.lang.String lang;
    int lbrCodingPresent;
    int lsbTrimPercent;
    int maxSampleRate;
    int numExtSubStreams;
    int numFramesTotal;
    int numSamplesOrigAudioAtMaxFs;
    com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    private long[] sampleDurations;
    int sampleSize;
    int samplerate;
    private java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    int samplesPerFrame;
    int samplesPerFrameAtMaxFs;
    com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;
    java.lang.String type;


    class LookAhead {
        java.nio.ByteBuffer buffer;
        long bufferStartPos;
        private final int corePresent;
        long dataEnd;
        com.googlecode.mp4parser.DataSource dataSource;
        int inBufferPos;
        long start;
        final /* synthetic */ com.googlecode.mp4parser.authoring.tracks.DTSTrackImpl this$0;

        LookAhead(com.googlecode.mp4parser.authoring.tracks.DTSTrackImpl r1, com.googlecode.mp4parser.DataSource r2, long r3, long r5, int r7) throws java.io.IOException {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.inBufferPos = r1
                r0.dataSource = r2
                r0.bufferStartPos = r3
                long r5 = r5 + r3
                r0.dataEnd = r5
                r0.corePresent = r7
                r0.fillBuffer()
                return
        }

        private void discardByte() {
                r1 = this;
                int r0 = r1.inBufferPos
                int r0 = r0 + 1
                r1.inBufferPos = r0
                return
        }

        private void discardNext4AndMarkStart() {
                r5 = this;
                long r0 = r5.bufferStartPos
                int r2 = r5.inBufferPos
                long r3 = (long) r2
                long r0 = r0 + r3
                r5.start = r0
                int r2 = r2 + 4
                r5.inBufferPos = r2
                return
        }

        private void discardQWord() {
                r1 = this;
                int r0 = r1.inBufferPos
                int r0 = r0 + 4
                r1.inBufferPos = r0
                return
        }

        private void fillBuffer() throws java.io.IOException {
                r7 = this;
                java.io.PrintStream r0 = java.lang.System.err
                java.lang.String r1 = "Fill Buffer"
                r0.println(r1)
                com.googlecode.mp4parser.DataSource r0 = r7.dataSource
                long r1 = r7.bufferStartPos
                long r3 = r7.dataEnd
                long r3 = r3 - r1
                r5 = 67108864(0x4000000, double:3.31561842E-316)
                long r3 = java.lang.Math.min(r3, r5)
                java.nio.ByteBuffer r0 = r0.map(r1, r3)
                r7.buffer = r0
                return
        }

        private java.nio.ByteBuffer getSample() {
                r7 = this;
                long r0 = r7.start
                long r2 = r7.bufferStartPos
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L23
                java.nio.ByteBuffer r4 = r7.buffer
                long r0 = r0 - r2
                int r1 = (int) r0
                r4.position(r1)
                java.nio.ByteBuffer r0 = r7.buffer
                java.nio.ByteBuffer r0 = r0.slice()
                int r1 = r7.inBufferPos
                long r1 = (long) r1
                long r3 = r7.start
                long r5 = r7.bufferStartPos
                long r3 = r3 - r5
                long r1 = r1 - r3
                int r2 = (int) r1
                r0.limit(r2)
                return r0
            L23:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "damn! NAL exceeds buffer"
                r0.<init>(r1)
                throw r0
        }

        private boolean nextFourEquals(byte r5, byte r6, byte r7, byte r8) throws java.io.IOException {
                r4 = this;
                java.nio.ByteBuffer r0 = r4.buffer
                int r0 = r0.limit()
                int r1 = r4.inBufferPos
                int r0 = r0 - r1
                r2 = 0
                r3 = 4
                if (r0 < r3) goto L3b
                java.nio.ByteBuffer r0 = r4.buffer
                byte r0 = r0.get(r1)
                if (r0 != r5) goto L3a
                java.nio.ByteBuffer r5 = r4.buffer
                int r0 = r4.inBufferPos
                r1 = 1
                int r0 = r0 + r1
                byte r5 = r5.get(r0)
                if (r5 != r6) goto L3a
                java.nio.ByteBuffer r5 = r4.buffer
                int r6 = r4.inBufferPos
                int r6 = r6 + 2
                byte r5 = r5.get(r6)
                if (r5 != r7) goto L3a
                java.nio.ByteBuffer r5 = r4.buffer
                int r6 = r4.inBufferPos
                int r6 = r6 + 3
                byte r5 = r5.get(r6)
                if (r5 != r8) goto L3a
                return r1
            L3a:
                return r2
            L3b:
                long r5 = r4.bufferStartPos
                long r7 = (long) r1
                long r5 = r5 + r7
                r7 = 4
                long r5 = r5 + r7
                com.googlecode.mp4parser.DataSource r7 = r4.dataSource
                long r7 = r7.size()
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 >= 0) goto L4d
                return r2
            L4d:
                java.io.EOFException r5 = new java.io.EOFException
                r5.<init>()
                throw r5
        }

        private boolean nextFourEquals0x64582025() throws java.io.IOException {
                r4 = this;
                r0 = 100
                r1 = 88
                r2 = 32
                r3 = 37
                boolean r0 = r4.nextFourEquals(r0, r1, r2, r3)
                return r0
        }

        private boolean nextFourEquals0x64582025orEof() throws java.io.IOException {
                r4 = this;
                r0 = 100
                r1 = 88
                r2 = 32
                r3 = 37
                boolean r0 = r4.nextFourEqualsOrEof(r0, r1, r2, r3)
                return r0
        }

        private boolean nextFourEquals0x7FFE8001() throws java.io.IOException {
                r4 = this;
                r0 = 127(0x7f, float:1.78E-43)
                r1 = -2
                r2 = -128(0xffffffffffffff80, float:NaN)
                r3 = 1
                boolean r0 = r4.nextFourEquals(r0, r1, r2, r3)
                return r0
        }

        private boolean nextFourEquals0x7FFE8001orEof() throws java.io.IOException {
                r4 = this;
                r0 = 127(0x7f, float:1.78E-43)
                r1 = -2
                r2 = -128(0xffffffffffffff80, float:NaN)
                r3 = 1
                boolean r0 = r4.nextFourEqualsOrEof(r0, r1, r2, r3)
                return r0
        }

        private boolean nextFourEqualsOrEof(byte r9, byte r10, byte r11, byte r12) throws java.io.IOException {
                r8 = this;
                java.nio.ByteBuffer r0 = r8.buffer
                int r0 = r0.limit()
                int r1 = r8.inBufferPos
                int r0 = r0 - r1
                r2 = 1
                r3 = 0
                r4 = 4
                if (r0 < r4) goto L66
                long r4 = r8.bufferStartPos
                long r0 = (long) r1
                long r4 = r4 + r0
                r0 = 1048576(0x100000, double:5.180654E-318)
                long r4 = r4 % r0
                r0 = 0
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 != 0) goto L37
                java.io.PrintStream r0 = java.lang.System.err
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                long r4 = r8.bufferStartPos
                int r6 = r8.inBufferPos
                long r6 = (long) r6
                long r4 = r4 + r6
                r6 = 1024(0x400, double:5.06E-321)
                long r4 = r4 / r6
                long r4 = r4 / r6
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
            L37:
                java.nio.ByteBuffer r0 = r8.buffer
                int r1 = r8.inBufferPos
                byte r0 = r0.get(r1)
                if (r0 != r9) goto L65
                java.nio.ByteBuffer r9 = r8.buffer
                int r0 = r8.inBufferPos
                int r0 = r0 + r2
                byte r9 = r9.get(r0)
                if (r9 != r10) goto L65
                java.nio.ByteBuffer r9 = r8.buffer
                int r10 = r8.inBufferPos
                int r10 = r10 + 2
                byte r9 = r9.get(r10)
                if (r9 != r11) goto L65
                java.nio.ByteBuffer r9 = r8.buffer
                int r10 = r8.inBufferPos
                int r10 = r10 + 3
                byte r9 = r9.get(r10)
                if (r9 != r12) goto L65
                return r2
            L65:
                return r3
            L66:
                long r9 = r8.bufferStartPos
                long r11 = (long) r1
                long r11 = r11 + r9
                r4 = 4
                long r11 = r11 + r4
                long r4 = r8.dataEnd
                int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r0 <= 0) goto L7b
                long r11 = (long) r1
                long r9 = r9 + r11
                int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r11 != 0) goto L7a
                return r2
            L7a:
                return r3
            L7b:
                long r9 = r8.start
                r8.bufferStartPos = r9
                r8.inBufferPos = r3
                r8.fillBuffer()
                boolean r9 = r8.nextFourEquals0x7FFE8001()
                return r9
        }

        public java.nio.ByteBuffer findNextStart() throws java.io.IOException {
                r2 = this;
            L0:
                int r0 = r2.corePresent     // Catch: java.io.EOFException -> L33
                r1 = 1
                if (r0 != r1) goto Lc
                boolean r0 = r2.nextFourEquals0x7FFE8001()     // Catch: java.io.EOFException -> L33
                if (r0 == 0) goto L2f
                goto L12
            Lc:
                boolean r0 = r2.nextFourEquals0x64582025()     // Catch: java.io.EOFException -> L33
                if (r0 == 0) goto L2f
            L12:
                r2.discardNext4AndMarkStart()     // Catch: java.io.EOFException -> L33
            L15:
                int r0 = r2.corePresent     // Catch: java.io.EOFException -> L33
                if (r0 != r1) goto L20
                boolean r0 = r2.nextFourEquals0x7FFE8001orEof()     // Catch: java.io.EOFException -> L33
                if (r0 == 0) goto L2b
                goto L26
            L20:
                boolean r0 = r2.nextFourEquals0x64582025orEof()     // Catch: java.io.EOFException -> L33
                if (r0 == 0) goto L2b
            L26:
                java.nio.ByteBuffer r0 = r2.getSample()     // Catch: java.io.EOFException -> L33
                return r0
            L2b:
                r2.discardQWord()     // Catch: java.io.EOFException -> L33
                goto L15
            L2f:
                r2.discardByte()     // Catch: java.io.EOFException -> L33
                goto L0
            L33:
                r0 = 0
                return r0
        }
    }

    public DTSTrackImpl(com.googlecode.mp4parser.DataSource r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r2.trackMetaData = r0
            r0 = 0
            r2.frameSize = r0
            r2.dataOffset = r0
            com.googlecode.mp4parser.boxes.DTSSpecificBox r1 = new com.googlecode.mp4parser.boxes.DTSSpecificBox
            r1.<init>()
            r2.ddts = r1
            r2.isVBR = r0
            r2.coreSubStreamPresent = r0
            r2.extensionSubStreamPresent = r0
            r2.numExtSubStreams = r0
            r2.coreMaxSampleRate = r0
            r2.coreBitRate = r0
            r2.coreChannelMask = r0
            r2.coreFramePayloadInBytes = r0
            r2.extAvgBitrate = r0
            r2.extPeakBitrate = r0
            r2.extSmoothBuffSize = r0
            r2.extFramePayloadInBytes = r0
            r2.maxSampleRate = r0
            r2.lbrCodingPresent = r0
            r2.numFramesTotal = r0
            r2.samplesPerFrameAtMaxFs = r0
            r2.numSamplesOrigAudioAtMaxFs = r0
            r2.channelMask = r0
            r2.codecDelayAtMaxFs = r0
            r2.bcCoreMaxSampleRate = r0
            r2.bcCoreBitRate = r0
            r2.bcCoreChannelMask = r0
            r2.lsbTrimPercent = r0
            java.lang.String r0 = "none"
            r2.type = r0
            java.lang.String r0 = "eng"
            r2.lang = r0
            r2.dataSource = r3
            r2.parse()
            return
    }

    public DTSTrackImpl(com.googlecode.mp4parser.DataSource r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r0.<init>()
            r2.trackMetaData = r0
            r0 = 0
            r2.frameSize = r0
            r2.dataOffset = r0
            com.googlecode.mp4parser.boxes.DTSSpecificBox r1 = new com.googlecode.mp4parser.boxes.DTSSpecificBox
            r1.<init>()
            r2.ddts = r1
            r2.isVBR = r0
            r2.coreSubStreamPresent = r0
            r2.extensionSubStreamPresent = r0
            r2.numExtSubStreams = r0
            r2.coreMaxSampleRate = r0
            r2.coreBitRate = r0
            r2.coreChannelMask = r0
            r2.coreFramePayloadInBytes = r0
            r2.extAvgBitrate = r0
            r2.extPeakBitrate = r0
            r2.extSmoothBuffSize = r0
            r2.extFramePayloadInBytes = r0
            r2.maxSampleRate = r0
            r2.lbrCodingPresent = r0
            r2.numFramesTotal = r0
            r2.samplesPerFrameAtMaxFs = r0
            r2.numSamplesOrigAudioAtMaxFs = r0
            r2.channelMask = r0
            r2.codecDelayAtMaxFs = r0
            r2.bcCoreMaxSampleRate = r0
            r2.bcCoreBitRate = r0
            r2.bcCoreChannelMask = r0
            r2.lsbTrimPercent = r0
            java.lang.String r0 = "none"
            r2.type = r0
            r2.lang = r4
            r2.dataSource = r3
            r2.parse()
            return
    }

    private java.util.List<com.googlecode.mp4parser.authoring.Sample> generateSamples(com.googlecode.mp4parser.DataSource r10, int r11, long r12, int r14) throws java.io.IOException {
            r9 = this;
            com.googlecode.mp4parser.authoring.tracks.DTSTrackImpl$LookAhead r8 = new com.googlecode.mp4parser.authoring.tracks.DTSTrackImpl$LookAhead
            long r3 = (long) r11
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r12
            r7 = r14
            r0.<init>(r1, r2, r3, r5, r7)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L10:
            java.nio.ByteBuffer r11 = r8.findNextStart()
            if (r11 != 0) goto L1e
            java.io.PrintStream r11 = java.lang.System.err
            java.lang.String r12 = "all samples found"
            r11.println(r12)
            return r10
        L1e:
            com.googlecode.mp4parser.authoring.tracks.DTSTrackImpl$1 r12 = new com.googlecode.mp4parser.authoring.tracks.DTSTrackImpl$1
            r12.<init>(r9, r11)
            r10.add(r12)
            goto L10
    }

    private int getBitRate(int r2) throws java.io.IOException {
            r1 = this;
            switch(r2) {
                case 0: goto L55;
                case 1: goto L52;
                case 2: goto L4f;
                case 3: goto L4c;
                case 4: goto L49;
                case 5: goto L46;
                case 6: goto L43;
                case 7: goto L40;
                case 8: goto L3d;
                case 9: goto L3a;
                case 10: goto L37;
                case 11: goto L34;
                case 12: goto L31;
                case 13: goto L2e;
                case 14: goto L2b;
                case 15: goto L28;
                case 16: goto L25;
                case 17: goto L22;
                case 18: goto L1f;
                case 19: goto L1c;
                case 20: goto L19;
                case 21: goto L16;
                case 22: goto L13;
                case 23: goto L10;
                case 24: goto Ld;
                case 25: goto Lb;
                default: goto L3;
            }
        L3:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "Unknown bitrate value"
            r2.<init>(r0)
            throw r2
        Lb:
            r2 = -1
            goto L57
        Ld:
            r2 = 1536(0x600, float:2.152E-42)
            goto L57
        L10:
            r2 = 1472(0x5c0, float:2.063E-42)
            goto L57
        L13:
            r2 = 1411(0x583, float:1.977E-42)
            goto L57
        L16:
            r2 = 1408(0x580, float:1.973E-42)
            goto L57
        L19:
            r2 = 1344(0x540, float:1.883E-42)
            goto L57
        L1c:
            r2 = 1280(0x500, float:1.794E-42)
            goto L57
        L1f:
            r2 = 1152(0x480, float:1.614E-42)
            goto L57
        L22:
            r2 = 1024(0x400, float:1.435E-42)
            goto L57
        L25:
            r2 = 960(0x3c0, float:1.345E-42)
            goto L57
        L28:
            r2 = 768(0x300, float:1.076E-42)
            goto L57
        L2b:
            r2 = 640(0x280, float:8.97E-43)
            goto L57
        L2e:
            r2 = 576(0x240, float:8.07E-43)
            goto L57
        L31:
            r2 = 512(0x200, float:7.175E-43)
            goto L57
        L34:
            r2 = 448(0x1c0, float:6.28E-43)
            goto L57
        L37:
            r2 = 384(0x180, float:5.38E-43)
            goto L57
        L3a:
            r2 = 320(0x140, float:4.48E-43)
            goto L57
        L3d:
            r2 = 256(0x100, float:3.59E-43)
            goto L57
        L40:
            r2 = 224(0xe0, float:3.14E-43)
            goto L57
        L43:
            r2 = 192(0xc0, float:2.69E-43)
            goto L57
        L46:
            r2 = 128(0x80, float:1.794E-43)
            goto L57
        L49:
            r2 = 112(0x70, float:1.57E-43)
            goto L57
        L4c:
            r2 = 96
            goto L57
        L4f:
            r2 = 64
            goto L57
        L52:
            r2 = 56
            goto L57
        L55:
            r2 = 32
        L57:
            return r2
    }

    private int getSampleRate(int r2) throws java.io.IOException {
            r1 = this;
            switch(r2) {
                case 1: goto L25;
                case 2: goto L22;
                case 3: goto L1f;
                case 4: goto L3;
                case 5: goto L3;
                case 6: goto L1c;
                case 7: goto L19;
                case 8: goto L15;
                case 9: goto L3;
                case 10: goto L3;
                case 11: goto L12;
                case 12: goto Lf;
                case 13: goto Lb;
                default: goto L3;
            }
        L3:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "Unknown Sample Rate"
            r2.<init>(r0)
            throw r2
        Lb:
            r2 = 48000(0xbb80, float:6.7262E-41)
            goto L27
        Lf:
            r2 = 24000(0x5dc0, float:3.3631E-41)
            goto L27
        L12:
            r2 = 12000(0x2ee0, float:1.6816E-41)
            goto L27
        L15:
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L27
        L19:
            r2 = 22050(0x5622, float:3.0899E-41)
            goto L27
        L1c:
            r2 = 11025(0x2b11, float:1.545E-41)
            goto L27
        L1f:
            r2 = 32000(0x7d00, float:4.4842E-41)
            goto L27
        L22:
            r2 = 16000(0x3e80, float:2.2421E-41)
            goto L27
        L25:
            r2 = 8000(0x1f40, float:1.121E-41)
        L27:
            return r2
    }

    private void parse() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.readVariables()
            if (r0 == 0) goto L56
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r0.<init>()
            r3.sampleDescriptionBox = r0
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry r0 = new com.coremedia.iso.boxes.sampleentry.AudioSampleEntry
            java.lang.String r1 = r3.type
            r0.<init>(r1)
            int r1 = r3.channelCount
            r0.setChannelCount(r1)
            int r1 = r3.samplerate
            long r1 = (long) r1
            r0.setSampleRate(r1)
            r1 = 1
            r0.setDataReferenceIndex(r1)
            r1 = 16
            r0.setSampleSize(r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r1 = r3.ddts
            r0.addBox(r1)
            com.coremedia.iso.boxes.SampleDescriptionBox r1 = r3.sampleDescriptionBox
            r1.addBox(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r3.trackMetaData
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setCreationTime(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r3.trackMetaData
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            r0.setModificationTime(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r3.trackMetaData
            java.lang.String r1 = r3.lang
            r0.setLanguage(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r3.trackMetaData
            int r1 = r3.samplerate
            long r1 = (long) r1
            r0.setTimescale(r1)
            return
        L56:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }

    private boolean parseAuprhdr(int r5, java.nio.ByteBuffer r6) {
            r4 = this;
            r6.get()
            short r0 = r6.getShort()
            byte r1 = r6.get()
            short r2 = r6.getShort()
            int r1 = r1 << 16
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            r1 = r1 | r2
            r4.maxSampleRate = r1
            int r1 = r6.getInt()
            r4.numFramesTotal = r1
            short r1 = r6.getShort()
            r4.samplesPerFrameAtMaxFs = r1
            byte r1 = r6.get()
            int r2 = r6.getInt()
            int r1 = r1 << 32
            r2 = r2 & r3
            r1 = r1 | r2
            r4.numSamplesOrigAudioAtMaxFs = r1
            short r1 = r6.getShort()
            r4.channelMask = r1
            short r1 = r6.getShort()
            r4.codecDelayAtMaxFs = r1
            r1 = r0 & 3
            r2 = 3
            if (r1 != r2) goto L60
            byte r1 = r6.get()
            short r2 = r6.getShort()
            int r1 = r1 << 16
            r2 = r2 & r3
            r1 = r1 | r2
            r4.bcCoreMaxSampleRate = r1
            short r1 = r6.getShort()
            r4.bcCoreBitRate = r1
            short r1 = r6.getShort()
            r4.bcCoreChannelMask = r1
            r1 = 28
            goto L62
        L60:
            r1 = 21
        L62:
            r2 = r0 & 4
            if (r2 <= 0) goto L6e
            byte r2 = r6.get()
            r4.lsbTrimPercent = r2
            int r1 = r1 + 1
        L6e:
            r0 = r0 & 8
            r2 = 1
            if (r0 <= 0) goto L75
            r4.lbrCodingPresent = r2
        L75:
            if (r1 < r5) goto L78
            return r2
        L78:
            r6.get()
            int r1 = r1 + 1
            goto L75
    }

    private boolean parseCoressmd(int r4, java.nio.ByteBuffer r5) {
            r3 = this;
            byte r0 = r5.get()
            short r1 = r5.getShort()
            int r0 = r0 << 16
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            r3.coreMaxSampleRate = r0
            short r0 = r5.getShort()
            r3.coreBitRate = r0
            short r0 = r5.getShort()
            r3.coreChannelMask = r0
            int r0 = r5.getInt()
            r3.coreFramePayloadInBytes = r0
            r0 = 11
        L25:
            if (r0 < r4) goto L29
            r4 = 1
            return r4
        L29:
            r5.get()
            int r0 = r0 + 1
            goto L25
    }

    private void parseDtshdhdr(int r6, java.nio.ByteBuffer r7) {
            r5 = this;
            r7.getInt()
            r7.get()
            r7.getInt()
            r7.get()
            short r0 = r7.getShort()
            r7.get()
            byte r1 = r7.get()
            r5.numExtSubStreams = r1
            r2 = r0 & 1
            r3 = 1
            if (r2 != r3) goto L20
            r5.isVBR = r3
        L20:
            r2 = r0 & 8
            r4 = 8
            if (r2 != r4) goto L28
            r5.coreSubStreamPresent = r3
        L28:
            r2 = 16
            r0 = r0 & r2
            if (r0 != r2) goto L33
            r5.extensionSubStreamPresent = r3
            int r1 = r1 + r3
            r5.numExtSubStreams = r1
            goto L36
        L33:
            r0 = 0
            r5.numExtSubStreams = r0
        L36:
            r0 = 14
        L38:
            if (r0 < r6) goto L3b
            return
        L3b:
            r7.get()
            int r0 = r0 + 1
            goto L38
    }

    private boolean parseExtssmd(int r4, java.nio.ByteBuffer r5) {
            r3 = this;
            byte r0 = r5.get()
            short r1 = r5.getShort()
            int r0 = r0 << 16
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r0 = r0 | r1
            r3.extAvgBitrate = r0
            boolean r0 = r3.isVBR
            if (r0 == 0) goto L2c
            byte r0 = r5.get()
            short r1 = r5.getShort()
            int r0 = r0 << 16
            r1 = r1 & r2
            r0 = r0 | r1
            r3.extPeakBitrate = r0
            short r0 = r5.getShort()
            r3.extSmoothBuffSize = r0
            r0 = 8
            goto L33
        L2c:
            int r0 = r5.getInt()
            r3.extFramePayloadInBytes = r0
            r0 = 7
        L33:
            if (r0 < r4) goto L37
            r4 = 1
            return r4
        L37:
            r5.get()
            int r0 = r0 + 1
            goto L33
    }

    private boolean readVariables() throws java.io.IOException {
            r26 = this;
            r6 = r26
            com.googlecode.mp4parser.DataSource r0 = r6.dataSource
            r1 = 0
            r3 = 25000(0x61a8, double:1.23516E-319)
            java.nio.ByteBuffer r0 = r0.map(r1, r3)
            int r1 = r0.getInt()
            int r2 = r0.getInt()
            r3 = 1146377032(0x44545348, float:849.3013)
            if (r1 != r3) goto L513
            r4 = 1145586770(0x44484452, float:801.0675)
            if (r2 != r4) goto L513
        L1e:
            r5 = 1398035021(0x5354524d, float:9.1191384E11)
            r7 = 0
            if (r1 != r5) goto L29
            r5 = 1145132097(0x44415441, float:773.31647)
            if (r2 == r5) goto L31
        L29:
            int r5 = r0.remaining()
            r8 = 100
            if (r5 > r8) goto L4bf
        L31:
            long r3 = r0.getLong()
            int r1 = r0.position()
            r6.dataOffset = r1
            r1 = -1
            r2 = 0
            r5 = -1
            r9 = -1
            r10 = -1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L4d:
            r8 = 2
            if (r2 == 0) goto L2c5
            int r0 = r6.samplesPerFrame
            r2 = 512(0x200, float:7.175E-43)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r0 == r2) goto L6a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 == r2) goto L68
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 == r2) goto L66
            if (r0 == r12) goto L64
            r0 = -1
            goto L6b
        L64:
            r0 = 3
            goto L6b
        L66:
            r0 = 2
            goto L6b
        L68:
            r0 = 1
            goto L6b
        L6a:
            r0 = 0
        L6b:
            if (r0 != r1) goto L6e
            return r7
        L6e:
            if (r9 == 0) goto L77
            if (r9 == r8) goto L77
            switch(r9) {
                case 4: goto L77;
                case 5: goto L77;
                case 6: goto L77;
                case 7: goto L77;
                case 8: goto L77;
                case 9: goto L77;
                default: goto L75;
            }
        L75:
            r9 = 31
        L77:
            java.lang.String r1 = "dtsh"
            if (r5 != 0) goto Lc4
            r2 = 21
            r10 = 1
            if (r11 != r10) goto L90
            if (r15 != 0) goto L8b
            r1 = 17
            java.lang.String r2 = "dtsl"
            r6.type = r2
            r20 = 17
            goto Lb8
        L8b:
            r6.type = r1
        L8d:
            r20 = 21
            goto Lb8
        L90:
            if (r14 != r10) goto L9b
            r1 = 18
            java.lang.String r2 = "dtse"
            r6.type = r2
            r20 = 18
            goto Lb8
        L9b:
            if (r15 != r10) goto Lb6
            r6.type = r1
            r1 = r16
            if (r1 != 0) goto Laa
            if (r11 != 0) goto Laa
            r1 = 19
            r20 = 19
            goto Lb8
        Laa:
            if (r1 != r10) goto Lb1
            if (r11 != 0) goto Lb1
            r20 = 20
            goto Lb8
        Lb1:
            if (r1 != 0) goto Lb6
            if (r11 != r10) goto Lb6
            goto L8d
        Lb6:
            r20 = 0
        Lb8:
            int r1 = r6.maxSampleRate
            r6.samplerate = r1
            r1 = 24
            r6.sampleSize = r1
            r1 = r20
            goto L1d2
        Lc4:
            r2 = r16
            r7 = 1
            if (r10 >= r7) goto Lef
            java.lang.String r2 = "dtsc"
            if (r13 <= 0) goto Lea
            r7 = r17
            if (r7 == 0) goto Le5
            if (r7 == r8) goto Le0
            r10 = 6
            if (r7 == r10) goto Ldb
            r6.type = r1
        Ld8:
            r1 = 0
            goto L1d2
        Ldb:
            r6.type = r1
            r1 = 3
            goto L1d2
        Le0:
            r6.type = r2
            r1 = 4
            goto L1d2
        Le5:
            r6.type = r2
            r1 = 2
            goto L1d2
        Lea:
            r6.type = r2
            r1 = 1
            goto L1d2
        Lef:
            r7 = r17
            r6.type = r1
            if (r13 != 0) goto L161
            if (r15 != 0) goto L109
            r1 = 1
            if (r2 != r1) goto L109
            r1 = r18
            r10 = r19
            if (r1 != 0) goto L10d
            if (r10 != 0) goto L10d
            if (r11 != 0) goto L10d
            if (r14 != 0) goto L10d
            r1 = 5
            goto L1d2
        L109:
            r1 = r18
            r10 = r19
        L10d:
            if (r15 != 0) goto L11d
            if (r2 != 0) goto L11d
            if (r1 != 0) goto L11d
            r7 = 1
            if (r10 != r7) goto L11e
            if (r11 != 0) goto L11e
            if (r14 != 0) goto L11e
            r1 = 6
            goto L1d2
        L11d:
            r7 = 1
        L11e:
            if (r15 != 0) goto L12e
            if (r2 != r7) goto L12e
            if (r1 != 0) goto L12e
            if (r10 != r7) goto L12e
            if (r11 != 0) goto L12e
            if (r14 != 0) goto L12e
            r1 = 9
            goto L1d2
        L12e:
            if (r15 != 0) goto L13f
            if (r2 != 0) goto L13f
            r7 = 1
            if (r1 != r7) goto L13f
            if (r10 != 0) goto L13f
            if (r11 != 0) goto L13f
            if (r14 != 0) goto L13f
            r1 = 10
            goto L1d2
        L13f:
            if (r15 != 0) goto L150
            r7 = 1
            if (r2 != r7) goto L150
            if (r1 != r7) goto L150
            if (r10 != 0) goto L150
            if (r11 != 0) goto L150
            if (r14 != 0) goto L150
            r1 = 13
            goto L1d2
        L150:
            if (r15 != 0) goto Ld8
            if (r2 != 0) goto Ld8
            if (r1 != 0) goto Ld8
            if (r10 != 0) goto Ld8
            r1 = 1
            if (r11 != r1) goto Ld8
            if (r14 != 0) goto Ld8
            r1 = 14
            goto L1d2
        L161:
            r1 = r18
            r10 = r19
            if (r7 != 0) goto L177
            if (r15 != 0) goto L177
            if (r2 != 0) goto L177
            if (r1 != 0) goto L177
            r13 = 1
            if (r10 != r13) goto L177
            if (r11 != 0) goto L177
            if (r14 != 0) goto L177
            r1 = 7
            goto L1d2
        L177:
            r13 = 6
            if (r7 != r13) goto L18a
            if (r15 != 0) goto L18a
            if (r2 != 0) goto L18a
            if (r1 != 0) goto L18a
            r13 = 1
            if (r10 != r13) goto L18a
            if (r11 != 0) goto L18a
            if (r14 != 0) goto L18a
            r1 = 8
            goto L1d2
        L18a:
            if (r7 != 0) goto L19c
            if (r15 != 0) goto L19c
            if (r2 != 0) goto L19c
            r13 = 1
            if (r1 != r13) goto L19c
            if (r10 != 0) goto L19c
            if (r11 != 0) goto L19c
            if (r14 != 0) goto L19c
            r1 = 11
            goto L1d2
        L19c:
            r13 = 6
            if (r7 != r13) goto L1af
            if (r15 != 0) goto L1af
            if (r2 != 0) goto L1af
            r13 = 1
            if (r1 != r13) goto L1af
            if (r10 != 0) goto L1af
            if (r11 != 0) goto L1af
            if (r14 != 0) goto L1af
            r1 = 12
            goto L1d2
        L1af:
            if (r7 != 0) goto L1c1
            if (r15 != 0) goto L1c1
            if (r2 != 0) goto L1c1
            if (r1 != 0) goto L1c1
            if (r10 != 0) goto L1c1
            r13 = 1
            if (r11 != r13) goto L1c1
            if (r14 != 0) goto L1c1
            r1 = 15
            goto L1d2
        L1c1:
            if (r7 != r8) goto Ld8
            if (r15 != 0) goto Ld8
            if (r2 != 0) goto Ld8
            if (r1 != 0) goto Ld8
            if (r10 != 0) goto Ld8
            r1 = 1
            if (r11 != r1) goto Ld8
            if (r14 != 0) goto Ld8
            r1 = 16
        L1d2:
            com.googlecode.mp4parser.boxes.DTSSpecificBox r2 = r6.ddts
            int r7 = r6.maxSampleRate
            long r10 = (long) r7
            r2.setDTSSamplingFrequency(r10)
            boolean r2 = r6.isVBR
            if (r2 == 0) goto L1ec
            com.googlecode.mp4parser.boxes.DTSSpecificBox r2 = r6.ddts
            int r7 = r6.coreBitRate
            int r10 = r6.extPeakBitrate
            int r7 = r7 + r10
            int r7 = r7 * 1000
            long r10 = (long) r7
            r2.setMaxBitRate(r10)
            goto L1f9
        L1ec:
            com.googlecode.mp4parser.boxes.DTSSpecificBox r2 = r6.ddts
            int r7 = r6.coreBitRate
            int r10 = r6.extAvgBitrate
            int r7 = r7 + r10
            int r7 = r7 * 1000
            long r10 = (long) r7
            r2.setMaxBitRate(r10)
        L1f9:
            com.googlecode.mp4parser.boxes.DTSSpecificBox r2 = r6.ddts
            int r7 = r6.coreBitRate
            int r10 = r6.extAvgBitrate
            int r7 = r7 + r10
            int r7 = r7 * 1000
            long r10 = (long) r7
            r2.setAvgBitRate(r10)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r2 = r6.ddts
            int r7 = r6.sampleSize
            r2.setPcmSampleDepth(r7)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r2 = r6.ddts
            r2.setFrameDuration(r0)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r0.setStreamConstruction(r1)
            int r0 = r6.coreChannelMask
            r1 = r0 & 8
            if (r1 > 0) goto L228
            r0 = r0 & r12
            if (r0 <= 0) goto L221
            goto L228
        L221:
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r1 = 0
            r0.setCoreLFEPresent(r1)
            goto L22e
        L228:
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r1 = 1
            r0.setCoreLFEPresent(r1)
        L22e:
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r0.setCoreLayout(r9)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            int r1 = r6.coreFramePayloadInBytes
            r0.setCoreSize(r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r1 = 0
            r0.setStereoDownmix(r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r1 = 4
            r0.setRepresentationType(r1)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            int r1 = r6.channelMask
            r0.setChannelLayout(r1)
            int r0 = r6.coreMaxSampleRate
            if (r0 <= 0) goto L25d
            int r0 = r6.extAvgBitrate
            if (r0 <= 0) goto L25d
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r1 = 1
            r0.setMultiAssetFlag(r1)
            r1 = 0
            goto L263
        L25d:
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r1 = 0
            r0.setMultiAssetFlag(r1)
        L263:
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            int r2 = r6.lbrCodingPresent
            r0.setLBRDurationMod(r2)
            com.googlecode.mp4parser.boxes.DTSSpecificBox r0 = r6.ddts
            r0.setReservedBoxPresent(r1)
            r6.channelCount = r1
            r0 = 16
            r7 = 0
        L274:
            if (r7 < r0) goto L292
            com.googlecode.mp4parser.DataSource r1 = r6.dataSource
            int r2 = r6.dataOffset
            r0 = r26
            java.util.List r0 = r0.generateSamples(r1, r2, r3, r5)
            r6.samples = r0
            int r0 = r0.size()
            long[] r0 = new long[r0]
            r6.sampleDurations = r0
            int r1 = r6.samplesPerFrame
            long r1 = (long) r1
            java.util.Arrays.fill(r0, r1)
            r0 = 1
            return r0
        L292:
            r0 = 1
            int r1 = r6.channelMask
            int r1 = r1 >> r7
            r1 = r1 & r0
            if (r1 != r0) goto L2bd
            r0 = 12
            if (r7 == 0) goto L2b6
            if (r7 == r0) goto L2b6
            r1 = 14
            if (r7 == r1) goto L2b6
            r1 = 3
            if (r7 == r1) goto L2b6
            r1 = 4
            if (r7 == r1) goto L2b6
            r1 = 7
            if (r7 == r1) goto L2b6
            r1 = 8
            if (r7 == r1) goto L2b6
            int r1 = r6.channelCount
            int r1 = r1 + r8
            r6.channelCount = r1
            goto L2bf
        L2b6:
            int r1 = r6.channelCount
            r2 = 1
            int r1 = r1 + r2
            r6.channelCount = r1
            goto L2c0
        L2bd:
            r0 = 12
        L2bf:
            r2 = 1
        L2c0:
            int r7 = r7 + 1
            r0 = 16
            goto L274
        L2c5:
            r22 = r16
            r7 = r17
            r23 = r18
            r24 = r19
            r1 = 1
            r17 = 12
            int r19 = r0.position()
            int r8 = r0.getInt()
            r25 = r2
            r2 = 2147385345(0x7ffe8001, float:NaN)
            if (r8 != r2) goto L3cc
            if (r5 != r1) goto L2ee
            r17 = r7
            r16 = r22
            r18 = r23
            r19 = r24
            r1 = -1
            r2 = 1
        L2eb:
            r7 = 0
            goto L4d
        L2ee:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r2.<init>(r0)
            int r5 = r2.readBits(r1)
            r7 = 5
            int r8 = r2.readBits(r7)
            int r7 = r2.readBits(r1)
            if (r5 != r1) goto L3ca
            r5 = 31
            if (r8 != r5) goto L3ca
            if (r7 == 0) goto L30a
            goto L3ca
        L30a:
            r5 = 7
            int r8 = r2.readBits(r5)
            int r8 = r8 + r1
            int r8 = r8 * 32
            r6.samplesPerFrame = r8
            r1 = 14
            int r1 = r2.readBits(r1)
            int r5 = r6.frameSize
            int r8 = r1 + 1
            int r5 = r5 + r8
            r6.frameSize = r5
            r5 = 6
            int r9 = r2.readBits(r5)
            r5 = 4
            int r8 = r2.readBits(r5)
            int r5 = r6.getSampleRate(r8)
            r6.samplerate = r5
            r5 = 5
            int r8 = r2.readBits(r5)
            int r5 = r6.getBitRate(r8)
            r6.bitrate = r5
            r5 = 1
            int r8 = r2.readBits(r5)
            if (r8 == 0) goto L345
            r8 = 0
            return r8
        L345:
            r2.readBits(r5)
            r2.readBits(r5)
            r2.readBits(r5)
            r2.readBits(r5)
            r8 = 3
            int r17 = r2.readBits(r8)
            int r13 = r2.readBits(r5)
            r2.readBits(r5)
            r8 = 2
            r2.readBits(r8)
            r2.readBits(r5)
            if (r7 != r5) goto L36b
            r7 = 16
            r2.readBits(r7)
        L36b:
            r2.readBits(r5)
            r7 = 4
            int r5 = r2.readBits(r7)
            r2.readBits(r8)
            r7 = 3
            int r8 = r2.readBits(r7)
            if (r8 == 0) goto L398
            r7 = 1
            if (r8 == r7) goto L398
            r7 = 2
            if (r8 == r7) goto L393
            r7 = 3
            if (r8 == r7) goto L393
            r7 = 5
            if (r8 == r7) goto L38e
            r7 = 6
            if (r8 == r7) goto L38e
            r7 = 0
            return r7
        L38e:
            r7 = 24
            r6.sampleSize = r7
            goto L39c
        L393:
            r7 = 20
            r6.sampleSize = r7
            goto L39c
        L398:
            r7 = 16
            r6.sampleSize = r7
        L39c:
            r7 = 1
            r2.readBits(r7)
            r2.readBits(r7)
            r8 = 6
            if (r5 == r8) goto L3b3
            r8 = 7
            if (r5 == r8) goto L3ae
            r5 = 4
            r2.readBits(r5)
            goto L3b7
        L3ae:
            r5 = 4
            r2.readBits(r5)
            goto L3b7
        L3b3:
            r5 = 4
            r2.readBits(r5)
        L3b7:
            int r19 = r19 + r1
            int r1 = r19 + 1
            r0.position(r1)
            r16 = r22
            r18 = r23
            r19 = r24
            r2 = r25
            r1 = -1
            r5 = 1
            goto L2eb
        L3ca:
            r0 = 0
            return r0
        L3cc:
            r1 = 20
            r2 = 16
            r10 = 1683496997(0x64582025, float:1.5947252E22)
            if (r8 != r10) goto L4a7
            r8 = -1
            if (r5 != r8) goto L3dd
            int r5 = r6.samplesPerFrameAtMaxFs
            r6.samplesPerFrame = r5
            r5 = 0
        L3dd:
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r10 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r10.<init>(r0)
            r1 = 8
            r10.readBits(r1)
            r1 = 2
            r10.readBits(r1)
            r1 = 1
            int r18 = r10.readBits(r1)
            if (r18 != 0) goto L3f7
            r2 = 8
            r8 = 16
            goto L3fb
        L3f7:
            r2 = 12
            r8 = 20
        L3fb:
            int r2 = r10.readBits(r2)
            int r2 = r2 + r1
            int r8 = r10.readBits(r8)
            int r8 = r8 + r1
            int r2 = r19 + r2
            r0.position(r2)
            int r2 = r0.getInt()
            r10 = 1515870810(0x5a5a5a5a, float:1.53652219E16)
            if (r2 != r10) goto L422
            if (r12 != r1) goto L417
            r2 = 1
            goto L419
        L417:
            r2 = r25
        L419:
            r20 = r3
            r10 = r22
            r4 = r24
            r12 = 1
            goto L48c
        L422:
            r10 = 1191201283(0x47004a03, float:32842.01)
            if (r2 != r10) goto L436
            r10 = r22
            if (r10 != r1) goto L42d
            r2 = 1
            goto L42f
        L42d:
            r2 = r25
        L42f:
            r20 = r3
            r4 = r24
            r10 = 1
            goto L48c
        L436:
            r20 = r3
            r10 = r22
            r3 = 496366178(0x1d95f262, float:3.969059E-21)
            if (r2 != r3) goto L44c
            r3 = r23
            if (r3 != r1) goto L445
            r2 = 1
            goto L447
        L445:
            r2 = r25
        L447:
            r4 = r24
            r23 = 1
            goto L48c
        L44c:
            r3 = r23
            r4 = 1700671838(0x655e315e, float:6.557975E22)
            if (r2 != r4) goto L45f
            r4 = r24
            if (r4 != r1) goto L459
            r2 = 1
            goto L45b
        L459:
            r2 = r25
        L45b:
            r23 = r3
            r4 = 1
            goto L48c
        L45f:
            r23 = r3
            r4 = r24
            r3 = 176167201(0xa801921, float:1.2335404E-32)
            if (r2 != r3) goto L470
            if (r14 != r1) goto L46c
            r2 = 1
            goto L46e
        L46c:
            r2 = r25
        L46e:
            r14 = 1
            goto L48c
        L470:
            r3 = 1101174087(0x41a29547, float:20.32289)
            if (r2 != r3) goto L47d
            if (r11 != r1) goto L479
            r2 = 1
            goto L47b
        L479:
            r2 = r25
        L47b:
            r11 = 1
            goto L48c
        L47d:
            r3 = 45126241(0x2b09261, float:2.5944893E-37)
            if (r2 != r3) goto L48a
            if (r15 != r1) goto L486
            r2 = 1
            goto L488
        L486:
            r2 = r25
        L488:
            r15 = 1
            goto L48c
        L48a:
            r2 = r25
        L48c:
            if (r2 != 0) goto L493
            int r3 = r6.frameSize
            int r3 = r3 + r8
            r6.frameSize = r3
        L493:
            int r3 = r19 + r8
            r0.position(r3)
            r19 = r4
            r17 = r7
            r16 = r10
            r3 = r20
            r18 = r23
            r1 = -1
            r7 = 0
            r10 = 1
            goto L4d
        L4a7:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No DTS_SYNCWORD_* found at "
            r2.<init>(r3)
            int r0 = r0.position()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L4bf:
            long r7 = r0.getLong()
            int r5 = (int) r7
            if (r1 != r3) goto L4cc
            if (r2 != r4) goto L4cc
            r6.parseDtshdhdr(r5, r0)
            goto L503
        L4cc:
            r7 = 1129271877(0x434f5245, float:207.32137)
            if (r1 != r7) goto L4de
            r7 = 1397968196(0x53534d44, float:9.075344E11)
            if (r2 != r7) goto L4de
            boolean r1 = r6.parseCoressmd(r5, r0)
            if (r1 != 0) goto L503
            r7 = 0
            return r7
        L4de:
            r7 = 0
            r8 = 1096110162(0x41555052, float:13.332109)
            if (r1 != r8) goto L4f0
            r8 = 759710802(0x2d484452, float:1.1383854E-11)
            if (r2 != r8) goto L4f0
            boolean r1 = r6.parseAuprhdr(r5, r0)
            if (r1 != 0) goto L503
            return r7
        L4f0:
            r8 = 1163416659(0x45585453, float:3461.2703)
            if (r1 != r8) goto L501
            r1 = 1398754628(0x535f4d44, float:9.5907401E11)
            if (r2 != r1) goto L501
            boolean r1 = r6.parseExtssmd(r5, r0)
            if (r1 != 0) goto L503
            return r7
        L501:
            if (r7 < r5) goto L50d
        L503:
            int r1 = r0.getInt()
            int r2 = r0.getInt()
            goto L1e
        L50d:
            r0.get()
            int r7 = r7 + 1
            goto L501
        L513:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "data does not start with 'DTSHDHDR' as required for a DTS-HD file"
            r0.<init>(r1)
            throw r0
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
            long[] r0 = r1.sampleDurations
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
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
}
