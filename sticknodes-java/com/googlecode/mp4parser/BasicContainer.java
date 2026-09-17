package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public class BasicContainer implements com.coremedia.iso.boxes.Container, java.util.Iterator<com.coremedia.iso.boxes.Box>, java.io.Closeable {
    private static final com.coremedia.iso.boxes.Box EOF = null;
    private static com.googlecode.mp4parser.util.Logger LOG;
    protected com.coremedia.iso.BoxParser boxParser;
    private java.util.List<com.coremedia.iso.boxes.Box> boxes;
    protected com.googlecode.mp4parser.DataSource dataSource;
    long endPosition;
    com.coremedia.iso.boxes.Box lookahead;
    long parsePosition;
    long startPosition;


    static {
            com.googlecode.mp4parser.BasicContainer$1 r0 = new com.googlecode.mp4parser.BasicContainer$1
            java.lang.String r1 = "eof "
            r0.<init>(r1)
            com.googlecode.mp4parser.BasicContainer.EOF = r0
            java.lang.Class<com.googlecode.mp4parser.BasicContainer> r0 = com.googlecode.mp4parser.BasicContainer.class
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.Logger.getLogger(r0)
            com.googlecode.mp4parser.BasicContainer.LOG = r0
            return
    }

    public BasicContainer() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.lookahead = r0
            r0 = 0
            r2.parsePosition = r0
            r2.startPosition = r0
            r2.endPosition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.boxes = r0
            return
    }

    public void addBox(com.coremedia.iso.boxes.Box r3) {
            r2 = this;
            if (r3 == 0) goto L15
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r2.getBoxes()
            r0.<init>(r1)
            r2.boxes = r0
            r3.setParent(r2)
            java.util.List<com.coremedia.iso.boxes.Box> r0 = r2.boxes
            r0.add(r3)
        L15:
            return
    }

    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource
            r0.close()
            return
    }

    @Override // com.coremedia.iso.boxes.Container
    public java.util.List<com.coremedia.iso.boxes.Box> getBoxes() {
            r2 = this;
            com.googlecode.mp4parser.DataSource r0 = r2.dataSource
            if (r0 == 0) goto L12
            com.coremedia.iso.boxes.Box r0 = r2.lookahead
            com.coremedia.iso.boxes.Box r1 = com.googlecode.mp4parser.BasicContainer.EOF
            if (r0 == r1) goto L12
            com.googlecode.mp4parser.util.LazyList r0 = new com.googlecode.mp4parser.util.LazyList
            java.util.List<com.coremedia.iso.boxes.Box> r1 = r2.boxes
            r0.<init>(r1, r2)
            return r0
        L12:
            java.util.List<com.coremedia.iso.boxes.Box> r0 = r2.boxes
            return r0
    }

    @Override // com.coremedia.iso.boxes.Container
    public <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getBoxes(java.lang.Class<T> r7) {
            r6 = this;
            java.util.List r0 = r6.getBoxes()
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = 0
        L8:
            int r4 = r0.size()
            if (r3 < r4) goto L1d
            if (r1 == 0) goto L11
            return r1
        L11:
            if (r2 == 0) goto L18
            java.util.List r7 = java.util.Collections.singletonList(r2)
            return r7
        L18:
            java.util.List r7 = java.util.Collections.emptyList()
            return r7
        L1d:
            java.lang.Object r4 = r0.get(r3)
            com.coremedia.iso.boxes.Box r4 = (com.coremedia.iso.boxes.Box) r4
            boolean r5 = r7.isInstance(r4)
            if (r5 == 0) goto L3b
            if (r2 != 0) goto L2d
            r2 = r4
            goto L3b
        L2d:
            if (r1 != 0) goto L38
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 2
            r1.<init>(r5)
            r1.add(r2)
        L38:
            r1.add(r4)
        L3b:
            int r3 = r3 + 1
            goto L8
    }

    @Override // com.coremedia.iso.boxes.Container
    public <T extends com.coremedia.iso.boxes.Box> java.util.List<T> getBoxes(java.lang.Class<T> r6, boolean r7) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.List r1 = r5.getBoxes()
            r2 = 0
        Lb:
            int r3 = r1.size()
            if (r2 < r3) goto L12
            return r0
        L12:
            java.lang.Object r3 = r1.get(r2)
            com.coremedia.iso.boxes.Box r3 = (com.coremedia.iso.boxes.Box) r3
            boolean r4 = r6.isInstance(r3)
            if (r4 == 0) goto L21
            r0.add(r3)
        L21:
            if (r7 == 0) goto L30
            boolean r4 = r3 instanceof com.coremedia.iso.boxes.Container
            if (r4 == 0) goto L30
            com.coremedia.iso.boxes.Container r3 = (com.coremedia.iso.boxes.Container) r3
            java.util.List r3 = r3.getBoxes(r6, r7)
            r0.addAll(r3)
        L30:
            int r2 = r2 + 1
            goto Lb
    }

    @Override // com.coremedia.iso.boxes.Container
    public java.nio.ByteBuffer getByteBuffer(long r16, long r18) throws java.io.IOException {
            r15 = this;
            r1 = r15
            r2 = r18
            com.googlecode.mp4parser.DataSource r4 = r1.dataSource
            if (r4 == 0) goto L17
            monitor-enter(r4)
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource     // Catch: java.lang.Throwable -> L14
            long r5 = r1.startPosition     // Catch: java.lang.Throwable -> L14
            long r5 = r5 + r16
            java.nio.ByteBuffer r0 = r0.map(r5, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        L17:
            int r0 = com.googlecode.mp4parser.util.CastUtils.l2i(r18)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            long r2 = r16 + r2
            r4 = 0
            java.util.List<com.coremedia.iso.boxes.Box> r6 = r1.boxes
            java.util.Iterator r6 = r6.iterator()
        L29:
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L36
            java.nio.Buffer r0 = r0.rewind()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
        L36:
            java.lang.Object r7 = r6.next()
            com.coremedia.iso.boxes.Box r7 = (com.coremedia.iso.boxes.Box) r7
            long r8 = r7.getSize()
            long r8 = r8 + r4
            int r10 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r10 <= 0) goto Lbe
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 >= 0) goto Lbe
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            java.nio.channels.WritableByteChannel r11 = java.nio.channels.Channels.newChannel(r10)
            r7.getBox(r11)
            r11.close()
            int r11 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r11 < 0) goto L68
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 > 0) goto L68
            byte[] r4 = r10.toByteArray()
            r0.put(r4)
            goto Lbe
        L68:
            if (r11 >= 0) goto L88
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 <= 0) goto L88
            long r11 = r7.getSize()
            long r4 = r16 - r4
            long r11 = r11 - r4
            long r13 = r8 - r2
            long r11 = r11 - r13
            int r7 = com.googlecode.mp4parser.util.CastUtils.l2i(r11)
            byte[] r10 = r10.toByteArray()
            int r4 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            r0.put(r10, r4, r7)
            goto Lbe
        L88:
            if (r11 >= 0) goto La5
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 > 0) goto La5
            long r11 = r7.getSize()
            long r4 = r16 - r4
            long r11 = r11 - r4
            int r7 = com.googlecode.mp4parser.util.CastUtils.l2i(r11)
            byte[] r10 = r10.toByteArray()
            int r4 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            r0.put(r10, r4, r7)
            goto Lbe
        La5:
            if (r11 < 0) goto Lbe
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lbe
            long r4 = r7.getSize()
            long r11 = r8 - r2
            long r4 = r4 - r11
            int r4 = com.googlecode.mp4parser.util.CastUtils.l2i(r4)
            byte[] r5 = r10.toByteArray()
            r7 = 0
            r0.put(r5, r7, r4)
        Lbe:
            r4 = r8
            goto L29
    }

    protected long getContainerSize() {
            r5 = this;
            r0 = 0
            r2 = 0
        L3:
            java.util.List r3 = r5.getBoxes()
            int r3 = r3.size()
            if (r2 < r3) goto Le
            return r0
        Le:
            java.util.List<com.coremedia.iso.boxes.Box> r3 = r5.boxes
            java.lang.Object r3 = r3.get(r2)
            com.coremedia.iso.boxes.Box r3 = (com.coremedia.iso.boxes.Box) r3
            long r3 = r3.getSize()
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r3 = this;
            com.coremedia.iso.boxes.Box r0 = r3.lookahead
            com.coremedia.iso.boxes.Box r1 = com.googlecode.mp4parser.BasicContainer.EOF
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            r1 = 1
            if (r0 == 0) goto Lc
            return r1
        Lc:
            com.coremedia.iso.boxes.Box r0 = r3.next()     // Catch: java.util.NoSuchElementException -> L13
            r3.lookahead = r0     // Catch: java.util.NoSuchElementException -> L13
            return r1
        L13:
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.BasicContainer.EOF
            r3.lookahead = r0
            return r2
    }

    public void initContainer(com.googlecode.mp4parser.DataSource r3, long r4, com.coremedia.iso.BoxParser r6) throws java.io.IOException {
            r2 = this;
            r2.dataSource = r3
            long r0 = r3.position()
            r2.startPosition = r0
            r2.parsePosition = r0
            long r0 = r3.position()
            long r0 = r0 + r4
            r3.position(r0)
            long r3 = r3.position()
            r2.endPosition = r3
            r2.boxParser = r6
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public com.coremedia.iso.boxes.Box next() {
            r6 = this;
            com.coremedia.iso.boxes.Box r0 = r6.lookahead
            if (r0 == 0) goto Lc
            com.coremedia.iso.boxes.Box r1 = com.googlecode.mp4parser.BasicContainer.EOF
            if (r0 == r1) goto Lc
            r1 = 0
            r6.lookahead = r1
            return r0
        Lc:
            com.googlecode.mp4parser.DataSource r0 = r6.dataSource
            if (r0 == 0) goto L41
            long r1 = r6.parsePosition
            long r3 = r6.endPosition
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L41
            monitor-enter(r0)     // Catch: java.io.IOException -> L35 java.io.EOFException -> L3b
            com.googlecode.mp4parser.DataSource r1 = r6.dataSource     // Catch: java.lang.Throwable -> L32
            long r2 = r6.parsePosition     // Catch: java.lang.Throwable -> L32
            r1.position(r2)     // Catch: java.lang.Throwable -> L32
            com.coremedia.iso.BoxParser r1 = r6.boxParser     // Catch: java.lang.Throwable -> L32
            com.googlecode.mp4parser.DataSource r2 = r6.dataSource     // Catch: java.lang.Throwable -> L32
            com.coremedia.iso.boxes.Box r1 = r1.parseBox(r2, r6)     // Catch: java.lang.Throwable -> L32
            com.googlecode.mp4parser.DataSource r2 = r6.dataSource     // Catch: java.lang.Throwable -> L32
            long r2 = r2.position()     // Catch: java.lang.Throwable -> L32
            r6.parsePosition = r2     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r1
        L32:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1     // Catch: java.io.IOException -> L35 java.io.EOFException -> L3b
        L35:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L3b:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L41:
            com.coremedia.iso.boxes.Box r0 = com.googlecode.mp4parser.BasicContainer.EOF
            r6.lookahead = r0
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ com.coremedia.iso.boxes.Box next() {
            r1 = this;
            com.coremedia.iso.boxes.Box r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.coremedia.iso.boxes.Container
    public void setBoxes(java.util.List<com.coremedia.iso.boxes.Box> r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.boxes = r0
            com.coremedia.iso.boxes.Box r2 = com.googlecode.mp4parser.BasicContainer.EOF
            r1.lookahead = r2
            r2 = 0
            r1.dataSource = r2
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        L16:
            java.util.List<com.coremedia.iso.boxes.Box> r2 = r3.boxes
            int r2 = r2.size()
            if (r1 < r2) goto L28
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L28:
            if (r1 <= 0) goto L2f
            java.lang.String r2 = ";"
            r0.append(r2)
        L2f:
            java.util.List<com.coremedia.iso.boxes.Box> r2 = r3.boxes
            java.lang.Object r2 = r2.get(r1)
            com.coremedia.iso.boxes.Box r2 = (com.coremedia.iso.boxes.Box) r2
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto L16
    }

    @Override // com.coremedia.iso.boxes.Container
    public final void writeContainer(java.nio.channels.WritableByteChannel r3) throws java.io.IOException {
            r2 = this;
            java.util.List r0 = r2.getBoxes()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Lf
            return
        Lf:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            r1.getBox(r3)
            goto L8
    }
}
