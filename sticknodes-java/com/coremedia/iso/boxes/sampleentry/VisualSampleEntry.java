package com.coremedia.iso.boxes.sampleentry;

/* loaded from: classes.dex */
public final class VisualSampleEntry extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TYPE1 = "mp4v";
    public static final java.lang.String TYPE2 = "s263";
    public static final java.lang.String TYPE3 = "avc1";
    public static final java.lang.String TYPE4 = "avc3";
    public static final java.lang.String TYPE5 = "drmi";
    public static final java.lang.String TYPE6 = "hvc1";
    public static final java.lang.String TYPE7 = "hev1";
    public static final java.lang.String TYPE_ENCRYPTED = "encv";
    private java.lang.String compressorname;
    private int depth;
    private int frameCount;
    private int height;
    private double horizresolution;
    private long[] predefined;
    private double vertresolution;
    private int width;


    static {
            java.lang.Class<com.coremedia.iso.boxes.sampleentry.VisualSampleEntry> r0 = com.coremedia.iso.boxes.sampleentry.VisualSampleEntry.class
            return
    }

    public VisualSampleEntry() {
            r2 = this;
            java.lang.String r0 = "avc1"
            r2.<init>(r0)
            r0 = 4634766966517661696(0x4052000000000000, double:72.0)
            r2.horizresolution = r0
            r2.vertresolution = r0
            r0 = 1
            r2.frameCount = r0
            java.lang.String r0 = ""
            r2.compressorname = r0
            r0 = 24
            r2.depth = r0
            r0 = 3
            long[] r0 = new long[r0]
            r2.predefined = r0
            return
    }

    public VisualSampleEntry(java.lang.String r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 4634766966517661696(0x4052000000000000, double:72.0)
            r2.horizresolution = r0
            r2.vertresolution = r0
            r3 = 1
            r2.frameCount = r3
            java.lang.String r3 = ""
            r2.compressorname = r3
            r3 = 24
            r2.depth = r3
            r3 = 3
            long[] r3 = new long[r3]
            r2.predefined = r3
            return
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r6) throws java.io.IOException {
            r5 = this;
            java.nio.ByteBuffer r0 = r5.getHeader()
            r6.write(r0)
            r0 = 78
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 6
            r0.position(r1)
            int r1 = r5.dataReferenceIndex
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            r1 = 0
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            long[] r2 = r5.predefined
            r3 = r2[r1]
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r3)
            long[] r2 = r5.predefined
            r3 = 1
            r3 = r2[r3]
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r3)
            long[] r2 = r5.predefined
            r3 = 2
            r3 = r2[r3]
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r3)
            int r2 = r5.getWidth()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            int r2 = r5.getHeight()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            double r2 = r5.getHorizresolution()
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r0, r2)
            double r2 = r5.getVertresolution()
            com.coremedia.iso.IsoTypeWriter.writeFixedPoint1616(r0, r2)
            r2 = 0
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r2)
            int r2 = r5.getFrameCount()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r2)
            java.lang.String r2 = r5.getCompressorname()
            int r2 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r2)
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r2)
            java.lang.String r2 = r5.getCompressorname()
            byte[] r2 = com.coremedia.iso.Utf8.convert(r2)
            r0.put(r2)
            java.lang.String r2 = r5.getCompressorname()
            int r2 = com.coremedia.iso.Utf8.utf8StringLengthInBytes(r2)
        L7a:
            r3 = 31
            if (r2 < r3) goto L98
            int r1 = r5.getDepth()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r6.write(r0)
            r5.writeContainer(r6)
            return
        L98:
            int r2 = r2 + 1
            r0.put(r1)
            goto L7a
    }

    public java.lang.String getCompressorname() {
            r1 = this;
            java.lang.String r0 = r1.compressorname
            return r0
    }

    public int getDepth() {
            r1 = this;
            int r0 = r1.depth
            return r0
    }

    public int getFrameCount() {
            r1 = this;
            int r0 = r1.frameCount
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    public double getHorizresolution() {
            r2 = this;
            double r0 = r2.horizresolution
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r7 = this;
            long r0 = r7.getContainerSize()
            r2 = 78
            long r0 = r0 + r2
            boolean r2 = r7.largeBox
            if (r2 != 0) goto L1b
            r2 = 8
            long r2 = r2 + r0
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L18
            goto L1b
        L18:
            r2 = 8
            goto L1d
        L1b:
            r2 = 16
        L1d:
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    public double getVertresolution() {
            r2 = this;
            double r0 = r2.vertresolution
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r7, java.nio.ByteBuffer r8, long r9, com.coremedia.iso.BoxParser r11) throws java.io.IOException {
            r6 = this;
            long r0 = r7.position()
            long r0 = r0 + r9
            r8 = 78
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)
            r7.read(r8)
            r2 = 6
            r8.position(r2)
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            r6.dataReferenceIndex = r2
            com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            long[] r2 = r6.predefined
            r3 = 0
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r2[r3] = r4
            long[] r2 = r6.predefined
            r3 = 1
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r2[r3] = r4
            long[] r2 = r6.predefined
            r3 = 2
            long r4 = com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            r2[r3] = r4
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            r6.width = r2
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            r6.height = r2
            double r2 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r8)
            r6.horizresolution = r2
            double r2 = com.coremedia.iso.IsoTypeReader.readFixedPoint1616(r8)
            r6.vertresolution = r2
            com.coremedia.iso.IsoTypeReader.readUInt32(r8)
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            r6.frameCount = r2
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt8(r8)
            r3 = 31
            if (r2 <= r3) goto L64
            r2 = 31
        L64:
            byte[] r4 = new byte[r2]
            r8.get(r4)
            java.lang.String r4 = com.coremedia.iso.Utf8.convert(r4)
            r6.compressorname = r4
            if (r2 >= r3) goto L77
            int r3 = r3 - r2
            byte[] r2 = new byte[r3]
            r8.get(r2)
        L77:
            int r2 = com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            r6.depth = r2
            com.coremedia.iso.IsoTypeReader.readUInt16(r8)
            com.coremedia.iso.boxes.sampleentry.VisualSampleEntry$1 r8 = new com.coremedia.iso.boxes.sampleentry.VisualSampleEntry$1
            r8.<init>(r6, r0, r7)
            r0 = 78
            long r9 = r9 - r0
            r6.initContainer(r8, r9, r11)
            return
    }

    public void setCompressorname(java.lang.String r1) {
            r0 = this;
            r0.compressorname = r1
            return
    }

    public void setDepth(int r1) {
            r0 = this;
            r0.depth = r1
            return
    }

    public void setFrameCount(int r1) {
            r0 = this;
            r0.frameCount = r1
            return
    }

    public void setHeight(int r1) {
            r0 = this;
            r0.height = r1
            return
    }

    public void setHorizresolution(double r1) {
            r0 = this;
            r0.horizresolution = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.type = r1
            return
    }

    public void setVertresolution(double r1) {
            r0 = this;
            r0.vertresolution = r1
            return
    }

    public void setWidth(int r1) {
            r0 = this;
            r0.width = r1
            return
    }
}
