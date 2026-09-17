package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class FreeBox implements com.coremedia.iso.boxes.Box {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final java.lang.String TYPE = "free";
    java.nio.ByteBuffer data;
    private long offset;
    private com.coremedia.iso.boxes.Container parent;
    java.util.List<com.coremedia.iso.boxes.Box> replacers;

    static {
            return
    }

    public FreeBox() {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.replacers = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r1.data = r0
            return
    }

    public FreeBox(int r2) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.replacers = r0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.data = r2
            return
    }

    public void addAndReplace(com.coremedia.iso.boxes.Box r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.data
            long r1 = r4.getSize()
            int r1 = com.googlecode.mp4parser.util.CastUtils.l2i(r1)
            r0.position(r1)
            java.nio.ByteBuffer r0 = r3.data
            java.nio.ByteBuffer r0 = r0.slice()
            r3.data = r0
            java.util.List<com.coremedia.iso.boxes.Box> r0 = r3.replacers
            r0.add(r4)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L31
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L31
        L12:
            com.coremedia.iso.boxes.FreeBox r5 = (com.coremedia.iso.boxes.FreeBox) r5
            java.nio.ByteBuffer r2 = r4.getData()
            if (r2 == 0) goto L29
            java.nio.ByteBuffer r2 = r4.getData()
            java.nio.ByteBuffer r5 = r5.getData()
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L30
            goto L2f
        L29:
            java.nio.ByteBuffer r5 = r5.getData()
            if (r5 == 0) goto L30
        L2f:
            return r1
        L30:
            return r0
        L31:
            return r1
    }

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r5) throws java.io.IOException {
            r4 = this;
            java.util.List<com.coremedia.iso.boxes.Box> r0 = r4.replacers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L3f
            r0 = 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r2 = r4.data
            int r2 = r2.limit()
            int r2 = r2 + r0
            long r2 = (long) r2
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r1, r2)
            java.lang.String r0 = "free"
            byte[] r0 = r0.getBytes()
            r1.put(r0)
            r1.rewind()
            r5.write(r1)
            r1.rewind()
            java.nio.ByteBuffer r0 = r4.data
            r0.rewind()
            java.nio.ByteBuffer r0 = r4.data
            r5.write(r0)
            java.nio.ByteBuffer r5 = r4.data
            r5.rewind()
            return
        L3f:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            r1.getBox(r5)
            goto L6
    }

    public java.nio.ByteBuffer getData() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            if (r0 == 0) goto Lf
            java.nio.ByteBuffer r0 = r0.duplicate()
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
        Lf:
            r0 = 0
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

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
            r5 = this;
            java.util.List<com.coremedia.iso.boxes.Box> r0 = r5.replacers
            java.util.Iterator r0 = r0.iterator()
            r1 = 8
        L8:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L17
            java.nio.ByteBuffer r0 = r5.data
            int r0 = r0.limit()
            long r3 = (long) r0
            long r1 = r1 + r3
            return r1
        L17:
            java.lang.Object r3 = r0.next()
            com.coremedia.iso.boxes.Box r3 = (com.coremedia.iso.boxes.Box) r3
            long r3 = r3.getSize()
            long r1 = r1 + r3
            goto L8
    }

    @Override // com.coremedia.iso.boxes.Box
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "free"
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.data
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public void parse(com.googlecode.mp4parser.DataSource r5, java.nio.ByteBuffer r6, long r7, com.coremedia.iso.BoxParser r9) throws java.io.IOException {
            r4 = this;
            long r0 = r5.position()
            int r6 = r6.remaining()
            long r2 = (long) r6
            long r0 = r0 - r2
            r4.offset = r0
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 <= 0) goto L26
            long r0 = r5.position()
            java.nio.ByteBuffer r6 = r5.map(r0, r7)
            r4.data = r6
            long r0 = r5.position()
            long r0 = r0 + r7
            r5.position(r0)
            goto L33
        L26:
            int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r7)
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)
            r4.data = r6
            r5.read(r6)
        L33:
            return
    }

    public void setData(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.data = r1
            return
    }

    @Override // com.coremedia.iso.boxes.Box
    public void setParent(com.coremedia.iso.boxes.Container r1) {
            r0 = this;
            r0.parent = r1
            return
    }
}
