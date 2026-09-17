package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class MessageSchema<T> implements androidx.datastore.preferences.protobuf.Schema<T> {
    private static final int[] EMPTY_INT_ARRAY = null;
    private static final sun.misc.Unsafe UNSAFE = null;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final androidx.datastore.preferences.protobuf.MessageLite defaultInstance;
    private final androidx.datastore.preferences.protobuf.ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final androidx.datastore.preferences.protobuf.ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final androidx.datastore.preferences.protobuf.MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final androidx.datastore.preferences.protobuf.NewInstanceSchema newInstanceSchema;
    private final java.lang.Object[] objects;
    private final boolean proto3;
    private final int repeatedFieldOffsetStart;
    private final androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            androidx.datastore.preferences.protobuf.MessageSchema.EMPTY_INT_ARRAY = r0
            sun.misc.Unsafe r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getUnsafe()
            androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE = r0
            return
    }

    private MessageSchema(int[] r1, java.lang.Object[] r2, int r3, int r4, androidx.datastore.preferences.protobuf.MessageLite r5, boolean r6, boolean r7, int[] r8, int r9, int r10, androidx.datastore.preferences.protobuf.NewInstanceSchema r11, androidx.datastore.preferences.protobuf.ListFieldSchema r12, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r13, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r14, androidx.datastore.preferences.protobuf.MapFieldSchema r15) {
            r0 = this;
            r0.<init>()
            r0.buffer = r1
            r0.objects = r2
            r0.minFieldNumber = r3
            r0.maxFieldNumber = r4
            boolean r1 = r5 instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite
            r0.lite = r1
            r0.proto3 = r6
            if (r14 == 0) goto L1b
            boolean r1 = r14.hasExtensions(r5)
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r0.hasExtensions = r1
            r0.useCachedSizeField = r7
            r0.intArray = r8
            r0.checkInitializedCount = r9
            r0.repeatedFieldOffsetStart = r10
            r0.newInstanceSchema = r11
            r0.listFieldSchema = r12
            r0.unknownFieldSchema = r13
            r0.extensionSchema = r14
            r0.defaultInstance = r5
            r0.mapFieldSchema = r15
            return
    }

    private boolean arePresentForEquals(T r1, T r2, int r3) {
            r0 = this;
            boolean r1 = r0.isFieldPresent(r1, r3)
            boolean r2 = r0.isFieldPresent(r2, r3)
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private static <T> boolean booleanAt(T r0, long r1) {
            boolean r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(r0, r1)
            return r0
    }

    private static <T> double doubleAt(T r0, long r1) {
            double r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(r0, r1)
            return r0
    }

    private boolean equals(T r8, T r9, int r10) {
            r7 = this;
            int r0 = r7.typeAndOffsetAt(r10)
            long r1 = offset(r0)
            int r0 = type(r0)
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L196;
                case 1: goto L17c;
                case 2: goto L168;
                case 3: goto L154;
                case 4: goto L142;
                case 5: goto L12e;
                case 6: goto L11c;
                case 7: goto L10a;
                case 8: goto Lf4;
                case 9: goto Lde;
                case 10: goto Lc8;
                case 11: goto Lb6;
                case 12: goto La4;
                case 13: goto L92;
                case 14: goto L7e;
                case 15: goto L6c;
                case 16: goto L58;
                case 17: goto L42;
                case 18: goto L35;
                case 19: goto L35;
                case 20: goto L35;
                case 21: goto L35;
                case 22: goto L35;
                case 23: goto L35;
                case 24: goto L35;
                case 25: goto L35;
                case 26: goto L35;
                case 27: goto L35;
                case 28: goto L35;
                case 29: goto L35;
                case 30: goto L35;
                case 31: goto L35;
                case 32: goto L35;
                case 33: goto L35;
                case 34: goto L35;
                case 35: goto L35;
                case 36: goto L35;
                case 37: goto L35;
                case 38: goto L35;
                case 39: goto L35;
                case 40: goto L35;
                case 41: goto L35;
                case 42: goto L35;
                case 43: goto L35;
                case 44: goto L35;
                case 45: goto L35;
                case 46: goto L35;
                case 47: goto L35;
                case 48: goto L35;
                case 49: goto L35;
                case 50: goto L28;
                case 51: goto L12;
                case 52: goto L12;
                case 53: goto L12;
                case 54: goto L12;
                case 55: goto L12;
                case 56: goto L12;
                case 57: goto L12;
                case 58: goto L12;
                case 59: goto L12;
                case 60: goto L12;
                case 61: goto L12;
                case 62: goto L12;
                case 63: goto L12;
                case 64: goto L12;
                case 65: goto L12;
                case 66: goto L12;
                case 67: goto L12;
                case 68: goto L12;
                default: goto L11;
            }
        L11:
            return r4
        L12:
            boolean r10 = r7.isOneofCaseEqual(r8, r9, r10)
            if (r10 == 0) goto L27
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L27
            r3 = 1
        L27:
            return r3
        L28:
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r8, r9)
            return r8
        L35:
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r8, r9)
            return r8
        L42:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L57
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L57
            r3 = 1
        L57:
            return r3
        L58:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L6b
            long r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r1)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L6b
            r3 = 1
        L6b:
            return r3
        L6c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L7d
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L7d
            r3 = 1
        L7d:
            return r3
        L7e:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L91
            long r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r1)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L91
            r3 = 1
        L91:
            return r3
        L92:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto La3
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto La3
            r3 = 1
        La3:
            return r3
        La4:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lb5
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto Lb5
            r3 = 1
        Lb5:
            return r3
        Lb6:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lc7
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto Lc7
            r3 = 1
        Lc7:
            return r3
        Lc8:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Ldd
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto Ldd
            r3 = 1
        Ldd:
            return r3
        Lde:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto Lf3
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto Lf3
            r3 = 1
        Lf3:
            return r3
        Lf4:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L109
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r1)
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r1)
            boolean r8 = androidx.datastore.preferences.protobuf.SchemaUtil.safeEquals(r8, r9)
            if (r8 == 0) goto L109
            r3 = 1
        L109:
            return r3
        L10a:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L11b
            boolean r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(r8, r1)
            boolean r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(r9, r1)
            if (r8 != r9) goto L11b
            r3 = 1
        L11b:
            return r3
        L11c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L12d
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L12d
            r3 = 1
        L12d:
            return r3
        L12e:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L141
            long r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r1)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L141
            r3 = 1
        L141:
            return r3
        L142:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L153
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r1)
            int r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r1)
            if (r8 != r9) goto L153
            r3 = 1
        L153:
            return r3
        L154:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L167
            long r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r1)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L167
            r3 = 1
        L167:
            return r3
        L168:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L17b
            long r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r1)
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r1)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L17b
            r3 = 1
        L17b:
            return r3
        L17c:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L195
            float r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(r8, r1)
            int r8 = java.lang.Float.floatToIntBits(r8)
            float r9 = androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(r9, r1)
            int r9 = java.lang.Float.floatToIntBits(r9)
            if (r8 != r9) goto L195
            r3 = 1
        L195:
            return r3
        L196:
            boolean r10 = r7.arePresentForEquals(r8, r9, r10)
            if (r10 == 0) goto L1b1
            double r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(r8, r1)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            double r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(r9, r1)
            long r8 = java.lang.Double.doubleToLongBits(r8)
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 != 0) goto L1b1
            r3 = 1
        L1b1:
            return r3
    }

    private final <UT, UB> UB filterMapUnknownEnumValues(java.lang.Object r8, int r9, UB r10, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r11) {
            r7 = this;
            int r2 = r7.numberAt(r9)
            int r0 = r7.typeAndOffsetAt(r9)
            long r0 = offset(r0)
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r0)
            if (r8 != 0) goto L13
            return r10
        L13:
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r4 = r7.getEnumFieldVerifier(r9)
            if (r4 != 0) goto L1a
            return r10
        L1a:
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = r7.mapFieldSchema
            java.util.Map r3 = r0.forMutableMapData(r8)
            r0 = r7
            r1 = r9
            r5 = r10
            r6 = r11
            java.lang.Object r8 = r0.filterUnknownEnumMap(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private final <K, V, UT, UB> UB filterUnknownEnumMap(int r5, int r6, java.util.Map<K, V> r7, androidx.datastore.preferences.protobuf.Internal.EnumVerifier r8, UB r9, androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r10) {
            r4 = this;
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = r4.mapFieldSchema
            java.lang.Object r5 = r4.getMapFieldDefaultEntry(r5)
            androidx.datastore.preferences.protobuf.MapEntryLite$Metadata r5 = r0.forMapMetadata(r5)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L12:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r8.isInRange(r1)
            if (r1 != 0) goto L12
            if (r9 != 0) goto L34
            java.lang.Object r9 = r10.newBuilder()
        L34:
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            int r1 = androidx.datastore.preferences.protobuf.MapEntryLite.computeSerializedSize(r5, r1, r2)
            androidx.datastore.preferences.protobuf.ByteString$CodedBuilder r1 = androidx.datastore.preferences.protobuf.ByteString.newCodedBuilder(r1)
            androidx.datastore.preferences.protobuf.CodedOutputStream r2 = r1.getCodedOutput()
            java.lang.Object r3 = r0.getKey()     // Catch: java.io.IOException -> L5e
            java.lang.Object r0 = r0.getValue()     // Catch: java.io.IOException -> L5e
            androidx.datastore.preferences.protobuf.MapEntryLite.writeTo(r2, r5, r3, r0)     // Catch: java.io.IOException -> L5e
            androidx.datastore.preferences.protobuf.ByteString r0 = r1.build()
            r10.addLengthDelimited(r9, r6, r0)
            r7.remove()
            goto L12
        L5e:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L65:
            return r9
    }

    private static <T> float floatAt(T r0, long r1) {
            float r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(r0, r1)
            return r0
    }

    private androidx.datastore.preferences.protobuf.Internal.EnumVerifier getEnumFieldVerifier(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            int r2 = r2 / 3
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r2 = (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) r2
            return r2
    }

    private java.lang.Object getMapFieldDefaultEntry(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.objects
            int r2 = r2 / 3
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    private androidx.datastore.preferences.protobuf.Schema getMessageFieldSchema(int r4) {
            r3 = this;
            int r4 = r4 / 3
            int r4 = r4 * 2
            java.lang.Object[] r0 = r3.objects
            r0 = r0[r4]
            androidx.datastore.preferences.protobuf.Schema r0 = (androidx.datastore.preferences.protobuf.Schema) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
            java.lang.Object[] r1 = r3.objects
            int r2 = r4 + 1
            r1 = r1[r2]
            java.lang.Class r1 = (java.lang.Class) r1
            androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r1)
            java.lang.Object[] r1 = r3.objects
            r1[r4] = r0
            return r0
    }

    private int getSerializedSizeProto2(T r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        La:
            int[] r8 = r0.buffer
            int r8 = r8.length
            if (r5 >= r8) goto L51e
            int r8 = r0.typeAndOffsetAt(r5)
            int r9 = r0.numberAt(r5)
            int r10 = type(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L39
            int[] r11 = r0.buffer
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L37
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L37:
            r14 = r15
            goto L57
        L39:
            boolean r11 = r0.useCachedSizeField
            if (r11 == 0) goto L55
            androidx.datastore.preferences.protobuf.FieldType r11 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r11 = r11.id()
            if (r10 < r11) goto L55
            androidx.datastore.preferences.protobuf.FieldType r11 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r11 = r11.id()
            if (r10 > r11) goto L55
            int[] r11 = r0.buffer
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L56
        L55:
            r11 = 0
        L56:
            r14 = 0
        L57:
            long r12 = offset(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L50c;
                case 1: goto L502;
                case 2: goto L4f4;
                case 3: goto L4e6;
                case 4: goto L4d8;
                case 5: goto L4ce;
                case 6: goto L4c4;
                case 7: goto L4b9;
                case 8: goto L49d;
                case 9: goto L48c;
                case 10: goto L47d;
                case 11: goto L470;
                case 12: goto L463;
                case 13: goto L458;
                case 14: goto L44f;
                case 15: goto L442;
                case 16: goto L435;
                case 17: goto L422;
                case 18: goto L413;
                case 19: goto L407;
                case 20: goto L3fb;
                case 21: goto L3ef;
                case 22: goto L3e3;
                case 23: goto L3d7;
                case 24: goto L3cb;
                case 25: goto L3bf;
                case 26: goto L3b4;
                case 27: goto L3a5;
                case 28: goto L399;
                case 29: goto L38c;
                case 30: goto L37f;
                case 31: goto L372;
                case 32: goto L365;
                case 33: goto L358;
                case 34: goto L34b;
                case 35: goto L32b;
                case 36: goto L30e;
                case 37: goto L2f1;
                case 38: goto L2d4;
                case 39: goto L2b6;
                case 40: goto L298;
                case 41: goto L27a;
                case 42: goto L25c;
                case 43: goto L23e;
                case 44: goto L220;
                case 45: goto L202;
                case 46: goto L1e4;
                case 47: goto L1c6;
                case 48: goto L1a8;
                case 49: goto L198;
                case 50: goto L188;
                case 51: goto L17a;
                case 52: goto L16e;
                case 53: goto L15e;
                case 54: goto L14e;
                case 55: goto L13e;
                case 56: goto L132;
                case 57: goto L125;
                case 58: goto L118;
                case 59: goto Lfa;
                case 60: goto Le6;
                case 61: goto Ld4;
                case 62: goto Lc4;
                case 63: goto Lb4;
                case 64: goto La7;
                case 65: goto L9b;
                case 66: goto L8b;
                case 67: goto L7b;
                case 68: goto L65;
                default: goto L63;
            }
        L63:
            goto L41f
        L65:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.MessageLite r3 = (androidx.datastore.preferences.protobuf.MessageLite) r3
            androidx.datastore.preferences.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(r9, r3, r4)
            goto L41e
        L7b:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            long r3 = oneofLongAt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64Size(r9, r3)
            goto L41e
        L8b:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            int r3 = oneofIntAt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32Size(r9, r3)
            goto L41e
        L9b:
            boolean r8 = r0.isOneofPresent(r1, r9, r5)
            if (r8 == 0) goto L41f
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64Size(r9, r3)
            goto L41e
        La7:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32Size(r9, r3)
            goto L461
        Lb4:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            int r3 = oneofIntAt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSize(r9, r3)
            goto L41e
        Lc4:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            int r3 = oneofIntAt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32Size(r9, r3)
            goto L41e
        Ld4:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r9, r3)
            goto L41e
        Le6:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessage(r9, r3, r4)
            goto L41e
        Lfa:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r4 == 0) goto L110
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r9, r3)
            goto L41e
        L110:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSize(r9, r3)
            goto L41e
        L118:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(r9, r3)
            goto L41e
        L125:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(r9, r3)
            goto L461
        L132:
            boolean r8 = r0.isOneofPresent(r1, r9, r5)
            if (r8 == 0) goto L41f
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(r9, r3)
            goto L41e
        L13e:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            int r3 = oneofIntAt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32Size(r9, r3)
            goto L41e
        L14e:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            long r3 = oneofLongAt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64Size(r9, r3)
            goto L41e
        L15e:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            long r3 = oneofLongAt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64Size(r9, r3)
            goto L41e
        L16e:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSize(r9, r8)
            goto L41e
        L17a:
            boolean r3 = r0.isOneofPresent(r1, r9, r5)
            if (r3 == 0) goto L41f
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSize(r9, r3)
            goto L41e
        L188:
            androidx.datastore.preferences.protobuf.MapFieldSchema r3 = r0.mapFieldSchema
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.getMapFieldDefaultEntry(r5)
            int r3 = r3.getSerializedSize(r9, r4, r8)
            goto L41e
        L198:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeGroupList(r9, r3, r4)
            goto L41e
        L1a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt64ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L1bc
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L1bc:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L1c6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt32ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L1da
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L1da:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L1e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L1f8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L1f8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L202:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L216
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L216:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L220:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeEnumListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L234
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L234:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L23e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt32ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L252
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L252:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L25c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeBoolListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L270
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L270:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L27a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L28e
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L28e:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L298:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L2ac
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L2ac:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L2b6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt32ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L2ca
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L2ca:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L2d4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt64ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L2e8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L2e8:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L2f1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt64ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L305
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L305:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L30e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L322
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L322:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
            goto L347
        L32b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r3)
            if (r3 <= 0) goto L41f
            boolean r4 = r0.useCachedSizeField
            if (r4 == 0) goto L33f
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L33f:
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r9)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r3)
        L347:
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L461
        L34b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt64List(r9, r3, r4)
            goto L41e
        L358:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt32List(r9, r3, r4)
            goto L41e
        L365:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(r9, r3, r4)
            goto L41e
        L372:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(r9, r3, r4)
            goto L41e
        L37f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeEnumList(r9, r3, r4)
            goto L41e
        L38c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt32List(r9, r3, r4)
            goto L41e
        L399:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeByteStringList(r9, r3)
            goto L41e
        L3a5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            androidx.datastore.preferences.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessageList(r9, r3, r4)
            goto L41e
        L3b4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeStringList(r9, r3)
            goto L41e
        L3bf:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeBoolList(r9, r3, r4)
            goto L41e
        L3cb:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(r9, r3, r4)
            goto L41e
        L3d7:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(r9, r3, r4)
            goto L41e
        L3e3:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt32List(r9, r3, r4)
            goto L41e
        L3ef:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt64List(r9, r3, r4)
            goto L41e
        L3fb:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt64List(r9, r3, r4)
            goto L41e
        L407:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(r9, r3, r4)
            goto L41e
        L413:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(r9, r3, r4)
        L41e:
            int r6 = r6 + r3
        L41f:
            r10 = 0
            goto L518
        L422:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.MessageLite r3 = (androidx.datastore.preferences.protobuf.MessageLite) r3
            androidx.datastore.preferences.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(r9, r3, r4)
            goto L41e
        L435:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64Size(r9, r3)
            goto L41e
        L442:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32Size(r9, r3)
            goto L41e
        L44f:
            r8 = r7 & r14
            if (r8 == 0) goto L41f
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64Size(r9, r3)
            goto L41e
        L458:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            r3 = 0
            int r4 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32Size(r9, r3)
        L461:
            int r6 = r6 + r4
            goto L41f
        L463:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSize(r9, r3)
            goto L41e
        L470:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32Size(r9, r3)
            goto L41e
        L47d:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r9, r3)
            goto L41e
        L48c:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            java.lang.Object r3 = r2.getObject(r1, r12)
            androidx.datastore.preferences.protobuf.Schema r4 = r0.getMessageFieldSchema(r5)
            int r3 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessage(r9, r3, r4)
            goto L41e
        L49d:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r4 == 0) goto L4b1
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r9, r3)
            goto L41e
        L4b1:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSize(r9, r3)
            goto L41e
        L4b9:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            r3 = 1
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(r9, r3)
            goto L41e
        L4c4:
            r3 = r7 & r14
            if (r3 == 0) goto L41f
            r10 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(r9, r10)
            goto L517
        L4ce:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L518
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(r9, r3)
            goto L517
        L4d8:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L518
            int r3 = r2.getInt(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32Size(r9, r3)
            goto L517
        L4e6:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L518
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64Size(r9, r3)
            goto L517
        L4f4:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L518
            long r3 = r2.getLong(r1, r12)
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64Size(r9, r3)
            goto L517
        L502:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L518
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSize(r9, r8)
            goto L517
        L50c:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L518
            r3 = 0
            int r3 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSize(r9, r3)
        L517:
            int r6 = r6 + r3
        L518:
            int r5 = r5 + 3
            r4 = r16
            goto La
        L51e:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            int r2 = r0.getUnknownFieldsSerializedSize(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.hasExtensions
            if (r2 == 0) goto L534
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r2 = r0.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r1 = r2.getExtensions(r1)
            int r1 = r1.getSerializedSize()
            int r6 = r6 + r1
        L534:
            return r6
    }

    private int getSerializedSizeProto3(T r16) {
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE
            r3 = 0
            r4 = 0
            r5 = 0
        L8:
            int[] r6 = r0.buffer
            int r6 = r6.length
            if (r4 >= r6) goto L4e3
            int r6 = r15.typeAndOffsetAt(r4)
            int r7 = type(r6)
            int r8 = r15.numberAt(r4)
            long r9 = offset(r6)
            androidx.datastore.preferences.protobuf.FieldType r6 = androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.id()
            if (r7 < r6) goto L38
            androidx.datastore.preferences.protobuf.FieldType r6 = androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.id()
            if (r7 > r6) goto L38
            int[] r6 = r0.buffer
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L39
        L38:
            r6 = 0
        L39:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L4d1;
                case 1: goto L4c5;
                case 2: goto L4b5;
                case 3: goto L4a5;
                case 4: goto L495;
                case 5: goto L489;
                case 6: goto L47d;
                case 7: goto L471;
                case 8: goto L453;
                case 9: goto L43f;
                case 10: goto L42e;
                case 11: goto L41f;
                case 12: goto L410;
                case 13: goto L405;
                case 14: goto L3fa;
                case 15: goto L3eb;
                case 16: goto L3dc;
                case 17: goto L3c7;
                case 18: goto L3bc;
                case 19: goto L3b3;
                case 20: goto L3aa;
                case 21: goto L3a1;
                case 22: goto L398;
                case 23: goto L38f;
                case 24: goto L386;
                case 25: goto L37d;
                case 26: goto L374;
                case 27: goto L367;
                case 28: goto L35e;
                case 29: goto L355;
                case 30: goto L34b;
                case 31: goto L341;
                case 32: goto L337;
                case 33: goto L32d;
                case 34: goto L323;
                case 35: goto L303;
                case 36: goto L2e6;
                case 37: goto L2c9;
                case 38: goto L2ac;
                case 39: goto L28e;
                case 40: goto L270;
                case 41: goto L252;
                case 42: goto L234;
                case 43: goto L216;
                case 44: goto L1f8;
                case 45: goto L1da;
                case 46: goto L1bc;
                case 47: goto L19e;
                case 48: goto L180;
                case 49: goto L172;
                case 50: goto L162;
                case 51: goto L154;
                case 52: goto L148;
                case 53: goto L138;
                case 54: goto L128;
                case 55: goto L118;
                case 56: goto L10c;
                case 57: goto L100;
                case 58: goto Lf4;
                case 59: goto Ld6;
                case 60: goto Lc2;
                case 61: goto Lb0;
                case 62: goto La0;
                case 63: goto L90;
                case 64: goto L84;
                case 65: goto L78;
                case 66: goto L68;
                case 67: goto L58;
                case 68: goto L42;
                default: goto L40;
            }
        L40:
            goto L4df
        L42:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.MessageLite r6 = (androidx.datastore.preferences.protobuf.MessageLite) r6
            androidx.datastore.preferences.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(r8, r6, r7)
            goto L3c4
        L58:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            long r6 = oneofLongAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64Size(r8, r6)
            goto L3c4
        L68:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = oneofIntAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32Size(r8, r6)
            goto L3c4
        L78:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64Size(r8, r13)
            goto L3c4
        L84:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32Size(r8, r3)
            goto L3c4
        L90:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = oneofIntAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSize(r8, r6)
            goto L3c4
        La0:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = oneofIntAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32Size(r8, r6)
            goto L3c4
        Lb0:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r8, r6)
            goto L3c4
        Lc2:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessage(r8, r6, r7)
            goto L3c4
        Ld6:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r7 == 0) goto Lec
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r8, r6)
            goto L3c4
        Lec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSize(r8, r6)
            goto L3c4
        Lf4:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(r8, r11)
            goto L3c4
        L100:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(r8, r3)
            goto L3c4
        L10c:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(r8, r13)
            goto L3c4
        L118:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = oneofIntAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32Size(r8, r6)
            goto L3c4
        L128:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            long r6 = oneofLongAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64Size(r8, r6)
            goto L3c4
        L138:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            long r6 = oneofLongAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64Size(r8, r6)
            goto L3c4
        L148:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSize(r8, r12)
            goto L3c4
        L154:
            boolean r6 = r15.isOneofPresent(r1, r8, r4)
            if (r6 == 0) goto L4df
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSize(r8, r6)
            goto L3c4
        L162:
            androidx.datastore.preferences.protobuf.MapFieldSchema r6 = r0.mapFieldSchema
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            java.lang.Object r9 = r15.getMapFieldDefaultEntry(r4)
            int r6 = r6.getSerializedSize(r8, r7, r9)
            goto L3c4
        L172:
            java.util.List r6 = listAt(r1, r9)
            androidx.datastore.preferences.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeGroupList(r8, r6, r7)
            goto L3c4
        L180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L194:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L19e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L1b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L1b2:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L1bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L1d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L1d0:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L1da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L1ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L1ee:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L1f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeEnumListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L20c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L20c:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L22a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L22a:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeBoolListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L248:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L266:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L284:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L28e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L2a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L2a2:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L2ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L2c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L2c0:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L2c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L2dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L2dd:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L2e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L2fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L2fa:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
            goto L31f
        L303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64ListNoTag(r7)
            if (r7 <= 0) goto L4df
            boolean r9 = r0.useCachedSizeField
            if (r9 == 0) goto L317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L317:
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeTagSize(r8)
            int r8 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(r7)
        L31f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L3c4
        L323:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt64List(r8, r6, r3)
            goto L3c4
        L32d:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeSInt32List(r8, r6, r3)
            goto L3c4
        L337:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(r8, r6, r3)
            goto L3c4
        L341:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(r8, r6, r3)
            goto L3c4
        L34b:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeEnumList(r8, r6, r3)
            goto L3c4
        L355:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt32List(r8, r6, r3)
            goto L3c4
        L35e:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeByteStringList(r8, r6)
            goto L3c4
        L367:
            java.util.List r6 = listAt(r1, r9)
            androidx.datastore.preferences.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessageList(r8, r6, r7)
            goto L3c4
        L374:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeStringList(r8, r6)
            goto L3c4
        L37d:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeBoolList(r8, r6, r3)
            goto L3c4
        L386:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(r8, r6, r3)
            goto L3c4
        L38f:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(r8, r6, r3)
            goto L3c4
        L398:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt32List(r8, r6, r3)
            goto L3c4
        L3a1:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeUInt64List(r8, r6, r3)
            goto L3c4
        L3aa:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeInt64List(r8, r6, r3)
            goto L3c4
        L3b3:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed32List(r8, r6, r3)
            goto L3c4
        L3bc:
            java.util.List r6 = listAt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeFixed64List(r8, r6, r3)
        L3c4:
            int r5 = r5 + r6
            goto L4df
        L3c7:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.MessageLite r6 = (androidx.datastore.preferences.protobuf.MessageLite) r6
            androidx.datastore.preferences.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeGroupSize(r8, r6, r7)
            goto L3c4
        L3dc:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            long r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt64Size(r8, r6)
            goto L3c4
        L3eb:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSInt32Size(r8, r6)
            goto L3c4
        L3fa:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed64Size(r8, r13)
            goto L3c4
        L405:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeSFixed32Size(r8, r3)
            goto L3c4
        L410:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeEnumSize(r8, r6)
            goto L3c4
        L41f:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt32Size(r8, r6)
            goto L3c4
        L42e:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r8, r6)
            goto L3c4
        L43f:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            androidx.datastore.preferences.protobuf.Schema r7 = r15.getMessageFieldSchema(r4)
            int r6 = androidx.datastore.preferences.protobuf.SchemaUtil.computeSizeMessage(r8, r6, r7)
            goto L3c4
        L453:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r1, r9)
            boolean r7 = r6 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r7 == 0) goto L469
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBytesSize(r8, r6)
            goto L3c4
        L469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeStringSize(r8, r6)
            goto L3c4
        L471:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeBoolSize(r8, r11)
            goto L3c4
        L47d:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed32Size(r8, r3)
            goto L3c4
        L489:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFixed64Size(r8, r13)
            goto L3c4
        L495:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt32Size(r8, r6)
            goto L3c4
        L4a5:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            long r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeUInt64Size(r8, r6)
            goto L3c4
        L4b5:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            long r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r1, r9)
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeInt64Size(r8, r6)
            goto L3c4
        L4c5:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeFloatSize(r8, r12)
            goto L3c4
        L4d1:
            boolean r6 = r15.isFieldPresent(r1, r4)
            if (r6 == 0) goto L4df
            r6 = 0
            int r6 = androidx.datastore.preferences.protobuf.CodedOutputStream.computeDoubleSize(r8, r6)
            goto L3c4
        L4df:
            int r4 = r4 + 3
            goto L8
        L4e3:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r2 = r0.unknownFieldSchema
            int r1 = r15.getUnknownFieldsSerializedSize(r2, r1)
            int r5 = r5 + r1
            return r5
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r1, T r2) {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            int r1 = r1.getSerializedSize(r2)
            return r1
    }

    private static <T> int intAt(T r0, long r1) {
            int r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r0, r1)
            return r0
    }

    private static boolean isEnforceUtf8(int r1) {
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    private boolean isFieldPresent(T r8, int r9) {
            r7 = this;
            boolean r0 = r7.proto3
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld9
            int r9 = r7.typeAndOffsetAt(r9)
            long r3 = offset(r9)
            int r9 = type(r9)
            r5 = 0
            switch(r9) {
                case 0: goto Lcd;
                case 1: goto Lc2;
                case 2: goto Lb8;
                case 3: goto Lae;
                case 4: goto La6;
                case 5: goto L9c;
                case 6: goto L94;
                case 7: goto L8f;
                case 8: goto L6d;
                case 9: goto L65;
                case 10: goto L59;
                case 11: goto L51;
                case 12: goto L49;
                case 13: goto L41;
                case 14: goto L37;
                case 15: goto L2f;
                case 16: goto L25;
                case 17: goto L1d;
                default: goto L17;
            }
        L17:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L1d:
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r3)
            if (r8 == 0) goto L24
            r1 = 1
        L24:
            return r1
        L25:
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L2e
            r1 = 1
        L2e:
            return r1
        L2f:
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r3)
            if (r8 == 0) goto L36
            r1 = 1
        L36:
            return r1
        L37:
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L40
            r1 = 1
        L40:
            return r1
        L41:
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r3)
            if (r8 == 0) goto L48
            r1 = 1
        L48:
            return r1
        L49:
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r3)
            if (r8 == 0) goto L50
            r1 = 1
        L50:
            return r1
        L51:
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r3)
            if (r8 == 0) goto L58
            r1 = 1
        L58:
            return r1
        L59:
            androidx.datastore.preferences.protobuf.ByteString r9 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r3)
            boolean r8 = r9.equals(r8)
            r8 = r8 ^ r2
            return r8
        L65:
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r3)
            if (r8 == 0) goto L6c
            r1 = 1
        L6c:
            return r1
        L6d:
            java.lang.Object r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r8, r3)
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L7d
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r2
            return r8
        L7d:
            boolean r9 = r8 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r9 == 0) goto L89
            androidx.datastore.preferences.protobuf.ByteString r9 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            boolean r8 = r9.equals(r8)
            r8 = r8 ^ r2
            return r8
        L89:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L8f:
            boolean r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(r8, r3)
            return r8
        L94:
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r3)
            if (r8 == 0) goto L9b
            r1 = 1
        L9b:
            return r1
        L9c:
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto La5
            r1 = 1
        La5:
            return r1
        La6:
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r3)
            if (r8 == 0) goto Lad
            r1 = 1
        Lad:
            return r1
        Lae:
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto Lb7
            r1 = 1
        Lb7:
            return r1
        Lb8:
            long r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r8, r3)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto Lc1
            r1 = 1
        Lc1:
            return r1
        Lc2:
            float r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(r8, r3)
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto Lcc
            r1 = 1
        Lcc:
            return r1
        Lcd:
            double r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(r8, r3)
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 == 0) goto Ld8
            r1 = 1
        Ld8:
            return r1
        Ld9:
            int r9 = r7.presenceMaskAndOffsetAt(r9)
            int r0 = r9 >>> 20
            int r0 = r2 << r0
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r3
            long r3 = (long) r9
            int r8 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r8, r3)
            r8 = r8 & r0
            if (r8 == 0) goto Lee
            r1 = 1
        Lee:
            return r1
    }

    private boolean isFieldPresent(T r2, int r3, int r4, int r5) {
            r1 = this;
            boolean r0 = r1.proto3
            if (r0 == 0) goto L9
            boolean r2 = r1.isFieldPresent(r2, r3)
            return r2
        L9:
            r2 = r4 & r5
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    private static boolean isInitialized(java.lang.Object r2, int r3, androidx.datastore.preferences.protobuf.Schema r4) {
            long r0 = offset(r3)
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r2, r0)
            boolean r2 = r4.isInitialized(r2)
            return r2
    }

    private <N> boolean isListInitialized(java.lang.Object r4, int r5, int r6) {
            r3 = this;
            long r0 = offset(r5)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r4, r0)
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            r0 = 1
            if (r5 == 0) goto L12
            return r0
        L12:
            androidx.datastore.preferences.protobuf.Schema r5 = r3.getMessageFieldSchema(r6)
            r6 = 0
            r1 = 0
        L18:
            int r2 = r4.size()
            if (r1 >= r2) goto L2c
            java.lang.Object r2 = r4.get(r1)
            boolean r2 = r5.isInitialized(r2)
            if (r2 != 0) goto L29
            return r6
        L29:
            int r1 = r1 + 1
            goto L18
        L2c:
            return r0
    }

    private boolean isMapInitialized(T r4, int r5, int r6) {
            r3 = this;
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = r3.mapFieldSchema
            long r1 = offset(r5)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r4, r1)
            java.util.Map r4 = r0.forMapData(r4)
            boolean r5 = r4.isEmpty()
            r0 = 1
            if (r5 == 0) goto L16
            return r0
        L16:
            java.lang.Object r5 = r3.getMapFieldDefaultEntry(r6)
            androidx.datastore.preferences.protobuf.MapFieldSchema r6 = r3.mapFieldSchema
            androidx.datastore.preferences.protobuf.MapEntryLite$Metadata r5 = r6.forMapMetadata(r5)
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r5 = r5.valueType
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r5 = r5.getJavaType()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r6 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE
            if (r5 == r6) goto L2b
            return r0
        L2b:
            r5 = 0
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L54
            java.lang.Object r6 = r4.next()
            if (r5 != 0) goto L4c
            androidx.datastore.preferences.protobuf.Protobuf r5 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
            java.lang.Class r1 = r6.getClass()
            androidx.datastore.preferences.protobuf.Schema r5 = r5.schemaFor(r1)
        L4c:
            boolean r6 = r5.isInitialized(r6)
            if (r6 != 0) goto L34
            r4 = 0
            return r4
        L54:
            return r0
    }

    private boolean isOneofCaseEqual(T r3, T r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r3, r0)
            int r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r4, r0)
            if (r3 != r4) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }

    private boolean isOneofPresent(T r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r3, r0)
            if (r3 != r4) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            return r3
    }

    private static boolean isRequired(int r1) {
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    private static java.util.List<?> listAt(java.lang.Object r0, long r1) {
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r0, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static <T> long longAt(T r0, long r1) {
            long r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r0, r1)
            return r0
    }

    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r17, androidx.datastore.preferences.protobuf.ExtensionSchema<ET> r18, T r19, androidx.datastore.preferences.protobuf.Reader r20, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r21) throws java.io.IOException {
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        Ld:
            int r1 = r20.getFieldNumber()     // Catch: java.lang.Throwable -> L612
            int r3 = r8.positionForFieldNumber(r1)     // Catch: java.lang.Throwable -> L612
            if (r3 >= 0) goto L8e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L33
            int r0 = r8.checkInitializedCount
        L1e:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L2d
            int[] r1 = r8.intArray
            r1 = r1[r0]
            java.lang.Object r13 = r8.filterMapUnknownEnumValues(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L1e
        L2d:
            if (r13 == 0) goto L32
            r9.setBuilderToMessage(r10, r13)
        L32:
            return
        L33:
            boolean r2 = r8.hasExtensions     // Catch: java.lang.Throwable -> L612
            if (r2 != 0) goto L3b
            r15 = r18
            r3 = r12
            goto L44
        L3b:
            androidx.datastore.preferences.protobuf.MessageLite r2 = r8.defaultInstance     // Catch: java.lang.Throwable -> L612
            r15 = r18
            java.lang.Object r1 = r15.findExtensionByNumber(r11, r2, r1)     // Catch: java.lang.Throwable -> L612
            r3 = r1
        L44:
            if (r3 == 0) goto L5c
            if (r14 != 0) goto L4d
            androidx.datastore.preferences.protobuf.FieldSet r1 = r18.getMutableExtensions(r19)     // Catch: java.lang.Throwable -> L612
            r14 = r1
        L4d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.parseExtension(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L612
            goto Ld
        L5c:
            boolean r1 = r9.shouldDiscardUnknownFields(r0)     // Catch: java.lang.Throwable -> L612
            if (r1 == 0) goto L69
            boolean r1 = r20.skipField()     // Catch: java.lang.Throwable -> L612
            if (r1 == 0) goto L77
            goto Ld
        L69:
            if (r13 != 0) goto L70
            java.lang.Object r1 = r9.getBuilderFromMessage(r10)     // Catch: java.lang.Throwable -> L612
            r13 = r1
        L70:
            boolean r1 = r9.mergeOneFieldFrom(r13, r0)     // Catch: java.lang.Throwable -> L612
            if (r1 == 0) goto L77
            goto Ld
        L77:
            int r0 = r8.checkInitializedCount
        L79:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L88
            int[] r1 = r8.intArray
            r1 = r1[r0]
            java.lang.Object r13 = r8.filterMapUnknownEnumValues(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L79
        L88:
            if (r13 == 0) goto L8d
            r9.setBuilderToMessage(r10, r13)
        L8d:
            return
        L8e:
            r15 = r18
            int r4 = r8.typeAndOffsetAt(r3)     // Catch: java.lang.Throwable -> L612
            int r2 = type(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            switch(r2) {
                case 0: goto L59d;
                case 1: goto L58d;
                case 2: goto L57d;
                case 3: goto L56d;
                case 4: goto L55d;
                case 5: goto L54d;
                case 6: goto L53d;
                case 7: goto L52d;
                case 8: goto L525;
                case 9: goto L4ee;
                case 10: goto L4de;
                case 11: goto L4ce;
                case 12: goto L4ab;
                case 13: goto L49b;
                case 14: goto L48b;
                case 15: goto L47b;
                case 16: goto L46b;
                case 17: goto L434;
                case 18: goto L425;
                case 19: goto L416;
                case 20: goto L407;
                case 21: goto L3f8;
                case 22: goto L3e9;
                case 23: goto L3da;
                case 24: goto L3cb;
                case 25: goto L3bc;
                case 26: goto L3b7;
                case 27: goto L3a5;
                case 28: goto L396;
                case 29: goto L387;
                case 30: goto L370;
                case 31: goto L361;
                case 32: goto L352;
                case 33: goto L343;
                case 34: goto L334;
                case 35: goto L325;
                case 36: goto L316;
                case 37: goto L307;
                case 38: goto L2f8;
                case 39: goto L2e9;
                case 40: goto L2da;
                case 41: goto L2cb;
                case 42: goto L2bc;
                case 43: goto L2ad;
                case 44: goto L296;
                case 45: goto L287;
                case 46: goto L278;
                case 47: goto L269;
                case 48: goto L25a;
                case 49: goto L244;
                case 50: goto L233;
                case 51: goto L21f;
                case 52: goto L20b;
                case 53: goto L1f7;
                case 54: goto L1e3;
                case 55: goto L1cf;
                case 56: goto L1bb;
                case 57: goto L1a7;
                case 58: goto L193;
                case 59: goto L18b;
                case 60: goto L152;
                case 61: goto L142;
                case 62: goto L12e;
                case 63: goto L107;
                case 64: goto Lf3;
                case 65: goto Ldf;
                case 66: goto Lcb;
                case 67: goto Lb7;
                case 68: goto La3;
                default: goto L9b;
            }     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
        L9b:
            if (r13 != 0) goto L5ae
            java.lang.Object r1 = r17.newBuilder()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto L5ad
        La3:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Schema r2 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r2 = r0.readGroupBySchemaWithCheck(r2, r11)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        Lb7:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r6 = r20.readSInt64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        Lcb:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r2 = r20.readSInt32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        Ldf:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r6 = r20.readSFixed64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        Lf3:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r2 = r20.readSFixed32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L107:
            int r2 = r20.readEnum()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r5 = r8.getEnumFieldVerifier(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            if (r5 == 0) goto L11e
            boolean r5 = r5.isInRange(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            if (r5 == 0) goto L118
            goto L11e
        L118:
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.SchemaUtil.storeUnknownEnum(r1, r2, r13, r9)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L11e:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L12e:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r2 = r20.readUInt32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L142:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.ByteString r2 = r20.readBytes()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L152:
            boolean r2 = r8.isOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            if (r2 == 0) goto L174
            long r5 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r10, r5)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Schema r5 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r5 = r0.readMessageBySchemaWithCheck(r5, r11)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.Internal.mergeMessage(r2, r5)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto L186
        L174:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Schema r2 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r2 = r0.readMessageBySchemaWithCheck(r2, r11)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
        L186:
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L18b:
            r8.readString(r10, r4, r0)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L193:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            boolean r2 = r20.readBool()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L1a7:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r2 = r20.readFixed32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L1bb:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r6 = r20.readFixed64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L1cf:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r2 = r20.readInt32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L1e3:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r6 = r20.readUInt64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L1f7:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r6 = r20.readInt64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L20b:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            float r2 = r20.readFloat()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L21f:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            double r6 = r20.readDouble()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setOneofPresent(r10, r1, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L233:
            java.lang.Object r4 = r8.getMapFieldDefaultEntry(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mergeMap(r2, r3, r4, r5, r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L244:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Schema r6 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.readGroupList(r2, r3, r5, r6, r7)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L25a:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readSInt64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L269:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readSInt32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L278:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readSFixed64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L287:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readSFixed32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L296:
            androidx.datastore.preferences.protobuf.ListFieldSchema r2 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r2 = r2.mutableListAt(r10, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readEnumList(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r3 = r8.getEnumFieldVerifier(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.SchemaUtil.filterUnknownEnumList(r1, r2, r3, r13, r9)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L2ad:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readUInt32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L2bc:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readBoolList(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L2cb:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readFixed32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L2da:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readFixed64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L2e9:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readInt32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L2f8:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readUInt64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L307:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readInt64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L316:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readFloatList(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L325:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readDoubleList(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L334:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readSInt64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L343:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readSInt32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L352:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readSFixed64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L361:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readSFixed32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L370:
            androidx.datastore.preferences.protobuf.ListFieldSchema r2 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r2 = r2.mutableListAt(r10, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readEnumList(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r3 = r8.getEnumFieldVerifier(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.SchemaUtil.filterUnknownEnumList(r1, r2, r3, r13, r9)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L387:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readUInt32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L396:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readBytesList(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L3a5:
            androidx.datastore.preferences.protobuf.Schema r5 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.readMessageList(r2, r3, r4, r5, r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L3b7:
            r8.readStringList(r10, r4, r0)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L3bc:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readBoolList(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L3cb:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readFixed32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L3da:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readFixed64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L3e9:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readInt32List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L3f8:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readUInt64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L407:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readInt64List(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L416:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readFloatList(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L425:
            androidx.datastore.preferences.protobuf.ListFieldSchema r1 = r8.listFieldSchema     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.util.List r1 = r1.mutableListAt(r10, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r0.readDoubleList(r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L434:
            boolean r1 = r8.isFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            if (r1 == 0) goto L457
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r10, r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Schema r2 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r2 = r0.readGroupBySchemaWithCheck(r2, r11)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.Internal.mergeMessage(r1, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r2, r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L457:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Schema r4 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r4 = r0.readGroupBySchemaWithCheck(r4, r11)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L46b:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r4 = r20.readSInt64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L47b:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r4 = r20.readSInt32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L48b:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r4 = r20.readSFixed64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L49b:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r4 = r20.readSFixed32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L4ab:
            int r2 = r20.readEnum()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Internal$EnumVerifier r5 = r8.getEnumFieldVerifier(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            if (r5 == 0) goto L4c2
            boolean r5 = r5.isInRange(r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            if (r5 == 0) goto L4bc
            goto L4c2
        L4bc:
            java.lang.Object r13 = androidx.datastore.preferences.protobuf.SchemaUtil.storeUnknownEnum(r1, r2, r13, r9)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L4c2:
            long r4 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r10, r4, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L4ce:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r4 = r20.readUInt32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L4de:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.ByteString r4 = r20.readBytes()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L4ee:
            boolean r1 = r8.isFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            if (r1 == 0) goto L511
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r10, r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Schema r2 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r2 = r0.readMessageBySchemaWithCheck(r2, r11)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.Internal.mergeMessage(r1, r2)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r2 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r2, r1)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L511:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.Schema r4 = r8.getMessageFieldSchema(r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            java.lang.Object r4 = r0.readMessageBySchemaWithCheck(r4, r11)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L525:
            r8.readString(r10, r4, r0)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L52d:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            boolean r4 = r20.readBool()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putBoolean(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L53d:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r4 = r20.readFixed32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L54d:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r4 = r20.readFixed64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L55d:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            int r4 = r20.readInt32()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L56d:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r4 = r20.readUInt64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L57d:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            long r4 = r20.readInt64()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L58d:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            float r4 = r20.readFloat()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putFloat(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L59d:
            long r1 = offset(r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            double r4 = r20.readDouble()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            androidx.datastore.preferences.protobuf.UnsafeUtil.putDouble(r10, r1, r4)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            r8.setFieldPresent(r10, r3)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            goto Ld
        L5ad:
            r13 = r1
        L5ae:
            boolean r1 = r9.mergeOneFieldFrom(r13, r0)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L5cb java.lang.Throwable -> L612
            if (r1 != 0) goto Ld
            int r0 = r8.checkInitializedCount
        L5b6:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L5c5
            int[] r1 = r8.intArray
            r1 = r1[r0]
            java.lang.Object r13 = r8.filterMapUnknownEnumValues(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L5b6
        L5c5:
            if (r13 == 0) goto L5ca
            r9.setBuilderToMessage(r10, r13)
        L5ca:
            return
        L5cb:
            boolean r1 = r9.shouldDiscardUnknownFields(r0)     // Catch: java.lang.Throwable -> L612
            if (r1 == 0) goto L5ee
            boolean r1 = r20.skipField()     // Catch: java.lang.Throwable -> L612
            if (r1 != 0) goto Ld
            int r0 = r8.checkInitializedCount
        L5d9:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L5e8
            int[] r1 = r8.intArray
            r1 = r1[r0]
            java.lang.Object r13 = r8.filterMapUnknownEnumValues(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L5d9
        L5e8:
            if (r13 == 0) goto L5ed
            r9.setBuilderToMessage(r10, r13)
        L5ed:
            return
        L5ee:
            if (r13 != 0) goto L5f5
            java.lang.Object r1 = r9.getBuilderFromMessage(r10)     // Catch: java.lang.Throwable -> L612
            r13 = r1
        L5f5:
            boolean r1 = r9.mergeOneFieldFrom(r13, r0)     // Catch: java.lang.Throwable -> L612
            if (r1 != 0) goto Ld
            int r0 = r8.checkInitializedCount
        L5fd:
            int r1 = r8.repeatedFieldOffsetStart
            if (r0 >= r1) goto L60c
            int[] r1 = r8.intArray
            r1 = r1[r0]
            java.lang.Object r13 = r8.filterMapUnknownEnumValues(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L5fd
        L60c:
            if (r13 == 0) goto L611
            r9.setBuilderToMessage(r10, r13)
        L611:
            return
        L612:
            r0 = move-exception
            int r1 = r8.checkInitializedCount
        L615:
            int r2 = r8.repeatedFieldOffsetStart
            if (r1 >= r2) goto L624
            int[] r2 = r8.intArray
            r2 = r2[r1]
            java.lang.Object r13 = r8.filterMapUnknownEnumValues(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L615
        L624:
            if (r13 == 0) goto L629
            r9.setBuilderToMessage(r10, r13)
        L629:
            throw r0
    }

    private final <K, V> void mergeMap(java.lang.Object r5, int r6, java.lang.Object r7, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r8, androidx.datastore.preferences.protobuf.Reader r9) throws java.io.IOException {
            r4 = this;
            int r6 = r4.typeAndOffsetAt(r6)
            long r0 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r5, r0)
            if (r6 != 0) goto L18
            androidx.datastore.preferences.protobuf.MapFieldSchema r6 = r4.mapFieldSchema
            java.lang.Object r6 = r6.newMapField(r7)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r5, r0, r6)
            goto L2f
        L18:
            androidx.datastore.preferences.protobuf.MapFieldSchema r2 = r4.mapFieldSchema
            boolean r2 = r2.isImmutable(r6)
            if (r2 == 0) goto L2f
            androidx.datastore.preferences.protobuf.MapFieldSchema r2 = r4.mapFieldSchema
            java.lang.Object r2 = r2.newMapField(r7)
            androidx.datastore.preferences.protobuf.MapFieldSchema r3 = r4.mapFieldSchema
            r3.mergeFrom(r2, r6)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r5, r0, r2)
            r6 = r2
        L2f:
            androidx.datastore.preferences.protobuf.MapFieldSchema r5 = r4.mapFieldSchema
            java.util.Map r5 = r5.forMutableMapData(r6)
            androidx.datastore.preferences.protobuf.MapFieldSchema r6 = r4.mapFieldSchema
            androidx.datastore.preferences.protobuf.MapEntryLite$Metadata r6 = r6.forMapMetadata(r7)
            r9.readMap(r5, r6, r8)
            return
    }

    private void mergeMessage(T r4, T r5, int r6) {
            r3 = this;
            int r0 = r3.typeAndOffsetAt(r6)
            long r0 = offset(r0)
            boolean r2 = r3.isFieldPresent(r5, r6)
            if (r2 != 0) goto Lf
            return
        Lf:
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r4, r0)
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r5, r0)
            if (r2 == 0) goto L26
            if (r5 == 0) goto L26
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.Internal.mergeMessage(r2, r5)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r4, r0, r5)
            r3.setFieldPresent(r4, r6)
            goto L2e
        L26:
            if (r5 == 0) goto L2e
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r4, r0, r5)
            r3.setFieldPresent(r4, r6)
        L2e:
            return
    }

    private void mergeOneofMessage(T r5, T r6, int r7) {
            r4 = this;
            int r0 = r4.typeAndOffsetAt(r7)
            int r1 = r4.numberAt(r7)
            long r2 = offset(r0)
            boolean r0 = r4.isOneofPresent(r6, r1, r7)
            if (r0 != 0) goto L13
            return
        L13:
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r5, r2)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r6, r2)
            if (r0 == 0) goto L2a
            if (r6 == 0) goto L2a
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.Internal.mergeMessage(r0, r6)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r5, r2, r6)
            r4.setOneofPresent(r5, r1, r7)
            goto L32
        L2a:
            if (r6 == 0) goto L32
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r5, r2, r6)
            r4.setOneofPresent(r5, r1, r7)
        L32:
            return
    }

    private void mergeSingleField(T r6, T r7, int r8) {
            r5 = this;
            int r0 = r5.typeAndOffsetAt(r8)
            long r1 = offset(r0)
            int r3 = r5.numberAt(r8)
            int r0 = type(r0)
            switch(r0) {
                case 0: goto L163;
                case 1: goto L152;
                case 2: goto L141;
                case 3: goto L130;
                case 4: goto L11f;
                case 5: goto L10e;
                case 6: goto Lfd;
                case 7: goto Leb;
                case 8: goto Ld9;
                case 9: goto Ld4;
                case 10: goto Lc2;
                case 11: goto Lb0;
                case 12: goto L9e;
                case 13: goto L8c;
                case 14: goto L7a;
                case 15: goto L68;
                case 16: goto L56;
                case 17: goto L51;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                case 32: goto L4a;
                case 33: goto L4a;
                case 34: goto L4a;
                case 35: goto L4a;
                case 36: goto L4a;
                case 37: goto L4a;
                case 38: goto L4a;
                case 39: goto L4a;
                case 40: goto L4a;
                case 41: goto L4a;
                case 42: goto L4a;
                case 43: goto L4a;
                case 44: goto L4a;
                case 45: goto L4a;
                case 46: goto L4a;
                case 47: goto L4a;
                case 48: goto L4a;
                case 49: goto L4a;
                case 50: goto L43;
                case 51: goto L31;
                case 52: goto L31;
                case 53: goto L31;
                case 54: goto L31;
                case 55: goto L31;
                case 56: goto L31;
                case 57: goto L31;
                case 58: goto L31;
                case 59: goto L31;
                case 60: goto L2c;
                case 61: goto L1a;
                case 62: goto L1a;
                case 63: goto L1a;
                case 64: goto L1a;
                case 65: goto L1a;
                case 66: goto L1a;
                case 67: goto L1a;
                case 68: goto L15;
                default: goto L13;
            }
        L13:
            goto L173
        L15:
            r5.mergeOneofMessage(r6, r7, r8)
            goto L173
        L1a:
            boolean r0 = r5.isOneofPresent(r7, r3, r8)
            if (r0 == 0) goto L173
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setOneofPresent(r6, r3, r8)
            goto L173
        L2c:
            r5.mergeOneofMessage(r6, r7, r8)
            goto L173
        L31:
            boolean r0 = r5.isOneofPresent(r7, r3, r8)
            if (r0 == 0) goto L173
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setOneofPresent(r6, r3, r8)
            goto L173
        L43:
            androidx.datastore.preferences.protobuf.MapFieldSchema r8 = r5.mapFieldSchema
            androidx.datastore.preferences.protobuf.SchemaUtil.mergeMap(r8, r6, r7, r1)
            goto L173
        L4a:
            androidx.datastore.preferences.protobuf.ListFieldSchema r8 = r5.listFieldSchema
            r8.mergeListsAt(r6, r7, r1)
            goto L173
        L51:
            r5.mergeMessage(r6, r7, r8)
            goto L173
        L56:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L68:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L7a:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L8c:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L9e:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Lb0:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Lc2:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Ld4:
            r5.mergeMessage(r6, r7, r8)
            goto L173
        Ld9:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            java.lang.Object r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Leb:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            boolean r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putBoolean(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        Lfd:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L10e:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L11f:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            int r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L130:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L141:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putLong(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
            goto L173
        L152:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            float r7 = androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putFloat(r6, r1, r7)
            r5.setFieldPresent(r6, r8)
            goto L173
        L163:
            boolean r0 = r5.isFieldPresent(r7, r8)
            if (r0 == 0) goto L173
            double r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(r7, r1)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putDouble(r6, r1, r3)
            r5.setFieldPresent(r6, r8)
        L173:
            return
    }

    static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchema(java.lang.Class<T> r6, androidx.datastore.preferences.protobuf.MessageInfo r7, androidx.datastore.preferences.protobuf.NewInstanceSchema r8, androidx.datastore.preferences.protobuf.ListFieldSchema r9, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r10, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r11, androidx.datastore.preferences.protobuf.MapFieldSchema r12) {
            boolean r6 = r7 instanceof androidx.datastore.preferences.protobuf.RawMessageInfo
            if (r6 == 0) goto L11
            r0 = r7
            androidx.datastore.preferences.protobuf.RawMessageInfo r0 = (androidx.datastore.preferences.protobuf.RawMessageInfo) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            androidx.datastore.preferences.protobuf.MessageSchema r6 = newSchemaForRawMessageInfo(r0, r1, r2, r3, r4, r5)
            return r6
        L11:
            r0 = r7
            androidx.datastore.preferences.protobuf.StructuralMessageInfo r0 = (androidx.datastore.preferences.protobuf.StructuralMessageInfo) r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            androidx.datastore.preferences.protobuf.MessageSchema r6 = newSchemaForMessageInfo(r0, r1, r2, r3, r4, r5)
            return r6
    }

    static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForMessageInfo(androidx.datastore.preferences.protobuf.StructuralMessageInfo r19, androidx.datastore.preferences.protobuf.NewInstanceSchema r20, androidx.datastore.preferences.protobuf.ListFieldSchema r21, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r22, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r23, androidx.datastore.preferences.protobuf.MapFieldSchema r24) {
            androidx.datastore.preferences.protobuf.ProtoSyntax r0 = r19.getSyntax()
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto Lc
            r0 = 1
            r9 = 1
            goto Ld
        Lc:
            r9 = 0
        Ld:
            androidx.datastore.preferences.protobuf.FieldInfo[] r0 = r19.getFields()
            int r1 = r0.length
            r3 = 0
            if (r1 != 0) goto L6a
            r6 = 0
            r7 = 0
            int r1 = r0.length
            int r4 = r1 * 3
            int[] r4 = new int[r4]
            int r1 = r1 * 2
            java.lang.Object[] r5 = new java.lang.Object[r1]
            int r1 = r0.length
            if (r1 > 0) goto L67
            int[] r1 = r19.getCheckInitialized()
            if (r1 != 0) goto L2b
            int[] r1 = androidx.datastore.preferences.protobuf.MessageSchema.EMPTY_INT_ARRAY
        L2b:
            int r8 = r0.length
            if (r8 > 0) goto L64
            int[] r0 = androidx.datastore.preferences.protobuf.MessageSchema.EMPTY_INT_ARRAY
            int[] r3 = androidx.datastore.preferences.protobuf.MessageSchema.EMPTY_INT_ARRAY
            int r8 = r1.length
            int r10 = r0.length
            int r8 = r8 + r10
            int r10 = r3.length
            int r8 = r8 + r10
            int[] r11 = new int[r8]
            int r8 = r1.length
            java.lang.System.arraycopy(r1, r2, r11, r2, r8)
            int r8 = r1.length
            int r10 = r0.length
            java.lang.System.arraycopy(r0, r2, r11, r8, r10)
            int r8 = r1.length
            int r10 = r0.length
            int r8 = r8 + r10
            int r10 = r3.length
            java.lang.System.arraycopy(r3, r2, r11, r8, r10)
            androidx.datastore.preferences.protobuf.MessageSchema r2 = new androidx.datastore.preferences.protobuf.MessageSchema
            androidx.datastore.preferences.protobuf.MessageLite r8 = r19.getDefaultInstance()
            r10 = 1
            int r12 = r1.length
            int r1 = r1.length
            int r0 = r0.length
            int r13 = r1 + r0
            r3 = r2
            r14 = r20
            r15 = r21
            r16 = r22
            r17 = r23
            r18 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r2
        L64:
            r0 = r0[r2]
            throw r3
        L67:
            r0 = r0[r2]
            throw r3
        L6a:
            r0 = r0[r2]
            throw r3
    }

    static <T> androidx.datastore.preferences.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(androidx.datastore.preferences.protobuf.RawMessageInfo r36, androidx.datastore.preferences.protobuf.NewInstanceSchema r37, androidx.datastore.preferences.protobuf.ListFieldSchema r38, androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r39, androidx.datastore.preferences.protobuf.ExtensionSchema<?> r40, androidx.datastore.preferences.protobuf.MapFieldSchema r41) {
            androidx.datastore.preferences.protobuf.ProtoSyntax r0 = r36.getSyntax()
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto Lb
            r10 = 1
            goto Lc
        Lb:
            r10 = 0
        Lc:
            java.lang.String r0 = r36.getStringInfo()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L35
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L22:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L32
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L22
        L32:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L36
        L35:
            r9 = 1
        L36:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L55
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L42:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L52
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L42
        L52:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L55:
            if (r8 != 0) goto L62
            int[] r8 = androidx.datastore.preferences.protobuf.MessageSchema.EMPTY_INT_ARRAY
            r13 = r8
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L177
        L62:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L81
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L6e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L7e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L6e
        L7e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L81:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto La0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L8d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L9d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L8d
        L9d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        La0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto Lbf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Lac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto Lbc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Lac
        Lbc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        Lbf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto Lde
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Lcb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto Ldb
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Lcb
        Ldb:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        Lde:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto Lfd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Lea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto Lfa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Lea
        Lfa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        Lfd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L11e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L11a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L109
        L11a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L11e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L12a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L13c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L12a
        L13c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L14f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L14f
        L161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L177:
            sun.misc.Unsafe r5 = androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE
            java.lang.Object[] r18 = r36.getObjects()
            androidx.datastore.preferences.protobuf.MessageLite r19 = r36.getDefaultInstance()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L196:
            if (r7 >= r1) goto L3e6
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L1ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L1ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L1c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L1ab
        L1c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L1ce
        L1ca:
            r28 = r15
            r1 = r25
        L1ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L1e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L1fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L1e1
        L1fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L204
        L200:
            r29 = r10
            r15 = r25
        L204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L2b1
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L23b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L226
        L23b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L240:
            int r9 = r10 + (-51)
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L262
            r11 = 17
            if (r9 != r11) goto L24d
            goto L262
        L24d:
            r11 = 12
            if (r9 != r11) goto L26f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L26f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L26e
        L262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L26e:
            r14 = r11
        L26f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L27a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L282
        L27a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = reflectField(r3, r9)
            r18[r15] = r9
        L282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r7 = (int) r6
            int r15 = r15 + 1
            r6 = r18[r15]
            boolean r9 = r6 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L295
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L29d
        L295:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = reflectField(r3, r6)
            r18[r15] = r6
        L29d:
            r9 = r7
            long r6 = r5.objectFieldOffset(r6)
            int r7 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r4 = r7
            r7 = r9
            r9 = r10
            r6 = r14
            r14 = r33
            r15 = 0
            goto L3a9
        L2b1:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = reflectField(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L326
            r14 = 17
            if (r10 != r14) goto L2c9
            goto L326
        L2c9:
            r14 = 27
            if (r10 == r14) goto L316
            if (r10 != r9) goto L2d0
            goto L316
        L2d0:
            r14 = 12
            if (r10 == r14) goto L305
            r14 = 30
            if (r10 == r14) goto L305
            r14 = 44
            if (r10 != r14) goto L2dd
            goto L305
        L2dd:
            r14 = 50
            if (r10 != r14) goto L303
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L2fe
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L332
        L2fe:
            r23 = r14
            r6 = r27
            goto L332
        L303:
            r9 = 1
            goto L332
        L305:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L332
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L322
        L316:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L322:
            r14 = r10
            r6 = r20
            goto L333
        L326:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L332:
            r14 = r10
        L333:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L392
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L38c
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L368
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L351:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L363
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L351
        L363:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L368:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L379
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L381
        L379:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = reflectField(r3, r10)
            r18[r19] = r10
        L381:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r4 = (int) r3
            int r15 = r15 % 32
            goto L39b
        L38c:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L398
        L392:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L398:
            r14 = r15
            r4 = 0
            r15 = 0
        L39b:
            r3 = 18
            if (r9 < r3) goto L3a9
            r3 = 49
            if (r9 > r3) goto L3a9
            int r3 = r24 + 1
            r13[r24] = r7
            r24 = r3
        L3a9:
            int r3 = r22 + 1
            r11[r22] = r34
            int r10 = r3 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L3b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L3b9
        L3b8:
            r0 = 0
        L3b9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3c0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L3c1
        L3c0:
            r1 = 0
        L3c1:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r7
            r11[r3] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r4
            r11[r10] = r1
            r7 = r14
            r3 = r19
            r4 = r22
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r14 = r6
            r6 = r11
            r11 = r25
            r0 = r32
            goto L196
        L3e6:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            androidx.datastore.preferences.protobuf.MessageSchema r0 = new androidx.datastore.preferences.protobuf.MessageSchema
            androidx.datastore.preferences.protobuf.MessageLite r9 = r36.getDefaultInstance()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
    }

    private int numberAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            r2 = r0[r2]
            return r2
    }

    private static long offset(int r2) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r0
            long r0 = (long) r2
            return r0
    }

    private static <T> boolean oneofBooleanAt(T r0, long r1) {
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static <T> double oneofDoubleAt(T r0, long r1) {
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    private static <T> float oneofFloatAt(T r0, long r1) {
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    private static <T> int oneofIntAt(T r0, long r1) {
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private static <T> long oneofLongAt(T r0, long r1) {
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private int positionForFieldNumber(int r2) {
            r1 = this;
            int r0 = r1.minFieldNumber
            if (r2 < r0) goto Le
            int r0 = r1.maxFieldNumber
            if (r2 > r0) goto Le
            r0 = 0
            int r2 = r1.slowPositionForFieldNumber(r2, r0)
            return r2
        Le:
            r2 = -1
            return r2
    }

    private int presenceMaskAndOffsetAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            int r2 = r2 + 2
            r2 = r0[r2]
            return r2
    }

    private <E> void readGroupList(java.lang.Object r2, long r3, androidx.datastore.preferences.protobuf.Reader r5, androidx.datastore.preferences.protobuf.Schema<E> r6, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            r1 = this;
            androidx.datastore.preferences.protobuf.ListFieldSchema r0 = r1.listFieldSchema
            java.util.List r2 = r0.mutableListAt(r2, r3)
            r5.readGroupList(r2, r6, r7)
            return
    }

    private <E> void readMessageList(java.lang.Object r3, int r4, androidx.datastore.preferences.protobuf.Reader r5, androidx.datastore.preferences.protobuf.Schema<E> r6, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r7) throws java.io.IOException {
            r2 = this;
            long r0 = offset(r4)
            androidx.datastore.preferences.protobuf.ListFieldSchema r4 = r2.listFieldSchema
            java.util.List r3 = r4.mutableListAt(r3, r0)
            r5.readMessageList(r3, r6, r7)
            return
    }

    private void readString(java.lang.Object r3, int r4, androidx.datastore.preferences.protobuf.Reader r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = isEnforceUtf8(r4)
            if (r0 == 0) goto L12
            long r0 = offset(r4)
            java.lang.String r4 = r5.readStringRequireUtf8()
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r3, r0, r4)
            goto L2d
        L12:
            boolean r0 = r2.lite
            if (r0 == 0) goto L22
            long r0 = offset(r4)
            java.lang.String r4 = r5.readString()
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r3, r0, r4)
            goto L2d
        L22:
            long r0 = offset(r4)
            androidx.datastore.preferences.protobuf.ByteString r4 = r5.readBytes()
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r3, r0, r4)
        L2d:
            return
    }

    private void readStringList(java.lang.Object r4, int r5, androidx.datastore.preferences.protobuf.Reader r6) throws java.io.IOException {
            r3 = this;
            boolean r0 = isEnforceUtf8(r5)
            if (r0 == 0) goto L14
            androidx.datastore.preferences.protobuf.ListFieldSchema r0 = r3.listFieldSchema
            long r1 = offset(r5)
            java.util.List r4 = r0.mutableListAt(r4, r1)
            r6.readStringListRequireUtf8(r4)
            goto L21
        L14:
            androidx.datastore.preferences.protobuf.ListFieldSchema r0 = r3.listFieldSchema
            long r1 = offset(r5)
            java.util.List r4 = r0.mutableListAt(r4, r1)
            r6.readStringList(r4)
        L21:
            return
    }

    private static java.lang.reflect.Field reflectField(java.lang.Class<?> r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Field "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = " for "
            r2.append(r6)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = " not found. Known fields are "
            r2.append(r5)
            java.lang.String r5 = java.util.Arrays.toString(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
    }

    private void setFieldPresent(T r4, int r5) {
            r3 = this;
            boolean r0 = r3.proto3
            if (r0 == 0) goto L5
            return
        L5:
            int r5 = r3.presenceMaskAndOffsetAt(r5)
            r0 = 1
            int r1 = r5 >>> 20
            int r0 = r0 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r1
            long r1 = (long) r5
            int r5 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r4, r1)
            r5 = r5 | r0
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r4, r1, r5)
            return
    }

    private void setOneofPresent(T r3, int r4, int r5) {
            r2 = this;
            int r5 = r2.presenceMaskAndOffsetAt(r5)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r0
            long r0 = (long) r5
            androidx.datastore.preferences.protobuf.UnsafeUtil.putInt(r3, r0, r4)
            return
    }

    private int slowPositionForFieldNumber(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.buffer
            int r0 = r0.length
            int r0 = r0 / 3
            int r0 = r0 + (-1)
        L7:
            if (r6 > r0) goto L20
            int r1 = r0 + r6
            int r1 = r1 >>> 1
            int r2 = r1 * 3
            int r3 = r4.numberAt(r2)
            if (r5 != r3) goto L16
            return r2
        L16:
            if (r5 >= r3) goto L1c
            int r1 = r1 + (-1)
            r0 = r1
            goto L7
        L1c:
            int r1 = r1 + 1
            r6 = r1
            goto L7
        L20:
            r5 = -1
            return r5
    }

    private static int type(int r1) {
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r0
            int r1 = r1 >>> 20
            return r1
    }

    private int typeAndOffsetAt(int r2) {
            r1 = this;
            int[] r0 = r1.buffer
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    private void writeFieldsInAscendingOrderProto2(T r18, androidx.datastore.preferences.protobuf.Writer r19) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.hasExtensions
            if (r3 == 0) goto L21
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r3 = r0.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r3 = r3.getExtensions(r1)
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L21
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L23
        L21:
            r3 = 0
            r5 = 0
        L23:
            r6 = -1
            int[] r7 = r0.buffer
            int r7 = r7.length
            sun.misc.Unsafe r8 = androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE
            r10 = 0
            r11 = 0
        L2b:
            if (r10 >= r7) goto L49a
            int r12 = r0.typeAndOffsetAt(r10)
            int r13 = r0.numberAt(r10)
            int r14 = type(r12)
            boolean r15 = r0.proto3
            if (r15 != 0) goto L5e
            r15 = 17
            if (r14 > r15) goto L5e
            int[] r15 = r0.buffer
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L56
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L56:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L63
        L5e:
            r16 = r5
            r5 = r16
            r4 = 0
        L63:
            if (r5 == 0) goto L81
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r9 = r0.extensionSchema
            int r9 = r9.extensionNumber(r5)
            if (r9 > r13) goto L81
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r9 = r0.extensionSchema
            r9.serializeExtension(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L63
        L7f:
            r5 = 0
            goto L63
        L81:
            r15 = r5
            r9 = r6
            long r5 = offset(r12)
            switch(r14) {
                case 0: goto L489;
                case 1: goto L47d;
                case 2: goto L471;
                case 3: goto L465;
                case 4: goto L459;
                case 5: goto L44d;
                case 6: goto L441;
                case 7: goto L435;
                case 8: goto L429;
                case 9: goto L418;
                case 10: goto L409;
                case 11: goto L3fc;
                case 12: goto L3ef;
                case 13: goto L3e2;
                case 14: goto L3d5;
                case 15: goto L3c8;
                case 16: goto L3bb;
                case 17: goto L3aa;
                case 18: goto L39a;
                case 19: goto L38a;
                case 20: goto L37a;
                case 21: goto L36a;
                case 22: goto L35a;
                case 23: goto L34a;
                case 24: goto L33a;
                case 25: goto L32a;
                case 26: goto L31b;
                case 27: goto L308;
                case 28: goto L2f9;
                case 29: goto L2e9;
                case 30: goto L2d9;
                case 31: goto L2c9;
                case 32: goto L2b9;
                case 33: goto L2a9;
                case 34: goto L299;
                case 35: goto L289;
                case 36: goto L279;
                case 37: goto L269;
                case 38: goto L259;
                case 39: goto L249;
                case 40: goto L239;
                case 41: goto L229;
                case 42: goto L219;
                case 43: goto L209;
                case 44: goto L1f9;
                case 45: goto L1e9;
                case 46: goto L1d9;
                case 47: goto L1c9;
                case 48: goto L1b9;
                case 49: goto L1a6;
                case 50: goto L19d;
                case 51: goto L18e;
                case 52: goto L17f;
                case 53: goto L170;
                case 54: goto L161;
                case 55: goto L152;
                case 56: goto L143;
                case 57: goto L134;
                case 58: goto L125;
                case 59: goto L116;
                case 60: goto L103;
                case 61: goto Lf3;
                case 62: goto Le5;
                case 63: goto Ld7;
                case 64: goto Lc9;
                case 65: goto Lbb;
                case 66: goto Lad;
                case 67: goto L9f;
                case 68: goto L8d;
                default: goto L8a;
            }
        L8a:
            r12 = 0
            goto L494
        L8d:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.Schema r5 = r0.getMessageFieldSchema(r10)
            r2.writeGroup(r13, r4, r5)
            goto L8a
        L9f:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = oneofLongAt(r1, r5)
            r2.writeSInt64(r13, r4)
            goto L8a
        Lad:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = oneofIntAt(r1, r5)
            r2.writeSInt32(r13, r4)
            goto L8a
        Lbb:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = oneofLongAt(r1, r5)
            r2.writeSFixed64(r13, r4)
            goto L8a
        Lc9:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = oneofIntAt(r1, r5)
            r2.writeSFixed32(r13, r4)
            goto L8a
        Ld7:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = oneofIntAt(r1, r5)
            r2.writeEnum(r13, r4)
            goto L8a
        Le5:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = oneofIntAt(r1, r5)
            r2.writeUInt32(r13, r4)
            goto L8a
        Lf3:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r2.writeBytes(r13, r4)
            goto L8a
        L103:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.Schema r5 = r0.getMessageFieldSchema(r10)
            r2.writeMessage(r13, r4, r5)
            goto L8a
        L116:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.writeString(r13, r4, r2)
            goto L8a
        L125:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            boolean r4 = oneofBooleanAt(r1, r5)
            r2.writeBool(r13, r4)
            goto L8a
        L134:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = oneofIntAt(r1, r5)
            r2.writeFixed32(r13, r4)
            goto L8a
        L143:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = oneofLongAt(r1, r5)
            r2.writeFixed64(r13, r4)
            goto L8a
        L152:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            int r4 = oneofIntAt(r1, r5)
            r2.writeInt32(r13, r4)
            goto L8a
        L161:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = oneofLongAt(r1, r5)
            r2.writeUInt64(r13, r4)
            goto L8a
        L170:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            long r4 = oneofLongAt(r1, r5)
            r2.writeInt64(r13, r4)
            goto L8a
        L17f:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            float r4 = oneofFloatAt(r1, r5)
            r2.writeFloat(r13, r4)
            goto L8a
        L18e:
            boolean r4 = r0.isOneofPresent(r1, r13, r10)
            if (r4 == 0) goto L8a
            double r4 = oneofDoubleAt(r1, r5)
            r2.writeDouble(r13, r4)
            goto L8a
        L19d:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.writeMapHelper(r2, r13, r4, r10)
            goto L8a
        L1a6:
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.Schema r6 = r0.getMessageFieldSchema(r10)
            androidx.datastore.preferences.protobuf.SchemaUtil.writeGroupList(r4, r5, r2, r6)
            goto L8a
        L1b9:
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(r4, r5, r2, r12)
            goto L8a
        L1c9:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(r4, r5, r2, r12)
            goto L8a
        L1d9:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(r4, r5, r2, r12)
            goto L8a
        L1e9:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(r4, r5, r2, r12)
            goto L8a
        L1f9:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(r4, r5, r2, r12)
            goto L8a
        L209:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(r4, r5, r2, r12)
            goto L8a
        L219:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(r4, r5, r2, r12)
            goto L8a
        L229:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(r4, r5, r2, r12)
            goto L8a
        L239:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(r4, r5, r2, r12)
            goto L8a
        L249:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(r4, r5, r2, r12)
            goto L8a
        L259:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(r4, r5, r2, r12)
            goto L8a
        L269:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(r4, r5, r2, r12)
            goto L8a
        L279:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(r4, r5, r2, r12)
            goto L8a
        L289:
            r12 = 1
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(r4, r5, r2, r12)
            goto L8a
        L299:
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(r4, r5, r2, r12)
            goto L494
        L2a9:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(r4, r5, r2, r12)
            goto L494
        L2b9:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(r4, r5, r2, r12)
            goto L494
        L2c9:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(r4, r5, r2, r12)
            goto L494
        L2d9:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(r4, r5, r2, r12)
            goto L494
        L2e9:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(r4, r5, r2, r12)
            goto L494
        L2f9:
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBytesList(r4, r5, r2)
            goto L8a
        L308:
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.Schema r6 = r0.getMessageFieldSchema(r10)
            androidx.datastore.preferences.protobuf.SchemaUtil.writeMessageList(r4, r5, r2, r6)
            goto L8a
        L31b:
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeStringList(r4, r5, r2)
            goto L8a
        L32a:
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(r4, r5, r2, r12)
            goto L494
        L33a:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(r4, r5, r2, r12)
            goto L494
        L34a:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(r4, r5, r2, r12)
            goto L494
        L35a:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(r4, r5, r2, r12)
            goto L494
        L36a:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(r4, r5, r2, r12)
            goto L494
        L37a:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(r4, r5, r2, r12)
            goto L494
        L38a:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(r4, r5, r2, r12)
            goto L494
        L39a:
            r12 = 0
            int r4 = r0.numberAt(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(r4, r5, r2, r12)
            goto L494
        L3aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.Schema r5 = r0.getMessageFieldSchema(r10)
            r2.writeGroup(r13, r4, r5)
            goto L494
        L3bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            long r4 = r8.getLong(r1, r5)
            r2.writeSInt64(r13, r4)
            goto L494
        L3c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            int r4 = r8.getInt(r1, r5)
            r2.writeSInt32(r13, r4)
            goto L494
        L3d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            long r4 = r8.getLong(r1, r5)
            r2.writeSFixed64(r13, r4)
            goto L494
        L3e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            int r4 = r8.getInt(r1, r5)
            r2.writeSFixed32(r13, r4)
            goto L494
        L3ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            int r4 = r8.getInt(r1, r5)
            r2.writeEnum(r13, r4)
            goto L494
        L3fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            int r4 = r8.getInt(r1, r5)
            r2.writeUInt32(r13, r4)
            goto L494
        L409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r2.writeBytes(r13, r4)
            goto L494
        L418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            java.lang.Object r4 = r8.getObject(r1, r5)
            androidx.datastore.preferences.protobuf.Schema r5 = r0.getMessageFieldSchema(r10)
            r2.writeMessage(r13, r4, r5)
            goto L494
        L429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.writeString(r13, r4, r2)
            goto L494
        L435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            boolean r4 = booleanAt(r1, r5)
            r2.writeBool(r13, r4)
            goto L494
        L441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            int r4 = r8.getInt(r1, r5)
            r2.writeFixed32(r13, r4)
            goto L494
        L44d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            long r4 = r8.getLong(r1, r5)
            r2.writeFixed64(r13, r4)
            goto L494
        L459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            int r4 = r8.getInt(r1, r5)
            r2.writeInt32(r13, r4)
            goto L494
        L465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            long r4 = r8.getLong(r1, r5)
            r2.writeUInt64(r13, r4)
            goto L494
        L471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            long r4 = r8.getLong(r1, r5)
            r2.writeInt64(r13, r4)
            goto L494
        L47d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            float r4 = floatAt(r1, r5)
            r2.writeFloat(r13, r4)
            goto L494
        L489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L494
            double r4 = doubleAt(r1, r5)
            r2.writeDouble(r13, r4)
        L494:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L2b
        L49a:
            r16 = r5
        L49c:
            if (r5 == 0) goto L4b3
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r4 = r0.extensionSchema
            r4.serializeExtension(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L49c
        L4b1:
            r5 = 0
            goto L49c
        L4b3:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r3 = r0.unknownFieldSchema
            r0.writeUnknownInMessageTo(r3, r1, r2)
            return
    }

    private void writeFieldsInAscendingOrderProto3(T r13, androidx.datastore.preferences.protobuf.Writer r14) throws java.io.IOException {
            r12 = this;
            boolean r0 = r12.hasExtensions
            r1 = 0
            if (r0 == 0) goto L1c
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r12.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r0 = r0.getExtensions(r13)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L1c
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L1e
        L1c:
            r0 = r1
            r2 = r0
        L1e:
            int[] r3 = r12.buffer
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L23:
            if (r5 >= r3) goto L586
            int r6 = r12.typeAndOffsetAt(r5)
            int r7 = r12.numberAt(r5)
        L2d:
            if (r2 == 0) goto L4b
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r8 = r12.extensionSchema
            int r8 = r8.extensionNumber(r2)
            if (r8 > r7) goto L4b
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r8 = r12.extensionSchema
            r8.serializeExtension(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L2d
        L49:
            r2 = r1
            goto L2d
        L4b:
            int r8 = type(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L571;
                case 1: goto L55f;
                case 2: goto L54d;
                case 3: goto L53b;
                case 4: goto L529;
                case 5: goto L517;
                case 6: goto L505;
                case 7: goto L4f2;
                case 8: goto L4df;
                case 9: goto L4c8;
                case 10: goto L4b3;
                case 11: goto L4a0;
                case 12: goto L48d;
                case 13: goto L47a;
                case 14: goto L467;
                case 15: goto L454;
                case 16: goto L441;
                case 17: goto L42a;
                case 18: goto L417;
                case 19: goto L404;
                case 20: goto L3f1;
                case 21: goto L3de;
                case 22: goto L3cb;
                case 23: goto L3b8;
                case 24: goto L3a5;
                case 25: goto L392;
                case 26: goto L37f;
                case 27: goto L368;
                case 28: goto L355;
                case 29: goto L342;
                case 30: goto L32f;
                case 31: goto L31c;
                case 32: goto L309;
                case 33: goto L2f6;
                case 34: goto L2e3;
                case 35: goto L2d0;
                case 36: goto L2bd;
                case 37: goto L2aa;
                case 38: goto L297;
                case 39: goto L284;
                case 40: goto L271;
                case 41: goto L25e;
                case 42: goto L24b;
                case 43: goto L238;
                case 44: goto L225;
                case 45: goto L212;
                case 46: goto L1ff;
                case 47: goto L1ec;
                case 48: goto L1d9;
                case 49: goto L1c2;
                case 50: goto L1b5;
                case 51: goto L1a2;
                case 52: goto L18f;
                case 53: goto L17c;
                case 54: goto L169;
                case 55: goto L156;
                case 56: goto L143;
                case 57: goto L130;
                case 58: goto L11d;
                case 59: goto L10a;
                case 60: goto Lf3;
                case 61: goto Lde;
                case 62: goto Lcb;
                case 63: goto Lb8;
                case 64: goto La5;
                case 65: goto L92;
                case 66: goto L7f;
                case 67: goto L6c;
                case 68: goto L55;
                default: goto L53;
            }
        L53:
            goto L582
        L55:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            androidx.datastore.preferences.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            r14.writeGroup(r7, r6, r8)
            goto L582
        L6c:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeSInt64(r7, r8)
            goto L582
        L7f:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeSInt32(r7, r6)
            goto L582
        L92:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeSFixed64(r7, r8)
            goto L582
        La5:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeSFixed32(r7, r6)
            goto L582
        Lb8:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeEnum(r7, r6)
            goto L582
        Lcb:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeUInt32(r7, r6)
            goto L582
        Lde:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            r14.writeBytes(r7, r6)
            goto L582
        Lf3:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            androidx.datastore.preferences.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            r14.writeMessage(r7, r6, r8)
            goto L582
        L10a:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            r12.writeString(r7, r6, r14)
            goto L582
        L11d:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            boolean r6 = oneofBooleanAt(r13, r8)
            r14.writeBool(r7, r6)
            goto L582
        L130:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeFixed32(r7, r6)
            goto L582
        L143:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeFixed64(r7, r8)
            goto L582
        L156:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = oneofIntAt(r13, r8)
            r14.writeInt32(r7, r6)
            goto L582
        L169:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeUInt64(r7, r8)
            goto L582
        L17c:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = oneofLongAt(r13, r8)
            r14.writeInt64(r7, r8)
            goto L582
        L18f:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            float r6 = oneofFloatAt(r13, r8)
            r14.writeFloat(r7, r6)
            goto L582
        L1a2:
            boolean r8 = r12.isOneofPresent(r13, r7, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            double r8 = oneofDoubleAt(r13, r8)
            r14.writeDouble(r7, r8)
            goto L582
        L1b5:
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            r12.writeMapHelper(r14, r7, r6, r5)
            goto L582
        L1c2:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            androidx.datastore.preferences.protobuf.SchemaUtil.writeGroupList(r7, r6, r14, r8)
            goto L582
        L1d9:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(r7, r6, r14, r9)
            goto L582
        L1ec:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(r7, r6, r14, r9)
            goto L582
        L1ff:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(r7, r6, r14, r9)
            goto L582
        L212:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(r7, r6, r14, r9)
            goto L582
        L225:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(r7, r6, r14, r9)
            goto L582
        L238:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(r7, r6, r14, r9)
            goto L582
        L24b:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(r7, r6, r14, r9)
            goto L582
        L25e:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(r7, r6, r14, r9)
            goto L582
        L271:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(r7, r6, r14, r9)
            goto L582
        L284:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(r7, r6, r14, r9)
            goto L582
        L297:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(r7, r6, r14, r9)
            goto L582
        L2aa:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(r7, r6, r14, r9)
            goto L582
        L2bd:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(r7, r6, r14, r9)
            goto L582
        L2d0:
            int r7 = r12.numberAt(r5)
            long r10 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r10)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(r7, r6, r14, r9)
            goto L582
        L2e3:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(r7, r6, r14, r4)
            goto L582
        L2f6:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(r7, r6, r14, r4)
            goto L582
        L309:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(r7, r6, r14, r4)
            goto L582
        L31c:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(r7, r6, r14, r4)
            goto L582
        L32f:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(r7, r6, r14, r4)
            goto L582
        L342:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(r7, r6, r14, r4)
            goto L582
        L355:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBytesList(r7, r6, r14)
            goto L582
        L368:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            androidx.datastore.preferences.protobuf.SchemaUtil.writeMessageList(r7, r6, r14, r8)
            goto L582
        L37f:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeStringList(r7, r6, r14)
            goto L582
        L392:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(r7, r6, r14, r4)
            goto L582
        L3a5:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(r7, r6, r14, r4)
            goto L582
        L3b8:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(r7, r6, r14, r4)
            goto L582
        L3cb:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(r7, r6, r14, r4)
            goto L582
        L3de:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(r7, r6, r14, r4)
            goto L582
        L3f1:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(r7, r6, r14, r4)
            goto L582
        L404:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(r7, r6, r14, r4)
            goto L582
        L417:
            int r7 = r12.numberAt(r5)
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            java.util.List r6 = (java.util.List) r6
            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(r7, r6, r14, r4)
            goto L582
        L42a:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            androidx.datastore.preferences.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            r14.writeGroup(r7, r6, r8)
            goto L582
        L441:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeSInt64(r7, r8)
            goto L582
        L454:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeSInt32(r7, r6)
            goto L582
        L467:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeSFixed64(r7, r8)
            goto L582
        L47a:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeSFixed32(r7, r6)
            goto L582
        L48d:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeEnum(r7, r6)
            goto L582
        L4a0:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeUInt32(r7, r6)
            goto L582
        L4b3:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            androidx.datastore.preferences.protobuf.ByteString r6 = (androidx.datastore.preferences.protobuf.ByteString) r6
            r14.writeBytes(r7, r6)
            goto L582
        L4c8:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            androidx.datastore.preferences.protobuf.Schema r8 = r12.getMessageFieldSchema(r5)
            r14.writeMessage(r7, r6, r8)
            goto L582
        L4df:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            java.lang.Object r6 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r13, r8)
            r12.writeString(r7, r6, r14)
            goto L582
        L4f2:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            boolean r6 = booleanAt(r13, r8)
            r14.writeBool(r7, r6)
            goto L582
        L505:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeFixed32(r7, r6)
            goto L582
        L517:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeFixed64(r7, r8)
            goto L582
        L529:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            int r6 = intAt(r13, r8)
            r14.writeInt32(r7, r6)
            goto L582
        L53b:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeUInt64(r7, r8)
            goto L582
        L54d:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            long r8 = longAt(r13, r8)
            r14.writeInt64(r7, r8)
            goto L582
        L55f:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            float r6 = floatAt(r13, r8)
            r14.writeFloat(r7, r6)
            goto L582
        L571:
            boolean r8 = r12.isFieldPresent(r13, r5)
            if (r8 == 0) goto L582
            long r8 = offset(r6)
            double r8 = doubleAt(r13, r8)
            r14.writeDouble(r7, r8)
        L582:
            int r5 = r5 + 3
            goto L23
        L586:
            if (r2 == 0) goto L59c
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r3 = r12.extensionSchema
            r3.serializeExtension(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L59a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L586
        L59a:
            r2 = r1
            goto L586
        L59c:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r12.unknownFieldSchema
            r12.writeUnknownInMessageTo(r0, r13, r14)
            return
    }

    private void writeFieldsInDescendingOrder(T r11, androidx.datastore.preferences.protobuf.Writer r12) throws java.io.IOException {
            r10 = this;
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r10.unknownFieldSchema
            r10.writeUnknownInMessageTo(r0, r11, r12)
            boolean r0 = r10.hasExtensions
            r1 = 0
            if (r0 == 0) goto L21
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r10.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r0 = r0.getExtensions(r11)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L21
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L23
        L21:
            r0 = r1
            r2 = r0
        L23:
            int[] r3 = r10.buffer
            int r3 = r3.length
            int r3 = r3 + (-3)
        L28:
            if (r3 < 0) goto L58c
            int r4 = r10.typeAndOffsetAt(r3)
            int r5 = r10.numberAt(r3)
        L32:
            if (r2 == 0) goto L50
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r6 = r10.extensionSchema
            int r6 = r6.extensionNumber(r2)
            if (r6 <= r5) goto L50
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r6 = r10.extensionSchema
            r6.serializeExtension(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L32
        L4e:
            r2 = r1
            goto L32
        L50:
            int r6 = type(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L577;
                case 1: goto L565;
                case 2: goto L553;
                case 3: goto L541;
                case 4: goto L52f;
                case 5: goto L51d;
                case 6: goto L50b;
                case 7: goto L4f8;
                case 8: goto L4e5;
                case 9: goto L4ce;
                case 10: goto L4b9;
                case 11: goto L4a6;
                case 12: goto L493;
                case 13: goto L480;
                case 14: goto L46d;
                case 15: goto L45a;
                case 16: goto L447;
                case 17: goto L430;
                case 18: goto L41d;
                case 19: goto L40a;
                case 20: goto L3f7;
                case 21: goto L3e4;
                case 22: goto L3d1;
                case 23: goto L3be;
                case 24: goto L3ab;
                case 25: goto L398;
                case 26: goto L385;
                case 27: goto L36e;
                case 28: goto L35b;
                case 29: goto L348;
                case 30: goto L335;
                case 31: goto L322;
                case 32: goto L30f;
                case 33: goto L2fc;
                case 34: goto L2e9;
                case 35: goto L2d6;
                case 36: goto L2c3;
                case 37: goto L2b0;
                case 38: goto L29d;
                case 39: goto L28a;
                case 40: goto L277;
                case 41: goto L264;
                case 42: goto L251;
                case 43: goto L23e;
                case 44: goto L22b;
                case 45: goto L218;
                case 46: goto L205;
                case 47: goto L1f2;
                case 48: goto L1df;
                case 49: goto L1c8;
                case 50: goto L1bb;
                case 51: goto L1a8;
                case 52: goto L195;
                case 53: goto L182;
                case 54: goto L16f;
                case 55: goto L15c;
                case 56: goto L149;
                case 57: goto L136;
                case 58: goto L123;
                case 59: goto L110;
                case 60: goto Lf9;
                case 61: goto Le4;
                case 62: goto Ld1;
                case 63: goto Lbe;
                case 64: goto Lab;
                case 65: goto L98;
                case 66: goto L85;
                case 67: goto L72;
                case 68: goto L5b;
                default: goto L59;
            }
        L59:
            goto L588
        L5b:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            androidx.datastore.preferences.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeGroup(r5, r4, r6)
            goto L588
        L72:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L588
        L85:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeSInt32(r5, r4)
            goto L588
        L98:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L588
        Lab:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeSFixed32(r5, r4)
            goto L588
        Lbe:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeEnum(r5, r4)
            goto L588
        Ld1:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeUInt32(r5, r4)
            goto L588
        Le4:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r12.writeBytes(r5, r4)
            goto L588
        Lf9:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            androidx.datastore.preferences.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeMessage(r5, r4, r6)
            goto L588
        L110:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeString(r5, r4, r12)
            goto L588
        L123:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            boolean r4 = oneofBooleanAt(r11, r6)
            r12.writeBool(r5, r4)
            goto L588
        L136:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeFixed32(r5, r4)
            goto L588
        L149:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L588
        L15c:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = oneofIntAt(r11, r6)
            r12.writeInt32(r5, r4)
            goto L588
        L16f:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L588
        L182:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = oneofLongAt(r11, r6)
            r12.writeInt64(r5, r6)
            goto L588
        L195:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            float r4 = oneofFloatAt(r11, r6)
            r12.writeFloat(r5, r4)
            goto L588
        L1a8:
            boolean r6 = r10.isOneofPresent(r11, r5, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            double r6 = oneofDoubleAt(r11, r6)
            r12.writeDouble(r5, r6)
            goto L588
        L1bb:
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeMapHelper(r12, r5, r4, r3)
            goto L588
        L1c8:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            androidx.datastore.preferences.protobuf.SchemaUtil.writeGroupList(r5, r4, r12, r6)
            goto L588
        L1df:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(r5, r4, r12, r7)
            goto L588
        L1f2:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(r5, r4, r12, r7)
            goto L588
        L205:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(r5, r4, r12, r7)
            goto L588
        L218:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(r5, r4, r12, r7)
            goto L588
        L22b:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(r5, r4, r12, r7)
            goto L588
        L23e:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(r5, r4, r12, r7)
            goto L588
        L251:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(r5, r4, r12, r7)
            goto L588
        L264:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(r5, r4, r12, r7)
            goto L588
        L277:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(r5, r4, r12, r7)
            goto L588
        L28a:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(r5, r4, r12, r7)
            goto L588
        L29d:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(r5, r4, r12, r7)
            goto L588
        L2b0:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(r5, r4, r12, r7)
            goto L588
        L2c3:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(r5, r4, r12, r7)
            goto L588
        L2d6:
            int r5 = r10.numberAt(r3)
            long r8 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(r5, r4, r12, r7)
            goto L588
        L2e9:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt64List(r5, r4, r12, r8)
            goto L588
        L2fc:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSInt32List(r5, r4, r12, r8)
            goto L588
        L30f:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed64List(r5, r4, r12, r8)
            goto L588
        L322:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeSFixed32List(r5, r4, r12, r8)
            goto L588
        L335:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeEnumList(r5, r4, r12, r8)
            goto L588
        L348:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt32List(r5, r4, r12, r8)
            goto L588
        L35b:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBytesList(r5, r4, r12)
            goto L588
        L36e:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            androidx.datastore.preferences.protobuf.SchemaUtil.writeMessageList(r5, r4, r12, r6)
            goto L588
        L385:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeStringList(r5, r4, r12)
            goto L588
        L398:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeBoolList(r5, r4, r12, r8)
            goto L588
        L3ab:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed32List(r5, r4, r12, r8)
            goto L588
        L3be:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFixed64List(r5, r4, r12, r8)
            goto L588
        L3d1:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt32List(r5, r4, r12, r8)
            goto L588
        L3e4:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeUInt64List(r5, r4, r12, r8)
            goto L588
        L3f7:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeInt64List(r5, r4, r12, r8)
            goto L588
        L40a:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeFloatList(r5, r4, r12, r8)
            goto L588
        L41d:
            int r5 = r10.numberAt(r3)
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.SchemaUtil.writeDoubleList(r5, r4, r12, r8)
            goto L588
        L430:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            androidx.datastore.preferences.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeGroup(r5, r4, r6)
            goto L588
        L447:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeSInt64(r5, r6)
            goto L588
        L45a:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeSInt32(r5, r4)
            goto L588
        L46d:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeSFixed64(r5, r6)
            goto L588
        L480:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeSFixed32(r5, r4)
            goto L588
        L493:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeEnum(r5, r4)
            goto L588
        L4a6:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeUInt32(r5, r4)
            goto L588
        L4b9:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            androidx.datastore.preferences.protobuf.ByteString r4 = (androidx.datastore.preferences.protobuf.ByteString) r4
            r12.writeBytes(r5, r4)
            goto L588
        L4ce:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            androidx.datastore.preferences.protobuf.Schema r6 = r10.getMessageFieldSchema(r3)
            r12.writeMessage(r5, r4, r6)
            goto L588
        L4e5:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r11, r6)
            r10.writeString(r5, r4, r12)
            goto L588
        L4f8:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            boolean r4 = booleanAt(r11, r6)
            r12.writeBool(r5, r4)
            goto L588
        L50b:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeFixed32(r5, r4)
            goto L588
        L51d:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeFixed64(r5, r6)
            goto L588
        L52f:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            int r4 = intAt(r11, r6)
            r12.writeInt32(r5, r4)
            goto L588
        L541:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeUInt64(r5, r6)
            goto L588
        L553:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            long r6 = longAt(r11, r6)
            r12.writeInt64(r5, r6)
            goto L588
        L565:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            float r4 = floatAt(r11, r6)
            r12.writeFloat(r5, r4)
            goto L588
        L577:
            boolean r6 = r10.isFieldPresent(r11, r3)
            if (r6 == 0) goto L588
            long r6 = offset(r4)
            double r6 = doubleAt(r11, r6)
            r12.writeDouble(r5, r6)
        L588:
            int r3 = r3 + (-3)
            goto L28
        L58c:
            if (r2 == 0) goto L5a3
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r11 = r10.extensionSchema
            r11.serializeExtension(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L5a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L58c
        L5a1:
            r2 = r1
            goto L58c
        L5a3:
            return
    }

    private <K, V> void writeMapHelper(androidx.datastore.preferences.protobuf.Writer r2, int r3, java.lang.Object r4, int r5) throws java.io.IOException {
            r1 = this;
            if (r4 == 0) goto L15
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = r1.mapFieldSchema
            java.lang.Object r5 = r1.getMapFieldDefaultEntry(r5)
            androidx.datastore.preferences.protobuf.MapEntryLite$Metadata r5 = r0.forMapMetadata(r5)
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = r1.mapFieldSchema
            java.util.Map r4 = r0.forMapData(r4)
            r2.writeMap(r3, r5, r4)
        L15:
            return
    }

    private void writeString(int r2, java.lang.Object r3, androidx.datastore.preferences.protobuf.Writer r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto La
            java.lang.String r3 = (java.lang.String) r3
            r4.writeString(r2, r3)
            goto Lf
        La:
            androidx.datastore.preferences.protobuf.ByteString r3 = (androidx.datastore.preferences.protobuf.ByteString) r3
            r4.writeBytes(r2, r3)
        Lf:
            return
    }

    private <UT, UB> void writeUnknownInMessageTo(androidx.datastore.preferences.protobuf.UnknownFieldSchema<UT, UB> r1, T r2, androidx.datastore.preferences.protobuf.Writer r3) throws java.io.IOException {
            r0 = this;
            java.lang.Object r2 = r1.getFromMessage(r2)
            r1.writeTo(r2, r3)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public boolean equals(T r5, T r6) {
            r4 = this;
            int[] r0 = r4.buffer
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r2 >= r0) goto L11
            boolean r3 = r4.equals(r5, r6, r2)
            if (r3 != 0) goto Le
            return r1
        Le:
            int r2 = r2 + 3
            goto L5
        L11:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r4.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r5)
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r2 = r4.unknownFieldSchema
            java.lang.Object r2 = r2.getFromMessage(r6)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L24
            return r1
        L24:
            boolean r0 = r4.hasExtensions
            if (r0 == 0) goto L39
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r4.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r5 = r0.getExtensions(r5)
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r4.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r6 = r0.getExtensions(r6)
            boolean r5 = r5.equals(r6)
            return r5
        L39:
            r5 = 1
            return r5
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int getSerializedSize(T r2) {
            r1 = this;
            boolean r0 = r1.proto3
            if (r0 == 0) goto L9
            int r2 = r1.getSerializedSizeProto3(r2)
            goto Ld
        L9:
            int r2 = r1.getSerializedSizeProto2(r2)
        Ld:
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public int hashCode(T r9) {
            r8 = this;
            int[] r0 = r8.buffer
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L5:
            if (r1 >= r0) goto L22a
            int r3 = r8.typeAndOffsetAt(r1)
            int r4 = r8.numberAt(r1)
            long r5 = offset(r3)
            int r3 = type(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L217;
                case 1: goto L20c;
                case 2: goto L201;
                case 3: goto L1f6;
                case 4: goto L1ef;
                case 5: goto L1e4;
                case 6: goto L1dd;
                case 7: goto L1d2;
                case 8: goto L1c5;
                case 9: goto L1b7;
                case 10: goto L1ab;
                case 11: goto L1a3;
                case 12: goto L19b;
                case 13: goto L193;
                case 14: goto L187;
                case 15: goto L17f;
                case 16: goto L173;
                case 17: goto L168;
                case 18: goto L15c;
                case 19: goto L15c;
                case 20: goto L15c;
                case 21: goto L15c;
                case 22: goto L15c;
                case 23: goto L15c;
                case 24: goto L15c;
                case 25: goto L15c;
                case 26: goto L15c;
                case 27: goto L15c;
                case 28: goto L15c;
                case 29: goto L15c;
                case 30: goto L15c;
                case 31: goto L15c;
                case 32: goto L15c;
                case 33: goto L15c;
                case 34: goto L15c;
                case 35: goto L15c;
                case 36: goto L15c;
                case 37: goto L15c;
                case 38: goto L15c;
                case 39: goto L15c;
                case 40: goto L15c;
                case 41: goto L15c;
                case 42: goto L15c;
                case 43: goto L15c;
                case 44: goto L15c;
                case 45: goto L15c;
                case 46: goto L15c;
                case 47: goto L15c;
                case 48: goto L15c;
                case 49: goto L15c;
                case 50: goto L150;
                case 51: goto L13a;
                case 52: goto L128;
                case 53: goto L116;
                case 54: goto L104;
                case 55: goto Lf6;
                case 56: goto Le4;
                case 57: goto Ld6;
                case 58: goto Lc4;
                case 59: goto Lb0;
                case 60: goto L9e;
                case 61: goto L8c;
                case 62: goto L7e;
                case 63: goto L70;
                case 64: goto L62;
                case 65: goto L50;
                case 66: goto L42;
                case 67: goto L30;
                case 68: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L226
        L1e:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L225
        L30:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L42:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L50:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L62:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L70:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L7e:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L8c:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L225
        L9e:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L225
        Lb0:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L225
        Lc4:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            boolean r3 = oneofBooleanAt(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashBoolean(r3)
            goto L225
        Ld6:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        Le4:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        Lf6:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            int r3 = oneofIntAt(r9, r5)
            goto L225
        L104:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L116:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            long r3 = oneofLongAt(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L128:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            float r3 = oneofFloatAt(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L225
        L13a:
            boolean r3 = r8.isOneofPresent(r9, r4, r1)
            if (r3 == 0) goto L226
            int r2 = r2 * 53
            double r3 = oneofDoubleAt(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L150:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L225
        L15c:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L225
        L168:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            if (r3 == 0) goto L1c1
            int r7 = r3.hashCode()
            goto L1c1
        L173:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L17f:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L187:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L193:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L19b:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L1a3:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L1ab:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            int r3 = r3.hashCode()
            goto L225
        L1b7:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            if (r3 == 0) goto L1c1
            int r7 = r3.hashCode()
        L1c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L226
        L1c5:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L225
        L1d2:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getBoolean(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashBoolean(r3)
            goto L225
        L1dd:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L1e4:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L1ef:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getInt(r9, r5)
            goto L225
        L1f6:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L201:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getLong(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
            goto L225
        L20c:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getFloat(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L225
        L217:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getDouble(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.Internal.hashLong(r3)
        L225:
            int r2 = r2 + r3
        L226:
            int r1 = r1 + 3
            goto L5
        L22a:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r8.unknownFieldSchema
            java.lang.Object r0 = r0.getFromMessage(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.hasExtensions
            if (r0 == 0) goto L248
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r8.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r9 = r0.getExtensions(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L248:
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(T r13) {
            r12 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
        L4:
            int r4 = r12.checkInitializedCount
            r5 = 1
            if (r2 >= r4) goto L94
            int[] r4 = r12.intArray
            r4 = r4[r2]
            int r6 = r12.numberAt(r4)
            int r7 = r12.typeAndOffsetAt(r4)
            boolean r8 = r12.proto3
            if (r8 != 0) goto L31
            int[] r8 = r12.buffer
            int r9 = r4 + 2
            r8 = r8[r9]
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r8
            int r8 = r8 >>> 20
            int r5 = r5 << r8
            if (r9 == r1) goto L32
            sun.misc.Unsafe r1 = androidx.datastore.preferences.protobuf.MessageSchema.UNSAFE
            long r10 = (long) r9
            int r3 = r1.getInt(r13, r10)
            r1 = r9
            goto L32
        L31:
            r5 = 0
        L32:
            boolean r8 = isRequired(r7)
            if (r8 == 0) goto L3f
            boolean r8 = r12.isFieldPresent(r13, r4, r3, r5)
            if (r8 != 0) goto L3f
            return r0
        L3f:
            int r8 = type(r7)
            r9 = 9
            if (r8 == r9) goto L7f
            r9 = 17
            if (r8 == r9) goto L7f
            r5 = 27
            if (r8 == r5) goto L78
            r5 = 60
            if (r8 == r5) goto L67
            r5 = 68
            if (r8 == r5) goto L67
            r5 = 49
            if (r8 == r5) goto L78
            r5 = 50
            if (r8 == r5) goto L60
            goto L90
        L60:
            boolean r4 = r12.isMapInitialized(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L67:
            boolean r5 = r12.isOneofPresent(r13, r6, r4)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.Schema r4 = r12.getMessageFieldSchema(r4)
            boolean r4 = isInitialized(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L78:
            boolean r4 = r12.isListInitialized(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L7f:
            boolean r5 = r12.isFieldPresent(r13, r4, r3, r5)
            if (r5 == 0) goto L90
            androidx.datastore.preferences.protobuf.Schema r4 = r12.getMessageFieldSchema(r4)
            boolean r4 = isInitialized(r13, r7, r4)
            if (r4 != 0) goto L90
            return r0
        L90:
            int r2 = r2 + 1
            goto L4
        L94:
            boolean r1 = r12.hasExtensions
            if (r1 == 0) goto La5
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r1 = r12.extensionSchema
            androidx.datastore.preferences.protobuf.FieldSet r13 = r1.getExtensions(r13)
            boolean r13 = r13.isInitialized()
            if (r13 != 0) goto La5
            return r0
        La5:
            return r5
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void makeImmutable(T r6) {
            r5 = this;
            int r0 = r5.checkInitializedCount
        L2:
            int r1 = r5.repeatedFieldOffsetStart
            if (r0 >= r1) goto L25
            int[] r1 = r5.intArray
            r1 = r1[r0]
            int r1 = r5.typeAndOffsetAt(r1)
            long r1 = offset(r1)
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.UnsafeUtil.getObject(r6, r1)
            if (r3 != 0) goto L19
            goto L22
        L19:
            androidx.datastore.preferences.protobuf.MapFieldSchema r4 = r5.mapFieldSchema
            java.lang.Object r3 = r4.toImmutable(r3)
            androidx.datastore.preferences.protobuf.UnsafeUtil.putObject(r6, r1, r3)
        L22:
            int r0 = r0 + 1
            goto L2
        L25:
            int[] r0 = r5.intArray
            int r0 = r0.length
        L28:
            if (r1 >= r0) goto L37
            androidx.datastore.preferences.protobuf.ListFieldSchema r2 = r5.listFieldSchema
            int[] r3 = r5.intArray
            r3 = r3[r1]
            long r3 = (long) r3
            r2.makeImmutableListAt(r6, r3)
            int r1 = r1 + 1
            goto L28
        L37:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r5.unknownFieldSchema
            r0.makeImmutable(r6)
            boolean r0 = r5.hasExtensions
            if (r0 == 0) goto L45
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r5.extensionSchema
            r0.makeImmutable(r6)
        L45:
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void mergeFrom(T r7, androidx.datastore.preferences.protobuf.Reader r8, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r9) throws java.io.IOException {
            r6 = this;
            java.util.Objects.requireNonNull(r9)
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
    public void mergeFrom(T r3, T r4) {
            r2 = this;
            java.util.Objects.requireNonNull(r4)
            r0 = 0
        L4:
            int[] r1 = r2.buffer
            int r1 = r1.length
            if (r0 >= r1) goto Lf
            r2.mergeSingleField(r3, r4, r0)
            int r0 = r0 + 3
            goto L4
        Lf:
            boolean r0 = r2.proto3
            if (r0 != 0) goto L21
            androidx.datastore.preferences.protobuf.UnknownFieldSchema<?, ?> r0 = r2.unknownFieldSchema
            androidx.datastore.preferences.protobuf.SchemaUtil.mergeUnknownFields(r0, r3, r4)
            boolean r0 = r2.hasExtensions
            if (r0 == 0) goto L21
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = r2.extensionSchema
            androidx.datastore.preferences.protobuf.SchemaUtil.mergeExtensions(r0, r3, r4)
        L21:
            return
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public T newInstance() {
            r2 = this;
            androidx.datastore.preferences.protobuf.NewInstanceSchema r0 = r2.newInstanceSchema
            androidx.datastore.preferences.protobuf.MessageLite r1 = r2.defaultInstance
            java.lang.Object r0 = r0.newInstance(r1)
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public void writeTo(T r3, androidx.datastore.preferences.protobuf.Writer r4) throws java.io.IOException {
            r2 = this;
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r0 = r4.fieldOrder()
            androidx.datastore.preferences.protobuf.Writer$FieldOrder r1 = androidx.datastore.preferences.protobuf.Writer.FieldOrder.DESCENDING
            if (r0 != r1) goto Lc
            r2.writeFieldsInDescendingOrder(r3, r4)
            goto L17
        Lc:
            boolean r0 = r2.proto3
            if (r0 == 0) goto L14
            r2.writeFieldsInAscendingOrderProto3(r3, r4)
            goto L17
        L14:
            r2.writeFieldsInAscendingOrderProto2(r3, r4)
        L17:
            return
    }
}
