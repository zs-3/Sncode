package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class ExtensionRegistryFactory {
    static final java.lang.Class<?> EXTENSION_REGISTRY_CLASS = null;

    static {
            java.lang.Class r0 = reflectExtensionRegistry()
            androidx.datastore.preferences.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS = r0
            return
    }

    public static androidx.datastore.preferences.protobuf.ExtensionRegistryLite createEmpty() {
            java.lang.Class<?> r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS
            if (r0 == 0) goto Lb
            java.lang.String r0 = "getEmptyRegistry"
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = invokeSubclassFactory(r0)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE
            return r0
    }

    private static final androidx.datastore.preferences.protobuf.ExtensionRegistryLite invokeSubclassFactory(java.lang.String r3) throws java.lang.Exception {
            java.lang.Class<?> r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r2)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Object r3 = r3.invoke(r1, r0)
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r3 = (androidx.datastore.preferences.protobuf.ExtensionRegistryLite) r3
            return r3
    }

    static java.lang.Class<?> reflectExtensionRegistry() {
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.ExtensionRegistry"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }
}
