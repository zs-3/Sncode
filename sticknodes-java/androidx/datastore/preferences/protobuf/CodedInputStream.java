package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class CodedInputStream {
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    androidx.datastore.preferences.protobuf.CodedInputStreamReader wrapper;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class ArrayDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(byte[] r2, int r3, int r4, boolean r5) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.currentLimit = r0
                r1.buffer = r2
                int r4 = r4 + r3
                r1.limit = r4
                r1.pos = r3
                r1.startPos = r3
                r1.immutable = r5
                return
        }

        /* synthetic */ ArrayDecoder(byte[] r1, int r2, int r3, boolean r4, androidx.datastore.preferences.protobuf.CodedInputStream.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        private void recomputeBufferSizeAfterLimit() {
                r3 = this;
                int r0 = r3.limit
                int r1 = r3.bufferSizeAfterLimit
                int r0 = r0 + r1
                r3.limit = r0
                int r1 = r3.startPos
                int r1 = r0 - r1
                int r2 = r3.currentLimit
                if (r1 <= r2) goto L16
                int r1 = r1 - r2
                r3.bufferSizeAfterLimit = r1
                int r0 = r0 - r1
                r3.limit = r0
                goto L19
            L16:
                r0 = 0
                r3.bufferSizeAfterLimit = r0
            L19:
                return
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                r1 = 10
                if (r0 < r1) goto Ld
                r2.skipRawVarintFastPath()
                goto L10
            Ld:
                r2.skipRawVarintSlowPath()
            L10:
                return
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
                r4 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto L15
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r2 + 1
                r4.pos = r3
                r1 = r1[r2]
                if (r1 < 0) goto L12
                return
            L12:
                int r0 = r0 + 1
                goto L1
            L15:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r2
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.startPos
                int r0 = r0 - r1
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r2 = this;
                int r0 = r2.pos
                int r1 = r2.limit
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r1 = this;
                if (r2 < 0) goto L16
                int r0 = r1.getTotalBytesRead()
                int r2 = r2 + r0
                int r0 = r1.currentLimit
                if (r2 > r0) goto L11
                r1.currentLimit = r2
                r1.recomputeBufferSizeAfterLimit()
                return r0
            L11:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
            L16:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r2
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r5 = this;
                long r0 = r5.readRawVarint64()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                if (r0 <= 0) goto L28
                int r1 = r3.limit
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L28
                boolean r1 = r3.immutable
                if (r1 == 0) goto L1c
                boolean r1 = r3.enableAliasing
                if (r1 == 0) goto L1c
                byte[] r1 = r3.buffer
                androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.wrap(r1, r2, r0)
                goto L22
            L1c:
                byte[] r1 = r3.buffer
                androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(r1, r2, r0)
            L22:
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L28:
                if (r0 != 0) goto L2d
                androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
                return r0
            L2d:
                byte[] r0 = r3.readRawBytes(r0)
                androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.wrap(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        public byte readRawByte() throws java.io.IOException {
                r3 = this;
                int r0 = r3.pos
                int r1 = r3.limit
                if (r0 == r1) goto Lf
                byte[] r1 = r3.buffer
                int r2 = r0 + 1
                r3.pos = r2
                r0 = r1[r0]
                return r0
            Lf:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        public byte[] readRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 <= 0) goto L13
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto L13
                int r3 = r3 + r1
                r2.pos = r3
                byte[] r0 = r2.buffer
                byte[] r3 = java.util.Arrays.copyOfRange(r0, r1, r3)
                return r3
            L13:
                if (r3 > 0) goto L1f
                if (r3 != 0) goto L1a
                byte[] r3 = androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r3
            L1a:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r3
            L1f:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        public int readRawLittleEndian32() throws java.io.IOException {
                r4 = this;
                int r0 = r4.pos
                int r1 = r4.limit
                int r1 = r1 - r0
                r2 = 4
                if (r1 < r2) goto L2e
                byte[] r1 = r4.buffer
                int r2 = r0 + 4
                r4.pos = r2
                r2 = r1[r0]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r3 = r0 + 1
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                int r3 = r0 + 2
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                int r0 = r0 + 3
                r0 = r1[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r0 = r0 | r2
                return r0
            L2e:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        public long readRawLittleEndian64() throws java.io.IOException {
                r9 = this;
                int r0 = r9.pos
                int r1 = r9.limit
                int r1 = r1 - r0
                r2 = 8
                if (r1 < r2) goto L5b
                byte[] r1 = r9.buffer
                int r3 = r0 + 8
                r9.pos = r3
                r3 = r1[r0]
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                int r7 = r0 + 1
                r7 = r1[r7]
                long r7 = (long) r7
                long r7 = r7 & r5
                long r7 = r7 << r2
                long r2 = r3 | r7
                int r4 = r0 + 2
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 16
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 3
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 24
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 4
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 32
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 5
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 40
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 6
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 48
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r0 = r0 + 7
                r0 = r1[r0]
                long r0 = (long) r0
                long r0 = r0 & r5
                r4 = 56
                long r0 = r0 << r4
                long r0 = r0 | r2
                return r0
            L5b:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        public int readRawVarint32() throws java.io.IOException {
                r5 = this;
                int r0 = r5.pos
                int r1 = r5.limit
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.buffer
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.pos = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.readRawVarint64SlowPath()
                int r1 = (int) r0
                return r1
            L70:
                r5.pos = r1
                return r0
        }

        public long readRawVarint64() throws java.io.IOException {
                r11 = this;
                int r0 = r11.pos
                int r1 = r11.limit
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.buffer
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.pos = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.readRawVarint64SlowPath()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.pos = r1
                return r2
        }

        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
                r4 = r3 & 127(0x7f, float:1.78E-43)
                long r4 = (long) r4
                long r4 = r4 << r2
                long r0 = r0 | r4
                r3 = r3 & 128(0x80, float:1.794E-43)
                if (r3 != 0) goto L15
                return r0
            L15:
                int r2 = r2 + 7
                goto L3
            L18:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readRawVarint32()
                if (r0 <= 0) goto L1c
                int r1 = r5.limit
                int r2 = r5.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1c
                java.lang.String r1 = new java.lang.String
                byte[] r3 = r5.buffer
                java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.Internal.UTF_8
                r1.<init>(r3, r2, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L1c:
                if (r0 != 0) goto L21
                java.lang.String r0 = ""
                return r0
            L21:
                if (r0 >= 0) goto L28
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L28:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                if (r0 <= 0) goto L19
                int r1 = r3.limit
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L19
                byte[] r1 = r3.buffer
                java.lang.String r1 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(r1, r2, r0)
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                java.lang.String r0 = ""
                return r0
            L1e:
                if (r0 > 0) goto L25
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r0
            L25:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L19
                int r0 = r1.lastTag
                return r0
            L19:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int r5) throws java.io.IOException {
                r4 = this;
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L3d
                if (r0 == r1) goto L37
                r2 = 2
                if (r0 == r2) goto L2f
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L20
                if (r0 == r3) goto L1e
                r5 = 5
                if (r0 != r5) goto L19
                r4.skipRawBytes(r3)
                return r1
            L19:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L1e:
                r5 = 0
                return r5
            L20:
                r4.skipMessage()
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                return r1
            L2f:
                int r5 = r4.readRawVarint32()
                r4.skipRawBytes(r5)
                return r1
            L37:
                r5 = 8
                r4.skipRawBytes(r5)
                return r1
            L3d:
                r4.skipRawVarint()
                return r1
        }

        public void skipMessage() throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        public void skipRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto Ld
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto Ld
                int r1 = r1 + r3
                r2.pos = r1
                return
            Ld:
                if (r3 >= 0) goto L14
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r3
            L14:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }
    }

    private static final class StreamDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final java.io.InputStream input;
        private int lastTag;
        private int pos;
        private androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        private StreamDecoder(java.io.InputStream r3, int r4) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r1 = 2147483647(0x7fffffff, float:NaN)
                r2.currentLimit = r1
                r2.refillCallback = r0
                java.lang.String r0 = "input"
                androidx.datastore.preferences.protobuf.Internal.checkNotNull(r3, r0)
                r2.input = r3
                byte[] r3 = new byte[r4]
                r2.buffer = r3
                r3 = 0
                r2.bufferSize = r3
                r2.pos = r3
                r2.totalBytesRetired = r3
                return
        }

        /* synthetic */ StreamDecoder(java.io.InputStream r1, int r2, androidx.datastore.preferences.protobuf.CodedInputStream.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private androidx.datastore.preferences.protobuf.ByteString readBytesSlowPath(int r6) throws java.io.IOException {
                r5 = this;
                byte[] r0 = r5.readRawBytesSlowPathOneChunk(r6)
                if (r0 == 0) goto Lb
                androidx.datastore.preferences.protobuf.ByteString r6 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(r0)
                return r6
            Lb:
                int r0 = r5.pos
                int r1 = r5.bufferSize
                int r2 = r1 - r0
                int r3 = r5.totalBytesRetired
                int r3 = r3 + r1
                r5.totalBytesRetired = r3
                r1 = 0
                r5.pos = r1
                r5.bufferSize = r1
                int r3 = r6 - r2
                java.util.List r3 = r5.readRawBytesSlowPathRemainingChunks(r3)
                byte[] r6 = new byte[r6]
                byte[] r4 = r5.buffer
                java.lang.System.arraycopy(r4, r0, r6, r1, r2)
                java.util.Iterator r0 = r3.iterator()
            L2c:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L3f
                java.lang.Object r3 = r0.next()
                byte[] r3 = (byte[]) r3
                int r4 = r3.length
                java.lang.System.arraycopy(r3, r1, r6, r2, r4)
                int r3 = r3.length
                int r2 = r2 + r3
                goto L2c
            L3f:
                androidx.datastore.preferences.protobuf.ByteString r6 = androidx.datastore.preferences.protobuf.ByteString.wrap(r6)
                return r6
        }

        private byte[] readRawBytesSlowPath(int r5, boolean r6) throws java.io.IOException {
                r4 = this;
                byte[] r0 = r4.readRawBytesSlowPathOneChunk(r5)
                if (r0 == 0) goto L10
                if (r6 == 0) goto Lf
                java.lang.Object r5 = r0.clone()
                r0 = r5
                byte[] r0 = (byte[]) r0
            Lf:
                return r0
            L10:
                int r6 = r4.pos
                int r0 = r4.bufferSize
                int r1 = r0 - r6
                int r2 = r4.totalBytesRetired
                int r2 = r2 + r0
                r4.totalBytesRetired = r2
                r0 = 0
                r4.pos = r0
                r4.bufferSize = r0
                int r2 = r5 - r1
                java.util.List r2 = r4.readRawBytesSlowPathRemainingChunks(r2)
                byte[] r5 = new byte[r5]
                byte[] r3 = r4.buffer
                java.lang.System.arraycopy(r3, r6, r5, r0, r1)
                java.util.Iterator r6 = r2.iterator()
            L31:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L44
                java.lang.Object r2 = r6.next()
                byte[] r2 = (byte[]) r2
                int r3 = r2.length
                java.lang.System.arraycopy(r2, r0, r5, r1, r3)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L31
            L44:
                return r5
        }

        private byte[] readRawBytesSlowPathOneChunk(int r6) throws java.io.IOException {
                r5 = this;
                if (r6 != 0) goto L5
                byte[] r6 = androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY
                return r6
            L5:
                if (r6 < 0) goto L6a
                int r0 = r5.totalBytesRetired
                int r1 = r5.pos
                int r2 = r0 + r1
                int r2 = r2 + r6
                int r3 = r5.sizeLimit
                int r3 = r2 - r3
                if (r3 > 0) goto L65
                int r3 = r5.currentLimit
                if (r2 > r3) goto L5b
                int r0 = r5.bufferSize
                int r0 = r0 - r1
                int r1 = r6 - r0
                r2 = 4096(0x1000, float:5.74E-42)
                if (r1 < r2) goto L2c
                java.io.InputStream r2 = r5.input
                int r2 = r2.available()
                if (r1 > r2) goto L2a
                goto L2c
            L2a:
                r6 = 0
                return r6
            L2c:
                byte[] r1 = new byte[r6]
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                r4 = 0
                java.lang.System.arraycopy(r2, r3, r1, r4, r0)
                int r2 = r5.totalBytesRetired
                int r3 = r5.bufferSize
                int r2 = r2 + r3
                r5.totalBytesRetired = r2
                r5.pos = r4
                r5.bufferSize = r4
            L41:
                if (r0 >= r6) goto L5a
                java.io.InputStream r2 = r5.input
                int r3 = r6 - r0
                int r2 = r2.read(r1, r0, r3)
                r3 = -1
                if (r2 == r3) goto L55
                int r3 = r5.totalBytesRetired
                int r3 = r3 + r2
                r5.totalBytesRetired = r3
                int r0 = r0 + r2
                goto L41
            L55:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r6
            L5a:
                return r1
            L5b:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r5.skipRawBytes(r3)
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r6
            L65:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.sizeLimitExceeded()
                throw r6
            L6a:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r6 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r6
        }

        private java.util.List<byte[]> readRawBytesSlowPathRemainingChunks(int r7) throws java.io.IOException {
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L5:
                if (r7 <= 0) goto L2e
                r1 = 4096(0x1000, float:5.74E-42)
                int r1 = java.lang.Math.min(r7, r1)
                byte[] r2 = new byte[r1]
                r3 = 0
            L10:
                if (r3 >= r1) goto L29
                java.io.InputStream r4 = r6.input
                int r5 = r1 - r3
                int r4 = r4.read(r2, r3, r5)
                r5 = -1
                if (r4 == r5) goto L24
                int r5 = r6.totalBytesRetired
                int r5 = r5 + r4
                r6.totalBytesRetired = r5
                int r3 = r3 + r4
                goto L10
            L24:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r7 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r7
            L29:
                int r7 = r7 - r1
                r0.add(r2)
                goto L5
            L2e:
                return r0
        }

        private void recomputeBufferSizeAfterLimit() {
                r3 = this;
                int r0 = r3.bufferSize
                int r1 = r3.bufferSizeAfterLimit
                int r0 = r0 + r1
                r3.bufferSize = r0
                int r1 = r3.totalBytesRetired
                int r1 = r1 + r0
                int r2 = r3.currentLimit
                if (r1 <= r2) goto L15
                int r1 = r1 - r2
                r3.bufferSizeAfterLimit = r1
                int r0 = r0 - r1
                r3.bufferSize = r0
                goto L18
            L15:
                r0 = 0
                r3.bufferSizeAfterLimit = r0
            L18:
                return
        }

        private void refillBuffer(int r3) throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.tryRefillBuffer(r3)
                if (r0 != 0) goto L1a
                int r0 = r2.sizeLimit
                int r1 = r2.totalBytesRetired
                int r0 = r0 - r1
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 <= r0) goto L15
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.sizeLimitExceeded()
                throw r3
            L15:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
            L1a:
                return
        }

        private void skipRawBytesSlowPath(int r9) throws java.io.IOException {
                r8 = this;
                if (r9 < 0) goto L97
                int r0 = r8.totalBytesRetired
                int r1 = r8.pos
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.currentLimit
                if (r2 > r3) goto L8d
                androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder$RefillCallback r2 = r8.refillCallback
                r3 = 0
                if (r2 != 0) goto L6f
                int r0 = r0 + r1
                r8.totalBytesRetired = r0
                int r0 = r8.bufferSize
                int r0 = r0 - r1
                r8.bufferSize = r3
                r8.pos = r3
                r3 = r0
            L1d:
                if (r3 >= r9) goto L67
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.input     // Catch: java.lang.Throwable -> L5d
                long r4 = (long) r0     // Catch: java.lang.Throwable -> L5d
                long r0 = r1.skip(r4)     // Catch: java.lang.Throwable -> L5d
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L38
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L38
                if (r2 != 0) goto L35
                goto L67
            L35:
                int r1 = (int) r0     // Catch: java.lang.Throwable -> L5d
                int r3 = r3 + r1
                goto L1d
            L38:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
                r2.<init>()     // Catch: java.lang.Throwable -> L5d
                java.io.InputStream r4 = r8.input     // Catch: java.lang.Throwable -> L5d
                java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L5d
                r2.append(r4)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch: java.lang.Throwable -> L5d
                r2.append(r0)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch: java.lang.Throwable -> L5d
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L5d
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L5d
                throw r9     // Catch: java.lang.Throwable -> L5d
            L5d:
                r9 = move-exception
                int r0 = r8.totalBytesRetired
                int r0 = r0 + r3
                r8.totalBytesRetired = r0
                r8.recomputeBufferSizeAfterLimit()
                throw r9
            L67:
                int r0 = r8.totalBytesRetired
                int r0 = r0 + r3
                r8.totalBytesRetired = r0
                r8.recomputeBufferSizeAfterLimit()
            L6f:
                if (r3 >= r9) goto L8c
                int r0 = r8.bufferSize
                int r1 = r8.pos
                int r1 = r0 - r1
                r8.pos = r0
                r0 = 1
                r8.refillBuffer(r0)
            L7d:
                int r2 = r9 - r1
                int r3 = r8.bufferSize
                if (r2 <= r3) goto L8a
                int r1 = r1 + r3
                r8.pos = r3
                r8.refillBuffer(r0)
                goto L7d
            L8a:
                r8.pos = r2
            L8c:
                return
            L8d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.skipRawBytes(r3)
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r9
            L97:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r9
        }

        private void skipRawVarint() throws java.io.IOException {
                r2 = this;
                int r0 = r2.bufferSize
                int r1 = r2.pos
                int r0 = r0 - r1
                r1 = 10
                if (r0 < r1) goto Ld
                r2.skipRawVarintFastPath()
                goto L10
            Ld:
                r2.skipRawVarintSlowPath()
            L10:
                return
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
                r4 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto L15
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                int r3 = r2 + 1
                r4.pos = r3
                r1 = r1[r2]
                if (r1 < 0) goto L12
                return
            L12:
                int r0 = r0 + 1
                goto L1
            L15:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readRawByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private boolean tryRefillBuffer(int r8) throws java.io.IOException {
                r7 = this;
                int r0 = r7.pos
                int r1 = r0 + r8
                int r2 = r7.bufferSize
                if (r1 <= r2) goto L95
                int r1 = r7.sizeLimit
                int r2 = r7.totalBytesRetired
                int r1 = r1 - r2
                int r1 = r1 - r0
                r3 = 0
                if (r8 <= r1) goto L12
                return r3
            L12:
                int r2 = r2 + r0
                int r2 = r2 + r8
                int r0 = r7.currentLimit
                if (r2 <= r0) goto L19
                return r3
            L19:
                androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder$RefillCallback r0 = r7.refillCallback
                if (r0 == 0) goto L20
                r0.onRefill()
            L20:
                int r0 = r7.pos
                if (r0 <= 0) goto L3a
                int r1 = r7.bufferSize
                if (r1 <= r0) goto L2e
                byte[] r2 = r7.buffer
                int r1 = r1 - r0
                java.lang.System.arraycopy(r2, r0, r2, r3, r1)
            L2e:
                int r1 = r7.totalBytesRetired
                int r1 = r1 + r0
                r7.totalBytesRetired = r1
                int r1 = r7.bufferSize
                int r1 = r1 - r0
                r7.bufferSize = r1
                r7.pos = r3
            L3a:
                java.io.InputStream r0 = r7.input
                byte[] r1 = r7.buffer
                int r2 = r7.bufferSize
                int r4 = r1.length
                int r4 = r4 - r2
                int r5 = r7.sizeLimit
                int r6 = r7.totalBytesRetired
                int r5 = r5 - r6
                int r5 = r5 - r2
                int r4 = java.lang.Math.min(r4, r5)
                int r0 = r0.read(r1, r2, r4)
                if (r0 == 0) goto L70
                r1 = -1
                if (r0 < r1) goto L70
                byte[] r1 = r7.buffer
                int r1 = r1.length
                if (r0 > r1) goto L70
                if (r0 <= 0) goto L6f
                int r1 = r7.bufferSize
                int r1 = r1 + r0
                r7.bufferSize = r1
                r7.recomputeBufferSizeAfterLimit()
                int r0 = r7.bufferSize
                if (r0 < r8) goto L6a
                r8 = 1
                goto L6e
            L6a:
                boolean r8 = r7.tryRefillBuffer(r8)
            L6e:
                return r8
            L6f:
                return r3
            L70:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.io.InputStream r2 = r7.input
                java.lang.Class r2 = r2.getClass()
                r1.append(r2)
                java.lang.String r2 = "#read(byte[]) returned invalid result: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r8.<init>(r0)
                throw r8
            L95:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "refillBuffer() called when "
                r1.append(r2)
                r1.append(r8)
                java.lang.String r8 = " bytes were already available in buffer"
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(int r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r1 = this;
                int r0 = r1.lastTag
                if (r0 != r2) goto L5
                return
            L5:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag()
                throw r2
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
                r2 = this;
                int r0 = r2.totalBytesRetired
                int r1 = r2.pos
                int r0 = r0 + r1
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
                r3 = this;
                int r0 = r3.pos
                int r1 = r3.bufferSize
                r2 = 1
                if (r0 != r1) goto Le
                boolean r0 = r3.tryRefillBuffer(r2)
                if (r0 != 0) goto Le
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(int r1) {
                r0 = this;
                r0.currentLimit = r1
                r0.recomputeBufferSizeAfterLimit()
                return
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int r3) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r2 = this;
                if (r3 < 0) goto L17
                int r0 = r2.totalBytesRetired
                int r1 = r2.pos
                int r0 = r0 + r1
                int r3 = r3 + r0
                int r0 = r2.currentLimit
                if (r3 > r0) goto L12
                r2.currentLimit = r3
                r2.recomputeBufferSizeAfterLimit()
                return r0
            L12:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
            L17:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize()
                throw r3
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
                r5 = this;
                long r0 = r5.readRawVarint64()
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
                r3 = this;
                int r0 = r3.readRawVarint32()
                int r1 = r3.bufferSize
                int r2 = r3.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L19
                if (r0 <= 0) goto L19
                byte[] r1 = r3.buffer
                androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(r1, r2, r0)
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
                return r0
            L1e:
                androidx.datastore.preferences.protobuf.ByteString r0 = r3.readBytesSlowPath(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        public byte readRawByte() throws java.io.IOException {
                r3 = this;
                int r0 = r3.pos
                int r1 = r3.bufferSize
                if (r0 != r1) goto La
                r0 = 1
                r3.refillBuffer(r0)
            La:
                byte[] r0 = r3.buffer
                int r1 = r3.pos
                int r2 = r1 + 1
                r3.pos = r2
                r0 = r0[r1]
                return r0
        }

        public int readRawLittleEndian32() throws java.io.IOException {
                r4 = this;
                int r0 = r4.pos
                int r1 = r4.bufferSize
                int r1 = r1 - r0
                r2 = 4
                if (r1 >= r2) goto Ld
                r4.refillBuffer(r2)
                int r0 = r4.pos
            Ld:
                byte[] r1 = r4.buffer
                int r2 = r0 + 4
                r4.pos = r2
                r2 = r1[r0]
                r2 = r2 & 255(0xff, float:3.57E-43)
                int r3 = r0 + 1
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 8
                r2 = r2 | r3
                int r3 = r0 + 2
                r3 = r1[r3]
                r3 = r3 & 255(0xff, float:3.57E-43)
                int r3 = r3 << 16
                r2 = r2 | r3
                int r0 = r0 + 3
                r0 = r1[r0]
                r0 = r0 & 255(0xff, float:3.57E-43)
                int r0 = r0 << 24
                r0 = r0 | r2
                return r0
        }

        public long readRawLittleEndian64() throws java.io.IOException {
                r9 = this;
                int r0 = r9.pos
                int r1 = r9.bufferSize
                int r1 = r1 - r0
                r2 = 8
                if (r1 >= r2) goto Le
                r9.refillBuffer(r2)
                int r0 = r9.pos
            Le:
                byte[] r1 = r9.buffer
                int r3 = r0 + 8
                r9.pos = r3
                r3 = r1[r0]
                long r3 = (long) r3
                r5 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r5
                int r7 = r0 + 1
                r7 = r1[r7]
                long r7 = (long) r7
                long r7 = r7 & r5
                long r7 = r7 << r2
                long r2 = r3 | r7
                int r4 = r0 + 2
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 16
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 3
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 24
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 4
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 32
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 5
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 40
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r4 = r0 + 6
                r4 = r1[r4]
                long r7 = (long) r4
                long r7 = r7 & r5
                r4 = 48
                long r7 = r7 << r4
                long r2 = r2 | r7
                int r0 = r0 + 7
                r0 = r1[r0]
                long r0 = (long) r0
                long r0 = r0 & r5
                r4 = 56
                long r0 = r0 << r4
                long r0 = r0 | r2
                return r0
        }

        public int readRawVarint32() throws java.io.IOException {
                r5 = this;
                int r0 = r5.pos
                int r1 = r5.bufferSize
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.buffer
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.pos = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.readRawVarint64SlowPath()
                int r1 = (int) r0
                return r1
            L70:
                r5.pos = r1
                return r0
        }

        public long readRawVarint64() throws java.io.IOException {
                r11 = this;
                int r0 = r11.pos
                int r1 = r11.bufferSize
                if (r1 != r0) goto L8
                goto Lb6
            L8:
                byte[] r2 = r11.buffer
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L14
                r11.pos = r3
                long r0 = (long) r0
                return r0
            L14:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1b
                goto Lb6
            L1b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L29
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L26:
                long r2 = (long) r0
                goto Lbd
            L29:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbd
            L3a:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L48
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L26
            L48:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L5f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5b:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbd
            L5f:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L74
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L71:
                long r2 = r3 ^ r5
                goto Lbd
            L74:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L87
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5b
            L87:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L71
            L9a:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbb
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto Lbc
            Lb6:
                long r0 = r11.readRawVarint64SlowPath()
                return r0
            Lbb:
                r1 = r0
            Lbc:
                r2 = r3
            Lbd:
                r11.pos = r1
                return r2
        }

        long readRawVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readRawByte()
                r4 = r3 & 127(0x7f, float:1.78E-43)
                long r4 = (long) r4
                long r4 = r4 << r2
                long r0 = r0 | r4
                r3 = r3 & 128(0x80, float:1.794E-43)
                if (r3 != 0) goto L15
                return r0
            L15:
                int r2 = r2 + 7
                goto L3
            L18:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawLittleEndian32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawLittleEndian64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                int r0 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                long r0 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readRawVarint32()
                if (r0 <= 0) goto L1c
                int r1 = r5.bufferSize
                int r2 = r5.pos
                int r1 = r1 - r2
                if (r0 > r1) goto L1c
                java.lang.String r1 = new java.lang.String
                byte[] r3 = r5.buffer
                java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.Internal.UTF_8
                r1.<init>(r3, r2, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L1c:
                if (r0 != 0) goto L21
                java.lang.String r0 = ""
                return r0
            L21:
                int r1 = r5.bufferSize
                if (r0 > r1) goto L39
                r5.refillBuffer(r0)
                java.lang.String r1 = new java.lang.String
                byte[] r2 = r5.buffer
                int r3 = r5.pos
                java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.Internal.UTF_8
                r1.<init>(r2, r3, r0, r4)
                int r2 = r5.pos
                int r2 = r2 + r0
                r5.pos = r2
                return r1
            L39:
                java.lang.String r1 = new java.lang.String
                r2 = 0
                byte[] r0 = r5.readRawBytesSlowPath(r0, r2)
                java.nio.charset.Charset r2 = androidx.datastore.preferences.protobuf.Internal.UTF_8
                r1.<init>(r0, r2)
                return r1
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readRawVarint32()
                int r1 = r5.pos
                int r2 = r5.bufferSize
                int r3 = r2 - r1
                r4 = 0
                if (r0 > r3) goto L16
                if (r0 <= 0) goto L16
                byte[] r2 = r5.buffer
                int r3 = r1 + r0
                r5.pos = r3
                goto L2c
            L16:
                if (r0 != 0) goto L1b
                java.lang.String r0 = ""
                return r0
            L1b:
                if (r0 > r2) goto L27
                r5.refillBuffer(r0)
                byte[] r2 = r5.buffer
                int r1 = r0 + 0
                r5.pos = r1
                goto L2b
            L27:
                byte[] r2 = r5.readRawBytesSlowPath(r0, r4)
            L2b:
                r1 = 0
            L2c:
                java.lang.String r0 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(r2, r1, r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.isAtEnd()
                if (r0 == 0) goto La
                r0 = 0
                r1.lastTag = r0
                return r0
            La:
                int r0 = r1.readRawVarint32()
                r1.lastTag = r0
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r0)
                if (r0 == 0) goto L19
                int r0 = r1.lastTag
                return r0
            L19:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag()
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                int r0 = r1.readRawVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                long r0 = r2.readRawVarint64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(int r5) throws java.io.IOException {
                r4 = this;
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                r1 = 1
                if (r0 == 0) goto L3d
                if (r0 == r1) goto L37
                r2 = 2
                if (r0 == r2) goto L2f
                r2 = 3
                r3 = 4
                if (r0 == r2) goto L20
                if (r0 == r3) goto L1e
                r5 = 5
                if (r0 != r5) goto L19
                r4.skipRawBytes(r3)
                return r1
            L19:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L1e:
                r5 = 0
                return r5
            L20:
                r4.skipMessage()
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r5)
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r5, r3)
                r4.checkLastTagWas(r5)
                return r1
            L2f:
                int r5 = r4.readRawVarint32()
                r4.skipRawBytes(r5)
                return r1
            L37:
                r5 = 8
                r4.skipRawBytes(r5)
                return r1
            L3d:
                r4.skipRawVarint()
                return r1
        }

        public void skipMessage() throws java.io.IOException {
                r1 = this;
            L0:
                int r0 = r1.readTag()
                if (r0 == 0) goto Lc
                boolean r0 = r1.skipField(r0)
                if (r0 != 0) goto L0
            Lc:
                return
        }

        public void skipRawBytes(int r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.bufferSize
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto Ld
                if (r3 < 0) goto Ld
                int r1 = r1 + r3
                r2.pos = r1
                goto L10
            Ld:
                r2.skipRawBytesSlowPath(r3)
            L10:
                return
        }
    }

    private CodedInputStream() {
            r1 = this;
            r1.<init>()
            r0 = 100
            r1.recursionLimit = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.sizeLimit = r0
            r0 = 0
            r1.shouldDiscardUnknownFields = r0
            return
    }

    /* synthetic */ CodedInputStream(androidx.datastore.preferences.protobuf.CodedInputStream.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static int decodeZigZag32(int r1) {
            int r0 = r1 >>> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r0
            return r1
    }

    public static long decodeZigZag64(long r4) {
            r0 = 1
            long r0 = r4 >>> r0
            r2 = 1
            long r4 = r4 & r2
            long r4 = -r4
            long r4 = r4 ^ r0
            return r4
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(java.io.InputStream r1) {
            r0 = 4096(0x1000, float:5.74E-42)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = newInstance(r1, r0)
            return r1
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(java.io.InputStream r2, int r3) {
            if (r3 <= 0) goto L12
            if (r2 != 0) goto Lb
            byte[] r2 = androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = newInstance(r2)
            return r2
        Lb:
            androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder r0 = new androidx.datastore.preferences.protobuf.CodedInputStream$StreamDecoder
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bufferSize must be > 0"
            r2.<init>(r3)
            throw r2
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = newInstance(r2, r1, r0)
            return r2
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(byte[] r1, int r2, int r3) {
            r0 = 0
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = newInstance(r1, r2, r3, r0)
            return r1
    }

    static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(byte[] r7, int r8, int r9, boolean r10) {
            androidx.datastore.preferences.protobuf.CodedInputStream$ArrayDecoder r6 = new androidx.datastore.preferences.protobuf.CodedInputStream$ArrayDecoder
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.pushLimit(r9)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException -> Lf
            return r6
        Lf:
            r7 = move-exception
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r7)
            throw r8
    }

    public abstract void checkLastTagWas(int r1) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws java.io.IOException;

    public abstract void popLimit(int r1);

    public abstract int pushLimit(int r1) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    public abstract boolean readBool() throws java.io.IOException;

    public abstract androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException;

    public abstract double readDouble() throws java.io.IOException;

    public abstract int readEnum() throws java.io.IOException;

    public abstract int readFixed32() throws java.io.IOException;

    public abstract long readFixed64() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract int readInt32() throws java.io.IOException;

    public abstract long readInt64() throws java.io.IOException;

    public abstract int readSFixed32() throws java.io.IOException;

    public abstract long readSFixed64() throws java.io.IOException;

    public abstract int readSInt32() throws java.io.IOException;

    public abstract long readSInt64() throws java.io.IOException;

    public abstract java.lang.String readString() throws java.io.IOException;

    public abstract java.lang.String readStringRequireUtf8() throws java.io.IOException;

    public abstract int readTag() throws java.io.IOException;

    public abstract int readUInt32() throws java.io.IOException;

    public abstract long readUInt64() throws java.io.IOException;

    public abstract boolean skipField(int r1) throws java.io.IOException;
}
