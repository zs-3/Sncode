package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.AbstractMessageLite<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> defaultInstanceMap;
    protected int memoizedSerializedSize;
    protected androidx.datastore.preferences.protobuf.UnknownFieldSetLite unknownFields;

    public static abstract class Builder<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> extends androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;
        protected boolean isBuilt;

        protected Builder(MessageType r2) {
                r1 = this;
                r1.<init>()
                r1.defaultInstance = r2
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE
                java.lang.Object r2 = r2.dynamicMethod(r0)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r2
                r1.instance = r2
                r2 = 0
                r1.isBuilt = r2
                return
        }

        private void mergeFromInstance(MessageType r2, MessageType r3) {
                r1 = this;
                androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
                androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r2)
                r0.mergeFrom(r2, r3)
                return
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType build() {
                r2 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r2.buildPartial()
                boolean r1 = r0.isInitialized()
                if (r1 == 0) goto Lb
                return r0
            Lb:
                androidx.datastore.preferences.protobuf.UninitializedMessageException r0 = androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder.newUninitializedMessageException(r0)
                throw r0
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite build() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r1.build()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
                r1 = this;
                boolean r0 = r1.isBuilt
                if (r0 == 0) goto L7
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                return r0
            L7:
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                r0.makeImmutable()
                r0 = 1
                r1.isBuilt = r0
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite buildPartial() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r1.buildPartial()
                return r0
        }

        public BuilderType clone() {
                r2 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r2.getDefaultInstanceForType()
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = r0.newBuilderForType()
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = r2.buildPartial()
                r0.mergeFrom(r1)
                return r0
        }

        /* renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m7clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = r1.clone()
                return r0
        }

        protected void copyOnWrite() {
                r2 = this;
                boolean r0 = r2.isBuilt
                if (r0 == 0) goto L18
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r2.instance
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE
                java.lang.Object r0 = r0.dynamicMethod(r1)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r1 = r2.instance
                r2.mergeFromInstance(r0, r1)
                r2.instance = r0
                r0 = 0
                r2.isBuilt = r0
            L18:
                return
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
                r1 = this;
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.defaultInstance
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        protected /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder internalMergeFrom(androidx.datastore.preferences.protobuf.AbstractMessageLite r1) {
                r0 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r1
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r1 = r0.internalMergeFrom(r1)
                return r1
        }

        protected BuilderType internalMergeFrom(MessageType r1) {
                r0 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r1 = r0.mergeFrom(r1)
                return r1
        }

        public BuilderType mergeFrom(MessageType r2) {
                r1 = this;
                r1.copyOnWrite()
                MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> r0 = r1.instance
                r1.mergeFromInstance(r0, r2)
                return r1
        }
    }

    protected static class DefaultInstanceBasedParser<T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> extends androidx.datastore.preferences.protobuf.AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T r1) {
                r0 = this;
                r0.<init>()
                r0.defaultInstance = r1
                return
        }

        @Override // androidx.datastore.preferences.protobuf.Parser
        public T parsePartialFrom(androidx.datastore.preferences.protobuf.CodedInputStream r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r1 = this;
                T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?> r0 = r1.defaultInstance
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r2 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.parsePartialFrom(r0, r2, r3)
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.Parser
        public /* bridge */ /* synthetic */ java.lang.Object parsePartialFrom(androidx.datastore.preferences.protobuf.CodedInputStream r1, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
                r0 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = r0.parsePartialFrom(r1, r2)
                return r1
        }
    }

    public static abstract class ExtendableMessage<MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage<MessageType, BuilderType>, BuilderType> extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType> implements androidx.datastore.preferences.protobuf.MessageLiteOrBuilder {
        protected androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> extensions;

        public ExtendableMessage() {
                r1 = this;
                r1.<init>()
                androidx.datastore.preferences.protobuf.FieldSet r0 = androidx.datastore.preferences.protobuf.FieldSet.emptySet()
                r1.extensions = r0
                return
        }

        androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> ensureExtensionsAreMutable() {
                r1 = this;
                androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto L10
                androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                androidx.datastore.preferences.protobuf.FieldSet r0 = r0.clone()
                r1.extensions = r0
            L10:
                androidx.datastore.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor> r0 = r1.extensions
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite getDefaultInstanceForType() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = super.getDefaultInstanceForType()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = super.newBuilderForType()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = super.toBuilder()
                return r0
        }
    }

    static final class ExtensionDescriptor implements androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
        final androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final androidx.datastore.preferences.protobuf.WireFormat.FieldType type;

        public int compareTo(androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor r2) {
                r1 = this;
                int r0 = r1.number
                int r2 = r2.number
                int r0 = r0 - r2
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor r1 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor) r1
                int r1 = r0.compareTo(r1)
                return r1
        }

        public androidx.datastore.preferences.protobuf.Internal.EnumLiteMap<?> getEnumType() {
                r1 = this;
                androidx.datastore.preferences.protobuf.Internal$EnumLiteMap<?> r0 = r1.enumTypeMap
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public androidx.datastore.preferences.protobuf.WireFormat.JavaType getLiteJavaType() {
                r1 = this;
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r1.type
                androidx.datastore.preferences.protobuf.WireFormat$JavaType r0 = r0.getJavaType()
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType() {
                r1 = this;
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r1.type
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
                r1 = this;
                int r0 = r1.number
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public androidx.datastore.preferences.protobuf.MessageLite.Builder internalMergeFrom(androidx.datastore.preferences.protobuf.MessageLite.Builder r1, androidx.datastore.preferences.protobuf.MessageLite r2) {
                r0 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r1 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) r1
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r2
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r1 = r1.mergeFrom(r2)
                return r1
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
                r1 = this;
                boolean r0 = r1.isPacked
                return r0
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
                r1 = this;
                boolean r0 = r1.isRepeated
                return r0
        }
    }

    public static class GeneratedExtension<ContainingType extends androidx.datastore.preferences.protobuf.MessageLite, Type> extends androidx.datastore.preferences.protobuf.ExtensionLite<ContainingType, Type> {
        final androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor descriptor;
        final androidx.datastore.preferences.protobuf.MessageLite messageDefaultInstance;

        public androidx.datastore.preferences.protobuf.WireFormat.FieldType getLiteType() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r0.getLiteType()
                return r0
        }

        public androidx.datastore.preferences.protobuf.MessageLite getMessageDefaultInstance() {
                r1 = this;
                androidx.datastore.preferences.protobuf.MessageLite r0 = r1.messageDefaultInstance
                return r0
        }

        public int getNumber() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                int r0 = r0.getNumber()
                return r0
        }

        public boolean isRepeated() {
                r1 = this;
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$ExtensionDescriptor r0 = r1.descriptor
                boolean r0 = r0.isRepeated
                return r0
        }
    }

    public enum MethodToInvoke extends java.lang.Enum<androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke> {
        private static final /* synthetic */ androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke[] $VALUES = null;
        public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke BUILD_MESSAGE_INFO = null;
        public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke GET_DEFAULT_INSTANCE = null;
        public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke GET_MEMOIZED_IS_INITIALIZED = null;
        public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke GET_PARSER = null;
        public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke NEW_BUILDER = null;
        public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke NEW_MUTABLE_INSTANCE = null;
        public static final androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke SET_MEMOIZED_IS_INITIALIZED = null;

        static {
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r1 = "GET_MEMOIZED_IS_INITIALIZED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED = r0
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r3 = "SET_MEMOIZED_IS_INITIALIZED"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED = r1
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r3 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r5 = "BUILD_MESSAGE_INFO"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO = r3
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r5 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r7 = "NEW_MUTABLE_INSTANCE"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE = r5
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r7 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r9 = "NEW_BUILDER"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER = r7
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r9 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r11 = "GET_DEFAULT_INSTANCE"
                r12 = 5
                r9.<init>(r11, r12)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE = r9
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r11 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke
                java.lang.String r13 = "GET_PARSER"
                r14 = 6
                r11.<init>(r13, r14)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER = r11
                r13 = 7
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke[] r13 = new androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.$VALUES = r13
                return
        }

        MethodToInvoke(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke valueOf(java.lang.String r1) {
                java.lang.Class<androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke> r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r1 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke) r1
                return r1
        }

        public static androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke[] values() {
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke[]) r0
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.datastore.preferences.protobuf.GeneratedMessageLite.defaultInstanceMap = r0
            return
    }

    public GeneratedMessageLite() {
            r1 = this;
            r1.<init>()
            androidx.datastore.preferences.protobuf.UnknownFieldSetLite r0 = androidx.datastore.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()
            r1.unknownFields = r0
            r0 = -1
            r1.memoizedSerializedSize = r0
            return
    }

    private static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T checkMessageInitialized(T r1) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (r1 == 0) goto L16
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto L9
            goto L16
        L9:
            androidx.datastore.preferences.protobuf.UninitializedMessageException r0 = r1.newUninitializedMessageException()
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = r0.asInvalidProtocolBufferException()
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = r0.setUnfinishedMessage(r1)
            throw r1
        L16:
            return r1
    }

    protected static <E> androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> emptyProtobufList() {
            androidx.datastore.preferences.protobuf.ProtobufArrayList r0 = androidx.datastore.preferences.protobuf.ProtobufArrayList.emptyList()
            return r0
    }

    static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> T getDefaultInstance(java.lang.Class<T> r3) {
            java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.defaultInstanceMap
            java.lang.Object r0 = r0.get(r3)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            if (r0 != 0) goto L28
            java.lang.String r0 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L1f
            r1 = 1
            java.lang.ClassLoader r2 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.defaultInstanceMap
            java.lang.Object r0 = r0.get(r3)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            goto L28
        L1f:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r3)
            throw r0
        L28:
            if (r0 != 0) goto L42
            java.lang.Object r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.allocateInstance(r3)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r0.getDefaultInstanceForType()
            if (r0 == 0) goto L3c
            java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.defaultInstanceMap
            r1.put(r3, r0)
            goto L42
        L3c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L42:
            return r0
    }

    static java.lang.Object invokeOrDie(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    protected static final <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> boolean isInitialized(T r2, boolean r3) {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED
            java.lang.Object r0 = r2.dynamicMethod(r0)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r1 = 1
            if (r0 != r1) goto L10
            return r1
        L10:
            if (r0 != 0) goto L14
            r2 = 0
            return r2
        L14:
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
            androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r2)
            boolean r0 = r0.isInitialized(r2)
            if (r3 == 0) goto L2c
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r3 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED
            if (r0 == 0) goto L28
            r1 = r2
            goto L29
        L28:
            r1 = 0
        L29:
            r2.dynamicMethod(r3, r1)
        L2c:
            return r0
    }

    protected static <E> androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> mutableCopy(androidx.datastore.preferences.protobuf.Internal.ProtobufList<E> r1) {
            int r0 = r1.size()
            if (r0 != 0) goto L9
            r0 = 10
            goto Lb
        L9:
            int r0 = r0 * 2
        Lb:
            androidx.datastore.preferences.protobuf.Internal$ProtobufList r1 = r1.mutableCopyWithCapacity(r0)
            return r1
    }

    protected static java.lang.Object newMessageInfo(androidx.datastore.preferences.protobuf.MessageLite r1, java.lang.String r2, java.lang.Object[] r3) {
            androidx.datastore.preferences.protobuf.RawMessageInfo r0 = new androidx.datastore.preferences.protobuf.RawMessageInfo
            r0.<init>(r1, r2, r3)
            return r0
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parseFrom(T r1, java.io.InputStream r2) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = androidx.datastore.preferences.protobuf.CodedInputStream.newInstance(r2)
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = parsePartialFrom(r1, r2, r0)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = checkMessageInitialized(r1)
            return r1
    }

    static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<T, ?>> T parsePartialFrom(T r1, androidx.datastore.preferences.protobuf.CodedInputStream r2, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE
            java.lang.Object r1 = r1.dynamicMethod(r0)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r1 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r1
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c
            androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r1)     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c
            androidx.datastore.preferences.protobuf.CodedInputStreamReader r2 = androidx.datastore.preferences.protobuf.CodedInputStreamReader.forCodedInput(r2)     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c
            r0.mergeFrom(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c
            r0.makeImmutable(r1)     // Catch: java.lang.RuntimeException -> L1b java.io.IOException -> L2c
            return r1
        L1b:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            boolean r2 = r2 instanceof androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            if (r2 == 0) goto L2b
            java.lang.Throwable r1 = r1.getCause()
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException) r1
            throw r1
        L2b:
            throw r1
        L2c:
            r2 = move-exception
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            if (r3 == 0) goto L3c
            java.lang.Throwable r1 = r2.getCause()
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException) r1
            throw r1
        L3c:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r3 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
            java.lang.String r2 = r2.getMessage()
            r3.<init>(r2)
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r1 = r3.setUnfinishedMessage(r1)
            throw r1
    }

    protected static <T extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> void registerDefaultInstance(java.lang.Class<T> r1, T r2) {
            java.util.Map<java.lang.Object, androidx.datastore.preferences.protobuf.GeneratedMessageLite<?, ?>> r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.defaultInstanceMap
            r0.put(r1, r2)
            return
    }

    java.lang.Object buildMessageInfo() throws java.lang.Exception {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO
            java.lang.Object r0 = r1.dynamicMethod(r0)
            return r0
    }

    protected final <MessageType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder<MessageType, BuilderType>> BuilderType createBuilder() {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) r0
            return r0
    }

    protected java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.dynamicMethod(r2, r0, r0)
            return r2
    }

    protected java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.dynamicMethod(r2, r3, r0)
            return r2
    }

    protected abstract java.lang.Object dynamicMethod(androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke r1, java.lang.Object r2, java.lang.Object r3);

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r2)
            if (r0 != 0) goto L14
            r2 = 0
            return r2
        L14:
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
            androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r1)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r2
            boolean r2 = r0.equals(r1, r2)
            return r2
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE
            java.lang.Object r0 = r1.dynamicMethod(r0)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite) r0
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite getDefaultInstanceForType() {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r1.getDefaultInstanceForType()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
            r1 = this;
            int r0 = r1.memoizedSerializedSize
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final androidx.datastore.preferences.protobuf.Parser<MessageType> getParserForType() {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            androidx.datastore.preferences.protobuf.Parser r0 = (androidx.datastore.preferences.protobuf.Parser) r0
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public int getSerializedSize() {
            r2 = this;
            int r0 = r2.memoizedSerializedSize
            r1 = -1
            if (r0 != r1) goto L13
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
            androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r2)
            int r0 = r0.getSerializedSize(r2)
            r2.memoizedSerializedSize = r0
        L13:
            int r0 = r2.memoizedSerializedSize
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.memoizedHashCode
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
            androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r1)
            int r0 = r0.hashCode(r1)
            r1.memoizedHashCode = r0
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
            r1 = this;
            r0 = 1
            boolean r0 = isInitialized(r1, r0)
            return r0
    }

    protected void makeImmutable() {
            r1 = this;
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
            androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r1)
            r0.makeImmutable(r1)
            return
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) r0
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType() {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = r1.newBuilderForType()
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int r1) {
            r0 = this;
            r0.memoizedSerializedSize = r1
            return
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType toBuilder() {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r0 = r1.dynamicMethod(r0)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder) r0
            r0.mergeFrom(r1)
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public /* bridge */ /* synthetic */ androidx.datastore.preferences.protobuf.MessageLite.Builder toBuilder() {
            r1 = this;
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$Builder r0 = r1.toBuilder()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = androidx.datastore.preferences.protobuf.MessageLiteToString.toString(r1, r0)
            return r0
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(androidx.datastore.preferences.protobuf.CodedOutputStream r2) throws java.io.IOException {
            r1 = this;
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.getInstance()
            androidx.datastore.preferences.protobuf.Schema r0 = r0.schemaFor(r1)
            androidx.datastore.preferences.protobuf.CodedOutputStreamWriter r2 = androidx.datastore.preferences.protobuf.CodedOutputStreamWriter.forCodedOutput(r2)
            r0.writeTo(r1, r2)
            return
    }
}
