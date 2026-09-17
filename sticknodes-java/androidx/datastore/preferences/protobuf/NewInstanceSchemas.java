package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class NewInstanceSchemas {
    private static final androidx.datastore.preferences.protobuf.NewInstanceSchema FULL_SCHEMA = null;
    private static final androidx.datastore.preferences.protobuf.NewInstanceSchema LITE_SCHEMA = null;

    static {
            androidx.datastore.preferences.protobuf.NewInstanceSchema r0 = loadSchemaForFullRuntime()
            androidx.datastore.preferences.protobuf.NewInstanceSchemas.FULL_SCHEMA = r0
            androidx.datastore.preferences.protobuf.NewInstanceSchemaLite r0 = new androidx.datastore.preferences.protobuf.NewInstanceSchemaLite
            r0.<init>()
            androidx.datastore.preferences.protobuf.NewInstanceSchemas.LITE_SCHEMA = r0
            return
    }

    static androidx.datastore.preferences.protobuf.NewInstanceSchema full() {
            androidx.datastore.preferences.protobuf.NewInstanceSchema r0 = androidx.datastore.preferences.protobuf.NewInstanceSchemas.FULL_SCHEMA
            return r0
    }

    static androidx.datastore.preferences.protobuf.NewInstanceSchema lite() {
            androidx.datastore.preferences.protobuf.NewInstanceSchema r0 = androidx.datastore.preferences.protobuf.NewInstanceSchemas.LITE_SCHEMA
            return r0
    }

    private static androidx.datastore.preferences.protobuf.NewInstanceSchema loadSchemaForFullRuntime() {
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.NewInstanceSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L16
            androidx.datastore.preferences.protobuf.NewInstanceSchema r0 = (androidx.datastore.preferences.protobuf.NewInstanceSchema) r0     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }
}
