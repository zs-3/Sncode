package com.google.firebase.heartbeatinfo;

/* loaded from: classes2.dex */
public class DefaultHeartBeatController implements com.google.firebase.heartbeatinfo.HeartBeatController, com.google.firebase.heartbeatinfo.HeartBeatInfo {
    private final android.content.Context applicationContext;
    private final java.util.concurrent.Executor backgroundExecutor;
    private final java.util.Set<com.google.firebase.heartbeatinfo.HeartBeatConsumer> consumers;
    private final com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfoStorage> storageProvider;
    private final com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> userAgentProvider;

    public static /* synthetic */ java.lang.Void $r8$lambda$UUZPx8hW0V_ozcVKYhdoH5HkTH0(com.google.firebase.heartbeatinfo.DefaultHeartBeatController r0) {
            java.lang.Void r0 = r0.lambda$registerHeartBeat$0()
            return r0
    }

    public static /* synthetic */ java.lang.String $r8$lambda$XPAPUc1DSouLxVwtmREviKVUuoA(com.google.firebase.heartbeatinfo.DefaultHeartBeatController r0) {
            java.lang.String r0 = r0.lambda$getHeartBeatsHeader$1()
            return r0
    }

    public static /* synthetic */ com.google.firebase.heartbeatinfo.HeartBeatInfoStorage $r8$lambda$e9wvYmF9HQ89hhnXeiCNZyN4iuA(android.content.Context r0, java.lang.String r1) {
            com.google.firebase.heartbeatinfo.HeartBeatInfoStorage r0 = lambda$new$2(r0, r1)
            return r0
    }

    /* renamed from: $r8$lambda$f9LR9_JXukKv6Ee8-VN-gd8cy5Q, reason: not valid java name */
    public static /* synthetic */ com.google.firebase.heartbeatinfo.DefaultHeartBeatController m64$r8$lambda$f9LR9_JXukKv6Ee8VNgd8cy5Q(com.google.firebase.components.Qualified r0, com.google.firebase.components.ComponentContainer r1) {
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController r0 = lambda$component$3(r0, r1)
            return r0
    }

    private DefaultHeartBeatController(android.content.Context r7, java.lang.String r8, java.util.Set<com.google.firebase.heartbeatinfo.HeartBeatConsumer> r9, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> r10, java.util.concurrent.Executor r11) {
            r6 = this;
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda1 r1 = new com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda1
            r1.<init>(r7, r8)
            r0 = r6
            r2 = r9
            r3 = r11
            r4 = r10
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    DefaultHeartBeatController(com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfoStorage> r1, java.util.Set<com.google.firebase.heartbeatinfo.HeartBeatConsumer> r2, java.util.concurrent.Executor r3, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> r4, android.content.Context r5) {
            r0 = this;
            r0.<init>()
            r0.storageProvider = r1
            r0.consumers = r2
            r0.backgroundExecutor = r3
            r0.userAgentProvider = r4
            r0.applicationContext = r5
            return
    }

    public static com.google.firebase.components.Component<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> component() {
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r0 = com.google.firebase.annotations.concurrent.Background.class
            java.lang.Class<java.util.concurrent.Executor> r1 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.qualified(r0, r1)
            java.lang.Class<com.google.firebase.heartbeatinfo.DefaultHeartBeatController> r1 = com.google.firebase.heartbeatinfo.DefaultHeartBeatController.class
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = 0
            java.lang.Class<com.google.firebase.heartbeatinfo.HeartBeatController> r4 = com.google.firebase.heartbeatinfo.HeartBeatController.class
            r2[r3] = r4
            r3 = 1
            java.lang.Class<com.google.firebase.heartbeatinfo.HeartBeatInfo> r4 = com.google.firebase.heartbeatinfo.HeartBeatInfo.class
            r2[r3] = r4
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1, r2)
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            com.google.firebase.components.Dependency r2 = com.google.firebase.components.Dependency.required(r2)
            com.google.firebase.components.Component$Builder r1 = r1.add(r2)
            java.lang.Class<com.google.firebase.FirebaseApp> r2 = com.google.firebase.FirebaseApp.class
            com.google.firebase.components.Dependency r2 = com.google.firebase.components.Dependency.required(r2)
            com.google.firebase.components.Component$Builder r1 = r1.add(r2)
            java.lang.Class<com.google.firebase.heartbeatinfo.HeartBeatConsumer> r2 = com.google.firebase.heartbeatinfo.HeartBeatConsumer.class
            com.google.firebase.components.Dependency r2 = com.google.firebase.components.Dependency.setOf(r2)
            com.google.firebase.components.Component$Builder r1 = r1.add(r2)
            java.lang.Class<com.google.firebase.platforminfo.UserAgentPublisher> r2 = com.google.firebase.platforminfo.UserAgentPublisher.class
            com.google.firebase.components.Dependency r2 = com.google.firebase.components.Dependency.requiredProvider(r2)
            com.google.firebase.components.Component$Builder r1 = r1.add(r2)
            com.google.firebase.components.Dependency r2 = com.google.firebase.components.Dependency.required(r0)
            com.google.firebase.components.Component$Builder r1 = r1.add(r2)
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda0 r2 = new com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda0
            r2.<init>(r0)
            com.google.firebase.components.Component$Builder r0 = r1.factory(r2)
            com.google.firebase.components.Component r0 = r0.build()
            return r0
    }

    private static /* synthetic */ com.google.firebase.heartbeatinfo.DefaultHeartBeatController lambda$component$3(com.google.firebase.components.Qualified r7, com.google.firebase.components.ComponentContainer r8) {
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController r6 = new com.google.firebase.heartbeatinfo.DefaultHeartBeatController
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r0 = r8.get(r0)
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.google.firebase.FirebaseApp> r0 = com.google.firebase.FirebaseApp.class
            java.lang.Object r0 = r8.get(r0)
            com.google.firebase.FirebaseApp r0 = (com.google.firebase.FirebaseApp) r0
            java.lang.String r2 = r0.getPersistenceKey()
            java.lang.Class<com.google.firebase.heartbeatinfo.HeartBeatConsumer> r0 = com.google.firebase.heartbeatinfo.HeartBeatConsumer.class
            java.util.Set r3 = r8.setOf(r0)
            java.lang.Class<com.google.firebase.platforminfo.UserAgentPublisher> r0 = com.google.firebase.platforminfo.UserAgentPublisher.class
            com.google.firebase.inject.Provider r4 = r8.getProvider(r0)
            java.lang.Object r7 = r8.get(r7)
            r5 = r7
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    private /* synthetic */ java.lang.String lambda$getHeartBeatsHeader$1() throws java.lang.Exception {
            r7 = this;
            monitor-enter(r7)
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfoStorage> r0 = r7.storageProvider     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L95
            com.google.firebase.heartbeatinfo.HeartBeatInfoStorage r0 = (com.google.firebase.heartbeatinfo.HeartBeatInfoStorage) r0     // Catch: java.lang.Throwable -> L95
            java.util.List r1 = r0.getAllHeartBeats()     // Catch: java.lang.Throwable -> L95
            r0.deleteAllHeartBeats()     // Catch: java.lang.Throwable -> L95
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            r2 = 0
        L16:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L95
            if (r2 >= r3) goto L44
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L95
            com.google.firebase.heartbeatinfo.HeartBeatResult r3 = (com.google.firebase.heartbeatinfo.HeartBeatResult) r3     // Catch: java.lang.Throwable -> L95
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L95
            r4.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = "agent"
            java.lang.String r6 = r3.getUserAgent()     // Catch: java.lang.Throwable -> L95
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = "dates"
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L95
            java.util.List r3 = r3.getUsedDates()     // Catch: java.lang.Throwable -> L95
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L95
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L95
            r0.put(r4)     // Catch: java.lang.Throwable -> L95
            int r2 = r2 + 1
            goto L16
        L44:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "heartbeats"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "version"
            java.lang.String r2 = "2"
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L95
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L95
            r0.<init>()     // Catch: java.lang.Throwable -> L95
            android.util.Base64OutputStream r2 = new android.util.Base64OutputStream     // Catch: java.lang.Throwable -> L95
            r3 = 11
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L95
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L8b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "UTF-8"
            byte[] r1 = r1.getBytes(r4)     // Catch: java.lang.Throwable -> L81
            r3.write(r1)     // Catch: java.lang.Throwable -> L81
            r3.close()     // Catch: java.lang.Throwable -> L8b
            r2.close()     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = r0.toString(r1)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L95
            return r0
        L81:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L86
            goto L8a
        L86:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L8b
        L8a:
            throw r0     // Catch: java.lang.Throwable -> L8b
        L8b:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L90
            goto L94
        L90:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L95
        L94:
            throw r0     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L95
            throw r0
    }

    private static /* synthetic */ com.google.firebase.heartbeatinfo.HeartBeatInfoStorage lambda$new$2(android.content.Context r1, java.lang.String r2) {
            com.google.firebase.heartbeatinfo.HeartBeatInfoStorage r0 = new com.google.firebase.heartbeatinfo.HeartBeatInfoStorage
            r0.<init>(r1, r2)
            return r0
    }

    private /* synthetic */ java.lang.Void lambda$registerHeartBeat$0() throws java.lang.Exception {
            r4 = this;
            monitor-enter(r4)
            com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfoStorage> r0 = r4.storageProvider     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.heartbeatinfo.HeartBeatInfoStorage r0 = (com.google.firebase.heartbeatinfo.HeartBeatInfoStorage) r0     // Catch: java.lang.Throwable -> L1f
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> r3 = r4.userAgentProvider     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L1f
            com.google.firebase.platforminfo.UserAgentPublisher r3 = (com.google.firebase.platforminfo.UserAgentPublisher) r3     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.getUserAgent()     // Catch: java.lang.Throwable -> L1f
            r0.storeHeartBeat(r1, r3)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            return r0
        L1f:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1f
            throw r0
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public com.google.android.gms.tasks.Task<java.lang.String> getHeartBeatsHeader() {
            r2 = this;
            android.content.Context r0 = r2.applicationContext
            boolean r0 = androidx.core.os.UserManagerCompat.isUserUnlocked(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L11
            java.lang.String r0 = ""
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)
            return r0
        L11:
            java.util.concurrent.Executor r0 = r2.backgroundExecutor
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda3 r1 = new com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda3
            r1.<init>(r2)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.call(r0, r1)
            return r0
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> registerHeartBeat() {
            r2 = this;
            java.util.Set<com.google.firebase.heartbeatinfo.HeartBeatConsumer> r0 = r2.consumers
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto Le
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r1)
            return r0
        Le:
            android.content.Context r0 = r2.applicationContext
            boolean r0 = androidx.core.os.UserManagerCompat.isUserUnlocked(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L1d
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r1)
            return r0
        L1d:
            java.util.concurrent.Executor r0 = r2.backgroundExecutor
            com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda2 r1 = new com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda2
            r1.<init>(r2)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.call(r0, r1)
            return r0
    }
}
