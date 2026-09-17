package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class ManifestSchemaFactory implements androidx.datastore.preferences.protobuf.SchemaFactory {
    private static final androidx.datastore.preferences.protobuf.MessageInfoFactory EMPTY_FACTORY = null;
    private final androidx.datastore.preferences.protobuf.MessageInfoFactory messageInfoFactory;


    private static class CompositeMessageInfoFactory implements androidx.datastore.preferences.protobuf.MessageInfoFactory {
        private androidx.datastore.preferences.protobuf.MessageInfoFactory[] factories;

        CompositeMessageInfoFactory(androidx.datastore.preferences.protobuf.MessageInfoFactory... r1) {
                r0 = this;
                r0.<init>()
                r0.factories = r1
                return
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public boolean isSupported(java.lang.Class<?> r6) {
                r5 = this;
                androidx.datastore.preferences.protobuf.MessageInfoFactory[] r0 = r5.factories
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                r4 = r0[r3]
                boolean r4 = r4.isSupported(r6)
                if (r4 == 0) goto L11
                r6 = 1
                return r6
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public androidx.datastore.preferences.protobuf.MessageInfo messageInfoFor(java.lang.Class<?> r6) {
                r5 = this;
                androidx.datastore.preferences.protobuf.MessageInfoFactory[] r0 = r5.factories
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L16
                r3 = r0[r2]
                boolean r4 = r3.isSupported(r6)
                if (r4 == 0) goto L13
                androidx.datastore.preferences.protobuf.MessageInfo r6 = r3.messageInfoFor(r6)
                return r6
            L13:
                int r2 = r2 + 1
                goto L4
            L16:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No factory is available for message type: "
                r1.append(r2)
                java.lang.String r6 = r6.getName()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }
    }

    static {
            androidx.datastore.preferences.protobuf.ManifestSchemaFactory$1 r0 = new androidx.datastore.preferences.protobuf.ManifestSchemaFactory$1
            r0.<init>()
            androidx.datastore.preferences.protobuf.ManifestSchemaFactory.EMPTY_FACTORY = r0
            return
    }

    public ManifestSchemaFactory() {
            r1 = this;
            androidx.datastore.preferences.protobuf.MessageInfoFactory r0 = getDefaultMessageInfoFactory()
            r1.<init>(r0)
            return
    }

    private ManifestSchemaFactory(androidx.datastore.preferences.protobuf.MessageInfoFactory r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "messageInfoFactory"
            java.lang.Object r2 = androidx.datastore.preferences.protobuf.Internal.checkNotNull(r2, r0)
            androidx.datastore.preferences.protobuf.MessageInfoFactory r2 = (androidx.datastore.preferences.protobuf.MessageInfoFactory) r2
            r1.messageInfoFactory = r2
            return
    }

    private static androidx.datastore.preferences.protobuf.MessageInfoFactory getDefaultMessageInfoFactory() {
            androidx.datastore.preferences.protobuf.ManifestSchemaFactory$CompositeMessageInfoFactory r0 = new androidx.datastore.preferences.protobuf.ManifestSchemaFactory$CompositeMessageInfoFactory
            r1 = 2
            androidx.datastore.preferences.protobuf.MessageInfoFactory[] r1 = new androidx.datastore.preferences.protobuf.MessageInfoFactory[r1]
            androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory r2 = androidx.datastore.preferences.protobuf.GeneratedMessageInfoFactory.getInstance()
            r3 = 0
            r1[r3] = r2
            androidx.datastore.preferences.protobuf.MessageInfoFactory r2 = getDescriptorMessageInfoFactory()
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            return r0
    }

    private static androidx.datastore.preferences.protobuf.MessageInfoFactory getDescriptorMessageInfoFactory() {
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "getInstance"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L19
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L19
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L19
            androidx.datastore.preferences.protobuf.MessageInfoFactory r0 = (androidx.datastore.preferences.protobuf.MessageInfoFactory) r0     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            androidx.datastore.preferences.protobuf.MessageInfoFactory r0 = androidx.datastore.preferences.protobuf.ManifestSchemaFactory.EMPTY_FACTORY
            return r0
    }

    private static boolean isProto2(androidx.datastore.preferences.protobuf.MessageInfo r1) {
            androidx.datastore.preferences.protobuf.ProtoSyntax r1 = r1.getSyntax()
            androidx.datastore.preferences.protobuf.ProtoSyntax r0 = androidx.datastore.preferences.protobuf.ProtoSyntax.PROTO2
            if (r1 != r0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    private static <T> androidx.datastore.preferences.protobuf.Schema<T> newSchema(java.lang.Class<T> r8, androidx.datastore.preferences.protobuf.MessageInfo r9) {
            java.lang.Class<androidx.datastore.preferences.protobuf.GeneratedMessageLite> r0 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto L41
            boolean r0 = isProto2(r9)
            if (r0 == 0) goto L29
            androidx.datastore.preferences.protobuf.NewInstanceSchema r3 = androidx.datastore.preferences.protobuf.NewInstanceSchemas.lite()
            androidx.datastore.preferences.protobuf.ListFieldSchema r4 = androidx.datastore.preferences.protobuf.ListFieldSchema.lite()
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r5 = androidx.datastore.preferences.protobuf.SchemaUtil.unknownFieldSetLiteSchema()
            androidx.datastore.preferences.protobuf.ExtensionSchema r6 = androidx.datastore.preferences.protobuf.ExtensionSchemas.lite()
            androidx.datastore.preferences.protobuf.MapFieldSchema r7 = androidx.datastore.preferences.protobuf.MapFieldSchemas.lite()
            r1 = r8
            r2 = r9
            androidx.datastore.preferences.protobuf.MessageSchema r8 = androidx.datastore.preferences.protobuf.MessageSchema.newSchema(r1, r2, r3, r4, r5, r6, r7)
            goto L40
        L29:
            androidx.datastore.preferences.protobuf.NewInstanceSchema r2 = androidx.datastore.preferences.protobuf.NewInstanceSchemas.lite()
            androidx.datastore.preferences.protobuf.ListFieldSchema r3 = androidx.datastore.preferences.protobuf.ListFieldSchema.lite()
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r4 = androidx.datastore.preferences.protobuf.SchemaUtil.unknownFieldSetLiteSchema()
            r5 = 0
            androidx.datastore.preferences.protobuf.MapFieldSchema r6 = androidx.datastore.preferences.protobuf.MapFieldSchemas.lite()
            r0 = r8
            r1 = r9
            androidx.datastore.preferences.protobuf.MessageSchema r8 = androidx.datastore.preferences.protobuf.MessageSchema.newSchema(r0, r1, r2, r3, r4, r5, r6)
        L40:
            return r8
        L41:
            boolean r0 = isProto2(r9)
            if (r0 == 0) goto L62
            androidx.datastore.preferences.protobuf.NewInstanceSchema r3 = androidx.datastore.preferences.protobuf.NewInstanceSchemas.full()
            androidx.datastore.preferences.protobuf.ListFieldSchema r4 = androidx.datastore.preferences.protobuf.ListFieldSchema.full()
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r5 = androidx.datastore.preferences.protobuf.SchemaUtil.proto2UnknownFieldSetSchema()
            androidx.datastore.preferences.protobuf.ExtensionSchema r6 = androidx.datastore.preferences.protobuf.ExtensionSchemas.full()
            androidx.datastore.preferences.protobuf.MapFieldSchema r7 = androidx.datastore.preferences.protobuf.MapFieldSchemas.full()
            r1 = r8
            r2 = r9
            androidx.datastore.preferences.protobuf.MessageSchema r8 = androidx.datastore.preferences.protobuf.MessageSchema.newSchema(r1, r2, r3, r4, r5, r6, r7)
            goto L79
        L62:
            androidx.datastore.preferences.protobuf.NewInstanceSchema r2 = androidx.datastore.preferences.protobuf.NewInstanceSchemas.full()
            androidx.datastore.preferences.protobuf.ListFieldSchema r3 = androidx.datastore.preferences.protobuf.ListFieldSchema.full()
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r4 = androidx.datastore.preferences.protobuf.SchemaUtil.proto3UnknownFieldSetSchema()
            r5 = 0
            androidx.datastore.preferences.protobuf.MapFieldSchema r6 = androidx.datastore.preferences.protobuf.MapFieldSchemas.full()
            r0 = r8
            r1 = r9
            androidx.datastore.preferences.protobuf.MessageSchema r8 = androidx.datastore.preferences.protobuf.MessageSchema.newSchema(r0, r1, r2, r3, r4, r5, r6)
        L79:
            return r8
    }

    @Override // androidx.datastore.preferences.protobuf.SchemaFactory
    public <T> androidx.datastore.preferences.protobuf.Schema<T> createSchema(java.lang.Class<T> r3) {
            r2 = this;
            androidx.datastore.preferences.protobuf.SchemaUtil.requireGeneratedMessage(r3)
            androidx.datastore.preferences.protobuf.MessageInfoFactory r0 = r2.messageInfoFactory
            androidx.datastore.preferences.protobuf.MessageInfo r0 = r0.messageInfoFor(r3)
            boolean r1 = r0.isMessageSetWireFormat()
            if (r1 == 0) goto L39
            java.lang.Class<androidx.datastore.preferences.protobuf.GeneratedMessageLite> r1 = androidx.datastore.preferences.protobuf.GeneratedMessageLite.class
            boolean r3 = r1.isAssignableFrom(r3)
            if (r3 == 0) goto L28
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r3 = androidx.datastore.preferences.protobuf.SchemaUtil.unknownFieldSetLiteSchema()
            androidx.datastore.preferences.protobuf.ExtensionSchema r1 = androidx.datastore.preferences.protobuf.ExtensionSchemas.lite()
            androidx.datastore.preferences.protobuf.MessageLite r0 = r0.getDefaultInstance()
            androidx.datastore.preferences.protobuf.MessageSetSchema r3 = androidx.datastore.preferences.protobuf.MessageSetSchema.newSchema(r3, r1, r0)
            return r3
        L28:
            androidx.datastore.preferences.protobuf.UnknownFieldSchema r3 = androidx.datastore.preferences.protobuf.SchemaUtil.proto2UnknownFieldSetSchema()
            androidx.datastore.preferences.protobuf.ExtensionSchema r1 = androidx.datastore.preferences.protobuf.ExtensionSchemas.full()
            androidx.datastore.preferences.protobuf.MessageLite r0 = r0.getDefaultInstance()
            androidx.datastore.preferences.protobuf.MessageSetSchema r3 = androidx.datastore.preferences.protobuf.MessageSetSchema.newSchema(r3, r1, r0)
            return r3
        L39:
            androidx.datastore.preferences.protobuf.Schema r3 = newSchema(r3, r0)
            return r3
    }
}
