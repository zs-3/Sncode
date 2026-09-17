package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class BinaryReader implements androidx.datastore.preferences.protobuf.Reader {

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La8
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                return
        }
    }

    private static final class SafeHeapReader extends androidx.datastore.preferences.protobuf.BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(java.nio.ByteBuffer r2, boolean r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.bufferIsImmutable = r3
                byte[] r3 = r2.array()
                r1.buffer = r3
                int r3 = r2.arrayOffset()
                int r0 = r2.position()
                int r3 = r3 + r0
                r1.pos = r3
                r1.initialPos = r3
                int r3 = r2.arrayOffset()
                int r2 = r2.limit()
                int r3 = r3 + r2
                r1.limit = r3
                return
        }

        private boolean isAtEnd() {
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

        private byte readByte() throws java.io.IOException {
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

        private java.lang.Object readField(androidx.datastore.preferences.protobuf.WireFormat.FieldType r2, java.lang.Class<?> r3, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                r1 = this;
                int[] r0 = androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
                int r2 = r2.ordinal()
                r2 = r0[r2]
                switch(r2) {
                    case 1: goto L97;
                    case 2: goto L92;
                    case 3: goto L89;
                    case 4: goto L80;
                    case 5: goto L77;
                    case 6: goto L6e;
                    case 7: goto L65;
                    case 8: goto L5c;
                    case 9: goto L53;
                    case 10: goto L4e;
                    case 11: goto L45;
                    case 12: goto L3c;
                    case 13: goto L33;
                    case 14: goto L2a;
                    case 15: goto L25;
                    case 16: goto L1c;
                    case 17: goto L13;
                    default: goto Lb;
                }
            Lb:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "unsupported field type."
                r2.<init>(r3)
                throw r2
            L13:
                long r2 = r1.readUInt64()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                return r2
            L1c:
                int r2 = r1.readUInt32()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L25:
                java.lang.String r2 = r1.readStringRequireUtf8()
                return r2
            L2a:
                long r2 = r1.readSInt64()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                return r2
            L33:
                int r2 = r1.readSInt32()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L3c:
                long r2 = r1.readSFixed64()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                return r2
            L45:
                int r2 = r1.readSFixed32()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L4e:
                java.lang.Object r2 = r1.readMessage(r3, r4)
                return r2
            L53:
                long r2 = r1.readInt64()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                return r2
            L5c:
                int r2 = r1.readInt32()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L65:
                float r2 = r1.readFloat()
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
            L6e:
                long r2 = r1.readFixed64()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                return r2
            L77:
                int r2 = r1.readFixed32()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L80:
                int r2 = r1.readEnum()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
            L89:
                double r2 = r1.readDouble()
                java.lang.Double r2 = java.lang.Double.valueOf(r2)
                return r2
            L92:
                androidx.datastore.preferences.protobuf.ByteString r2 = r1.readBytes()
                return r2
            L97:
                boolean r2 = r1.readBool()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
        }

        private <T> T readGroup(androidx.datastore.preferences.protobuf.Schema<T> r4, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.endGroupTag
                int r1 = r3.tag
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r1)
                r2 = 4
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r1, r2)
                r3.endGroupTag = r1
                java.lang.Object r1 = r4.newInstance()     // Catch: java.lang.Throwable -> L27
                r4.mergeFrom(r1, r3, r5)     // Catch: java.lang.Throwable -> L27
                r4.makeImmutable(r1)     // Catch: java.lang.Throwable -> L27
                int r4 = r3.tag     // Catch: java.lang.Throwable -> L27
                int r5 = r3.endGroupTag     // Catch: java.lang.Throwable -> L27
                if (r4 != r5) goto L22
                r3.endGroupTag = r0
                return r1
            L22:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()     // Catch: java.lang.Throwable -> L27
                throw r4     // Catch: java.lang.Throwable -> L27
            L27:
                r4 = move-exception
                r3.endGroupTag = r0
                throw r4
        }

        private int readLittleEndian32() throws java.io.IOException {
                r1 = this;
                r0 = 4
                r1.requireBytes(r0)
                int r0 = r1.readLittleEndian32_NoCheck()
                return r0
        }

        private int readLittleEndian32_NoCheck() {
                r4 = this;
                int r0 = r4.pos
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

        private long readLittleEndian64() throws java.io.IOException {
                r2 = this;
                r0 = 8
                r2.requireBytes(r0)
                long r0 = r2.readLittleEndian64_NoCheck()
                return r0
        }

        private long readLittleEndian64_NoCheck() {
                r9 = this;
                int r0 = r9.pos
                byte[] r1 = r9.buffer
                int r2 = r0 + 8
                r9.pos = r2
                r2 = r1[r0]
                long r2 = (long) r2
                r4 = 255(0xff, double:1.26E-321)
                long r2 = r2 & r4
                int r6 = r0 + 1
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 8
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 2
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 16
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 3
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 24
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 4
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 32
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 5
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 40
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r6 = r0 + 6
                r6 = r1[r6]
                long r6 = (long) r6
                long r6 = r6 & r4
                r8 = 48
                long r6 = r6 << r8
                long r2 = r2 | r6
                int r0 = r0 + 7
                r0 = r1[r0]
                long r0 = (long) r0
                long r0 = r0 & r4
                r4 = 56
                long r0 = r0 << r4
                long r0 = r0 | r2
                return r0
        }

        private <T> T readMessage(androidx.datastore.preferences.protobuf.Schema<T> r4, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.readVarint32()
                r3.requireBytes(r0)
                int r1 = r3.limit
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.limit = r2
                java.lang.Object r0 = r4.newInstance()     // Catch: java.lang.Throwable -> L24
                r4.mergeFrom(r0, r3, r5)     // Catch: java.lang.Throwable -> L24
                r4.makeImmutable(r0)     // Catch: java.lang.Throwable -> L24
                int r4 = r3.pos     // Catch: java.lang.Throwable -> L24
                if (r4 != r2) goto L1f
                r3.limit = r1
                return r0
            L1f:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()     // Catch: java.lang.Throwable -> L24
                throw r4     // Catch: java.lang.Throwable -> L24
            L24:
                r4 = move-exception
                r3.limit = r1
                throw r4
        }

        private int readVarint32() throws java.io.IOException {
                r5 = this;
                int r0 = r5.pos
                int r1 = r5.limit
                if (r1 == r0) goto L77
                byte[] r2 = r5.buffer
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L11
                r5.pos = r3
                return r0
            L11:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1c
                long r0 = r5.readVarint64SlowPath()
                int r1 = (int) r0
                return r1
            L1c:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L28
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L74
            L28:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L35
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L33:
                r1 = r3
                goto L74
            L35:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L43
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L74
            L43:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L33
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L74
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L33
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L74
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L33
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 < 0) goto L6f
                goto L74
            L6f:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
            L74:
                r5.pos = r1
                return r0
            L77:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        private long readVarint64SlowPath() throws java.io.IOException {
                r6 = this;
                r0 = 0
                r2 = 0
            L3:
                r3 = 64
                if (r2 >= r3) goto L18
                byte r3 = r6.readByte()
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

        private void requireBytes(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto La
                int r0 = r2.limit
                int r1 = r2.pos
                int r0 = r0 - r1
                if (r3 > r0) goto La
                return
            La:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r3
        }

        private void requirePosition(int r2) throws java.io.IOException {
                r1 = this;
                int r0 = r1.pos
                if (r0 != r2) goto L5
                return
            L5:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r2
        }

        private void requireWireType(int r2) throws java.io.IOException {
                r1 = this;
                int r0 = r1.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 != r2) goto L9
                return
            L9:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r2
        }

        private void skipBytes(int r2) throws java.io.IOException {
                r1 = this;
                r1.requireBytes(r2)
                int r0 = r1.pos
                int r0 = r0 + r2
                r1.pos = r0
                return
        }

        private void skipGroup() throws java.io.IOException {
                r3 = this;
                int r0 = r3.endGroupTag
                int r1 = r3.tag
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r1)
                r2 = 4
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.makeTag(r1, r2)
                r3.endGroupTag = r1
            Lf:
                int r1 = r3.getFieldNumber()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L1e
                boolean r1 = r3.skipField()
                if (r1 != 0) goto Lf
            L1e:
                int r1 = r3.tag
                int r2 = r3.endGroupTag
                if (r1 != r2) goto L27
                r3.endGroupTag = r0
                return
            L27:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r0
        }

        private void skipVarint() throws java.io.IOException {
                r5 = this;
                int r0 = r5.limit
                int r1 = r5.pos
                int r0 = r0 - r1
                r2 = 10
                if (r0 < r2) goto L1b
                byte[] r0 = r5.buffer
                r3 = 0
            Lc:
                if (r3 >= r2) goto L1b
                int r4 = r1 + 1
                r1 = r0[r1]
                if (r1 < 0) goto L17
                r5.pos = r4
                return
            L17:
                int r3 = r3 + 1
                r1 = r4
                goto Lc
            L1b:
                r5.skipVarintSlowPath()
                return
        }

        private void skipVarintSlowPath() throws java.io.IOException {
                r2 = this;
                r0 = 0
            L1:
                r1 = 10
                if (r0 >= r1) goto Lf
                byte r1 = r2.readByte()
                if (r1 < 0) goto Lc
                return
            Lc:
                int r0 = r0 + 1
                goto L1
            Lf:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
        }

        private void verifyPackedFixed32Length(int r1) throws java.io.IOException {
                r0 = this;
                r0.requireBytes(r1)
                r1 = r1 & 3
                if (r1 != 0) goto L8
                return
            L8:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r1
        }

        private void verifyPackedFixed64Length(int r1) throws java.io.IOException {
                r0 = this;
                r0.requireBytes(r1)
                r1 = r1 & 7
                if (r1 != 0) goto L8
                return
            L8:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r1
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int getFieldNumber() throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isAtEnd()
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == 0) goto La
                return r1
            La:
                int r0 = r3.readVarint32()
                r3.tag = r0
                int r2 = r3.endGroupTag
                if (r0 != r2) goto L15
                return r1
            L15:
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int getTag() {
                r1 = this;
                int r0 = r1.tag
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public boolean readBool() throws java.io.IOException {
                r2 = this;
                r0 = 0
                r2.requireWireType(r0)
                int r1 = r2.readVarint32()
                if (r1 == 0) goto Lb
                r0 = 1
            Lb:
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readBoolList(java.util.List<java.lang.Boolean> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.BooleanArrayList
                r1 = 1
                r2 = 0
                r3 = 2
                if (r0 == 0) goto L50
                r0 = r5
                androidx.datastore.preferences.protobuf.BooleanArrayList r0 = (androidx.datastore.preferences.protobuf.BooleanArrayList) r0
                int r5 = r4.tag
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                if (r5 == 0) goto L35
                if (r5 != r3) goto L30
                int r5 = r4.readVarint32()
                int r3 = r4.pos
                int r3 = r3 + r5
            L1b:
                int r5 = r4.pos
                if (r5 >= r3) goto L2c
                int r5 = r4.readVarint32()
                if (r5 == 0) goto L27
                r5 = 1
                goto L28
            L27:
                r5 = 0
            L28:
                r0.addBoolean(r5)
                goto L1b
            L2c:
                r4.requirePosition(r3)
                goto L79
            L30:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L35:
                boolean r5 = r4.readBool()
                r0.addBoolean(r5)
                boolean r5 = r4.isAtEnd()
                if (r5 == 0) goto L43
                return
            L43:
                int r5 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L35
                r4.pos = r5
                return
            L50:
                int r0 = r4.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == 0) goto L7f
                if (r0 != r3) goto L7a
                int r0 = r4.readVarint32()
                int r3 = r4.pos
                int r3 = r3 + r0
            L61:
                int r0 = r4.pos
                if (r0 >= r3) goto L76
                int r0 = r4.readVarint32()
                if (r0 == 0) goto L6d
                r0 = 1
                goto L6e
            L6d:
                r0 = 0
            L6e:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r5.add(r0)
                goto L61
            L76:
                r4.requirePosition(r3)
            L79:
                return
            L7a:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L7f:
                boolean r0 = r4.readBool()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L91
                return
            L91:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L7f
                r4.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
                r3 = this;
                r0 = 2
                r3.requireWireType(r0)
                int r0 = r3.readVarint32()
                if (r0 != 0) goto Ld
                androidx.datastore.preferences.protobuf.ByteString r0 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
                return r0
            Ld:
                r3.requireBytes(r0)
                boolean r1 = r3.bufferIsImmutable
                if (r1 == 0) goto L1d
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.wrap(r1, r2, r0)
                goto L25
            L1d:
                byte[] r1 = r3.buffer
                int r2 = r3.pos
                androidx.datastore.preferences.protobuf.ByteString r1 = androidx.datastore.preferences.protobuf.ByteString.copyFrom(r1, r2, r0)
            L25:
                int r2 = r3.pos
                int r2 = r2 + r0
                r3.pos = r2
                return r1
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readBytesList(java.util.List<androidx.datastore.preferences.protobuf.ByteString> r4) throws java.io.IOException {
                r3 = this;
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                r1 = 2
                if (r0 != r1) goto L24
            L9:
                androidx.datastore.preferences.protobuf.ByteString r0 = r3.readBytes()
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L17
                return
            L17:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L9
                r3.pos = r0
                return
            L24:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public double readDouble() throws java.io.IOException {
                r2 = this;
                r0 = 1
                r2.requireWireType(r0)
                long r0 = r2.readLittleEndian64()
                double r0 = java.lang.Double.longBitsToDouble(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readDoubleList(java.util.List<java.lang.Double> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.DoubleArrayList
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L4d
                r0 = r5
                androidx.datastore.preferences.protobuf.DoubleArrayList r0 = (androidx.datastore.preferences.protobuf.DoubleArrayList) r0
                int r5 = r4.tag
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                if (r5 == r2) goto L32
                if (r5 != r1) goto L2d
                int r5 = r4.readVarint32()
                r4.verifyPackedFixed64Length(r5)
                int r1 = r4.pos
                int r1 = r1 + r5
            L1d:
                int r5 = r4.pos
                if (r5 >= r1) goto L75
                long r2 = r4.readLittleEndian64_NoCheck()
                double r2 = java.lang.Double.longBitsToDouble(r2)
                r0.addDouble(r2)
                goto L1d
            L2d:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L32:
                double r1 = r4.readDouble()
                r0.addDouble(r1)
                boolean r5 = r4.isAtEnd()
                if (r5 == 0) goto L40
                return
            L40:
                int r5 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L32
                r4.pos = r5
                return
            L4d:
                int r0 = r4.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L7b
                if (r0 != r1) goto L76
                int r0 = r4.readVarint32()
                r4.verifyPackedFixed64Length(r0)
                int r1 = r4.pos
                int r1 = r1 + r0
            L61:
                int r0 = r4.pos
                if (r0 >= r1) goto L75
                long r2 = r4.readLittleEndian64_NoCheck()
                double r2 = java.lang.Double.longBitsToDouble(r2)
                java.lang.Double r0 = java.lang.Double.valueOf(r2)
                r5.add(r0)
                goto L61
            L75:
                return
            L76:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L7b:
                double r0 = r4.readDouble()
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L8d
                return
            L8d:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L7b
                r4.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readEnum() throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.requireWireType(r0)
                int r0 = r1.readVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readEnumList(java.util.List<java.lang.Integer> r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
                r1 = 2
                if (r0 == 0) goto L45
                r0 = r4
                androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
                int r4 = r3.tag
                int r4 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r4)
                if (r4 == 0) goto L2a
                if (r4 != r1) goto L25
                int r4 = r3.readVarint32()
                int r1 = r3.pos
                int r1 = r1 + r4
            L19:
                int r4 = r3.pos
                if (r4 >= r1) goto L66
                int r4 = r3.readVarint32()
                r0.addInt(r4)
                goto L19
            L25:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L2a:
                int r4 = r3.readEnum()
                r0.addInt(r4)
                boolean r4 = r3.isAtEnd()
                if (r4 == 0) goto L38
                return
            L38:
                int r4 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L2a
                r3.pos = r4
                return
            L45:
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == 0) goto L6c
                if (r0 != r1) goto L67
                int r0 = r3.readVarint32()
                int r1 = r3.pos
                int r1 = r1 + r0
            L56:
                int r0 = r3.pos
                if (r0 >= r1) goto L66
                int r0 = r3.readVarint32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                goto L56
            L66:
                return
            L67:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L6c:
                int r0 = r3.readEnum()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L7e
                return
            L7e:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L6c
                r3.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readFixed32() throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.requireWireType(r0)
                int r0 = r1.readLittleEndian32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFixed32List(java.util.List<java.lang.Integer> r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
                r1 = 5
                r2 = 2
                if (r0 == 0) goto L48
                androidx.datastore.preferences.protobuf.IntArrayList r4 = (androidx.datastore.preferences.protobuf.IntArrayList) r4
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L32
                if (r0 != r1) goto L2d
            L12:
                int r0 = r3.readFixed32()
                r4.addInt(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L20
                return
            L20:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L12
                r3.pos = r0
                return
            L2d:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L32:
                int r0 = r3.readVarint32()
                r3.verifyPackedFixed32Length(r0)
                int r1 = r3.pos
                int r1 = r1 + r0
            L3c:
                int r0 = r3.pos
                if (r0 >= r1) goto L90
                int r0 = r3.readLittleEndian32_NoCheck()
                r4.addInt(r0)
                goto L3c
            L48:
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L76
                if (r0 != r1) goto L71
            L52:
                int r0 = r3.readFixed32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L64
                return
            L64:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L52
                r3.pos = r0
                return
            L71:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L76:
                int r0 = r3.readVarint32()
                r3.verifyPackedFixed32Length(r0)
                int r1 = r3.pos
                int r1 = r1 + r0
            L80:
                int r0 = r3.pos
                if (r0 >= r1) goto L90
                int r0 = r3.readLittleEndian32_NoCheck()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                goto L80
            L90:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readFixed64() throws java.io.IOException {
                r2 = this;
                r0 = 1
                r2.requireWireType(r0)
                long r0 = r2.readLittleEndian64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFixed64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L49
                r0 = r5
                androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
                int r5 = r4.tag
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                if (r5 == r2) goto L2e
                if (r5 != r1) goto L29
                int r5 = r4.readVarint32()
                r4.verifyPackedFixed64Length(r5)
                int r1 = r4.pos
                int r1 = r1 + r5
            L1d:
                int r5 = r4.pos
                if (r5 >= r1) goto L6d
                long r2 = r4.readLittleEndian64_NoCheck()
                r0.addLong(r2)
                goto L1d
            L29:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L2e:
                long r1 = r4.readFixed64()
                r0.addLong(r1)
                boolean r5 = r4.isAtEnd()
                if (r5 == 0) goto L3c
                return
            L3c:
                int r5 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L2e
                r4.pos = r5
                return
            L49:
                int r0 = r4.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L73
                if (r0 != r1) goto L6e
                int r0 = r4.readVarint32()
                r4.verifyPackedFixed64Length(r0)
                int r1 = r4.pos
                int r1 = r1 + r0
            L5d:
                int r0 = r4.pos
                if (r0 >= r1) goto L6d
                long r2 = r4.readLittleEndian64_NoCheck()
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r5.add(r0)
                goto L5d
            L6d:
                return
            L6e:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L73:
                long r0 = r4.readFixed64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L73
                r4.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public float readFloat() throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.requireWireType(r0)
                int r0 = r1.readLittleEndian32()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readFloatList(java.util.List<java.lang.Float> r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.FloatArrayList
                r1 = 5
                r2 = 2
                if (r0 == 0) goto L4c
                androidx.datastore.preferences.protobuf.FloatArrayList r4 = (androidx.datastore.preferences.protobuf.FloatArrayList) r4
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L32
                if (r0 != r1) goto L2d
            L12:
                float r0 = r3.readFloat()
                r4.addFloat(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L20
                return
            L20:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L12
                r3.pos = r0
                return
            L2d:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L32:
                int r0 = r3.readVarint32()
                r3.verifyPackedFixed32Length(r0)
                int r1 = r3.pos
                int r1 = r1 + r0
            L3c:
                int r0 = r3.pos
                if (r0 >= r1) goto L98
                int r0 = r3.readLittleEndian32_NoCheck()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                r4.addFloat(r0)
                goto L3c
            L4c:
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L7a
                if (r0 != r1) goto L75
            L56:
                float r0 = r3.readFloat()
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L68
                return
            L68:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L56
                r3.pos = r0
                return
            L75:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L7a:
                int r0 = r3.readVarint32()
                r3.verifyPackedFixed32Length(r0)
                int r1 = r3.pos
                int r1 = r1 + r0
            L84:
                int r0 = r3.pos
                if (r0 >= r1) goto L98
                int r0 = r3.readLittleEndian32_NoCheck()
                float r0 = java.lang.Float.intBitsToFloat(r0)
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r4.add(r0)
                goto L84
            L98:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readGroup(java.lang.Class<T> r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 3
                r1.requireWireType(r0)
                androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
                androidx.datastore.preferences.protobuf.Schema r2 = r0.schemaFor(r2)
                java.lang.Object r2 = r1.readGroup(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readGroupBySchemaWithCheck(androidx.datastore.preferences.protobuf.Schema<T> r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 3
                r1.requireWireType(r0)
                java.lang.Object r2 = r1.readGroup(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void readGroupList(java.util.List<T> r4, androidx.datastore.preferences.protobuf.Schema<T> r5, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                r1 = 3
                if (r0 != r1) goto L24
                int r0 = r3.tag
            Lb:
                java.lang.Object r1 = r3.readGroup(r5, r6)
                r4.add(r1)
                boolean r1 = r3.isAtEnd()
                if (r1 == 0) goto L19
                return
            L19:
                int r1 = r3.pos
                int r2 = r3.readVarint32()
                if (r2 == r0) goto Lb
                r3.pos = r1
                return
            L24:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readInt32() throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.requireWireType(r0)
                int r0 = r1.readVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readInt32List(java.util.List<java.lang.Integer> r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
                r1 = 2
                if (r0 == 0) goto L49
                r0 = r4
                androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
                int r4 = r3.tag
                int r4 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r4)
                if (r4 == 0) goto L2e
                if (r4 != r1) goto L29
                int r4 = r3.readVarint32()
                int r1 = r3.pos
                int r1 = r1 + r4
            L19:
                int r4 = r3.pos
                if (r4 >= r1) goto L25
                int r4 = r3.readVarint32()
                r0.addInt(r4)
                goto L19
            L25:
                r3.requirePosition(r1)
                goto L6d
            L29:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L2e:
                int r4 = r3.readInt32()
                r0.addInt(r4)
                boolean r4 = r3.isAtEnd()
                if (r4 == 0) goto L3c
                return
            L3c:
                int r4 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L2e
                r3.pos = r4
                return
            L49:
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == 0) goto L73
                if (r0 != r1) goto L6e
                int r0 = r3.readVarint32()
                int r1 = r3.pos
                int r1 = r1 + r0
            L5a:
                int r0 = r3.pos
                if (r0 >= r1) goto L6a
                int r0 = r3.readVarint32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                goto L5a
            L6a:
                r3.requirePosition(r1)
            L6d:
                return
            L6e:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L73:
                int r0 = r3.readInt32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L73
                r3.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readInt64() throws java.io.IOException {
                r2 = this;
                r0 = 0
                r2.requireWireType(r0)
                long r0 = r2.readVarint64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readInt64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
                r1 = 2
                if (r0 == 0) goto L49
                r0 = r5
                androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
                int r5 = r4.tag
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                if (r5 == 0) goto L2e
                if (r5 != r1) goto L29
                int r5 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r5
            L19:
                int r5 = r4.pos
                if (r5 >= r1) goto L25
                long r2 = r4.readVarint64()
                r0.addLong(r2)
                goto L19
            L25:
                r4.requirePosition(r1)
                goto L6d
            L29:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L2e:
                long r1 = r4.readInt64()
                r0.addLong(r1)
                boolean r5 = r4.isAtEnd()
                if (r5 == 0) goto L3c
                return
            L3c:
                int r5 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L2e
                r4.pos = r5
                return
            L49:
                int r0 = r4.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == 0) goto L73
                if (r0 != r1) goto L6e
                int r0 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r0
            L5a:
                int r0 = r4.pos
                if (r0 >= r1) goto L6a
                long r2 = r4.readVarint64()
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r5.add(r0)
                goto L5a
            L6a:
                r4.requirePosition(r1)
            L6d:
                return
            L6e:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L73:
                long r0 = r4.readInt64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L73
                r4.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <K, V> void readMap(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> r9, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r10) throws java.io.IOException {
                r7 = this;
                r0 = 2
                r7.requireWireType(r0)
                int r1 = r7.readVarint32()
                r7.requireBytes(r1)
                int r2 = r7.limit
                int r3 = r7.pos
                int r3 = r3 + r1
                r7.limit = r3
                K r1 = r9.defaultKey     // Catch: java.lang.Throwable -> L5b
                V r3 = r9.defaultValue     // Catch: java.lang.Throwable -> L5b
            L16:
                int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L5b
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L25
                r8.put(r1, r3)     // Catch: java.lang.Throwable -> L5b
                r7.limit = r2
                return
            L25:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L46
                if (r4 == r0) goto L39
                boolean r4 = r7.skipField()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                if (r4 == 0) goto L33
                goto L16
            L33:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                r4.<init>(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                throw r4     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
            L39:
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.valueType     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                V r5 = r9.defaultValue     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                java.lang.Class r5 = r5.getClass()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                goto L16
            L46:
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.keyType     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                r5 = 0
                java.lang.Object r1 = r7.readField(r4, r5, r5)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L5b
                goto L16
            L4e:
                boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L5b
                if (r4 == 0) goto L55
                goto L16
            L55:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L5b
                r8.<init>(r6)     // Catch: java.lang.Throwable -> L5b
                throw r8     // Catch: java.lang.Throwable -> L5b
            L5b:
                r8 = move-exception
                r7.limit = r2
                throw r8
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readMessage(java.lang.Class<T> r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.requireWireType(r0)
                androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
                androidx.datastore.preferences.protobuf.Schema r2 = r0.schemaFor(r2)
                java.lang.Object r2 = r1.readMessage(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> T readMessageBySchemaWithCheck(androidx.datastore.preferences.protobuf.Schema<T> r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.requireWireType(r0)
                java.lang.Object r2 = r1.readMessage(r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public <T> void readMessageList(java.util.List<T> r4, androidx.datastore.preferences.protobuf.Schema<T> r5, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
                r3 = this;
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                r1 = 2
                if (r0 != r1) goto L24
                int r0 = r3.tag
            Lb:
                java.lang.Object r1 = r3.readMessage(r5, r6)
                r4.add(r1)
                boolean r1 = r3.isAtEnd()
                if (r1 == 0) goto L19
                return
            L19:
                int r1 = r3.pos
                int r2 = r3.readVarint32()
                if (r2 == r0) goto Lb
                r3.pos = r1
                return
            L24:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readSFixed32() throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.requireWireType(r0)
                int r0 = r1.readLittleEndian32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSFixed32List(java.util.List<java.lang.Integer> r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
                r1 = 5
                r2 = 2
                if (r0 == 0) goto L48
                androidx.datastore.preferences.protobuf.IntArrayList r4 = (androidx.datastore.preferences.protobuf.IntArrayList) r4
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L32
                if (r0 != r1) goto L2d
            L12:
                int r0 = r3.readSFixed32()
                r4.addInt(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L20
                return
            L20:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L12
                r3.pos = r0
                return
            L2d:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L32:
                int r0 = r3.readVarint32()
                r3.verifyPackedFixed32Length(r0)
                int r1 = r3.pos
                int r1 = r1 + r0
            L3c:
                int r0 = r3.pos
                if (r0 >= r1) goto L90
                int r0 = r3.readLittleEndian32_NoCheck()
                r4.addInt(r0)
                goto L3c
            L48:
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L76
                if (r0 != r1) goto L71
            L52:
                int r0 = r3.readSFixed32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L64
                return
            L64:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L52
                r3.pos = r0
                return
            L71:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L76:
                int r0 = r3.readVarint32()
                r3.verifyPackedFixed32Length(r0)
                int r1 = r3.pos
                int r1 = r1 + r0
            L80:
                int r0 = r3.pos
                if (r0 >= r1) goto L90
                int r0 = r3.readLittleEndian32_NoCheck()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                goto L80
            L90:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readSFixed64() throws java.io.IOException {
                r2 = this;
                r0 = 1
                r2.requireWireType(r0)
                long r0 = r2.readLittleEndian64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSFixed64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L49
                r0 = r5
                androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
                int r5 = r4.tag
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                if (r5 == r2) goto L2e
                if (r5 != r1) goto L29
                int r5 = r4.readVarint32()
                r4.verifyPackedFixed64Length(r5)
                int r1 = r4.pos
                int r1 = r1 + r5
            L1d:
                int r5 = r4.pos
                if (r5 >= r1) goto L6d
                long r2 = r4.readLittleEndian64_NoCheck()
                r0.addLong(r2)
                goto L1d
            L29:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L2e:
                long r1 = r4.readSFixed64()
                r0.addLong(r1)
                boolean r5 = r4.isAtEnd()
                if (r5 == 0) goto L3c
                return
            L3c:
                int r5 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L2e
                r4.pos = r5
                return
            L49:
                int r0 = r4.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == r2) goto L73
                if (r0 != r1) goto L6e
                int r0 = r4.readVarint32()
                r4.verifyPackedFixed64Length(r0)
                int r1 = r4.pos
                int r1 = r1 + r0
            L5d:
                int r0 = r4.pos
                if (r0 >= r1) goto L6d
                long r2 = r4.readLittleEndian64_NoCheck()
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r5.add(r0)
                goto L5d
            L6d:
                return
            L6e:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L73:
                long r0 = r4.readSFixed64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L73
                r4.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readSInt32() throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.requireWireType(r0)
                int r0 = r1.readVarint32()
                int r0 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSInt32List(java.util.List<java.lang.Integer> r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
                r1 = 2
                if (r0 == 0) goto L49
                r0 = r4
                androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
                int r4 = r3.tag
                int r4 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r4)
                if (r4 == 0) goto L2e
                if (r4 != r1) goto L29
                int r4 = r3.readVarint32()
                int r1 = r3.pos
                int r1 = r1 + r4
            L19:
                int r4 = r3.pos
                if (r4 >= r1) goto L6e
                int r4 = r3.readVarint32()
                int r4 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(r4)
                r0.addInt(r4)
                goto L19
            L29:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L2e:
                int r4 = r3.readSInt32()
                r0.addInt(r4)
                boolean r4 = r3.isAtEnd()
                if (r4 == 0) goto L3c
                return
            L3c:
                int r4 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L2e
                r3.pos = r4
                return
            L49:
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == 0) goto L74
                if (r0 != r1) goto L6f
                int r0 = r3.readVarint32()
                int r1 = r3.pos
                int r1 = r1 + r0
            L5a:
                int r0 = r3.pos
                if (r0 >= r1) goto L6e
                int r0 = r3.readVarint32()
                int r0 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag32(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                goto L5a
            L6e:
                return
            L6f:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L74:
                int r0 = r3.readSInt32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L86
                return
            L86:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L74
                r3.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readSInt64() throws java.io.IOException {
                r2 = this;
                r0 = 0
                r2.requireWireType(r0)
                long r0 = r2.readVarint64()
                long r0 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readSInt64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
                r1 = 2
                if (r0 == 0) goto L49
                r0 = r5
                androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
                int r5 = r4.tag
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                if (r5 == 0) goto L2e
                if (r5 != r1) goto L29
                int r5 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r5
            L19:
                int r5 = r4.pos
                if (r5 >= r1) goto L6e
                long r2 = r4.readVarint64()
                long r2 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(r2)
                r0.addLong(r2)
                goto L19
            L29:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L2e:
                long r1 = r4.readSInt64()
                r0.addLong(r1)
                boolean r5 = r4.isAtEnd()
                if (r5 == 0) goto L3c
                return
            L3c:
                int r5 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L2e
                r4.pos = r5
                return
            L49:
                int r0 = r4.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == 0) goto L74
                if (r0 != r1) goto L6f
                int r0 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r0
            L5a:
                int r0 = r4.pos
                if (r0 >= r1) goto L6e
                long r2 = r4.readVarint64()
                long r2 = androidx.datastore.preferences.protobuf.CodedInputStream.decodeZigZag64(r2)
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r5.add(r0)
                goto L5a
            L6e:
                return
            L6f:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L74:
                long r0 = r4.readSInt64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L86
                return
            L86:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L74
                r4.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public java.lang.String readString() throws java.io.IOException {
                r1 = this;
                r0 = 0
                java.lang.String r0 = r1.readStringInternal(r0)
                return r0
        }

        public java.lang.String readStringInternal(boolean r5) throws java.io.IOException {
                r4 = this;
                r0 = 2
                r4.requireWireType(r0)
                int r0 = r4.readVarint32()
                if (r0 != 0) goto Ld
                java.lang.String r5 = ""
                return r5
            Ld:
                r4.requireBytes(r0)
                if (r5 == 0) goto L24
                byte[] r5 = r4.buffer
                int r1 = r4.pos
                int r2 = r1 + r0
                boolean r5 = androidx.datastore.preferences.protobuf.Utf8.isValidUtf8(r5, r1, r2)
                if (r5 == 0) goto L1f
                goto L24
            L1f:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r5
            L24:
                java.lang.String r5 = new java.lang.String
                byte[] r1 = r4.buffer
                int r2 = r4.pos
                java.nio.charset.Charset r3 = androidx.datastore.preferences.protobuf.Internal.UTF_8
                r5.<init>(r1, r2, r0, r3)
                int r1 = r4.pos
                int r1 = r1 + r0
                r4.pos = r1
                return r5
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readStringList(java.util.List<java.lang.String> r2) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.readStringListInternal(r2, r0)
                return
        }

        public void readStringListInternal(java.util.List<java.lang.String> r4, boolean r5) throws java.io.IOException {
                r3 = this;
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                r1 = 2
                if (r0 != r1) goto L48
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.LazyStringList
                if (r0 == 0) goto L2d
                if (r5 != 0) goto L2d
                r0 = r4
                androidx.datastore.preferences.protobuf.LazyStringList r0 = (androidx.datastore.preferences.protobuf.LazyStringList) r0
            L12:
                androidx.datastore.preferences.protobuf.ByteString r4 = r3.readBytes()
                r0.add(r4)
                boolean r4 = r3.isAtEnd()
                if (r4 == 0) goto L20
                return
            L20:
                int r4 = r3.pos
                int r5 = r3.readVarint32()
                int r1 = r3.tag
                if (r5 == r1) goto L12
                r3.pos = r4
                return
            L2d:
                java.lang.String r0 = r3.readStringInternal(r5)
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L3b
                return
            L3b:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L2d
                r3.pos = r0
                return
            L48:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readStringListRequireUtf8(java.util.List<java.lang.String> r2) throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.readStringListInternal(r2, r0)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
                r1 = this;
                r0 = 1
                java.lang.String r0 = r1.readStringInternal(r0)
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public int readUInt32() throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.requireWireType(r0)
                int r0 = r1.readVarint32()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readUInt32List(java.util.List<java.lang.Integer> r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
                r1 = 2
                if (r0 == 0) goto L45
                r0 = r4
                androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
                int r4 = r3.tag
                int r4 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r4)
                if (r4 == 0) goto L2a
                if (r4 != r1) goto L25
                int r4 = r3.readVarint32()
                int r1 = r3.pos
                int r1 = r1 + r4
            L19:
                int r4 = r3.pos
                if (r4 >= r1) goto L66
                int r4 = r3.readVarint32()
                r0.addInt(r4)
                goto L19
            L25:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L2a:
                int r4 = r3.readUInt32()
                r0.addInt(r4)
                boolean r4 = r3.isAtEnd()
                if (r4 == 0) goto L38
                return
            L38:
                int r4 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L2a
                r3.pos = r4
                return
            L45:
                int r0 = r3.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == 0) goto L6c
                if (r0 != r1) goto L67
                int r0 = r3.readVarint32()
                int r1 = r3.pos
                int r1 = r1 + r0
            L56:
                int r0 = r3.pos
                if (r0 >= r1) goto L66
                int r0 = r3.readVarint32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                goto L56
            L66:
                return
            L67:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r4 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r4
            L6c:
                int r0 = r3.readUInt32()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r4.add(r0)
                boolean r0 = r3.isAtEnd()
                if (r0 == 0) goto L7e
                return
            L7e:
                int r0 = r3.pos
                int r1 = r3.readVarint32()
                int r2 = r3.tag
                if (r1 == r2) goto L6c
                r3.pos = r0
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public long readUInt64() throws java.io.IOException {
                r2 = this;
                r0 = 0
                r2.requireWireType(r0)
                long r0 = r2.readVarint64()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public void readUInt64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
                r1 = 2
                if (r0 == 0) goto L49
                r0 = r5
                androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
                int r5 = r4.tag
                int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
                if (r5 == 0) goto L2e
                if (r5 != r1) goto L29
                int r5 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r5
            L19:
                int r5 = r4.pos
                if (r5 >= r1) goto L25
                long r2 = r4.readVarint64()
                r0.addLong(r2)
                goto L19
            L25:
                r4.requirePosition(r1)
                goto L6d
            L29:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L2e:
                long r1 = r4.readUInt64()
                r0.addLong(r1)
                boolean r5 = r4.isAtEnd()
                if (r5 == 0) goto L3c
                return
            L3c:
                int r5 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L2e
                r4.pos = r5
                return
            L49:
                int r0 = r4.tag
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                if (r0 == 0) goto L73
                if (r0 != r1) goto L6e
                int r0 = r4.readVarint32()
                int r1 = r4.pos
                int r1 = r1 + r0
            L5a:
                int r0 = r4.pos
                if (r0 >= r1) goto L6a
                long r2 = r4.readVarint64()
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                r5.add(r0)
                goto L5a
            L6a:
                r4.requirePosition(r1)
            L6d:
                return
            L6e:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r5
            L73:
                long r0 = r4.readUInt64()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r5.add(r0)
                boolean r0 = r4.isAtEnd()
                if (r0 == 0) goto L85
                return
            L85:
                int r0 = r4.pos
                int r1 = r4.readVarint32()
                int r2 = r4.tag
                if (r1 == r2) goto L73
                r4.pos = r0
                return
        }

        public long readVarint64() throws java.io.IOException {
                r11 = this;
                int r0 = r11.pos
                int r1 = r11.limit
                if (r1 == r0) goto Lc2
                byte[] r2 = r11.buffer
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r11.pos = r3
                long r0 = (long) r0
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L1c
                long r0 = r11.readVarint64SlowPath()
                return r0
            L1c:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L2a
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            L27:
                long r2 = (long) r0
                goto Lbf
            L2a:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3b
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto Lbf
            L3b:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L49
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L27
            L49:
                long r3 = (long) r0
                int r0 = r1 + 1
                r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L60
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L5c:
                long r2 = r3 ^ r1
                r1 = r0
                goto Lbf
            L60:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L75
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L72:
                long r2 = r3 ^ r5
                goto Lbf
            L75:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L88
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L5c
            L88:
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L9b
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L72
            L9b:
                int r0 = r1 + 1
                r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto Lbd
                int r1 = r0 + 1
                r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 < 0) goto Lb8
                goto Lbe
            Lb8:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint()
                throw r0
            Lbd:
                r1 = r0
            Lbe:
                r2 = r3
            Lbf:
                r11.pos = r1
                return r2
            Lc2:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage()
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.Reader
        public boolean skipField() throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isAtEnd()
                if (r0 != 0) goto L3f
                int r0 = r3.tag
                int r1 = r3.endGroupTag
                if (r0 != r1) goto Ld
                goto L3f
            Ld:
                int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
                r1 = 1
                if (r0 == 0) goto L3b
                if (r0 == r1) goto L35
                r2 = 2
                if (r0 == r2) goto L2d
                r2 = 3
                if (r0 == r2) goto L29
                r2 = 5
                if (r0 != r2) goto L24
                r0 = 4
                r3.skipBytes(r0)
                return r1
            L24:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
                throw r0
            L29:
                r3.skipGroup()
                return r1
            L2d:
                int r0 = r3.readVarint32()
                r3.skipBytes(r0)
                return r1
            L35:
                r0 = 8
                r3.skipBytes(r0)
                return r1
            L3b:
                r3.skipVarint()
                return r1
            L3f:
                r0 = 0
                return r0
        }
    }

    private BinaryReader() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ BinaryReader(androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.datastore.preferences.protobuf.BinaryReader newInstance(java.nio.ByteBuffer r1, boolean r2) {
            boolean r0 = r1.hasArray()
            if (r0 == 0) goto Lc
            androidx.datastore.preferences.protobuf.BinaryReader$SafeHeapReader r0 = new androidx.datastore.preferences.protobuf.BinaryReader$SafeHeapReader
            r0.<init>(r1, r2)
            return r0
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Direct buffers not yet supported"
            r1.<init>(r2)
            throw r1
    }
}
