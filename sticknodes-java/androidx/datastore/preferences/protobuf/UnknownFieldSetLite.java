package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class UnknownFieldSetLite {
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSetLite DEFAULT_INSTANCE = null;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private java.lang.Object[] objects;
    private int[] tags;

    static {
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = new androidx.datastore.preferences.protobuf.UnknownFieldSetLite
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite.DEFAULT_INSTANCE = r0
            return
    }

    private UnknownFieldSetLite() {
            r4 = this;
            r0 = 8
            int[] r1 = new int[r0]
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r3 = 1
            r4.<init>(r2, r1, r0, r3)
            return
    }

    private UnknownFieldSetLite(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.memoizedSerializedSize = r0
            r1.count = r2
            r1.tags = r3
            r1.objects = r4
            r1.isMutable = r5
            return
    }

    private void ensureCapacity() {
            r3 = this;
            int r0 = r3.count
            int[] r1 = r3.tags
            int r2 = r1.length
            if (r0 != r2) goto L1e
            r2 = 4
            if (r0 >= r2) goto Ld
            r2 = 8
            goto Lf
        Ld:
            int r2 = r0 >> 1
        Lf:
            int r0 = r0 + r2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.tags = r1
            java.lang.Object[] r1 = r3.objects
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.objects = r0
        L1e:
            return
    }

    private static boolean equals(int[] r4, int[] r5, int r6) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r6) goto Le
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto Lb
            return r0
        Lb:
            int r1 = r1 + 1
            goto L2
        Le:
            r4 = 1
            return r4
    }

    private static boolean equals(java.lang.Object[] r4, java.lang.Object[] r5, int r6) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r6) goto L12
            r2 = r4[r1]
            r3 = r5[r1]
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lf
            return r0
        Lf:
            int r1 = r1 + 1
            goto L2
        L12:
            r4 = 1
            return r4
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSetLite getDefaultInstance() {
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.DEFAULT_INSTANCE
            return r0
    }

    private static int hashCode(int[] r3, int r4) {
            r0 = 17
            r1 = 0
        L3:
            if (r1 >= r4) goto Ld
            int r0 = r0 * 31
            r2 = r3[r1]
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L3
        Ld:
            return r0
    }

    private static int hashCode(java.lang.Object[] r3, int r4) {
            r0 = 17
            r1 = 0
        L3:
            if (r1 >= r4) goto L11
            int r0 = r0 * 31
            r2 = r3[r1]
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L3
        L11:
            return r0
    }

    static androidx.datastore.preferences.protobuf.UnknownFieldSetLite mutableCopyOf(androidx.datastore.preferences.protobuf.UnknownFieldSetLite r6, androidx.datastore.preferences.protobuf.UnknownFieldSetLite r7) {
            int r0 = r6.count
            int r1 = r7.count
            int r0 = r0 + r1
            int[] r1 = r6.tags
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            int[] r2 = r7.tags
            int r3 = r6.count
            int r4 = r7.count
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r1, r3, r4)
            java.lang.Object[] r2 = r6.objects
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.Object[] r3 = r7.objects
            int r6 = r6.count
            int r7 = r7.count
            java.lang.System.arraycopy(r3, r5, r2, r6, r7)
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r6 = new androidx.datastore.preferences.protobuf.UnknownFieldSetLite
            r7 = 1
            r6.<init>(r0, r1, r2, r7)
            return r6
    }

    static androidx.datastore.preferences.protobuf.UnknownFieldSetLite newInstance() {
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = new androidx.datastore.preferences.protobuf.UnknownFieldSetLite
            r0.<init>()
            return r0
    }

    private static void writeField(int r2, java.lang.Object r3, androidx.datastore.preferences.protobuf.Writer r4) throws java.io.IOException {
            int r0 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r2)
            int r2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r2)
            if (r2 == 0) goto L5a
            r1 = 1
            if (r2 == r1) goto L50
            r1 = 2
            if (r2 == r1) goto L4a
            r1 = 3
            if (r2 == r1) goto L2a
            r1 = 5
            if (r2 != r1) goto L20
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            r4.writeFixed32(r0, r2)
            goto L63
        L20:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r3 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            r2.<init>(r3)
            throw r2
        L2a:
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r2 = r4.fieldOrder()
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r1 = androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING
            if (r2 != r1) goto L3e
            r4.writeStartGroup(r0)
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r3 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r3
            r3.writeTo(r4)
            r4.writeEndGroup(r0)
            goto L63
        L3e:
            r4.writeEndGroup(r0)
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r3 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r3
            r3.writeTo(r4)
            r4.writeStartGroup(r0)
            goto L63
        L4a:
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            r4.writeBytes(r0, r3)
            goto L63
        L50:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r4.writeFixed64(r0, r2)
            goto L63
        L5a:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r4.writeInt64(r0, r2)
        L63:
            return
    }

    void checkMutable() {
            r1 = this;
            boolean r0 = r1.isMutable
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 != 0) goto L8
            return r1
        L8:
            boolean r2 = r6 instanceof androidx.datastore.preferences.protobuf.UnknownFieldSetLite
            if (r2 != 0) goto Ld
            return r1
        Ld:
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r6 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r6
            int r2 = r5.count
            int r3 = r6.count
            if (r2 != r3) goto L2d
            int[] r3 = r5.tags
            int[] r4 = r6.tags
            boolean r2 = equals(r3, r4, r2)
            if (r2 == 0) goto L2d
            java.lang.Object[] r2 = r5.objects
            java.lang.Object[] r6 = r6.objects
            int r3 = r5.count
            boolean r6 = equals(r2, r6, r3)
            if (r6 != 0) goto L2c
            goto L2d
        L2c:
            return r0
        L2d:
            return r1
    }

    public int getSerializedSize() {
            r6 = this;
            int r0 = r6.memoizedSerializedSize
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = 0
        L8:
            int r2 = r6.count
            if (r0 >= r2) goto L7d
            int[] r2 = r6.tags
            r2 = r2[r0]
            int r3 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r2)
            int r2 = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(r2)
            if (r2 == 0) goto L6b
            r4 = 1
            if (r2 == r4) goto L5c
            r4 = 2
            if (r2 == r4) goto L51
            r5 = 3
            if (r2 == r5) goto L3f
            r4 = 5
            if (r2 != r4) goto L35
            java.lang.Object[] r2 = r6.objects
            r2 = r2[r0]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(r3, r2)
            goto L79
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException r1 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType()
            r0.<init>(r1)
            throw r0
        L3f:
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r3)
            int r2 = r2 * 2
            java.lang.Object[] r3 = r6.objects
            r3 = r3[r0]
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r3 = (androidx.datastore.preferences.protobuf.UnknownFieldSetLite) r3
            int r3 = r3.getSerializedSize()
            int r2 = r2 + r3
            goto L79
        L51:
            java.lang.Object[] r2 = r6.objects
            r2 = r2[r0]
            androidx.datastore.preferences.protobuf.ByteString r2 = (androidx.datastore.preferences.protobuf.ByteString) r2
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r3, r2)
            goto L79
        L5c:
            java.lang.Object[] r2 = r6.objects
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(r3, r4)
            goto L79
        L6b:
            java.lang.Object[] r2 = r6.objects
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64Size(r3, r4)
        L79:
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L8
        L7d:
            r6.memoizedSerializedSize = r1
            return r1
    }

    public int getSerializedSizeAsMessageSet() {
            r4 = this;
            int r0 = r4.memoizedSerializedSize
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = 0
        L8:
            int r2 = r4.count
            if (r0 >= r2) goto L22
            int[] r2 = r4.tags
            r2 = r2[r0]
            int r2 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r2)
            java.lang.Object[] r3 = r4.objects
            r3 = r3[r0]
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeRawMessageSetExtensionSize(r2, r3)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L8
        L22:
            r4.memoizedSerializedSize = r1
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.count
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int[] r2 = r3.tags
            int r0 = hashCode(r2, r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object[] r0 = r3.objects
            int r2 = r3.count
            int r0 = hashCode(r0, r2)
            int r1 = r1 + r0
            return r1
    }

    public void makeImmutable() {
            r1 = this;
            r0 = 0
            r1.isMutable = r0
            return
    }

    final void printWithIndent(java.lang.StringBuilder r4, int r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.count
            if (r0 >= r1) goto L1b
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            androidx.datastore.preferences.protobuf.MessageLiteToString.printField(r4, r5, r1, r2)
            int r0 = r0 + 1
            goto L1
        L1b:
            return
    }

    void storeField(int r3, java.lang.Object r4) {
            r2 = this;
            r2.checkMutable()
            r2.ensureCapacity()
            int[] r0 = r2.tags
            int r1 = r2.count
            r0[r1] = r3
            java.lang.Object[] r3 = r2.objects
            r3[r1] = r4
            int r1 = r1 + 1
            r2.count = r1
            return
    }

    void writeAsMessageSetTo(androidx.datastore.preferences.protobuf.Writer r4) throws java.io.IOException {
            r3 = this;
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r1 = androidx.datastore.preferences.protobuf.Writer.FieldOrder.DESCENDING
            if (r0 != r1) goto L20
            int r0 = r3.count
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L37
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            r4.writeMessageSetItem(r1, r2)
            int r0 = r0 + (-1)
            goto Lc
        L20:
            r0 = 0
        L21:
            int r1 = r3.count
            if (r0 >= r1) goto L37
            int[] r1 = r3.tags
            r1 = r1[r0]
            int r1 = androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(r1)
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            r4.writeMessageSetItem(r1, r2)
            int r0 = r0 + 1
            goto L21
        L37:
            return
    }

    public void writeTo(androidx.datastore.preferences.protobuf.Writer r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.count
            if (r0 != 0) goto L5
            return
        L5:
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r1 = androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING
            if (r0 != r1) goto L20
            r0 = 0
        Le:
            int r1 = r3.count
            if (r0 >= r1) goto L34
            int[] r1 = r3.tags
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            writeField(r1, r2, r4)
            int r0 = r0 + 1
            goto Le
        L20:
            int r0 = r3.count
            int r0 = r0 + (-1)
        L24:
            if (r0 < 0) goto L34
            int[] r1 = r3.tags
            r1 = r1[r0]
            java.lang.Object[] r2 = r3.objects
            r2 = r2[r0]
            writeField(r1, r2, r4)
            int r0 = r0 + (-1)
            goto L24
        L34:
            return
    }
}
