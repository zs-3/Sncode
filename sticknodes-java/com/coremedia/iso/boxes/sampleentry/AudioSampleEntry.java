package com.coremedia.iso.boxes.sampleentry;

/* loaded from: classes.dex */
public final class AudioSampleEntry extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TYPE1 = "samr";
    public static final java.lang.String TYPE10 = "mlpa";
    public static final java.lang.String TYPE11 = "dtsl";
    public static final java.lang.String TYPE12 = "dtsh";
    public static final java.lang.String TYPE13 = "dtse";
    public static final java.lang.String TYPE2 = "sawb";
    public static final java.lang.String TYPE3 = "mp4a";
    public static final java.lang.String TYPE4 = "drms";
    public static final java.lang.String TYPE5 = "alac";
    public static final java.lang.String TYPE7 = "owma";
    public static final java.lang.String TYPE8 = "ac-3";
    public static final java.lang.String TYPE9 = "ec-3";
    public static final java.lang.String TYPE_ENCRYPTED = "enca";
    private long bytesPerFrame;
    private long bytesPerPacket;
    private long bytesPerSample;
    private int channelCount;
    private int compressionId;
    private int packetSize;
    private int reserved1;
    private long reserved2;
    private long sampleRate;
    private int sampleSize;
    private long samplesPerPacket;
    private int soundVersion;
    private byte[] soundVersion2Data;


    static {
            java.lang.Class<com.coremedia.iso.boxes.sampleentry.AudioSampleEntry> r0 = com.coremedia.iso.boxes.sampleentry.AudioSampleEntry.class
            return
    }

    public AudioSampleEntry(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r9) throws java.io.IOException {
            r8 = this;
            java.nio.ByteBuffer r0 = r8.getHeader()
            r9.write(r0)
            int r0 = r8.soundVersion
            r1 = 16
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L12
            r4 = 16
            goto L13
        L12:
            r4 = 0
        L13:
            int r4 = r4 + 28
            r5 = 2
            if (r0 != r5) goto L1a
            r2 = 36
        L1a:
            int r4 = r4 + r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r4)
            r2 = 6
            r0.position(r2)
            int r2 = r8.dataReferenceIndex
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            int r2 = r8.soundVersion
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            int r2 = r8.reserved1
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            long r6 = r8.reserved2
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r6)
            int r2 = r8.channelCount
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            int r2 = r8.sampleSize
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            int r2 = r8.compressionId
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            int r2 = r8.packetSize
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            java.lang.String r2 = r8.type
            java.lang.String r4 = "mlpa"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L5d
            long r1 = r8.getSampleRate()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            goto L66
        L5d:
            long r6 = r8.getSampleRate()
            long r1 = r6 << r1
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
        L66:
            int r1 = r8.soundVersion
            if (r1 != r3) goto L7e
            long r1 = r8.samplesPerPacket
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            long r1 = r8.bytesPerPacket
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            long r1 = r8.bytesPerFrame
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            long r1 = r8.bytesPerSample
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
        L7e:
            int r1 = r8.soundVersion
            if (r1 != r5) goto L9b
            long r1 = r8.samplesPerPacket
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            long r1 = r8.bytesPerPacket
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            long r1 = r8.bytesPerFrame
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            long r1 = r8.bytesPerSample
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            byte[] r1 = r8.soundVersion2Data
            r0.put(r1)
        L9b:
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r9.write(r0)
            r8.writeContainer(r9)
            return
    }

    public long getBytesPerFrame() {
            r2 = this;
            long r0 = r2.bytesPerFrame
            return r0
    }

    public long getBytesPerPacket() {
            r2 = this;
            long r0 = r2.bytesPerPacket
            return r0
    }

    public long getBytesPerSample() {
            r2 = this;
            long r0 = r2.bytesPerSample
            return r0
    }

    public int getChannelCount() {
            r1 = this;
            int r0 = r1.channelCount
            return r0
    }

    public int getCompressionId() {
            r1 = this;
            int r0 = r1.compressionId
            return r0
    }

    public int getPacketSize() {
            r1 = this;
            int r0 = r1.packetSize
            return r0
    }

    public int getReserved1() {
            r1 = this;
            int r0 = r1.reserved1
            return r0
    }

    public long getReserved2() {
            r2 = this;
            long r0 = r2.reserved2
            return r0
    }

    public long getSampleRate() {
            r2 = this;
            long r0 = r2.sampleRate
            return r0
    }

    public int getSampleSize() {
            r1 = this;
            int r0 = r1.sampleSize
            return r0
    }

    public long getSamplesPerPacket() {
            r2 = this;
            long r0 = r2.samplesPerPacket
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r8 = this;
            int r0 = r8.soundVersion
            r1 = 16
            r2 = 0
            r3 = 1
            if (r0 != r3) goto Lb
            r3 = 16
            goto Lc
        Lb:
            r3 = 0
        Lc:
            int r3 = r3 + 28
            r4 = 2
            if (r0 != r4) goto L13
            r2 = 36
        L13:
            int r3 = r3 + r2
            long r2 = (long) r3
            long r4 = r8.getContainerSize()
            long r2 = r2 + r4
            boolean r0 = r8.largeBox
            if (r0 != 0) goto L2d
            r4 = 8
            long r4 = r4 + r2
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L2b
            goto L2d
        L2b:
            r1 = 8
        L2d:
            long r0 = (long) r1
            long r2 = r2 + r0
            return r2
    }

    public int getSoundVersion() {
            r1 = this;
            int r0 = r1.soundVersion
            return r0
    }

    public byte[] getSoundVersion2Data() {
            r1 = this;
            byte[] r0 = r1.soundVersion2Data
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r9, java.nio.ByteBuffer r10, long r11, com.coremedia.iso.BoxParser r13) throws java.io.IOException {
            r8 = this;
            r10 = 28
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r10)
            r9.read(r10)
            r0 = 6
            r10.position(r0)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r10)
            r8.dataReferenceIndex = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r10)
            r8.soundVersion = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r10)
            r8.reserved1 = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.reserved2 = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r10)
            r8.channelCount = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r10)
            r8.sampleSize = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r10)
            r8.compressionId = r0
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r10)
            r8.packetSize = r0
            long r0 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.sampleRate = r0
            java.lang.String r10 = r8.type
            java.lang.String r0 = "mlpa"
            boolean r10 = r10.equals(r0)
            r0 = 16
            if (r10 != 0) goto L54
            long r1 = r8.sampleRate
            long r1 = r1 >>> r0
            r8.sampleRate = r1
        L54:
            int r10 = r8.soundVersion
            r1 = 1
            if (r10 != r1) goto L7b
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r0)
            r9.read(r10)
            r10.rewind()
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.samplesPerPacket = r2
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.bytesPerPacket = r2
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.bytesPerFrame = r2
            long r2 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.bytesPerSample = r2
        L7b:
            int r10 = r8.soundVersion
            r2 = 36
            r3 = 2
            if (r10 != r3) goto Lad
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r2)
            r9.read(r10)
            r10.rewind()
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.samplesPerPacket = r4
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.bytesPerPacket = r4
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.bytesPerFrame = r4
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r10)
            r8.bytesPerSample = r4
            r4 = 20
            byte[] r4 = new byte[r4]
            r8.soundVersion2Data = r4
            r10.get(r4)
        Lad:
            java.lang.String r10 = r8.type
            java.lang.String r4 = "owma"
            boolean r10 = r4.equals(r10)
            r5 = 28
            r7 = 0
            if (r10 == 0) goto Le2
            java.io.PrintStream r10 = java.lang.System.err
            r10.println(r4)
            long r11 = r11 - r5
            int r10 = r8.soundVersion
            if (r10 != r1) goto Lc5
            goto Lc6
        Lc5:
            r0 = 0
        Lc6:
            long r0 = (long) r0
            long r11 = r11 - r0
            if (r10 != r3) goto Lcb
            goto Lcc
        Lcb:
            r2 = 0
        Lcc:
            long r0 = (long) r2
            long r11 = r11 - r0
            int r10 = com.googlecode.mp4parser.util.CastUtils.l2i(r11)
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r10)
            r9.read(r10)
            com.coremedia.iso.boxes.sampleentry.AudioSampleEntry$1 r9 = new com.coremedia.iso.boxes.sampleentry.AudioSampleEntry$1
            r9.<init>(r8, r11, r10)
            r8.addBox(r9)
            goto Lf4
        Le2:
            long r11 = r11 - r5
            int r10 = r8.soundVersion
            if (r10 != r1) goto Le8
            goto Le9
        Le8:
            r0 = 0
        Le9:
            long r0 = (long) r0
            long r11 = r11 - r0
            if (r10 != r3) goto Lee
            goto Lef
        Lee:
            r2 = 0
        Lef:
            long r0 = (long) r2
            long r11 = r11 - r0
            r8.initContainer(r9, r11, r13)
        Lf4:
            return
    }

    public void setBytesPerFrame(long r1) {
            r0 = this;
            r0.bytesPerFrame = r1
            return
    }

    public void setBytesPerPacket(long r1) {
            r0 = this;
            r0.bytesPerPacket = r1
            return
    }

    public void setBytesPerSample(long r1) {
            r0 = this;
            r0.bytesPerSample = r1
            return
    }

    public void setChannelCount(int r1) {
            r0 = this;
            r0.channelCount = r1
            return
    }

    public void setCompressionId(int r1) {
            r0 = this;
            r0.compressionId = r1
            return
    }

    public void setPacketSize(int r1) {
            r0 = this;
            r0.packetSize = r1
            return
    }

    public void setReserved1(int r1) {
            r0 = this;
            r0.reserved1 = r1
            return
    }

    public void setReserved2(long r1) {
            r0 = this;
            r0.reserved2 = r1
            return
    }

    public void setSampleRate(long r1) {
            r0 = this;
            r0.sampleRate = r1
            return
    }

    public void setSampleSize(int r1) {
            r0 = this;
            r0.sampleSize = r1
            return
    }

    public void setSamplesPerPacket(long r1) {
            r0 = this;
            r0.samplesPerPacket = r1
            return
    }

    public void setSoundVersion(int r1) {
            r0 = this;
            r0.soundVersion = r1
            return
    }

    public void setSoundVersion2Data(byte[] r1) {
            r0 = this;
            r0.soundVersion2Data = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.type = r1
            return
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AudioSampleEntry{bytesPerSample="
            r0.<init>(r1)
            long r1 = r3.bytesPerSample
            r0.append(r1)
            java.lang.String r1 = ", bytesPerFrame="
            r0.append(r1)
            long r1 = r3.bytesPerFrame
            r0.append(r1)
            java.lang.String r1 = ", bytesPerPacket="
            r0.append(r1)
            long r1 = r3.bytesPerPacket
            r0.append(r1)
            java.lang.String r1 = ", samplesPerPacket="
            r0.append(r1)
            long r1 = r3.samplesPerPacket
            r0.append(r1)
            java.lang.String r1 = ", packetSize="
            r0.append(r1)
            int r1 = r3.packetSize
            r0.append(r1)
            java.lang.String r1 = ", compressionId="
            r0.append(r1)
            int r1 = r3.compressionId
            r0.append(r1)
            java.lang.String r1 = ", soundVersion="
            r0.append(r1)
            int r1 = r3.soundVersion
            r0.append(r1)
            java.lang.String r1 = ", sampleRate="
            r0.append(r1)
            long r1 = r3.sampleRate
            r0.append(r1)
            java.lang.String r1 = ", sampleSize="
            r0.append(r1)
            int r1 = r3.sampleSize
            r0.append(r1)
            java.lang.String r1 = ", channelCount="
            r0.append(r1)
            int r1 = r3.channelCount
            r0.append(r1)
            java.lang.String r1 = ", boxes="
            r0.append(r1)
            java.util.List r1 = r3.getBoxes()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
