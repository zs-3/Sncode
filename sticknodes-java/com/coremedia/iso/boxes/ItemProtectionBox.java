package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class ItemProtectionBox extends com.googlecode.mp4parser.AbstractContainerBox implements com.coremedia.iso.boxes.FullBox {
    public static final java.lang.String TYPE = "ipro";
    private int flags;
    private int version;

    public ItemProtectionBox() {
            r1 = this;
            java.lang.String r0 = "ipro"
            r1.<init>(r0)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r3) throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.getHeader()
            r3.write(r0)
            r0 = 6
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.version
            com.coremedia.iso.IsoTypeWriter.writeUInt8(r0, r1)
            int r1 = r2.flags
            com.coremedia.iso.IsoTypeWriter.writeUInt24(r0, r1)
            java.util.List r1 = r2.getBoxes()
            int r1 = r1.size()
            com.coremedia.iso.IsoTypeWriter.writeUInt16(r0, r1)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r3.write(r0)
            r2.writeContainer(r3)
            return
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
            r1 = this;
            int r0 = r1.flags
            return r0
    }

    public com.coremedia.iso.boxes.SchemeInformationBox getItemProtectionScheme() {
            r2 = this;
            java.lang.Class<com.coremedia.iso.boxes.SchemeInformationBox> r0 = com.coremedia.iso.boxes.SchemeInformationBox.class
            java.util.List r0 = r2.getBoxes(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1a
            java.lang.Class<com.coremedia.iso.boxes.SchemeInformationBox> r0 = com.coremedia.iso.boxes.SchemeInformationBox.class
            java.util.List r0 = r2.getBoxes(r0)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.coremedia.iso.boxes.SchemeInformationBox r0 = (com.coremedia.iso.boxes.SchemeInformationBox) r0
            return r0
        L1a:
            r0 = 0
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public long getSize() {
            r5 = this;
            long r0 = r5.getContainerSize()
            r2 = 6
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

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
            r1 = this;
            int r0 = r1.version
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r3, java.nio.ByteBuffer r4, long r5, com.coremedia.iso.BoxParser r7) throws java.io.IOException {
            r2 = this;
            r4 = 6
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r3.read(r4)
            r4.rewind()
            int r0 = com.coremedia.iso.IsoTypeReader.readUInt8(r4)
            r2.version = r0
            int r4 = com.coremedia.iso.IsoTypeReader.readUInt24(r4)
            r2.flags = r4
            r0 = 6
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
