package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public class AbstractContainerBox extends com.googlecode.mp4parser.BasicContainer implements com.coremedia.iso.boxes.Box {
    protected boolean largeBox;
    private long offset;
    com.coremedia.iso.boxes.Container parent;
    protected java.lang.String type;

    public AbstractContainerBox(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    public void getBox(java.nio.channels.WritableByteChannel r2) throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.getHeader()
            r2.write(r0)
            r1.writeContainer(r2)
            return
    }

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
            if (r0 != 0) goto L52
            long r10 = r14.getSize()
            r12 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L1c
            goto L52
        L1c:
            byte[] r0 = new byte[r1]
            java.lang.String r1 = r14.type
            byte[] r1 = r1.getBytes()
            r1 = r1[r6]
            r0[r7] = r1
            java.lang.String r1 = r14.type
            byte[] r1 = r1.getBytes()
            r1 = r1[r8]
            r0[r5] = r1
            java.lang.String r1 = r14.type
            byte[] r1 = r1.getBytes()
            r1 = r1[r3]
            r0[r4] = r1
            java.lang.String r1 = r14.type
            byte[] r1 = r1.getBytes()
            r1 = r1[r9]
            r0[r2] = r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            long r1 = r14.getSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r0, r1)
            goto L8e
        L52:
            r0 = 16
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
        L8e:
            r0.rewind()
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getOffset() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public com.coremedia.iso.boxes.Container getParent() {
            r1 = this;
            com.coremedia.iso.boxes.Container r0 = r1.parent
            return r0
    }

    public long getSize() {
            r7 = this;
            long r0 = r7.getContainerSize()
            boolean r2 = r7.largeBox
            if (r2 != 0) goto L18
            r2 = 8
            long r2 = r2 + r0
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L15
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

    @Override // com.coremedia.iso.boxes.Box
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void initContainer(com.googlecode.mp4parser.DataSource r8, long r9, com.coremedia.iso.BoxParser r11) throws java.io.IOException {
            r7 = this;
            r7.dataSource = r8
            long r0 = r8.position()
            r7.parsePosition = r0
            boolean r2 = r7.largeBox
            if (r2 != 0) goto L1c
            r2 = 8
            long r2 = r2 + r9
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L19
            goto L1c
        L19:
            r2 = 8
            goto L1e
        L1c:
            r2 = 16
        L1e:
            long r2 = (long) r2
            long r0 = r0 - r2
            r7.startPosition = r0
            long r0 = r8.position()
            long r0 = r0 + r9
            r8.position(r0)
            long r8 = r8.position()
            r7.endPosition = r8
            r7.boxParser = r11
            return
    }

    public void parse(com.googlecode.mp4parser.DataSource r5, java.nio.ByteBuffer r6, long r7, com.coremedia.iso.BoxParser r9) throws java.io.IOException {
            r4 = this;
            long r0 = r5.position()
            int r2 = r6.remaining()
            long r2 = (long) r2
            long r0 = r0 - r2
            r4.offset = r0
            int r6 = r6.remaining()
            r0 = 16
            if (r6 != r0) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            r4.largeBox = r6
            r4.initContainer(r5, r7, r9)
            return
    }

    @Override // com.coremedia.iso.boxes.Box
    public void setParent(com.coremedia.iso.boxes.Container r1) {
            r0 = this;
            r0.parent = r1
            return
    }
}
