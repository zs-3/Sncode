package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class MetaBox extends com.googlecode.mp4parser.AbstractContainerBox {
    public static final java.lang.String TYPE = "meta";
    private int flags;
    private int version;

    public MetaBox() {
            r1 = this;
            java.lang.String r0 = "meta"
            r1.<init>(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.getHeader()
            r2.write(r0)
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1.writeVersionAndFlags(r0)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r2.write(r0)
            r1.writeContainer(r2)
            return
    }

    public int getFlags() {
            r1 = this;
            int r0 = r1.flags
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r5 = this;
            long r0 = r5.getContainerSize()
            r2 = 4
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

    public int getVersion() {
            r1 = this;
            int r0 = r1.version
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r3, java.nio.ByteBuffer r4, long r5, com.coremedia.iso.BoxParser r7) throws java.io.IOException {
            r2 = this;
            r4 = 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r3.read(r4)
            java.nio.Buffer r4 = r4.rewind()
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            r2.parseVersionAndFlags(r4)
            r0 = 4
            long r5 = r5 - r0
            r2.initContainer(r3, r5, r7)
            return
    }

    protected final long parseVersionAndFlags(java.nio.ByteBuffer r3) {
            r2 = this;
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r3)
            r2.version = r0
            int r3 = com.coremedia.iso.IsoTypeReader.readUInt24(r3)
            r2.flags = r3
            r0 = 4
            return r0
    }

    public void setFlags(int r1) {
            r0 = this;
            r0.flags = r1
            return
    }

    public void setVersion(int r1) {
            r0 = this;
            r0.version = r1
            return
    }

    protected final void writeVersionAndFlags(java.nio.ByteBuffer r2) {
            r1 = this;
            int r0 = r1.version
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r2, r0)
            int r0 = r1.flags
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r2, r0)
            return
    }
}
