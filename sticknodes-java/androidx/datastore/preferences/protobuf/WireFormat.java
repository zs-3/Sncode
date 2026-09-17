package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class WireFormat {
    static final int MESSAGE_SET_ITEM_END_TAG = 0;
    static final int MESSAGE_SET_ITEM_TAG = 0;
    static final int MESSAGE_SET_MESSAGE_TAG = 0;
    static final int MESSAGE_SET_TYPE_ID_TAG = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.WireFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public enum FieldType extends java.lang.Enum<androidx.datastore.preferences.protobuf.WireFormat.FieldType> {
        private static final /* synthetic */ androidx.datastore.preferences.protobuf.WireFormat.FieldType[] $VALUES = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType BOOL = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType BYTES = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType DOUBLE = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType ENUM = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType FIXED32 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType FIXED64 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType FLOAT = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType GROUP = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType INT32 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType INT64 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType MESSAGE = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType SFIXED32 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType SFIXED64 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType SINT32 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType SINT64 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType STRING = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType UINT32 = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.FieldType UINT64 = null;
        private final androidx.datastore.preferences.protobuf.WireFormat.JavaType javaType;
        private final int wireType;





        static {
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.DOUBLE
                java.lang.String r2 = "DOUBLE"
                r3 = 0
                r4 = 1
                r0.<init>(r2, r3, r1, r4)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r2 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.FLOAT
                java.lang.String r5 = "FLOAT"
                r6 = 5
                r1.<init>(r5, r4, r2, r6)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT = r1
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r2 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r5 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG
                java.lang.String r7 = "INT64"
                r8 = 2
                r2.<init>(r7, r8, r5, r3)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64 = r2
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r7 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                java.lang.String r9 = "UINT64"
                r10 = 3
                r7.<init>(r9, r10, r5, r3)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64 = r7
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r9 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r11 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT
                java.lang.String r12 = "INT32"
                r13 = 4
                r9.<init>(r12, r13, r11, r3)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32 = r9
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r12 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                java.lang.String r14 = "FIXED64"
                r12.<init>(r14, r6, r5, r4)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64 = r12
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r14 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                java.lang.String r15 = "FIXED32"
                r13 = 6
                r14.<init>(r15, r13, r11, r6)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32 = r14
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r15 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r13 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.BOOLEAN
                java.lang.String r4 = "BOOL"
                r6 = 7
                r15.<init>(r4, r6, r13, r3)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL = r15
                androidx.datastore.preferences.protobuf.WireFormat$FieldType$1 r4 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType$1
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r13 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.STRING
                java.lang.String r6 = "STRING"
                r3 = 8
                r4.<init>(r6, r3, r13, r8)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING = r4
                androidx.datastore.preferences.protobuf.WireFormat$FieldType$2 r6 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType$2
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r13 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE
                java.lang.String r3 = "GROUP"
                r8 = 9
                r6.<init>(r3, r8, r13, r10)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP = r6
                androidx.datastore.preferences.protobuf.WireFormat$FieldType$3 r3 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType$3
                java.lang.String r8 = "MESSAGE"
                r10 = 10
                r16 = r6
                r6 = 2
                r3.<init>(r8, r10, r13, r6)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE = r3
                androidx.datastore.preferences.protobuf.WireFormat$FieldType$4 r8 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType$4
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r13 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.BYTE_STRING
                java.lang.String r10 = "BYTES"
                r17 = r3
                r3 = 11
                r8.<init>(r10, r3, r13, r6)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES = r8
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                java.lang.String r10 = "UINT32"
                r13 = 12
                r3 = 0
                r6.<init>(r10, r13, r11, r3)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32 = r6
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r10 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r13 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM
                r18 = r6
                java.lang.String r6 = "ENUM"
                r19 = r8
                r8 = 13
                r10.<init>(r6, r8, r13, r3)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM = r10
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                java.lang.String r6 = "SFIXED32"
                r13 = 14
                r8 = 5
                r3.<init>(r6, r13, r11, r8)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32 = r3
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r6 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                java.lang.String r8 = "SFIXED64"
                r13 = 15
                r20 = r3
                r3 = 1
                r6.<init>(r8, r13, r5, r3)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64 = r6
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                java.lang.String r8 = "SINT32"
                r13 = 16
                r21 = r6
                r6 = 0
                r3.<init>(r8, r13, r11, r6)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32 = r3
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r8 = new androidx.datastore.preferences.protobuf.WireFormat$FieldType
                java.lang.String r11 = "SINT64"
                r13 = 17
                r8.<init>(r11, r13, r5, r6)
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64 = r8
                r5 = 18
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r5 = new androidx.datastore.preferences.protobuf.WireFormat.FieldType[r5]
                r5[r6] = r0
                r0 = 1
                r5[r0] = r1
                r0 = 2
                r5[r0] = r2
                r0 = 3
                r5[r0] = r7
                r0 = 4
                r5[r0] = r9
                r0 = 5
                r5[r0] = r12
                r0 = 6
                r5[r0] = r14
                r0 = 7
                r5[r0] = r15
                r0 = 8
                r5[r0] = r4
                r0 = 9
                r5[r0] = r16
                r0 = 10
                r5[r0] = r17
                r0 = 11
                r5[r0] = r19
                r0 = 12
                r5[r0] = r18
                r0 = 13
                r5[r0] = r10
                r0 = 14
                r5[r0] = r20
                r0 = 15
                r5[r0] = r21
                r0 = 16
                r5[r0] = r3
                r5[r13] = r8
                androidx.datastore.preferences.protobuf.WireFormat.FieldType.$VALUES = r5
                return
        }

        FieldType(java.lang.String r1, int r2, androidx.datastore.preferences.protobuf.WireFormat.JavaType r3, int r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.javaType = r3
                r0.wireType = r4
                return
        }

        /* synthetic */ FieldType(java.lang.String r1, int r2, androidx.datastore.preferences.protobuf.WireFormat.JavaType r3, int r4, androidx.datastore.preferences.protobuf.WireFormat.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        public static androidx.datastore.preferences.protobuf.WireFormat.FieldType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.datastore.preferences.protobuf.WireFormat$FieldType> r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = (androidx.datastore.preferences.protobuf.WireFormat.FieldType) r1
                return r1
        }

        public static androidx.datastore.preferences.protobuf.WireFormat.FieldType[] values() {
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = (androidx.datastore.preferences.protobuf.WireFormat.FieldType[]) r0
                return r0
        }

        public androidx.datastore.preferences.protobuf.WireFormat.JavaType getJavaType() {
                r1 = this;
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r0 = r1.javaType
                return r0
        }

        public int getWireType() {
                r1 = this;
                int r0 = r1.wireType
                return r0
        }
    }

    public enum JavaType extends java.lang.Enum<androidx.datastore.preferences.protobuf.WireFormat.JavaType> {
        private static final /* synthetic */ androidx.datastore.preferences.protobuf.WireFormat.JavaType[] $VALUES = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType BOOLEAN = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType BYTE_STRING = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType DOUBLE = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType ENUM = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType FLOAT = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType INT = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType LONG = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType MESSAGE = null;
        public static final androidx.datastore.preferences.protobuf.WireFormat.JavaType STRING = null;
        private final java.lang.Object defaultDefault;

        static {
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r0 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                r1 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                java.lang.String r3 = "INT"
                r0.<init>(r3, r1, r2)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.INT = r0
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r2 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                r3 = 0
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.String r4 = "LONG"
                r5 = 1
                r2.<init>(r4, r5, r3)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.LONG = r2
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r3 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                r4 = 0
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                java.lang.String r6 = "FLOAT"
                r7 = 2
                r3.<init>(r6, r7, r4)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.FLOAT = r3
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r4 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                r8 = 0
                java.lang.Double r6 = java.lang.Double.valueOf(r8)
                java.lang.String r8 = "DOUBLE"
                r9 = 3
                r4.<init>(r8, r9, r6)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.DOUBLE = r4
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r6 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                java.lang.String r10 = "BOOLEAN"
                r11 = 4
                r6.<init>(r10, r11, r8)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.BOOLEAN = r6
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r8 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                java.lang.String r10 = "STRING"
                r12 = 5
                java.lang.String r13 = ""
                r8.<init>(r10, r12, r13)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.STRING = r8
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r10 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                androidx.datastore.preferences.protobuf.ByteString r13 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
                java.lang.String r14 = "BYTE_STRING"
                r15 = 6
                r10.<init>(r14, r15, r13)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.BYTE_STRING = r10
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r13 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                java.lang.String r14 = "ENUM"
                r15 = 7
                r12 = 0
                r13.<init>(r14, r15, r12)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.ENUM = r13
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r14 = new androidx.datastore.preferences.protobuf.WireFormat$JavaType
                java.lang.String r15 = "MESSAGE"
                r11 = 8
                r14.<init>(r15, r11, r12)
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE = r14
                r12 = 9
                androidx.datastore.preferences.protobuf.WireFormat$JavaType[] r12 = new androidx.datastore.preferences.protobuf.WireFormat.JavaType[r12]
                r12[r1] = r0
                r12[r5] = r2
                r12[r7] = r3
                r12[r9] = r4
                r0 = 4
                r12[r0] = r6
                r0 = 5
                r12[r0] = r8
                r0 = 6
                r12[r0] = r10
                r0 = 7
                r12[r0] = r13
                r12[r11] = r14
                androidx.datastore.preferences.protobuf.WireFormat.JavaType.$VALUES = r12
                return
        }

        JavaType(java.lang.String r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.defaultDefault = r3
                return
        }

        public static androidx.datastore.preferences.protobuf.WireFormat.JavaType valueOf(java.lang.String r1) {
                java.lang.Class<androidx.datastore.preferences.protobuf.WireFormat$JavaType> r0 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r1 = (androidx.datastore.preferences.protobuf.WireFormat.JavaType) r1
                return r1
        }

        public static androidx.datastore.preferences.protobuf.WireFormat.JavaType[] values() {
                androidx.datastore.preferences.protobuf.WireFormat$JavaType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.JavaType.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.datastore.preferences.protobuf.WireFormat$JavaType[] r0 = (androidx.datastore.preferences.protobuf.WireFormat.JavaType[]) r0
                return r0
        }
    }

    static {
            r0 = 1
            r1 = 3
            int r2 = makeTag(r0, r1)
            androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_TAG = r2
            r2 = 4
            int r0 = makeTag(r0, r2)
            androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_ITEM_END_TAG = r0
            r0 = 2
            r2 = 0
            int r2 = makeTag(r0, r2)
            androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_TYPE_ID_TAG = r2
            int r0 = makeTag(r1, r0)
            androidx.datastore.preferences.protobuf.WireFormat.MESSAGE_SET_MESSAGE_TAG = r0
            return
    }

    public static int getTagFieldNumber(int r0) {
            int r0 = r0 >>> 3
            return r0
    }

    public static int getTagWireType(int r0) {
            r0 = r0 & 7
            return r0
    }

    static int makeTag(int r0, int r1) {
            int r0 = r0 << 3
            r0 = r0 | r1
            return r0
    }
}
