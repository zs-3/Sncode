package com.google.firebase.concurrent;

/* loaded from: classes2.dex */
class DelegatingScheduledExecutorService implements java.util.concurrent.ScheduledExecutorService {
    private final java.util.concurrent.ExecutorService delegate;
    private final java.util.concurrent.ScheduledExecutorService scheduler;

    public static /* synthetic */ java.util.concurrent.ScheduledFuture $r8$lambda$3dD8JtK55qCkKwmMvJ9neUfVdvc(com.google.firebase.concurrent.DelegatingScheduledExecutorService r0, java.lang.Runnable r1, long r2, java.util.concurrent.TimeUnit r4, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r5) {
            java.util.concurrent.ScheduledFuture r0 = r0.lambda$schedule$2(r1, r2, r4, r5)
            return r0
    }

    /* renamed from: $r8$lambda$BSUbF5Pe-wiJEvt_cHLaYWmHN78, reason: not valid java name */
    public static /* synthetic */ void m43$r8$lambda$BSUbF5PewiJEvt_cHLaYWmHN78(java.lang.Runnable r0, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r1) {
            lambda$schedule$0(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$JxZtzR6jdSzRyrmZu4YPnJxj4Kk(com.google.firebase.concurrent.DelegatingScheduledExecutorService r0, java.lang.Runnable r1, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r2) {
            r0.lambda$schedule$1(r1, r2)
            return
    }

    public static /* synthetic */ java.util.concurrent.Future $r8$lambda$YrTqU3zU9UN04Lno_ULTPetLiEo(com.google.firebase.concurrent.DelegatingScheduledExecutorService r0, java.util.concurrent.Callable r1, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r2) {
            java.util.concurrent.Future r0 = r0.lambda$schedule$4(r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.concurrent.ScheduledFuture $r8$lambda$d1jVxrsfYgiflF7RPJaqI3KawAk(com.google.firebase.concurrent.DelegatingScheduledExecutorService r0, java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r7) {
            java.util.concurrent.ScheduledFuture r0 = r0.lambda$scheduleAtFixedRate$8(r1, r2, r4, r6, r7)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$g_S2OtjJCwcTEu128h8erIljgbM(com.google.firebase.concurrent.DelegatingScheduledExecutorService r0, java.lang.Runnable r1, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r2) {
            r0.lambda$scheduleAtFixedRate$7(r1, r2)
            return
    }

    public static /* synthetic */ java.util.concurrent.ScheduledFuture $r8$lambda$lPWqEIYgdSSU85cPGttTuZqk7OU(com.google.firebase.concurrent.DelegatingScheduledExecutorService r0, java.util.concurrent.Callable r1, long r2, java.util.concurrent.TimeUnit r4, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r5) {
            java.util.concurrent.ScheduledFuture r0 = r0.lambda$schedule$5(r1, r2, r4, r5)
            return r0
    }

    /* renamed from: $r8$lambda$rnVdP-Pp7Z5VEd3ZjLkZTqHOlZM, reason: not valid java name */
    public static /* synthetic */ void m44$r8$lambda$rnVdPPp7Z5VEd3ZjLkZTqHOlZM(java.lang.Runnable r0, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r1) {
            lambda$scheduleAtFixedRate$6(r0, r1)
            return
    }

    public static /* synthetic */ java.util.concurrent.ScheduledFuture $r8$lambda$ukf75tO9Kcq5I1llXwQnLgEl2G0(com.google.firebase.concurrent.DelegatingScheduledExecutorService r0, java.lang.Runnable r1, long r2, long r4, java.util.concurrent.TimeUnit r6, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r7) {
            java.util.concurrent.ScheduledFuture r0 = r0.lambda$scheduleWithFixedDelay$11(r1, r2, r4, r6, r7)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$y2nZinuPEf08ZLSLq0vuVOIWB70(java.lang.Runnable r0, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r1) {
            lambda$scheduleWithFixedDelay$9(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$yoljGvHUIDz4eAUXQLt0PkAWsZ4(com.google.firebase.concurrent.DelegatingScheduledExecutorService r0, java.lang.Runnable r1, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r2) {
            r0.lambda$scheduleWithFixedDelay$10(r1, r2)
            return
    }

    /* renamed from: $r8$lambda$zK7CKs2O-9_bdiWMJjJdn8prvL8, reason: not valid java name */
    public static /* synthetic */ void m45$r8$lambda$zK7CKs2O9_bdiWMJjJdn8prvL8(java.util.concurrent.Callable r0, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r1) {
            lambda$schedule$3(r0, r1)
            return
    }

    DelegatingScheduledExecutorService(java.util.concurrent.ExecutorService r1, java.util.concurrent.ScheduledExecutorService r2) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            r0.scheduler = r2
            return
    }

    private static /* synthetic */ void lambda$schedule$0(java.lang.Runnable r0, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r1) {
            r0.run()     // Catch: java.lang.Exception -> L8
            r0 = 0
            r1.set(r0)     // Catch: java.lang.Exception -> L8
            goto Lc
        L8:
            r0 = move-exception
            r1.setException(r0)
        Lc:
            return
    }

    private /* synthetic */ void lambda$schedule$1(java.lang.Runnable r3, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.delegate
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda7 r1 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda7
            r1.<init>(r3, r4)
            r0.execute(r1)
            return
    }

    private /* synthetic */ java.util.concurrent.ScheduledFuture lambda$schedule$2(java.lang.Runnable r3, long r4, java.util.concurrent.TimeUnit r6, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r7) {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r2.scheduler
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda4 r1 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda4
            r1.<init>(r2, r3, r7)
            java.util.concurrent.ScheduledFuture r3 = r0.schedule(r1, r4, r6)
            return r3
    }

    private static /* synthetic */ void lambda$schedule$3(java.util.concurrent.Callable r0, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r1) {
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L8
            r1.set(r0)     // Catch: java.lang.Exception -> L8
            goto Lc
        L8:
            r0 = move-exception
            r1.setException(r0)
        Lc:
            return
    }

    private /* synthetic */ java.util.concurrent.Future lambda$schedule$4(java.util.concurrent.Callable r3, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r4) throws java.lang.Exception {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.delegate
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda10 r1 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda10
            r1.<init>(r3, r4)
            java.util.concurrent.Future r3 = r0.submit(r1)
            return r3
    }

    private /* synthetic */ java.util.concurrent.ScheduledFuture lambda$schedule$5(java.util.concurrent.Callable r3, long r4, java.util.concurrent.TimeUnit r6, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r7) {
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r2.scheduler
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda11 r1 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda11
            r1.<init>(r2, r3, r7)
            java.util.concurrent.ScheduledFuture r3 = r0.schedule(r1, r4, r6)
            return r3
    }

    private static /* synthetic */ void lambda$scheduleAtFixedRate$6(java.lang.Runnable r0, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r1) {
            r0.run()     // Catch: java.lang.Exception -> L4
            return
        L4:
            r0 = move-exception
            r1.setException(r0)
            throw r0
    }

    private /* synthetic */ void lambda$scheduleAtFixedRate$7(java.lang.Runnable r3, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.delegate
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8 r1 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda8
            r1.<init>(r3, r4)
            r0.execute(r1)
            return
    }

    private /* synthetic */ java.util.concurrent.ScheduledFuture lambda$scheduleAtFixedRate$8(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r14) {
            r7 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r7.scheduler
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5 r1 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda5
            r1.<init>(r7, r8, r14)
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleAtFixedRate(r1, r2, r4, r6)
            return r8
    }

    private /* synthetic */ void lambda$scheduleWithFixedDelay$10(java.lang.Runnable r3, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.delegate
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda9 r1 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda9
            r1.<init>(r3, r4)
            r0.execute(r1)
            return
    }

    private /* synthetic */ java.util.concurrent.ScheduledFuture lambda$scheduleWithFixedDelay$11(java.lang.Runnable r8, long r9, long r11, java.util.concurrent.TimeUnit r13, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r14) {
            r7 = this;
            java.util.concurrent.ScheduledExecutorService r0 = r7.scheduler
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda6 r1 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda6
            r1.<init>(r7, r8, r14)
            r2 = r9
            r4 = r11
            r6 = r13
            java.util.concurrent.ScheduledFuture r8 = r0.scheduleWithFixedDelay(r1, r2, r4, r6)
            return r8
    }

    private static /* synthetic */ void lambda$scheduleWithFixedDelay$9(java.lang.Runnable r0, com.google.firebase.concurrent.DelegatingScheduledFuture.Completer r1) {
            r0.run()     // Catch: java.lang.Exception -> L4
            goto L8
        L4:
            r0 = move-exception
            r1.setException(r0)
        L8:
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r2 = r0.awaitTermination(r2, r4)
            return r2
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            r0.execute(r2)
            return
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r2 = r0.invokeAll(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.List r2 = r0.invokeAll(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Object r2 = r0.invokeAny(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r2, long r3, java.util.concurrent.TimeUnit r5) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.lang.Object r2 = r0.invokeAny(r2, r3, r5)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r0 = r0.isShutdown()
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            boolean r0 = r0.isTerminated()
            return r0
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable r9, long r10, java.util.concurrent.TimeUnit r12) {
            r8 = this;
            com.google.firebase.concurrent.DelegatingScheduledFuture r0 = new com.google.firebase.concurrent.DelegatingScheduledFuture
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda2 r7 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda2
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r6)
            r0.<init>(r7)
            return r0
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> r9, long r10, java.util.concurrent.TimeUnit r12) {
            r8 = this;
            com.google.firebase.concurrent.DelegatingScheduledFuture r0 = new com.google.firebase.concurrent.DelegatingScheduledFuture
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda3 r7 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda3
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r6)
            r0.<init>(r7)
            return r0
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable r11, long r12, long r14, java.util.concurrent.TimeUnit r16) {
            r10 = this;
            com.google.firebase.concurrent.DelegatingScheduledFuture r0 = new com.google.firebase.concurrent.DelegatingScheduledFuture
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda0 r9 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r8 = r16
            r1.<init>(r2, r3, r4, r6, r8)
            r0.<init>(r9)
            return r0
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable r11, long r12, long r14, java.util.concurrent.TimeUnit r16) {
            r10 = this;
            com.google.firebase.concurrent.DelegatingScheduledFuture r0 = new com.google.firebase.concurrent.DelegatingScheduledFuture
            com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda1 r9 = new com.google.firebase.concurrent.DelegatingScheduledExecutorService$$ExternalSyntheticLambda1
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r14
            r8 = r16
            r1.<init>(r2, r3, r4, r6, r8)
            r0.<init>(r9)
            return r0
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Shutting down is not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.List<java.lang.Runnable> shutdownNow() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Shutting down is not allowed."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.concurrent.ExecutorService
    public java.util.concurrent.Future<?> submit(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.lang.Runnable r2, T r3) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2, r3)
            return r2
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.delegate
            java.util.concurrent.Future r2 = r0.submit(r2)
            return r2
    }
}
