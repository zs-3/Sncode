package kotlinx.coroutines.scheduling;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class TasksKt {
    public static final kotlinx.coroutines.scheduling.TaskContext BlockingContext = null;
    public static final int CORE_POOL_SIZE = 0;
    public static final java.lang.String DEFAULT_SCHEDULER_NAME = null;
    public static final long IDLE_WORKER_KEEP_ALIVE_NS = 0;
    public static final int MAX_POOL_SIZE = 0;
    public static final kotlinx.coroutines.scheduling.TaskContext NonBlockingContext = null;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS = 0;
    public static kotlinx.coroutines.scheduling.SchedulerTimeSource schedulerTimeSource;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            java.lang.String r1 = "DefaultDispatcher"
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1)
            kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME = r0
            java.lang.String r1 = "kotlinx.coroutines.scheduler.resolution.ns"
            r2 = 100000(0x186a0, double:4.94066E-319)
            r4 = 0
            r6 = 0
            r8 = 12
            r9 = 0
            long r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r4, r6, r8, r9)
            kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS = r0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS()
            r1 = 2
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r1)
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            r4 = 1
            r5 = 0
            r6 = 8
            r7 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE = r0
            java.lang.String r1 = "kotlinx.coroutines.scheduler.max.pool.size"
            r2 = 2097150(0x1ffffe, float:2.938733E-39)
            r3 = 0
            r4 = 2097150(0x1ffffe, float:2.938733E-39)
            r5 = 4
            r6 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            r4 = 0
            r6 = 0
            long r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r4, r6, r8, r9)
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS = r0
            kotlinx.coroutines.scheduling.NanoTimeSource r0 = kotlinx.coroutines.scheduling.NanoTimeSource.INSTANCE
            kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource = r0
            kotlinx.coroutines.scheduling.TaskContextImpl r0 = new kotlinx.coroutines.scheduling.TaskContextImpl
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext = r0
            kotlinx.coroutines.scheduling.TaskContextImpl r0 = new kotlinx.coroutines.scheduling.TaskContextImpl
            r1 = 1
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.TasksKt.BlockingContext = r0
            return
    }
}
