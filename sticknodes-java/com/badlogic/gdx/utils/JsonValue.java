package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class JsonValue implements java.lang.Iterable<com.badlogic.gdx.utils.JsonValue> {
    public com.badlogic.gdx.utils.JsonValue child;
    private double doubleValue;
    private long longValue;
    public java.lang.String name;
    public com.badlogic.gdx.utils.JsonValue next;
    public com.badlogic.gdx.utils.JsonValue parent;
    public com.badlogic.gdx.utils.JsonValue prev;
    public int size;
    private java.lang.String stringValue;
    private com.badlogic.gdx.utils.JsonValue.ValueType type;

    /* renamed from: com.badlogic.gdx.utils.JsonValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType = null;

        static {
                com.badlogic.gdx.utils.JsonValue$ValueType[] r0 = com.badlogic.gdx.utils.JsonValue.ValueType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType = r0
                com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.stringValue     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType     // Catch: java.lang.NoSuchFieldError -> L1d
                com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.doubleValue     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType     // Catch: java.lang.NoSuchFieldError -> L28
                com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.longValue     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType     // Catch: java.lang.NoSuchFieldError -> L33
                com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.booleanValue     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType     // Catch: java.lang.NoSuchFieldError -> L3e
                com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.nullValue     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    public class JsonIterator implements java.util.Iterator<com.badlogic.gdx.utils.JsonValue>, java.lang.Iterable<com.badlogic.gdx.utils.JsonValue> {
        com.badlogic.gdx.utils.JsonValue current;
        com.badlogic.gdx.utils.JsonValue entry;
        final /* synthetic */ com.badlogic.gdx.utils.JsonValue this$0;

        public JsonIterator(com.badlogic.gdx.utils.JsonValue r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.badlogic.gdx.utils.JsonValue r1 = r1.child
                r0.entry = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                com.badlogic.gdx.utils.JsonValue r0 = r1.entry
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.lang.Iterable
        public java.util.Iterator<com.badlogic.gdx.utils.JsonValue> iterator() {
                r0 = this;
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public com.badlogic.gdx.utils.JsonValue next() {
                r2 = this;
                com.badlogic.gdx.utils.JsonValue r0 = r2.entry
                r2.current = r0
                if (r0 == 0) goto Lb
                com.badlogic.gdx.utils.JsonValue r1 = r0.next
                r2.entry = r1
                return r0
            Lb:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ com.badlogic.gdx.utils.JsonValue next() {
                r1 = this;
                com.badlogic.gdx.utils.JsonValue r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                com.badlogic.gdx.utils.JsonValue r0 = r3.current
                com.badlogic.gdx.utils.JsonValue r1 = r0.prev
                if (r1 != 0) goto L12
                com.badlogic.gdx.utils.JsonValue r1 = r3.this$0
                com.badlogic.gdx.utils.JsonValue r0 = r0.next
                r1.child = r0
                if (r0 == 0) goto L1c
                r1 = 0
                r0.prev = r1
                goto L1c
            L12:
                com.badlogic.gdx.utils.JsonValue r2 = r0.next
                r1.next = r2
                com.badlogic.gdx.utils.JsonValue r0 = r0.next
                if (r0 == 0) goto L1c
                r0.prev = r1
            L1c:
                com.badlogic.gdx.utils.JsonValue r0 = r3.this$0
                int r1 = r0.size
                int r1 = r1 + (-1)
                r0.size = r1
                return
        }
    }

    public static class PrettyPrintSettings {
        public com.badlogic.gdx.utils.JsonWriter$OutputType outputType;
        public int singleLineColumns;
        public boolean wrapNumericArrays;

        public PrettyPrintSettings() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public enum ValueType extends java.lang.Enum<com.badlogic.gdx.utils.JsonValue.ValueType> {
        private static final /* synthetic */ com.badlogic.gdx.utils.JsonValue.ValueType[] $VALUES = null;
        public static final com.badlogic.gdx.utils.JsonValue.ValueType array = null;
        public static final com.badlogic.gdx.utils.JsonValue.ValueType booleanValue = null;
        public static final com.badlogic.gdx.utils.JsonValue.ValueType doubleValue = null;
        public static final com.badlogic.gdx.utils.JsonValue.ValueType longValue = null;
        public static final com.badlogic.gdx.utils.JsonValue.ValueType nullValue = null;
        public static final com.badlogic.gdx.utils.JsonValue.ValueType object = null;
        public static final com.badlogic.gdx.utils.JsonValue.ValueType stringValue = null;

        static {
                com.badlogic.gdx.utils.JsonValue$ValueType r0 = new com.badlogic.gdx.utils.JsonValue$ValueType
                java.lang.String r1 = "object"
                r2 = 0
                r0.<init>(r1, r2)
                com.badlogic.gdx.utils.JsonValue.ValueType.object = r0
                com.badlogic.gdx.utils.JsonValue$ValueType r1 = new com.badlogic.gdx.utils.JsonValue$ValueType
                java.lang.String r3 = "array"
                r4 = 1
                r1.<init>(r3, r4)
                com.badlogic.gdx.utils.JsonValue.ValueType.array = r1
                com.badlogic.gdx.utils.JsonValue$ValueType r3 = new com.badlogic.gdx.utils.JsonValue$ValueType
                java.lang.String r5 = "stringValue"
                r6 = 2
                r3.<init>(r5, r6)
                com.badlogic.gdx.utils.JsonValue.ValueType.stringValue = r3
                com.badlogic.gdx.utils.JsonValue$ValueType r5 = new com.badlogic.gdx.utils.JsonValue$ValueType
                java.lang.String r7 = "doubleValue"
                r8 = 3
                r5.<init>(r7, r8)
                com.badlogic.gdx.utils.JsonValue.ValueType.doubleValue = r5
                com.badlogic.gdx.utils.JsonValue$ValueType r7 = new com.badlogic.gdx.utils.JsonValue$ValueType
                java.lang.String r9 = "longValue"
                r10 = 4
                r7.<init>(r9, r10)
                com.badlogic.gdx.utils.JsonValue.ValueType.longValue = r7
                com.badlogic.gdx.utils.JsonValue$ValueType r9 = new com.badlogic.gdx.utils.JsonValue$ValueType
                java.lang.String r11 = "booleanValue"
                r12 = 5
                r9.<init>(r11, r12)
                com.badlogic.gdx.utils.JsonValue.ValueType.booleanValue = r9
                com.badlogic.gdx.utils.JsonValue$ValueType r11 = new com.badlogic.gdx.utils.JsonValue$ValueType
                java.lang.String r13 = "nullValue"
                r14 = 6
                r11.<init>(r13, r14)
                com.badlogic.gdx.utils.JsonValue.ValueType.nullValue = r11
                r13 = 7
                com.badlogic.gdx.utils.JsonValue$ValueType[] r13 = new com.badlogic.gdx.utils.JsonValue.ValueType[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.badlogic.gdx.utils.JsonValue.ValueType.$VALUES = r13
                return
        }

        ValueType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.badlogic.gdx.utils.JsonValue.ValueType valueOf(java.lang.String r1) {
                java.lang.Class<com.badlogic.gdx.utils.JsonValue$ValueType> r0 = com.badlogic.gdx.utils.JsonValue.ValueType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.badlogic.gdx.utils.JsonValue$ValueType r1 = (com.badlogic.gdx.utils.JsonValue.ValueType) r1
                return r1
        }

        public static com.badlogic.gdx.utils.JsonValue.ValueType[] values() {
                com.badlogic.gdx.utils.JsonValue$ValueType[] r0 = com.badlogic.gdx.utils.JsonValue.ValueType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.badlogic.gdx.utils.JsonValue$ValueType[] r0 = (com.badlogic.gdx.utils.JsonValue.ValueType[]) r0
                return r0
        }
    }

    public JsonValue(double r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.set(r2, r0)
            return
    }

    public JsonValue(double r1, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.set(r1, r3)
            return
    }

    public JsonValue(long r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.set(r2, r0)
            return
    }

    public JsonValue(long r1, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.set(r1, r3)
            return
    }

    public JsonValue(com.badlogic.gdx.utils.JsonValue.ValueType r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    public JsonValue(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.set(r1)
            return
    }

    public JsonValue(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.set(r1)
            return
    }

    private static void indent(int r2, com.badlogic.gdx.utils.StringBuilder r3) {
            r0 = 0
        L1:
            if (r0 >= r2) goto Lb
            r1 = 9
            r3.append(r1)
            int r0 = r0 + 1
            goto L1
        Lb:
            return
    }

    private static boolean isFlat(com.badlogic.gdx.utils.JsonValue r1) {
            com.badlogic.gdx.utils.JsonValue r1 = r1.child
        L2:
            if (r1 == 0) goto L16
            boolean r0 = r1.isObject()
            if (r0 != 0) goto L14
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L11
            goto L14
        L11:
            com.badlogic.gdx.utils.JsonValue r1 = r1.next
            goto L2
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    private static boolean isNumeric(com.badlogic.gdx.utils.JsonValue r1) {
            com.badlogic.gdx.utils.JsonValue r1 = r1.child
        L2:
            if (r1 == 0) goto Lf
            boolean r0 = r1.isNumber()
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            com.badlogic.gdx.utils.JsonValue r1 = r1.next
            goto L2
        Lf:
            r1 = 1
            return r1
    }

    private void prettyPrint(com.badlogic.gdx.utils.JsonValue r12, com.badlogic.gdx.utils.StringBuilder r13, int r14, com.badlogic.gdx.utils.JsonValue.PrettyPrintSettings r15) {
            r11 = this;
            com.badlogic.gdx.utils.JsonWriter$OutputType r0 = r15.outputType
            boolean r1 = r12.isObject()
            r2 = 10
            r3 = 32
            r4 = 44
            r5 = 1
            if (r1 == 0) goto L80
            com.badlogic.gdx.utils.JsonValue r1 = r12.child
            if (r1 != 0) goto L1a
            java.lang.String r12 = "{}"
            r13.append(r12)
            goto L149
        L1a:
            boolean r1 = isFlat(r12)
            r1 = r1 ^ r5
            int r6 = r13.length()
        L23:
            if (r1 == 0) goto L28
            java.lang.String r7 = "{\n"
            goto L2a
        L28:
            java.lang.String r7 = "{ "
        L2a:
            r13.append(r7)
            com.badlogic.gdx.utils.JsonValue r7 = r12.child
        L2f:
            if (r7 == 0) goto L73
            if (r1 == 0) goto L36
            indent(r14, r13)
        L36:
            java.lang.String r8 = r7.name
            java.lang.String r8 = r0.quoteName(r8)
            r13.append(r8)
            java.lang.String r8 = ": "
            r13.append(r8)
            int r8 = r14 + 1
            r11.prettyPrint(r7, r13, r8, r15)
            if (r1 == 0) goto L4f
            com.badlogic.gdx.utils.JsonWriter$OutputType r8 = com.badlogic.gdx.utils.JsonWriter$OutputType.minimal
            if (r0 == r8) goto L56
        L4f:
            com.badlogic.gdx.utils.JsonValue r8 = r7.next
            if (r8 == 0) goto L56
            r13.append(r4)
        L56:
            if (r1 == 0) goto L5b
            r8 = 10
            goto L5d
        L5b:
            r8 = 32
        L5d:
            r13.append(r8)
            if (r1 != 0) goto L70
            int r8 = r13.length()
            int r8 = r8 - r6
            int r9 = r15.singleLineColumns
            if (r8 <= r9) goto L70
            r13.setLength(r6)
            r1 = 1
            goto L23
        L70:
            com.badlogic.gdx.utils.JsonValue r7 = r7.next
            goto L2f
        L73:
            if (r1 == 0) goto L79
            int r14 = r14 - r5
            indent(r14, r13)
        L79:
            r12 = 125(0x7d, float:1.75E-43)
            r13.append(r12)
            goto L149
        L80:
            boolean r1 = r12.isArray()
            if (r1 == 0) goto Lf8
            com.badlogic.gdx.utils.JsonValue r1 = r12.child
            if (r1 != 0) goto L91
            java.lang.String r12 = "[]"
            r13.append(r12)
            goto L149
        L91:
            boolean r1 = isFlat(r12)
            r1 = r1 ^ r5
            boolean r6 = r15.wrapNumericArrays
            if (r6 != 0) goto La3
            boolean r6 = isNumeric(r12)
            if (r6 != 0) goto La1
            goto La3
        La1:
            r6 = 0
            goto La4
        La3:
            r6 = 1
        La4:
            int r7 = r13.length()
        La8:
            if (r1 == 0) goto Lad
            java.lang.String r8 = "[\n"
            goto Laf
        Lad:
            java.lang.String r8 = "[ "
        Laf:
            r13.append(r8)
            com.badlogic.gdx.utils.JsonValue r8 = r12.child
        Lb4:
            if (r8 == 0) goto Lec
            if (r1 == 0) goto Lbb
            indent(r14, r13)
        Lbb:
            int r9 = r14 + 1
            r11.prettyPrint(r8, r13, r9, r15)
            if (r1 == 0) goto Lc6
            com.badlogic.gdx.utils.JsonWriter$OutputType r9 = com.badlogic.gdx.utils.JsonWriter$OutputType.minimal
            if (r0 == r9) goto Lcd
        Lc6:
            com.badlogic.gdx.utils.JsonValue r9 = r8.next
            if (r9 == 0) goto Lcd
            r13.append(r4)
        Lcd:
            if (r1 == 0) goto Ld2
            r9 = 10
            goto Ld4
        Ld2:
            r9 = 32
        Ld4:
            r13.append(r9)
            if (r6 == 0) goto Le9
            if (r1 != 0) goto Le9
            int r9 = r13.length()
            int r9 = r9 - r7
            int r10 = r15.singleLineColumns
            if (r9 <= r10) goto Le9
            r13.setLength(r7)
            r1 = 1
            goto La8
        Le9:
            com.badlogic.gdx.utils.JsonValue r8 = r8.next
            goto Lb4
        Lec:
            if (r1 == 0) goto Lf2
            int r14 = r14 - r5
            indent(r14, r13)
        Lf2:
            r12 = 93
            r13.append(r12)
            goto L149
        Lf8:
            boolean r14 = r12.isString()
            if (r14 == 0) goto L10a
            java.lang.String r12 = r12.asString()
            java.lang.String r12 = r0.quoteValue(r12)
            r13.append(r12)
            goto L149
        L10a:
            boolean r14 = r12.isDouble()
            if (r14 == 0) goto L122
            double r14 = r12.asDouble()
            long r0 = r12.asLong()
            double r0 = (double) r0
            int r12 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r12 != 0) goto L11e
            r14 = r0
        L11e:
            r13.append(r14)
            goto L149
        L122:
            boolean r14 = r12.isLong()
            if (r14 == 0) goto L130
            long r14 = r12.asLong()
            r13.append(r14)
            goto L149
        L130:
            boolean r14 = r12.isBoolean()
            if (r14 == 0) goto L13e
            boolean r12 = r12.asBoolean()
            r13.append(r12)
            goto L149
        L13e:
            boolean r14 = r12.isNull()
            if (r14 == 0) goto L14a
            java.lang.String r12 = "null"
            r13.append(r12)
        L149:
            return
        L14a:
            com.badlogic.gdx.utils.SerializationException r13 = new com.badlogic.gdx.utils.SerializationException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Unknown object type: "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
    }

    public boolean asBoolean() {
            r8 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r8.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L4f
            r2 = 2
            r3 = 0
            if (r0 == r2) goto L44
            r2 = 3
            r4 = 0
            if (r0 == r2) goto L3b
            r2 = 4
            if (r0 != r2) goto L22
            long r6 = r8.longValue
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value cannot be converted to boolean: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r8.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3b:
            long r6 = r8.longValue
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            return r1
        L44:
            double r4 = r8.doubleValue
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L4d
            goto L4e
        L4d:
            r1 = 0
        L4e:
            return r1
        L4f:
            java.lang.String r0 = r8.stringValue
            java.lang.String r1 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public byte asByte() {
            r6 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r6.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L44
            r2 = 2
            if (r0 == r2) goto L3f
            r2 = 3
            if (r0 == r2) goto L3a
            r2 = 4
            if (r0 != r2) goto L21
            long r2 = r6.longValue
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value cannot be converted to byte: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r6.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3a:
            long r0 = r6.longValue
            int r1 = (int) r0
            byte r0 = (byte) r1
            return r0
        L3f:
            double r0 = r6.doubleValue
            int r0 = (int) r0
            byte r0 = (byte) r0
            return r0
        L44:
            java.lang.String r0 = r6.stringValue
            byte r0 = java.lang.Byte.parseByte(r0)
            return r0
    }

    public double asDouble() {
            r5 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r5.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L44
            r1 = 2
            if (r0 == r1) goto L41
            r1 = 3
            if (r0 == r1) goto L3d
            r1 = 4
            if (r0 != r1) goto L24
            long r0 = r5.longValue
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L23
        L21:
            r0 = 0
        L23:
            return r0
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value cannot be converted to double: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3d:
            long r0 = r5.longValue
            double r0 = (double) r0
            return r0
        L41:
            double r0 = r5.doubleValue
            return r0
        L44:
            java.lang.String r0 = r5.stringValue
            double r0 = java.lang.Double.parseDouble(r0)
            return r0
    }

    public float asFloat() {
            r5 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r5.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L44
            r1 = 2
            if (r0 == r1) goto L40
            r1 = 3
            if (r0 == r1) goto L3c
            r1 = 4
            if (r0 != r1) goto L23
            long r0 = r5.longValue
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value cannot be converted to float: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3c:
            long r0 = r5.longValue
            float r0 = (float) r0
            return r0
        L40:
            double r0 = r5.doubleValue
            float r0 = (float) r0
            return r0
        L44:
            java.lang.String r0 = r5.stringValue
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public float[] asFloatArray() {
            r9 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r9.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            if (r0 != r1) goto L60
            int r0 = r9.size
            float[] r0 = new float[r0]
            r1 = 0
            com.badlogic.gdx.utils.JsonValue r2 = r9.child
        Ld:
            if (r2 == 0) goto L5f
            int[] r3 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r4 = r2.type
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L53
            r5 = 2
            if (r3 == r5) goto L4f
            r5 = 3
            if (r3 == r5) goto L4b
            r5 = 4
            if (r3 != r5) goto L32
            long r5 = r2.longValue
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L30
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L59
        L30:
            r3 = 0
            goto L59
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Value cannot be converted to float: "
            r1.append(r3)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r2.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4b:
            long r5 = r2.longValue
            float r3 = (float) r5
            goto L59
        L4f:
            double r5 = r2.doubleValue
            float r3 = (float) r5
            goto L59
        L53:
            java.lang.String r3 = r2.stringValue
            float r3 = java.lang.Float.parseFloat(r3)
        L59:
            r0[r1] = r3
            com.badlogic.gdx.utils.JsonValue r2 = r2.next
            int r1 = r1 + r4
            goto Ld
        L5f:
            return r0
        L60:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value is not an array: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r9.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public int asInt() {
            r6 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r6.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L42
            r2 = 2
            if (r0 == r2) goto L3e
            r2 = 3
            if (r0 == r2) goto L3a
            r2 = 4
            if (r0 != r2) goto L21
            long r2 = r6.longValue
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value cannot be converted to int: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r6.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3a:
            long r0 = r6.longValue
            int r1 = (int) r0
            return r1
        L3e:
            double r0 = r6.doubleValue
            int r0 = (int) r0
            return r0
        L42:
            java.lang.String r0 = r6.stringValue
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
    }

    public long asLong() {
            r5 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r5.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L41
            r1 = 2
            if (r0 == r1) goto L3d
            r1 = 3
            if (r0 == r1) goto L3a
            r1 = 4
            if (r0 != r1) goto L21
            long r0 = r5.longValue
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L20
            r2 = 1
        L20:
            return r2
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value cannot be converted to long: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3a:
            long r0 = r5.longValue
            return r0
        L3d:
            double r0 = r5.doubleValue
            long r0 = (long) r0
            return r0
        L41:
            java.lang.String r0 = r5.stringValue
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public short asShort() {
            r6 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r6.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L44
            r2 = 2
            if (r0 == r2) goto L3f
            r2 = 3
            if (r0 == r2) goto L3a
            r2 = 4
            if (r0 != r2) goto L21
            long r2 = r6.longValue
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value cannot be converted to short: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r6.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3a:
            long r0 = r6.longValue
            int r1 = (int) r0
            short r0 = (short) r1
            return r0
        L3f:
            double r0 = r6.doubleValue
            int r0 = (int) r0
            short r0 = (short) r0
            return r0
        L44:
            java.lang.String r0 = r6.stringValue
            short r0 = java.lang.Short.parseShort(r0)
            return r0
    }

    public short[] asShortArray() {
            r10 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r10.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            if (r0 != r1) goto L61
            int r0 = r10.size
            short[] r0 = new short[r0]
            com.badlogic.gdx.utils.JsonValue r1 = r10.child
            r2 = 0
            r3 = 0
        Le:
            if (r1 == 0) goto L60
            int[] r4 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r5 = r1.type
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 1
            if (r4 == r5) goto L54
            r6 = 2
            if (r4 == r6) goto L4f
            r6 = 3
            if (r4 == r6) goto L4b
            r6 = 4
            if (r4 != r6) goto L32
            long r6 = r1.longValue
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L30
            r4 = 1
            goto L5a
        L30:
            r4 = 0
            goto L5a
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Value cannot be converted to short: "
            r2.append(r3)
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r1.type
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L4b:
            long r6 = r1.longValue
            int r4 = (int) r6
            goto L52
        L4f:
            double r6 = r1.doubleValue
            int r4 = (int) r6
        L52:
            short r4 = (short) r4
            goto L5a
        L54:
            java.lang.String r4 = r1.stringValue
            short r4 = java.lang.Short.parseShort(r4)
        L5a:
            r0[r3] = r4
            com.badlogic.gdx.utils.JsonValue r1 = r1.next
            int r3 = r3 + r5
            goto Le
        L60:
            return r0
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value is not an array: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r10.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String asString() {
            r5 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r5.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L5a
            r1 = 2
            if (r0 == r1) goto L4e
            r1 = 3
            if (r0 == r1) goto L42
            r1 = 4
            if (r0 == r1) goto L34
            r1 = 5
            if (r0 != r1) goto L1b
            r0 = 0
            return r0
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value cannot be converted to string: "
            r1.append(r2)
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L34:
            long r0 = r5.longValue
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3f
            java.lang.String r0 = "true"
            goto L41
        L3f:
            java.lang.String r0 = "false"
        L41:
            return r0
        L42:
            java.lang.String r0 = r5.stringValue
            if (r0 == 0) goto L47
            goto L4d
        L47:
            long r0 = r5.longValue
            java.lang.String r0 = java.lang.Long.toString(r0)
        L4d:
            return r0
        L4e:
            java.lang.String r0 = r5.stringValue
            if (r0 == 0) goto L53
            goto L59
        L53:
            double r0 = r5.doubleValue
            java.lang.String r0 = java.lang.Double.toString(r0)
        L59:
            return r0
        L5a:
            java.lang.String r0 = r5.stringValue
            return r0
    }

    public com.badlogic.gdx.utils.JsonValue get(int r2) {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue r0 = r1.child
        L2:
            if (r0 == 0) goto Lb
            if (r2 <= 0) goto Lb
            int r2 = r2 + (-1)
            com.badlogic.gdx.utils.JsonValue r0 = r0.next
            goto L2
        Lb:
            return r0
    }

    public com.badlogic.gdx.utils.JsonValue get(java.lang.String r3) {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue r0 = r2.child
        L2:
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.name
            if (r1 == 0) goto Le
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 != 0) goto L11
        Le:
            com.badlogic.gdx.utils.JsonValue r0 = r0.next
            goto L2
        L11:
            return r0
    }

    public com.badlogic.gdx.utils.JsonValue getChild(java.lang.String r1) {
            r0 = this;
            com.badlogic.gdx.utils.JsonValue r1 = r0.get(r1)
            if (r1 != 0) goto L8
            r1 = 0
            goto La
        L8:
            com.badlogic.gdx.utils.JsonValue r1 = r1.child
        La:
            return r1
    }

    public float getFloat(int r3) {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue r3 = r2.get(r3)
            if (r3 == 0) goto Lb
            float r3 = r3.asFloat()
            return r3
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Indexed value not found: "
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public float getFloat(java.lang.String r2, float r3) {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue r2 = r1.get(r2)
            if (r2 == 0) goto L17
            boolean r0 = r2.isValue()
            if (r0 == 0) goto L17
            boolean r0 = r2.isNull()
            if (r0 == 0) goto L13
            goto L17
        L13:
            float r3 = r2.asFloat()
        L17:
            return r3
    }

    public short getShort(int r3) {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue r3 = r2.get(r3)
            if (r3 == 0) goto Lb
            short r3 = r3.asShort()
            return r3
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Indexed value not found: "
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public java.lang.String getString(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.utils.JsonValue r0 = r3.get(r4)
            if (r0 == 0) goto Lb
            java.lang.String r4 = r0.asString()
            return r4
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Named value not found: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue r2 = r1.get(r2)
            if (r2 == 0) goto L17
            boolean r0 = r2.isValue()
            if (r0 == 0) goto L17
            boolean r0 = r2.isNull()
            if (r0 == 0) goto L13
            goto L17
        L13:
            java.lang.String r3 = r2.asString()
        L17:
            return r3
    }

    public boolean has(java.lang.String r1) {
            r0 = this;
            com.badlogic.gdx.utils.JsonValue r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isArray() {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r2.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isBoolean() {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r2.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.booleanValue
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isDouble() {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r2.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.doubleValue
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isLong() {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r2.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.longValue
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isNull() {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r2.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.nullValue
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isNumber() {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r2.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.doubleValue
            if (r0 == r1) goto Ld
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.longValue
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public boolean isObject() {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r2.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.object
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isString() {
            r2 = this;
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r2.type
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.stringValue
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isValue() {
            r3 = this;
            int[] r0 = com.badlogic.gdx.utils.JsonValue.AnonymousClass1.$SwitchMap$com$badlogic$gdx$utils$JsonValue$ValueType
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = r3.type
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L1b
            r2 = 2
            if (r0 == r2) goto L1b
            r2 = 3
            if (r0 == r2) goto L1b
            r2 = 4
            if (r0 == r2) goto L1b
            r2 = 5
            if (r0 == r2) goto L1b
            r0 = 0
            return r0
        L1b:
            return r1
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<com.badlogic.gdx.utils.JsonValue> iterator() {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue$JsonIterator r0 = new com.badlogic.gdx.utils.JsonValue$JsonIterator
            r0.<init>(r1)
            return r0
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.util.Iterator<com.badlogic.gdx.utils.JsonValue> iterator2() {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue$JsonIterator r0 = r1.iterator()
            return r0
    }

    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String prettyPrint(com.badlogic.gdx.utils.JsonValue.PrettyPrintSettings r3) {
            r2 = this;
            com.badlogic.gdx.utils.StringBuilder r0 = new com.badlogic.gdx.utils.StringBuilder
            r1 = 512(0x200, float:7.175E-43)
            r0.<init>(r1)
            r1 = 0
            r2.prettyPrint(r2, r0, r1, r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public java.lang.String prettyPrint(com.badlogic.gdx.utils.JsonWriter$OutputType r2, int r3) {
            r1 = this;
            com.badlogic.gdx.utils.JsonValue$PrettyPrintSettings r0 = new com.badlogic.gdx.utils.JsonValue$PrettyPrintSettings
            r0.<init>()
            r0.outputType = r2
            r0.singleLineColumns = r3
            java.lang.String r2 = r1.prettyPrint(r0)
            return r2
    }

    public com.badlogic.gdx.utils.JsonValue require(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.utils.JsonValue r0 = r3.get(r4)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child not found with name: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public void set(double r1, java.lang.String r3) {
            r0 = this;
            r0.doubleValue = r1
            long r1 = (long) r1
            r0.longValue = r1
            r0.stringValue = r3
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.doubleValue
            r0.type = r1
            return
    }

    public void set(long r1, java.lang.String r3) {
            r0 = this;
            r0.longValue = r1
            double r1 = (double) r1
            r0.doubleValue = r1
            r0.stringValue = r3
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.longValue
            r0.type = r1
            return
    }

    public void set(java.lang.String r1) {
            r0 = this;
            r0.stringValue = r1
            if (r1 != 0) goto L7
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.nullValue
            goto L9
        L7:
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.stringValue
        L9:
            r0.type = r1
            return
    }

    public void set(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L5
            r0 = 1
            goto L7
        L5:
            r0 = 0
        L7:
            r2.longValue = r0
            com.badlogic.gdx.utils.JsonValue$ValueType r3 = com.badlogic.gdx.utils.JsonValue.ValueType.booleanValue
            r2.type = r3
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.name = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isValue()
            java.lang.String r1 = ": "
            if (r0 == 0) goto L2a
            java.lang.String r0 = r4.name
            if (r0 != 0) goto L11
            java.lang.String r0 = r4.asString()
            goto L29
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r4.name
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r4.asString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L29:
            return r0
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r4.name
            if (r2 != 0) goto L36
            java.lang.String r1 = ""
            goto L47
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.name
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L47:
            r0.append(r1)
            com.badlogic.gdx.utils.JsonWriter$OutputType r1 = com.badlogic.gdx.utils.JsonWriter$OutputType.minimal
            r2 = 0
            java.lang.String r1 = r4.prettyPrint(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String trace() {
            r4 = this;
            com.badlogic.gdx.utils.JsonValue r0 = r4.parent
            java.lang.String r1 = "[]"
            if (r0 != 0) goto L17
            com.badlogic.gdx.utils.JsonValue$ValueType r0 = r4.type
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            if (r0 != r2) goto Ld
            return r1
        Ld:
            com.badlogic.gdx.utils.JsonValue$ValueType r1 = com.badlogic.gdx.utils.JsonValue.ValueType.object
            if (r0 != r1) goto L14
            java.lang.String r0 = "{}"
            return r0
        L14:
            java.lang.String r0 = ""
            return r0
        L17:
            com.badlogic.gdx.utils.JsonValue$ValueType r2 = r0.type
            com.badlogic.gdx.utils.JsonValue$ValueType r3 = com.badlogic.gdx.utils.JsonValue.ValueType.array
            if (r2 != r3) goto L40
            r2 = 0
            com.badlogic.gdx.utils.JsonValue r0 = r0.child
        L20:
            if (r0 == 0) goto L7b
            if (r0 != r4) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L7b
        L3b:
            com.badlogic.gdx.utils.JsonValue r0 = r0.next
            int r2 = r2 + 1
            goto L20
        L40:
            java.lang.String r0 = r4.name
            r1 = 46
            int r0 = r0.indexOf(r1)
            r2 = -1
            if (r0 == r2) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ".\""
            r0.append(r1)
            java.lang.String r1 = r4.name
            java.lang.String r2 = "\""
            java.lang.String r3 = "\\\""
            java.lang.String r1 = r1.replace(r2, r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            goto L7b
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = r4.name
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.badlogic.gdx.utils.JsonValue r2 = r4.parent
            java.lang.String r2 = r2.trace()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
