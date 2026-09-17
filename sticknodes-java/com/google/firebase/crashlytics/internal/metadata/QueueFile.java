package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
class QueueFile implements java.io.Closeable {
    private static final java.util.logging.Logger LOGGER = null;
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private com.google.firebase.crashlytics.internal.metadata.QueueFile.Element first;
    private com.google.firebase.crashlytics.internal.metadata.QueueFile.Element last;
    private final java.io.RandomAccessFile raf;


    static class Element {
        static final com.google.firebase.crashlytics.internal.metadata.QueueFile.Element NULL = null;
        final int length;
        final int position;

        static {
                com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = new com.google.firebase.crashlytics.internal.metadata.QueueFile$Element
                r1 = 0
                r0.<init>(r1, r1)
                com.google.firebase.crashlytics.internal.metadata.QueueFile.Element.NULL = r0
                return
        }

        Element(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.position = r1
                r0.length = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = "[position = "
                r0.append(r1)
                int r1 = r2.position
                r0.append(r1)
                java.lang.String r1 = ", length = "
                r0.append(r1)
                int r1 = r2.length
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private final class ElementInputStream extends java.io.InputStream {
        private int position;
        private int remaining;
        final /* synthetic */ com.google.firebase.crashlytics.internal.metadata.QueueFile this$0;

        private ElementInputStream(com.google.firebase.crashlytics.internal.metadata.QueueFile r2, com.google.firebase.crashlytics.internal.metadata.QueueFile.Element r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                int r0 = r3.position
                int r0 = r0 + 4
                int r2 = com.google.firebase.crashlytics.internal.metadata.QueueFile.access$100(r2, r0)
                r1.position = r2
                int r2 = r3.length
                r1.remaining = r2
                return
        }

        /* synthetic */ ElementInputStream(com.google.firebase.crashlytics.internal.metadata.QueueFile r1, com.google.firebase.crashlytics.internal.metadata.QueueFile.Element r2, com.google.firebase.crashlytics.internal.metadata.QueueFile.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r3 = this;
                int r0 = r3.remaining
                if (r0 != 0) goto L6
                r0 = -1
                return r0
            L6:
                com.google.firebase.crashlytics.internal.metadata.QueueFile r0 = r3.this$0
                java.io.RandomAccessFile r0 = com.google.firebase.crashlytics.internal.metadata.QueueFile.access$400(r0)
                int r1 = r3.position
                long r1 = (long) r1
                r0.seek(r1)
                com.google.firebase.crashlytics.internal.metadata.QueueFile r0 = r3.this$0
                java.io.RandomAccessFile r0 = com.google.firebase.crashlytics.internal.metadata.QueueFile.access$400(r0)
                int r0 = r0.read()
                com.google.firebase.crashlytics.internal.metadata.QueueFile r1 = r3.this$0
                int r2 = r3.position
                int r2 = r2 + 1
                int r1 = com.google.firebase.crashlytics.internal.metadata.QueueFile.access$100(r1, r2)
                r3.position = r1
                int r1 = r3.remaining
                int r1 = r1 + (-1)
                r3.remaining = r1
                return r0
        }

        @Override // java.io.InputStream
        public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "buffer"
                com.google.firebase.crashlytics.internal.metadata.QueueFile.access$200(r3, r0)
                r0 = r4 | r5
                if (r0 < 0) goto L2e
                int r0 = r3.length
                int r0 = r0 - r4
                if (r5 > r0) goto L2e
                int r0 = r2.remaining
                if (r0 <= 0) goto L2c
                if (r5 <= r0) goto L14
                r5 = r0
            L14:
                com.google.firebase.crashlytics.internal.metadata.QueueFile r0 = r2.this$0
                int r1 = r2.position
                com.google.firebase.crashlytics.internal.metadata.QueueFile.access$300(r0, r1, r3, r4, r5)
                com.google.firebase.crashlytics.internal.metadata.QueueFile r3 = r2.this$0
                int r4 = r2.position
                int r4 = r4 + r5
                int r3 = com.google.firebase.crashlytics.internal.metadata.QueueFile.access$100(r3, r4)
                r2.position = r3
                int r3 = r2.remaining
                int r3 = r3 - r5
                r2.remaining = r3
                return r5
            L2c:
                r3 = -1
                return r3
            L2e:
                java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
                r3.<init>()
                throw r3
        }
    }

    public interface ElementReader {
        void read(java.io.InputStream r1, int r2) throws java.io.IOException;
    }

    static {
            java.lang.Class<com.google.firebase.crashlytics.internal.metadata.QueueFile> r0 = com.google.firebase.crashlytics.internal.metadata.QueueFile.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.firebase.crashlytics.internal.metadata.QueueFile.LOGGER = r0
            return
    }

    public QueueFile(java.io.File r2) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = 16
            byte[] r0 = new byte[r0]
            r1.buffer = r0
            boolean r0 = r2.exists()
            if (r0 != 0) goto L12
            initialize(r2)
        L12:
            java.io.RandomAccessFile r2 = open(r2)
            r1.raf = r2
            r1.readHeader()
            return
    }

    static /* synthetic */ int access$100(com.google.firebase.crashlytics.internal.metadata.QueueFile r0, int r1) {
            int r0 = r0.wrapPosition(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object access$200(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = nonNull(r0, r1)
            return r0
    }

    static /* synthetic */ void access$300(com.google.firebase.crashlytics.internal.metadata.QueueFile r0, int r1, byte[] r2, int r3, int r4) throws java.io.IOException {
            r0.ringRead(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ java.io.RandomAccessFile access$400(com.google.firebase.crashlytics.internal.metadata.QueueFile r0) {
            java.io.RandomAccessFile r0 = r0.raf
            return r0
    }

    private void expandIfNecessary(int r11) throws java.io.IOException {
            r10 = this;
            int r11 = r11 + 4
            int r0 = r10.remainingBytes()
            if (r0 < r11) goto L9
            return
        L9:
            int r1 = r10.fileLength
        Lb:
            int r0 = r0 + r1
            int r1 = r1 << 1
            if (r0 < r11) goto Lb
            r10.setLength(r1)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r11 = r10.last
            int r0 = r11.position
            int r0 = r0 + 4
            int r11 = r11.length
            int r0 = r0 + r11
            int r11 = r10.wrapPosition(r0)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r10.first
            int r0 = r0.position
            if (r11 >= r0) goto L4a
            java.io.RandomAccessFile r0 = r10.raf
            java.nio.channels.FileChannel r7 = r0.getChannel()
            int r0 = r10.fileLength
            long r2 = (long) r0
            r7.position(r2)
            int r11 = r11 + (-4)
            r3 = 16
            long r8 = (long) r11
            r2 = r7
            r5 = r8
            long r2 = r2.transferTo(r3, r5, r7)
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 != 0) goto L42
            goto L4a
        L42:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = "Copied insufficient number of bytes!"
            r11.<init>(r0)
            throw r11
        L4a:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r11 = r10.last
            int r11 = r11.position
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r10.first
            int r0 = r0.position
            if (r11 >= r0) goto L6a
            int r2 = r10.fileLength
            int r2 = r2 + r11
            int r2 = r2 + (-16)
            int r11 = r10.elementCount
            r10.writeHeader(r1, r11, r0, r2)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r11 = new com.google.firebase.crashlytics.internal.metadata.QueueFile$Element
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r10.last
            int r0 = r0.length
            r11.<init>(r2, r0)
            r10.last = r11
            goto L6f
        L6a:
            int r2 = r10.elementCount
            r10.writeHeader(r1, r2, r0, r11)
        L6f:
            r10.fileLength = r1
            return
    }

    private static void initialize(java.io.File r6) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.getPath()
            r1.append(r2)
            java.lang.String r2 = ".tmp"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.io.RandomAccessFile r1 = open(r0)
            r2 = 4096(0x1000, double:2.0237E-320)
            r1.setLength(r2)     // Catch: java.lang.Throwable -> L55
            r2 = 0
            r1.seek(r2)     // Catch: java.lang.Throwable -> L55
            r2 = 16
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L55
            r3 = 4
            int[] r3 = new int[r3]     // Catch: java.lang.Throwable -> L55
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L55
            r4 = 1
            r3[r4] = r5     // Catch: java.lang.Throwable -> L55
            r4 = 2
            r3[r4] = r5     // Catch: java.lang.Throwable -> L55
            r4 = 3
            r3[r4] = r5     // Catch: java.lang.Throwable -> L55
            writeInts(r2, r3)     // Catch: java.lang.Throwable -> L55
            r1.write(r2)     // Catch: java.lang.Throwable -> L55
            r1.close()
            boolean r6 = r0.renameTo(r6)
            if (r6 == 0) goto L4d
            return
        L4d:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Rename failed!"
            r6.<init>(r0)
            throw r6
        L55:
            r6 = move-exception
            r1.close()
            throw r6
    }

    private static <T> T nonNull(T r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    private static java.io.RandomAccessFile open(java.io.File r2) throws java.io.FileNotFoundException {
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rwd"
            r0.<init>(r2, r1)
            return r0
    }

    private com.google.firebase.crashlytics.internal.metadata.QueueFile.Element readElement(int r4) throws java.io.IOException {
            r3 = this;
            if (r4 != 0) goto L5
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r4 = com.google.firebase.crashlytics.internal.metadata.QueueFile.Element.NULL
            return r4
        L5:
            java.io.RandomAccessFile r0 = r3.raf
            long r1 = (long) r4
            r0.seek(r1)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = new com.google.firebase.crashlytics.internal.metadata.QueueFile$Element
            java.io.RandomAccessFile r1 = r3.raf
            int r1 = r1.readInt()
            r0.<init>(r4, r1)
            return r0
    }

    private void readHeader() throws java.io.IOException {
            r5 = this;
            java.io.RandomAccessFile r0 = r5.raf
            r1 = 0
            r0.seek(r1)
            java.io.RandomAccessFile r0 = r5.raf
            byte[] r1 = r5.buffer
            r0.readFully(r1)
            byte[] r0 = r5.buffer
            r1 = 0
            int r0 = readInt(r0, r1)
            r5.fileLength = r0
            long r0 = (long) r0
            java.io.RandomAccessFile r2 = r5.raf
            long r2 = r2.length()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L48
            byte[] r0 = r5.buffer
            r1 = 4
            int r0 = readInt(r0, r1)
            r5.elementCount = r0
            byte[] r0 = r5.buffer
            r1 = 8
            int r0 = readInt(r0, r1)
            byte[] r1 = r5.buffer
            r2 = 12
            int r1 = readInt(r1, r2)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r5.readElement(r0)
            r5.first = r0
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r5.readElement(r1)
            r5.last = r0
            return
        L48:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "File is truncated. Expected length: "
            r1.append(r2)
            int r2 = r5.fileLength
            r1.append(r2)
            java.lang.String r2 = ", Actual length: "
            r1.append(r2)
            java.io.RandomAccessFile r2 = r5.raf
            long r2 = r2.length()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static int readInt(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            int r0 = r0 + r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            int r0 = r0 + r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r2
            return r0
    }

    private int remainingBytes() {
            r2 = this;
            int r0 = r2.fileLength
            int r1 = r2.usedBytes()
            int r0 = r0 - r1
            return r0
    }

    private void ringRead(int r5, byte[] r6, int r7, int r8) throws java.io.IOException {
            r4 = this;
            int r5 = r4.wrapPosition(r5)
            int r0 = r5 + r8
            int r1 = r4.fileLength
            if (r0 > r1) goto L16
            java.io.RandomAccessFile r0 = r4.raf
            long r1 = (long) r5
            r0.seek(r1)
            java.io.RandomAccessFile r5 = r4.raf
            r5.readFully(r6, r7, r8)
            goto L30
        L16:
            int r1 = r1 - r5
            java.io.RandomAccessFile r0 = r4.raf
            long r2 = (long) r5
            r0.seek(r2)
            java.io.RandomAccessFile r5 = r4.raf
            r5.readFully(r6, r7, r1)
            java.io.RandomAccessFile r5 = r4.raf
            r2 = 16
            r5.seek(r2)
            java.io.RandomAccessFile r5 = r4.raf
            int r7 = r7 + r1
            int r8 = r8 - r1
            r5.readFully(r6, r7, r8)
        L30:
            return
    }

    private void ringWrite(int r5, byte[] r6, int r7, int r8) throws java.io.IOException {
            r4 = this;
            int r5 = r4.wrapPosition(r5)
            int r0 = r5 + r8
            int r1 = r4.fileLength
            if (r0 > r1) goto L16
            java.io.RandomAccessFile r0 = r4.raf
            long r1 = (long) r5
            r0.seek(r1)
            java.io.RandomAccessFile r5 = r4.raf
            r5.write(r6, r7, r8)
            goto L30
        L16:
            int r1 = r1 - r5
            java.io.RandomAccessFile r0 = r4.raf
            long r2 = (long) r5
            r0.seek(r2)
            java.io.RandomAccessFile r5 = r4.raf
            r5.write(r6, r7, r1)
            java.io.RandomAccessFile r5 = r4.raf
            r2 = 16
            r5.seek(r2)
            java.io.RandomAccessFile r5 = r4.raf
            int r7 = r7 + r1
            int r8 = r8 - r1
            r5.write(r6, r7, r8)
        L30:
            return
    }

    private void setLength(int r4) throws java.io.IOException {
            r3 = this;
            java.io.RandomAccessFile r0 = r3.raf
            long r1 = (long) r4
            r0.setLength(r1)
            java.io.RandomAccessFile r4 = r3.raf
            java.nio.channels.FileChannel r4 = r4.getChannel()
            r0 = 1
            r4.force(r0)
            return
    }

    private int wrapPosition(int r2) {
            r1 = this;
            int r0 = r1.fileLength
            if (r2 >= r0) goto L5
            goto L8
        L5:
            int r2 = r2 + 16
            int r2 = r2 - r0
        L8:
            return r2
    }

    private void writeHeader(int r4, int r5, int r6, int r7) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.buffer
            r1 = 4
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r4 = 2
            r1[r4] = r6
            r4 = 3
            r1[r4] = r7
            writeInts(r0, r1)
            java.io.RandomAccessFile r4 = r3.raf
            r5 = 0
            r4.seek(r5)
            java.io.RandomAccessFile r4 = r3.raf
            byte[] r5 = r3.buffer
            r4.write(r5)
            return
    }

    private static void writeInt(byte[] r2, int r3, int r4) {
            int r0 = r4 >> 24
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    private static void writeInts(byte[] r4, int... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L3:
            if (r1 >= r0) goto Lf
            r3 = r5[r1]
            writeInt(r4, r2, r3)
            int r2 = r2 + 4
            int r1 = r1 + 1
            goto L3
        Lf:
            return
    }

    public void add(byte[] r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.add(r3, r1, r0)
            return
    }

    public synchronized void add(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "buffer"
            nonNull(r7, r0)     // Catch: java.lang.Throwable -> L67
            r0 = r8 | r9
            if (r0 < 0) goto L61
            int r0 = r7.length     // Catch: java.lang.Throwable -> L67
            int r0 = r0 - r8
            if (r9 > r0) goto L61
            r6.expandIfNecessary(r9)     // Catch: java.lang.Throwable -> L67
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L67
            r1 = 4
            if (r0 == 0) goto L1b
            r2 = 16
            goto L27
        L1b:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r2 = r6.last     // Catch: java.lang.Throwable -> L67
            int r3 = r2.position     // Catch: java.lang.Throwable -> L67
            int r3 = r3 + r1
            int r2 = r2.length     // Catch: java.lang.Throwable -> L67
            int r3 = r3 + r2
            int r2 = r6.wrapPosition(r3)     // Catch: java.lang.Throwable -> L67
        L27:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r3 = new com.google.firebase.crashlytics.internal.metadata.QueueFile$Element     // Catch: java.lang.Throwable -> L67
            r3.<init>(r2, r9)     // Catch: java.lang.Throwable -> L67
            byte[] r2 = r6.buffer     // Catch: java.lang.Throwable -> L67
            r4 = 0
            writeInt(r2, r4, r9)     // Catch: java.lang.Throwable -> L67
            int r2 = r3.position     // Catch: java.lang.Throwable -> L67
            byte[] r5 = r6.buffer     // Catch: java.lang.Throwable -> L67
            r6.ringWrite(r2, r5, r4, r1)     // Catch: java.lang.Throwable -> L67
            int r2 = r3.position     // Catch: java.lang.Throwable -> L67
            int r2 = r2 + r1
            r6.ringWrite(r2, r7, r8, r9)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L44
            int r7 = r3.position     // Catch: java.lang.Throwable -> L67
            goto L48
        L44:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r7 = r6.first     // Catch: java.lang.Throwable -> L67
            int r7 = r7.position     // Catch: java.lang.Throwable -> L67
        L48:
            int r8 = r6.fileLength     // Catch: java.lang.Throwable -> L67
            int r9 = r6.elementCount     // Catch: java.lang.Throwable -> L67
            int r9 = r9 + 1
            int r1 = r3.position     // Catch: java.lang.Throwable -> L67
            r6.writeHeader(r8, r9, r7, r1)     // Catch: java.lang.Throwable -> L67
            r6.last = r3     // Catch: java.lang.Throwable -> L67
            int r7 = r6.elementCount     // Catch: java.lang.Throwable -> L67
            int r7 = r7 + 1
            r6.elementCount = r7     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L5f
            r6.first = r3     // Catch: java.lang.Throwable -> L67
        L5f:
            monitor-exit(r6)
            return
        L61:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L67
            r7.<init>()     // Catch: java.lang.Throwable -> L67
            throw r7     // Catch: java.lang.Throwable -> L67
        L67:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public synchronized void clear() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r1 = 4096(0x1000, float:5.74E-42)
            r2.writeHeader(r1, r0, r0, r0)     // Catch: java.lang.Throwable -> L1a
            r2.elementCount = r0     // Catch: java.lang.Throwable -> L1a
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = com.google.firebase.crashlytics.internal.metadata.QueueFile.Element.NULL     // Catch: java.lang.Throwable -> L1a
            r2.first = r0     // Catch: java.lang.Throwable -> L1a
            r2.last = r0     // Catch: java.lang.Throwable -> L1a
            int r0 = r2.fileLength     // Catch: java.lang.Throwable -> L1a
            if (r0 <= r1) goto L16
            r2.setLength(r1)     // Catch: java.lang.Throwable -> L1a
        L16:
            r2.fileLength = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return
        L1a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.raf     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void forEach(com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r4.first     // Catch: java.lang.Throwable -> L29
            int r0 = r0.position     // Catch: java.lang.Throwable -> L29
            r1 = 0
        L6:
            int r2 = r4.elementCount     // Catch: java.lang.Throwable -> L29
            if (r1 >= r2) goto L27
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r4.readElement(r0)     // Catch: java.lang.Throwable -> L29
            com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementInputStream r2 = new com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementInputStream     // Catch: java.lang.Throwable -> L29
            r3 = 0
            r2.<init>(r4, r0, r3)     // Catch: java.lang.Throwable -> L29
            int r3 = r0.length     // Catch: java.lang.Throwable -> L29
            r5.read(r2, r3)     // Catch: java.lang.Throwable -> L29
            int r2 = r0.position     // Catch: java.lang.Throwable -> L29
            int r2 = r2 + 4
            int r0 = r0.length     // Catch: java.lang.Throwable -> L29
            int r2 = r2 + r0
            int r0 = r4.wrapPosition(r2)     // Catch: java.lang.Throwable -> L29
            int r1 = r1 + 1
            goto L6
        L27:
            monitor-exit(r4)
            return
        L29:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized boolean isEmpty() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.elementCount     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized void remove() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L43
            int r0 = r6.elementCount     // Catch: java.lang.Throwable -> L49
            r1 = 1
            if (r0 != r1) goto L10
            r6.clear()     // Catch: java.lang.Throwable -> L49
            goto L41
        L10:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r6.first     // Catch: java.lang.Throwable -> L49
            int r2 = r0.position     // Catch: java.lang.Throwable -> L49
            r3 = 4
            int r2 = r2 + r3
            int r0 = r0.length     // Catch: java.lang.Throwable -> L49
            int r2 = r2 + r0
            int r0 = r6.wrapPosition(r2)     // Catch: java.lang.Throwable -> L49
            byte[] r2 = r6.buffer     // Catch: java.lang.Throwable -> L49
            r4 = 0
            r6.ringRead(r0, r2, r4, r3)     // Catch: java.lang.Throwable -> L49
            byte[] r2 = r6.buffer     // Catch: java.lang.Throwable -> L49
            int r2 = readInt(r2, r4)     // Catch: java.lang.Throwable -> L49
            int r3 = r6.fileLength     // Catch: java.lang.Throwable -> L49
            int r4 = r6.elementCount     // Catch: java.lang.Throwable -> L49
            int r4 = r4 - r1
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r5 = r6.last     // Catch: java.lang.Throwable -> L49
            int r5 = r5.position     // Catch: java.lang.Throwable -> L49
            r6.writeHeader(r3, r4, r0, r5)     // Catch: java.lang.Throwable -> L49
            int r3 = r6.elementCount     // Catch: java.lang.Throwable -> L49
            int r3 = r3 - r1
            r6.elementCount = r3     // Catch: java.lang.Throwable -> L49
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = new com.google.firebase.crashlytics.internal.metadata.QueueFile$Element     // Catch: java.lang.Throwable -> L49
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L49
            r6.first = r1     // Catch: java.lang.Throwable -> L49
        L41:
            monitor-exit(r6)
            return
        L43:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L49
            r0.<init>()     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "fileLength="
            r0.append(r1)
            int r1 = r5.fileLength
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r5.elementCount
            r0.append(r1)
            java.lang.String r1 = ", first="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r5.first
            r0.append(r1)
            java.lang.String r1 = ", last="
            r0.append(r1)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r1 = r5.last
            r0.append(r1)
            java.lang.String r1 = ", element lengths=["
            r0.append(r1)
            com.google.firebase.crashlytics.internal.metadata.QueueFile$1 r1 = new com.google.firebase.crashlytics.internal.metadata.QueueFile$1     // Catch: java.io.IOException -> L4b
            r1.<init>(r5, r0)     // Catch: java.io.IOException -> L4b
            r5.forEach(r1)     // Catch: java.io.IOException -> L4b
            goto L55
        L4b:
            r1 = move-exception
            java.util.logging.Logger r2 = com.google.firebase.crashlytics.internal.metadata.QueueFile.LOGGER
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "read error"
            r2.log(r3, r4, r1)
        L55:
            java.lang.String r1 = "]]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int usedBytes() {
            r4 = this;
            int r0 = r4.elementCount
            r1 = 16
            if (r0 != 0) goto L7
            return r1
        L7:
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r0 = r4.last
            int r2 = r0.position
            com.google.firebase.crashlytics.internal.metadata.QueueFile$Element r3 = r4.first
            int r3 = r3.position
            if (r2 < r3) goto L19
            int r2 = r2 - r3
            int r2 = r2 + 4
            int r0 = r0.length
            int r2 = r2 + r0
            int r2 = r2 + r1
            return r2
        L19:
            int r2 = r2 + 4
            int r0 = r0.length
            int r2 = r2 + r0
            int r0 = r4.fileLength
            int r2 = r2 + r0
            int r2 = r2 - r3
            return r2
    }
}
