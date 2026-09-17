package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class Utf8 {
    private static final androidx.datastore.preferences.protobuf.Utf8.Processor processor = null;

    private static class DecodeUtil {
        static /* synthetic */ void access$1000(byte r0, byte r1, byte r2, byte r3, char[] r4, int r5) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                handleFourBytes(r0, r1, r2, r3, r4, r5)
                return
        }

        static /* synthetic */ boolean access$400(byte r0) {
                boolean r0 = isOneByte(r0)
                return r0
        }

        static /* synthetic */ void access$500(byte r0, char[] r1, int r2) {
                handleOneByte(r0, r1, r2)
                return
        }

        static /* synthetic */ boolean access$600(byte r0) {
                boolean r0 = isTwoBytes(r0)
                return r0
        }

        static /* synthetic */ void access$700(byte r0, byte r1, char[] r2, int r3) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                handleTwoBytes(r0, r1, r2, r3)
                return
        }

        static /* synthetic */ boolean access$800(byte r0) {
                boolean r0 = isThreeBytes(r0)
                return r0
        }

        static /* synthetic */ void access$900(byte r0, byte r1, byte r2, char[] r3, int r4) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                handleThreeBytes(r0, r1, r2, r3, r4)
                return
        }

        private static void handleFourBytes(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L41
                int r0 = r2 << 28
                int r1 = r3 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r5)
                if (r0 != 0) goto L41
                r2 = r2 & 7
                int r2 = r2 << 18
                int r3 = trailingByteValue(r3)
                int r3 = r3 << 12
                r2 = r2 | r3
                int r3 = trailingByteValue(r4)
                int r3 = r3 << 6
                r2 = r2 | r3
                int r3 = trailingByteValue(r5)
                r2 = r2 | r3
                char r3 = highSurrogate(r2)
                r6[r7] = r3
                int r7 = r7 + 1
                char r2 = lowSurrogate(r2)
                r6[r7] = r2
                return
            L41:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r2
        }

        private static void handleOneByte(byte r0, char[] r1, int r2) {
                char r0 = (char) r0
                r1[r2] = r0
                return
        }

        private static void handleThreeBytes(byte r2, byte r3, byte r4, char[] r5, int r6) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L2e
                r0 = -32
                r1 = -96
                if (r2 != r0) goto Le
                if (r3 < r1) goto L2e
            Le:
                r0 = -19
                if (r2 != r0) goto L14
                if (r3 >= r1) goto L2e
            L14:
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L2e
                r2 = r2 & 15
                int r2 = r2 << 12
                int r3 = trailingByteValue(r3)
                int r3 = r3 << 6
                r2 = r2 | r3
                int r3 = trailingByteValue(r4)
                r2 = r2 | r3
                char r2 = (char) r2
                r5[r6] = r2
                return
            L2e:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r2
        }

        private static void handleTwoBytes(byte r1, byte r2, char[] r3, int r4) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r0 = -62
                if (r1 < r0) goto L17
                boolean r0 = isNotTrailingByte(r2)
                if (r0 != 0) goto L17
                r1 = r1 & 31
                int r1 = r1 << 6
                int r2 = trailingByteValue(r2)
                r1 = r1 | r2
                char r1 = (char) r1
                r3[r4] = r1
                return
            L17:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r1
        }

        private static char highSurrogate(int r1) {
                int r1 = r1 >>> 10
                r0 = 55232(0xd7c0, float:7.7397E-41)
                int r1 = r1 + r0
                char r1 = (char) r1
                return r1
        }

        private static boolean isNotTrailingByte(byte r1) {
                r0 = -65
                if (r1 <= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        private static boolean isOneByte(byte r0) {
                if (r0 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        private static boolean isThreeBytes(byte r1) {
                r0 = -16
                if (r1 >= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        private static boolean isTwoBytes(byte r1) {
                r0 = -32
                if (r1 >= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        private static char lowSurrogate(int r1) {
                r1 = r1 & 1023(0x3ff, float:1.434E-42)
                r0 = 56320(0xdc00, float:7.8921E-41)
                int r1 = r1 + r0
                char r1 = (char) r1
                return r1
        }

        private static int trailingByteValue(byte r0) {
                r0 = r0 & 63
                return r0
        }
    }

    static abstract class Processor {
        Processor() {
                r0 = this;
                r0.<init>()
                return
        }

        abstract java.lang.String decodeUtf8(byte[] r1, int r2, int r3) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

        abstract int encodeUtf8(java.lang.CharSequence r1, byte[] r2, int r3, int r4);

        final boolean isValidUtf8(byte[] r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                int r2 = r1.partialIsValidUtf8(r0, r2, r3, r4)
                if (r2 != 0) goto L8
                r0 = 1
            L8:
                return r0
        }

        abstract int partialIsValidUtf8(int r1, byte[] r2, int r3, int r4);
    }

    static final class SafeProcessor extends androidx.datastore.preferences.protobuf.Utf8.Processor {
        SafeProcessor() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partialIsValidUtf8(byte[] r1, int r2, int r3) {
            L0:
                if (r2 >= r3) goto L9
                r0 = r1[r2]
                if (r0 < 0) goto L9
                int r2 = r2 + 1
                goto L0
            L9:
                if (r2 < r3) goto Ld
                r1 = 0
                goto L11
            Ld:
                int r1 = partialIsValidUtf8NonAscii(r1, r2, r3)
            L11:
                return r1
        }

        private static int partialIsValidUtf8NonAscii(byte[] r6, int r7, int r8) {
            L0:
                if (r7 < r8) goto L4
                r6 = 0
                return r6
            L4:
                int r0 = r7 + 1
                r7 = r6[r7]
                if (r7 >= 0) goto L6a
                r1 = -32
                r2 = -1
                r3 = -65
                if (r7 >= r1) goto L1f
                if (r0 < r8) goto L14
                return r7
            L14:
                r1 = -62
                if (r7 < r1) goto L1e
                int r7 = r0 + 1
                r0 = r6[r0]
                if (r0 <= r3) goto L0
            L1e:
                return r2
            L1f:
                r4 = -16
                if (r7 >= r4) goto L45
                int r4 = r8 + (-1)
                if (r0 < r4) goto L2c
                int r6 = androidx.datastore.preferences.protobuf.Utf8.access$1100(r6, r0, r8)
                return r6
            L2c:
                int r4 = r0 + 1
                r0 = r6[r0]
                if (r0 > r3) goto L44
                r5 = -96
                if (r7 != r1) goto L38
                if (r0 < r5) goto L44
            L38:
                r1 = -19
                if (r7 != r1) goto L3e
                if (r0 >= r5) goto L44
            L3e:
                int r7 = r4 + 1
                r0 = r6[r4]
                if (r0 <= r3) goto L0
            L44:
                return r2
            L45:
                int r1 = r8 + (-2)
                if (r0 < r1) goto L4e
                int r6 = androidx.datastore.preferences.protobuf.Utf8.access$1100(r6, r0, r8)
                return r6
            L4e:
                int r1 = r0 + 1
                r0 = r6[r0]
                if (r0 > r3) goto L69
                int r7 = r7 << 28
                int r0 = r0 + 112
                int r7 = r7 + r0
                int r7 = r7 >> 30
                if (r7 != 0) goto L69
                int r7 = r1 + 1
                r0 = r6[r1]
                if (r0 > r3) goto L69
                int r0 = r7 + 1
                r7 = r6[r7]
                if (r7 <= r3) goto L6a
            L69:
                return r2
            L6a:
                r7 = r0
                goto L0
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] r12, int r13, int r14) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r11 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r13
                int r1 = r1 - r14
                r0 = r0 | r1
                r1 = 0
                r2 = 1
                if (r0 < 0) goto Lad
                int r0 = r13 + r14
                char[] r14 = new char[r14]
                r3 = 0
            Lf:
                if (r13 >= r0) goto L23
                r4 = r12[r13]
                boolean r5 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$400(r4)
                if (r5 != 0) goto L1a
                goto L23
            L1a:
                int r13 = r13 + 1
                int r5 = r3 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$500(r4, r14, r3)
                r3 = r5
                goto Lf
            L23:
                r8 = r3
            L24:
                if (r13 >= r0) goto La7
                int r3 = r13 + 1
                r13 = r12[r13]
                boolean r4 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$400(r13)
                if (r4 == 0) goto L4c
                int r4 = r8 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$500(r13, r14, r8)
            L35:
                if (r3 >= r0) goto L49
                r13 = r12[r3]
                boolean r5 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$400(r13)
                if (r5 != 0) goto L40
                goto L49
            L40:
                int r3 = r3 + 1
                int r5 = r4 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$500(r13, r14, r4)
                r4 = r5
                goto L35
            L49:
                r13 = r3
                r8 = r4
                goto L24
            L4c:
                boolean r4 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$600(r13)
                if (r4 == 0) goto L65
                if (r3 >= r0) goto L60
                int r4 = r3 + 1
                r3 = r12[r3]
                int r5 = r8 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$700(r13, r3, r14, r8)
                r13 = r4
                r8 = r5
                goto L24
            L60:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r12 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r12
            L65:
                boolean r4 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$800(r13)
                if (r4 == 0) goto L84
                int r4 = r0 + (-1)
                if (r3 >= r4) goto L7f
                int r4 = r3 + 1
                r3 = r12[r3]
                int r5 = r4 + 1
                r4 = r12[r4]
                int r6 = r8 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$900(r13, r3, r4, r14, r8)
                r13 = r5
                r8 = r6
                goto L24
            L7f:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r12 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r12
            L84:
                int r4 = r0 + (-2)
                if (r3 >= r4) goto La2
                int r4 = r3 + 1
                r5 = r12[r3]
                int r3 = r4 + 1
                r6 = r12[r4]
                int r9 = r3 + 1
                r7 = r12[r3]
                int r10 = r8 + 1
                r3 = r13
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r14
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$1000(r3, r4, r5, r6, r7, r8)
                int r10 = r10 + r2
                r13 = r9
                r8 = r10
                goto L24
            La2:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r12 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r12
            La7:
                java.lang.String r12 = new java.lang.String
                r12.<init>(r14, r1, r8)
                return r12
            Lad:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r3[r1] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
                r3[r2] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
                r13 = 2
                r3[r13] = r12
                java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
                java.lang.String r12 = java.lang.String.format(r12, r3)
                r0.<init>(r12)
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
                r7 = this;
                int r0 = r8.length()
                int r11 = r11 + r10
                r1 = 0
            L6:
                r2 = 128(0x80, float:1.794E-43)
                if (r1 >= r0) goto L1a
                int r3 = r1 + r10
                if (r3 >= r11) goto L1a
                char r4 = r8.charAt(r1)
                if (r4 >= r2) goto L1a
                byte r2 = (byte) r4
                r9[r3] = r2
                int r1 = r1 + 1
                goto L6
            L1a:
                if (r1 != r0) goto L1e
                int r10 = r10 + r0
                return r10
            L1e:
                int r10 = r10 + r1
            L1f:
                if (r1 >= r0) goto Lfd
                char r3 = r8.charAt(r1)
                if (r3 >= r2) goto L31
                if (r10 >= r11) goto L31
                int r4 = r10 + 1
                byte r3 = (byte) r3
                r9[r10] = r3
            L2e:
                r10 = r4
                goto Lb5
            L31:
                r4 = 2048(0x800, float:2.87E-42)
                if (r3 >= r4) goto L4b
                int r4 = r11 + (-2)
                if (r10 > r4) goto L4b
                int r4 = r10 + 1
                int r5 = r3 >>> 6
                r5 = r5 | 960(0x3c0, float:1.345E-42)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r4 + 1
                r3 = r3 & 63
                r3 = r3 | r2
                byte r3 = (byte) r3
                r9[r4] = r3
                goto Lb5
            L4b:
                r4 = 57343(0xdfff, float:8.0355E-41)
                r5 = 55296(0xd800, float:7.7486E-41)
                if (r3 < r5) goto L55
                if (r4 >= r3) goto L75
            L55:
                int r6 = r11 + (-3)
                if (r10 > r6) goto L75
                int r4 = r10 + 1
                int r5 = r3 >>> 12
                r5 = r5 | 480(0x1e0, float:6.73E-43)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r4 + 1
                int r5 = r3 >>> 6
                r5 = r5 & 63
                r5 = r5 | r2
                byte r5 = (byte) r5
                r9[r4] = r5
                int r4 = r10 + 1
                r3 = r3 & 63
                r3 = r3 | r2
                byte r3 = (byte) r3
                r9[r10] = r3
                goto L2e
            L75:
                int r6 = r11 + (-4)
                if (r10 > r6) goto Lc2
                int r4 = r1 + 1
                int r5 = r8.length()
                if (r4 == r5) goto Lba
                char r1 = r8.charAt(r4)
                boolean r5 = java.lang.Character.isSurrogatePair(r3, r1)
                if (r5 == 0) goto Lb9
                int r1 = java.lang.Character.toCodePoint(r3, r1)
                int r3 = r10 + 1
                int r5 = r1 >>> 18
                r5 = r5 | 240(0xf0, float:3.36E-43)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r3 + 1
                int r5 = r1 >>> 12
                r5 = r5 & 63
                r5 = r5 | r2
                byte r5 = (byte) r5
                r9[r3] = r5
                int r3 = r10 + 1
                int r5 = r1 >>> 6
                r5 = r5 & 63
                r5 = r5 | r2
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r3 + 1
                r1 = r1 & 63
                r1 = r1 | r2
                byte r1 = (byte) r1
                r9[r3] = r1
                r1 = r4
            Lb5:
                int r1 = r1 + 1
                goto L1f
            Lb9:
                r1 = r4
            Lba:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r8 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                int r1 = r1 + (-1)
                r8.<init>(r1, r0)
                throw r8
            Lc2:
                if (r5 > r3) goto Lde
                if (r3 > r4) goto Lde
                int r9 = r1 + 1
                int r11 = r8.length()
                if (r9 == r11) goto Ld8
                char r8 = r8.charAt(r9)
                boolean r8 = java.lang.Character.isSurrogatePair(r3, r8)
                if (r8 != 0) goto Lde
            Ld8:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r8 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                r8.<init>(r1, r0)
                throw r8
            Lde:
                java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "Failed writing "
                r9.append(r11)
                r9.append(r3)
                java.lang.String r11 = " at index "
                r9.append(r11)
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
            Lfd:
                return r10
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
        }
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    static final class UnsafeProcessor extends androidx.datastore.preferences.protobuf.Utf8.Processor {
        UnsafeProcessor() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isAvailable() {
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeArrayOperations()
                if (r0 == 0) goto Le
                boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations()
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        private static int partialIsValidUtf8(byte[] r8, long r9, int r11) {
                int r0 = unsafeEstimateConsecutiveAscii(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = unsafeIncompleteStateFor(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] r3, long r4, int r6) {
                r0 = 0
                r1 = 16
                if (r6 >= r1) goto L6
                return r0
            L6:
                if (r0 >= r6) goto L16
                r1 = 1
                long r1 = r1 + r4
                byte r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3, r4)
                if (r4 >= 0) goto L12
                return r0
            L12:
                int r0 = r0 + 1
                r4 = r1
                goto L6
            L16:
                return r6
        }

        private static int unsafeIncompleteStateFor(byte[] r2, int r3, long r4, int r6) {
                if (r6 == 0) goto L27
                r0 = 1
                if (r6 == r0) goto L1e
                r0 = 2
                if (r6 != r0) goto L18
                byte r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2, r4)
                r0 = 1
                long r4 = r4 + r0
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2, r4)
                int r2 = androidx.datastore.preferences.protobuf.Utf8.access$100(r3, r6, r2)
                return r2
            L18:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L1e:
                byte r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2, r4)
                int r2 = androidx.datastore.preferences.protobuf.Utf8.access$000(r3, r2)
                return r2
            L27:
                int r2 = androidx.datastore.preferences.protobuf.Utf8.access$1200(r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] r12, int r13, int r14) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r11 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r13
                int r1 = r1 - r14
                r0 = r0 | r1
                r1 = 0
                r2 = 1
                if (r0 < 0) goto Lc9
                int r0 = r13 + r14
                char[] r14 = new char[r14]
                r3 = 0
            Lf:
                if (r13 >= r0) goto L26
                long r4 = (long) r13
                byte r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r4)
                boolean r5 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$400(r4)
                if (r5 != 0) goto L1d
                goto L26
            L1d:
                int r13 = r13 + 1
                int r5 = r3 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$500(r4, r14, r3)
                r3 = r5
                goto Lf
            L26:
                r8 = r3
            L27:
                if (r13 >= r0) goto Lc3
                int r3 = r13 + 1
                long r4 = (long) r13
                byte r13 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r4)
                boolean r4 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$400(r13)
                if (r4 == 0) goto L55
                int r4 = r8 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$500(r13, r14, r8)
            L3b:
                if (r3 >= r0) goto L52
                long r5 = (long) r3
                byte r13 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r5)
                boolean r5 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$400(r13)
                if (r5 != 0) goto L49
                goto L52
            L49:
                int r3 = r3 + 1
                int r5 = r4 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$500(r13, r14, r4)
                r4 = r5
                goto L3b
            L52:
                r13 = r3
                r8 = r4
                goto L27
            L55:
                boolean r4 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$600(r13)
                if (r4 == 0) goto L71
                if (r3 >= r0) goto L6c
                int r4 = r3 + 1
                long r5 = (long) r3
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r5)
                int r5 = r8 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$700(r13, r3, r14, r8)
                r13 = r4
                r8 = r5
                goto L27
            L6c:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r12 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r12
            L71:
                boolean r4 = androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$800(r13)
                if (r4 == 0) goto L96
                int r4 = r0 + (-1)
                if (r3 >= r4) goto L91
                int r4 = r3 + 1
                long r5 = (long) r3
                byte r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r5)
                int r5 = r4 + 1
                long r6 = (long) r4
                byte r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r6)
                int r6 = r8 + 1
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$900(r13, r3, r4, r14, r8)
                r13 = r5
                r8 = r6
                goto L27
            L91:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r12 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r12
            L96:
                int r4 = r0 + (-2)
                if (r3 >= r4) goto Lbe
                int r4 = r3 + 1
                long r5 = (long) r3
                byte r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r5)
                int r3 = r4 + 1
                long r6 = (long) r4
                byte r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r6)
                int r9 = r3 + 1
                long r3 = (long) r3
                byte r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r3)
                int r10 = r8 + 1
                r3 = r13
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r14
                androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.access$1000(r3, r4, r5, r6, r7, r8)
                int r10 = r10 + r2
                r13 = r9
                r8 = r10
                goto L27
            Lbe:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r12 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r12
            Lc3:
                java.lang.String r12 = new java.lang.String
                r12.<init>(r14, r1, r8)
                return r12
            Lc9:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r3[r1] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
                r3[r2] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
                r13 = 2
                r3[r13] = r12
                java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
                java.lang.String r12 = java.lang.String.format(r12, r3)
                r0.<init>(r12)
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
                r22 = this;
                r0 = r23
                r1 = r24
                r2 = r25
                r3 = r26
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r23.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L144
                r2 = 0
            L1a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L2f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L2f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L1a
            L2f:
                if (r2 != r8) goto L33
                int r0 = (int) r4
                return r0
            L33:
                if (r2 >= r8) goto L142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L4b
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L4b
                long r14 = r4 + r11
                byte r13 = (byte) r13
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r4, r13)
                r4 = r11
                r12 = r14
            L47:
                r11 = 128(0x80, float:1.794E-43)
                goto Lfb
            L4b:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L75
                r14 = 2
                long r14 = r6 - r14
                int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r16 > 0) goto L75
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r14, r5)
                r20 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r20
                goto Lfb
            L75:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L7f
                if (r3 >= r13) goto Lae
            L7f:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto Lae
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r14, r5)
                r14 = 1
                long r18 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r3, r5)
                r12 = r18
                r4 = 1
                goto L47
            Lae:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L10f
                int r3 = r2 + 1
                if (r3 == r8) goto L107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                androidx.datastore.preferences.protobuf.UnsafeUtil.putByte(r1, r14, r2)
                r2 = r3
            Lfb:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                r20 = r4
                r4 = r12
                r11 = r20
                goto L33
            L106:
                r2 = r3
            L107:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r0 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r2 + (-1)
                r0.<init>(r2, r8)
                throw r0
            L10f:
                if (r14 > r13) goto L127
                if (r13 > r3) goto L127
                int r1 = r2 + 1
                if (r1 == r8) goto L121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L127
            L121:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r0 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r2, r8)
                throw r0
            L127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L142:
                int r0 = (int) r4
                return r0
            L144:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                int r8 = r8 + (-1)
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
                r11 = this;
                r0 = r14 | r15
                int r1 = r13.length
                int r1 = r1 - r15
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto La8
                long r2 = (long) r14
                long r14 = (long) r15
                if (r12 == 0) goto La1
                int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r0 < 0) goto L11
                return r12
            L11:
                byte r0 = (byte) r12
                r4 = -32
                r5 = -1
                r6 = -65
                r7 = 1
                if (r0 >= r4) goto L2b
                r12 = -62
                if (r0 < r12) goto L2a
                long r7 = r7 + r2
                byte r12 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r2)
                if (r12 <= r6) goto L27
                goto L2a
            L27:
                r2 = r7
                goto La1
            L2a:
                return r5
            L2b:
                r9 = -16
                if (r0 >= r9) goto L5f
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L45
                long r9 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r2)
                int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r1 < 0) goto L44
                int r12 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r12)
                return r12
            L44:
                r2 = r9
            L45:
                if (r12 > r6) goto L5e
                r1 = -96
                if (r0 != r4) goto L4d
                if (r12 < r1) goto L5e
            L4d:
                r4 = -19
                if (r0 != r4) goto L53
                if (r12 >= r1) goto L5e
            L53:
                long r0 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r2)
                if (r12 <= r6) goto L5c
                goto L5e
            L5c:
                r2 = r0
                goto La1
            L5e:
                return r5
            L5f:
                int r4 = r12 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L76
                long r9 = r2 + r7
                byte r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L74
                int r12 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r4)
                return r12
            L74:
                r2 = r9
                goto L79
            L76:
                int r12 = r12 >> 16
                byte r1 = (byte) r12
            L79:
                if (r1 != 0) goto L8b
                long r9 = r2 + r7
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L8a
                int r12 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r4, r1)
                return r12
            L8a:
                r2 = r9
            L8b:
                if (r4 > r6) goto La0
                int r12 = r0 << 28
                int r4 = r4 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto La0
                if (r1 > r6) goto La0
                long r0 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r2)
                if (r12 <= r6) goto L5c
            La0:
                return r5
            La1:
                long r14 = r14 - r2
                int r12 = (int) r14
                int r12 = partialIsValidUtf8(r13, r2, r12)
                return r12
            La8:
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r1] = r13
                r13 = 1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r13] = r14
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                r0[r13] = r14
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r13 = java.lang.String.format(r13, r0)
                r12.<init>(r13)
                throw r12
        }
    }

    static {
            boolean r0 = androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.isAvailable()
            if (r0 == 0) goto L12
            boolean r0 = androidx.datastore.preferences.protobuf.Android.isOnAndroidDevice()
            if (r0 != 0) goto L12
            androidx.datastore.preferences.protobuf.Utf8$UnsafeProcessor r0 = new androidx.datastore.preferences.protobuf.Utf8$UnsafeProcessor
            r0.<init>()
            goto L17
        L12:
            androidx.datastore.preferences.protobuf.Utf8$SafeProcessor r0 = new androidx.datastore.preferences.protobuf.Utf8$SafeProcessor
            r0.<init>()
        L17:
            androidx.datastore.preferences.protobuf.Utf8.processor = r0
            return
    }

    static /* synthetic */ int access$000(int r0, int r1) {
            int r0 = incompleteStateFor(r0, r1)
            return r0
    }

    static /* synthetic */ int access$100(int r0, int r1, int r2) {
            int r0 = incompleteStateFor(r0, r1, r2)
            return r0
    }

    static /* synthetic */ int access$1100(byte[] r0, int r1, int r2) {
            int r0 = incompleteStateFor(r0, r1, r2)
            return r0
    }

    static /* synthetic */ int access$1200(int r0) {
            int r0 = incompleteStateFor(r0)
            return r0
    }

    static java.lang.String decodeUtf8(byte[] r1, int r2, int r3) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            androidx.datastore.preferences.protobuf.Utf8$Processor r0 = androidx.datastore.preferences.protobuf.Utf8.processor
            java.lang.String r1 = r0.decodeUtf8(r1, r2, r3)
            return r1
    }

    static int encode(java.lang.CharSequence r1, byte[] r2, int r3, int r4) {
            androidx.datastore.preferences.protobuf.Utf8$Processor r0 = androidx.datastore.preferences.protobuf.Utf8.processor
            int r1 = r0.encodeUtf8(r1, r2, r3, r4)
            return r1
    }

    static int encodedLength(java.lang.CharSequence r5) {
            int r0 = r5.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            char r2 = r5.charAt(r1)
            r3 = 128(0x80, float:1.794E-43)
            if (r2 >= r3) goto L12
            int r1 = r1 + 1
            goto L5
        L12:
            r2 = r0
        L13:
            if (r1 >= r0) goto L2a
            char r3 = r5.charAt(r1)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L25
            int r3 = 127 - r3
            int r3 = r3 >>> 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L13
        L25:
            int r5 = encodedLengthGeneral(r5, r1)
            int r2 = r2 + r5
        L2a:
            if (r2 < r0) goto L2d
            return r2
        L2d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "UTF-8 length does not fit in int: "
            r0.append(r1)
            long r1 = (long) r2
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    private static int encodedLengthGeneral(java.lang.CharSequence r4, int r5) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r5 >= r0) goto L35
            char r2 = r4.charAt(r5)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L15
            int r2 = 127 - r2
            int r2 = r2 >>> 31
            int r1 = r1 + r2
            goto L32
        L15:
            int r1 = r1 + 2
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r2) goto L32
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 > r3) goto L32
            int r2 = java.lang.Character.codePointAt(r4, r5)
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r2 < r3) goto L2c
            int r5 = r5 + 1
            goto L32
        L2c:
            androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r4 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
            r4.<init>(r5, r0)
            throw r4
        L32:
            int r5 = r5 + 1
            goto L5
        L35:
            return r1
    }

    private static int incompleteStateFor(int r1) {
            r0 = -12
            if (r1 <= r0) goto L5
            r1 = -1
        L5:
            return r1
    }

    private static int incompleteStateFor(int r1, int r2) {
            r0 = -12
            if (r1 > r0) goto Ld
            r0 = -65
            if (r2 <= r0) goto L9
            goto Ld
        L9:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            goto Le
        Ld:
            r1 = -1
        Le:
            return r1
    }

    private static int incompleteStateFor(int r1, int r2, int r3) {
            r0 = -12
            if (r1 > r0) goto L12
            r0 = -65
            if (r2 > r0) goto L12
            if (r3 <= r0) goto Lb
            goto L12
        Lb:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            int r2 = r3 << 16
            r1 = r1 ^ r2
            goto L13
        L12:
            r1 = -1
        L13:
            return r1
    }

    private static int incompleteStateFor(byte[] r3, int r4, int r5) {
            int r0 = r4 + (-1)
            r0 = r3[r0]
            int r5 = r5 - r4
            if (r5 == 0) goto L24
            r1 = 1
            if (r5 == r1) goto L1d
            r2 = 2
            if (r5 != r2) goto L17
            r5 = r3[r4]
            int r4 = r4 + r1
            r3 = r3[r4]
            int r3 = incompleteStateFor(r0, r5, r3)
            return r3
        L17:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L1d:
            r3 = r3[r4]
            int r3 = incompleteStateFor(r0, r3)
            return r3
        L24:
            int r3 = incompleteStateFor(r0)
            return r3
    }

    public static boolean isValidUtf8(byte[] r3) {
            androidx.datastore.preferences.protobuf.Utf8$Processor r0 = androidx.datastore.preferences.protobuf.Utf8.processor
            int r1 = r3.length
            r2 = 0
            boolean r3 = r0.isValidUtf8(r3, r2, r1)
            return r3
    }

    public static boolean isValidUtf8(byte[] r1, int r2, int r3) {
            androidx.datastore.preferences.protobuf.Utf8$Processor r0 = androidx.datastore.preferences.protobuf.Utf8.processor
            boolean r1 = r0.isValidUtf8(r1, r2, r3)
            return r1
    }
}
