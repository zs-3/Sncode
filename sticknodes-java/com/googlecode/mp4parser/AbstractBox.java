package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public abstract class AbstractBox implements com.coremedia.iso.boxes.Box {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static com.googlecode.mp4parser.util.Logger LOG;
    private java.nio.ByteBuffer content;
    com.googlecode.mp4parser.DataSource dataSource;
    private java.nio.ByteBuffer deadBytes;
    boolean isParsed;
    long offset;
    private com.coremedia.iso.boxes.Container parent;
    protected java.lang.String type;
    private byte[] userType;

    static {
            java.lang.Class<com.googlecode.mp4parser.AbstractBox> r0 = com.googlecode.mp4parser.AbstractBox.class
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.Logger.getLogger(r0)
            com.googlecode.mp4parser.AbstractBox.LOG = r0
            return
    }

    protected AbstractBox(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.deadBytes = r0
            r1.type = r2
            r2 = 1
            r1.isParsed = r2
            return
    }

    protected AbstractBox(java.lang.String r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.deadBytes = r0
            r1.type = r2
            r1.userType = r3
            r2 = 1
            r1.isParsed = r2
            return
    }

    private void getHeader(java.nio.ByteBuffer r3) {
            r2 = this;
            boolean r0 = r2.isSmallBox()
            if (r0 == 0) goto L19
            long r0 = r2.getSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            java.lang.String r0 = r2.getType()
            byte[] r0 = com.coremedia.iso.IsoFile.fourCCtoBytes(r0)
            r3.put(r0)
            goto L30
        L19:
            r0 = 1
            com.coremedia.iso.IsoTypeWriter.writeUInt32(r3, r0)
            java.lang.String r0 = r2.getType()
            byte[] r0 = com.coremedia.iso.IsoFile.fourCCtoBytes(r0)
            r3.put(r0)
            long r0 = r2.getSize()
            com.coremedia.iso.IsoTypeWriter.writeUInt64(r3, r0)
        L30:
            java.lang.String r0 = r2.getType()
            java.lang.String r1 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L43
            byte[] r0 = r2.getUserType()
            r3.put(r0)
        L43:
            return
    }

    private boolean isSmallBox() {
            r10 = this;
            java.lang.String r0 = r10.getType()
            java.lang.String r1 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lf
            r0 = 24
            goto L11
        Lf:
            r0 = 8
        L11:
            boolean r1 = r10.isParsed
            r2 = 1
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r5 = 0
            if (r1 == 0) goto L34
            long r6 = r10.getContentSize()
            java.nio.ByteBuffer r1 = r10.deadBytes
            if (r1 == 0) goto L29
            int r1 = r1.limit()
            goto L2a
        L29:
            r1 = 0
        L2a:
            long r8 = (long) r1
            long r6 = r6 + r8
            long r0 = (long) r0
            long r6 = r6 + r0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L33
            return r2
        L33:
            return r5
        L34:
            java.nio.ByteBuffer r1 = r10.content
            int r1 = r1.limit()
            int r1 = r1 + r0
            long r0 = (long) r1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L41
            return r2
        L41:
            return r5
    }

    private boolean verify(java.nio.ByteBuffer r11) {
            r10 = this;
            long r0 = r10.getContentSize()
            java.nio.ByteBuffer r2 = r10.deadBytes
            r3 = 0
            if (r2 == 0) goto Le
            int r2 = r2.limit()
            goto Lf
        Le:
            r2 = 0
        Lf:
            long r4 = (long) r2
            long r0 = r0 + r4
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r10.getContent(r0)
            java.nio.ByteBuffer r1 = r10.deadBytes
            if (r1 == 0) goto L32
            r1.rewind()
        L23:
            java.nio.ByteBuffer r1 = r10.deadBytes
            int r1 = r1.remaining()
            if (r1 > 0) goto L2c
            goto L32
        L2c:
            java.nio.ByteBuffer r1 = r10.deadBytes
            r0.put(r1)
            goto L23
        L32:
            r11.rewind()
            r0.rewind()
            int r1 = r11.remaining()
            int r2 = r0.remaining()
            if (r1 == r2) goto L9b
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = r10.getType()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.<init>(r4)
            java.lang.String r4 = ": remaining differs "
            r2.append(r4)
            int r5 = r11.remaining()
            r2.append(r5)
            java.lang.String r5 = " vs. "
            r2.append(r5)
            int r6 = r0.remaining()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.print(r2)
            com.googlecode.mp4parser.util.Logger r1 = com.googlecode.mp4parser.AbstractBox.LOG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = r10.getType()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2.<init>(r6)
            r2.append(r4)
            int r11 = r11.remaining()
            r2.append(r11)
            r2.append(r5)
            int r11 = r0.remaining()
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r1.logError(r11)
            return r3
        L9b:
            int r1 = r11.position()
            int r2 = r11.limit()
            r4 = 1
            int r2 = r2 - r4
            int r5 = r0.limit()
            int r5 = r5 - r4
        Laa:
            if (r2 >= r1) goto Lad
            return r4
        Lad:
            byte r6 = r11.get(r2)
            byte r7 = r0.get(r5)
            if (r6 == r7) goto L120
            com.googlecode.mp4parser.util.Logger r1 = com.googlecode.mp4parser.AbstractBox.LOG
            r5 = 4
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r9 = r10.getType()
            r8[r3] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r4] = r2
            r2 = 2
            java.lang.Byte r4 = java.lang.Byte.valueOf(r6)
            r8[r2] = r4
            r2 = 3
            java.lang.Byte r4 = java.lang.Byte.valueOf(r7)
            r8[r2] = r4
            java.lang.String r2 = "%s: buffers differ at %d: %2X/%2X"
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r1.logError(r2)
            int r1 = r11.remaining()
            byte[] r1 = new byte[r1]
            int r2 = r0.remaining()
            byte[] r2 = new byte[r2]
            r11.get(r1)
            r0.get(r2)
            java.io.PrintStream r11 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "original      : "
            r0.<init>(r4)
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r1, r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.println(r0)
            java.io.PrintStream r11 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "reconstructed : "
            r0.<init>(r1)
            java.lang.String r1 = com.coremedia.iso.Hex.encodeHex(r2, r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.println(r0)
            return r3
        L120:
            int r2 = r2 + (-1)
            int r5 = r5 + (-1)
            goto Laa
    }

    protected abstract void _parseDetails(java.nio.ByteBuffer r1);

    @Override // com.coremedia.iso.boxes.Box
    public void getBox(java.nio.channels.WritableByteChannel r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.isParsed
            if (r0 == 0) goto L36
            long r0 = r4.getSize()
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.getHeader(r0)
            r4.getContent(r0)
            java.nio.ByteBuffer r1 = r4.deadBytes
            if (r1 == 0) goto L2c
            r1.rewind()
        L1d:
            java.nio.ByteBuffer r1 = r4.deadBytes
            int r1 = r1.remaining()
            if (r1 > 0) goto L26
            goto L2c
        L26:
            java.nio.ByteBuffer r1 = r4.deadBytes
            r0.put(r1)
            goto L1d
        L2c:
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r5.write(r0)
            goto L6e
        L36:
            boolean r0 = r4.isSmallBox()
            r1 = 16
            if (r0 == 0) goto L41
            r0 = 8
            goto L43
        L41:
            r0 = 16
        L43:
            java.lang.String r2 = r4.getType()
            java.lang.String r3 = "uuid"
            boolean r2 = r3.equals(r2)
            r3 = 0
            if (r2 == 0) goto L51
            goto L52
        L51:
            r1 = 0
        L52:
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.getHeader(r0)
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r5.write(r0)
            java.nio.ByteBuffer r0 = r4.content
            java.nio.Buffer r0 = r0.position(r3)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r5.write(r0)
        L6e:
            return
    }

    protected abstract void getContent(java.nio.ByteBuffer r1);

    protected abstract long getContentSize();

    @Override // com.coremedia.iso.boxes.Box
    public long getOffset() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public com.coremedia.iso.boxes.Container getParent() {
            r1 = this;
            com.coremedia.iso.boxes.Container r0 = r1.parent
            return r0
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = com.googlecode.mp4parser.util.Path.createPath(r1)
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    public long getSize() {
            r7 = this;
            boolean r0 = r7.isParsed
            r1 = 0
            if (r0 == 0) goto La
            long r2 = r7.getContentSize()
            goto L15
        La:
            java.nio.ByteBuffer r0 = r7.content
            if (r0 == 0) goto L13
            int r0 = r0.limit()
            goto L14
        L13:
            r0 = 0
        L14:
            long r2 = (long) r0
        L15:
            r4 = 4294967288(0xfffffff8, double:2.121995787E-314)
            r0 = 8
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L23
            r4 = 8
            goto L24
        L23:
            r4 = 0
        L24:
            int r4 = r4 + r0
            java.lang.String r0 = r7.getType()
            java.lang.String r5 = "uuid"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L34
            r0 = 16
            goto L35
        L34:
            r0 = 0
        L35:
            int r4 = r4 + r0
            long r4 = (long) r4
            long r2 = r2 + r4
            java.nio.ByteBuffer r0 = r7.deadBytes
            if (r0 != 0) goto L3d
            goto L41
        L3d:
            int r1 = r0.limit()
        L41:
            long r0 = (long) r1
            long r2 = r2 + r0
            return r2
    }

    @Override // com.coremedia.iso.boxes.Box
    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public byte[] getUserType() {
            r1 = this;
            byte[] r0 = r1.userType
            return r0
    }

    public boolean isParsed() {
            r1 = this;
            boolean r0 = r1.isParsed
            return r0
    }

    @Override // com.coremedia.iso.boxes.Box
    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public void parse(com.googlecode.mp4parser.DataSource r5, java.nio.ByteBuffer r6, long r7, com.coremedia.iso.BoxParser r9) throws java.io.IOException {
            r4 = this;
            long r0 = r5.position()
            int r6 = r6.remaining()
            long r2 = (long) r6
            long r0 = r0 - r2
            r4.offset = r0
            r4.dataSource = r5
            int r6 = com.googlecode.mp4parser.util.CastUtils.l2i(r7)
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)
            r4.content = r6
        L18:
            java.nio.ByteBuffer r6 = r4.content
            int r6 = r6.remaining()
            if (r6 > 0) goto L29
            java.nio.ByteBuffer r5 = r4.content
            r6 = 0
            r5.position(r6)
            r4.isParsed = r6
            return
        L29:
            java.nio.ByteBuffer r6 = r4.content
            r5.read(r6)
            goto L18
    }

    public final synchronized void parseDetails() {
            r3 = this;
            monitor-enter(r3)
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.AbstractBox.LOG     // Catch: java.lang.Throwable -> L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "parsing details of "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = r3.getType()     // Catch: java.lang.Throwable -> L36
            r1.append(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L36
            r0.logDebug(r1)     // Catch: java.lang.Throwable -> L36
            java.nio.ByteBuffer r0 = r3.content     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L34
            r1 = 1
            r3.isParsed = r1     // Catch: java.lang.Throwable -> L36
            r0.rewind()     // Catch: java.lang.Throwable -> L36
            r3._parseDetails(r0)     // Catch: java.lang.Throwable -> L36
            int r1 = r0.remaining()     // Catch: java.lang.Throwable -> L36
            if (r1 <= 0) goto L31
            java.nio.ByteBuffer r0 = r0.slice()     // Catch: java.lang.Throwable -> L36
            r3.deadBytes = r0     // Catch: java.lang.Throwable -> L36
        L31:
            r0 = 0
            r3.content = r0     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r3)
            return
        L36:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    @Override // com.coremedia.iso.boxes.Box
    @com.googlecode.mp4parser.annotations.DoNotParseDetail
    public void setParent(com.coremedia.iso.boxes.Container r1) {
            r0 = this;
            r0.parent = r1
            return
    }
}
