package com.google.firebase.components;

/* loaded from: classes2.dex */
public final class ComponentDiscovery<T> {
    private final T context;
    private final com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<T> retriever;

    /* renamed from: com.google.firebase.components.ComponentDiscovery$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class MetadataRegistrarNameRetriever implements com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<android.content.Context> {
        private final java.lang.Class<? extends android.app.Service> discoveryService;

        private MetadataRegistrarNameRetriever(java.lang.Class<? extends android.app.Service> r1) {
                r0 = this;
                r0.<init>()
                r0.discoveryService = r1
                return
        }

        /* synthetic */ MetadataRegistrarNameRetriever(java.lang.Class r1, com.google.firebase.components.ComponentDiscovery.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private android.os.Bundle getMetadata(android.content.Context r6) {
                r5 = this;
                java.lang.String r0 = "ComponentDiscovery"
                r1 = 0
                android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                if (r2 != 0) goto Lf
                java.lang.String r6 = "Context has no PackageManager."
                android.util.Log.w(r0, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                return r1
            Lf:
                android.content.ComponentName r3 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                java.lang.Class<? extends android.app.Service> r4 = r5.discoveryService     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                r3.<init>(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                r6 = 128(0x80, float:1.794E-43)
                android.content.pm.ServiceInfo r6 = r2.getServiceInfo(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                if (r6 != 0) goto L35
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                r6.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                java.lang.Class<? extends android.app.Service> r2 = r5.discoveryService     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                r6.append(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                java.lang.String r2 = " has no service info."
                r6.append(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                java.lang.String r6 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                android.util.Log.w(r0, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                return r1
            L35:
                android.os.Bundle r6 = r6.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
                return r6
            L38:
                java.lang.String r6 = "Application info not found."
                android.util.Log.w(r0, r6)
                return r1
        }

        /* renamed from: retrieve, reason: avoid collision after fix types in other method */
        public java.util.List<java.lang.String> retrieve2(android.content.Context r6) {
                r5 = this;
                android.os.Bundle r6 = r5.getMetadata(r6)
                if (r6 != 0) goto L12
                java.lang.String r6 = "ComponentDiscovery"
                java.lang.String r0 = "Could not retrieve metadata, returning empty list of registrars."
                android.util.Log.w(r6, r0)
                java.util.List r6 = java.util.Collections.emptyList()
                return r6
            L12:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Set r1 = r6.keySet()
                java.util.Iterator r1 = r1.iterator()
            L1f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L49
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r6.get(r2)
                java.lang.String r4 = "com.google.firebase.components.ComponentRegistrar"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L1f
                java.lang.String r3 = "com.google.firebase.components:"
                boolean r3 = r2.startsWith(r3)
                if (r3 == 0) goto L1f
                r3 = 31
                java.lang.String r2 = r2.substring(r3)
                r0.add(r2)
                goto L1f
            L49:
                return r0
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public /* bridge */ /* synthetic */ java.util.List retrieve(android.content.Context r1) {
                r0 = this;
                android.content.Context r1 = (android.content.Context) r1
                java.util.List r1 = r0.retrieve2(r1)
                return r1
        }
    }

    interface RegistrarNameRetriever<T> {
        java.util.List<java.lang.String> retrieve(T r1);
    }

    /* renamed from: $r8$lambda$g7eF8YtNQOk49-ub0JV5u7HvrjE, reason: not valid java name */
    public static /* synthetic */ com.google.firebase.components.ComponentRegistrar m40$r8$lambda$g7eF8YtNQOk49ub0JV5u7HvrjE(java.lang.String r0) {
            com.google.firebase.components.ComponentRegistrar r0 = lambda$discoverLazy$0(r0)
            return r0
    }

    ComponentDiscovery(T r1, com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<T> r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.retriever = r2
            return
    }

    public static com.google.firebase.components.ComponentDiscovery<android.content.Context> forContext(android.content.Context r3, java.lang.Class<? extends android.app.Service> r4) {
            com.google.firebase.components.ComponentDiscovery r0 = new com.google.firebase.components.ComponentDiscovery
            com.google.firebase.components.ComponentDiscovery$MetadataRegistrarNameRetriever r1 = new com.google.firebase.components.ComponentDiscovery$MetadataRegistrarNameRetriever
            r2 = 0
            r1.<init>(r4, r2)
            r0.<init>(r3, r1)
            return r0
    }

    private static com.google.firebase.components.ComponentRegistrar instantiate(java.lang.String r8) {
            java.lang.String r0 = "Could not instantiate %s"
            java.lang.String r1 = "Could not instantiate %s."
            r2 = 1
            r3 = 0
            java.lang.Class r4 = java.lang.Class.forName(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            java.lang.Class<com.google.firebase.components.ComponentRegistrar> r5 = com.google.firebase.components.ComponentRegistrar.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            if (r5 == 0) goto L21
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            java.lang.Object r4 = r4.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            com.google.firebase.components.ComponentRegistrar r4 = (com.google.firebase.components.ComponentRegistrar) r4     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            return r4
        L21:
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            java.lang.String r5 = "Class %s is not an instance of %s"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            r6[r3] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            r6[r2] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            r4.<init>(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
            throw r4     // Catch: java.lang.reflect.InvocationTargetException -> L36 java.lang.NoSuchMethodException -> L45 java.lang.InstantiationException -> L54 java.lang.IllegalAccessException -> L63 java.lang.ClassNotFoundException -> L72
        L36:
            r1 = move-exception
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r8
            java.lang.String r8 = java.lang.String.format(r0, r2)
            r4.<init>(r8, r1)
            throw r4
        L45:
            r1 = move-exception
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r8
            java.lang.String r8 = java.lang.String.format(r0, r2)
            r4.<init>(r8, r1)
            throw r4
        L54:
            r0 = move-exception
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r8
            java.lang.String r8 = java.lang.String.format(r1, r2)
            r4.<init>(r8, r0)
            throw r4
        L63:
            r0 = move-exception
            com.google.firebase.components.InvalidRegistrarException r4 = new com.google.firebase.components.InvalidRegistrarException
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r8
            java.lang.String r8 = java.lang.String.format(r1, r2)
            r4.<init>(r8, r0)
            throw r4
        L72:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r8
            java.lang.String r8 = "Class %s is not an found."
            java.lang.String r8 = java.lang.String.format(r8, r0)
            java.lang.String r0 = "ComponentDiscovery"
            android.util.Log.w(r0, r8)
            r8 = 0
            return r8
    }

    private static /* synthetic */ com.google.firebase.components.ComponentRegistrar lambda$discoverLazy$0(java.lang.String r0) {
            com.google.firebase.components.ComponentRegistrar r0 = instantiate(r0)
            return r0
    }

    public java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> discoverLazy() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.firebase.components.ComponentDiscovery$RegistrarNameRetriever<T> r1 = r4.retriever
            T r2 = r4.context
            java.util.List r1 = r1.retrieve(r2)
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0 r3 = new com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0
            r3.<init>(r2)
            r0.add(r3)
            goto L11
        L26:
            return r0
    }
}
