package kotlinx.coroutines.internal;

/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes2.dex */
public final class LimitedDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements kotlinx.coroutines.Delay {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater runningWorkers$FU = null;
    private final /* synthetic */ kotlinx.coroutines.Delay $$delegate_0;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final int parallelism;
    private final kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> queue;
    private volatile int runningWorkers;
    private final java.lang.Object workerAllocationLock;

    /* compiled from: LimitedDispatcher.kt */
    private final class Worker implements java.lang.Runnable {
        private java.lang.Runnable currentTask;
        final /* synthetic */ kotlinx.coroutines.internal.LimitedDispatcher this$0;

        public Worker(kotlinx.coroutines.internal.LimitedDispatcher r1, java.lang.Runnable r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.currentTask = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                r0 = 0
            L1:
                java.lang.Runnable r1 = r3.currentTask     // Catch: java.lang.Throwable -> L7
                r1.run()     // Catch: java.lang.Throwable -> L7
                goto Ld
            L7:
                r1 = move-exception
                kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r2, r1)
            Ld:
                kotlinx.coroutines.internal.LimitedDispatcher r1 = r3.this$0
                java.lang.Runnable r1 = kotlinx.coroutines.internal.LimitedDispatcher.access$obtainTaskOrDeallocateWorker(r1)
                if (r1 != 0) goto L16
                return
            L16:
                r3.currentTask = r1
                int r0 = r0 + 1
                r1 = 16
                if (r0 < r1) goto L1
                kotlinx.coroutines.internal.LimitedDispatcher r1 = r3.this$0
                kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.internal.LimitedDispatcher.access$getDispatcher$p(r1)
                kotlinx.coroutines.internal.LimitedDispatcher r2 = r3.this$0
                boolean r1 = r1.isDispatchNeeded(r2)
                if (r1 == 0) goto L1
                kotlinx.coroutines.internal.LimitedDispatcher r0 = r3.this$0
                kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.internal.LimitedDispatcher.access$getDispatcher$p(r0)
                kotlinx.coroutines.internal.LimitedDispatcher r1 = r3.this$0
                r0.mo128dispatch(r1, r3)
                return
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.internal.LimitedDispatcher> r0 = kotlinx.coroutines.internal.LimitedDispatcher.class
            java.lang.String r1 = "runningWorkers"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.LimitedDispatcher.runningWorkers$FU = r0
            return
    }

    public LimitedDispatcher(kotlinx.coroutines.CoroutineDispatcher r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.dispatcher = r1
            r0.parallelism = r2
            boolean r2 = r1 instanceof kotlinx.coroutines.Delay
            if (r2 == 0) goto Le
            kotlinx.coroutines.Delay r1 = (kotlinx.coroutines.Delay) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 != 0) goto L15
            kotlinx.coroutines.Delay r1 = kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay()
        L15:
            r0.$$delegate_0 = r1
            kotlinx.coroutines.internal.LockFreeTaskQueue r1 = new kotlinx.coroutines.internal.LockFreeTaskQueue
            r2 = 0
            r1.<init>(r2)
            r0.queue = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.workerAllocationLock = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.CoroutineDispatcher access$getDispatcher$p(kotlinx.coroutines.internal.LimitedDispatcher r0) {
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.dispatcher
            return r0
    }

    public static final /* synthetic */ java.lang.Runnable access$obtainTaskOrDeallocateWorker(kotlinx.coroutines.internal.LimitedDispatcher r0) {
            java.lang.Runnable r0 = r0.obtainTaskOrDeallocateWorker()
            return r0
    }

    private final java.lang.Runnable obtainTaskOrDeallocateWorker() {
            r3 = this;
        L0:
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r0 = r3.queue
            java.lang.Object r0 = r0.removeFirstOrNull()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L25
            java.lang.Object r0 = r3.workerAllocationLock
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.LimitedDispatcher.runningWorkers$FU     // Catch: java.lang.Throwable -> L22
            r1.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r2 = r3.queue     // Catch: java.lang.Throwable -> L22
            int r2 = r2.getSize()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1d
            r1 = 0
            monitor-exit(r0)
            return r1
        L1d:
            r1.incrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L0
        L22:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L25:
            return r0
    }

    private final boolean tryAllocateWorker() {
            r4 = this;
            java.lang.Object r0 = r4.workerAllocationLock
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.LimitedDispatcher.runningWorkers$FU     // Catch: java.lang.Throwable -> L16
            int r2 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            int r3 = r4.parallelism     // Catch: java.lang.Throwable -> L16
            if (r2 < r3) goto L10
            r1 = 0
            monitor-exit(r0)
            return r1
        L10:
            r1.incrementAndGet(r4)     // Catch: java.lang.Throwable -> L16
            r1 = 1
            monitor-exit(r0)
            return r1
        L16:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo128dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2) {
            r0 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueue<java.lang.Runnable> r1 = r0.queue
            r1.addLast(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.internal.LimitedDispatcher.runningWorkers$FU
            int r1 = r1.get(r0)
            int r2 = r0.parallelism
            if (r1 >= r2) goto L26
            boolean r1 = r0.tryAllocateWorker()
            if (r1 == 0) goto L26
            java.lang.Runnable r1 = r0.obtainTaskOrDeallocateWorker()
            if (r1 != 0) goto L1c
            goto L26
        L1c:
            kotlinx.coroutines.internal.LimitedDispatcher$Worker r2 = new kotlinx.coroutines.internal.LimitedDispatcher$Worker
            r2.<init>(r0, r1)
            kotlinx.coroutines.CoroutineDispatcher r1 = r0.dispatcher
            r1.mo128dispatch(r0, r2)
        L26:
            return
    }
}
