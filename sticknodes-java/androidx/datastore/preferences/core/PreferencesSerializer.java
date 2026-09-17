package androidx.datastore.preferences.core;

/* compiled from: PreferencesSerializer.kt */
/* loaded from: classes.dex */
public final class PreferencesSerializer implements androidx.datastore.core.Serializer<androidx.datastore.preferences.core.Preferences> {
    public static final androidx.datastore.preferences.core.PreferencesSerializer INSTANCE = null;
    private static final java.lang.String fileExtension = null;

    /* compiled from: PreferencesSerializer.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase[] r0 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.BOOLEAN
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.FLOAT
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.DOUBLE
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.INTEGER
                int r1 = r1.ordinal()
                r2 = 4
                r0[r1] = r2
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.LONG
                int r1 = r1.ordinal()
                r2 = 5
                r0[r1] = r2
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.STRING
                int r1 = r1.ordinal()
                r2 = 6
                r0[r1] = r2
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.STRING_SET
                int r1 = r1.ordinal()
                r2 = 7
                r0[r1] = r2
                androidx.datastore.preferences.PreferencesProto$Value$ValueCase r1 = androidx.datastore.preferences.PreferencesProto$Value.ValueCase.VALUE_NOT_SET
                int r1 = r1.ordinal()
                r2 = 8
                r0[r1] = r2
                androidx.datastore.preferences.core.PreferencesSerializer.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    static {
            androidx.datastore.preferences.core.PreferencesSerializer r0 = new androidx.datastore.preferences.core.PreferencesSerializer
            r0.<init>()
            androidx.datastore.preferences.core.PreferencesSerializer.INSTANCE = r0
            java.lang.String r0 = "preferences_pb"
            androidx.datastore.preferences.core.PreferencesSerializer.fileExtension = r0
            return
    }

    private PreferencesSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void addProtoEntryToPreferences(java.lang.String r4, androidx.datastore.preferences.PreferencesProto$Value r5, androidx.datastore.preferences.core.MutablePreferences r6) {
            r3 = this;
            androidx.datastore.preferences.PreferencesProto$Value$ValueCase r0 = r5.getValueCase()
            if (r0 != 0) goto L8
            r0 = -1
            goto L10
        L8:
            int[] r1 = androidx.datastore.preferences.core.PreferencesSerializer.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L10:
            r1 = 2
            r2 = 0
            switch(r0) {
                case -1: goto L9d;
                case 0: goto L15;
                case 1: goto L8d;
                case 2: goto L7d;
                case 3: goto L6d;
                case 4: goto L5d;
                case 5: goto L4d;
                case 6: goto L3c;
                case 7: goto L23;
                case 8: goto L1b;
                default: goto L15;
            }
        L15:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L1b:
            androidx.datastore.core.CorruptionException r4 = new androidx.datastore.core.CorruptionException
            java.lang.String r5 = "Value not set."
            r4.<init>(r5, r2, r1, r2)
            throw r4
        L23:
            androidx.datastore.preferences.core.Preferences$Key r4 = androidx.datastore.preferences.core.PreferencesKeys.stringSetKey(r4)
            androidx.datastore.preferences.PreferencesProto$StringSet r5 = r5.getStringSet()
            java.util.List r5 = r5.getStringsList()
            java.lang.String r0 = "value.stringSet.stringsList"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.util.Set r5 = kotlin.collections.CollectionsKt.toSet(r5)
            r6.set(r4, r5)
            goto L9c
        L3c:
            androidx.datastore.preferences.core.Preferences$Key r4 = androidx.datastore.preferences.core.PreferencesKeys.stringKey(r4)
            java.lang.String r5 = r5.getString()
            java.lang.String r0 = "value.string"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r6.set(r4, r5)
            goto L9c
        L4d:
            androidx.datastore.preferences.core.Preferences$Key r4 = androidx.datastore.preferences.core.PreferencesKeys.longKey(r4)
            long r0 = r5.getLong()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r6.set(r4, r5)
            goto L9c
        L5d:
            androidx.datastore.preferences.core.Preferences$Key r4 = androidx.datastore.preferences.core.PreferencesKeys.intKey(r4)
            int r5 = r5.getInteger()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.set(r4, r5)
            goto L9c
        L6d:
            androidx.datastore.preferences.core.Preferences$Key r4 = androidx.datastore.preferences.core.PreferencesKeys.doubleKey(r4)
            double r0 = r5.getDouble()
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            r6.set(r4, r5)
            goto L9c
        L7d:
            androidx.datastore.preferences.core.Preferences$Key r4 = androidx.datastore.preferences.core.PreferencesKeys.floatKey(r4)
            float r5 = r5.getFloat()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r6.set(r4, r5)
            goto L9c
        L8d:
            androidx.datastore.preferences.core.Preferences$Key r4 = androidx.datastore.preferences.core.PreferencesKeys.booleanKey(r4)
            boolean r5 = r5.getBoolean()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.set(r4, r5)
        L9c:
            return
        L9d:
            androidx.datastore.core.CorruptionException r4 = new androidx.datastore.core.CorruptionException
            java.lang.String r5 = "Value case is null."
            r4.<init>(r5, r2, r1, r2)
            throw r4
    }

    private final androidx.datastore.preferences.PreferencesProto$Value getValueProto(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L1f
            androidx.datastore.preferences.PreferencesProto$Value$Builder r0 = androidx.datastore.preferences.PreferencesProto$Value.newBuilder()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            androidx.datastore.preferences.PreferencesProto$Value$Builder r4 = r0.setBoolean(r4)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r4 = r4.build()
            java.lang.String r0 = "newBuilder().setBoolean(value).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            androidx.datastore.preferences.PreferencesProto$Value r4 = (androidx.datastore.preferences.PreferencesProto$Value) r4
            goto Ld4
        L1f:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L3e
            androidx.datastore.preferences.PreferencesProto$Value$Builder r0 = androidx.datastore.preferences.PreferencesProto$Value.newBuilder()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            androidx.datastore.preferences.PreferencesProto$Value$Builder r4 = r0.setFloat(r4)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r4 = r4.build()
            java.lang.String r0 = "newBuilder().setFloat(value).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            androidx.datastore.preferences.PreferencesProto$Value r4 = (androidx.datastore.preferences.PreferencesProto$Value) r4
            goto Ld4
        L3e:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L5d
            androidx.datastore.preferences.PreferencesProto$Value$Builder r0 = androidx.datastore.preferences.PreferencesProto$Value.newBuilder()
            java.lang.Number r4 = (java.lang.Number) r4
            double r1 = r4.doubleValue()
            androidx.datastore.preferences.PreferencesProto$Value$Builder r4 = r0.setDouble(r1)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r4 = r4.build()
            java.lang.String r0 = "newBuilder().setDouble(value).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            androidx.datastore.preferences.PreferencesProto$Value r4 = (androidx.datastore.preferences.PreferencesProto$Value) r4
            goto Ld4
        L5d:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L7b
            androidx.datastore.preferences.PreferencesProto$Value$Builder r0 = androidx.datastore.preferences.PreferencesProto$Value.newBuilder()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.datastore.preferences.PreferencesProto$Value$Builder r4 = r0.setInteger(r4)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r4 = r4.build()
            java.lang.String r0 = "newBuilder().setInteger(value).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            androidx.datastore.preferences.PreferencesProto$Value r4 = (androidx.datastore.preferences.PreferencesProto$Value) r4
            goto Ld4
        L7b:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L99
            androidx.datastore.preferences.PreferencesProto$Value$Builder r0 = androidx.datastore.preferences.PreferencesProto$Value.newBuilder()
            java.lang.Number r4 = (java.lang.Number) r4
            long r1 = r4.longValue()
            androidx.datastore.preferences.PreferencesProto$Value$Builder r4 = r0.setLong(r1)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r4 = r4.build()
            java.lang.String r0 = "newBuilder().setLong(value).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            androidx.datastore.preferences.PreferencesProto$Value r4 = (androidx.datastore.preferences.PreferencesProto$Value) r4
            goto Ld4
        L99:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lb3
            androidx.datastore.preferences.PreferencesProto$Value$Builder r0 = androidx.datastore.preferences.PreferencesProto$Value.newBuilder()
            java.lang.String r4 = (java.lang.String) r4
            androidx.datastore.preferences.PreferencesProto$Value$Builder r4 = r0.setString(r4)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r4 = r4.build()
            java.lang.String r0 = "newBuilder().setString(value).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            androidx.datastore.preferences.PreferencesProto$Value r4 = (androidx.datastore.preferences.PreferencesProto$Value) r4
            goto Ld4
        Lb3:
            boolean r0 = r4 instanceof java.util.Set
            if (r0 == 0) goto Ld5
            androidx.datastore.preferences.PreferencesProto$Value$Builder r0 = androidx.datastore.preferences.PreferencesProto$Value.newBuilder()
            androidx.datastore.preferences.PreferencesProto$StringSet$Builder r1 = androidx.datastore.preferences.PreferencesProto$StringSet.newBuilder()
            java.util.Set r4 = (java.util.Set) r4
            androidx.datastore.preferences.PreferencesProto$StringSet$Builder r4 = r1.addAllStrings(r4)
            androidx.datastore.preferences.PreferencesProto$Value$Builder r4 = r0.setStringSet(r4)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r4 = r4.build()
            java.lang.String r0 = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            androidx.datastore.preferences.PreferencesProto$Value r4 = (androidx.datastore.preferences.PreferencesProto$Value) r4
        Ld4:
            return r4
        Ld5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "PreferencesSerializer does not support type: "
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r4)
            r0.<init>(r4)
            throw r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public androidx.datastore.preferences.core.Preferences getDefaultValue() {
            r1 = this;
            androidx.datastore.preferences.core.Preferences r0 = androidx.datastore.preferences.core.PreferencesFactory.createEmpty()
            return r0
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ androidx.datastore.preferences.core.Preferences getDefaultValue() {
            r1 = this;
            androidx.datastore.preferences.core.Preferences r0 = r1.getDefaultValue()
            return r0
    }

    public final java.lang.String getFileExtension() {
            r1 = this;
            java.lang.String r0 = androidx.datastore.preferences.core.PreferencesSerializer.fileExtension
            return r0
    }

    @Override // androidx.datastore.core.Serializer
    public java.lang.Object readFrom(java.io.InputStream r5, kotlin.coroutines.Continuation<? super androidx.datastore.preferences.core.Preferences> r6) throws java.io.IOException, androidx.datastore.core.CorruptionException {
            r4 = this;
            androidx.datastore.preferences.PreferencesMapCompat$Companion r6 = androidx.datastore.preferences.PreferencesMapCompat.Companion
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r5 = r6.readFrom(r5)
            r6 = 0
            androidx.datastore.preferences.core.Preferences$Pair[] r6 = new androidx.datastore.preferences.core.Preferences.Pair[r6]
            androidx.datastore.preferences.core.MutablePreferences r6 = androidx.datastore.preferences.core.PreferencesFactory.createMutable(r6)
            java.util.Map r5 = r5.getPreferencesMap()
            java.lang.String r0 = "preferencesProto.preferencesMap"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            androidx.datastore.preferences.PreferencesProto$Value r0 = (androidx.datastore.preferences.PreferencesProto$Value) r0
            androidx.datastore.preferences.core.PreferencesSerializer r2 = androidx.datastore.preferences.core.PreferencesSerializer.INSTANCE
            java.lang.String r3 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.lang.String r3 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r2.addProtoEntryToPreferences(r1, r0, r6)
            goto L1e
        L46:
            androidx.datastore.preferences.core.Preferences r5 = r6.toPreferences()
            return r5
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public java.lang.Object writeTo2(androidx.datastore.preferences.core.Preferences r3, java.io.OutputStream r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) throws java.io.IOException, androidx.datastore.core.CorruptionException {
            r2 = this;
            java.util.Map r3 = r3.asMap()
            androidx.datastore.preferences.PreferencesProto$PreferenceMap$Builder r5 = androidx.datastore.preferences.PreferencesProto$PreferenceMap.newBuilder()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            androidx.datastore.preferences.core.Preferences$Key r1 = (androidx.datastore.preferences.core.Preferences.Key) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = r1.getName()
            androidx.datastore.preferences.PreferencesProto$Value r0 = r2.getValueProto(r0)
            r5.putPreferences(r1, r0)
            goto L10
        L32:
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r3 = r5.build()
            androidx.datastore.preferences.PreferencesProto$PreferenceMap r3 = (androidx.datastore.preferences.PreferencesProto$PreferenceMap) r3
            r3.writeTo(r4)
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    @Override // androidx.datastore.core.Serializer
    public /* bridge */ /* synthetic */ java.lang.Object writeTo(androidx.datastore.preferences.core.Preferences r1, java.io.OutputStream r2, kotlin.coroutines.Continuation r3) {
            r0 = this;
            androidx.datastore.preferences.core.Preferences r1 = (androidx.datastore.preferences.core.Preferences) r1
            java.lang.Object r1 = r0.writeTo2(r1, r2, r3)
            return r1
    }
}
