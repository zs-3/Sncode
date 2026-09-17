package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends androidx.datastore.preferences.protobuf.ByteOutput {
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = false;
    private static final java.util.logging.Logger logger = null;
    private boolean serializationDeterministic;
    androidx.datastore.preferences.protobuf.CodedOutputStreamWriter wrapper;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static abstract class AbstractBufferedEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        AbstractBufferedEncoder(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                if (r2 < 0) goto L14
                r0 = 20
                int r2 = java.lang.Math.max(r2, r0)
                byte[] r2 = new byte[r2]
                r1.buffer = r2
                int r2 = r2.length
                r1.limit = r2
                return
            L14:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "bufferSize must be >= 0"
                r2.<init>(r0)
                throw r2
        }

        final void buffer(byte r4) {
                r3 = this;
                byte[] r0 = r3.buffer
                int r1 = r3.position
                int r2 = r1 + 1
                r3.position = r2
                r0[r1] = r4
                int r4 = r3.totalBytesWritten
                int r4 = r4 + 1
                r3.totalBytesWritten = r4
                return
        }

        final void bufferFixed32NoTag(int r5) {
                r4 = this;
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                r3 = r5 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r1] = r3
                int r1 = r2 + 1
                r4.position = r1
                int r3 = r5 >> 8
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r2] = r3
                int r2 = r1 + 1
                r4.position = r2
                int r3 = r5 >> 16
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r1] = r3
                int r1 = r2 + 1
                r4.position = r1
                int r5 = r5 >> 24
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5
                r0[r2] = r5
                int r5 = r4.totalBytesWritten
                int r5 = r5 + 4
                r4.totalBytesWritten = r5
                return
        }

        final void bufferFixed64NoTag(long r9) {
                r8 = this;
                byte[] r0 = r8.buffer
                int r1 = r8.position
                int r2 = r1 + 1
                r8.position = r2
                r3 = 255(0xff, double:1.26E-321)
                long r5 = r9 & r3
                int r6 = (int) r5
                byte r5 = (byte) r6
                r0[r1] = r5
                int r1 = r2 + 1
                r8.position = r1
                r5 = 8
                long r6 = r9 >> r5
                long r6 = r6 & r3
                int r7 = (int) r6
                byte r6 = (byte) r7
                r0[r2] = r6
                int r2 = r1 + 1
                r8.position = r2
                r6 = 16
                long r6 = r9 >> r6
                long r6 = r6 & r3
                int r7 = (int) r6
                byte r6 = (byte) r7
                r0[r1] = r6
                int r1 = r2 + 1
                r8.position = r1
                r6 = 24
                long r6 = r9 >> r6
                long r3 = r3 & r6
                int r4 = (int) r3
                byte r3 = (byte) r4
                r0[r2] = r3
                int r2 = r1 + 1
                r8.position = r2
                r3 = 32
                long r3 = r9 >> r3
                int r4 = (int) r3
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r1] = r3
                int r1 = r2 + 1
                r8.position = r1
                r3 = 40
                long r3 = r9 >> r3
                int r4 = (int) r3
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r2] = r3
                int r2 = r1 + 1
                r8.position = r2
                r3 = 48
                long r3 = r9 >> r3
                int r4 = (int) r3
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3
                r0[r1] = r3
                int r1 = r2 + 1
                r8.position = r1
                r1 = 56
                long r9 = r9 >> r1
                int r10 = (int) r9
                r9 = r10 & 255(0xff, float:3.57E-43)
                byte r9 = (byte) r9
                r0[r2] = r9
                int r9 = r8.totalBytesWritten
                int r9 = r9 + r5
                r8.totalBytesWritten = r9
                return
        }

        final void bufferInt32NoTag(int r3) {
                r2 = this;
                if (r3 < 0) goto L6
                r2.bufferUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.bufferUInt64NoTag(r0)
            La:
                return
        }

        final void bufferTag(int r1, int r2) {
                r0 = this;
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r1, r2)
                r0.bufferUInt32NoTag(r1)
                return
        }

        final void bufferUInt32NoTag(int r7) {
                r6 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.access$100()
                if (r0 == 0) goto L39
                int r0 = r6.position
                long r0 = (long) r0
            L9:
                r2 = r7 & (-128(0xffffffffffffff80, float:NaN))
                if (r2 != 0) goto L25
                byte[] r2 = r6.buffer
                int r3 = r6.position
                int r4 = r3 + 1
                r6.position = r4
                long r3 = (long) r3
                byte r7 = (byte) r7
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r2, r3, r7)
                int r7 = r6.position
                long r2 = (long) r7
                long r2 = r2 - r0
                int r7 = (int) r2
                int r0 = r6.totalBytesWritten
                int r0 = r0 + r7
                r6.totalBytesWritten = r0
                return
            L25:
                byte[] r2 = r6.buffer
                int r3 = r6.position
                int r4 = r3 + 1
                r6.position = r4
                long r3 = (long) r3
                r5 = r7 & 127(0x7f, float:1.78E-43)
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r2, r3, r5)
                int r7 = r7 >>> 7
                goto L9
            L39:
                r0 = r7 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L4f
                byte[] r0 = r6.buffer
                int r1 = r6.position
                int r2 = r1 + 1
                r6.position = r2
                byte r7 = (byte) r7
                r0[r1] = r7
                int r7 = r6.totalBytesWritten
                int r7 = r7 + 1
                r6.totalBytesWritten = r7
                return
            L4f:
                byte[] r0 = r6.buffer
                int r1 = r6.position
                int r2 = r1 + 1
                r6.position = r2
                r2 = r7 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.794E-43)
                byte r2 = (byte) r2
                r0[r1] = r2
                int r0 = r6.totalBytesWritten
                int r0 = r0 + 1
                r6.totalBytesWritten = r0
                int r7 = r7 >>> 7
                goto L39
        }

        final void bufferUInt64NoTag(long r12) {
                r11 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.access$100()
                r1 = 7
                r2 = 0
                r4 = -128(0xffffffffffffff80, double:NaN)
                if (r0 == 0) goto L41
                int r0 = r11.position
                long r6 = (long) r0
            Le:
                long r8 = r12 & r4
                int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r0 != 0) goto L2d
                byte[] r0 = r11.buffer
                int r1 = r11.position
                int r2 = r1 + 1
                r11.position = r2
                long r1 = (long) r1
                int r13 = (int) r12
                byte r12 = (byte) r13
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r12)
                int r12 = r11.position
                long r12 = (long) r12
                long r12 = r12 - r6
                int r13 = (int) r12
                int r12 = r11.totalBytesWritten
                int r12 = r12 + r13
                r11.totalBytesWritten = r12
                return
            L2d:
                byte[] r0 = r11.buffer
                int r8 = r11.position
                int r9 = r8 + 1
                r11.position = r9
                long r8 = (long) r8
                int r10 = (int) r12
                r10 = r10 & 127(0x7f, float:1.78E-43)
                r10 = r10 | 128(0x80, float:1.794E-43)
                byte r10 = (byte) r10
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r8, r10)
                long r12 = r12 >>> r1
                goto Le
            L41:
                long r6 = r12 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L5a
                byte[] r0 = r11.buffer
                int r1 = r11.position
                int r2 = r1 + 1
                r11.position = r2
                int r13 = (int) r12
                byte r12 = (byte) r13
                r0[r1] = r12
                int r12 = r11.totalBytesWritten
                int r12 = r12 + 1
                r11.totalBytesWritten = r12
                return
            L5a:
                byte[] r0 = r11.buffer
                int r6 = r11.position
                int r7 = r6 + 1
                r11.position = r7
                int r7 = (int) r12
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.794E-43)
                byte r7 = (byte) r7
                r0[r6] = r7
                int r0 = r11.totalBytesWritten
                int r0 = r0 + 1
                r11.totalBytesWritten = r0
                long r12 = r12 >>> r1
                goto L41
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer."
                r0.<init>(r1)
                throw r0
        }
    }

    private static class ArrayEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        ArrayEncoder(byte[] r4, int r5, int r6) {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                java.lang.String r0 = "buffer"
                java.util.Objects.requireNonNull(r4, r0)
                r0 = r5 | r6
                int r1 = r4.length
                int r2 = r5 + r6
                int r1 = r1 - r2
                r0 = r0 | r1
                if (r0 < 0) goto L1b
                r3.buffer = r4
                r3.offset = r5
                r3.position = r5
                r3.limit = r2
                return
            L1b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r4 = r4.length
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1[r2] = r4
                r4 = 1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1[r4] = r5
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
                r1[r4] = r5
                java.lang.String r4 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
                java.lang.String r4 = java.lang.String.format(r4, r1)
                r0.<init>(r4)
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() {
                r0 = this;
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int spaceLeft() {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.position
                int r0 = r0 - r1
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void write(byte r5) throws java.io.IOException {
                r4 = this;
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                return
            Lb:
                r5 = move-exception
                androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r0 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.position
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        public final void write(byte[] r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                byte[] r0 = r3.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r1 = r3.position     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r4 = r3.position     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r4 = r4 + r6
                r3.position = r4     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                return
            Ld:
                r4 = move-exception
                androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r5 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r3.position
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                r1 = 1
                int r2 = r3.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                r1 = 2
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0[r1] = r6
                java.lang.String r6 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r6 = java.lang.String.format(r6, r0)
                r5.<init>(r6, r4)
                throw r5
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                byte r2 = (byte) r3
                r1.write(r2)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.writeUInt32NoTag(r3)
                r0.write(r1, r2, r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytes(int r2, androidx.datastore.preferences.protobuf.ByteString r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeBytesNoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeBytesNoTag(androidx.datastore.preferences.protobuf.ByteString r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.size()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.writeTag(r2, r0)
                r1.writeFixed32NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int r5) throws java.io.IOException {
                r4 = this;
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r3 = r5 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r1 = r2 + 1
                r4.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r3 = r5 >> 8
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r3 = r5 >> 16
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r1 = r2 + 1
                r4.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                int r5 = r5 >> 24
                r5 = r5 & 255(0xff, float:3.57E-43)
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L2f
                return
            L2f:
                r5 = move-exception
                androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r0 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.position
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.writeTag(r2, r0)
                r1.writeFixed64NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long r6) throws java.io.IOException {
                r5 = this;
                byte[] r0 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r5.position     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r3 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r3 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r2 + 1
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 8
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 16
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r2 + 1
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 24
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 32
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r2 + 1
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 40
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = 48
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r3 = r4 & 255(0xff, float:3.57E-43)
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L70
                int r1 = r2 + 1
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r1 = 56
                long r6 = r6 >> r1
                int r7 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r6 = r7 & 255(0xff, float:3.57E-43)
                byte r6 = (byte) r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
                r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L70
                return
            L70:
                r6 = move-exception
                androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r7 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r5.position
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r1 = r5.limit
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                r1 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r7.<init>(r0, r6)
                throw r7
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeInt32NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeUInt64NoTag(r0)
            La:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public final void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.write(r1, r2, r3)
                return
        }

        public final void writeMessage(int r2, androidx.datastore.preferences.protobuf.MessageLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void writeMessage(int r2, androidx.datastore.preferences.protobuf.MessageLite r3, androidx.datastore.preferences.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r2 = r3
                androidx.datastore.preferences.protobuf.AbstractMessageLite r2 = (androidx.datastore.preferences.protobuf.AbstractMessageLite) r2
                int r2 = r2.getSerializedSize(r4)
                r1.writeUInt32NoTag(r2)
                androidx.datastore.preferences.protobuf.CodedOutputStreamWriter r2 = r1.wrapper
                r4.writeTo(r3, r2)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageNoTag(androidx.datastore.preferences.protobuf.MessageLite r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.getSerializedSize()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int r4, androidx.datastore.preferences.protobuf.MessageLite r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeMessage(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int r4, androidx.datastore.preferences.protobuf.ByteString r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeBytes(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeString(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeStringNoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeStringNoTag(java.lang.String r6) throws java.io.IOException {
                r5 = this;
                int r0 = r5.position
                int r1 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r1 = r1 * 3
                int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r2 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                if (r2 != r1) goto L2f
                int r1 = r0 + r2
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                byte[] r3 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r4 = r5.spaceLeft()     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r1 = androidx.datastore.preferences.protobuf.Utf8.encode(r6, r3, r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                r5.position = r0     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r3 = r1 - r0
                int r3 = r3 - r2
                r5.writeUInt32NoTag(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                goto L52
            L2f:
                int r1 = androidx.datastore.preferences.protobuf.Utf8.encodedLength(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                r5.writeUInt32NoTag(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                byte[] r1 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r2 = r5.position     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r3 = r5.spaceLeft()     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                int r1 = androidx.datastore.preferences.protobuf.Utf8.encode(r6, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L4c
                goto L52
            L45:
                r6 = move-exception
                androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r0 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                r0.<init>(r6)
                throw r0
            L4c:
                r1 = move-exception
                r5.position = r0
                r5.inefficientWriteStringNoTag(r6, r1)
            L52:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeTag(int r1, int r2) throws java.io.IOException {
                r0 = this;
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeUInt32NoTag(r1)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeUInt32NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.access$100()
                if (r0 == 0) goto Lad
                boolean r0 = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()
                if (r0 != 0) goto Lad
                int r0 = r4.spaceLeft()
                r1 = 5
                if (r0 < r1) goto Lad
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L25
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                return
            L25:
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L48
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                return
            L48:
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L6b
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                return
            L6b:
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8e
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                return
            L8e:
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r3)
                int r5 = r5 >>> 7
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r5)
                return
            Lad:
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto Lbd
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                return
            Lbd:
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                r2 = r5 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.794E-43)
                byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                r0[r1] = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r5 = r5 >>> 7
                goto Lad
            Lcf:
                r5 = move-exception
                androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r0 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.position
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.writeTag(r2, r0)
                r1.writeUInt64NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long r10) throws java.io.IOException {
                r9 = this;
                boolean r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.access$100()
                r1 = 7
                r2 = 0
                r4 = -128(0xffffffffffffff80, double:NaN)
                if (r0 == 0) goto L3c
                int r0 = r9.spaceLeft()
                r6 = 10
                if (r0 < r6) goto L3c
            L13:
                long r6 = r10 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L28
                byte[] r0 = r9.buffer
                int r1 = r9.position
                int r2 = r1 + 1
                r9.position = r2
                long r1 = (long) r1
                int r11 = (int) r10
                byte r10 = (byte) r11
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r1, r10)
                return
            L28:
                byte[] r0 = r9.buffer
                int r6 = r9.position
                int r7 = r6 + 1
                r9.position = r7
                long r6 = (long) r6
                int r8 = (int) r10
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.794E-43)
                byte r8 = (byte) r8
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r0, r6, r8)
                long r10 = r10 >>> r1
                goto L13
            L3c:
                long r6 = r10 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L4f
                byte[] r0 = r9.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r1 = r9.position     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r2 = r1 + 1
                r9.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r11 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                byte r10 = (byte) r11     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r0[r1] = r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                return
            L4f:
                byte[] r0 = r9.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r6 = r9.position     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r7 = r6 + 1
                r9.position = r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r7 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.794E-43)
                byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r0[r6] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                long r10 = r10 >>> r1
                goto L3c
            L61:
                r10 = move-exception
                androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r11 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r9.position
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r1 = r9.limit
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                r1 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r11.<init>(r0, r10)
                throw r11
        }
    }

    public static class OutOfSpaceException extends java.io.IOException {
        OutOfSpaceException(java.lang.String r3, java.lang.Throwable r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3, r4)
                return
        }

        OutOfSpaceException(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
                r1.<init>(r0, r2)
                return
        }
    }

    private static final class OutputStreamEncoder extends androidx.datastore.preferences.protobuf.CodedOutputStream.AbstractBufferedEncoder {
        private final java.io.OutputStream out;

        OutputStreamEncoder(java.io.OutputStream r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                java.lang.String r2 = "out"
                java.util.Objects.requireNonNull(r1, r2)
                r0.out = r1
                return
        }

        private void doFlush() throws java.io.IOException {
                r4 = this;
                java.io.OutputStream r0 = r4.out
                byte[] r1 = r4.buffer
                int r2 = r4.position
                r3 = 0
                r0.write(r1, r3, r2)
                r4.position = r3
                return
        }

        private void flushIfNotAvailable(int r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.position
                int r0 = r0 - r1
                if (r0 >= r3) goto La
                r2.doFlush()
            La:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void flush() throws java.io.IOException {
                r1 = this;
                int r0 = r1.position
                if (r0 <= 0) goto L7
                r1.doFlush()
            L7:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void write(byte r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.position
                int r1 = r2.limit
                if (r0 != r1) goto L9
                r2.doFlush()
            L9:
                r2.buffer(r3)
                return
        }

        public void write(byte[] r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.limit
                int r1 = r3.position
                int r2 = r0 - r1
                if (r2 < r6) goto L18
                byte[] r0 = r3.buffer
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)
                int r4 = r3.position
                int r4 = r4 + r6
                r3.position = r4
                int r4 = r3.totalBytesWritten
                int r4 = r4 + r6
                r3.totalBytesWritten = r4
                goto L43
            L18:
                int r0 = r0 - r1
                byte[] r2 = r3.buffer
                java.lang.System.arraycopy(r4, r5, r2, r1, r0)
                int r5 = r5 + r0
                int r6 = r6 - r0
                int r1 = r3.limit
                r3.position = r1
                int r1 = r3.totalBytesWritten
                int r1 = r1 + r0
                r3.totalBytesWritten = r1
                r3.doFlush()
                int r0 = r3.limit
                if (r6 > r0) goto L39
                byte[] r0 = r3.buffer
                r1 = 0
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)
                r3.position = r6
                goto L3e
            L39:
                java.io.OutputStream r0 = r3.out
                r0.write(r4, r5, r6)
            L3e:
                int r4 = r3.totalBytesWritten
                int r4 = r4 + r6
                r3.totalBytesWritten = r4
            L43:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBool(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 11
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                byte r2 = (byte) r3
                r1.buffer(r2)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.writeUInt32NoTag(r3)
                r0.write(r1, r2, r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytes(int r2, androidx.datastore.preferences.protobuf.ByteString r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeBytesNoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeBytesNoTag(androidx.datastore.preferences.protobuf.ByteString r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.size()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 14
                r1.flushIfNotAvailable(r0)
                r0 = 5
                r1.bufferTag(r2, r0)
                r1.bufferFixed32NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int r2) throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.flushIfNotAvailable(r0)
                r1.bufferFixed32NoTag(r2)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 18
                r1.flushIfNotAvailable(r0)
                r0 = 1
                r1.bufferTag(r2, r0)
                r1.bufferFixed64NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long r2) throws java.io.IOException {
                r1 = this;
                r0 = 8
                r1.flushIfNotAvailable(r0)
                r1.bufferFixed64NoTag(r2)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferInt32NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeInt32NoTag(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto L6
                r2.writeUInt32NoTag(r3)
                goto La
            L6:
                long r0 = (long) r3
                r2.writeUInt64NoTag(r0)
            La:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.ByteOutput
        public void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.write(r1, r2, r3)
                return
        }

        public void writeMessage(int r2, androidx.datastore.preferences.protobuf.MessageLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void writeMessage(int r2, androidx.datastore.preferences.protobuf.MessageLite r3, androidx.datastore.preferences.protobuf.Schema r4) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeMessageNoTag(r3, r4)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageNoTag(androidx.datastore.preferences.protobuf.MessageLite r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.getSerializedSize()
                r1.writeUInt32NoTag(r0)
                r2.writeTo(r1)
                return
        }

        void writeMessageNoTag(androidx.datastore.preferences.protobuf.MessageLite r2, androidx.datastore.preferences.protobuf.Schema r3) throws java.io.IOException {
                r1 = this;
                r0 = r2
                androidx.datastore.preferences.protobuf.AbstractMessageLite r0 = (androidx.datastore.preferences.protobuf.AbstractMessageLite) r0
                int r0 = r0.getSerializedSize(r3)
                r1.writeUInt32NoTag(r0)
                androidx.datastore.preferences.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
                r3.writeTo(r2, r0)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int r4, androidx.datastore.preferences.protobuf.MessageLite r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeMessage(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int r4, androidx.datastore.preferences.protobuf.ByteString r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.writeTag(r0, r1)
                r2 = 2
                r3.writeUInt32(r2, r4)
                r3.writeBytes(r1, r5)
                r4 = 4
                r3.writeTag(r0, r4)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeString(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.writeTag(r2, r0)
                r1.writeStringNoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeStringNoTag(java.lang.String r6) throws java.io.IOException {
                r5 = this;
                int r0 = r6.length()     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                int r0 = r0 * 3
                int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r0)     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                int r2 = r1 + r0
                int r3 = r5.limit     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                if (r2 <= r3) goto L1e
                byte[] r1 = new byte[r0]     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                r2 = 0
                int r0 = androidx.datastore.preferences.protobuf.Utf8.encode(r6, r1, r2, r0)     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                r5.writeUInt32NoTag(r0)     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                r5.writeLazy(r1, r2, r0)     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                return
            L1e:
                int r0 = r5.position     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                int r3 = r3 - r0
                if (r2 <= r3) goto L26
                r5.doFlush()     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
            L26:
                int r0 = r6.length()     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r0)     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                int r2 = r5.position     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                if (r0 != r1) goto L4a
                int r1 = r2 + r0
                r5.position = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                byte[] r3 = r5.buffer     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                int r4 = r5.limit     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                int r4 = r4 - r1
                int r1 = androidx.datastore.preferences.protobuf.Utf8.encode(r6, r3, r1, r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                r5.position = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                int r3 = r1 - r2
                int r3 = r3 - r0
                r5.bufferUInt32NoTag(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                r5.position = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                goto L5b
            L4a:
                int r3 = androidx.datastore.preferences.protobuf.Utf8.encodedLength(r6)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                r5.bufferUInt32NoTag(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                byte[] r0 = r5.buffer     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                int r1 = r5.position     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                int r0 = androidx.datastore.preferences.protobuf.Utf8.encode(r6, r0, r1, r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                r5.position = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
            L5b:
                int r0 = r5.totalBytesWritten     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                int r0 = r0 + r3
                r5.totalBytesWritten = r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L61 androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L68
                goto L78
            L61:
                r0 = move-exception
                androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r1 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                r1.<init>(r0)     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                throw r1     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
            L68:
                r0 = move-exception
                int r1 = r5.totalBytesWritten     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                int r3 = r5.position     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                int r3 = r3 - r2
                int r1 = r1 - r3
                r5.totalBytesWritten = r1     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                r5.position = r2     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
                throw r0     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L74
            L74:
                r0 = move-exception
                r5.inefficientWriteStringNoTag(r6, r0)
            L78:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeTag(int r1, int r2) throws java.io.IOException {
                r0 = this;
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r1, r2)
                r0.writeUInt32NoTag(r1)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferUInt32NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int r2) throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.flushIfNotAvailable(r0)
                r1.bufferUInt32NoTag(r2)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 20
                r1.flushIfNotAvailable(r0)
                r0 = 0
                r1.bufferTag(r2, r0)
                r1.bufferUInt64NoTag(r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long r2) throws java.io.IOException {
                r1 = this;
                r0 = 10
                r1.flushIfNotAvailable(r0)
                r1.bufferUInt64NoTag(r2)
                return
        }
    }

    static {
            java.lang.Class<androidx.datastore.preferences.protobuf.CodedOutputStream> r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            androidx.datastore.preferences.protobuf.CodedOutputStream.logger = r0
            boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeArrayOperations()
            androidx.datastore.preferences.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS = r0
            return
    }

    private CodedOutputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ CodedOutputStream(androidx.datastore.preferences.protobuf.CodedOutputStream.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$100() {
            boolean r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS
            return r0
    }

    public static int computeBoolSize(int r0, boolean r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeBoolSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeBoolSizeNoTag(boolean r0) {
            r0 = 1
            return r0
    }

    public static int computeByteArraySizeNoTag(byte[] r0) {
            int r0 = r0.length
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    public static int computeBytesSize(int r0, androidx.datastore.preferences.protobuf.ByteString r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeBytesSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeBytesSizeNoTag(androidx.datastore.preferences.protobuf.ByteString r0) {
            int r0 = r0.size()
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    public static int computeDoubleSize(int r0, double r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeDoubleSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeDoubleSizeNoTag(double r0) {
            r0 = 8
            return r0
    }

    public static int computeEnumSize(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeEnumSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeEnumSizeNoTag(int r0) {
            int r0 = computeInt32SizeNoTag(r0)
            return r0
    }

    public static int computeFixed32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeFixed32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeFixed32SizeNoTag(int r0) {
            r0 = 4
            return r0
    }

    public static int computeFixed64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeFixed64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeFixed64SizeNoTag(long r0) {
            r0 = 8
            return r0
    }

    public static int computeFloatSize(int r0, float r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeFloatSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeFloatSizeNoTag(float r0) {
            r0 = 4
            return r0
    }

    @java.lang.Deprecated
    static int computeGroupSize(int r0, androidx.datastore.preferences.protobuf.MessageLite r1, androidx.datastore.preferences.protobuf.Schema r2) {
            int r0 = computeTagSize(r0)
            int r0 = r0 * 2
            int r1 = computeGroupSizeNoTag(r1, r2)
            int r0 = r0 + r1
            return r0
    }

    @java.lang.Deprecated
    public static int computeGroupSizeNoTag(androidx.datastore.preferences.protobuf.MessageLite r0) {
            int r0 = r0.getSerializedSize()
            return r0
    }

    @java.lang.Deprecated
    static int computeGroupSizeNoTag(androidx.datastore.preferences.protobuf.MessageLite r0, androidx.datastore.preferences.protobuf.Schema r1) {
            androidx.datastore.preferences.protobuf.AbstractMessageLite r0 = (androidx.datastore.preferences.protobuf.AbstractMessageLite) r0
            int r0 = r0.getSerializedSize(r1)
            return r0
    }

    public static int computeInt32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeInt32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeInt32SizeNoTag(int r0) {
            if (r0 < 0) goto L7
            int r0 = computeUInt32SizeNoTag(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    public static int computeInt64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeInt64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeInt64SizeNoTag(long r0) {
            int r0 = computeUInt64SizeNoTag(r0)
            return r0
    }

    public static int computeLazyFieldMessageSetExtensionSize(int r2, androidx.datastore.preferences.protobuf.LazyFieldLite r3) {
            r0 = 1
            int r0 = computeTagSize(r0)
            r1 = 2
            int r0 = r0 * 2
            int r2 = computeUInt32Size(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = computeLazyFieldSize(r2, r3)
            int r0 = r0 + r2
            return r0
    }

    public static int computeLazyFieldSize(int r0, androidx.datastore.preferences.protobuf.LazyFieldLite r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeLazyFieldSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeLazyFieldSizeNoTag(androidx.datastore.preferences.protobuf.LazyFieldLite r0) {
            int r0 = r0.getSerializedSize()
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    static int computeLengthDelimitedFieldSize(int r1) {
            int r0 = computeUInt32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeMessageSetExtensionSize(int r2, androidx.datastore.preferences.protobuf.MessageLite r3) {
            r0 = 1
            int r0 = computeTagSize(r0)
            r1 = 2
            int r0 = r0 * 2
            int r2 = computeUInt32Size(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = computeMessageSize(r2, r3)
            int r0 = r0 + r2
            return r0
    }

    public static int computeMessageSize(int r0, androidx.datastore.preferences.protobuf.MessageLite r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeMessageSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    static int computeMessageSize(int r0, androidx.datastore.preferences.protobuf.MessageLite r1, androidx.datastore.preferences.protobuf.Schema r2) {
            int r0 = computeTagSize(r0)
            int r1 = computeMessageSizeNoTag(r1, r2)
            int r0 = r0 + r1
            return r0
    }

    public static int computeMessageSizeNoTag(androidx.datastore.preferences.protobuf.MessageLite r0) {
            int r0 = r0.getSerializedSize()
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    static int computeMessageSizeNoTag(androidx.datastore.preferences.protobuf.MessageLite r0, androidx.datastore.preferences.protobuf.Schema r1) {
            androidx.datastore.preferences.protobuf.AbstractMessageLite r0 = (androidx.datastore.preferences.protobuf.AbstractMessageLite) r0
            int r0 = r0.getSerializedSize(r1)
            int r0 = computeLengthDelimitedFieldSize(r0)
            return r0
    }

    static int computePreferredBufferSize(int r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r0) goto L5
            return r0
        L5:
            return r1
    }

    public static int computeRawMessageSetExtensionSize(int r2, androidx.datastore.preferences.protobuf.ByteString r3) {
            r0 = 1
            int r0 = computeTagSize(r0)
            r1 = 2
            int r0 = r0 * 2
            int r2 = computeUInt32Size(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = computeBytesSize(r2, r3)
            int r0 = r0 + r2
            return r0
    }

    @java.lang.Deprecated
    public static int computeRawVarint32Size(int r0) {
            int r0 = computeUInt32SizeNoTag(r0)
            return r0
    }

    public static int computeSFixed32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeSFixed32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeSFixed32SizeNoTag(int r0) {
            r0 = 4
            return r0
    }

    public static int computeSFixed64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeSFixed64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeSFixed64SizeNoTag(long r0) {
            r0 = 8
            return r0
    }

    public static int computeSInt32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeSInt32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeSInt32SizeNoTag(int r0) {
            int r0 = encodeZigZag32(r0)
            int r0 = computeUInt32SizeNoTag(r0)
            return r0
    }

    public static int computeSInt64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeSInt64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeSInt64SizeNoTag(long r0) {
            long r0 = encodeZigZag64(r0)
            int r0 = computeUInt64SizeNoTag(r0)
            return r0
    }

    public static int computeStringSize(int r0, java.lang.String r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeStringSizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeStringSizeNoTag(java.lang.String r1) {
            int r1 = androidx.datastore.preferences.protobuf.Utf8.encodedLength(r1)     // Catch: androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = androidx.datastore.preferences.protobuf.Internal.UTF_8
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r1 = computeLengthDelimitedFieldSize(r1)
            return r1
    }

    public static int computeTagSize(int r1) {
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r1, r0)
            int r1 = computeUInt32SizeNoTag(r1)
            return r1
    }

    public static int computeUInt32Size(int r0, int r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeUInt32SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeUInt32SizeNoTag(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    public static int computeUInt64Size(int r0, long r1) {
            int r0 = computeTagSize(r0)
            int r1 = computeUInt64SizeNoTag(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int computeUInt64SizeNoTag(long r6) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r6 = 1
            return r6
        Lb:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L12
            r6 = 10
            return r6
        L12:
            r0 = -34359738368(0xfffffff800000000, double:NaN)
            long r0 = r0 & r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            r0 = 6
            r1 = 28
            long r6 = r6 >>> r1
            goto L22
        L21:
            r0 = 2
        L22:
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L2f
            int r0 = r0 + 2
            r1 = 14
            long r6 = r6 >>> r1
        L2f:
            r4 = -16384(0xffffffffffffc000, double:NaN)
            long r6 = r6 & r4
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L38
            int r0 = r0 + 1
        L38:
            return r0
    }

    public static int encodeZigZag32(int r1) {
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            return r1
    }

    public static long encodeZigZag64(long r3) {
            r0 = 1
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            return r3
    }

    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(java.io.OutputStream r1, int r2) {
            androidx.datastore.preferences.protobuf.CodedOutputStream$OutputStreamEncoder r0 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutputStreamEncoder
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            androidx.datastore.preferences.protobuf.CodedOutputStream r2 = newInstance(r2, r1, r0)
            return r2
    }

    public static androidx.datastore.preferences.protobuf.CodedOutputStream newInstance(byte[] r1, int r2, int r3) {
            androidx.datastore.preferences.protobuf.CodedOutputStream$ArrayEncoder r0 = new androidx.datastore.preferences.protobuf.CodedOutputStream$ArrayEncoder
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final void checkNoSpaceLeft() {
            r2 = this;
            int r0 = r2.spaceLeft()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)
            throw r0
    }

    public abstract void flush() throws java.io.IOException;

    final void inefficientWriteStringNoTag(java.lang.String r4, androidx.datastore.preferences.protobuf.Utf8.UnpairedSurrogateException r5) throws java.io.IOException {
            r3 = this;
            java.util.logging.Logger r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r0.log(r1, r2, r5)
            java.nio.charset.Charset r5 = androidx.datastore.preferences.protobuf.Internal.UTF_8
            byte[] r4 = r4.getBytes(r5)
            int r5 = r4.length     // Catch: androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException -> L19 java.lang.IndexOutOfBoundsException -> L1b
            r3.writeUInt32NoTag(r5)     // Catch: androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException -> L19 java.lang.IndexOutOfBoundsException -> L1b
            r5 = 0
            int r0 = r4.length     // Catch: androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException -> L19 java.lang.IndexOutOfBoundsException -> L1b
            r3.writeLazy(r4, r5, r0)     // Catch: androidx.datastore.preferences.protobuf.CodedOutputStream.OutOfSpaceException -> L19 java.lang.IndexOutOfBoundsException -> L1b
            return
        L19:
            r4 = move-exception
            throw r4
        L1b:
            r4 = move-exception
            androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException r5 = new androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException
            r5.<init>(r4)
            throw r5
    }

    boolean isSerializationDeterministic() {
            r1 = this;
            boolean r0 = r1.serializationDeterministic
            return r0
    }

    public abstract int spaceLeft();

    public abstract void write(byte r1) throws java.io.IOException;

    public abstract void writeBool(int r1, boolean r2) throws java.io.IOException;

    public final void writeBoolNoTag(boolean r1) throws java.io.IOException {
            r0 = this;
            byte r1 = (byte) r1
            r0.write(r1)
            return
    }

    public final void writeByteArrayNoTag(byte[] r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            r2.writeByteArrayNoTag(r3, r1, r0)
            return
    }

    abstract void writeByteArrayNoTag(byte[] r1, int r2, int r3) throws java.io.IOException;

    public abstract void writeBytes(int r1, androidx.datastore.preferences.protobuf.ByteString r2) throws java.io.IOException;

    public abstract void writeBytesNoTag(androidx.datastore.preferences.protobuf.ByteString r1) throws java.io.IOException;

    public final void writeDouble(int r1, double r2) throws java.io.IOException {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.writeFixed64(r1, r2)
            return
    }

    public final void writeDoubleNoTag(double r1) throws java.io.IOException {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.writeFixed64NoTag(r1)
            return
    }

    public final void writeEnum(int r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.writeInt32(r1, r2)
            return
    }

    public final void writeEnumNoTag(int r1) throws java.io.IOException {
            r0 = this;
            r0.writeInt32NoTag(r1)
            return
    }

    public abstract void writeFixed32(int r1, int r2) throws java.io.IOException;

    public abstract void writeFixed32NoTag(int r1) throws java.io.IOException;

    public abstract void writeFixed64(int r1, long r2) throws java.io.IOException;

    public abstract void writeFixed64NoTag(long r1) throws java.io.IOException;

    public final void writeFloat(int r1, float r2) throws java.io.IOException {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.writeFixed32(r1, r2)
            return
    }

    public final void writeFloatNoTag(float r1) throws java.io.IOException {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r0.writeFixed32NoTag(r1)
            return
    }

    @java.lang.Deprecated
    public final void writeGroup(int r2, androidx.datastore.preferences.protobuf.MessageLite r3) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.writeTag(r2, r0)
            r1.writeGroupNoTag(r3)
            r3 = 4
            r1.writeTag(r2, r3)
            return
    }

    @java.lang.Deprecated
    final void writeGroup(int r2, androidx.datastore.preferences.protobuf.MessageLite r3, androidx.datastore.preferences.protobuf.Schema r4) throws java.io.IOException {
            r1 = this;
            r0 = 3
            r1.writeTag(r2, r0)
            r1.writeGroupNoTag(r3, r4)
            r3 = 4
            r1.writeTag(r2, r3)
            return
    }

    @java.lang.Deprecated
    public final void writeGroupNoTag(androidx.datastore.preferences.protobuf.MessageLite r1) throws java.io.IOException {
            r0 = this;
            r1.writeTo(r0)
            return
    }

    @java.lang.Deprecated
    final void writeGroupNoTag(androidx.datastore.preferences.protobuf.MessageLite r2, androidx.datastore.preferences.protobuf.Schema r3) throws java.io.IOException {
            r1 = this;
            androidx.datastore.preferences.protobuf.CodedOutputStreamWriter r0 = r1.wrapper
            r3.writeTo(r2, r0)
            return
    }

    public abstract void writeInt32(int r1, int r2) throws java.io.IOException;

    public abstract void writeInt32NoTag(int r1) throws java.io.IOException;

    public final void writeInt64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64(r1, r2)
            return
    }

    public final void writeInt64NoTag(long r1) throws java.io.IOException {
            r0 = this;
            r0.writeUInt64NoTag(r1)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.ByteOutput
    public abstract void writeLazy(byte[] r1, int r2, int r3) throws java.io.IOException;

    abstract void writeMessage(int r1, androidx.datastore.preferences.protobuf.MessageLite r2, androidx.datastore.preferences.protobuf.Schema r3) throws java.io.IOException;

    public abstract void writeMessageNoTag(androidx.datastore.preferences.protobuf.MessageLite r1) throws java.io.IOException;

    public abstract void writeMessageSetExtension(int r1, androidx.datastore.preferences.protobuf.MessageLite r2) throws java.io.IOException;

    public abstract void writeRawMessageSetExtension(int r1, androidx.datastore.preferences.protobuf.ByteString r2) throws java.io.IOException;

    public final void writeSFixed32(int r1, int r2) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32(r1, r2)
            return
    }

    public final void writeSFixed32NoTag(int r1) throws java.io.IOException {
            r0 = this;
            r0.writeFixed32NoTag(r1)
            return
    }

    public final void writeSFixed64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64(r1, r2)
            return
    }

    public final void writeSFixed64NoTag(long r1) throws java.io.IOException {
            r0 = this;
            r0.writeFixed64NoTag(r1)
            return
    }

    public final void writeSInt32(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r2 = encodeZigZag32(r2)
            r0.writeUInt32(r1, r2)
            return
    }

    public final void writeSInt32NoTag(int r1) throws java.io.IOException {
            r0 = this;
            int r1 = encodeZigZag32(r1)
            r0.writeUInt32NoTag(r1)
            return
    }

    public final void writeSInt64(int r1, long r2) throws java.io.IOException {
            r0 = this;
            long r2 = encodeZigZag64(r2)
            r0.writeUInt64(r1, r2)
            return
    }

    public final void writeSInt64NoTag(long r1) throws java.io.IOException {
            r0 = this;
            long r1 = encodeZigZag64(r1)
            r0.writeUInt64NoTag(r1)
            return
    }

    public abstract void writeString(int r1, java.lang.String r2) throws java.io.IOException;

    public abstract void writeStringNoTag(java.lang.String r1) throws java.io.IOException;

    public abstract void writeTag(int r1, int r2) throws java.io.IOException;

    public abstract void writeUInt32(int r1, int r2) throws java.io.IOException;

    public abstract void writeUInt32NoTag(int r1) throws java.io.IOException;

    public abstract void writeUInt64(int r1, long r2) throws java.io.IOException;

    public abstract void writeUInt64NoTag(long r1) throws java.io.IOException;
}
