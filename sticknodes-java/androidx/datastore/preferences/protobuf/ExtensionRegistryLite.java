package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class ExtensionRegistryLite {
    static final androidx.datastore.preferences.protobuf.ExtensionRegistryLite EMPTY_REGISTRY_LITE = null;
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile androidx.datastore.preferences.protobuf.ExtensionRegistryLite emptyRegistry;
    private static final java.lang.Class<?> extensionClass = null;
    private final java.util.Map<androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair, androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    private static final class ObjectIntPair {
        private final int number;
        private final java.lang.Object object;

        ObjectIntPair(java.lang.Object r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.object = r1
                r0.number = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.datastore.preferences.protobuf.ExtensionRegistryLite$ObjectIntPair r4 = (androidx.datastore.preferences.protobuf.ExtensionRegistryLite.ObjectIntPair) r4
                java.lang.Object r0 = r3.object
                java.lang.Object r2 = r4.object
                if (r0 != r2) goto L15
                int r0 = r3.number
                int r4 = r4.number
                if (r0 != r4) goto L15
                r1 = 1
            L15:
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.object
                int r0 = java.lang.System.identityHashCode(r0)
                r1 = 65535(0xffff, float:9.1834E-41)
                int r0 = r0 * r1
                int r1 = r2.number
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            java.lang.Class r0 = resolveExtensionClass()
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite.extensionClass = r0
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = new androidx.datastore.preferences.protobuf.ExtensionRegistryLite
            r1 = 1
            r0.<init>(r1)
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE = r0
            return
    }

    ExtensionRegistryLite() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.extensionsByNumber = r0
            return
    }

    ExtensionRegistryLite(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.extensionsByNumber = r1
            return
    }

    public static androidx.datastore.preferences.protobuf.ExtensionRegistryLite getEmptyRegistry() {
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.emptyRegistry
            if (r0 != 0) goto L1d
            java.lang.Class<androidx.datastore.preferences.protobuf.ExtensionRegistryLite> r1 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.class
            monitor-enter(r1)
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.emptyRegistry     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L18
            boolean r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.doFullRuntimeInheritanceCheck     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L14
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryFactory.createEmpty()     // Catch: java.lang.Throwable -> L1a
            goto L16
        L14:
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite r0 = androidx.datastore.preferences.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE     // Catch: java.lang.Throwable -> L1a
        L16:
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite.emptyRegistry = r0     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L1d
        L1a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0
        L1d:
            return r0
    }

    static java.lang.Class<?> resolveExtensionClass() {
            java.lang.String r0 = "androidx.datastore.preferences.protobuf.Extension"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public <ContainingType extends androidx.datastore.preferences.protobuf.MessageLite> androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType r3, int r4) {
            r2 = this;
            java.util.Map<androidx.datastore.preferences.protobuf.ExtensionRegistryLite$ObjectIntPair, androidx.datastore.preferences.protobuf.GeneratedMessageLite$GeneratedExtension<?, ?>> r0 = r2.extensionsByNumber
            androidx.datastore.preferences.protobuf.ExtensionRegistryLite$ObjectIntPair r1 = new androidx.datastore.preferences.protobuf.ExtensionRegistryLite$ObjectIntPair
            r1.<init>(r3, r4)
            java.lang.Object r3 = r0.get(r1)
            androidx.datastore.preferences.protobuf.GeneratedMessageLite$GeneratedExtension r3 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) r3
            return r3
    }
}
