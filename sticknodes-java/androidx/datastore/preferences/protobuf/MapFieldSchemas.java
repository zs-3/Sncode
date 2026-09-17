package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class MapFieldSchemas {
    private static final androidx.datastore.preferences.protobuf.MapFieldSchema FULL_SCHEMA = null;
    private static final androidx.datastore.preferences.protobuf.MapFieldSchema LITE_SCHEMA = null;

    static {
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = loadSchemaForFullRuntime()
            androidx.datastore.preferences.protobuf.MapFieldSchemas.FULL_SCHEMA = r0
            androidx.datastore.preferences.protobuf.MapFieldSchemaLite r0 = new androidx.datastore.preferences.protobuf.MapFieldSchemaLite
            r0.<init>()
            androidx.datastore.preferences.protobuf.MapFieldSchemas.LITE_SCHEMA = r0
            return
    }

    static androidx.datastore.preferences.protobuf.MapFieldSchema full() {
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = androidx.datastore.preferences.protobuf.MapFieldSchemas.FULL_SCHEMA
            return r0
    }

    static androidx.datastore.preferences.protobuf.MapFieldSchema lite() {
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = androidx.datastore.preferences.protobuf.MapFieldSchemas.LITE_SCHEMA
            return r0
    }

    private static androidx.datastore.preferences.protobuf.MapFieldSchema loadSchemaForFullRuntime() {
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.MapFieldSchemaFull"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L16
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L16
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L16
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L16
            androidx.datastore.preferences.protobuf.MapFieldSchema r0 = (androidx.datastore.preferences.protobuf.MapFieldSchema) r0     // Catch: java.lang.Exception -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }
}
