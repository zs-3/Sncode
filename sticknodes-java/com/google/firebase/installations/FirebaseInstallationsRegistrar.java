package com.google.firebase.installations;

@androidx.annotation.Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-installations";

    /* renamed from: $r8$lambda$S-TGqLUnPeNlFWH4x9vB3gPxkgs, reason: not valid java name */
    public static /* synthetic */ com.google.firebase.installations.FirebaseInstallationsApi m67$r8$lambda$STGqLUnPeNlFWH4x9vB3gPxkgs(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.installations.FirebaseInstallationsApi r0 = lambda$getComponents$0(r0)
            return r0
    }

    public FirebaseInstallationsRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ com.google.firebase.installations.FirebaseInstallationsApi lambda$getComponents$0(com.google.firebase.components.ComponentContainer r6) {
            com.google.firebase.installations.FirebaseInstallations r0 = new com.google.firebase.installations.FirebaseInstallations
            java.lang.Class<com.google.firebase.FirebaseApp> r1 = com.google.firebase.FirebaseApp.class
            java.lang.Object r1 = r6.get(r1)
            com.google.firebase.FirebaseApp r1 = (com.google.firebase.FirebaseApp) r1
            java.lang.Class<com.google.firebase.heartbeatinfo.HeartBeatController> r2 = com.google.firebase.heartbeatinfo.HeartBeatController.class
            com.google.firebase.inject.Provider r2 = r6.getProvider(r2)
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r3 = com.google.firebase.annotations.concurrent.Background.class
            java.lang.Class<java.util.concurrent.ExecutorService> r4 = java.util.concurrent.ExecutorService.class
            com.google.firebase.components.Qualified r3 = com.google.firebase.components.Qualified.qualified(r3, r4)
            java.lang.Object r3 = r6.get(r3)
            java.util.concurrent.ExecutorService r3 = (java.util.concurrent.ExecutorService) r3
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r4 = com.google.firebase.annotations.concurrent.Blocking.class
            java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r5)
            java.lang.Object r6 = r6.get(r4)
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            java.util.concurrent.Executor r6 = com.google.firebase.concurrent.FirebaseExecutors.newSequentialExecutor(r6)
            r0.<init>(r1, r2, r3, r6)
            return r0
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
            r5 = this;
            r0 = 3
            com.google.firebase.components.Component[] r0 = new com.google.firebase.components.Component[r0]
            java.lang.Class<com.google.firebase.installations.FirebaseInstallationsApi> r1 = com.google.firebase.installations.FirebaseInstallationsApi.class
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            java.lang.String r2 = "fire-installations"
            com.google.firebase.components.Component$Builder r1 = r1.name(r2)
            java.lang.Class<com.google.firebase.FirebaseApp> r3 = com.google.firebase.FirebaseApp.class
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            java.lang.Class<com.google.firebase.heartbeatinfo.HeartBeatController> r3 = com.google.firebase.heartbeatinfo.HeartBeatController.class
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.optionalProvider(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r3 = com.google.firebase.annotations.concurrent.Background.class
            java.lang.Class<java.util.concurrent.ExecutorService> r4 = java.util.concurrent.ExecutorService.class
            com.google.firebase.components.Qualified r3 = com.google.firebase.components.Qualified.qualified(r3, r4)
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r3 = com.google.firebase.annotations.concurrent.Blocking.class
            java.lang.Class<java.util.concurrent.Executor> r4 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r3 = com.google.firebase.components.Qualified.qualified(r3, r4)
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r1 = r1.add(r3)
            com.google.firebase.installations.FirebaseInstallationsRegistrar$$ExternalSyntheticLambda0 r3 = com.google.firebase.installations.FirebaseInstallationsRegistrar$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r3)
            com.google.firebase.components.Component r1 = r1.build()
            r3 = 0
            r0[r3] = r1
            com.google.firebase.components.Component r1 = com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent.create()
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "18.0.0"
            com.google.firebase.components.Component r1 = com.google.firebase.platforminfo.LibraryVersionComponent.create(r2, r1)
            r2 = 2
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }
}
