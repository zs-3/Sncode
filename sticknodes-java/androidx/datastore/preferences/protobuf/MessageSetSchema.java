package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class MessageSetSchema<T> implements androidx.datastore.preferences.protobuf.Schema<T> {
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;
    private final androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;

    private MessageSetSchema(androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r1, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r2, androidx.datastore.preferences.protobuf.MessageLite r3) {
            r0 = this;
            r0.<init>()
            r0.unknownFieldSchema = r1
            boolean r1 = r2.hasExtensions(r3)
            r0.hasExtensions = r1
            r0.extensionSchema = r2
            r0.defaultInstance = r3
            return
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            int r1 = r1.getSerializedSizeAsMessageSet(r2)
            return r1
    }

    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r10, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r11, T r12, androidx.datastore.preferences.protobuf.Reader r13, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r14) throws java.io.IOException {
            r9 = this;
            java.lang.Object r7 = r10.getBuilderFromMessage(r12)
            androidx.datastore.preferences.protobuf.FieldSet r8 = r11.getMutableExtensions(r12)
        L8:
            int r0 = r13.getFieldNumber()     // Catch: java.lang.Throwable -> L27
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L15
            r10.setBuilderToMessage(r12, r7)
            return
        L15:
            r0 = r9
            r1 = r13
            r2 = r14
            r3 = r11
            r4 = r8
            r5 = r10
            r6 = r7
            boolean r0 = r0.parseMessageSetItemOrUnknownField(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L23
            goto L8
        L23:
            r10.setBuilderToMessage(r12, r7)
            return
        L27:
            r11 = move-exception
            r10.setBuilderToMessage(r12, r7)
            throw r11
    }

    static <T> androidx.datastore.preferences.protobuf.MessageSetSchema<T> newSchema(androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r1, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r2, androidx.datastore.preferences.protobuf.MessageLite r3) {
            androidx.datastore.preferences.protobuf.MessageSetSchema r0 = new androidx.datastore.preferences.protobuf.MessageSetSchema
            r0.<init>(r1, r2, r3)
            return r0
    }

    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> boolean parseMessageSetItemOrUnknownField(androidx.datastore.preferences.protobuf.Reader r7, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r8, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r9, androidx.datastore.preferences.protobuf.FieldSet<ET> r10, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r11, UB r12) throws java.io.IOException {
            r6 = this;
            int r0 = r7.getTag()
            int r1 = androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG
            r2 = 1
            if (r0 == r1) goto L2a
            int r1 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r0)
            r3 = 2
            if (r1 != r3) goto L25
            androidx.datastore.preferences.protobuf.MessageLite r1 = r6.defaultInstance
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r0)
            java.lang.Object r0 = r9.findExtensionByNumber(r8, r1, r0)
            if (r0 == 0) goto L20
            r9.parseLengthPrefixedMessageSetItem(r7, r0, r8, r10)
            return r2
        L20:
            boolean r7 = r11.mergeOneFieldFrom(r12, r7)
            return r7
        L25:
            boolean r7 = r7.skipField()
            return r7
        L2a:
            r0 = 0
            r1 = 0
            r3 = r1
        L2d:
            int r4 = r7.getFieldNumber()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L37
            goto L5f
        L37:
            int r4 = r7.getTag()
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG
            if (r4 != r5) goto L4a
            int r0 = r7.readUInt32()
            androidx.datastore.preferences.protobuf.MessageLite r1 = r6.defaultInstance
            java.lang.Object r1 = r9.findExtensionByNumber(r8, r1, r0)
            goto L2d
        L4a:
            int r5 = androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG
            if (r4 != r5) goto L59
            if (r1 == 0) goto L54
            r9.parseLengthPrefixedMessageSetItem(r7, r1, r8, r10)
            goto L2d
        L54:
            androidx.datastore.preferences.protobuf.ByteString r3 = r7.readBytes()
            goto L2d
        L59:
            boolean r4 = r7.skipField()
            if (r4 != 0) goto L2d
        L5f:
            int r7 = r7.getTag()
            int r4 = androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG
            if (r7 != r4) goto L73
            if (r3 == 0) goto L72
            if (r1 == 0) goto L6f
            r9.parseMessageSetItem(r3, r1, r8, r10)
            goto L72
        L6f:
            r11.addLengthDelimited(r12, r0, r3)
        L72:
            return r2
        L73:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r7 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag()
            throw r7
    }

    private <UT, UB> void writeUnknownFieldsHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r1, T r2, androidx.datastore.preferences.protobuf.Writer r3) throws java.io.IOException {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            r1.writeAsMessageSetTo(r2, r3)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T r3, T r4) {
            r2 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r3)
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r1 = r2.unknownFieldSchema
            java.lang.Object r1 = r1.getFromMessage(r4)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            boolean r0 = r2.hasExtensions
            if (r0 == 0) goto L29
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r3 = r0.getExtensions(r3)
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r4 = r0.getExtensions(r4)
            boolean r3 = r3.equals(r4)
            return r3
        L29:
            r3 = 1
            return r3
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T r3) {
            r2 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            int r0 = r2.getUnknownFieldsSerializedSize(r0, r3)
            int r0 = r0 + 0
            boolean r1 = r2.hasExtensions
            if (r1 == 0) goto L17
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r1 = r2.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r3 = r1.getExtensions(r3)
            int r3 = r3.getMessageSetSerializedSize()
            int r0 = r0 + r3
        L17:
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T r3) {
            r2 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r3)
            int r0 = r0.hashCode()
            boolean r1 = r2.hasExtensions
            if (r1 == 0) goto L1b
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r1 = r2.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r3 = r1.getExtensions(r3)
            int r0 = r0 * 53
            int r3 = r3.hashCode()
            int r0 = r0 + r3
        L1b:
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T r2) {
            r1 = this;
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r1.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r2 = r0.getExtensions(r2)
            boolean r2 = r2.isInitialized()
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T r2) {
            r1 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r1.unknownFieldSchema
            r0.makeImmutable(r2)
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r1.extensionSchema
            r0.makeImmutable(r2)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T r7, androidx.datastore.preferences.protobuf.Reader r8, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
            r6 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r1 = r6.unknownFieldSchema
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r2 = r6.extensionSchema
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.mergeFromHelper(r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T r2, T r3) {
            r1 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r1.unknownFieldSchema
            androidx.datastore.preferences.protobuf.SchemaUtil.mergeUnknownFields(r0, r2, r3)
            boolean r0 = r1.hasExtensions
            if (r0 == 0) goto Le
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r1.extensionSchema
            androidx.datastore.preferences.protobuf.SchemaUtil.mergeExtensions(r0, r2, r3)
        Le:
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
            r1 = this;
            androidx.datastore.preferences.protobuf.MessageLite r0 = r1.defaultInstance
            androidx.datastore.preferences.protobuf.MessageLite$Builder r0 = r0.newBuilderForType()
            androidx.datastore.preferences.protobuf.MessageLite r0 = r0.buildPartial()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T r6, androidx.datastore.preferences.protobuf.Writer r7) throws java.io.IOException {
            r5 = this;
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r5.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r0 = r0.getExtensions(r6)
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite r2 = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) r2
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r3 = r2.getLiteJavaType()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r4 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE
            if (r3 != r4) goto L52
            boolean r3 = r2.isRepeated()
            if (r3 != 0) goto L52
            boolean r3 = r2.isPacked()
            if (r3 != 0) goto L52
            boolean r3 = r1 instanceof androidx.datastore.preferences.protobuf.LazyField.LazyEntry
            if (r3 == 0) goto L46
            int r2 = r2.getNumber()
            androidx.datastore.preferences.protobuf.LazyField$LazyEntry r1 = (androidx.datastore.preferences.protobuf.LazyField.LazyEntry) r1
            androidx.datastore.preferences.protobuf.LazyField r1 = r1.getField()
            androidx.datastore.preferences.protobuf.ByteString r1 = r1.toByteString()
            r7.writeMessageSetItem(r2, r1)
            goto La
        L46:
            int r2 = r2.getNumber()
            java.lang.Object r1 = r1.getValue()
            r7.writeMessageSetItem(r2, r1)
            goto La
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Found invalid MessageSet item."
            r6.<init>(r7)
            throw r6
        L5a:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r5.unknownFieldSchema
            r5.writeUnknownFieldsHelper(r0, r6, r7)
            return
    }
}
