package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class SchemaUtil {
    private static final java.lang.Class<?> GENERATED_MESSAGE_CLASS = null;
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = null;
    private static final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = null;

    static {
            java.lang.Class r0 = getGeneratedMessageClass()
            androidx.datastore.preferences.protobuf.SchemaUtil.GENERATED_MESSAGE_CLASS = r0
            r0 = 0
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r0 = getUnknownFieldSetSchema(r0)
            androidx.datastore.preferences.protobuf.SchemaUtil.PROTO2_UNKNOWN_FIELD_SET_SCHEMA = r0
            r0 = 1
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r0 = getUnknownFieldSetSchema(r0)
            androidx.datastore.preferences.protobuf.SchemaUtil.PROTO3_UNKNOWN_FIELD_SET_SCHEMA = r0
            androidx.datastore.preferences.protobuf.UnknownFieldSetLiteSchema r0 = new androidx.datastore.preferences.protobuf.UnknownFieldSetLiteSchema
            r0.<init>()
            androidx.datastore.preferences.protobuf.SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA = r0
            return
    }

    static int computeSizeBoolList(int r0, java.util.List<?> r1, boolean r2) {
            int r1 = r1.size()
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            if (r2 == 0) goto L14
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r0)
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r1)
            int r0 = r0 + r1
            return r0
        L14:
            r2 = 1
            int r0 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(r0, r2)
            int r1 = r1 * r0
            return r1
    }

    static int computeSizeBoolListNoTag(java.util.List<?> r0) {
            int r0 = r0.size()
            return r0
    }

    static int computeSizeByteStringList(int r2, java.util.List<androidx.datastore.preferences.protobuf.ByteString> r3) {
            int r0 = r3.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r2)
            int r0 = r0 * r2
        Le:
            int r2 = r3.size()
            if (r1 >= r2) goto L22
            java.lang.Object r2 = r3.get(r1)
            androidx.datastore.preferences.protobuf.ByteString r2 = (androidx.datastore.preferences.protobuf.ByteString) r2
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto Le
        L22:
            return r0
    }

    static int computeSizeEnumList(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeEnumListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeEnumListNoTag(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            if (r2 == 0) goto L1d
            androidx.datastore.preferences.protobuf.IntArrayList r4 = (androidx.datastore.preferences.protobuf.IntArrayList) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeFixed32List(int r1, java.util.List<?> r2, boolean r3) {
            int r2 = r2.size()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            if (r3 == 0) goto L16
            int r2 = r2 * 4
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L16:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(r1, r0)
            int r2 = r2 * r1
            return r2
    }

    static int computeSizeFixed32ListNoTag(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 4
            return r0
    }

    static int computeSizeFixed64List(int r2, java.util.List<?> r3, boolean r4) {
            int r3 = r3.size()
            if (r3 != 0) goto L8
            r2 = 0
            return r2
        L8:
            if (r4 == 0) goto L16
            int r3 = r3 * 8
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r2)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r3)
            int r2 = r2 + r3
            return r2
        L16:
            r0 = 0
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(r2, r0)
            int r3 = r3 * r2
            return r3
    }

    static int computeSizeFixed64ListNoTag(java.util.List<?> r0) {
            int r0 = r0.size()
            int r0 = r0 * 8
            return r0
    }

    static int computeSizeGroupList(int r4, java.util.List<androidx.datastore.preferences.protobuf.MessageLite> r5, androidx.datastore.preferences.protobuf.Schema r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = 0
        L9:
            if (r1 >= r0) goto L19
            java.lang.Object r3 = r5.get(r1)
            androidx.datastore.preferences.protobuf.MessageLite r3 = (androidx.datastore.preferences.protobuf.MessageLite) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(r4, r3, r6)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L9
        L19:
            return r2
    }

    static int computeSizeInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeInt32ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeInt32ListNoTag(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            if (r2 == 0) goto L1d
            androidx.datastore.preferences.protobuf.IntArrayList r4 = (androidx.datastore.preferences.protobuf.IntArrayList) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r0 = computeSizeInt64ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r0)
            int r1 = r1 + r2
            return r1
        L18:
            int r2 = r2.size()
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = r2 * r1
            int r0 = r0 + r2
            return r0
    }

    static int computeSizeInt64ListNoTag(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
            if (r2 == 0) goto L1d
            androidx.datastore.preferences.protobuf.LongArrayList r5 = (androidx.datastore.preferences.protobuf.LongArrayList) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeMessage(int r1, java.lang.Object r2, androidx.datastore.preferences.protobuf.Schema r3) {
            boolean r0 = r2 instanceof androidx.datastore.preferences.protobuf.LazyFieldLite
            if (r0 == 0) goto Lb
            androidx.datastore.preferences.protobuf.LazyFieldLite r2 = (androidx.datastore.preferences.protobuf.LazyFieldLite) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSize(r1, r2)
            return r1
        Lb:
            androidx.datastore.preferences.protobuf.MessageLite r2 = (androidx.datastore.preferences.protobuf.MessageLite) r2
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSize(r1, r2, r3)
            return r1
    }

    static int computeSizeMessageList(int r4, java.util.List<?> r5, androidx.datastore.preferences.protobuf.Schema r6) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r4)
            int r4 = r4 * r0
        Le:
            if (r1 >= r0) goto L29
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof androidx.datastore.preferences.protobuf.LazyFieldLite
            if (r3 == 0) goto L1f
            androidx.datastore.preferences.protobuf.LazyFieldLite r2 = (androidx.datastore.preferences.protobuf.LazyFieldLite) r2
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLazyFieldSizeNoTag(r2)
            goto L25
        L1f:
            androidx.datastore.preferences.protobuf.MessageLite r2 = (androidx.datastore.preferences.protobuf.MessageLite) r2
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeMessageSizeNoTag(r2, r6)
        L25:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto Le
        L29:
            return r4
    }

    static int computeSizeSInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeSInt32ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeSInt32ListNoTag(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            if (r2 == 0) goto L1d
            androidx.datastore.preferences.protobuf.IntArrayList r4 = (androidx.datastore.preferences.protobuf.IntArrayList) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeSInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeSInt64ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeSInt64ListNoTag(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
            if (r2 == 0) goto L1d
            androidx.datastore.preferences.protobuf.LongArrayList r5 = (androidx.datastore.preferences.protobuf.LongArrayList) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeStringList(int r4, java.util.List<?> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r4)
            int r4 = r4 * r0
            boolean r2 = r5 instanceof androidx.datastore.preferences.protobuf.LazyStringList
            if (r2 == 0) goto L2f
            androidx.datastore.preferences.protobuf.LazyStringList r5 = (androidx.datastore.preferences.protobuf.LazyStringList) r5
        L14:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r5.getRaw(r1)
            boolean r3 = r2 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r3 == 0) goto L25
            androidx.datastore.preferences.protobuf.ByteString r2 = (androidx.datastore.preferences.protobuf.ByteString) r2
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            goto L2b
        L25:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag(r2)
        L2b:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto L14
        L2f:
            if (r1 >= r0) goto L4a
            java.lang.Object r2 = r5.get(r1)
            boolean r3 = r2 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r3 == 0) goto L40
            androidx.datastore.preferences.protobuf.ByteString r2 = (androidx.datastore.preferences.protobuf.ByteString) r2
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSizeNoTag(r2)
            goto L46
        L40:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSizeNoTag(r2)
        L46:
            int r4 = r4 + r2
            int r1 = r1 + 1
            goto L2f
        L4a:
            return r4
    }

    static int computeSizeUInt32List(int r1, java.util.List<java.lang.Integer> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeUInt32ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeUInt32ListNoTag(java.util.List<java.lang.Integer> r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof androidx.datastore.preferences.protobuf.IntArrayList
            if (r2 == 0) goto L1d
            androidx.datastore.preferences.protobuf.IntArrayList r4 = (androidx.datastore.preferences.protobuf.IntArrayList) r4
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            int r3 = r4.getInt(r1)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r4.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static int computeSizeUInt64List(int r1, java.util.List<java.lang.Long> r2, boolean r3) {
            int r0 = r2.size()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r2 = computeSizeUInt64ListNoTag(r2)
            if (r3 == 0) goto L18
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r2 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeLengthDelimitedFieldSize(r2)
            int r1 = r1 + r2
            return r1
        L18:
            int r1 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r1)
            int r0 = r0 * r1
            int r2 = r2 + r0
            return r2
    }

    static int computeSizeUInt64ListNoTag(java.util.List<java.lang.Long> r5) {
            int r0 = r5.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof androidx.datastore.preferences.protobuf.LongArrayList
            if (r2 == 0) goto L1d
            androidx.datastore.preferences.protobuf.LongArrayList r5 = (androidx.datastore.preferences.protobuf.LongArrayList) r5
            r2 = 0
        Lf:
            if (r1 >= r0) goto L32
            long r3 = r5.getLong(r1)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L1d:
            r2 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r5.get(r1)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64SizeNoTag(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return r2
    }

    static <UT, UB> UB filterUnknownEnumList(int r5, java.util.List<java.lang.Integer> r6, androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> r7, UB r8, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r9) {
            if (r7 != 0) goto L3
            return r8
        L3:
            boolean r0 = r6 instanceof java.util.RandomAccess
            if (r0 == 0) goto L3c
            int r0 = r6.size()
            r1 = 0
            r2 = 0
        Ld:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            androidx.datastore.preferences.protobuf.Internal$EnumLite r4 = r7.findValueByNumber(r3)
            if (r4 == 0) goto L2b
            if (r1 == r2) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.set(r2, r3)
        L28:
            int r2 = r2 + 1
            goto L2f
        L2b:
            java.lang.Object r8 = storeUnknownEnum(r5, r3, r8, r9)
        L2f:
            int r1 = r1 + 1
            goto Ld
        L32:
            if (r2 == r0) goto L5e
            java.util.List r5 = r6.subList(r2, r0)
            r5.clear()
            goto L5e
        L3c:
            java.util.Iterator r6 = r6.iterator()
        L40:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            androidx.datastore.preferences.protobuf.Internal$EnumLite r1 = r7.findValueByNumber(r0)
            if (r1 != 0) goto L40
            java.lang.Object r8 = storeUnknownEnum(r5, r0, r8, r9)
            r6.remove()
            goto L40
        L5e:
            return r8
    }

    static <UT, UB> UB filterUnknownEnumList(int r5, java.util.List<java.lang.Integer> r6, androidx.datastore.preferences.protobuf.Internal.EnumVerifier r7, UB r8, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r9) {
            if (r7 != 0) goto L3
            return r8
        L3:
            boolean r0 = r6 instanceof java.util.RandomAccess
            if (r0 == 0) goto L3c
            int r0 = r6.size()
            r1 = 0
            r2 = 0
        Ld:
            if (r1 >= r0) goto L32
            java.lang.Object r3 = r6.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r4 = r7.isInRange(r3)
            if (r4 == 0) goto L2b
            if (r1 == r2) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.set(r2, r3)
        L28:
            int r2 = r2 + 1
            goto L2f
        L2b:
            java.lang.Object r8 = storeUnknownEnum(r5, r3, r8, r9)
        L2f:
            int r1 = r1 + 1
            goto Ld
        L32:
            if (r2 == r0) goto L5e
            java.util.List r5 = r6.subList(r2, r0)
            r5.clear()
            goto L5e
        L3c:
            java.util.Iterator r6 = r6.iterator()
        L40:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = r7.isInRange(r0)
            if (r1 != 0) goto L40
            java.lang.Object r8 = storeUnknownEnum(r5, r0, r8, r9)
            r6.remove()
            goto L40
        L5e:
            return r8
    }

    private static java.lang.Class<?> getGeneratedMessageClass() {
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.GeneratedMessageV3"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    private static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> getUnknownFieldSetSchema(boolean r6) {
            r0 = 0
            java.lang.Class r1 = getUnknownFieldSetSchemaClass()     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L8
            return r0
        L8:
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L23
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L23
            r2[r5] = r6     // Catch: java.lang.Throwable -> L23
            java.lang.Object r6 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L23
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r6 = (androidx.datastore.preferences.protobuf.UnknownFieldSchema) r6     // Catch: java.lang.Throwable -> L23
            return r6
        L23:
            return r0
    }

    private static java.lang.Class<?> getUnknownFieldSetSchemaClass() {
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.UnknownFieldSetSchema"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    static <T, FT extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(androidx.datastore.preferences.protobuf.ExtensionSchema<FT> r1, T r2, T r3) {
            androidx.datastore.preferences.protobuf.FieldSet r3 = r1.getExtensions(r3)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L11
            androidx.datastore.preferences.protobuf.FieldSet r1 = r1.getMutableExtensions(r2)
            r1.mergeFrom(r3)
        L11:
            return
    }

    static <T> void mergeMap(androidx.datastore.preferences.protobuf.MapFieldSchema r1, T r2, T r3, long r4) {
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r2, r4)
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r3, r4)
            java.lang.Object r1 = r1.mergeFrom(r0, r3)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r2, r4, r1)
            return
    }

    static <T, UT, UB> void mergeUnknownFields(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r1, T r2, T r3) {
            java.lang.Object r0 = r1.getFromMessage(r2)
            java.lang.Object r3 = r1.getFromMessage(r3)
            java.lang.Object r3 = r1.merge(r0, r3)
            r1.setToMessage(r2, r3)
            return
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> proto2UnknownFieldSetSchema() {
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = androidx.datastore.preferences.protobuf.SchemaUtil.PROTO2_UNKNOWN_FIELD_SET_SCHEMA
            return r0
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> proto3UnknownFieldSetSchema() {
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = androidx.datastore.preferences.protobuf.SchemaUtil.PROTO3_UNKNOWN_FIELD_SET_SCHEMA
            return r0
    }

    public static void requireGeneratedMessage(java.lang.Class<?> r1) {
            java.lang.Class<androidx.datastore.preferences.protobuf.GeneratedMessageLite> r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L1b
            java.lang.Class<?> r0 = androidx.datastore.preferences.protobuf.SchemaUtil.GENERATED_MESSAGE_CLASS
            if (r0 == 0) goto L1b
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L13
            goto L1b
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Message classes must extend GeneratedMessage or GeneratedMessageLite"
            r1.<init>(r0)
            throw r1
        L1b:
            return
    }

    static boolean safeEquals(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    static <UT, UB> UB storeUnknownEnum(int r2, int r3, UB r4, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r5) {
            if (r4 != 0) goto L6
            java.lang.Object r4 = r5.newBuilder()
        L6:
            long r0 = (long) r3
            r5.addVarint(r4, r2, r0)
            return r4
    }

    public static androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = androidx.datastore.preferences.protobuf.SchemaUtil.UNKNOWN_FIELD_SET_LITE_SCHEMA
            return r0
    }

    public static void writeBoolList(int r1, java.util.List<java.lang.Boolean> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeBoolList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeBytesList(int r1, java.util.List<androidx.datastore.preferences.protobuf.ByteString> r2, androidx.datastore.preferences.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeBytesList(r1, r2)
        Lb:
            return
    }

    public static void writeDoubleList(int r1, java.util.List<java.lang.Double> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeDoubleList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeEnumList(int r1, java.util.List<java.lang.Integer> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeEnumList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFixed32List(int r1, java.util.List<java.lang.Integer> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFixed32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFixed64List(int r1, java.util.List<java.lang.Long> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFixed64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeFloatList(int r1, java.util.List<java.lang.Float> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeFloatList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeGroupList(int r1, java.util.List<?> r2, androidx.datastore.preferences.protobuf.Writer r3, androidx.datastore.preferences.protobuf.Schema r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeGroupList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeInt32List(int r1, java.util.List<java.lang.Integer> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeInt64List(int r1, java.util.List<java.lang.Long> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeInt64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeMessageList(int r1, java.util.List<?> r2, androidx.datastore.preferences.protobuf.Writer r3, androidx.datastore.preferences.protobuf.Schema r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeMessageList(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSFixed32List(int r1, java.util.List<java.lang.Integer> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSFixed32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSFixed64List(int r1, java.util.List<java.lang.Long> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSFixed64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSInt32List(int r1, java.util.List<java.lang.Integer> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeSInt64List(int r1, java.util.List<java.lang.Long> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeSInt64List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeStringList(int r1, java.util.List<java.lang.String> r2, androidx.datastore.preferences.protobuf.Writer r3) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeStringList(r1, r2)
        Lb:
            return
    }

    public static void writeUInt32List(int r1, java.util.List<java.lang.Integer> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeUInt32List(r1, r2, r4)
        Lb:
            return
    }

    public static void writeUInt64List(int r1, java.util.List<java.lang.Long> r2, androidx.datastore.preferences.protobuf.Writer r3, boolean r4) throws java.io.IOException {
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r3.writeUInt64List(r1, r2, r4)
        Lb:
            return
    }
}
