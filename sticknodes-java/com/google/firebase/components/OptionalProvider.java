package com.google.firebase.components;

/* loaded from: classes2.dex */
class OptionalProvider<T> implements com.google.firebase.inject.Provider<T>, com.google.firebase.inject.Deferred<T> {
    private static final com.google.firebase.inject.Provider<java.lang.Object> EMPTY_PROVIDER = null;
    private static final com.google.firebase.inject.Deferred.DeferredHandler<java.lang.Object> NOOP_HANDLER = null;
    private volatile com.google.firebase.inject.Provider<T> delegate;
    private com.google.firebase.inject.Deferred.DeferredHandler<T> handler;

    public static /* synthetic */ java.lang.Object $r8$lambda$ILPY1nlr_ULZNpsKMbNjkBMT0Ec() {
            java.lang.Object r0 = lambda$static$1()
            return r0
    }

    public static /* synthetic */ void $r8$lambda$fPOTfPXm7DpPlmwdyImHVqtycpI(com.google.firebase.inject.Provider r0) {
            lambda$static$0(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$zFC_X48ke2E5YYoYo8vfNgc3N8Y(com.google.firebase.inject.Deferred.DeferredHandler r0, com.google.firebase.inject.Deferred.DeferredHandler r1, com.google.firebase.inject.Provider r2) {
            lambda$whenAvailable$2(r0, r1, r2)
            return
    }

    static {
            com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda1 r0 = com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda1.INSTANCE
            com.google.firebase.components.OptionalProvider.NOOP_HANDLER = r0
            com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda2 r0 = com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda2.INSTANCE
            com.google.firebase.components.OptionalProvider.EMPTY_PROVIDER = r0
            return
    }

    private OptionalProvider(com.google.firebase.inject.Deferred.DeferredHandler<T> r1, com.google.firebase.inject.Provider<T> r2) {
            r0 = this;
            r0.<init>()
            r0.handler = r1
            r0.delegate = r2
            return
    }

    static <T> com.google.firebase.components.OptionalProvider<T> empty() {
            com.google.firebase.components.OptionalProvider r0 = new com.google.firebase.components.OptionalProvider
            com.google.firebase.inject.Deferred$DeferredHandler<java.lang.Object> r1 = com.google.firebase.components.OptionalProvider.NOOP_HANDLER
            com.google.firebase.inject.Provider<java.lang.Object> r2 = com.google.firebase.components.OptionalProvider.EMPTY_PROVIDER
            r0.<init>(r1, r2)
            return r0
    }

    private static /* synthetic */ void lambda$static$0(com.google.firebase.inject.Provider r0) {
            return
    }

    private static /* synthetic */ java.lang.Object lambda$static$1() {
            r0 = 0
            return r0
    }

    private static /* synthetic */ void lambda$whenAvailable$2(com.google.firebase.inject.Deferred.DeferredHandler r0, com.google.firebase.inject.Deferred.DeferredHandler r1, com.google.firebase.inject.Provider r2) {
            r0.handle(r2)
            r1.handle(r2)
            return
    }

    static <T> com.google.firebase.components.OptionalProvider<T> of(com.google.firebase.inject.Provider<T> r2) {
            com.google.firebase.components.OptionalProvider r0 = new com.google.firebase.components.OptionalProvider
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.firebase.inject.Provider
    public T get() {
            r1 = this;
            com.google.firebase.inject.Provider<T> r0 = r1.delegate
            java.lang.Object r0 = r0.get()
            return r0
    }

    void set(com.google.firebase.inject.Provider<T> r3) {
            r2 = this;
            com.google.firebase.inject.Provider<T> r0 = r2.delegate
            com.google.firebase.inject.Provider<java.lang.Object> r1 = com.google.firebase.components.OptionalProvider.EMPTY_PROVIDER
            if (r0 != r1) goto L16
            monitor-enter(r2)
            com.google.firebase.inject.Deferred$DeferredHandler<T> r0 = r2.handler     // Catch: java.lang.Throwable -> L13
            r1 = 0
            r2.handler = r1     // Catch: java.lang.Throwable -> L13
            r2.delegate = r3     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            r0.handle(r3)
            return
        L13:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
        L16:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "provide() can be called only once."
            r3.<init>(r0)
            throw r3
    }

    @Override // com.google.firebase.inject.Deferred
    public void whenAvailable(com.google.firebase.inject.Deferred.DeferredHandler<T> r5) {
            r4 = this;
            com.google.firebase.inject.Provider<T> r0 = r4.delegate
            com.google.firebase.inject.Provider<java.lang.Object> r1 = com.google.firebase.components.OptionalProvider.EMPTY_PROVIDER
            if (r0 == r1) goto La
            r5.handle(r0)
            return
        La:
            r0 = 0
            monitor-enter(r4)
            com.google.firebase.inject.Provider<T> r2 = r4.delegate     // Catch: java.lang.Throwable -> L22
            if (r2 == r1) goto L12
            r0 = r2
            goto L1b
        L12:
            com.google.firebase.inject.Deferred$DeferredHandler<T> r1 = r4.handler     // Catch: java.lang.Throwable -> L22
            com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0 r3 = new com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L22
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> L22
            r4.handler = r3     // Catch: java.lang.Throwable -> L22
        L1b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L21
            r5.handle(r2)
        L21:
            return
        L22:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L22
            throw r5
    }
}
