package com.google.firebase.crashlytics;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private final com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> backgroundExecutorService;
    private final com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> blockingExecutorService;

    public static /* synthetic */ com.google.firebase.crashlytics.FirebaseCrashlytics $r8$lambda$Pfd5XmDCFzNyAT9o9H6rDnTBQE4(com.google.firebase.crashlytics.CrashlyticsRegistrar r0, com.google.firebase.components.ComponentContainer r1) {
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = r0.buildCrashlytics(r1)
            return r0
    }

    static {
            com.google.firebase.sessions.api.SessionSubscriber$Name r0 = com.google.firebase.sessions.api.SessionSubscriber.Name.CRASHLYTICS
            com.google.firebase.sessions.api.FirebaseSessionsDependencies.addDependency(r0)
            return
    }

    public CrashlyticsRegistrar() {
            r2 = this;
            r2.<init>()
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r0 = com.google.firebase.annotations.concurrent.Background.class
            java.lang.Class<java.util.concurrent.ExecutorService> r1 = java.util.concurrent.ExecutorService.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.qualified(r0, r1)
            r2.backgroundExecutorService = r0
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r0 = com.google.firebase.annotations.concurrent.Blocking.class
            java.lang.Class<java.util.concurrent.ExecutorService> r1 = java.util.concurrent.ExecutorService.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.qualified(r0, r1)
            r2.blockingExecutorService = r0
            return
    }

    private com.google.firebase.crashlytics.FirebaseCrashlytics buildCrashlytics(com.google.firebase.components.ComponentContainer r11) {
            r10 = this;
            r0 = 0
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.setEnforcement(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Class<com.google.firebase.FirebaseApp> r2 = com.google.firebase.FirebaseApp.class
            java.lang.Object r2 = r11.get(r2)
            r3 = r2
            com.google.firebase.FirebaseApp r3 = (com.google.firebase.FirebaseApp) r3
            java.lang.Class<com.google.firebase.installations.FirebaseInstallationsApi> r2 = com.google.firebase.installations.FirebaseInstallationsApi.class
            java.lang.Object r2 = r11.get(r2)
            r4 = r2
            com.google.firebase.installations.FirebaseInstallationsApi r4 = (com.google.firebase.installations.FirebaseInstallationsApi) r4
            java.lang.Class<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r2 = com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent.class
            com.google.firebase.inject.Deferred r5 = r11.getDeferred(r2)
            java.lang.Class<com.google.firebase.analytics.connector.AnalyticsConnector> r2 = com.google.firebase.analytics.connector.AnalyticsConnector.class
            com.google.firebase.inject.Deferred r6 = r11.getDeferred(r2)
            java.lang.Class<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> r2 = com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop.class
            com.google.firebase.inject.Deferred r7 = r11.getDeferred(r2)
            com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> r2 = r10.backgroundExecutorService
            java.lang.Object r2 = r11.get(r2)
            r8 = r2
            java.util.concurrent.ExecutorService r8 = (java.util.concurrent.ExecutorService) r8
            com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> r2 = r10.blockingExecutorService
            java.lang.Object r11 = r11.get(r2)
            r9 = r11
            java.util.concurrent.ExecutorService r9 = (java.util.concurrent.ExecutorService) r9
            com.google.firebase.crashlytics.FirebaseCrashlytics r11 = com.google.firebase.crashlytics.FirebaseCrashlytics.init(r3, r4, r5, r6, r7, r8, r9)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r0 = 16
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L6a
            com.google.firebase.crashlytics.internal.Logger r0 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Initializing Crashlytics blocked main for "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = " ms"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
        L6a:
            return r11
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
            r4 = this;
            r0 = 2
            com.google.firebase.components.Component[] r0 = new com.google.firebase.components.Component[r0]
            java.lang.Class<com.google.firebase.crashlytics.FirebaseCrashlytics> r1 = com.google.firebase.crashlytics.FirebaseCrashlytics.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.String r2 = "fire-cls"
            com.google.firebase.components.Component$Builder r1 = r1.name(r2)
            java.lang.Class<com.google.firebase.FirebaseApp> r3 = com.google.firebase.FirebaseApp.class
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            java.lang.Class<com.google.firebase.installations.FirebaseInstallationsApi> r3 = com.google.firebase.installations.FirebaseInstallationsApi.class
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> r3 = r4.backgroundExecutorService
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            com.google.firebase.components.Qualified<java.util.concurrent.ExecutorService> r3 = r4.blockingExecutorService
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            java.lang.Class<com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent> r3 = com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent.class
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.deferred(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            java.lang.Class<com.google.firebase.analytics.connector.AnalyticsConnector> r3 = com.google.firebase.analytics.connector.AnalyticsConnector.class
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.deferred(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            java.lang.Class<com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop> r3 = com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop.class
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.deferred(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            com.google.firebase.crashlytics.CrashlyticsRegistrar$$ExternalSyntheticLambda0 r3 = new com.google.firebase.crashlytics.CrashlyticsRegistrar$$ExternalSyntheticLambda0
            r3.<init>(r4)
            com.google.firebase.components.Component$Builder r1 = r1.factory(r3)
            com.google.firebase.components.Component$Builder r1 = r1.eagerInDefaultApp()
            com.google.firebase.components.Component r1 = r1.build()
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "19.2.0"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r2, r1)
            r2 = 1
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }
}
