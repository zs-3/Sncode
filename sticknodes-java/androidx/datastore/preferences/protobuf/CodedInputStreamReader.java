package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class CodedInputStreamReader implements androidx.datastore.preferences.protobuf.Reader {
    private int endGroupTag;
    private final androidx.datastore.preferences.protobuf.CodedInputStream input;
    private int nextTag;
    private int tag;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType = null;

        static {
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L84
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L90
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> L9c
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> La8
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lb4
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lc0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType     // Catch: java.lang.NoSuchFieldError -> Lcc
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                return
        }
    }

    private CodedInputStreamReader(androidx.datastore.preferences.protobuf.CodedInputStream r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.nextTag = r0
            java.lang.String r0 = "input"
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.Internal.checkNotNull(r2, r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = (androidx.datastore.preferences.protobuf.CodedInputStream) r2
            r1.input = r2
            r2.wrapper = r1
            return
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStreamReader forCodedInput(androidx.datastore.preferences.protobuf.CodedInputStream r1) {
            androidx.datastore.preferences.protobuf.CodedInputStreamReader r0 = r1.wrapper
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.datastore.preferences.protobuf.CodedInputStreamReader r0 = new androidx.datastore.preferences.protobuf.CodedInputStreamReader
            r0.<init>(r1)
            return r0
    }

    private java.lang.Object readField(androidx.datastore.preferences.protobuf.WireFormat.FieldType r2, java.lang.Class<?> r3, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r1 = this;
            int[] r0 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType
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

    private <T> T readMessage(androidx.datastore.preferences.protobuf.Schema<T> r5, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r6) throws java.io.IOException {
            r4 = this;
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r2 = r1.recursionDepth
            int r3 = r1.recursionLimit
            if (r2 >= r3) goto L36
            int r0 = r1.pushLimit(r0)
            java.lang.Object r1 = r5.newInstance()
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = r4.input
            int r3 = r2.recursionDepth
            int r3 = r3 + 1
            r2.recursionDepth = r3
            r5.mergeFrom(r1, r4, r6)
            r5.makeImmutable(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            r6 = 0
            r5.checkLastTagWas(r6)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r6 = r5.recursionDepth
            int r6 = r6 + (-1)
            r5.recursionDepth = r6
            r5.popLimit(r0)
            return r1
        L36:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.recursionLimitExceeded()
            throw r5
    }

    private void requirePosition(int r2) throws java.io.IOException {
            r1 = this;
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.getTotalBytesRead()
            if (r0 != r2) goto L9
            return
        L9:
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

    private void verifyPackedFixed32Length(int r1) throws java.io.IOException {
            r0 = this;
            r1 = r1 & 3
            if (r1 != 0) goto L5
            return
        L5:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r1
    }

    private void verifyPackedFixed64Length(int r1) throws java.io.IOException {
            r0 = this;
            r1 = r1 & 7
            if (r1 != 0) goto L5
            return
        L5:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r1
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int getFieldNumber() throws java.io.IOException {
            r2 = this;
            int r0 = r2.nextTag
            if (r0 == 0) goto La
            r2.tag = r0
            r0 = 0
            r2.nextTag = r0
            goto L12
        La:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            r2.tag = r0
        L12:
            int r0 = r2.tag
            if (r0 == 0) goto L20
            int r1 = r2.endGroupTag
            if (r0 != r1) goto L1b
            goto L20
        L1b:
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r0)
            return r0
        L20:
            r0 = 2147483647(0x7fffffff, float:NaN)
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
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            boolean r0 = r0.readBool()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBoolList(java.util.List<java.lang.Boolean> r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.BooleanArrayList
            r1 = 2
            if (r0 == 0) goto L58
            r0 = r3
            androidx.datastore.preferences.protobuf.BooleanArrayList r0 = (androidx.datastore.preferences.protobuf.BooleanArrayList) r0
            int r3 = r2.tag
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r3)
            if (r3 == 0) goto L39
            if (r3 != r1) goto L34
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r3
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            boolean r3 = r3.readBool()
            r0.addBoolean(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r1) goto L1f
            r2.requirePosition(r1)
            goto L87
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L39:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            boolean r3 = r3.readBool()
            r0.addBoolean(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            boolean r3 = r3.isAtEnd()
            if (r3 == 0) goto L4b
            return
        L4b:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readTag()
            int r1 = r2.tag
            if (r3 == r1) goto L39
            r2.nextTag = r3
            return
        L58:
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == 0) goto L8d
            if (r0 != r1) goto L88
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L6f:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.readBool()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L6f
            r2.requirePosition(r1)
        L87:
            return
        L88:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L8d:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.readBool()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            int r1 = r2.tag
            if (r0 == r1) goto L8d
            r2.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            androidx.datastore.preferences.protobuf.ByteString r0 = r0.readBytes()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readBytesList(java.util.List<androidx.datastore.preferences.protobuf.ByteString> r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            r1 = 2
            if (r0 != r1) goto L26
        L9:
            androidx.datastore.preferences.protobuf.ByteString r0 = r2.readBytes()
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L19
            return
        L19:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            int r1 = r2.tag
            if (r0 == r1) goto L9
            r2.nextTag = r0
            return
        L26:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public double readDouble() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            double r0 = r0.readDouble()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readDoubleList(java.util.List<java.lang.Double> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.DoubleArrayList
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L59
            r0 = r5
            androidx.datastore.preferences.protobuf.DoubleArrayList r0 = (androidx.datastore.preferences.protobuf.DoubleArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == r2) goto L3a
            if (r5 != r1) goto L35
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            r4.verifyPackedFixed64Length(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r5
        L23:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            double r2 = r5.readDouble()
            r0.addDouble(r2)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r1) goto L23
            goto L88
        L35:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L3a:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            double r1 = r5.readDouble()
            r0.addDouble(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L4c
            return
        L4c:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L3a
            r4.nextTag = r5
            return
        L59:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == r2) goto L8e
            if (r0 != r1) goto L89
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed64Length(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            double r2 = r0.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L73
        L88:
            return
        L89:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8e:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            double r0 = r0.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La4
            return
        La4:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L8e
            r4.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readEnum() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readEnum()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readEnumList(java.util.List<java.lang.Integer> r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            r1 = 2
            if (r0 == 0) goto L58
            r0 = r3
            androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
            int r3 = r2.tag
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r3)
            if (r3 == 0) goto L39
            if (r3 != r1) goto L34
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r3
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readEnum()
            r0.addInt(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r1) goto L1f
            r2.requirePosition(r1)
            goto L87
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L39:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readEnum()
            r0.addInt(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            boolean r3 = r3.isAtEnd()
            if (r3 == 0) goto L4b
            return
        L4b:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readTag()
            int r1 = r2.tag
            if (r3 == r1) goto L39
            r2.nextTag = r3
            return
        L58:
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == 0) goto L8d
            if (r0 != r1) goto L88
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L6f:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readEnum()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L6f
            r2.requirePosition(r1)
        L87:
            return
        L88:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L8d:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readEnum()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            int r1 = r2.tag
            if (r0 == r1) goto L8d
            r2.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readFixed32() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readFixed32()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L5a
            r0 = r5
            androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == r2) goto L37
            if (r5 != r1) goto L32
        L13:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readFixed32()
            r0.addInt(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L25
            return
        L25:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L13
            r4.nextTag = r5
            return
        L32:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L37:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            r4.verifyPackedFixed32Length(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r3 = r1 + r5
        L48:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readFixed32()
            r0.addInt(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r3) goto L48
            goto Lb1
        L5a:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == r2) goto L8c
            if (r0 != r1) goto L87
        L64:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L7a
            return
        L7a:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L64
            r4.nextTag = r0
            return
        L87:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8c:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed32Length(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L9c:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L9c
        Lb1:
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readFixed64() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readFixed64()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFixed64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L59
            r0 = r5
            androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == r2) goto L3a
            if (r5 != r1) goto L35
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            r4.verifyPackedFixed64Length(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r5
        L23:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r2 = r5.readFixed64()
            r0.addLong(r2)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r1) goto L23
            goto L88
        L35:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L3a:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r1 = r5.readFixed64()
            r0.addLong(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L4c
            return
        L4c:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L3a
            r4.nextTag = r5
            return
        L59:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == r2) goto L8e
            if (r0 != r1) goto L89
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed64Length(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r2 = r0.readFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L73
        L88:
            return
        L89:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8e:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r0 = r0.readFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La4
            return
        La4:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L8e
            r4.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public float readFloat() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            float r0 = r0.readFloat()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readFloatList(java.util.List<java.lang.Float> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.FloatArrayList
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L5a
            r0 = r5
            androidx.datastore.preferences.protobuf.FloatArrayList r0 = (androidx.datastore.preferences.protobuf.FloatArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == r2) goto L37
            if (r5 != r1) goto L32
        L13:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            float r5 = r5.readFloat()
            r0.addFloat(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L25
            return
        L25:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L13
            r4.nextTag = r5
            return
        L32:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L37:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            r4.verifyPackedFixed32Length(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r3 = r1 + r5
        L48:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            float r5 = r5.readFloat()
            r0.addFloat(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r3) goto L48
            goto Lb1
        L5a:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == r2) goto L8c
            if (r0 != r1) goto L87
        L64:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            float r0 = r0.readFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L7a
            return
        L7a:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L64
            r4.nextTag = r0
            return
        L87:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8c:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed32Length(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L9c:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            float r0 = r0.readFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L9c
        Lb1:
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
    public <T> void readGroupList(java.util.List<T> r3, androidx.datastore.preferences.protobuf.Schema<T> r4, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            r1 = 3
            if (r0 != r1) goto L2a
            int r0 = r2.tag
        Lb:
            java.lang.Object r1 = r2.readGroup(r4, r5)
            r3.add(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            boolean r1 = r1.isAtEnd()
            if (r1 != 0) goto L29
            int r1 = r2.nextTag
            if (r1 == 0) goto L1f
            goto L29
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.readTag()
            if (r1 == r0) goto Lb
            r2.nextTag = r1
        L29:
            return
        L2a:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readInt32() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readInt32()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt32List(java.util.List<java.lang.Integer> r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            r1 = 2
            if (r0 == 0) goto L58
            r0 = r3
            androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
            int r3 = r2.tag
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r3)
            if (r3 == 0) goto L39
            if (r3 != r1) goto L34
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r3
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readInt32()
            r0.addInt(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r1) goto L1f
            r2.requirePosition(r1)
            goto L87
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L39:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readInt32()
            r0.addInt(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            boolean r3 = r3.isAtEnd()
            if (r3 == 0) goto L4b
            return
        L4b:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readTag()
            int r1 = r2.tag
            if (r3 == r1) goto L39
            r2.nextTag = r3
            return
        L58:
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == 0) goto L8d
            if (r0 != r1) goto L88
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L6f:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L6f
            r2.requirePosition(r1)
        L87:
            return
        L88:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L8d:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            int r1 = r2.tag
            if (r0 == r1) goto L8d
            r2.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readInt64() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readInt64()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readInt64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
            r1 = 2
            if (r0 == 0) goto L58
            r0 = r5
            androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == 0) goto L39
            if (r5 != r1) goto L34
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r5
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r2 = r5.readInt64()
            r0.addLong(r2)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r1) goto L1f
            r4.requirePosition(r1)
            goto L87
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L39:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r1 = r5.readInt64()
            r0.addLong(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L4b
            return
        L4b:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L39
            r4.nextTag = r5
            return
        L58:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == 0) goto L8d
            if (r0 != r1) goto L88
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L6f:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r2 = r0.readInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L6f
            r4.requirePosition(r1)
        L87:
            return
        L88:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8d:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r0 = r0.readInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L8d
            r4.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public <K, V> void readMap(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<K, V> r9, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r10) throws java.io.IOException {
            r7 = this;
            r0 = 2
            r7.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r7.input
            int r1 = r1.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = r7.input
            int r1 = r2.pushLimit(r1)
            K r2 = r9.defaultKey
            V r3 = r9.defaultValue
        L14:
            int r4 = r7.getFieldNumber()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r7.input     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.isAtEnd()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.skipField()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.valueType     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.defaultValue     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.readField(r4, r5, r10)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.keyType     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.readField(r4, r5, r5)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.skipField()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            androidx.datastore.preferences.protobuf.CodedInputStream r8 = r7.input
            r8.popLimit(r1)
            return
        L65:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.CodedInputStream r9 = r7.input
            r9.popLimit(r1)
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
    public <T> void readMessageList(java.util.List<T> r3, androidx.datastore.preferences.protobuf.Schema<T> r4, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r5) throws java.io.IOException {
            r2 = this;
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            r1 = 2
            if (r0 != r1) goto L2a
            int r0 = r2.tag
        Lb:
            java.lang.Object r1 = r2.readMessage(r4, r5)
            r3.add(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            boolean r1 = r1.isAtEnd()
            if (r1 != 0) goto L29
            int r1 = r2.nextTag
            if (r1 == 0) goto L1f
            goto L29
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.readTag()
            if (r1 == r0) goto Lb
            r2.nextTag = r1
        L29:
            return
        L2a:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSFixed32() throws java.io.IOException {
            r1 = this;
            r0 = 5
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readSFixed32()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed32List(java.util.List<java.lang.Integer> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            r1 = 5
            r2 = 2
            if (r0 == 0) goto L5a
            r0 = r5
            androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == r2) goto L37
            if (r5 != r1) goto L32
        L13:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readSFixed32()
            r0.addInt(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L25
            return
        L25:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L13
            r4.nextTag = r5
            return
        L32:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L37:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            r4.verifyPackedFixed32Length(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r3 = r1 + r5
        L48:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readSFixed32()
            r0.addInt(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r3) goto L48
            goto Lb1
        L5a:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == r2) goto L8c
            if (r0 != r1) goto L87
        L64:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readSFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L7a
            return
        L7a:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L64
            r4.nextTag = r0
            return
        L87:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8c:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed32Length(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L9c:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readSFixed32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L9c
        Lb1:
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSFixed64() throws java.io.IOException {
            r2 = this;
            r0 = 1
            r2.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readSFixed64()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSFixed64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L59
            r0 = r5
            androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == r2) goto L3a
            if (r5 != r1) goto L35
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            r4.verifyPackedFixed64Length(r5)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r5
        L23:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r2 = r5.readSFixed64()
            r0.addLong(r2)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r1) goto L23
            goto L88
        L35:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L3a:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r1 = r5.readSFixed64()
            r0.addLong(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L4c
            return
        L4c:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L3a
            r4.nextTag = r5
            return
        L59:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == r2) goto L8e
            if (r0 != r1) goto L89
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            r4.verifyPackedFixed64Length(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L73:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r2 = r0.readSFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L73
        L88:
            return
        L89:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8e:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r0 = r0.readSFixed64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La4
            return
        La4:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L8e
            r4.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readSInt32() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readSInt32()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt32List(java.util.List<java.lang.Integer> r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            r1 = 2
            if (r0 == 0) goto L58
            r0 = r3
            androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
            int r3 = r2.tag
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r3)
            if (r3 == 0) goto L39
            if (r3 != r1) goto L34
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r3
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readSInt32()
            r0.addInt(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r1) goto L1f
            r2.requirePosition(r1)
            goto L87
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L39:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readSInt32()
            r0.addInt(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            boolean r3 = r3.isAtEnd()
            if (r3 == 0) goto L4b
            return
        L4b:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readTag()
            int r1 = r2.tag
            if (r3 == r1) goto L39
            r2.nextTag = r3
            return
        L58:
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == 0) goto L8d
            if (r0 != r1) goto L88
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L6f:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readSInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L6f
            r2.requirePosition(r1)
        L87:
            return
        L88:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L8d:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readSInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            int r1 = r2.tag
            if (r0 == r1) goto L8d
            r2.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readSInt64() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readSInt64()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readSInt64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
            r1 = 2
            if (r0 == 0) goto L58
            r0 = r5
            androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == 0) goto L39
            if (r5 != r1) goto L34
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r5
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r2 = r5.readSInt64()
            r0.addLong(r2)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r1) goto L1f
            r4.requirePosition(r1)
            goto L87
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L39:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r1 = r5.readSInt64()
            r0.addLong(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L4b
            return
        L4b:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L39
            r4.nextTag = r5
            return
        L58:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == 0) goto L8d
            if (r0 != r1) goto L88
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L6f:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r2 = r0.readSInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L6f
            r4.requirePosition(r1)
        L87:
            return
        L88:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8d:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r0 = r0.readSInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L8d
            r4.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public java.lang.String readString() throws java.io.IOException {
            r1 = this;
            r0 = 2
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            java.lang.String r0 = r0.readString()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readStringList(java.util.List<java.lang.String> r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.readStringListInternal(r2, r0)
            return
    }

    public void readStringListInternal(java.util.List<java.lang.String> r3, boolean r4) throws java.io.IOException {
            r2 = this;
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            r1 = 2
            if (r0 != r1) goto L53
            boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.LazyStringList
            if (r0 == 0) goto L2f
            if (r4 != 0) goto L2f
            r0 = r3
            androidx.datastore.preferences.protobuf.LazyStringList r0 = (androidx.datastore.preferences.protobuf.LazyStringList) r0
        L12:
            androidx.datastore.preferences.protobuf.ByteString r3 = r2.readBytes()
            r0.add(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            boolean r3 = r3.isAtEnd()
            if (r3 == 0) goto L22
            return
        L22:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readTag()
            int r4 = r2.tag
            if (r3 == r4) goto L12
            r2.nextTag = r3
            return
        L2f:
            if (r4 == 0) goto L36
            java.lang.String r0 = r2.readStringRequireUtf8()
            goto L3a
        L36:
            java.lang.String r0 = r2.readString()
        L3a:
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto L46
            return
        L46:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            int r1 = r2.tag
            if (r0 == r1) goto L2f
            r2.nextTag = r0
            return
        L53:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
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
            r0 = 2
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            java.lang.String r0 = r0.readStringRequireUtf8()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public int readUInt32() throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r1.input
            int r0 = r0.readUInt32()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt32List(java.util.List<java.lang.Integer> r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r3 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            r1 = 2
            if (r0 == 0) goto L58
            r0 = r3
            androidx.datastore.preferences.protobuf.IntArrayList r0 = (androidx.datastore.preferences.protobuf.IntArrayList) r0
            int r3 = r2.tag
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r3)
            if (r3 == 0) goto L39
            if (r3 != r1) goto L34
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r3
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readUInt32()
            r0.addInt(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.getTotalBytesRead()
            if (r3 < r1) goto L1f
            r2.requirePosition(r1)
            goto L87
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L39:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readUInt32()
            r0.addInt(r3)
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            boolean r3 = r3.isAtEnd()
            if (r3 == 0) goto L4b
            return
        L4b:
            androidx.datastore.preferences.protobuf.CodedInputStream r3 = r2.input
            int r3 = r3.readTag()
            int r1 = r2.tag
            if (r3 == r1) goto L39
            r2.nextTag = r3
            return
        L58:
            int r0 = r2.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == 0) goto L8d
            if (r0 != r1) goto L88
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L6f:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readUInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L6f
            r2.requirePosition(r1)
        L87:
            return
        L88:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r3
        L8d:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readUInt32()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            int r0 = r0.readTag()
            int r1 = r2.tag
            if (r0 == r1) goto L8d
            r2.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public long readUInt64() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.requireWireType(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            long r0 = r0.readUInt64()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public void readUInt64List(java.util.List<java.lang.Long> r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
            r1 = 2
            if (r0 == 0) goto L58
            r0 = r5
            androidx.datastore.preferences.protobuf.LongArrayList r0 = (androidx.datastore.preferences.protobuf.LongArrayList) r0
            int r5 = r4.tag
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r5)
            if (r5 == 0) goto L39
            if (r5 != r1) goto L34
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r5
        L1f:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r2 = r5.readUInt64()
            r0.addLong(r2)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.getTotalBytesRead()
            if (r5 < r1) goto L1f
            r4.requirePosition(r1)
            goto L87
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L39:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            long r1 = r5.readUInt64()
            r0.addLong(r1)
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            boolean r5 = r5.isAtEnd()
            if (r5 == 0) goto L4b
            return
        L4b:
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r4.input
            int r5 = r5.readTag()
            int r1 = r4.tag
            if (r5 == r1) goto L39
            r4.nextTag = r5
            return
        L58:
            int r0 = r4.tag
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            if (r0 == 0) goto L8d
            if (r0 != r1) goto L88
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readUInt32()
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r4.input
            int r1 = r1.getTotalBytesRead()
            int r1 = r1 + r0
        L6f:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r2 = r0.readUInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.getTotalBytesRead()
            if (r0 < r1) goto L6f
            r4.requirePosition(r1)
        L87:
            return
        L88:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r5 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            throw r5
        L8d:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            long r0 = r0.readUInt64()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.add(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            boolean r0 = r0.isAtEnd()
            if (r0 == 0) goto La3
            return
        La3:
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r4.input
            int r0 = r0.readTag()
            int r1 = r4.tag
            if (r0 == r1) goto L8d
            r4.nextTag = r0
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public boolean skipField() throws java.io.IOException {
            r2 = this;
            androidx.datastore.preferences.protobuf.CodedInputStream r0 = r2.input
            boolean r0 = r0.isAtEnd()
            if (r0 != 0) goto L16
            int r0 = r2.tag
            int r1 = r2.endGroupTag
            if (r0 != r1) goto Lf
            goto L16
        Lf:
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r2.input
            boolean r0 = r1.skipField(r0)
            return r0
        L16:
            r0 = 0
            return r0
    }
}
