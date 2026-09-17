package com.googlecode.mp4parser.authoring.tracks;

/* loaded from: classes2.dex */
public class H263TrackImpl extends com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack {
    private static java.util.logging.Logger LOG;
    int BINARY;
    int BINARY_ONLY;
    int GRAYSCALE;
    int RECTANGULAR;
    boolean esdsComplete;
    java.util.List<java.nio.ByteBuffer> esdsStuff;
    int fixed_vop_time_increment;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.coremedia.iso.boxes.SampleDescriptionBox stsd;
    int vop_time_increment_resolution;

    static {
            java.lang.Class<com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor> r0 = com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.authoring.tracks.H263TrackImpl.LOG = r0
            return
    }

    public H263TrackImpl(com.googlecode.mp4parser.DataSource r22) throws java.io.IOException {
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = 0
            r0.<init>(r1, r2)
            r0.RECTANGULAR = r2
            r3 = 1
            r0.BINARY = r3
            r4 = 2
            r0.BINARY_ONLY = r4
            r5 = 3
            r0.GRAYSCALE = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.samples = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.esdsStuff = r5
            r0.esdsComplete = r2
            r5 = -1
            r0.fixed_vop_time_increment = r5
            r0.vop_time_increment_resolution = r2
            com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack$LookAhead r5 = new com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack$LookAhead
            r5.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r6 = new com.coremedia.iso.boxes.sampleentry.VisualSampleEntry
            java.lang.String r7 = "mp4v"
            r6.<init>(r7)
            com.coremedia.iso.boxes.SampleDescriptionBox r7 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r7.<init>()
            r0.stsd = r7
            r7.addBox(r6)
            r9 = 0
            r11 = 0
            r12 = -1
        L48:
            java.nio.ByteBuffer r14 = r0.findNextNal(r5)
            r15 = 32
            if (r14 != 0) goto Lb8
            long[] r1 = r0.decodingTimes
            long[] r5 = new long[r3]
            int r7 = r1.length
            int r7 = r7 - r3
            r7 = r1[r7]
            r5[r2] = r7
            long[] r1 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r1, r5)
            r0.decodingTimes = r1
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r1 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor
            r1.<init>()
            r1.setEsId(r3)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderConfigDescriptor
            r2.<init>()
            r2.setObjectTypeIndication(r15)
            r3 = 4
            r2.setStreamType(r3)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo r3 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.DecoderSpecificInfo
            r3.<init>()
            java.util.List<java.nio.ByteBuffer> r5 = r0.esdsStuff
            com.googlecode.mp4parser.authoring.Sample r5 = r0.createSampleObject(r5)
            long r7 = r5.getSize()
            int r7 = com.googlecode.mp4parser.util.CastUtils.l2i(r7)
            byte[] r7 = new byte[r7]
            java.nio.ByteBuffer r5 = r5.asByteBuffer()
            r5.get(r7)
            r3.setData(r7)
            r2.setDecoderSpecificInfo(r3)
            r1.setDecoderConfigDescriptor(r2)
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor r2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.SLConfigDescriptor
            r2.<init>()
            r2.setPredefined(r4)
            r1.setSlConfigDescriptor(r2)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox r2 = new com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox
            r2.<init>()
            r2.setEsDescriptor(r1)
            r6.addBox(r2)
            com.googlecode.mp4parser.authoring.TrackMetaData r1 = r0.trackMetaData
            int r2 = r0.vop_time_increment_resolution
            long r2 = (long) r2
            r1.setTimescale(r2)
            return
        Lb8:
            java.nio.ByteBuffer r2 = r14.duplicate()
            int r7 = com.coremedia.iso.IsoTypeReader.readUInt8(r14)
            r8 = 176(0xb0, float:2.47E-43)
            r4 = 181(0xb5, float:2.54E-43)
            if (r7 == r8) goto L1aa
            if (r7 == r4) goto L1aa
            if (r7 == 0) goto L1aa
            if (r7 == r15) goto L1aa
            r8 = 178(0xb2, float:2.5E-43)
            if (r7 != r8) goto Ld2
            goto L1aa
        Ld2:
            r4 = 179(0xb3, float:2.51E-43)
            if (r7 != r4) goto L10b
            r0.esdsComplete = r3
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r4 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r4.<init>(r14)
            r7 = 18
            int r4 = r4.readBits(r7)
            r7 = r4 & 63
            int r8 = r4 >>> 7
            r8 = r8 & 63
            int r8 = r8 * 60
            int r7 = r7 + r8
            int r4 = r4 >>> 13
            r4 = r4 & 31
            int r4 = r4 * 60
            int r4 = r4 * 60
            int r7 = r7 + r4
            long r9 = (long) r7
            java.util.List<java.lang.Integer> r4 = r0.stss
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r7 = r0.samples
            int r7 = r7.size()
            int r7 = r7 + r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.add(r7)
            r1.add(r2)
            goto L1c3
        L10b:
            r4 = 182(0xb6, float:2.55E-43)
            if (r7 != r4) goto L1a2
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r4 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r4.<init>(r14)
            r8 = 2
            r4.readBits(r8)
        L118:
            boolean r7 = r4.readBool()
            if (r7 != 0) goto L198
            r4.readBool()
            r7 = 0
        L122:
            int r14 = r0.vop_time_increment_resolution
            int r15 = r3 << r7
            if (r14 >= r15) goto L190
            int r4 = r4.readBits(r7)
            int r7 = r0.vop_time_increment_resolution
            long r14 = (long) r7
            long r14 = r14 * r9
            int r7 = r4 % r7
            r19 = r9
            long r8 = (long) r7
            long r14 = r14 + r8
            r17 = -1
            int r7 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r7 == 0) goto L14e
            long[] r7 = r0.decodingTimes
            long[] r8 = new long[r3]
            long r9 = r14 - r12
            r16 = 0
            r8[r16] = r9
            long[] r7 = com.googlecode.mp4parser.util.Mp4Arrays.copyOfAndAppend(r7, r8)
            r0.decodingTimes = r7
            goto L150
        L14e:
            r16 = 0
        L150:
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Frame increment: "
            r8.<init>(r9)
            long r9 = r14 - r12
            r8.append(r9)
            java.lang.String r9 = " vop time increment: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r4 = " last_sync_point: "
            r8.append(r4)
            r9 = r19
            r8.append(r9)
            java.lang.String r4 = " time_code: "
            r8.append(r4)
            r8.append(r14)
            java.lang.String r4 = r8.toString()
            r7.println(r4)
            r1.add(r2)
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r2 = r0.samples
            com.googlecode.mp4parser.authoring.Sample r4 = r0.createSampleObject(r1)
            r2.add(r4)
            r1.clear()
            r12 = r14
            goto L1c3
        L190:
            r16 = 0
            r17 = -1
            int r7 = r7 + 1
            r8 = 2
            goto L122
        L198:
            r16 = 0
            r17 = -1
            r7 = 1
            long r9 = r9 + r7
            r8 = 2
            goto L118
        L1a2:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Got start code I don't know. Ask Sebastian via mp4parser mailing list what to do"
            r1.<init>(r2)
            throw r1
        L1aa:
            r16 = 0
            r17 = -1
            boolean r8 = r0.esdsComplete
            if (r8 != 0) goto L1c3
            java.util.List<java.nio.ByteBuffer> r8 = r0.esdsStuff
            r8.add(r2)
            if (r7 != r15) goto L1bd
            r0.parse0x20Unit(r14, r11, r6)
            goto L1c3
        L1bd:
            if (r7 != r4) goto L1c3
            int r11 = r0.parse0x05Unit(r14)
        L1c3:
            r2 = 0
            r4 = 2
            goto L48
    }

    public static void main(java.lang.String[] r2) throws java.io.IOException {
            com.googlecode.mp4parser.FileDataSourceImpl r2 = new com.googlecode.mp4parser.FileDataSourceImpl
            java.lang.String r0 = "C:\\content\\bbb.h263"
            r2.<init>(r0)
            com.googlecode.mp4parser.authoring.Movie r0 = new com.googlecode.mp4parser.authoring.Movie
            r0.<init>()
            com.googlecode.mp4parser.authoring.tracks.H263TrackImpl r1 = new com.googlecode.mp4parser.authoring.tracks.H263TrackImpl
            r1.<init>(r2)
            r0.addTrack(r1)
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder r2 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder
            r2.<init>()
            com.coremedia.iso.boxes.Container r2 = r2.build(r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.lang.String r1 = "output.mp4"
            r0.<init>(r1)
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            r2.writeContainer(r0)
            return
    }

    public static void main1(java.lang.String[] r3) throws java.io.IOException {
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "C:\\dev\\mp4parser\\frames"
            r3.<init>(r0)
            java.io.File[] r3 = r3.listFiles()
            java.util.Arrays.sort(r3)
            com.googlecode.mp4parser.authoring.Movie r0 = new com.googlecode.mp4parser.authoring.Movie
            r0.<init>()
            com.googlecode.mp4parser.authoring.tracks.H263TrackImpl r1 = new com.googlecode.mp4parser.authoring.tracks.H263TrackImpl
            com.googlecode.mp4parser.MultiFileDataSourceImpl r2 = new com.googlecode.mp4parser.MultiFileDataSourceImpl
            r2.<init>(r3)
            r1.<init>(r2)
            r0.addTrack(r1)
            com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder r3 = new com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder
            r3.<init>()
            com.coremedia.iso.boxes.Container r3 = r3.build(r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.lang.String r1 = "output.mp4"
            r0.<init>(r1)
            java.nio.channels.WritableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            r3.writeContainer(r0)
            return
    }

    public static void main2(java.lang.String[] r2) throws java.io.IOException {
            com.coremedia.iso.IsoFile r2 = new com.coremedia.iso.IsoFile
            java.lang.String r0 = "C:\\content\\bbb.mp4"
            r2.<init>(r0)
            java.lang.String r0 = "/moov[0]/trak[0]/mdia[0]/minf[0]/stbl[0]/stsd[0]/mp4v[0]/esds[0]"
            com.coremedia.iso.boxes.Box r2 = com.googlecode.mp4parser.util.Path.getPath(r2, r0)
            com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox r2 = (com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox) r2
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.nio.channels.WritableByteChannel r1 = java.nio.channels.Channels.newChannel(r0)
            r2.getBox(r1)
            java.io.PrintStream r1 = java.lang.System.err
            byte[] r0 = r0.toByteArray()
            java.lang.String r0 = com.coremedia.iso.Hex.encodeHex(r0)
            r1.println(r0)
            java.io.PrintStream r0 = java.lang.System.err
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor r1 = r2.getEsDescriptor()
            r0.println(r1)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.nio.channels.WritableByteChannel r1 = java.nio.channels.Channels.newChannel(r0)
            r2.getBox(r1)
            java.io.PrintStream r2 = java.lang.System.err
            byte[] r0 = r0.toByteArray()
            java.lang.String r0 = com.coremedia.iso.Hex.encodeHex(r0)
            r2.println(r0)
            return
    }

    private int parse0x05Unit(java.nio.ByteBuffer r3) {
            r2 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r0 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r0.<init>(r3)
            boolean r3 = r0.readBool()
            if (r3 == 0) goto L15
            r3 = 4
            int r3 = r0.readBits(r3)
            r1 = 3
            r0.readBits(r1)
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }

    private void parse0x20Unit(java.nio.ByteBuffer r5, int r6, com.coremedia.iso.boxes.sampleentry.VisualSampleEntry r7) {
            r4 = this;
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer r0 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer
            r0.<init>(r5)
            r0.readBool()
            r5 = 8
            r0.readBits(r5)
            boolean r1 = r0.readBool()
            r2 = 4
            if (r1 == 0) goto L1c
            int r6 = r0.readBits(r2)
            r1 = 3
            r0.readBits(r1)
        L1c:
            int r1 = r0.readBits(r2)
            r3 = 15
            if (r1 != r3) goto L2a
            r0.readBits(r5)
            r0.readBits(r5)
        L2a:
            boolean r5 = r0.readBool()
            r1 = 2
            if (r5 == 0) goto L46
            r0.readBits(r1)
            r0.readBool()
            boolean r5 = r0.readBool()
            if (r5 != 0) goto L3e
            goto L46
        L3e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Implemented when needed"
            r5.<init>(r6)
            throw r5
        L46:
            int r5 = r0.readBits(r1)
            int r1 = r4.GRAYSCALE
            r3 = 1
            if (r5 != r1) goto L54
            if (r6 == r3) goto L54
            r0.readBits(r2)
        L54:
            r0.readBool()
            r6 = 16
            int r6 = r0.readBits(r6)
            r4.vop_time_increment_resolution = r6
            r0.readBool()
            boolean r6 = r0.readBool()
            if (r6 == 0) goto L80
            java.util.logging.Logger r6 = com.googlecode.mp4parser.authoring.tracks.H263TrackImpl.LOG
            java.lang.String r1 = "Fixed Frame Rate"
            r6.info(r1)
            r6 = 0
        L70:
            int r1 = r4.vop_time_increment_resolution
            int r2 = r3 << r6
            if (r1 >= r2) goto L7d
            int r6 = r0.readBits(r6)
            r4.fixed_vop_time_increment = r6
            goto L80
        L7d:
            int r6 = r6 + 1
            goto L70
        L80:
            int r6 = r4.BINARY_ONLY
            if (r5 == r6) goto La2
            int r6 = r4.RECTANGULAR
            if (r5 != r6) goto La1
            r0.readBool()
            r5 = 13
            int r6 = r0.readBits(r5)
            r7.setWidth(r6)
            r0.readBool()
            int r5 = r0.readBits(r5)
            r7.setHeight(r5)
            r0.readBool()
        La1:
            return
        La2:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Please implmenet me"
            r5.<init>(r6)
            throw r5
    }

    @Override // com.googlecode.mp4parser.authoring.tracks.AbstractH26XTrack
    protected com.googlecode.mp4parser.authoring.Sample createSampleObject(java.util.List<? extends java.nio.ByteBuffer> r7) {
            r6 = this;
            r0 = 3
            byte[] r0 = new byte[r0]
            r1 = 2
            r2 = 1
            r0[r1] = r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            int r3 = r7.size()
            int r3 = r3 * 2
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[r3]
            r3 = 0
        L14:
            int r4 = r7.size()
            if (r3 < r4) goto L20
            com.googlecode.mp4parser.authoring.SampleImpl r7 = new com.googlecode.mp4parser.authoring.SampleImpl
            r7.<init>(r1)
            return r7
        L20:
            int r4 = r3 * 2
            r1[r4] = r0
            int r4 = r4 + r2
            java.lang.Object r5 = r7.get(r3)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            r1[r4] = r5
            int r3 = r3 + 1
            goto L14
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "vide"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.stsd
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }
}
