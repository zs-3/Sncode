package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class DataReferenceBox extends com.googlecode.mp4parser.AbstractContainerBox implements com.coremedia.iso.boxes.FullBox {
    public static final java.lang.String TYPE = "dref";
    private int flags;
    private int version;

    public DataReferenceBox() {
            r1 = this;
            java.lang.String r0 = "dref"
            r1.<init>(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r4) throws java.io.IOException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.getHeader()
            r4.write(r0)
            r0 = 8
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r3.version
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r3.flags
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r0, r1)
            java.util.List r1 = r3.getBoxes()
            int r1 = r1.size()
            long r1 = (long) r1
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r4.write(r0)
            r3.writeContainer(r4)
            return
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
            r1 = this;
            int r0 = r1.flags
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r7 = this;
            long r0 = r7.getContainerSize()
            r2 = 8
            long r0 = r0 + r2
            boolean r4 = r7.largeBox
            if (r4 != 0) goto L19
            long r2 = r2 + r0
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L16
            goto L19
        L16:
            r2 = 8
            goto L1b
        L19:
            r2 = 16
        L1b:
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
            r1 = this;
            int r0 = r1.version
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r3, java.nio.ByteBuffer r4, long r5, com.coremedia.iso.BoxParser r7) throws java.io.IOException {
            r2 = this;
            r4 = 8
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r3.read(r4)
            r4.rewind()
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
            r2.version = r0
            int r4 = com.coremedia.iso.IsoTypeReader.readUInt24(r4)
            r2.flags = r4
            r0 = 8
            long r5 = r5 - r0
            r2.initContainer(r3, r5, r7)
            return
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setFlags(int r1) {
            r0 = this;
            r0.flags = r1
            return
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public void setVersion(int r1) {
            r0 = this;
            r0.version = r1
            return
    }
}
