package androidx.datastore.preferences;

/* loaded from: classes.dex */
public final class PreferencesProto$StringSet extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<androidx.datastore.preferences.PreferencesProto$StringSet, androidx.datastore.preferences.PreferencesProto$StringSet.Builder> implements androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
    private static final androidx.datastore.preferences.PreferencesProto$StringSet DEFAULT_INSTANCE = null;
    private static volatile androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$StringSet> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.Internal.ProtobufList<java.lang.String> strings_;

    public static final class Builder extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<androidx.datastore.preferences.PreferencesProto$StringSet, androidx.datastore.preferences.PreferencesProto$StringSet.Builder> implements androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        private Builder() {
                r1 = this;
                androidx.datastore.preferences.PreferencesProto$StringSet r0 = androidx.datastore.preferences.PreferencesProto$StringSet.access$2300()
                r1.<init>(r0)
                return
        }

        /* synthetic */ Builder(androidx.datastore.preferences.PreferencesProto$1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.datastore.preferences.PreferencesProto$StringSet.Builder addAllStrings(java.lang.Iterable<java.lang.String> r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                androidx.datastore.preferences.PreferencesProto$StringSet r0 = (androidx.datastore.preferences.PreferencesProto$StringSet) r0
                androidx.datastore.preferences.PreferencesProto$StringSet.access$2600(r0, r2)
                return r1
        }
    }

    static {
            androidx.datastore.preferences.PreferencesProto$StringSet r0 = new androidx.datastore.preferences.PreferencesProto$StringSet
            r0.<init>()
            androidx.datastore.preferences.PreferencesProto$StringSet.DEFAULT_INSTANCE = r0
            java.lang.Class<androidx.datastore.preferences.PreferencesProto$StringSet> r1 = androidx.datastore.preferences.PreferencesProto$StringSet.class
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.registerDefaultInstance(r1, r0)
            return
    }

    private PreferencesProto$StringSet() {
            r1 = this;
            r1.<init>()
            androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.emptyProtobufList()
            r1.strings_ = r0
            return
    }

    static /* synthetic */ androidx.datastore.preferences.PreferencesProto$StringSet access$2300() {
            androidx.datastore.preferences.PreferencesProto$StringSet r0 = androidx.datastore.preferences.PreferencesProto$StringSet.DEFAULT_INSTANCE
            return r0
    }

    static /* synthetic */ void access$2600(androidx.datastore.preferences.PreferencesProto$StringSet r0, java.lang.Iterable r1) {
            r0.addAllStrings(r1)
            return
    }

    private void addAllStrings(java.lang.Iterable<java.lang.String> r2) {
            r1 = this;
            r1.ensureStringsIsMutable()
            androidx.datastore.preferences.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.strings_
            androidx.datastore.preferences.protobuf.AbstractMessageLite.addAll(r2, r0)
            return
    }

    private void ensureStringsIsMutable() {
            r1 = this;
            androidx.datastore.preferences.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.strings_
            boolean r0 = r0.isModifiable()
            if (r0 != 0) goto L10
            androidx.datastore.preferences.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.strings_
            androidx.datastore.preferences.protobuf.Internal$ProtobufList r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.mutableCopy(r0)
            r1.strings_ = r0
        L10:
            return
    }

    public static androidx.datastore.preferences.PreferencesProto$StringSet getDefaultInstance() {
            androidx.datastore.preferences.PreferencesProto$StringSet r0 = androidx.datastore.preferences.PreferencesProto$StringSet.DEFAULT_INSTANCE
            return r0
    }

    public static androidx.datastore.preferences.PreferencesProto$StringSet.Builder newBuilder() {
            androidx.datastore.preferences.PreferencesProto$StringSet r0 = androidx.datastore.preferences.PreferencesProto$StringSet.DEFAULT_INSTANCE
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = r0.createBuilder()
            androidx.datastore.preferences.PreferencesProto$StringSet$Builder r0 = (androidx.datastore.preferences.PreferencesProto$StringSet.Builder) r0
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    protected final java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int[] r2 = androidx.datastore.preferences.PreferencesProto$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            r3 = 0
            switch(r1) {
                case 1: goto L4c;
                case 2: goto L46;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L19;
                case 6: goto L14;
                case 7: goto L13;
                default: goto Ld;
            }
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        L13:
            return r3
        L14:
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            return r1
        L19:
            androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$StringSet> r1 = androidx.datastore.preferences.PreferencesProto$StringSet.PARSER
            if (r1 != 0) goto L32
            java.lang.Class<androidx.datastore.preferences.PreferencesProto$StringSet> r2 = androidx.datastore.preferences.PreferencesProto$StringSet.class
            monitor-enter(r2)
            androidx.datastore.preferences.protobuf.Parser<androidx.datastore.preferences.PreferencesProto$StringSet> r1 = androidx.datastore.preferences.PreferencesProto$StringSet.PARSER     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L2d
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser r1 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser     // Catch: java.lang.Throwable -> L2f
            androidx.datastore.preferences.PreferencesProto$StringSet r3 = androidx.datastore.preferences.PreferencesProto$StringSet.DEFAULT_INSTANCE     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            androidx.datastore.preferences.PreferencesProto$StringSet.PARSER = r1     // Catch: java.lang.Throwable -> L2f
        L2d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r1
        L32:
            return r1
        L33:
            androidx.datastore.preferences.PreferencesProto$StringSet r1 = androidx.datastore.preferences.PreferencesProto$StringSet.DEFAULT_INSTANCE
            return r1
        L36:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            java.lang.String r3 = "strings_"
            r1[r2] = r3
            java.lang.String r2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            androidx.datastore.preferences.PreferencesProto$StringSet r3 = androidx.datastore.preferences.PreferencesProto$StringSet.DEFAULT_INSTANCE
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.newMessageInfo(r3, r2, r1)
            return r1
        L46:
            androidx.datastore.preferences.PreferencesProto$StringSet$Builder r1 = new androidx.datastore.preferences.PreferencesProto$StringSet$Builder
            r1.<init>(r3)
            return r1
        L4c:
            androidx.datastore.preferences.PreferencesProto$StringSet r1 = new androidx.datastore.preferences.PreferencesProto$StringSet
            r1.<init>()
            return r1
    }

    public java.util.List<java.lang.String> getStringsList() {
            r1 = this;
            androidx.datastore.preferences.protobuf.Internal$ProtobufList<java.lang.String> r0 = r1.strings_
            return r0
    }
}
