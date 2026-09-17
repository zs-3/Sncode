package kotlinx.coroutines;

/* compiled from: Executors.kt */
/* loaded from: classes2.dex */
public final class ExecutorCoroutineDispatcherImpl extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements kotlinx.coroutines.Delay {
    private final java.util.concurrent.Executor executor;

    public ExecutorCoroutineDispatcherImpl(java.util.concurrent.Executor r1) {
            r0 = this;
            r0.<init>()
            r0.executor = r1
            java.util.concurrent.Executor r1 = r0.getExecutor()
            kotlinx.coroutines.internal.ConcurrentKt.removeFutureOnCancel(r1)
            return
    }

    private final void cancelJobOnRejection(kotlin.coroutines.CoroutineContext r2, java.util.concurrent.RejectedExecutionException r3) {
            r1 = this;
            java.lang.String r0 = "The task was rejected"
            java.util.concurrent.CancellationException r3 = kotlinx.coroutines.ExceptionsKt.CancellationException(r0, r3)
            kotlinx.coroutines.JobKt.cancel(r2, r3)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.getExecutor()
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L11
            r0.shutdown()
        L11:
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo128dispatch(kotlin.coroutines.CoroutineContext r2, java.lang.Runnable r3) {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.getExecutor()     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            r0.execute(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> Lb
            goto L19
        Lb:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            r1.cancelJobOnRejection(r2, r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()
            r0.mo128dispatch(r2, r3)
        L19:
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            if (r0 == 0) goto L12
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r2 = (kotlinx.coroutines.ExecutorCoroutineDispatcherImpl) r2
            java.util.concurrent.Executor r2 = r2.getExecutor()
            java.util.concurrent.Executor r0 = r1.getExecutor()
            if (r2 != r0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public java.util.concurrent.Executor getExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.getExecutor()
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.getExecutor()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
