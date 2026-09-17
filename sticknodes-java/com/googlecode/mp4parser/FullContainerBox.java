package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public abstract class FullContainerBox extends com.googlecode.mp4parser.AbstractContainerBox implements com.coremedia.iso.boxes.FullBox {
    private static java.util.logging.Logger LOG;
    private int flags;
    private int version;

    static {
            java.lang.Class<com.googlecode.mp4parser.FullContainerBox> r0 = com.googlecode.mp4parser.FullContainerBox.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.googlecode.mp4parser.FullContainerBox.LOG = r0
            return
    }

    public FullContainerBox(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r1) throws java.io.IOException {
            r0 = this;
            super.getBox(r1)
            return
    }

    @Override // com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.Container
    public <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getBoxes(java.lang.Class<T> r2) {
            r1 = this;
            r0 = 0
            java.util.List r2 = r1.getBoxes(r2, r0)
            return r2
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getFlags() {
            r1 = this;
            int r0 = r1.flags
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox
    protected java.nio.ByteBuffer getHeader() {
            r14 = this;
            boolean r0 = r14.largeBox
            r1 = 8
            r2 = 7
            r3 = 2
            r4 = 6
            r5 = 5
            r6 = 0
            r7 = 4
            r8 = 1
            r9 = 3
            if (r0 != 0) goto L5a
            long r10 = r14.getSize()
            r12 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L1c
            goto L5a
        L1c:
            r0 = 12
            byte[] r0 = new byte[r0]
            java.lang.String r10 = r14.type
            byte[] r10 = r10.getBytes()
            r6 = r10[r6]
            r0[r7] = r6
            java.lang.String r6 = r14.type
            byte[] r6 = r6.getBytes()
            r6 = r6[r8]
            r0[r5] = r6
            java.lang.String r5 = r14.type
            byte[] r5 = r5.getBytes()
            r3 = r5[r3]
            r0[r4] = r3
            java.lang.String r3 = r14.type
            byte[] r3 = r3.getBytes()
            r3 = r3[r9]
            r0[r2] = r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            long r2 = r14.getSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r2)
            r0.position(r1)
            r14.writeVersionAndFlags(r0)
            goto L99
        L5a:
            r0 = 20
            byte[] r0 = new byte[r0]
            r0[r9] = r8
            java.lang.String r10 = r14.type
            byte[] r10 = r10.getBytes()
            r6 = r10[r6]
            r0[r7] = r6
            java.lang.String r6 = r14.type
            byte[] r6 = r6.getBytes()
            r6 = r6[r8]
            r0[r5] = r6
            java.lang.String r5 = r14.type
            byte[] r5 = r5.getBytes()
            r3 = r5[r3]
            r0[r4] = r3
            java.lang.String r3 = r14.type
            byte[] r3 = r3.getBytes()
            r3 = r3[r9]
            r0[r2] = r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.position(r1)
            long r1 = r14.getSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r0, r1)
            r14.writeVersionAndFlags(r0)
        L99:
            r0.rewind()
            return r0
    }

    @Override // com.coremedia.iso.boxes.FullBox
    public int getVersion() {
            r1 = this;
            int r0 = r1.version
            return r0
    }

    @Override // com.googlecode.mp4parser.AbstractContainerBox, com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r2, java.nio.ByteBuffer r3, long r4, com.coremedia.iso.BoxParser r6) throws java.io.IOException {
            r1 = this;
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r2.read(r0)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.parseVersionAndFlags(r0)
            super.parse(r2, r3, r4, r6)
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

    @Override // com.googlecode.mp4parser.BasicContainer
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            java.lang.String r1 = "[childBoxes]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
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
