package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class Protobuf {
    private static final androidx.datastore.preferences.protobuf.Protobuf INSTANCE = null;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, androidx.datastore.preferences.protobuf.Schema<?>> schemaCache;
    private final androidx.datastore.preferences.protobuf.SchemaFactory schemaFactory;

    static {
            androidx.datastore.preferences.protobuf.Protobuf r0 = new androidx.datastore.preferences.protobuf.Protobuf
            r0.<init>()
            androidx.datastore.preferences.protobuf.Protobuf.INSTANCE = r0
            return
    }

    private Protobuf() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.schemaCache = r0
            androidx.datastore.preferences.protobuf.ManifestSchemaFactory r0 = new androidx.datastore.preferences.protobuf.ManifestSchemaFactory
            r0.<init>()
            r1.schemaFactory = r0
            return
    }

    public static androidx.datastore.preferences.protobuf.Protobuf getInstance() {
            androidx.datastore.preferences.protobuf.Protobuf r0 = androidx.datastore.preferences.protobuf.Protobuf.INSTANCE
            return r0
    }

    public <T> void mergeFrom(T r2, androidx.datastore.preferences.protobuf.Reader r3, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            r1 = this;
            androidx.datastore.preferences.protobuf.Schema r0 = r1.schemaFor(r2)
            r0.mergeFrom(r2, r3, r4)
            return
    }

    public androidx.datastore.preferences.protobuf.Schema<?> registerSchema(java.lang.Class<?> r2, androidx.datastore.preferences.protobuf.Schema<?> r3) {
            r1 = this;
            java.lang.String r0 = "messageType"
            androidx.datastore.preferences.protobuf.Internal.checkNotNull(r2, r0)
            java.lang.String r0 = "schema"
            androidx.datastore.preferences.protobuf.Internal.checkNotNull(r3, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, androidx.datastore.preferences.protobuf.Schema<?>> r0 = r1.schemaCache
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            androidx.datastore.preferences.protobuf.Schema r2 = (androidx.datastore.preferences.protobuf.Schema) r2
            return r2
    }

    public <T> androidx.datastore.preferences.protobuf.Schema<T> schemaFor(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "messageType"
            androidx.datastore.preferences.protobuf.Internal.checkNotNull(r2, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, androidx.datastore.preferences.protobuf.Schema<?>> r0 = r1.schemaCache
            java.lang.Object r0 = r0.get(r2)
            androidx.datastore.preferences.protobuf.Schema r0 = (androidx.datastore.preferences.protobuf.Schema) r0
            if (r0 != 0) goto L1c
            androidx.datastore.preferences.protobuf.SchemaFactory r0 = r1.schemaFactory
            androidx.datastore.preferences.protobuf.Schema r0 = r0.createSchema(r2)
            androidx.datastore.preferences.protobuf.Schema r2 = r1.registerSchema(r2, r0)
            if (r2 == 0) goto L1c
            r0 = r2
        L1c:
            return r0
    }

    public <T> androidx.datastore.preferences.protobuf.Schema<T> schemaFor(T r1) {
            r0 = this;
            java.lang.Class r1 = r1.getClass()
            androidx.datastore.preferences.protobuf.Schema r1 = r0.schemaFor(r1)
            return r1
    }
}
