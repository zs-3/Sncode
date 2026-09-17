package com.google.firebase.concurrent;

@android.annotation.SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    static final com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> BG_EXECUTOR = null;
    static final com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> BLOCKING_EXECUTOR = null;
    static final com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> LITE_EXECUTOR = null;
    static final com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> SCHEDULER = null;

    /* renamed from: $r8$lambda$B0uxZM3vtzbxsiba-BG0uULoiD4, reason: not valid java name */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService m46$r8$lambda$B0uxZM3vtzbxsibaBG0uULoiD4(com.google.firebase.components.ComponentContainer r0) {
            java.util.concurrent.ScheduledExecutorService r0 = lambda$getComponents$5(r0)
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService $r8$lambda$CPw8Fkb3IUuXxyMDEX7jRTY3RLU() {
            java.util.concurrent.ScheduledExecutorService r0 = lambda$static$3()
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService $r8$lambda$LcRQ6Y9Lyx04G2dP62SABiYdGvk() {
            java.util.concurrent.ScheduledExecutorService r0 = lambda$static$2()
            return r0
    }

    /* renamed from: $r8$lambda$NeK9WbUt-v295kcYOKB69YB08fs, reason: not valid java name */
    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService m47$r8$lambda$NeK9WbUtv295kcYOKB69YB08fs() {
            java.util.concurrent.ScheduledExecutorService r0 = lambda$static$1()
            return r0
    }

    public static /* synthetic */ java.util.concurrent.Executor $r8$lambda$OmRqLzOqJOhYC48xZMdQxijepyk(com.google.firebase.components.ComponentContainer r0) {
            java.util.concurrent.Executor r0 = lambda$getComponents$7(r0)
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService $r8$lambda$SnTBB1AjAOre7G4M8m4LWvmxVDQ(com.google.firebase.components.ComponentContainer r0) {
            java.util.concurrent.ScheduledExecutorService r0 = lambda$getComponents$6(r0)
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService $r8$lambda$TiDqygDBKMAJW7krWBoK3hUmMi4() {
            java.util.concurrent.ScheduledExecutorService r0 = lambda$static$0()
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ScheduledExecutorService $r8$lambda$zUzQedCnza4BjszhsGQ_Vcga9ug(com.google.firebase.components.ComponentContainer r0) {
            java.util.concurrent.ScheduledExecutorService r0 = lambda$getComponents$4(r0)
            return r0
    }

    static {
            com.google.firebase.components.Lazy r0 = new com.google.firebase.components.Lazy
            com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda7 r1 = com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda7.INSTANCE
            r0.<init>(r1)
            com.google.firebase.concurrent.ExecutorsRegistrar.BG_EXECUTOR = r0
            com.google.firebase.components.Lazy r0 = new com.google.firebase.components.Lazy
            com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda6 r1 = com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda6.INSTANCE
            r0.<init>(r1)
            com.google.firebase.concurrent.ExecutorsRegistrar.LITE_EXECUTOR = r0
            com.google.firebase.components.Lazy r0 = new com.google.firebase.components.Lazy
            com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda5 r1 = com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda5.INSTANCE
            r0.<init>(r1)
            com.google.firebase.concurrent.ExecutorsRegistrar.BLOCKING_EXECUTOR = r0
            com.google.firebase.components.Lazy r0 = new com.google.firebase.components.Lazy
            com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda4 r1 = com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda4.INSTANCE
            r0.<init>(r1)
            com.google.firebase.concurrent.ExecutorsRegistrar.SCHEDULER = r0
            return
    }

    public ExecutorsRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.os.StrictMode.ThreadPolicy bgPolicy() {
            android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
            r0.<init>()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.detectNetwork()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L19
            r0.detectResourceMismatches()
            r2 = 26
            if (r1 < r2) goto L19
            r0.detectUnbufferedIo()
        L19:
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.penaltyLog()
            android.os.StrictMode$ThreadPolicy r0 = r0.build()
            return r0
    }

    private static java.util.concurrent.ThreadFactory factory(java.lang.String r2, int r3) {
            com.google.firebase.concurrent.CustomThreadFactory r0 = new com.google.firebase.concurrent.CustomThreadFactory
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    private static java.util.concurrent.ThreadFactory factory(java.lang.String r1, int r2, android.os.StrictMode.ThreadPolicy r3) {
            com.google.firebase.concurrent.CustomThreadFactory r0 = new com.google.firebase.concurrent.CustomThreadFactory
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static /* synthetic */ java.util.concurrent.ScheduledExecutorService lambda$getComponents$4(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> r0 = com.google.firebase.concurrent.ExecutorsRegistrar.BG_EXECUTOR
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            return r0
    }

    private static /* synthetic */ java.util.concurrent.ScheduledExecutorService lambda$getComponents$5(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> r0 = com.google.firebase.concurrent.ExecutorsRegistrar.BLOCKING_EXECUTOR
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            return r0
    }

    private static /* synthetic */ java.util.concurrent.ScheduledExecutorService lambda$getComponents$6(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> r0 = com.google.firebase.concurrent.ExecutorsRegistrar.LITE_EXECUTOR
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            return r0
    }

    private static /* synthetic */ java.util.concurrent.Executor lambda$getComponents$7(com.google.firebase.components.ComponentContainer r0) {
            com.google.firebase.concurrent.UiExecutor r0 = com.google.firebase.concurrent.UiExecutor.INSTANCE
            return r0
    }

    private static /* synthetic */ java.util.concurrent.ScheduledExecutorService lambda$static$0() {
            android.os.StrictMode$ThreadPolicy r0 = bgPolicy()
            java.lang.String r1 = "Firebase Background"
            r2 = 10
            java.util.concurrent.ThreadFactory r0 = factory(r1, r2, r0)
            r1 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            java.util.concurrent.ScheduledExecutorService r0 = scheduled(r0)
            return r0
    }

    private static /* synthetic */ java.util.concurrent.ScheduledExecutorService lambda$static$1() {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            android.os.StrictMode$ThreadPolicy r1 = litePolicy()
            java.lang.String r2 = "Firebase Lite"
            r3 = 0
            java.util.concurrent.ThreadFactory r1 = factory(r2, r3, r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r0, r1)
            java.util.concurrent.ScheduledExecutorService r0 = scheduled(r0)
            return r0
    }

    private static /* synthetic */ java.util.concurrent.ScheduledExecutorService lambda$static$2() {
            java.lang.String r0 = "Firebase Blocking"
            r1 = 11
            java.util.concurrent.ThreadFactory r0 = factory(r0, r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            java.util.concurrent.ScheduledExecutorService r0 = scheduled(r0)
            return r0
    }

    private static /* synthetic */ java.util.concurrent.ScheduledExecutorService lambda$static$3() {
            java.lang.String r0 = "Firebase Scheduler"
            r1 = 0
            java.util.concurrent.ThreadFactory r0 = factory(r0, r1)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            return r0
    }

    private static android.os.StrictMode.ThreadPolicy litePolicy() {
            android.os.StrictMode$ThreadPolicy$Builder r0 = new android.os.StrictMode$ThreadPolicy$Builder
            r0.<init>()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.detectAll()
            android.os.StrictMode$ThreadPolicy$Builder r0 = r0.penaltyLog()
            android.os.StrictMode$ThreadPolicy r0 = r0.build()
            return r0
    }

    private static java.util.concurrent.ScheduledExecutorService scheduled(java.util.concurrent.ExecutorService r2) {
            com.google.firebase.concurrent.DelegatingScheduledExecutorService r0 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService
            com.google.firebase.components.Lazy<java.util.concurrent.ScheduledExecutorService> r1 = com.google.firebase.concurrent.ExecutorsRegistrar.SCHEDULER
            java.lang.Object r1 = r1.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List<com.google.firebase.components.Component<?>> getComponents() {
            r8 = this;
            r0 = 4
            com.google.firebase.components.Component[] r0 = new com.google.firebase.components.Component[r0]
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r1 = com.google.firebase.annotations.concurrent.Background.class
            java.lang.Class<java.util.concurrent.ScheduledExecutorService> r2 = java.util.concurrent.ScheduledExecutorService.class
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.qualified(r1, r2)
            r2 = 2
            com.google.firebase.components.Qualified[] r3 = new com.google.firebase.components.Qualified[r2]
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r4 = com.google.firebase.annotations.concurrent.Background.class
            java.lang.Class<java.util.concurrent.ExecutorService> r5 = java.util.concurrent.ExecutorService.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r5)
            r5 = 0
            r3[r5] = r4
            java.lang.Class<com.google.firebase.annotations.concurrent.Background> r4 = com.google.firebase.annotations.concurrent.Background.class
            java.lang.Class<java.util.concurrent.Executor> r6 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r6)
            r6 = 1
            r3[r6] = r4
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1, r3)
            com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda3 r3 = com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda3.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r3)
            com.google.firebase.components.Component r1 = r1.build()
            r0[r5] = r1
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r1 = com.google.firebase.annotations.concurrent.Blocking.class
            java.lang.Class<java.util.concurrent.ScheduledExecutorService> r3 = java.util.concurrent.ScheduledExecutorService.class
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.qualified(r1, r3)
            com.google.firebase.components.Qualified[] r3 = new com.google.firebase.components.Qualified[r2]
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r4 = com.google.firebase.annotations.concurrent.Blocking.class
            java.lang.Class<java.util.concurrent.ExecutorService> r7 = java.util.concurrent.ExecutorService.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r7)
            r3[r5] = r4
            java.lang.Class<com.google.firebase.annotations.concurrent.Blocking> r4 = com.google.firebase.annotations.concurrent.Blocking.class
            java.lang.Class<java.util.concurrent.Executor> r7 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r7)
            r3[r6] = r4
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1, r3)
            com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda0 r3 = com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r3)
            com.google.firebase.components.Component r1 = r1.build()
            r0[r6] = r1
            java.lang.Class<com.google.firebase.annotations.concurrent.Lightweight> r1 = com.google.firebase.annotations.concurrent.Lightweight.class
            java.lang.Class<java.util.concurrent.ScheduledExecutorService> r3 = java.util.concurrent.ScheduledExecutorService.class
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.qualified(r1, r3)
            com.google.firebase.components.Qualified[] r3 = new com.google.firebase.components.Qualified[r2]
            java.lang.Class<com.google.firebase.annotations.concurrent.Lightweight> r4 = com.google.firebase.annotations.concurrent.Lightweight.class
            java.lang.Class<java.util.concurrent.ExecutorService> r7 = java.util.concurrent.ExecutorService.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r7)
            r3[r5] = r4
            java.lang.Class<com.google.firebase.annotations.concurrent.Lightweight> r4 = com.google.firebase.annotations.concurrent.Lightweight.class
            java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r4 = com.google.firebase.components.Qualified.qualified(r4, r5)
            r3[r6] = r4
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1, r3)
            com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda2 r3 = com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda2.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r3)
            com.google.firebase.components.Component r1 = r1.build()
            r0[r2] = r1
            java.lang.Class<com.google.firebase.annotations.concurrent.UiThread> r1 = com.google.firebase.annotations.concurrent.UiThread.class
            java.lang.Class<java.util.concurrent.Executor> r2 = java.util.concurrent.Executor.class
            com.google.firebase.components.Qualified r1 = com.google.firebase.components.Qualified.qualified(r1, r2)
            com.google.firebase.components.Component$Builder r1 = com.google.firebase.components.Component.builder(r1)
            com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda1 r2 = com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda1.INSTANCE
            com.google.firebase.components.Component$Builder r1 = r1.factory(r2)
            com.google.firebase.components.Component r1 = r1.build()
            r2 = 3
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }
}
