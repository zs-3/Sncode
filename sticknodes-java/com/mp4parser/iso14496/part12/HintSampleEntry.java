package com.mp4parser.iso14496.part12;

/* loaded from: classes2.dex */
public class HintSampleEntry extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    protected byte[] data;

    public HintSampleEntry(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
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
            r0.rewind()
            r3.write(r0)
            byte[] r0 = r2.data
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r3.write(r0)
            return
    }

    public byte[] getData() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r8 = this;
            byte[] r0 = r8.data
            int r0 = r0.length
            r1 = 8
            int r0 = r0 + r1
            long r2 = (long) r0
            boolean r0 = r8.largeBox
            if (r0 != 0) goto L17
            r4 = 8
            long r4 = r4 + r2
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L19
        L17:
            r1 = 16
        L19:
            long r0 = (long) r1
            long r2 = r2 + r0
            return r2
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r3, java.nio.ByteBuffer r4, long r5, com.coremedia.iso.BoxParser r7) throws java.io.IOException {
            r2 = this;
            r4 = 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r3.read(r4)
            r7 = 6
            r4.position(r7)
            int r4 = com.coremedia.iso.IsoTypeReader.readUInt16(r4)
            r2.dataReferenceIndex = r4
            r0 = 8
            long r5 = r5 - r0
            int r4 = com.googlecode.mp4parser.util.CastUtils.l2i(r5)
            byte[] r4 = new byte[r4]
            r2.data = r4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r3.read(r4)
            return
    }

    public void setData(byte[] r1) {
            r0 = this;
            r0.data = r1
            return
    }
}
