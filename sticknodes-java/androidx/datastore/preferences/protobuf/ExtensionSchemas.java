package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class ExtensionSchemas {
    private static final androidx.datastore.preferences.protobuf.ExtensionSchema<?> FULL_SCHEMA = null;
    private static final androidx.datastore.preferences.protobuf.ExtensionSchema<?> LITE_SCHEMA = null;

    static {
            androidx.datastore.preferences.protobuf.ExtensionSchemaLite r0 = new androidx.datastore.preferences.protobuf.ExtensionSchemaLite
            r0.<init>()
            androidx.datastore.preferences.protobuf.ExtensionSchemas.LITE_SCHEMA = r0
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = loadSchemaForFullRuntime()
            androidx.datastore.preferences.protobuf.ExtensionSchemas.FULL_SCHEMA = r0
            return
    }

    static androidx.datastore.preferences.protobuf.ExtensionSchema<?> full() {
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = androidx.datastore.preferences.protobuf.ExtensionSchemas.FULL_SCHEMA
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Protobuf runtime is not correctly loaded."
            r0.<init>(r1)
            throw r0
    }

    static androidx.datastore.preferences.protobuf.ExtensionSchema<?> lite() {
            androidx.datastore.preferences.protobuf.ExtensionSchema<?> r0 = androidx.datastore.preferences.protobuf.ExtensionSchemas.LITE_SCHEMA
            return r0
    }

    private static androidx.datastore.preferences.protobuf.ExtensionSchema<?> loadSchemaForFullRuntime() {
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.ExtensionSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L16
            androidx.datastore.preferences.protobuf.ExtensionSchema r0 = (androidx.datastore.preferences.protobuf.ExtensionSchema) r0     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }
}
