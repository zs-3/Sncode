package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public enum FieldType extends java.lang.Enum<androidx.datastore.preferences.protobuf.FieldType> {
    private static final /* synthetic */ androidx.datastore.preferences.protobuf.FieldType[] $VALUES = null;
    public static final androidx.datastore.preferences.protobuf.FieldType BOOL = null;
    public static final androidx.datastore.preferences.protobuf.FieldType BOOL_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType BOOL_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType BYTES = null;
    public static final androidx.datastore.preferences.protobuf.FieldType BYTES_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType DOUBLE = null;
    public static final androidx.datastore.preferences.protobuf.FieldType DOUBLE_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType DOUBLE_LIST_PACKED = null;
    private static final java.lang.reflect.Type[] EMPTY_TYPES = null;
    public static final androidx.datastore.preferences.protobuf.FieldType ENUM = null;
    public static final androidx.datastore.preferences.protobuf.FieldType ENUM_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType ENUM_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FIXED32 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FIXED32_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FIXED32_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FIXED64 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FIXED64_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FIXED64_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FLOAT = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FLOAT_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType FLOAT_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType GROUP = null;
    public static final androidx.datastore.preferences.protobuf.FieldType GROUP_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType INT32 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType INT32_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType INT32_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType INT64 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType INT64_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType INT64_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType MAP = null;
    public static final androidx.datastore.preferences.protobuf.FieldType MESSAGE = null;
    public static final androidx.datastore.preferences.protobuf.FieldType MESSAGE_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SFIXED32 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SFIXED32_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SFIXED32_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SFIXED64 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SFIXED64_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SFIXED64_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SINT32 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SINT32_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SINT32_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SINT64 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SINT64_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType SINT64_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType STRING = null;
    public static final androidx.datastore.preferences.protobuf.FieldType STRING_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType UINT32 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType UINT32_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType UINT32_LIST_PACKED = null;
    public static final androidx.datastore.preferences.protobuf.FieldType UINT64 = null;
    public static final androidx.datastore.preferences.protobuf.FieldType UINT64_LIST = null;
    public static final androidx.datastore.preferences.protobuf.FieldType UINT64_LIST_PACKED = null;
    private static final androidx.datastore.preferences.protobuf.FieldType[] VALUES = null;
    private final androidx.datastore.preferences.protobuf.FieldType.Collection collection;
    private final java.lang.Class<?> elementType;
    private final int id;
    private final androidx.datastore.preferences.protobuf.JavaType javaType;
    private final boolean primitiveScalar;

    /* renamed from: androidx.datastore.preferences.protobuf.FieldType$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType = null;

        static {
                androidx.datastore.preferences.protobuf.JavaType[] r0 = androidx.datastore.preferences.protobuf.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.JavaType r2 = androidx.datastore.preferences.protobuf.JavaType.BYTE_STRING     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.datastore.preferences.protobuf.JavaType r3 = androidx.datastore.preferences.protobuf.JavaType.MESSAGE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.datastore.preferences.protobuf.JavaType r4 = androidx.datastore.preferences.protobuf.JavaType.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                androidx.datastore.preferences.protobuf.FieldType$Collection[] r3 = androidx.datastore.preferences.protobuf.FieldType.Collection.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection = r3
                androidx.datastore.preferences.protobuf.FieldType$Collection r4 = androidx.datastore.preferences.protobuf.FieldType.Collection.MAP     // Catch: java.lang.NoSuchFieldError -> L39
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L39
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L39
            L39:
                int[] r1 = androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection     // Catch: java.lang.NoSuchFieldError -> L43
                androidx.datastore.preferences.protobuf.FieldType$Collection r3 = androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR     // Catch: java.lang.NoSuchFieldError -> L43
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r1[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                int[] r0 = androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection     // Catch: java.lang.NoSuchFieldError -> L4d
                androidx.datastore.preferences.protobuf.FieldType$Collection r1 = androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR     // Catch: java.lang.NoSuchFieldError -> L4d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4d
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L4d
            L4d:
                return
        }
    }

    enum Collection extends java.lang.Enum<androidx.datastore.preferences.protobuf.FieldType.Collection> {
        private static final /* synthetic */ androidx.datastore.preferences.protobuf.FieldType.Collection[] $VALUES = null;
        public static final androidx.datastore.preferences.protobuf.FieldType.Collection MAP = null;
        public static final androidx.datastore.preferences.protobuf.FieldType.Collection PACKED_VECTOR = null;
        public static final androidx.datastore.preferences.protobuf.FieldType.Collection SCALAR = null;
        public static final androidx.datastore.preferences.protobuf.FieldType.Collection VECTOR = null;
        private final boolean isList;

        static {
                androidx.datastore.preferences.protobuf.FieldType$Collection r0 = new androidx.datastore.preferences.protobuf.FieldType$Collection
                java.lang.String r1 = "SCALAR"
                r2 = 0
                r0.<init>(r1, r2, r2)
                androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR = r0
                androidx.datastore.preferences.protobuf.FieldType$Collection r1 = new androidx.datastore.preferences.protobuf.FieldType$Collection
                java.lang.String r3 = "VECTOR"
                r4 = 1
                r1.<init>(r3, r4, r4)
                androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR = r1
                androidx.datastore.preferences.protobuf.FieldType$Collection r3 = new androidx.datastore.preferences.protobuf.FieldType$Collection
                java.lang.String r5 = "PACKED_VECTOR"
                r6 = 2
                r3.<init>(r5, r6, r4)
                androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR = r3
                androidx.datastore.preferences.protobuf.FieldType$Collection r5 = new androidx.datastore.preferences.protobuf.FieldType$Collection
                java.lang.String r7 = "MAP"
                r8 = 3
                r5.<init>(r7, r8, r2)
                androidx.datastore.preferences.protobuf.FieldType.Collection.MAP = r5
                r7 = 4
                androidx.datastore.preferences.protobuf.FieldType$Collection[] r7 = new androidx.datastore.preferences.protobuf.FieldType.Collection[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.datastore.preferences.protobuf.FieldType.Collection.$VALUES = r7
                return
        }

        Collection(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.isList = r3
                return
        }

        public static androidx.datastore.preferences.protobuf.FieldType.Collection valueOf(java.lang.String r1) {
                java.lang.Class<androidx.datastore.preferences.protobuf.FieldType$Collection> r0 = androidx.datastore.preferences.protobuf.FieldType.Collection.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.datastore.preferences.protobuf.FieldType$Collection r1 = (androidx.datastore.preferences.protobuf.FieldType.Collection) r1
                return r1
        }

        public static androidx.datastore.preferences.protobuf.FieldType.Collection[] values() {
                androidx.datastore.preferences.protobuf.FieldType$Collection[] r0 = androidx.datastore.preferences.protobuf.FieldType.Collection.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.datastore.preferences.protobuf.FieldType$Collection[] r0 = (androidx.datastore.preferences.protobuf.FieldType.Collection[]) r0
                return r0
        }
    }

    static {
            androidx.datastore.preferences.protobuf.FieldType r6 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.FieldType$Collection r7 = androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR
            androidx.datastore.preferences.protobuf.JavaType r8 = androidx.datastore.preferences.protobuf.JavaType.DOUBLE
            java.lang.String r1 = "DOUBLE"
            r2 = 0
            r3 = 0
            r0 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.DOUBLE = r6
            androidx.datastore.preferences.protobuf.FieldType r9 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.JavaType r10 = androidx.datastore.preferences.protobuf.JavaType.FLOAT
            java.lang.String r1 = "FLOAT"
            r2 = 1
            r3 = 1
            r0 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FLOAT = r9
            androidx.datastore.preferences.protobuf.FieldType r11 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.JavaType r12 = androidx.datastore.preferences.protobuf.JavaType.LONG
            java.lang.String r1 = "INT64"
            r2 = 2
            r3 = 2
            r0 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.INT64 = r11
            androidx.datastore.preferences.protobuf.FieldType r13 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "UINT64"
            r2 = 3
            r3 = 3
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.UINT64 = r13
            androidx.datastore.preferences.protobuf.FieldType r14 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.JavaType r15 = androidx.datastore.preferences.protobuf.JavaType.INT
            java.lang.String r1 = "INT32"
            r2 = 4
            r3 = 4
            r0 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.INT32 = r14
            androidx.datastore.preferences.protobuf.FieldType r16 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "FIXED64"
            r2 = 5
            r3 = 5
            r0 = r16
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FIXED64 = r16
            androidx.datastore.preferences.protobuf.FieldType r17 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "FIXED32"
            r2 = 6
            r3 = 6
            r0 = r17
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FIXED32 = r17
            androidx.datastore.preferences.protobuf.FieldType r18 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.JavaType r19 = androidx.datastore.preferences.protobuf.JavaType.BOOLEAN
            java.lang.String r1 = "BOOL"
            r2 = 7
            r3 = 7
            r0 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.BOOL = r18
            androidx.datastore.preferences.protobuf.FieldType r20 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.JavaType r21 = androidx.datastore.preferences.protobuf.JavaType.STRING
            java.lang.String r1 = "STRING"
            r2 = 8
            r3 = 8
            r0 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.STRING = r20
            androidx.datastore.preferences.protobuf.FieldType r22 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.JavaType r23 = androidx.datastore.preferences.protobuf.JavaType.MESSAGE
            java.lang.String r1 = "MESSAGE"
            r2 = 9
            r3 = 9
            r0 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.MESSAGE = r22
            androidx.datastore.preferences.protobuf.FieldType r24 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.JavaType r25 = androidx.datastore.preferences.protobuf.JavaType.BYTE_STRING
            java.lang.String r1 = "BYTES"
            r2 = 10
            r3 = 10
            r0 = r24
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.BYTES = r24
            androidx.datastore.preferences.protobuf.FieldType r26 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "UINT32"
            r2 = 11
            r3 = 11
            r0 = r26
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.UINT32 = r26
            androidx.datastore.preferences.protobuf.FieldType r27 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.JavaType r28 = androidx.datastore.preferences.protobuf.JavaType.ENUM
            java.lang.String r1 = "ENUM"
            r2 = 12
            r3 = 12
            r0 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.ENUM = r27
            androidx.datastore.preferences.protobuf.FieldType r29 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SFIXED32"
            r2 = 13
            r3 = 13
            r0 = r29
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SFIXED32 = r29
            androidx.datastore.preferences.protobuf.FieldType r30 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SFIXED64"
            r2 = 14
            r3 = 14
            r0 = r30
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SFIXED64 = r30
            androidx.datastore.preferences.protobuf.FieldType r31 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SINT32"
            r2 = 15
            r3 = 15
            r0 = r31
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SINT32 = r31
            androidx.datastore.preferences.protobuf.FieldType r32 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SINT64"
            r2 = 16
            r3 = 16
            r0 = r32
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SINT64 = r32
            androidx.datastore.preferences.protobuf.FieldType r33 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "GROUP"
            r2 = 17
            r3 = 17
            r0 = r33
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.GROUP = r33
            androidx.datastore.preferences.protobuf.FieldType r7 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.FieldType$Collection r34 = androidx.datastore.preferences.protobuf.FieldType.Collection.VECTOR
            java.lang.String r1 = "DOUBLE_LIST"
            r2 = 18
            r3 = 18
            r0 = r7
            r4 = r34
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST = r7
            androidx.datastore.preferences.protobuf.FieldType r35 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "FLOAT_LIST"
            r2 = 19
            r3 = 19
            r0 = r35
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FLOAT_LIST = r35
            androidx.datastore.preferences.protobuf.FieldType r36 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "INT64_LIST"
            r2 = 20
            r3 = 20
            r0 = r36
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.INT64_LIST = r36
            androidx.datastore.preferences.protobuf.FieldType r37 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "UINT64_LIST"
            r2 = 21
            r3 = 21
            r0 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.UINT64_LIST = r37
            androidx.datastore.preferences.protobuf.FieldType r38 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "INT32_LIST"
            r2 = 22
            r3 = 22
            r0 = r38
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.INT32_LIST = r38
            androidx.datastore.preferences.protobuf.FieldType r39 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "FIXED64_LIST"
            r2 = 23
            r3 = 23
            r0 = r39
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FIXED64_LIST = r39
            androidx.datastore.preferences.protobuf.FieldType r40 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "FIXED32_LIST"
            r2 = 24
            r3 = 24
            r0 = r40
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FIXED32_LIST = r40
            androidx.datastore.preferences.protobuf.FieldType r41 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "BOOL_LIST"
            r2 = 25
            r3 = 25
            r0 = r41
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.BOOL_LIST = r41
            androidx.datastore.preferences.protobuf.FieldType r42 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "STRING_LIST"
            r2 = 26
            r3 = 26
            r0 = r42
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.STRING_LIST = r42
            androidx.datastore.preferences.protobuf.FieldType r21 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "MESSAGE_LIST"
            r2 = 27
            r3 = 27
            r0 = r21
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.MESSAGE_LIST = r21
            androidx.datastore.preferences.protobuf.FieldType r43 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "BYTES_LIST"
            r2 = 28
            r3 = 28
            r0 = r43
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.BYTES_LIST = r43
            androidx.datastore.preferences.protobuf.FieldType r25 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "UINT32_LIST"
            r2 = 29
            r3 = 29
            r0 = r25
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.UINT32_LIST = r25
            androidx.datastore.preferences.protobuf.FieldType r44 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "ENUM_LIST"
            r2 = 30
            r3 = 30
            r0 = r44
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.ENUM_LIST = r44
            androidx.datastore.preferences.protobuf.FieldType r45 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SFIXED32_LIST"
            r2 = 31
            r3 = 31
            r0 = r45
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SFIXED32_LIST = r45
            androidx.datastore.preferences.protobuf.FieldType r46 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SFIXED64_LIST"
            r2 = 32
            r3 = 32
            r0 = r46
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SFIXED64_LIST = r46
            androidx.datastore.preferences.protobuf.FieldType r47 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SINT32_LIST"
            r2 = 33
            r3 = 33
            r0 = r47
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SINT32_LIST = r47
            androidx.datastore.preferences.protobuf.FieldType r48 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SINT64_LIST"
            r2 = 34
            r3 = 34
            r0 = r48
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST = r48
            androidx.datastore.preferences.protobuf.FieldType r49 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.FieldType$Collection r50 = androidx.datastore.preferences.protobuf.FieldType.Collection.PACKED_VECTOR
            java.lang.String r1 = "DOUBLE_LIST_PACKED"
            r2 = 35
            r3 = 35
            r0 = r49
            r4 = r50
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED = r49
            androidx.datastore.preferences.protobuf.FieldType r8 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "FLOAT_LIST_PACKED"
            r2 = 36
            r3 = 36
            r0 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FLOAT_LIST_PACKED = r8
            androidx.datastore.preferences.protobuf.FieldType r10 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "INT64_LIST_PACKED"
            r2 = 37
            r3 = 37
            r0 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.INT64_LIST_PACKED = r10
            androidx.datastore.preferences.protobuf.FieldType r51 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "UINT64_LIST_PACKED"
            r2 = 38
            r3 = 38
            r0 = r51
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.UINT64_LIST_PACKED = r51
            androidx.datastore.preferences.protobuf.FieldType r52 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "INT32_LIST_PACKED"
            r2 = 39
            r3 = 39
            r0 = r52
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.INT32_LIST_PACKED = r52
            androidx.datastore.preferences.protobuf.FieldType r53 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "FIXED64_LIST_PACKED"
            r2 = 40
            r3 = 40
            r0 = r53
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FIXED64_LIST_PACKED = r53
            androidx.datastore.preferences.protobuf.FieldType r54 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "FIXED32_LIST_PACKED"
            r2 = 41
            r3 = 41
            r0 = r54
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.FIXED32_LIST_PACKED = r54
            androidx.datastore.preferences.protobuf.FieldType r55 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "BOOL_LIST_PACKED"
            r2 = 42
            r3 = 42
            r0 = r55
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.BOOL_LIST_PACKED = r55
            androidx.datastore.preferences.protobuf.FieldType r19 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "UINT32_LIST_PACKED"
            r2 = 43
            r3 = 43
            r0 = r19
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.UINT32_LIST_PACKED = r19
            androidx.datastore.preferences.protobuf.FieldType r56 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "ENUM_LIST_PACKED"
            r2 = 44
            r3 = 44
            r0 = r56
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.ENUM_LIST_PACKED = r56
            androidx.datastore.preferences.protobuf.FieldType r28 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SFIXED32_LIST_PACKED"
            r2 = 45
            r3 = 45
            r0 = r28
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SFIXED32_LIST_PACKED = r28
            androidx.datastore.preferences.protobuf.FieldType r57 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SFIXED64_LIST_PACKED"
            r2 = 46
            r3 = 46
            r0 = r57
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SFIXED64_LIST_PACKED = r57
            androidx.datastore.preferences.protobuf.FieldType r58 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SINT32_LIST_PACKED"
            r2 = 47
            r3 = 47
            r0 = r58
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SINT32_LIST_PACKED = r58
            androidx.datastore.preferences.protobuf.FieldType r15 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "SINT64_LIST_PACKED"
            r2 = 48
            r3 = 48
            r0 = r15
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.SINT64_LIST_PACKED = r15
            androidx.datastore.preferences.protobuf.FieldType r12 = new androidx.datastore.preferences.protobuf.FieldType
            java.lang.String r1 = "GROUP_LIST"
            r2 = 49
            r3 = 49
            r0 = r12
            r4 = r34
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.FieldType.GROUP_LIST = r12
            androidx.datastore.preferences.protobuf.FieldType r0 = new androidx.datastore.preferences.protobuf.FieldType
            androidx.datastore.preferences.protobuf.FieldType$Collection r63 = androidx.datastore.preferences.protobuf.FieldType.Collection.MAP
            androidx.datastore.preferences.protobuf.JavaType r64 = androidx.datastore.preferences.protobuf.JavaType.VOID
            java.lang.String r60 = "MAP"
            r61 = 50
            r62 = 50
            r59 = r0
            r59.<init>(r60, r61, r62, r63, r64)
            androidx.datastore.preferences.protobuf.FieldType.MAP = r0
            r1 = 51
            androidx.datastore.preferences.protobuf.FieldType[] r1 = new androidx.datastore.preferences.protobuf.FieldType[r1]
            r2 = 0
            r1[r2] = r6
            r3 = 1
            r1[r3] = r9
            r3 = 2
            r1[r3] = r11
            r3 = 3
            r1[r3] = r13
            r3 = 4
            r1[r3] = r14
            r3 = 5
            r1[r3] = r16
            r3 = 6
            r1[r3] = r17
            r3 = 7
            r1[r3] = r18
            r3 = 8
            r1[r3] = r20
            r3 = 9
            r1[r3] = r22
            r3 = 10
            r1[r3] = r24
            r3 = 11
            r1[r3] = r26
            r3 = 12
            r1[r3] = r27
            r3 = 13
            r1[r3] = r29
            r3 = 14
            r1[r3] = r30
            r3 = 15
            r1[r3] = r31
            r3 = 16
            r1[r3] = r32
            r3 = 17
            r1[r3] = r33
            r3 = 18
            r1[r3] = r7
            r3 = 19
            r1[r3] = r35
            r3 = 20
            r1[r3] = r36
            r3 = 21
            r1[r3] = r37
            r3 = 22
            r1[r3] = r38
            r3 = 23
            r1[r3] = r39
            r3 = 24
            r1[r3] = r40
            r3 = 25
            r1[r3] = r41
            r3 = 26
            r1[r3] = r42
            r3 = 27
            r1[r3] = r21
            r3 = 28
            r1[r3] = r43
            r3 = 29
            r1[r3] = r25
            r3 = 30
            r1[r3] = r44
            r3 = 31
            r1[r3] = r45
            r3 = 32
            r1[r3] = r46
            r3 = 33
            r1[r3] = r47
            r3 = 34
            r1[r3] = r48
            r3 = 35
            r1[r3] = r49
            r3 = 36
            r1[r3] = r8
            r3 = 37
            r1[r3] = r10
            r3 = 38
            r1[r3] = r51
            r3 = 39
            r1[r3] = r52
            r3 = 40
            r1[r3] = r53
            r3 = 41
            r1[r3] = r54
            r3 = 42
            r1[r3] = r55
            r3 = 43
            r1[r3] = r19
            r3 = 44
            r1[r3] = r56
            r3 = 45
            r1[r3] = r28
            r3 = 46
            r1[r3] = r57
            r3 = 47
            r1[r3] = r58
            r3 = 48
            r1[r3] = r15
            r3 = 49
            r1[r3] = r12
            r3 = 50
            r1[r3] = r0
            androidx.datastore.preferences.protobuf.FieldType.$VALUES = r1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            androidx.datastore.preferences.protobuf.FieldType.EMPTY_TYPES = r0
            androidx.datastore.preferences.protobuf.FieldType[] r0 = values()
            int r1 = r0.length
            androidx.datastore.preferences.protobuf.FieldType[] r1 = new androidx.datastore.preferences.protobuf.FieldType[r1]
            androidx.datastore.preferences.protobuf.FieldType.VALUES = r1
            int r1 = r0.length
        L41b:
            if (r2 >= r1) goto L428
            r3 = r0[r2]
            androidx.datastore.preferences.protobuf.FieldType[] r4 = androidx.datastore.preferences.protobuf.FieldType.VALUES
            int r5 = r3.id
            r4[r5] = r3
            int r2 = r2 + 1
            goto L41b
        L428:
            return
    }

    FieldType(java.lang.String r2, int r3, int r4, androidx.datastore.preferences.protobuf.FieldType.Collection r5, androidx.datastore.preferences.protobuf.JavaType r6) {
            r1 = this;
            r1.<init>(r2, r3)
            r1.id = r4
            r1.collection = r5
            r1.javaType = r6
            int[] r2 = androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$FieldType$Collection
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L22
            if (r2 == r3) goto L1b
            r2 = 0
            r1.elementType = r2
            goto L28
        L1b:
            java.lang.Class r2 = r6.getBoxedType()
            r1.elementType = r2
            goto L28
        L22:
            java.lang.Class r2 = r6.getBoxedType()
            r1.elementType = r2
        L28:
            r2 = 0
            androidx.datastore.preferences.protobuf.FieldType$Collection r0 = androidx.datastore.preferences.protobuf.FieldType.Collection.SCALAR
            if (r5 != r0) goto L3d
            int[] r5 = androidx.datastore.preferences.protobuf.FieldType.AnonymousClass1.$SwitchMap$com$google$protobuf$JavaType
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L3d
            if (r5 == r3) goto L3d
            r3 = 3
            if (r5 == r3) goto L3d
            goto L3e
        L3d:
            r4 = 0
        L3e:
            r1.primitiveScalar = r4
            return
    }

    public static androidx.datastore.preferences.protobuf.FieldType valueOf(java.lang.String r1) {
            java.lang.Class<androidx.datastore.preferences.protobuf.FieldType> r0 = androidx.datastore.preferences.protobuf.FieldType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.datastore.preferences.protobuf.FieldType r1 = (androidx.datastore.preferences.protobuf.FieldType) r1
            return r1
    }

    public static androidx.datastore.preferences.protobuf.FieldType[] values() {
            androidx.datastore.preferences.protobuf.FieldType[] r0 = androidx.datastore.preferences.protobuf.FieldType.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.datastore.preferences.protobuf.FieldType[] r0 = (androidx.datastore.preferences.protobuf.FieldType[]) r0
            return r0
    }

    public int id() {
            r1 = this;
            int r0 = r1.id
            return r0
    }
}
