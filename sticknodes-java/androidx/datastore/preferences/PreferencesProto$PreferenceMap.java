package androidx.datastore.preferences;

/* loaded from: classes.dex */
public final class PreferencesProto$PreferenceMap extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto$PreferenceMap, androidx.datastore.preferences.PreferencesProto$PreferenceMap.Builder> implements androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    private static final androidx.datastore.preferences.PreferencesProto$PreferenceMap DEFAULT_INSTANCE = null;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$PreferenceMap> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> preferences_;

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto$PreferenceMap, androidx.datastore.preferences.PreferencesProto$PreferenceMap.Builder> implements androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        private Builder() {
                r1 = this;
                androidx.datastore.preferences.PreferencesProto$PreferenceMap r0 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.access$000()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(androidx.datastore.preferences.PreferencesProto$1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.datastore.preferences.PreferencesProto$PreferenceMap.Builder putPreferences(java.lang.String r2, androidx.datastore.preferences.PreferencesProto$Value r3) {
                r1 = this;
                java.util.Objects.requireNonNull(r2)
                java.util.Objects.requireNonNull(r3)
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$PreferenceMap r0 = (androidx.datastore.preferences.PreferencesProto$PreferenceMap) r0
                java.util.Map r0 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.access$100(r0)
                r0.put(r2, r3)
                return r1
        }
    }

    private static final class PreferencesDefaultEntryHolder {
        static final androidx.datastore.preferences.protobuf.MapEntryLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> defaultEntry = null;

        static {
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE
                androidx.datastore.preferences.PreferencesProto$Value r2 = androidx.datastore.preferences.PreferencesProto$Value.getDefaultInstance()
                java.lang.String r3 = ""
                androidx.datastore.preferences.protobuf.MapEntryLite r0 = androidx.datastore.preferences.protobuf.MapEntryLite.newDefaultInstance(r0, r3, r1, r2)
                androidx.datastore.preferences.PreferencesProto$PreferenceMap.PreferencesDefaultEntryHolder.defaultEntry = r0
                return
        }
    }

    static {
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r0 = new androidx.datastore.preferences.PreferencesProto$PreferenceMap
            r0.<init>()
            androidx.datastore.preferences.PreferencesProto$PreferenceMap.DEFAULT_INSTANCE = r0
            java.lang.Class<androidx.datastore.preferences.PreferencesProto$PreferenceMap> r1 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.class
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private PreferencesProto$PreferenceMap() {
            r1 = this;
            r1.<init>()
            androidx.datastore.preferences.protobuf.MapFieldLite r0 = androidx.datastore.preferences.protobuf.MapFieldLite.emptyMapField()
            r1.preferences_ = r0
            return
    }

    static /* synthetic */ androidx.datastore.preferences.PreferencesProto$PreferenceMap access$000() {
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r0 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ java.util.Map access$100(androidx.datastore.preferences.PreferencesProto$PreferenceMap r0) {
            java.util.Map r0 = r0.getMutablePreferencesMap()
            return r0
    }

    private java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> getMutablePreferencesMap() {
            r1 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite r0 = r1.internalGetMutablePreferences()
            return r0
    }

    private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> internalGetMutablePreferences() {
            r1 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> r0 = r1.preferences_
            boolean r0 = r0.isMutable()
            if (r0 != 0) goto L10
            androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> r0 = r1.preferences_
            androidx.datastore.preferences.protobuf.MapFieldLite r0 = r0.mutableCopy()
            r1.preferences_ = r0
        L10:
            androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> r0 = r1.preferences_
            return r0
    }

    private androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> internalGetPreferences() {
            r1 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> r0 = r1.preferences_
            return r0
    }

    public static androidx.datastore.preferences.PreferencesProto$PreferenceMap.Builder newBuilder() {
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r0 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.DEFAULT_INSTANCE
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            androidx.datastore.preferences.PreferencesProto$PreferenceMap$Builder r0 = (androidx.datastore.preferences.PreferencesProto$PreferenceMap.Builder) r0
            return r0
    }

    public static androidx.datastore.preferences.PreferencesProto$PreferenceMap parseFrom(java.io.InputStream r1) throws java.io.IOException {
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r0 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.DEFAULT_INSTANCE
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.parseFrom(r0, r1)
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r1 = (androidx.datastore.preferences.PreferencesProto$PreferenceMap) r1
            return r1
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
                case 1: goto L51;
                case 2: goto L4b;
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
            androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$PreferenceMap> r2 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.PARSER
            if (r2 != 0) goto L32
            java.lang.Class<androidx.datastore.preferences.PreferencesProto$PreferenceMap> r3 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.class
            monitor-enter(r3)
            androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$PreferenceMap> r2 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L2d
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r2 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r4 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            androidx.datastore.preferences.PreferencesProto$PreferenceMap.PARSER = r2     // Catch: java.lang.Throwable -> L2f
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
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r2 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.DEFAULT_INSTANCE
            return r2
        L36:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r0 = "preferences_"
            r2[r4] = r0
            androidx.datastore.preferences.protobuf.MapEntryLite<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> r4 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.PreferencesDefaultEntryHolder.defaultEntry
            r2[r3] = r4
            java.lang.String r3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r4 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.DEFAULT_INSTANCE
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.newMessageInfo(r4, r3, r2)
            return r2
        L4b:
            androidx.datastore.preferences.PreferencesProto$PreferenceMap$Builder r2 = new androidx.datastore.preferences.PreferencesProto$PreferenceMap$Builder
            r2.<init>(r4)
            return r2
        L51:
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r2 = new androidx.datastore.preferences.PreferencesProto$PreferenceMap
            r2.<init>()
            return r2
    }

    public java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto$Value> getPreferencesMap() {
            r1 = this;
            androidx.datastore.preferences.protobuf.MapFieldLite r0 = r1.internalGetPreferences()
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }
}
