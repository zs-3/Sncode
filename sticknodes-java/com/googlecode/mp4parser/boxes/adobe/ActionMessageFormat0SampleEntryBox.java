package com.googlecode.mp4parser.boxes.adobe;

/* loaded from: classes2.dex */
public class ActionMessageFormat0SampleEntryBox extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    public static final java.lang.String TYPE = "amf0";

    public ActionMessageFormat0SampleEntryBox() {
            r1 = this;
            java.lang.String r0 = "amf0"
            r1.<init>(r0)
            return
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r3) throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.getHeader()
            r3.write(r0)
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 6
            r0.position(r1)
            int r1 = r2.dataReferenceIndex
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r3.write(r0)
            r2.writeContainer(r3)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r5 = this;
            long r0 = r5.getContainerSize()
            r2 = 8
            long r0 = r0 + r2
            boolean r2 = r5.largeBox
            if (r2 != 0) goto L18
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L15
            goto L18
        L15:
            r2 = 8
            goto L1a
        L18:
            r2 = 16
        L1a:
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r3, java.nio.ByteBuffer r4, long r5, com.coremedia.iso.BoxParser r7) throws java.io.IOException {
            r2 = this;
            r4 = 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r3.read(r4)
            r0 = 6
            r4.position(r0)
            int r4 = com.coremedia.iso.IsoTypeReader.readUInt16(r4)
            r2.dataReferenceIndex = r4
            r0 = 8
            long r5 = r5 - r0
            r2.initContainer(r3, r5, r7)
            return
    }
}
