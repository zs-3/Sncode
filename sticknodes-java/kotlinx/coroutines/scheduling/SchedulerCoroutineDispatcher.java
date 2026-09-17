package kotlinx.coroutines.scheduling;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public class SchedulerCoroutineDispatcher extends kotlinx.coroutines.ExecutorCoroutineDispatcher {
    private final int corePoolSize;
    private kotlinx.coroutines.scheduling.CoroutineScheduler coroutineScheduler;
    private final long idleWorkerKeepAliveNs;
    private final int maxPoolSize;
    private final java.lang.String schedulerName;

    public SchedulerCoroutineDispatcher(int r1, int r2, long r3, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.corePoolSize = r1
            r0.maxPoolSize = r2
            r0.idleWorkerKeepAliveNs = r3
            r0.schedulerName = r5
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.createScheduler()
            r0.coroutineScheduler = r1
            return
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler createScheduler() {
            r7 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r6 = new kotlinx.coroutines.scheduling.CoroutineScheduler
            int r1 = r7.corePoolSize
            int r2 = r7.maxPoolSize
            long r3 = r7.idleWorkerKeepAliveNs
            java.lang.String r5 = r7.schedulerName
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return r6
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo128dispatch(kotlin.coroutines.CoroutineContext r7, java.lang.Runnable r8) {
            r6 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.coroutineScheduler
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r1 = r8
            kotlinx.coroutines.scheduling.CoroutineScheduler.dispatch$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final void dispatchWithContext$kotlinx_coroutines_core(java.lang.Runnable r2, kotlinx.coroutines.scheduling.TaskContext r3, boolean r4) {
            r1 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.coroutineScheduler
            r0.dispatch(r2, r3, r4)
            return
    }
}
