package com.google.firebase;

/* loaded from: classes2.dex */
public class FirebaseApp {
    static final java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> INSTANCES = null;
    private static final java.lang.Object LOCK = null;
    private final android.content.Context applicationContext;
    private final java.util.concurrent.atomic.AtomicBoolean automaticResourceManagementEnabled;
    private final java.util.List<com.google.firebase.FirebaseApp.BackgroundStateChangeListener> backgroundStateChangeListeners;
    private final com.google.firebase.components.ComponentRuntime componentRuntime;
    private final com.google.firebase.components.Lazy<com.google.firebase.internal.DataCollectionConfigStorage> dataCollectionConfigStorage;
    private final com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> defaultHeartBeatController;
    private final java.util.concurrent.atomic.AtomicBoolean deleted;
    private final java.util.List<com.google.firebase.FirebaseAppLifecycleListener> lifecycleListeners;
    private final java.lang.String name;
    private final com.google.firebase.FirebaseOptions options;

    @com.google.android.gms.common.annotation.KeepForSdk
    public interface BackgroundStateChangeListener {
        @com.google.android.gms.common.annotation.KeepForSdk
        void onBackgroundStateChanged(boolean r1);
    }

    @android.annotation.TargetApi(14)
    private static class GlobalBackgroundStateListener implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
        private static java.util.concurrent.atomic.AtomicReference<com.google.firebase.FirebaseApp.GlobalBackgroundStateListener> INSTANCE;

        static {
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                com.google.firebase.FirebaseApp.GlobalBackgroundStateListener.INSTANCE = r0
                return
        }

        private GlobalBackgroundStateListener() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$000(android.content.Context r0) {
                ensureBackgroundStateListenerRegistered(r0)
                return
        }

        private static void ensureBackgroundStateListenerRegistered(android.content.Context r3) {
                boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich()
                if (r0 == 0) goto L35
                android.content.Context r0 = r3.getApplicationContext()
                boolean r0 = r0 instanceof android.app.Application
                if (r0 != 0) goto Lf
                goto L35
            Lf:
                android.content.Context r3 = r3.getApplicationContext()
                android.app.Application r3 = (android.app.Application) r3
                java.util.concurrent.atomic.AtomicReference<com.google.firebase.FirebaseApp$GlobalBackgroundStateListener> r0 = com.google.firebase.FirebaseApp.GlobalBackgroundStateListener.INSTANCE
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L35
                com.google.firebase.FirebaseApp$GlobalBackgroundStateListener r0 = new com.google.firebase.FirebaseApp$GlobalBackgroundStateListener
                r0.<init>()
                java.util.concurrent.atomic.AtomicReference<com.google.firebase.FirebaseApp$GlobalBackgroundStateListener> r1 = com.google.firebase.FirebaseApp.GlobalBackgroundStateListener.INSTANCE
                r2 = 0
                boolean r1 = r1.compareAndSet(r2, r0)
                if (r1 == 0) goto L35
                com.google.android.gms.common.api.internal.BackgroundDetector.initialize(r3)
                com.google.android.gms.common.api.internal.BackgroundDetector r3 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
                r3.addListener(r0)
            L35:
                return
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean r5) {
                r4 = this;
                java.lang.Object r0 = com.google.firebase.FirebaseApp.access$200()
                monitor-enter(r0)
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
                java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> r2 = com.google.firebase.FirebaseApp.INSTANCES     // Catch: java.lang.Throwable -> L30
                java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L30
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L30
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L30
            L14:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L30
                if (r2 == 0) goto L2e
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L30
                com.google.firebase.FirebaseApp r2 = (com.google.firebase.FirebaseApp) r2     // Catch: java.lang.Throwable -> L30
                java.util.concurrent.atomic.AtomicBoolean r3 = com.google.firebase.FirebaseApp.access$400(r2)     // Catch: java.lang.Throwable -> L30
                boolean r3 = r3.get()     // Catch: java.lang.Throwable -> L30
                if (r3 == 0) goto L14
                com.google.firebase.FirebaseApp.access$500(r2, r5)     // Catch: java.lang.Throwable -> L30
                goto L14
            L2e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                return
            L30:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
                throw r5
        }
    }

    @android.annotation.TargetApi(24)
    private static class UserUnlockReceiver extends android.content.BroadcastReceiver {
        private static java.util.concurrent.atomic.AtomicReference<com.google.firebase.FirebaseApp.UserUnlockReceiver> INSTANCE;
        private final android.content.Context applicationContext;

        static {
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                com.google.firebase.FirebaseApp.UserUnlockReceiver.INSTANCE = r0
                return
        }

        public UserUnlockReceiver(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.applicationContext = r1
                return
        }

        static /* synthetic */ void access$100(android.content.Context r0) {
                ensureReceiverRegistered(r0)
                return
        }

        private static void ensureReceiverRegistered(android.content.Context r3) {
                java.util.concurrent.atomic.AtomicReference<com.google.firebase.FirebaseApp$UserUnlockReceiver> r0 = com.google.firebase.FirebaseApp.UserUnlockReceiver.INSTANCE
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L20
                com.google.firebase.FirebaseApp$UserUnlockReceiver r0 = new com.google.firebase.FirebaseApp$UserUnlockReceiver
                r0.<init>(r3)
                java.util.concurrent.atomic.AtomicReference<com.google.firebase.FirebaseApp$UserUnlockReceiver> r1 = com.google.firebase.FirebaseApp.UserUnlockReceiver.INSTANCE
                r2 = 0
                boolean r1 = r1.compareAndSet(r2, r0)
                if (r1 == 0) goto L20
                android.content.IntentFilter r1 = new android.content.IntentFilter
                java.lang.String r2 = "android.intent.action.USER_UNLOCKED"
                r1.<init>(r2)
                r3.registerReceiver(r0, r1)
            L20:
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                java.lang.Object r2 = com.google.firebase.FirebaseApp.access$200()
                monitor-enter(r2)
                java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> r3 = com.google.firebase.FirebaseApp.INSTANCES     // Catch: java.lang.Throwable -> L24
                java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L24
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L24
            Lf:
                boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L24
                if (r0 == 0) goto L1f
                java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L24
                com.google.firebase.FirebaseApp r0 = (com.google.firebase.FirebaseApp) r0     // Catch: java.lang.Throwable -> L24
                com.google.firebase.FirebaseApp.access$300(r0)     // Catch: java.lang.Throwable -> L24
                goto Lf
            L1f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
                r1.unregister()
                return
            L24:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
                throw r3
        }

        public void unregister() {
                r1 = this;
                android.content.Context r0 = r1.applicationContext
                r0.unregisterReceiver(r1)
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$1j8sEbcm6EHAOy4qwafhcX4hrLA(com.google.firebase.FirebaseApp r0, boolean r1) {
            r0.lambda$new$1(r1)
            return
    }

    public static /* synthetic */ com.google.firebase.internal.DataCollectionConfigStorage $r8$lambda$9ws5O6gd5EXcjP128HrkgXg52EE(com.google.firebase.FirebaseApp r0, android.content.Context r1) {
            com.google.firebase.internal.DataCollectionConfigStorage r0 = r0.lambda$new$0(r1)
            return r0
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.firebase.FirebaseApp.LOCK = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            com.google.firebase.FirebaseApp.INSTANCES = r0
            return
    }

    protected FirebaseApp(android.content.Context r5, java.lang.String r6, com.google.firebase.FirebaseOptions r7) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r4.automaticResourceManagementEnabled = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r4.deleted = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.backgroundStateChangeListeners = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r4.lifecycleListeners = r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            android.content.Context r0 = (android.content.Context) r0
            r4.applicationContext = r0
            java.lang.String r6 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            r4.name = r6
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.firebase.FirebaseOptions r6 = (com.google.firebase.FirebaseOptions) r6
            r4.options = r6
            com.google.firebase.StartupTime r6 = com.google.firebase.provider.FirebaseInitProvider.getStartupTime()
            java.lang.String r0 = "Firebase"
            com.google.firebase.tracing.FirebaseTrace.pushTrace(r0)
            java.lang.String r0 = "ComponentDiscovery"
            com.google.firebase.tracing.FirebaseTrace.pushTrace(r0)
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r0 = com.google.firebase.components.ComponentDiscoveryService.class
            com.google.firebase.components.ComponentDiscovery r0 = com.google.firebase.components.ComponentDiscovery.forContext(r5, r0)
            java.util.List r0 = r0.discoverLazy()
            com.google.firebase.tracing.FirebaseTrace.popTrace()
            java.lang.String r2 = "Runtime"
            com.google.firebase.tracing.FirebaseTrace.pushTrace(r2)
            com.google.firebase.concurrent.UiExecutor r2 = com.google.firebase.concurrent.UiExecutor.INSTANCE
            com.google.firebase.components.ComponentRuntime$Builder r2 = com.google.firebase.components.ComponentRuntime.builder(r2)
            com.google.firebase.components.ComponentRuntime$Builder r0 = r2.addLazyComponentRegistrars(r0)
            com.google.firebase.FirebaseCommonRegistrar r2 = new com.google.firebase.FirebaseCommonRegistrar
            r2.<init>()
            com.google.firebase.components.ComponentRuntime$Builder r0 = r0.addComponentRegistrar(r2)
            com.google.firebase.concurrent.ExecutorsRegistrar r2 = new com.google.firebase.concurrent.ExecutorsRegistrar
            r2.<init>()
            com.google.firebase.components.ComponentRuntime$Builder r0 = r0.addComponentRegistrar(r2)
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r3 = new java.lang.Class[r1]
            com.google.firebase.components.Component r2 = com.google.firebase.components.Component.of(r5, r2, r3)
            com.google.firebase.components.ComponentRuntime$Builder r0 = r0.addComponent(r2)
            java.lang.Class<com.google.firebase.FirebaseApp> r2 = com.google.firebase.FirebaseApp.class
            java.lang.Class[] r3 = new java.lang.Class[r1]
            com.google.firebase.components.Component r2 = com.google.firebase.components.Component.of(r4, r2, r3)
            com.google.firebase.components.ComponentRuntime$Builder r0 = r0.addComponent(r2)
            java.lang.Class<com.google.firebase.FirebaseOptions> r2 = com.google.firebase.FirebaseOptions.class
            java.lang.Class[] r3 = new java.lang.Class[r1]
            com.google.firebase.components.Component r7 = com.google.firebase.components.Component.of(r7, r2, r3)
            com.google.firebase.components.ComponentRuntime$Builder r7 = r0.addComponent(r7)
            com.google.firebase.tracing.ComponentMonitor r0 = new com.google.firebase.tracing.ComponentMonitor
            r0.<init>()
            com.google.firebase.components.ComponentRuntime$Builder r7 = r7.setProcessor(r0)
            boolean r0 = androidx.core.os.UserManagerCompat.isUserUnlocked(r5)
            if (r0 == 0) goto Lb6
            boolean r0 = com.google.firebase.provider.FirebaseInitProvider.isCurrentlyInitializing()
            if (r0 == 0) goto Lb6
            java.lang.Class<com.google.firebase.StartupTime> r0 = com.google.firebase.StartupTime.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            com.google.firebase.components.Component r6 = com.google.firebase.components.Component.of(r6, r0, r1)
            r7.addComponent(r6)
        Lb6:
            com.google.firebase.components.ComponentRuntime r6 = r7.build()
            r4.componentRuntime = r6
            com.google.firebase.tracing.FirebaseTrace.popTrace()
            com.google.firebase.components.Lazy r7 = new com.google.firebase.components.Lazy
            com.google.firebase.FirebaseApp$$ExternalSyntheticLambda1 r0 = new com.google.firebase.FirebaseApp$$ExternalSyntheticLambda1
            r0.<init>(r4, r5)
            r7.<init>(r0)
            r4.dataCollectionConfigStorage = r7
            java.lang.Class<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> r5 = com.google.firebase.heartbeatinfo.DefaultHeartBeatController.class
            com.google.firebase.inject.Provider r5 = r6.getProvider(r5)
            r4.defaultHeartBeatController = r5
            com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0 r5 = new com.google.firebase.FirebaseApp$$ExternalSyntheticLambda0
            r5.<init>(r4)
            r4.addBackgroundStateChangeListener(r5)
            com.google.firebase.tracing.FirebaseTrace.popTrace()
            return
    }

    static /* synthetic */ java.lang.Object access$200() {
            java.lang.Object r0 = com.google.firebase.FirebaseApp.LOCK
            return r0
    }

    static /* synthetic */ void access$300(com.google.firebase.FirebaseApp r0) {
            r0.initializeAllApis()
            return
    }

    static /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$400(com.google.firebase.FirebaseApp r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.automaticResourceManagementEnabled
            return r0
    }

    static /* synthetic */ void access$500(com.google.firebase.FirebaseApp r0, boolean r1) {
            r0.notifyBackgroundStateChangeListeners(r1)
            return
    }

    private void checkNotDeleted() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.deleted
            boolean r0 = r0.get()
            r0 = r0 ^ 1
            java.lang.String r1 = "FirebaseApp was deleted"
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)
            return
    }

    public static com.google.firebase.FirebaseApp getInstance() {
            java.lang.Object r0 = com.google.firebase.FirebaseApp.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> r1 = com.google.firebase.FirebaseApp.INSTANCES     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "[DEFAULT]"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3c
            com.google.firebase.FirebaseApp r1 = (com.google.firebase.FirebaseApp) r1     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L1c
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> r2 = r1.defaultHeartBeatController     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L3c
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController r2 = (com.google.firebase.heartbeatinfo.DefaultHeartBeatController) r2     // Catch: java.lang.Throwable -> L3c
            r2.registerHeartBeat()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r1
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r2.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "Default FirebaseApp is not initialized in this process "
            r2.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = com.google.android.gms.common.util.ProcessUtils.getMyProcessName()     // Catch: java.lang.Throwable -> L3c
            r2.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = ". Make sure to call FirebaseApp.initializeApp(Context) first."
            r2.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r1
    }

    private void initializeAllApis() {
            r3 = this;
            android.content.Context r0 = r3.applicationContext
            boolean r0 = androidx.core.os.UserManagerCompat.isUserUnlocked(r0)
            r0 = r0 ^ 1
            java.lang.String r1 = "FirebaseApp"
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "
            r0.append(r2)
            java.lang.String r2 = r3.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r1, r0)
            android.content.Context r0 = r3.applicationContext
            com.google.firebase.FirebaseApp.UserUnlockReceiver.access$100(r0)
            goto L56
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Device unlocked: initializing all Firebase APIs for app "
            r0.append(r2)
            java.lang.String r2 = r3.getName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r1, r0)
            com.google.firebase.components.ComponentRuntime r0 = r3.componentRuntime
            boolean r1 = r3.isDefaultApp()
            r0.initializeEagerComponents(r1)
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> r0 = r3.defaultHeartBeatController
            java.lang.Object r0 = r0.get()
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController r0 = (com.google.firebase.heartbeatinfo.DefaultHeartBeatController) r0
            r0.registerHeartBeat()
        L56:
            return
    }

    public static com.google.firebase.FirebaseApp initializeApp(android.content.Context r3) {
            java.lang.Object r0 = com.google.firebase.FirebaseApp.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> r1 = com.google.firebase.FirebaseApp.INSTANCES     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "[DEFAULT]"
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L13
            com.google.firebase.FirebaseApp r3 = getInstance()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r3
        L13:
            com.google.firebase.FirebaseOptions r1 = com.google.firebase.FirebaseOptions.fromResource(r3)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L23
            java.lang.String r3 = "FirebaseApp"
            java.lang.String r1 = "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project."
            android.util.Log.w(r3, r1)     // Catch: java.lang.Throwable -> L29
            r3 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r3
        L23:
            com.google.firebase.FirebaseApp r3 = initializeApp(r3, r1)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r3
        L29:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
    }

    public static com.google.firebase.FirebaseApp initializeApp(android.content.Context r1, com.google.firebase.FirebaseOptions r2) {
            java.lang.String r0 = "[DEFAULT]"
            com.google.firebase.FirebaseApp r1 = initializeApp(r1, r2, r0)
            return r1
    }

    public static com.google.firebase.FirebaseApp initializeApp(android.content.Context r5, com.google.firebase.FirebaseOptions r6, java.lang.String r7) {
            com.google.firebase.FirebaseApp.GlobalBackgroundStateListener.access$000(r5)
            java.lang.String r7 = normalize(r7)
            android.content.Context r0 = r5.getApplicationContext()
            if (r0 != 0) goto Le
            goto L12
        Le:
            android.content.Context r5 = r5.getApplicationContext()
        L12:
            java.lang.Object r0 = com.google.firebase.FirebaseApp.LOCK
            monitor-enter(r0)
            java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> r1 = com.google.firebase.FirebaseApp.INSTANCES     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r1.containsKey(r7)     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r3.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "FirebaseApp name "
            r3.append(r4)     // Catch: java.lang.Throwable -> L4b
            r3.append(r7)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = " already exists!"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "Application context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r2)     // Catch: java.lang.Throwable -> L4b
            com.google.firebase.FirebaseApp r2 = new com.google.firebase.FirebaseApp     // Catch: java.lang.Throwable -> L4b
            r2.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L4b
            r1.put(r7, r2)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            r2.initializeAllApis()
            return r2
        L4b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r5
    }

    private /* synthetic */ com.google.firebase.internal.DataCollectionConfigStorage lambda$new$0(android.content.Context r5) {
            r4 = this;
            com.google.firebase.internal.DataCollectionConfigStorage r0 = new com.google.firebase.internal.DataCollectionConfigStorage
            java.lang.String r1 = r4.getPersistenceKey()
            com.google.firebase.components.ComponentRuntime r2 = r4.componentRuntime
            java.lang.Class<com.google.firebase.events.Publisher> r3 = com.google.firebase.events.Publisher.class
            java.lang.Object r2 = r2.get(r3)
            com.google.firebase.events.Publisher r2 = (com.google.firebase.events.Publisher) r2
            r0.<init>(r5, r1, r2)
            return r0
    }

    private /* synthetic */ void lambda$new$1(boolean r1) {
            r0 = this;
            if (r1 != 0) goto Ld
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> r1 = r0.defaultHeartBeatController
            java.lang.Object r1 = r1.get()
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController r1 = (com.google.firebase.heartbeatinfo.DefaultHeartBeatController) r1
            r1.registerHeartBeat()
        Ld:
            return
    }

    private static java.lang.String normalize(java.lang.String r0) {
            java.lang.String r0 = r0.trim()
            return r0
    }

    private void notifyBackgroundStateChangeListeners(boolean r3) {
            r2 = this;
            java.lang.String r0 = "FirebaseApp"
            java.lang.String r1 = "Notifying background state change listeners."
            android.util.Log.d(r0, r1)
            java.util.List<com.google.firebase.FirebaseApp$BackgroundStateChangeListener> r0 = r2.backgroundStateChangeListeners
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.firebase.FirebaseApp$BackgroundStateChangeListener r1 = (com.google.firebase.FirebaseApp.BackgroundStateChangeListener) r1
            r1.onBackgroundStateChanged(r3)
            goto Ld
        L1d:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void addBackgroundStateChangeListener(com.google.firebase.FirebaseApp.BackgroundStateChangeListener r2) {
            r1 = this;
            r1.checkNotDeleted()
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.automaticResourceManagementEnabled
            boolean r0 = r0.get()
            if (r0 == 0) goto L19
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            boolean r0 = r0.isInBackground()
            if (r0 == 0) goto L19
            r0 = 1
            r2.onBackgroundStateChanged(r0)
        L19:
            java.util.List<com.google.firebase.FirebaseApp$BackgroundStateChangeListener> r0 = r1.backgroundStateChangeListeners
            r0.add(r2)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void addLifecycleEventListener(com.google.firebase.FirebaseAppLifecycleListener r2) {
            r1 = this;
            r1.checkNotDeleted()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.List<com.google.firebase.FirebaseAppLifecycleListener> r0 = r1.lifecycleListeners
            r0.add(r2)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.firebase.FirebaseApp
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.String r0 = r1.name
            com.google.firebase.FirebaseApp r2 = (com.google.firebase.FirebaseApp) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public <T> T get(java.lang.Class<T> r2) {
            r1 = this;
            r1.checkNotDeleted()
            com.google.firebase.components.ComponentRuntime r0 = r1.componentRuntime
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public android.content.Context getApplicationContext() {
            r1 = this;
            r1.checkNotDeleted()
            android.content.Context r0 = r1.applicationContext
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            r1.checkNotDeleted()
            java.lang.String r0 = r1.name
            return r0
    }

    public com.google.firebase.FirebaseOptions getOptions() {
            r1 = this;
            r1.checkNotDeleted()
            com.google.firebase.FirebaseOptions r0 = r1.options
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String getPersistenceKey() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getName()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r1 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(r1)
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            com.google.firebase.FirebaseOptions r1 = r3.getOptions()
            java.lang.String r1 = r1.getApplicationId()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r1 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.name
            int r0 = r0.hashCode()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
            r1 = this;
            r1.checkNotDeleted()
            com.google.firebase.components.Lazy<com.google.firebase.internal.DataCollectionConfigStorage> r0 = r1.dataCollectionConfigStorage
            java.lang.Object r0 = r0.get()
            com.google.firebase.internal.DataCollectionConfigStorage r0 = (com.google.firebase.internal.DataCollectionConfigStorage) r0
            boolean r0 = r0.isEnabled()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isDefaultApp() {
            r2 = this;
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = r3.name
            java.lang.String r2 = "name"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            com.google.firebase.FirebaseOptions r1 = r3.options
            java.lang.String r2 = "options"
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
