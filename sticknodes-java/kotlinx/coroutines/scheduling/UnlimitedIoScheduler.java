package kotlinx.coroutines.scheduling;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
final class UnlimitedIoScheduler extends kotlinx.coroutines.CoroutineDispatcher {
    public static final kotlinx.coroutines.scheduling.UnlimitedIoScheduler INSTANCE = null;

    static {
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler r0 = new kotlinx.coroutines.scheduling.UnlimitedIoScheduler
            r0.<init>()
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE = r0
            return
    }

    private UnlimitedIoScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo128dispatch(kotlin.coroutines.CoroutineContext r3, java.lang.Runnable r4) {
            r2 = this;
            kotlinx.coroutines.scheduling.DefaultScheduler r3 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.scheduling.TaskContext r0 = kotlinx.coroutines.scheduling.TasksKt.BlockingContext
            r1 = 0
            r3.dispatchWithContext$kotlinx_coroutines_core(r4, r0, r1)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            int r0 = kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE
            if (r2 < r0) goto L8
            return r1
        L8:
            kotlinx.coroutines.CoroutineDispatcher r2 = super.limitedParallelism(r2)
            return r2
    }
}
