package com.google.android.datatransport.runtime.backends;

/* loaded from: classes.dex */
class MetadataBackendRegistry implements com.google.android.datatransport.runtime.backends.BackendRegistry {
    private static final java.lang.String BACKEND_KEY_PREFIX = "backend:";
    private static final java.lang.String TAG = "BackendRegistry";
    private final com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider backendFactoryProvider;
    private final java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> backends;
    private final com.google.android.datatransport.runtime.backends.CreationContextFactory creationContextFactory;

    static class BackendFactoryProvider {
        private final android.content.Context applicationContext;
        private java.util.Map<java.lang.String, java.lang.String> backendProviders;

        BackendFactoryProvider(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.backendProviders = r0
                r1.applicationContext = r2
                return
        }

        private java.util.Map<java.lang.String, java.lang.String> discover(android.content.Context r9) {
                r8 = this;
                android.os.Bundle r9 = getMetadata(r9)
                if (r9 != 0) goto L12
                java.lang.String r9 = "BackendRegistry"
                java.lang.String r0 = "Could not retrieve metadata, returning empty list of transport backends."
                android.util.Log.w(r9, r0)
                java.util.Map r9 = java.util.Collections.emptyMap()
                return r9
            L12:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Set r1 = r9.keySet()
                java.util.Iterator r1 = r1.iterator()
            L1f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L61
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r3 = r9.get(r2)
                boolean r4 = r3 instanceof java.lang.String
                if (r4 == 0) goto L1f
                java.lang.String r4 = "backend:"
                boolean r4 = r2.startsWith(r4)
                if (r4 == 0) goto L1f
                java.lang.String r3 = (java.lang.String) r3
                r4 = -1
                java.lang.String r5 = ","
                java.lang.String[] r3 = r3.split(r5, r4)
                int r4 = r3.length
                r5 = 0
            L46:
                if (r5 >= r4) goto L1f
                r6 = r3[r5]
                java.lang.String r6 = r6.trim()
                boolean r7 = r6.isEmpty()
                if (r7 == 0) goto L55
                goto L5e
            L55:
                r7 = 8
                java.lang.String r7 = r2.substring(r7)
                r0.put(r6, r7)
            L5e:
                int r5 = r5 + 1
                goto L46
            L61:
                return r0
        }

        private java.util.Map<java.lang.String, java.lang.String> getBackendProviders() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.backendProviders
                if (r0 != 0) goto Lc
                android.content.Context r0 = r1.applicationContext
                java.util.Map r0 = r1.discover(r0)
                r1.backendProviders = r0
            Lc:
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.backendProviders
                return r0
        }

        private static android.os.Bundle getMetadata(android.content.Context r5) {
                java.lang.String r0 = "BackendRegistry"
                r1 = 0
                android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
                if (r2 != 0) goto Lf
                java.lang.String r5 = "Context has no PackageManager."
                android.util.Log.w(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
                return r1
            Lf:
                android.content.ComponentName r3 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
                java.lang.Class<com.google.android.datatransport.runtime.backends.TransportBackendDiscovery> r4 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class
                r3.<init>(r5, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
                r5 = 128(0x80, float:1.794E-43)
                android.content.pm.ServiceInfo r5 = r2.getServiceInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
                if (r5 != 0) goto L24
                java.lang.String r5 = "TransportBackendDiscovery has no service info."
                android.util.Log.w(r0, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
                return r1
            L24:
                android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L27
                return r5
            L27:
                java.lang.String r5 = "Application info not found."
                android.util.Log.w(r0, r5)
                return r1
        }

        com.google.android.datatransport.runtime.backends.BackendFactory get(java.lang.String r9) {
                r8 = this;
                java.lang.String r0 = "Could not instantiate %s"
                java.lang.String r1 = "Could not instantiate %s."
                java.lang.String r2 = "BackendRegistry"
                java.util.Map r3 = r8.getBackendProviders()
                java.lang.Object r9 = r3.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                r3 = 0
                if (r9 != 0) goto L14
                return r3
            L14:
                r4 = 1
                r5 = 0
                java.lang.Class r6 = java.lang.Class.forName(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.NoSuchMethodException -> L3c java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L56 java.lang.ClassNotFoundException -> L63
                java.lang.Class<com.google.android.datatransport.runtime.backends.BackendFactory> r7 = com.google.android.datatransport.runtime.backends.BackendFactory.class
                java.lang.Class r6 = r6.asSubclass(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.NoSuchMethodException -> L3c java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L56 java.lang.ClassNotFoundException -> L63
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.NoSuchMethodException -> L3c java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L56 java.lang.ClassNotFoundException -> L63
                java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.NoSuchMethodException -> L3c java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L56 java.lang.ClassNotFoundException -> L63
                java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.NoSuchMethodException -> L3c java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L56 java.lang.ClassNotFoundException -> L63
                java.lang.Object r6 = r6.newInstance(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.NoSuchMethodException -> L3c java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L56 java.lang.ClassNotFoundException -> L63
                com.google.android.datatransport.runtime.backends.BackendFactory r6 = (com.google.android.datatransport.runtime.backends.BackendFactory) r6     // Catch: java.lang.reflect.InvocationTargetException -> L2f java.lang.NoSuchMethodException -> L3c java.lang.InstantiationException -> L49 java.lang.IllegalAccessException -> L56 java.lang.ClassNotFoundException -> L63
                return r6
            L2f:
                r1 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r5] = r9
                java.lang.String r9 = java.lang.String.format(r0, r4)
                android.util.Log.w(r2, r9, r1)
                goto L71
            L3c:
                r1 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r5] = r9
                java.lang.String r9 = java.lang.String.format(r0, r4)
                android.util.Log.w(r2, r9, r1)
                goto L71
            L49:
                r0 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r5] = r9
                java.lang.String r9 = java.lang.String.format(r1, r4)
                android.util.Log.w(r2, r9, r0)
                goto L71
            L56:
                r0 = move-exception
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r5] = r9
                java.lang.String r9 = java.lang.String.format(r1, r4)
                android.util.Log.w(r2, r9, r0)
                goto L71
            L63:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r5] = r9
                java.lang.String r9 = "Class %s is not found."
                java.lang.String r9 = java.lang.String.format(r9, r1)
                android.util.Log.w(r2, r9, r0)
            L71:
                return r3
        }
    }

    MetadataBackendRegistry(android.content.Context r2, com.google.android.datatransport.runtime.backends.CreationContextFactory r3) {
            r1 = this;
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry$BackendFactoryProvider r0 = new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry$BackendFactoryProvider
            r0.<init>(r2)
            r1.<init>(r0, r3)
            return
    }

    MetadataBackendRegistry(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider r2, com.google.android.datatransport.runtime.backends.CreationContextFactory r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.backends = r0
            r1.backendFactoryProvider = r2
            r1.creationContextFactory = r3
            return
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public synchronized com.google.android.datatransport.runtime.backends.TransportBackend get(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> r0 = r2.backends     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L13
            java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> r0 = r2.backends     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.android.datatransport.runtime.backends.TransportBackend r3 = (com.google.android.datatransport.runtime.backends.TransportBackend) r3     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return r3
        L13:
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry$BackendFactoryProvider r0 = r2.backendFactoryProvider     // Catch: java.lang.Throwable -> L2f
            com.google.android.datatransport.runtime.backends.BackendFactory r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L1e
            r3 = 0
            monitor-exit(r2)
            return r3
        L1e:
            com.google.android.datatransport.runtime.backends.CreationContextFactory r1 = r2.creationContextFactory     // Catch: java.lang.Throwable -> L2f
            com.google.android.datatransport.runtime.backends.CreationContext r1 = r1.create(r3)     // Catch: java.lang.Throwable -> L2f
            com.google.android.datatransport.runtime.backends.TransportBackend r0 = r0.create(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> r1 = r2.backends     // Catch: java.lang.Throwable -> L2f
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)
            return r0
        L2f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
