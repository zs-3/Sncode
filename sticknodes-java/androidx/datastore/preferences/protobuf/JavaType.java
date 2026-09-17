package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public enum JavaType extends java.lang.Enum<androidx.datastore.preferences.protobuf.JavaType> {
    private static final /* synthetic */ androidx.datastore.preferences.protobuf.JavaType[] $VALUES = null;
    public static final androidx.datastore.preferences.protobuf.JavaType BOOLEAN = null;
    public static final androidx.datastore.preferences.protobuf.JavaType BYTE_STRING = null;
    public static final androidx.datastore.preferences.protobuf.JavaType DOUBLE = null;
    public static final androidx.datastore.preferences.protobuf.JavaType ENUM = null;
    public static final androidx.datastore.preferences.protobuf.JavaType FLOAT = null;
    public static final androidx.datastore.preferences.protobuf.JavaType INT = null;
    public static final androidx.datastore.preferences.protobuf.JavaType LONG = null;
    public static final androidx.datastore.preferences.protobuf.JavaType MESSAGE = null;
    public static final androidx.datastore.preferences.protobuf.JavaType STRING = null;
    public static final androidx.datastore.preferences.protobuf.JavaType VOID = null;
    private final java.lang.Class<?> boxedType;
    private final java.lang.Object defaultDefault;
    private final java.lang.Class<?> type;

    static {
            androidx.datastore.preferences.protobuf.JavaType r6 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            java.lang.String r1 = "VOID"
            r2 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.datastore.preferences.protobuf.JavaType.VOID = r6
            androidx.datastore.preferences.protobuf.JavaType r0 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.String r8 = "INT"
            r9 = 1
            r7 = r0
            r10 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            androidx.datastore.preferences.protobuf.JavaType.INT = r0
            androidx.datastore.preferences.protobuf.JavaType r3 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class r16 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r17 = java.lang.Long.class
            r4 = 0
            java.lang.Long r18 = java.lang.Long.valueOf(r4)
            java.lang.String r14 = "LONG"
            r15 = 2
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            androidx.datastore.preferences.protobuf.JavaType.LONG = r3
            androidx.datastore.preferences.protobuf.JavaType r4 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class r10 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r11 = java.lang.Float.class
            r5 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r5)
            java.lang.String r8 = "FLOAT"
            r9 = 3
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            androidx.datastore.preferences.protobuf.JavaType.FLOAT = r4
            androidx.datastore.preferences.protobuf.JavaType r5 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class r16 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r17 = java.lang.Double.class
            r7 = 0
            java.lang.Double r18 = java.lang.Double.valueOf(r7)
            java.lang.String r14 = "DOUBLE"
            r15 = 4
            r13 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            androidx.datastore.preferences.protobuf.JavaType.DOUBLE = r5
            androidx.datastore.preferences.protobuf.JavaType r13 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class r10 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r11 = java.lang.Boolean.class
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.String r8 = "BOOLEAN"
            r9 = 5
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            androidx.datastore.preferences.protobuf.JavaType.BOOLEAN = r13
            androidx.datastore.preferences.protobuf.JavaType r20 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            java.lang.String r15 = "STRING"
            r16 = 6
            java.lang.String r19 = ""
            r14 = r20
            r14.<init>(r15, r16, r17, r18, r19)
            androidx.datastore.preferences.protobuf.JavaType.STRING = r20
            androidx.datastore.preferences.protobuf.JavaType r14 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class<androidx.datastore.preferences.protobuf.ByteString> r10 = androidx.datastore.preferences.protobuf.ByteString.class
            java.lang.Class<androidx.datastore.preferences.protobuf.ByteString> r11 = androidx.datastore.preferences.protobuf.ByteString.class
            androidx.datastore.preferences.protobuf.ByteString r12 = androidx.datastore.preferences.protobuf.ByteString.EMPTY
            java.lang.String r8 = "BYTE_STRING"
            r9 = 7
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            androidx.datastore.preferences.protobuf.JavaType.BYTE_STRING = r14
            androidx.datastore.preferences.protobuf.JavaType r15 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            java.lang.String r8 = "ENUM"
            r9 = 8
            r12 = 0
            r7 = r15
            r10 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            androidx.datastore.preferences.protobuf.JavaType.ENUM = r15
            androidx.datastore.preferences.protobuf.JavaType r1 = new androidx.datastore.preferences.protobuf.JavaType
            java.lang.Class<java.lang.Object> r24 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r25 = java.lang.Object.class
            java.lang.String r22 = "MESSAGE"
            r23 = 9
            r26 = 0
            r21 = r1
            r21.<init>(r22, r23, r24, r25, r26)
            androidx.datastore.preferences.protobuf.JavaType.MESSAGE = r1
            r7 = 10
            androidx.datastore.preferences.protobuf.JavaType[] r7 = new androidx.datastore.preferences.protobuf.JavaType[r7]
            r7[r2] = r6
            r2 = 1
            r7[r2] = r0
            r0 = 2
            r7[r0] = r3
            r0 = 3
            r7[r0] = r4
            r0 = 4
            r7[r0] = r5
            r0 = 5
            r7[r0] = r13
            r0 = 6
            r7[r0] = r20
            r0 = 7
            r7[r0] = r14
            r0 = 8
            r7[r0] = r15
            r0 = 9
            r7[r0] = r1
            androidx.datastore.preferences.protobuf.JavaType.$VALUES = r7
            return
    }

    JavaType(java.lang.String r1, int r2, java.lang.Class r3, java.lang.Class r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.type = r3
            r0.boxedType = r4
            r0.defaultDefault = r5
            return
    }

    public static androidx.datastore.preferences.protobuf.JavaType valueOf(java.lang.String r1) {
            java.lang.Class<androidx.datastore.preferences.protobuf.JavaType> r0 = androidx.datastore.preferences.protobuf.JavaType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            androidx.datastore.preferences.protobuf.JavaType r1 = (androidx.datastore.preferences.protobuf.JavaType) r1
            return r1
    }

    public static androidx.datastore.preferences.protobuf.JavaType[] values() {
            androidx.datastore.preferences.protobuf.JavaType[] r0 = androidx.datastore.preferences.protobuf.JavaType.$VALUES
            java.lang.Object r0 = r0.clone()
            androidx.datastore.preferences.protobuf.JavaType[] r0 = (androidx.datastore.preferences.protobuf.JavaType[]) r0
            return r0
    }

    public java.lang.Class<?> getBoxedType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.boxedType
            return r0
    }
}
