package com.google.firebase.encoders.proto;

/* loaded from: classes2.dex */
final class ProtobufDataEncoderContext implements com.google.firebase.encoders.ObjectEncoderContext {
    private static final com.google.firebase.encoders.ObjectEncoder<java.util.Map.Entry<java.lang.Object, java.lang.Object>> DEFAULT_MAP_ENCODER = null;
    private static final com.google.firebase.encoders.FieldDescriptor MAP_KEY_DESC = null;
    private static final com.google.firebase.encoders.FieldDescriptor MAP_VALUE_DESC = null;
    private static final java.nio.charset.Charset UTF_8 = null;
    private final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private java.io.OutputStream output;
    private final com.google.firebase.encoders.proto.ProtobufValueEncoderContext valueEncoderContext;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = null;

        static {
                com.google.firebase.encoders.proto.Protobuf$IntEncoding[] r0 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = r0
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.DEFAULT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.SIGNED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.firebase.encoders.proto.Protobuf$IntEncoding r1 = com.google.firebase.encoders.proto.Protobuf.IntEncoding.FIXED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$oWQEqgEgcHEnNz1JmQZ0roIcWwY(java.util.Map.Entry r0, com.google.firebase.encoders.ObjectEncoderContext r1) {
            lambda$static$0(r0, r1)
            return
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext.UTF_8 = r0
            java.lang.String r0 = "key"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
            r2 = 1
            com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
            com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext.MAP_KEY_DESC = r0
            java.lang.String r0 = "value"
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = com.google.firebase.encoders.FieldDescriptor.builder(r0)
            com.google.firebase.encoders.proto.AtProtobuf r1 = com.google.firebase.encoders.proto.AtProtobuf.builder()
            r2 = 2
            com.google.firebase.encoders.proto.AtProtobuf r1 = r1.tag(r2)
            com.google.firebase.encoders.proto.Protobuf r1 = r1.build()
            com.google.firebase.encoders.FieldDescriptor$Builder r0 = r0.withProperty(r1)
            com.google.firebase.encoders.FieldDescriptor r0 = r0.build()
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext.MAP_VALUE_DESC = r0
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext$$ExternalSyntheticLambda0 r0 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext.DEFAULT_MAP_ENCODER = r0
            return
    }

    ProtobufDataEncoderContext(java.io.OutputStream r2, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r3, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r4, com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r5) {
            r1 = this;
            r1.<init>()
            com.google.firebase.encoders.proto.ProtobufValueEncoderContext r0 = new com.google.firebase.encoders.proto.ProtobufValueEncoderContext
            r0.<init>(r1)
            r1.valueEncoderContext = r0
            r1.output = r2
            r1.objectEncoders = r3
            r1.valueEncoders = r4
            r1.fallbackEncoder = r5
            return
    }

    private static java.nio.ByteBuffer allocateBuffer(int r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            return r1
    }

    private <T> long determineSize(com.google.firebase.encoders.ObjectEncoder<T> r3, T r4) throws java.io.IOException {
            r2 = this;
            com.google.firebase.encoders.proto.LengthCountingOutputStream r0 = new com.google.firebase.encoders.proto.LengthCountingOutputStream
            r0.<init>()
            java.io.OutputStream r1 = r2.output     // Catch: java.lang.Throwable -> L1a
            r2.output = r0     // Catch: java.lang.Throwable -> L1a
            r3.encode(r4, r2)     // Catch: java.lang.Throwable -> L16
            r2.output = r1     // Catch: java.lang.Throwable -> L1a
            long r3 = r0.getLength()     // Catch: java.lang.Throwable -> L1a
            r0.close()
            return r3
        L16:
            r3 = move-exception
            r2.output = r1     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L1a
        L1a:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r4 = move-exception
            r3.addSuppressed(r4)
        L23:
            throw r3
    }

    private <T> com.google.firebase.encoders.proto.ProtobufDataEncoderContext doEncode(com.google.firebase.encoders.ObjectEncoder<T> r5, com.google.firebase.encoders.FieldDescriptor r6, T r7, boolean r8) throws java.io.IOException {
            r4 = this;
            long r0 = r4.determineSize(r5, r7)
            if (r8 == 0) goto Ld
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto Ld
            return r4
        Ld:
            int r6 = getTag(r6)
            int r6 = r6 << 3
            r6 = r6 | 2
            r4.writeVarInt32(r6)
            r4.writeVarInt64(r0)
            r5.encode(r7, r4)
            return r4
    }

    private <T> com.google.firebase.encoders.proto.ProtobufDataEncoderContext doEncode(com.google.firebase.encoders.ValueEncoder<T> r2, com.google.firebase.encoders.FieldDescriptor r3, T r4, boolean r5) throws java.io.IOException {
            r1 = this;
            com.google.firebase.encoders.proto.ProtobufValueEncoderContext r0 = r1.valueEncoderContext
            r0.resetContext(r3, r5)
            com.google.firebase.encoders.proto.ProtobufValueEncoderContext r3 = r1.valueEncoderContext
            r2.encode(r4, r3)
            return r1
    }

    private static com.google.firebase.encoders.proto.Protobuf getProtobuf(com.google.firebase.encoders.FieldDescriptor r1) {
            java.lang.Class<com.google.firebase.encoders.proto.Protobuf> r0 = com.google.firebase.encoders.proto.Protobuf.class
            java.lang.annotation.Annotation r1 = r1.getProperty(r0)
            com.google.firebase.encoders.proto.Protobuf r1 = (com.google.firebase.encoders.proto.Protobuf) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            com.google.firebase.encoders.EncodingException r1 = new com.google.firebase.encoders.EncodingException
            java.lang.String r0 = "Field has no @Protobuf config"
            r1.<init>(r0)
            throw r1
    }

    private static int getTag(com.google.firebase.encoders.FieldDescriptor r1) {
            java.lang.Class<com.google.firebase.encoders.proto.Protobuf> r0 = com.google.firebase.encoders.proto.Protobuf.class
            java.lang.annotation.Annotation r1 = r1.getProperty(r0)
            com.google.firebase.encoders.proto.Protobuf r1 = (com.google.firebase.encoders.proto.Protobuf) r1
            if (r1 == 0) goto Lf
            int r1 = r1.tag()
            return r1
        Lf:
            com.google.firebase.encoders.EncodingException r1 = new com.google.firebase.encoders.EncodingException
            java.lang.String r0 = "Field has no @Protobuf config"
            r1.<init>(r0)
            throw r1
    }

    private static /* synthetic */ void lambda$static$0(java.util.Map.Entry r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
            com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.MAP_KEY_DESC
            java.lang.Object r1 = r2.getKey()
            r3.add(r0, r1)
            com.google.firebase.encoders.FieldDescriptor r0 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.MAP_VALUE_DESC
            java.lang.Object r2 = r2.getValue()
            r3.add(r0, r2)
            return
    }

    private void writeVarInt32(int r6) throws java.io.IOException {
            r5 = this;
        L0:
            r0 = r6 & (-128(0xffffffffffffff80, float:NaN))
            long r0 = (long) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L15
            java.io.OutputStream r0 = r5.output
            r1 = r6 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.write(r1)
            int r6 = r6 >>> 7
            goto L0
        L15:
            java.io.OutputStream r0 = r5.output
            r6 = r6 & 127(0x7f, float:1.78E-43)
            r0.write(r6)
            return
    }

    private void writeVarInt64(long r6) throws java.io.IOException {
            r5 = this;
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            java.io.OutputStream r0 = r5.output
            int r1 = (int) r6
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.write(r1)
            r0 = 7
            long r6 = r6 >>> r0
            goto L0
        L16:
            java.io.OutputStream r0 = r5.output
            int r7 = (int) r6
            r6 = r7 & 127(0x7f, float:1.78E-43)
            r0.write(r6)
            return
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r2, double r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            com.google.firebase.encoders.ObjectEncoderContext r2 = r1.add(r2, r3, r0)
            return r2
    }

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r3, double r4, boolean r6) throws java.io.IOException {
            r2 = this;
            if (r6 == 0) goto L9
            r0 = 0
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L9
            return r2
        L9:
            int r3 = getTag(r3)
            int r3 = r3 << 3
            r3 = r3 | 1
            r2.writeVarInt32(r3)
            java.io.OutputStream r3 = r2.output
            r6 = 8
            java.nio.ByteBuffer r6 = allocateBuffer(r6)
            java.nio.ByteBuffer r4 = r6.putDouble(r4)
            byte[] r4 = r4.array()
            r3.write(r4)
            return r2
    }

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, float r2, boolean r3) throws java.io.IOException {
            r0 = this;
            if (r3 == 0) goto L8
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L8
            return r0
        L8:
            int r1 = getTag(r1)
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.writeVarInt32(r1)
            java.io.OutputStream r1 = r0.output
            r3 = 4
            java.nio.ByteBuffer r3 = allocateBuffer(r3)
            java.nio.ByteBuffer r2 = r3.putFloat(r2)
            byte[] r2 = r2.array()
            r1.write(r2)
            return r0
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public /* bridge */ /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, int r2) throws java.io.IOException {
            r0 = this;
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public /* bridge */ /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, long r2) throws java.io.IOException {
            r0 = this;
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            com.google.firebase.encoders.ObjectEncoderContext r2 = r1.add(r2, r3, r0)
            return r2
    }

    com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r3, java.lang.Object r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L3
            return r2
        L3:
            boolean r0 = r4 instanceof java.lang.CharSequence
            if (r0 == 0) goto L31
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r5 == 0) goto L12
            int r5 = r4.length()
            if (r5 != 0) goto L12
            return r2
        L12:
            int r3 = getTag(r3)
            int r3 = r3 << 3
            r3 = r3 | 2
            r2.writeVarInt32(r3)
            java.lang.String r3 = r4.toString()
            java.nio.charset.Charset r4 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.UTF_8
            byte[] r3 = r3.getBytes(r4)
            int r4 = r3.length
            r2.writeVarInt32(r4)
            java.io.OutputStream r4 = r2.output
            r4.write(r3)
            return r2
        L31:
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L4b
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r4.next()
            r2.add(r3, r5, r1)
            goto L3c
        L4a:
            return r2
        L4b:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L6c
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L59:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6b
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            com.google.firebase.encoders.ObjectEncoder<java.util.Map$Entry<java.lang.Object, java.lang.Object>> r0 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.DEFAULT_MAP_ENCODER
            r2.doEncode(r0, r3, r5, r1)
            goto L59
        L6b:
            return r2
        L6c:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L7b
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            com.google.firebase.encoders.ObjectEncoderContext r3 = r2.add(r3, r0, r5)
            return r3
        L7b:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L8a
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            com.google.firebase.encoders.ObjectEncoderContext r3 = r2.add(r3, r4, r5)
            return r3
        L8a:
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L99
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r3 = r2.add(r3, r0, r5)
            return r3
        L99:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto La8
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r3 = r2.add(r3, r4, r5)
            return r3
        La8:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto Lc9
            byte[] r4 = (byte[]) r4
            if (r5 == 0) goto Lb4
            int r5 = r4.length
            if (r5 != 0) goto Lb4
            return r2
        Lb4:
            int r3 = getTag(r3)
            int r3 = r3 << 3
            r3 = r3 | 2
            r2.writeVarInt32(r3)
            int r3 = r4.length
            r2.writeVarInt32(r3)
            java.io.OutputStream r3 = r2.output
            r3.write(r4)
            return r2
        Lc9:
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r2.objectEncoders
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ObjectEncoder r0 = (com.google.firebase.encoders.ObjectEncoder) r0
            if (r0 == 0) goto Ldc
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r3 = r2.doEncode(r0, r3, r4, r5)
            return r3
        Ldc:
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r0 = r2.valueEncoders
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ValueEncoder r0 = (com.google.firebase.encoders.ValueEncoder) r0
            if (r0 == 0) goto Lef
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r3 = r2.doEncode(r0, r3, r4, r5)
            return r3
        Lef:
            boolean r0 = r4 instanceof com.google.firebase.encoders.proto.ProtoEnum
            if (r0 == 0) goto Lfe
            com.google.firebase.encoders.proto.ProtoEnum r4 = (com.google.firebase.encoders.proto.ProtoEnum) r4
            int r4 = r4.getNumber()
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r3 = r2.add(r3, r4)
            return r3
        Lfe:
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 == 0) goto L10d
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r4 = r4.ordinal()
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r3 = r2.add(r3, r4)
            return r3
        L10d:
            com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r0 = r2.fallbackEncoder
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r3 = r2.doEncode(r0, r3, r4, r5)
            return r3
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public /* bridge */ /* synthetic */ com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, boolean r2) throws java.io.IOException {
            r0 = this;
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor r2, int r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r2 = r1.add(r2, r3, r0)
            return r2
    }

    com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor r3, int r4, boolean r5) throws java.io.IOException {
            r2 = this;
            if (r5 == 0) goto L5
            if (r4 != 0) goto L5
            return r2
        L5:
            com.google.firebase.encoders.proto.Protobuf r3 = getProtobuf(r3)
            int[] r5 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding
            com.google.firebase.encoders.proto.Protobuf$IntEncoding r0 = r3.intEncoding()
            int r0 = r0.ordinal()
            r5 = r5[r0]
            r0 = 1
            r1 = 3
            if (r5 == r0) goto L4d
            r0 = 2
            if (r5 == r0) goto L3c
            if (r5 == r1) goto L1f
            goto L58
        L1f:
            int r3 = r3.tag()
            int r3 = r3 << r1
            r3 = r3 | 5
            r2.writeVarInt32(r3)
            java.io.OutputStream r3 = r2.output
            r5 = 4
            java.nio.ByteBuffer r5 = allocateBuffer(r5)
            java.nio.ByteBuffer r4 = r5.putInt(r4)
            byte[] r4 = r4.array()
            r3.write(r4)
            goto L58
        L3c:
            int r3 = r3.tag()
            int r3 = r3 << r1
            r2.writeVarInt32(r3)
            int r3 = r4 << 1
            int r4 = r4 >> 31
            r3 = r3 ^ r4
            r2.writeVarInt32(r3)
            goto L58
        L4d:
            int r3 = r3.tag()
            int r3 = r3 << r1
            r2.writeVarInt32(r3)
            r2.writeVarInt32(r4)
        L58:
            return r2
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor r2, long r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r2 = r1.add(r2, r3, r0)
            return r2
    }

    com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor r4, long r5, boolean r7) throws java.io.IOException {
            r3 = this;
            if (r7 == 0) goto L9
            r0 = 0
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 != 0) goto L9
            return r3
        L9:
            com.google.firebase.encoders.proto.Protobuf r4 = getProtobuf(r4)
            int[] r7 = com.google.firebase.encoders.proto.ProtobufDataEncoderContext.AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding
            com.google.firebase.encoders.proto.Protobuf$IntEncoding r0 = r4.intEncoding()
            int r0 = r0.ordinal()
            r7 = r7[r0]
            r0 = 1
            r1 = 3
            if (r7 == r0) goto L53
            r2 = 2
            if (r7 == r2) goto L40
            if (r7 == r1) goto L23
            goto L5e
        L23:
            int r4 = r4.tag()
            int r4 = r4 << r1
            r4 = r4 | r0
            r3.writeVarInt32(r4)
            java.io.OutputStream r4 = r3.output
            r7 = 8
            java.nio.ByteBuffer r7 = allocateBuffer(r7)
            java.nio.ByteBuffer r5 = r7.putLong(r5)
            byte[] r5 = r5.array()
            r4.write(r5)
            goto L5e
        L40:
            int r4 = r4.tag()
            int r4 = r4 << r1
            r3.writeVarInt32(r4)
            long r0 = r5 << r0
            r4 = 63
            long r4 = r5 >> r4
            long r4 = r4 ^ r0
            r3.writeVarInt64(r4)
            goto L5e
        L53:
            int r4 = r4.tag()
            int r4 = r4 << r1
            r3.writeVarInt32(r4)
            r3.writeVarInt64(r5)
        L5e:
            return r3
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor r2, boolean r3) throws java.io.IOException {
            r1 = this;
            r0 = 1
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r2 = r1.add(r2, r3, r0)
            return r2
    }

    com.google.firebase.encoders.proto.ProtobufDataEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, boolean r2, boolean r3) throws java.io.IOException {
            r0 = this;
            com.google.firebase.encoders.proto.ProtobufDataEncoderContext r1 = r0.add(r1, r2, r3)
            return r1
    }

    com.google.firebase.encoders.proto.ProtobufDataEncoderContext encode(java.lang.Object r4) throws java.io.IOException {
            r3 = this;
            if (r4 != 0) goto L3
            return r3
        L3:
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r3.objectEncoders
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ObjectEncoder r0 = (com.google.firebase.encoders.ObjectEncoder) r0
            if (r0 == 0) goto L15
            r0.encode(r4, r3)
            return r3
        L15:
            com.google.firebase.encoders.EncodingException r0 = new com.google.firebase.encoders.EncodingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No encoder for "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
