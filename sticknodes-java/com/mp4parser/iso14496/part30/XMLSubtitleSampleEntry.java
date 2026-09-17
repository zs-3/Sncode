package com.mp4parser.iso14496.part30;

/* loaded from: classes2.dex */
public class XMLSubtitleSampleEntry extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    public static final java.lang.String TYPE = "stpp";
    private java.lang.String auxiliaryMimeTypes;
    private java.lang.String namespace;
    private java.lang.String schemaLocation;

    public XMLSubtitleSampleEntry() {
            r1 = this;
            java.lang.String r0 = "stpp"
            r1.<init>(r0)
            java.lang.String r0 = ""
            r1.namespace = r0
            r1.schemaLocation = r0
            r1.auxiliaryMimeTypes = r0
            return
    }

    public java.lang.String getAuxiliaryMimeTypes() {
            r1 = this;
            java.lang.String r0 = r1.auxiliaryMimeTypes
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r3) throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.getHeader()
            r3.write(r0)
            java.lang.String r0 = r2.namespace
            int r0 = r0.length()
            int r0 = r0 + 8
            java.lang.String r1 = r2.schemaLocation
            int r1 = r1.length()
            int r0 = r0 + r1
            java.lang.String r1 = r2.auxiliaryMimeTypes
            int r1 = r1.length()
            int r0 = r0 + r1
            int r0 = r0 + 3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 6
            r0.position(r1)
            int r1 = r2.dataReferenceIndex
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            java.lang.String r1 = r2.namespace
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r0, r1)
            java.lang.String r1 = r2.schemaLocation
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r0, r1)
            java.lang.String r1 = r2.auxiliaryMimeTypes
            com.coremedia.iso.IsoTypeWriter.writeZeroTermUtf8String(r0, r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r3.write(r0)
            r2.writeContainer(r3)
            return
    }

    public java.lang.String getNamespace() {
            r1 = this;
            java.lang.String r0 = r1.namespace
            return r0
    }

    public java.lang.String getSchemaLocation() {
            r1 = this;
            java.lang.String r0 = r1.schemaLocation
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r8 = this;
            long r0 = r8.getContainerSize()
            java.lang.String r2 = r8.namespace
            int r2 = r2.length()
            r3 = 8
            int r2 = r2 + r3
            java.lang.String r4 = r8.schemaLocation
            int r4 = r4.length()
            int r2 = r2 + r4
            java.lang.String r4 = r8.auxiliaryMimeTypes
            int r4 = r4.length()
            int r2 = r2 + r4
            int r2 = r2 + 3
            long r4 = (long) r2
            long r0 = r0 + r4
            boolean r2 = r8.largeBox
            if (r2 != 0) goto L2f
            r4 = 8
            long r4 = r4 + r0
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L31
        L2f:
            r3 = 16
        L31:
            long r2 = (long) r3
            long r0 = r0 + r2
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r8, java.nio.ByteBuffer r9, long r10, com.coremedia.iso.BoxParser r12) throws java.io.IOException {
            r7 = this;
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.Buffer r1 = r0.rewind()
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r8.read(r1)
            r1 = 6
            r0.position(r1)
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt16(r0)
            r7.dataReferenceIndex = r0
            long r0 = r8.position()
            r2 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.Buffer r3 = r2.rewind()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r8.read(r3)
            java.nio.Buffer r3 = r2.rewind()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            java.lang.String r3 = com.coremedia.iso.IsoTypeReader.readString(r3)
            r7.namespace = r3
            int r3 = r3.length()
            long r3 = (long) r3
            long r3 = r3 + r0
            r5 = 1
            long r3 = r3 + r5
            r8.position(r3)
            java.nio.Buffer r3 = r2.rewind()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r8.read(r3)
            java.nio.Buffer r3 = r2.rewind()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            java.lang.String r3 = com.coremedia.iso.IsoTypeReader.readString(r3)
            r7.schemaLocation = r3
            java.lang.String r3 = r7.namespace
            int r3 = r3.length()
            long r3 = (long) r3
            long r3 = r3 + r0
            java.lang.String r5 = r7.schemaLocation
            int r5 = r5.length()
            long r5 = (long) r5
            long r3 = r3 + r5
            r5 = 2
            long r3 = r3 + r5
            r8.position(r3)
            java.nio.Buffer r3 = r2.rewind()
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            r8.read(r3)
            java.nio.Buffer r2 = r2.rewind()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            java.lang.String r2 = com.coremedia.iso.IsoTypeReader.readString(r2)
            r7.auxiliaryMimeTypes = r2
            java.lang.String r2 = r7.namespace
            int r2 = r2.length()
            long r2 = (long) r2
            long r0 = r0 + r2
            java.lang.String r2 = r7.schemaLocation
            int r2 = r2.length()
            long r2 = (long) r2
            long r0 = r0 + r2
            java.lang.String r2 = r7.auxiliaryMimeTypes
            int r2 = r2.length()
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 3
            long r0 = r0 + r2
            r8.position(r0)
            int r9 = r9.remaining()
            java.lang.String r0 = r7.namespace
            int r0 = r0.length()
            int r9 = r9 + r0
            java.lang.String r0 = r7.schemaLocation
            int r0 = r0.length()
            int r9 = r9 + r0
            java.lang.String r0 = r7.auxiliaryMimeTypes
            int r0 = r0.length()
            int r9 = r9 + r0
            int r9 = r9 + 3
            long r0 = (long) r9
            long r10 = r10 - r0
            r7.initContainer(r8, r10, r12)
            return
    }

    public void setAuxiliaryMimeTypes(java.lang.String r1) {
            r0 = this;
            r0.auxiliaryMimeTypes = r1
            return
    }

    public void setNamespace(java.lang.String r1) {
            r0 = this;
            r0.namespace = r1
            return
    }

    public void setSchemaLocation(java.lang.String r1) {
            r0 = this;
            r0.schemaLocation = r1
            return
    }
}
