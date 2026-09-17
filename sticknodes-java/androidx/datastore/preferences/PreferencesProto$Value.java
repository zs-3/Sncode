package androidx.datastore.preferences;

/* loaded from: classes.dex */
public final class PreferencesProto$Value extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto$Value, androidx.datastore.preferences.PreferencesProto$Value.Builder> implements androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final androidx.datastore.preferences.PreferencesProto$Value DEFAULT_INSTANCE = null;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_;
    private java.lang.Object value_;

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto$Value, androidx.datastore.preferences.PreferencesProto$Value.Builder> implements androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        private Builder() {
                r1 = this;
                androidx.datastore.preferences.PreferencesProto$Value r0 = androidx.datastore.preferences.PreferencesProto$Value.access$300()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(androidx.datastore.preferences.PreferencesProto$1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.datastore.preferences.PreferencesProto$Value.Builder setBoolean(boolean r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$Value r0 = (androidx.datastore.preferences.PreferencesProto$Value) r0
                androidx.datastore.preferences.PreferencesProto$Value.access$500(r0, r2)
                return r1
        }

        public androidx.datastore.preferences.PreferencesProto$Value.Builder setDouble(double r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$Value r0 = (androidx.datastore.preferences.PreferencesProto$Value) r0
                androidx.datastore.preferences.PreferencesProto$Value.access$2000(r0, r2)
                return r1
        }

        public androidx.datastore.preferences.PreferencesProto$Value.Builder setFloat(float r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$Value r0 = (androidx.datastore.preferences.PreferencesProto$Value) r0
                androidx.datastore.preferences.PreferencesProto$Value.access$700(r0, r2)
                return r1
        }

        public androidx.datastore.preferences.PreferencesProto$Value.Builder setInteger(int r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$Value r0 = (androidx.datastore.preferences.PreferencesProto$Value) r0
                androidx.datastore.preferences.PreferencesProto$Value.access$900(r0, r2)
                return r1
        }

        public androidx.datastore.preferences.PreferencesProto$Value.Builder setLong(long r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$Value r0 = (androidx.datastore.preferences.PreferencesProto$Value) r0
                androidx.datastore.preferences.PreferencesProto$Value.access$1100(r0, r2)
                return r1
        }

        public androidx.datastore.preferences.PreferencesProto$Value.Builder setString(java.lang.String r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$Value r0 = (androidx.datastore.preferences.PreferencesProto$Value) r0
                androidx.datastore.preferences.PreferencesProto$Value.access$1300(r0, r2)
                return r1
        }

        public androidx.datastore.preferences.PreferencesProto$Value.Builder setStringSet(androidx.datastore.preferences.PreferencesProto$StringSet.Builder r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$Value r0 = (androidx.datastore.preferences.PreferencesProto$Value) r0
                androidx.datastore.preferences.PreferencesProto$Value.access$1700(r0, r2)
                return r1
        }
    }

    public enum ValueCase extends java.lang.Enum<androidx.datastore.preferences.PreferencesProto$Value.ValueCase> {
        private static final /* synthetic */ androidx.datastore.preferences.PreferencesProto$Value.ValueCase[] $VALUES = null;
        public static final androidx.datastore.preferences.PreferencesProto$Value.ValueCase BOOLEAN = null;
        public static final androidx.datastore.preferences.PreferencesProto$Value.ValueCase DOUBLE = null;
        public static final androidx.datastore.preferences.PreferencesProto$Value.ValueCase FLOAT = null;
        public static final androidx.datastore.preferences.PreferencesProto$Value.ValueCase INTEGER = null;
        public static final androidx.datastore.preferences.PreferencesProto$Value.ValueCase LONG = null;
        public static final androidx.datastore.preferences.PreferencesProto$Value.ValueCase STRING = null;
        public static final androidx.datastore.preferences.PreferencesProto$Value.ValueCase STRING_SET = null;
        public static final androidx.datastore.preferences.PreferencesProto$Value.ValueCase VALUE_NOT_SET = null;
        private final int value;

        static {
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = new androidx.datastore.preferences.PreferencesProto$Value$ValueCase
                java.lang.String r1 = "BOOLEAN"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.BOOLEAN = r0
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = new androidx.datastore.preferences.PreferencesProto$Value$ValueCase
                java.lang.String r4 = "FLOAT"
                r5 = 2
                r1.<init>(r4, r3, r5)
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.FLOAT = r1
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r4 = new androidx.datastore.preferences.PreferencesProto$Value$ValueCase
                java.lang.String r6 = "INTEGER"
                r7 = 3
                r4.<init>(r6, r5, r7)
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.INTEGER = r4
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r6 = new androidx.datastore.preferences.PreferencesProto$Value$ValueCase
                java.lang.String r8 = "LONG"
                r9 = 4
                r6.<init>(r8, r7, r9)
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.LONG = r6
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r8 = new androidx.datastore.preferences.PreferencesProto$Value$ValueCase
                java.lang.String r10 = "STRING"
                r11 = 5
                r8.<init>(r10, r9, r11)
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.STRING = r8
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r10 = new androidx.datastore.preferences.PreferencesProto$Value$ValueCase
                java.lang.String r12 = "STRING_SET"
                r13 = 6
                r10.<init>(r12, r11, r13)
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.STRING_SET = r10
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r12 = new androidx.datastore.preferences.PreferencesProto$Value$ValueCase
                java.lang.String r14 = "DOUBLE"
                r15 = 7
                r12.<init>(r14, r13, r15)
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.DOUBLE = r12
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r14 = new androidx.datastore.preferences.PreferencesProto$Value$ValueCase
                java.lang.String r13 = "VALUE_NOT_SET"
                r14.<init>(r13, r15, r2)
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.VALUE_NOT_SET = r14
                r13 = 8
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase[] r13 = new androidx.datastore.preferences.PreferencesProto$Value.ValueCase[r13]
                r13[r2] = r0
                r13[r3] = r1
                r13[r5] = r4
                r13[r7] = r6
                r13[r9] = r8
                r13[r11] = r10
                r0 = 6
                r13[r0] = r12
                r13[r15] = r14
                androidx.datastore.preferences.PreferencesProto$Value.ValueCase.$VALUES = r13
                return
        }

        ValueCase(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static androidx.datastore.preferences.PreferencesProto$Value.ValueCase forNumber(int r0) {
                switch(r0) {
                    case 0: goto L1a;
                    case 1: goto L17;
                    case 2: goto L14;
                    case 3: goto L11;
                    case 4: goto Le;
                    case 5: goto Lb;
                    case 6: goto L8;
                    case 7: goto L5;
                    default: goto L3;
                }
            L3:
                r0 = 0
                return r0
            L5:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.DOUBLE
                return r0
            L8:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.STRING_SET
                return r0
            Lb:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.STRING
                return r0
            Le:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.LONG
                return r0
            L11:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.INTEGER
                return r0
            L14:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.FLOAT
                return r0
            L17:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.BOOLEAN
                return r0
            L1a:
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.VALUE_NOT_SET
                return r0
        }

        public static androidx.datastore.preferences.PreferencesProto$Value.ValueCase valueOf(java.lang.String r1) {
                java.lang.Class<androidx.datastore.preferences.PreferencesProto$Value$ValueCase> r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = (androidx.datastore.preferences.PreferencesProto$Value.ValueCase) r1
                return r1
        }

        public static androidx.datastore.preferences.PreferencesProto$Value.ValueCase[] values() {
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase[] r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase[] r0 = (androidx.datastore.preferences.PreferencesProto$Value.ValueCase[]) r0
                return r0
        }
    }

    static {
            androidx.datastore.preferences.PreferencesProto$Value r0 = new androidx.datastore.preferences.PreferencesProto$Value
            r0.<init>()
            androidx.datastore.preferences.PreferencesProto$Value.DEFAULT_INSTANCE = r0
            java.lang.Class<androidx.datastore.preferences.PreferencesProto$Value> r1 = androidx.datastore.preferences.PreferencesProto$Value.class
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private PreferencesProto$Value() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.valueCase_ = r0
            return
    }

    static /* synthetic */ void access$1100(androidx.datastore.preferences.PreferencesProto$Value r0, long r1) {
            r0.setLong(r1)
            return
    }

    static /* synthetic */ void access$1300(androidx.datastore.preferences.PreferencesProto$Value r0, java.lang.String r1) {
            r0.setString(r1)
            return
    }

    static /* synthetic */ void access$1700(androidx.datastore.preferences.PreferencesProto$Value r0, androidx.datastore.preferences.PreferencesProto$StringSet.Builder r1) {
            r0.setStringSet(r1)
            return
    }

    static /* synthetic */ void access$2000(androidx.datastore.preferences.PreferencesProto$Value r0, double r1) {
            r0.setDouble(r1)
            return
    }

    static /* synthetic */ androidx.datastore.preferences.PreferencesProto$Value access$300() {
            androidx.datastore.preferences.PreferencesProto$Value r0 = androidx.datastore.preferences.PreferencesProto$Value.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$500(androidx.datastore.preferences.PreferencesProto$Value r0, boolean r1) {
            r0.setBoolean(r1)
            return
    }

    static /* synthetic */ void access$700(androidx.datastore.preferences.PreferencesProto$Value r0, float r1) {
            r0.setFloat(r1)
            return
    }

    static /* synthetic */ void access$900(androidx.datastore.preferences.PreferencesProto$Value r0, int r1) {
            r0.setInteger(r1)
            return
    }

    public static androidx.datastore.preferences.PreferencesProto$Value getDefaultInstance() {
            androidx.datastore.preferences.PreferencesProto$Value r0 = androidx.datastore.preferences.PreferencesProto$Value.DEFAULT_INSTANCE
            return r0
    }

    public static androidx.datastore.preferences.PreferencesProto$Value.Builder newBuilder() {
            androidx.datastore.preferences.PreferencesProto$Value r0 = androidx.datastore.preferences.PreferencesProto$Value.DEFAULT_INSTANCE
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            androidx.datastore.preferences.PreferencesProto$Value$Builder r0 = (androidx.datastore.preferences.PreferencesProto$Value.Builder) r0
            return r0
    }

    private void setBoolean(boolean r2) {
            r1 = this;
            r0 = 1
            r1.valueCase_ = r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.value_ = r2
            return
    }

    private void setDouble(double r2) {
            r1 = this;
            r0 = 7
            r1.valueCase_ = r0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r1.value_ = r2
            return
    }

    private void setFloat(float r2) {
            r1 = this;
            r0 = 2
            r1.valueCase_ = r0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.value_ = r2
            return
    }

    private void setInteger(int r2) {
            r1 = this;
            r0 = 3
            r1.valueCase_ = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.value_ = r2
            return
    }

    private void setLong(long r2) {
            r1 = this;
            r0 = 4
            r1.valueCase_ = r0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.value_ = r2
            return
    }

    private void setString(java.lang.String r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            r0 = 5
            r1.valueCase_ = r0
            r1.value_ = r2
            return
    }

    private void setStringSet(androidx.datastore.preferences.PreferencesProto$StringSet.Builder r1) {
            r0 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = r1.build()
            r0.value_ = r1
            r1 = 6
            r0.valueCase_ = r1
            return
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int[] r3 = androidx.datastore.preferences.PreferencesProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            r4 = 0
            switch(r2) {
                case 1: goto L5b;
                case 2: goto L55;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L14;
                case 7: goto L13;
                default: goto Ld;
            }
        Ld:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
        L13:
            return r4
        L14:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r3)
            return r2
        L19:
            androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$Value> r2 = androidx.datastore.preferences.PreferencesProto$Value.PARSER
            if (r2 != 0) goto L32
            java.lang.Class<androidx.datastore.preferences.PreferencesProto$Value> r3 = androidx.datastore.preferences.PreferencesProto$Value.class
            monitor-enter(r3)
            androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$Value> r2 = androidx.datastore.preferences.PreferencesProto$Value.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L2d
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            androidx.datastore.preferences.PreferencesProto$Value r4 = androidx.datastore.preferences.PreferencesProto$Value.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            androidx.datastore.preferences.PreferencesProto$Value.PARSER = r2     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r2
        L32:
            return r2
        L33:
            androidx.datastore.preferences.PreferencesProto$Value r2 = androidx.datastore.preferences.PreferencesProto$Value.DEFAULT_INSTANCE
            return r2
        L36:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "value_"
            r2[r4] = r0
            java.lang.String r4 = "valueCase_"
            r2[r3] = r4
            r3 = 2
            java.lang.String r4 = "bitField0_"
            r2[r3] = r4
            r3 = 3
            java.lang.Class<androidx.datastore.preferences.PreferencesProto$StringSet> r4 = androidx.datastore.preferences.PreferencesProto$StringSet.class
            r2[r3] = r4
            java.lang.String r3 = "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000"
            androidx.datastore.preferences.PreferencesProto$Value r4 = androidx.datastore.preferences.PreferencesProto$Value.DEFAULT_INSTANCE
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.newMessageInfo(r4, r3, r2)
            return r2
        L55:
            androidx.datastore.preferences.PreferencesProto$Value$Builder r2 = new androidx.datastore.preferences.PreferencesProto$Value$Builder
            r2.<init>(r4)
            return r2
        L5b:
            androidx.datastore.preferences.PreferencesProto$Value r2 = new androidx.datastore.preferences.PreferencesProto$Value
            r2.<init>()
            return r2
    }

    public boolean getBoolean() {
            r2 = this;
            int r0 = r2.valueCase_
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.value_
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public double getDouble() {
            r2 = this;
            int r0 = r2.valueCase_
            r1 = 7
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.value_
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public float getFloat() {
            r2 = this;
            int r0 = r2.valueCase_
            r1 = 2
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.value_
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public int getInteger() {
            r2 = this;
            int r0 = r2.valueCase_
            r1 = 3
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.value_
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public long getLong() {
            r2 = this;
            int r0 = r2.valueCase_
            r1 = 4
            if (r0 != r1) goto Le
            java.lang.Object r0 = r2.value_
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public java.lang.String getString() {
            r2 = this;
            int r0 = r2.valueCase_
            r1 = 5
            if (r0 != r1) goto La
            java.lang.Object r0 = r2.value_
            java.lang.String r0 = (java.lang.String) r0
            goto Lc
        La:
            java.lang.String r0 = ""
        Lc:
            return r0
    }

    public androidx.datastore.preferences.PreferencesProto$StringSet getStringSet() {
            r2 = this;
            int r0 = r2.valueCase_
            r1 = 6
            if (r0 != r1) goto La
            java.lang.Object r0 = r2.value_
            androidx.datastore.preferences.PreferencesProto$StringSet r0 = (androidx.datastore.preferences.PreferencesProto$StringSet) r0
            return r0
        La:
            androidx.datastore.preferences.PreferencesProto$StringSet r0 = androidx.datastore.preferences.PreferencesProto$StringSet.getDefaultInstance()
            return r0
    }

    public androidx.datastore.preferences.PreferencesProto$Value.ValueCase getValueCase() {
            r1 = this;
            int r0 = r1.valueCase_
            androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.forNumber(r0)
            return r0
    }
}
