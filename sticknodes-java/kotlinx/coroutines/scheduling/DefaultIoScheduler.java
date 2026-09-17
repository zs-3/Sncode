package kotlinx.coroutines.scheduling;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class DefaultIoScheduler extends kotlinx.coroutines.ExecutorCoroutineDispatcher implements java.util.concurrent.Executor {
    public static final kotlinx.coroutines.scheduling.DefaultIoScheduler INSTANCE = null;

    /* renamed from: default, reason: not valid java name */
    private static final kotlinx.coroutines.CoroutineDispatcher f0default = null;

    static {
            kotlinx.coroutines.scheduling.DefaultIoScheduler r0 = new kotlinx.coroutines.scheduling.DefaultIoScheduler
            r0.<init>()
            kotlinx.coroutines.scheduling.DefaultIoScheduler.INSTANCE = r0
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler r0 = kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE
            int r1 = kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS()
            r2 = 64
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r1)
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = 0
            int r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.limitedParallelism(r1)
            kotlinx.coroutines.scheduling.DefaultIoScheduler.f0default = r0
            return
    }

    private DefaultIoScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot be invoked on Dispatchers.IO"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo128dispatch(kotlin.coroutines.CoroutineContext r2, java.lang.Runnable r3) {
            r1 = this;
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.scheduling.DefaultIoScheduler.f0default
            r0.mo128dispatch(r2, r3)
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r2) {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r1.mo128dispatch(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }
}
