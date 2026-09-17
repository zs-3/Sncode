package androidx.startup;

/* loaded from: classes.dex */
public final class AppInitializer {
    private static volatile androidx.startup.AppInitializer sInstance;
    private static final java.lang.Object sLock = null;
    final android.content.Context mContext;
    final java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> mDiscovered;
    final java.util.Map<java.lang.Class<?>, java.lang.Object> mInitialized;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.startup.AppInitializer.sLock = r0
            return
    }

    AppInitializer(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.mContext = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.mDiscovered = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.mInitialized = r1
            return
    }

    public static androidx.startup.AppInitializer getInstance(android.content.Context r2) {
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.sInstance
            if (r0 != 0) goto L17
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            androidx.startup.AppInitializer r1 = androidx.startup.AppInitializer.sInstance     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            androidx.startup.AppInitializer r1 = new androidx.startup.AppInitializer     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            androidx.startup.AppInitializer.sInstance = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
        L17:
            androidx.startup.AppInitializer r2 = androidx.startup.AppInitializer.sInstance
            return r2
    }

    void discoverAndInitialize() {
            r6 = this;
            java.lang.String r0 = "Startup"
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.Context r1 = r6.mContext     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.Class<androidx.startup.InitializationProvider> r2 = androidx.startup.InitializationProvider.class
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.Context r1 = r6.mContext     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            r2 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r0 = r1.getProviderInfo(r0, r2)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            android.content.Context r1 = r6.mContext     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            int r2 = androidx.startup.R$string.androidx_startup     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r0 == 0) goto L67
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.util.Set r3 = r0.keySet()     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
        L3b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r4 == 0) goto L67
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            r5 = 0
            java.lang.String r5 = r0.getString(r4, r5)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            boolean r5 = r1.equals(r5)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r5 == 0) goto L3b
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.Class<androidx.startup.Initializer> r5 = androidx.startup.Initializer.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r5 == 0) goto L3b
            java.util.Set<java.lang.Class<? extends androidx.startup.Initializer<?>>> r5 = r6.mDiscovered     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            r5.add(r4)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            r6.doInitialize(r4, r2)     // Catch: java.lang.Throwable -> L6b java.lang.ClassNotFoundException -> L6d android.content.pm.PackageManager.NameNotFoundException -> L6f
            goto L3b
        L67:
            androidx.tracing.Trace.endSection()
            return
        L6b:
            r0 = move-exception
            goto L76
        L6d:
            r0 = move-exception
            goto L70
        L6f:
            r0 = move-exception
        L70:
            androidx.startup.StartupException r1 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            throw r1     // Catch: java.lang.Throwable -> L6b
        L76:
            androidx.tracing.Trace.endSection()
            throw r0
    }

    <T> T doInitialize(java.lang.Class<? extends androidx.startup.Initializer<?>> r6, java.util.Set<java.lang.Class<?>> r7) {
            r5 = this;
            java.lang.Object r0 = androidx.startup.AppInitializer.sLock
            monitor-enter(r0)
            boolean r1 = androidx.tracing.Trace.isEnabled()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L10
            java.lang.String r1 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L8c
            androidx.tracing.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> L8c
        L10:
            boolean r1 = r7.contains(r6)     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            if (r1 != 0) goto L77
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r5.mInitialized     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L8c
            if (r1 != 0) goto L6c
            r7.add(r6)     // Catch: java.lang.Throwable -> L8c
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L65
            java.lang.reflect.Constructor r1 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L65
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L65
            androidx.startup.Initializer r1 = (androidx.startup.Initializer) r1     // Catch: java.lang.Throwable -> L65
            java.util.List r2 = r1.dependencies()     // Catch: java.lang.Throwable -> L65
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L56
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L65
        L3e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L65
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L65
            java.util.Map<java.lang.Class<?>, java.lang.Object> r4 = r5.mInitialized     // Catch: java.lang.Throwable -> L65
            boolean r4 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L3e
            r5.doInitialize(r3, r7)     // Catch: java.lang.Throwable -> L65
            goto L3e
        L56:
            android.content.Context r2 = r5.mContext     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.create(r2)     // Catch: java.lang.Throwable -> L65
            r7.remove(r6)     // Catch: java.lang.Throwable -> L65
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r5.mInitialized     // Catch: java.lang.Throwable -> L65
            r7.put(r6, r1)     // Catch: java.lang.Throwable -> L65
            goto L72
        L65:
            r6 = move-exception
            androidx.startup.StartupException r7 = new androidx.startup.StartupException     // Catch: java.lang.Throwable -> L8c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            throw r7     // Catch: java.lang.Throwable -> L8c
        L6c:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r7 = r5.mInitialized     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r1 = r7.get(r6)     // Catch: java.lang.Throwable -> L8c
        L72:
            androidx.tracing.Trace.endSection()     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            return r1
        L77:
            java.lang.String r7 = "Cannot initialize %s. Cycle detected."
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L8c
            r1[r2] = r6     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = java.lang.String.format(r7, r1)     // Catch: java.lang.Throwable -> L8c
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8c
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r6 = move-exception
            androidx.tracing.Trace.endSection()     // Catch: java.lang.Throwable -> L91
            throw r6     // Catch: java.lang.Throwable -> L91
        L91:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L91
            throw r6
    }
}
