package com.google.firebase;

/* compiled from: Firebase.kt */
@androidx.annotation.Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public FirebaseCommonKtxRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.CoroutineDispatcher> r0 = kotlinx.coroutines.CoroutineDispatcher.class
            r1 = 4
            com.google.firebase.components.Component[] r1 = new com.google.firebase.components.Component[r1]
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r2 = com.google.firebase.annotations.concurrent.Background.class
            com.google.firebase.components.Qualified r2 = com.google.firebase.components.Qualified.qualified(r2, r0)
            com.google.firebase.components.Component$Builder r2 = com.google.firebase.components.Component.builder(r2)
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r3 = com.google.firebase.annotations.concurrent.Background.class
            java.lang.Class<java.util.concurrent.Executor> r4 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r3 = com.google.firebase.components.Qualified.qualified(r3, r4)
            com.google.firebase.components.Dependency r3 = com.google.firebase.components.Dependency.required(r3)
            com.google.firebase.components.Component$Builder r2 = r2.add(r3)
            com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1<T> r3 = com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE
            com.google.firebase.components.Component$Builder r2 = r2.factory(r3)
            com.google.firebase.components.Component r2 = r2.build()
            java.lang.String r3 = "builder(Qualified.qualif…cher()\n    }\n    .build()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4 = 0
            r1[r4] = r2
            java.lang.Class<com.google.firebase.annotations.concurrent.Lightweight> r2 = com.google.firebase.annotations.concurrent.Lightweight.class
            com.google.firebase.components.Qualified r2 = com.google.firebase.components.Qualified.qualified(r2, r0)
            com.google.firebase.components.Component$Builder r2 = com.google.firebase.components.Component.builder(r2)
            java.lang.Class<com.google.firebase.annotations.concurrent.Lightweight> r4 = com.google.firebase.annotations.concurrent.Lightweight.class
            java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r5)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r4)
            com.google.firebase.components.Component$Builder r2 = r2.add(r4)
            com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<T> r4 = com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2.INSTANCE
            com.google.firebase.components.Component$Builder r2 = r2.factory(r4)
            com.google.firebase.components.Component r2 = r2.build()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4 = 1
            r1[r4] = r2
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r2 = com.google.firebase.annotations.concurrent.Blocking.class
            com.google.firebase.components.Qualified r2 = com.google.firebase.components.Qualified.qualified(r2, r0)
            com.google.firebase.components.Component$Builder r2 = com.google.firebase.components.Component.builder(r2)
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r4 = com.google.firebase.annotations.concurrent.Blocking.class
            java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r5)
            com.google.firebase.components.Dependency r4 = com.google.firebase.components.Dependency.required(r4)
            com.google.firebase.components.Component$Builder r2 = r2.add(r4)
            com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3<T> r4 = com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3.INSTANCE
            com.google.firebase.components.Component$Builder r2 = r2.factory(r4)
            com.google.firebase.components.Component r2 = r2.build()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4 = 2
            r1[r4] = r2
            java.lang.Class<com.google.firebase.annotations.concurrent.UiThread> r2 = com.google.firebase.annotations.concurrent.UiThread.class
            com.google.firebase.components.Qualified r0 = com.google.firebase.components.Qualified.qualified(r2, r0)
            com.google.firebase.components.Component$Builder r0 = com.google.firebase.components.Component.builder(r0)
            java.lang.Class<com.google.firebase.annotations.concurrent.UiThread> r2 = com.google.firebase.annotations.concurrent.UiThread.class
            java.lang.Class<java.util.concurrent.Executor> r4 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r2 = com.google.firebase.components.Qualified.qualified(r2, r4)
            com.google.firebase.components.Dependency r2 = com.google.firebase.components.Dependency.required(r2)
            com.google.firebase.components.Component$Builder r0 = r0.add(r2)
            com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4<T> r2 = com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4.INSTANCE
            com.google.firebase.components.Component$Builder r0 = r0.factory(r2)
            com.google.firebase.components.Component r0 = r0.build()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r2 = 3
            r1[r2] = r0
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r1)
            return r0
    }
}
