package com.google.firebase.sessions;

/* compiled from: FirebaseSessionsRegistrar.kt */
@androidx.annotation.Keep
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion Companion = null;
    private static final java.lang.String LIBRARY_NAME = "fire-sessions";
    private static final com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> backgroundDispatcher = null;
    private static final com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> blockingDispatcher = null;
    private static final com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> firebaseApp = null;
    private static final com.google.firebase.components.Qualified<com.google.firebase.installations.FirebaseInstallationsApi> firebaseInstallationsApi = null;
    private static final com.google.firebase.components.Qualified<com.google.firebase.sessions.SessionLifecycleServiceBinder> sessionLifecycleServiceBinder = null;
    private static final com.google.firebase.components.Qualified<com.google.firebase.sessions.settings.SessionsSettings> sessionsSettings = null;
    private static final com.google.firebase.components.Qualified<com.google.android.datatransport.TransportFactory> transportFactory = null;

    /* compiled from: FirebaseSessionsRegistrar.kt */
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static /* synthetic */ com.google.firebase.sessions.SessionGenerator $r8$lambda$Q6OERAGC9mqKxj0qWwZqIOpqI9s(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.sessions.SessionGenerator r0 = getComponents$lambda$1(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.sessions.settings.SessionsSettings $r8$lambda$Q7QEq71zuXJD_1_ebgkz4jriEqA(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.sessions.settings.SessionsSettings r0 = getComponents$lambda$3(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.sessions.SessionDatastore $r8$lambda$fV67RkmiApJYXSYgybll5xIFueM(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.sessions.SessionDatastore r0 = getComponents$lambda$4(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.sessions.FirebaseSessions $r8$lambda$jqdCK1QUJM7gd1CjmbqxQBIVd3s(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.sessions.FirebaseSessions r0 = getComponents$lambda$0(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.sessions.SessionFirelogPublisher $r8$lambda$qyQx5beM5oDf_KXhjvIRa5Z3JoM(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.sessions.SessionFirelogPublisher r0 = getComponents$lambda$2(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.sessions.SessionLifecycleServiceBinder $r8$lambda$tmSa1uSH7C5fZTLd1q92kjXHnM8(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.sessions.SessionLifecycleServiceBinder r0 = getComponents$lambda$5(r0)
            return r0
    }

    static {
            java.lang.Class<kotlinx.coroutines.CoroutineDispatcher> r0 = kotlinx.coroutines.CoroutineDispatcher.class
            com.google.firebase.sessions.FirebaseSessionsRegistrar$Companion r1 = new com.google.firebase.sessions.FirebaseSessionsRegistrar$Companion
            r2 = 0
            r1.<init>(r2)
            com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion = r1
            java.lang.Class<com.google.firebase.FirebaseApp> r1 = com.google.firebase.FirebaseApp.class
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r1)
            java.lang.String r2 = "unqualified(FirebaseApp::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp = r1
            java.lang.Class<com.google.firebase.installations.FirebaseInstallationsApi> r1 = com.google.firebase.installations.FirebaseInstallationsApi.class
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.unqualified(r1)
            java.lang.String r2 = "unqualified(FirebaseInstallationsApi::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi = r1
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r1 = com.google.firebase.annotations.concurrent.Background.class
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.qualified(r1, r0)
            java.lang.String r2 = "qualified(Background::cl…neDispatcher::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher = r1
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r1 = com.google.firebase.annotations.concurrent.Blocking.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.qualified(r1, r0)
            java.lang.String r1 = "qualified(Blocking::clas…neDispatcher::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.google.firebase.sessions.FirebaseSessionsRegistrar.blockingDispatcher = r0
            java.lang.Class<com.google.android.datatransport.TransportFactory> r0 = com.google.android.datatransport.TransportFactory.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.unqualified(r0)
            java.lang.String r1 = "unqualified(TransportFactory::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.google.firebase.sessions.FirebaseSessionsRegistrar.transportFactory = r0
            java.lang.Class<com.google.firebase.sessions.settings.SessionsSettings> r0 = com.google.firebase.sessions.settings.SessionsSettings.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.unqualified(r0)
            java.lang.String r1 = "unqualified(SessionsSettings::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.google.firebase.sessions.FirebaseSessionsRegistrar.sessionsSettings = r0
            java.lang.Class<com.google.firebase.sessions.SessionLifecycleServiceBinder> r0 = com.google.firebase.sessions.SessionLifecycleServiceBinder.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.unqualified(r0)
            java.lang.String r1 = "unqualified(SessionLifec…erviceBinder::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.google.firebase.sessions.FirebaseSessionsRegistrar.sessionLifecycleServiceBinder = r0
            return
    }

    public FirebaseSessionsRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final com.google.firebase.sessions.FirebaseSessions getComponents$lambda$0(com.google.firebase.components.ComponentContainer r5) {
            com.google.firebase.sessions.FirebaseSessions r0 = new com.google.firebase.sessions.FirebaseSessions
            com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> r1 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r2 = "container[firebaseApp]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.google.firebase.FirebaseApp r1 = (com.google.firebase.FirebaseApp) r1
            com.google.firebase.components.Qualified<com.google.firebase.sessions.settings.SessionsSettings> r2 = com.google.firebase.sessions.FirebaseSessionsRegistrar.sessionsSettings
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r3 = "container[sessionsSettings]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> r3 = com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r4 = "container[backgroundDispatcher]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.google.firebase.components.Qualified<com.google.firebase.sessions.SessionLifecycleServiceBinder> r4 = com.google.firebase.sessions.FirebaseSessionsRegistrar.sessionLifecycleServiceBinder
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r4 = "container[sessionLifecycleServiceBinder]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            com.google.firebase.sessions.SessionLifecycleServiceBinder r5 = (com.google.firebase.sessions.SessionLifecycleServiceBinder) r5
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    private static final com.google.firebase.sessions.SessionGenerator getComponents$lambda$1(com.google.firebase.components.ComponentContainer r3) {
            com.google.firebase.sessions.SessionGenerator r3 = new com.google.firebase.sessions.SessionGenerator
            com.google.firebase.sessions.WallClock r0 = com.google.firebase.sessions.WallClock.INSTANCE
            r1 = 0
            r2 = 2
            r3.<init>(r0, r1, r2, r1)
            return r3
    }

    private static final com.google.firebase.sessions.SessionFirelogPublisher getComponents$lambda$2(com.google.firebase.components.ComponentContainer r7) {
            com.google.firebase.sessions.SessionFirelogPublisherImpl r6 = new com.google.firebase.sessions.SessionFirelogPublisherImpl
            com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> r0 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r1 = "container[firebaseApp]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = r0
            com.google.firebase.FirebaseApp r1 = (com.google.firebase.FirebaseApp) r1
            com.google.firebase.components.Qualified<com.google.firebase.installations.FirebaseInstallationsApi> r0 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r2 = "container[firebaseInstallationsApi]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r2 = r0
            com.google.firebase.installations.FirebaseInstallationsApi r2 = (com.google.firebase.installations.FirebaseInstallationsApi) r2
            com.google.firebase.components.Qualified<com.google.firebase.sessions.settings.SessionsSettings> r0 = com.google.firebase.sessions.FirebaseSessionsRegistrar.sessionsSettings
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r3 = "container[sessionsSettings]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r3 = r0
            com.google.firebase.sessions.settings.SessionsSettings r3 = (com.google.firebase.sessions.settings.SessionsSettings) r3
            com.google.firebase.sessions.EventGDTLogger r4 = new com.google.firebase.sessions.EventGDTLogger
            com.google.firebase.components.Qualified<com.google.android.datatransport.TransportFactory> r0 = com.google.firebase.sessions.FirebaseSessionsRegistrar.transportFactory
            com.google.firebase.inject.Provider r0 = r7.getProvider(r0)
            java.lang.String r5 = "container.getProvider(transportFactory)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            r4.<init>(r0)
            com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> r0 = com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r0 = "container[backgroundDispatcher]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            r5 = r7
            kotlin.coroutines.CoroutineContext r5 = (kotlin.coroutines.CoroutineContext) r5
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    private static final com.google.firebase.sessions.settings.SessionsSettings getComponents$lambda$3(com.google.firebase.components.ComponentContainer r5) {
            com.google.firebase.sessions.settings.SessionsSettings r0 = new com.google.firebase.sessions.settings.SessionsSettings
            com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> r1 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r2 = "container[firebaseApp]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.google.firebase.FirebaseApp r1 = (com.google.firebase.FirebaseApp) r1
            com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> r2 = com.google.firebase.sessions.FirebaseSessionsRegistrar.blockingDispatcher
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r3 = "container[blockingDispatcher]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> r3 = com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r4 = "container[backgroundDispatcher]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.google.firebase.components.Qualified<com.google.firebase.installations.FirebaseInstallationsApi> r4 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r4 = "container[firebaseInstallationsApi]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            com.google.firebase.installations.FirebaseInstallationsApi r5 = (com.google.firebase.installations.FirebaseInstallationsApi) r5
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    private static final com.google.firebase.sessions.SessionDatastore getComponents$lambda$4(com.google.firebase.components.ComponentContainer r3) {
            com.google.firebase.sessions.SessionDatastoreImpl r0 = new com.google.firebase.sessions.SessionDatastoreImpl
            com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> r1 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp
            java.lang.Object r1 = r3.get(r1)
            com.google.firebase.FirebaseApp r1 = (com.google.firebase.FirebaseApp) r1
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r2 = "container[firebaseApp].applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> r2 = com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r2 = "container[backgroundDispatcher]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            r0.<init>(r1, r3)
            return r0
    }

    private static final com.google.firebase.sessions.SessionLifecycleServiceBinder getComponents$lambda$5(com.google.firebase.components.ComponentContainer r2) {
            com.google.firebase.sessions.SessionLifecycleServiceBinderImpl r0 = new com.google.firebase.sessions.SessionLifecycleServiceBinderImpl
            com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> r1 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r1 = "container[firebaseApp]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            com.google.firebase.FirebaseApp r2 = (com.google.firebase.FirebaseApp) r2
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<? extends java.lang.Object>> getComponents() {
            r8 = this;
            r0 = 7
            com.google.firebase.components.Component[] r0 = new com.google.firebase.components.Component[r0]
            java.lang.Class<com.google.firebase.sessions.FirebaseSessions> r1 = com.google.firebase.sessions.FirebaseSessions.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.String r2 = "fire-sessions"
            com.google.firebase.components.Component$Builder r1 = r1.name(r2)
            com.google.firebase.components.Qualified<com.google.firebase.FirebaseApp> r3 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.components.Qualified<com.google.firebase.sessions.settings.SessionsSettings> r4 = com.google.firebase.sessions.FirebaseSessionsRegistrar.sessionsSettings
            com.google.firebase.components.Dependency r5 = com.google.firebase.components.Dependency.required(r4)
            com.google.firebase.components.Component$Builder r1 = r1.add(r5)
            com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> r5 = com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher
            com.google.firebase.components.Dependency r6 = com.google.firebase.components.Dependency.required(r5)
            com.google.firebase.components.Component$Builder r1 = r1.add(r6)
            com.google.firebase.components.Qualified<com.google.firebase.sessions.SessionLifecycleServiceBinder> r6 = com.google.firebase.sessions.FirebaseSessionsRegistrar.sessionLifecycleServiceBinder
            com.google.firebase.components.Dependency r6 = com.google.firebase.components.Dependency.required(r6)
            com.google.firebase.components.Component$Builder r1 = r1.add(r6)
            com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda3 r6 = com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda3.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r6)
            com.google.firebase.components.Component$Builder r1 = r1.eagerInDefaultApp()
            com.google.firebase.components.Component r1 = r1.build()
            r6 = 0
            r0[r6] = r1
            java.lang.Class<com.google.firebase.sessions.SessionGenerator> r1 = com.google.firebase.sessions.SessionGenerator.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.String r6 = "session-generator"
            com.google.firebase.components.Component$Builder r1 = r1.name(r6)
            com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda0 r6 = com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r6)
            com.google.firebase.components.Component r1 = r1.build()
            r6 = 1
            r0[r6] = r1
            java.lang.Class<com.google.firebase.sessions.SessionFirelogPublisher> r1 = com.google.firebase.sessions.SessionFirelogPublisher.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.String r6 = "session-publisher"
            com.google.firebase.components.Component$Builder r1 = r1.name(r6)
            com.google.firebase.components.Dependency r6 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r6)
            com.google.firebase.components.Qualified<com.google.firebase.installations.FirebaseInstallationsApi> r6 = com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi
            com.google.firebase.components.Dependency r7 = com.google.firebase.components.Dependency.required(r6)
            com.google.firebase.components.Component$Builder r1 = r1.add(r7)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r4)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.components.Qualified<com.google.android.datatransport.TransportFactory> r4 = com.google.firebase.sessions.FirebaseSessionsRegistrar.transportFactory
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.requiredProvider(r4)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r5)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda4 r4 = com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda4.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r4)
            com.google.firebase.components.Component r1 = r1.build()
            r4 = 2
            r0[r4] = r1
            java.lang.Class<com.google.firebase.sessions.settings.SessionsSettings> r1 = com.google.firebase.sessions.settings.SessionsSettings.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.String r4 = "sessions-settings"
            com.google.firebase.components.Component$Builder r1 = r1.name(r4)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.components.Qualified<kotlinx.coroutines.CoroutineDispatcher> r4 = com.google.firebase.sessions.FirebaseSessionsRegistrar.blockingDispatcher
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r4)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r5)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r6)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda1 r4 = com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda1.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r4)
            com.google.firebase.components.Component r1 = r1.build()
            r4 = 3
            r0[r4] = r1
            java.lang.Class<com.google.firebase.sessions.SessionDatastore> r1 = com.google.firebase.sessions.SessionDatastore.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.String r4 = "sessions-datastore"
            com.google.firebase.components.Component$Builder r1 = r1.name(r4)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r5)
            com.google.firebase.components.Component$Builder r1 = r1.add(r4)
            com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda2 r4 = com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda2.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r4)
            com.google.firebase.components.Component r1 = r1.build()
            r4 = 4
            r0[r4] = r1
            java.lang.Class<com.google.firebase.sessions.SessionLifecycleServiceBinder> r1 = com.google.firebase.sessions.SessionLifecycleServiceBinder.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.String r4 = "sessions-service-binder"
            com.google.firebase.components.Component$Builder r1 = r1.name(r4)
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda5 r3 = com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda5.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r3)
            com.google.firebase.components.Component r1 = r1.build()
            r3 = 5
            r0[r3] = r1
            java.lang.String r1 = "2.0.5"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r2, r1)
            r2 = 6
            r0[r2] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
    }
}
