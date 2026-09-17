package kotlinx.coroutines.scheduling;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class DefaultScheduler extends kotlinx.coroutines.scheduling.SchedulerCoroutineDispatcher {
    public static final kotlinx.coroutines.scheduling.DefaultScheduler INSTANCE = null;

    static {
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = new kotlinx.coroutines.scheduling.DefaultScheduler
            r0.<init>()
            kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE = r0
            return
    }

    private DefaultScheduler() {
            r6 = this;
            int r1 = kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE
            int r2 = kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE
            long r3 = kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS
            java.lang.String r5 = kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dispatchers.Default cannot be closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }
}
