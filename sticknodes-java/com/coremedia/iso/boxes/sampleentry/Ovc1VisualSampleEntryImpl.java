package com.coremedia.iso.boxes.sampleentry;

/* loaded from: classes.dex */
public class Ovc1VisualSampleEntryImpl extends com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry {
    public static final java.lang.String TYPE = "ovc1";
    private byte[] vc1Content;

    public Ovc1VisualSampleEntryImpl() {
            r1 = this;
            java.lang.String r0 = "ovc1"
            r1.<init>(r0)
            r0 = 0
            byte[] r0 = new byte[r0]
            r1.vc1Content = r0
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
            byte[] r0 = r2.vc1Content
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r3.write(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r6 = this;
            boolean r0 = r6.largeBox
            r1 = 16
            if (r0 != 0) goto L17
            byte[] r0 = r6.vc1Content
            int r0 = r0.length
            int r0 = r0 + r1
            long r2 = (long) r0
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L15
            goto L17
        L15:
            r1 = 8
        L17:
            long r0 = (long) r1
            byte[] r2 = r6.vc1Content
            int r2 = r2.length
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 8
            long r0 = r0 + r2
            return r0
    }

    public byte[] getVc1Content() {
            r1 = this;
            byte[] r0 = r1.vc1Content
            return r0
    }

    @Override // com.coremedia.iso.boxes.sampleentry.AbstractSampleEntry, com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r1, java.nio.ByteBuffer r2, long r3, com.coremedia.iso.BoxParser r5) throws java.io.IOException {
            r0 = this;
            int r2 = com.googlecode.mp4parser.util.CastUtils.l2i(r3)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.read(r2)
            r1 = 6
            r2.position(r1)
            int r1 = com.coremedia.iso.IsoTypeReader.readUInt16(r2)
            r0.dataReferenceIndex = r1
            int r1 = r2.remaining()
            byte[] r1 = new byte[r1]
            r0.vc1Content = r1
            r2.get(r1)
            return
    }

    public void setVc1Content(byte[] r1) {
            r0 = this;
            r0.vc1Content = r1
            return
    }
}
