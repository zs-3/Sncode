package com.coremedia.iso.boxes.mdat;

/* loaded from: classes.dex */
public final class MediaDataBox implements com.coremedia.iso.boxes.Box {
    public static final java.lang.String TYPE = "mdat";
    private com.googlecode.mp4parser.DataSource dataSource;
    private long offset;
    com.coremedia.iso.boxes.Container parent;
    private long size;

    public MediaDataBox() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void transfer(com.googlecode.mp4parser.DataSource r9, long r10, long r12, java.nio.channels.WritableByteChannel r14) throws java.io.IOException {
            r0 = 0
        L2:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L7
            return
        L7:
            long r4 = r10 + r0
            long r2 = r12 - r0
            r6 = 67076096(0x3ff8000, double:3.31399947E-316)
            long r6 = java.lang.Math.min(r6, r2)
            r3 = r9
            r8 = r14
            long r2 = r3.transferTo(r4, r6, r8)
            long r0 = r0 + r2
            goto L2
    }

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r7) throws java.io.IOException {
            r6 = this;
            com.googlecode.mp4parser.DataSource r0 = r6.dataSource
            long r1 = r6.offset
            long r3 = r6.size
            r5 = r7
            transfer(r0, r1, r3, r5)
            return
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

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "mdat"
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r5, java.nio.ByteBuffer r6, long r7, com.coremedia.iso.BoxParser r9) throws java.io.IOException {
            r4 = this;
            long r0 = r5.position()
            int r9 = r6.remaining()
            long r2 = (long) r9
            long r0 = r0 - r2
            r4.offset = r0
            r4.dataSource = r5
            int r6 = r6.remaining()
            long r0 = (long) r6
            long r0 = r0 + r7
            r4.size = r0
            long r0 = r5.position()
            long r0 = r0 + r7
            r5.position(r0)
            return
    }

    @Override // com.coremedia.iso.boxes.Box
    public void setParent(com.coremedia.iso.boxes.Container r1) {
            r0 = this;
            r0.parent = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MediaDataBox{size="
            r0.<init>(r1)
            long r1 = r3.size
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
