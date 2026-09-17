package kotlinx.coroutines.scheduling;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes2.dex */
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {
    public static final kotlinx.coroutines.scheduling.CoroutineScheduler.Companion Companion = null;
    public static final kotlinx.coroutines.internal.Symbol NOT_IN_STACK = null;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isTerminated$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater parkedWorkersStack$FU = null;
    private volatile int _isTerminated;
    private volatile long controlState;
    public final int corePoolSize;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalBlockingQueue;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile long parkedWorkersStack;
    public final java.lang.String schedulerName;
    public final kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> workers;

    /* compiled from: CoroutineScheduler.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public final class Worker extends java.lang.Thread {
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater workerCtl$FU = null;
        private volatile int indexInArray;
        public final kotlinx.coroutines.scheduling.WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile java.lang.Object nextParkedWorker;
        private int rngState;
        public kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state;
        private final kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.Task> stolenTask;
        private long terminationDeadline;
        final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler this$0;
        private volatile int workerCtl;

        static {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.class
                java.lang.String r1 = "workerCtl"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU = r0
                return
        }

        private Worker(kotlinx.coroutines.scheduling.CoroutineScheduler r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.setDaemon(r1)
                kotlinx.coroutines.scheduling.WorkQueue r1 = new kotlinx.coroutines.scheduling.WorkQueue
                r1.<init>()
                r0.localQueue = r1
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                r0.stolenTask = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r0.state = r1
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
                r0.nextParkedWorker = r1
                kotlin.random.Random$Default r1 = kotlin.random.Random.Default
                int r1 = r1.nextInt()
                r0.rngState = r1
                return
        }

        public Worker(kotlinx.coroutines.scheduling.CoroutineScheduler r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.setIndexInArray(r2)
                return
        }

        public static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler access$getThis$0$p(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r0) {
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r0.this$0
                return r0
        }

        private final void afterTask(int r4) {
                r3 = this;
                if (r4 != 0) goto L3
                return
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r3.this$0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$FU$p()
                r1 = -2097152(0xffffffffffe00000, double:NaN)
                r0.addAndGet(r4, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = r3.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r4 == r0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r3.state = r4
            L19:
                return
        }

        private final void beforeTask(int r1) {
                r0 = this;
                if (r1 != 0) goto L3
                return
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                boolean r1 = r0.tryReleaseCpu(r1)
                if (r1 == 0) goto L10
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.this$0
                r1.signalCpuWork()
            L10:
                return
        }

        private final void executeTask(kotlinx.coroutines.scheduling.Task r3) {
                r2 = this;
                kotlinx.coroutines.scheduling.TaskContext r0 = r3.taskContext
                int r0 = r0.getTaskMode()
                r2.idleReset(r0)
                r2.beforeTask(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.this$0
                r1.runSafely(r3)
                r2.afterTask(r0)
                return
        }

        private final kotlinx.coroutines.scheduling.Task findAnyTask(boolean r2) {
                r1 = this;
                if (r2 == 0) goto L2c
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r1.this$0
                int r2 = r2.corePoolSize
                int r2 = r2 * 2
                int r2 = r1.nextInt(r2)
                if (r2 != 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                if (r2 == 0) goto L1a
                kotlinx.coroutines.scheduling.Task r0 = r1.pollGlobalQueues()
                if (r0 == 0) goto L1a
                return r0
            L1a:
                kotlinx.coroutines.scheduling.WorkQueue r0 = r1.localQueue
                kotlinx.coroutines.scheduling.Task r0 = r0.poll()
                if (r0 == 0) goto L23
                return r0
            L23:
                if (r2 != 0) goto L33
                kotlinx.coroutines.scheduling.Task r2 = r1.pollGlobalQueues()
                if (r2 == 0) goto L33
                return r2
            L2c:
                kotlinx.coroutines.scheduling.Task r2 = r1.pollGlobalQueues()
                if (r2 == 0) goto L33
                return r2
            L33:
                r2 = 3
                kotlinx.coroutines.scheduling.Task r2 = r1.trySteal(r2)
                return r2
        }

        private final kotlinx.coroutines.scheduling.Task findBlockingTask() {
                r1 = this;
                kotlinx.coroutines.scheduling.WorkQueue r0 = r1.localQueue
                kotlinx.coroutines.scheduling.Task r0 = r0.pollBlocking()
                if (r0 != 0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 != 0) goto L19
                r0 = 1
                kotlinx.coroutines.scheduling.Task r0 = r1.trySteal(r0)
            L19:
                return r0
        }

        public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater getWorkerCtl$FU() {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU
                return r0
        }

        private final void idleReset(int r3) {
                r2 = this;
                r0 = 0
                r2.terminationDeadline = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = r2.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                if (r3 != r0) goto Le
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                r2.state = r3
            Le:
                return
        }

        private final boolean inStack() {
                r2 = this;
                java.lang.Object r0 = r2.nextParkedWorker
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
                if (r0 == r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        private final void park() {
                r6 = this;
                long r0 = r6.terminationDeadline
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L13
                long r0 = java.lang.System.nanoTime()
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r6.this$0
                long r4 = r4.idleWorkerKeepAliveNs
                long r0 = r0 + r4
                r6.terminationDeadline = r0
            L13:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.this$0
                long r0 = r0.idleWorkerKeepAliveNs
                java.util.concurrent.locks.LockSupport.parkNanos(r0)
                long r0 = java.lang.System.nanoTime()
                long r4 = r6.terminationDeadline
                long r0 = r0 - r4
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L2a
                r6.terminationDeadline = r2
                r6.tryTerminateWorker()
            L2a:
                return
        }

        private final kotlinx.coroutines.scheduling.Task pollGlobalQueues() {
                r1 = this;
                r0 = 2
                int r0 = r1.nextInt(r0)
                if (r0 != 0) goto L1f
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalCpuQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 == 0) goto L14
                return r0
            L14:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                return r0
            L1f:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 == 0) goto L2c
                return r0
            L2c:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalCpuQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                return r0
        }

        private final void runWorker() {
                r7 = this;
                r0 = 0
            L1:
                r1 = 0
            L2:
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r7.this$0
                boolean r2 = r2.isTerminated()
                if (r2 != 0) goto L40
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = r7.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r2 == r3) goto L40
                boolean r2 = r7.mayHaveLocalTasks
                kotlinx.coroutines.scheduling.Task r2 = r7.findTask(r2)
                r3 = 0
                if (r2 == 0) goto L20
                r7.minDelayUntilStealableTaskNs = r3
                r7.executeTask(r2)
                goto L1
            L20:
                r7.mayHaveLocalTasks = r0
                long r5 = r7.minDelayUntilStealableTaskNs
                int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r2 == 0) goto L3c
                if (r1 != 0) goto L2c
                r1 = 1
                goto L2
            L2c:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r7.tryReleaseCpu(r1)
                java.lang.Thread.interrupted()
                long r1 = r7.minDelayUntilStealableTaskNs
                java.util.concurrent.locks.LockSupport.parkNanos(r1)
                r7.minDelayUntilStealableTaskNs = r3
                goto L1
            L3c:
                r7.tryPark()
                goto L2
            L40:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r7.tryReleaseCpu(r0)
                return
        }

        private final boolean tryAcquireCpuPermit() {
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r10.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 0
                r3 = 1
                if (r0 != r1) goto La
            L8:
                r2 = 1
                goto L3c
            La:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r10.this$0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$FU$p()
            L10:
                long r6 = r1.get(r0)
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r8 = 42
                long r4 = r4 >> r8
                int r5 = (int) r4
                if (r5 != 0) goto L22
                r0 = 0
                goto L35
            L22:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$FU$p()
                r5 = r0
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto L10
                r0 = 1
            L35:
                if (r0 == 0) goto L3c
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r10.state = r0
                goto L8
            L3c:
                return r2
        }

        private final void tryPark() {
                r3 = this;
                boolean r0 = r3.inStack()
                if (r0 != 0) goto Lc
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.this$0
                r0.parkedWorkersStackPush(r3)
                return
            Lc:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU
                r1 = -1
                r0.set(r3, r1)
            L12:
                boolean r0 = r3.inStack()
                if (r0 == 0) goto L3b
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU
                int r0 = r0.get(r3)
                if (r0 != r1) goto L3b
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.this$0
                boolean r0 = r0.isTerminated()
                if (r0 != 0) goto L3b
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r0 != r2) goto L2f
                goto L3b
            L2f:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r3.tryReleaseCpu(r0)
                java.lang.Thread.interrupted()
                r3.park()
                goto L12
            L3b:
                return
        }

        private final kotlinx.coroutines.scheduling.Task trySteal(int r19) {
                r18 = this;
                r0 = r18
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.this$0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$FU$p()
                long r1 = r2.get(r1)
                r3 = 2097151(0x1fffff, double:1.0361303E-317)
                long r1 = r1 & r3
                int r2 = (int) r1
                r1 = 0
                r3 = 2
                if (r2 >= r3) goto L16
                return r1
            L16:
                int r3 = r0.nextInt(r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r0.this$0
                r5 = 0
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r8 = r6
            L23:
                r10 = 0
                if (r5 >= r2) goto L5f
                r12 = 1
                int r3 = r3 + r12
                if (r3 <= r2) goto L2c
                r3 = 1
            L2c:
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r12 = r4.workers
                java.lang.Object r12 = r12.get(r3)
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r12 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r12
                if (r12 == 0) goto L5a
                if (r12 == r0) goto L5a
                kotlinx.coroutines.scheduling.WorkQueue r12 = r12.localQueue
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.Task> r13 = r0.stolenTask
                r14 = r19
                long r12 = r12.trySteal(r14, r13)
                r15 = -1
                int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
                if (r17 != 0) goto L51
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.Task> r2 = r0.stolenTask
                T r3 = r2.element
                kotlinx.coroutines.scheduling.Task r3 = (kotlinx.coroutines.scheduling.Task) r3
                r2.element = r1
                return r3
            L51:
                int r15 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r15 <= 0) goto L5c
                long r8 = java.lang.Math.min(r8, r12)
                goto L5c
            L5a:
                r14 = r19
            L5c:
                int r5 = r5 + 1
                goto L23
            L5f:
                int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r2 == 0) goto L64
                goto L65
            L64:
                r8 = r10
            L65:
                r0.minDelayUntilStealableTaskNs = r8
                return r1
        }

        private final void tryTerminateWorker() {
                r8 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r8.this$0
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r0.workers
                monitor-enter(r1)
                boolean r2 = r0.isTerminated()     // Catch: java.lang.Throwable -> L66
                if (r2 == 0) goto Ld
                monitor-exit(r1)
                return
            Ld:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$FU$p()     // Catch: java.lang.Throwable -> L66
                long r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L66
                r4 = 2097151(0x1fffff, double:1.0361303E-317)
                long r2 = r2 & r4
                int r3 = (int) r2     // Catch: java.lang.Throwable -> L66
                int r2 = r0.corePoolSize     // Catch: java.lang.Throwable -> L66
                if (r3 > r2) goto L20
                monitor-exit(r1)
                return
            L20:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$FU     // Catch: java.lang.Throwable -> L66
                r3 = -1
                r6 = 1
                boolean r2 = r2.compareAndSet(r8, r3, r6)     // Catch: java.lang.Throwable -> L66
                if (r2 != 0) goto L2c
                monitor-exit(r1)
                return
            L2c:
                int r2 = r8.indexInArray     // Catch: java.lang.Throwable -> L66
                r3 = 0
                r8.setIndexInArray(r3)     // Catch: java.lang.Throwable -> L66
                r0.parkedWorkersStackTopUpdate(r8, r2, r3)     // Catch: java.lang.Throwable -> L66
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$FU$p()     // Catch: java.lang.Throwable -> L66
                long r6 = r3.getAndDecrement(r0)     // Catch: java.lang.Throwable -> L66
                long r3 = r6 & r4
                int r4 = (int) r3     // Catch: java.lang.Throwable -> L66
                if (r4 == r2) goto L58
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r3 = r0.workers     // Catch: java.lang.Throwable -> L66
                java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L66
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L66
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r3 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r3     // Catch: java.lang.Throwable -> L66
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r5 = r0.workers     // Catch: java.lang.Throwable -> L66
                r5.setSynchronized(r2, r3)     // Catch: java.lang.Throwable -> L66
                r3.setIndexInArray(r2)     // Catch: java.lang.Throwable -> L66
                r0.parkedWorkersStackTopUpdate(r3, r4, r2)     // Catch: java.lang.Throwable -> L66
            L58:
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r0.workers     // Catch: java.lang.Throwable -> L66
                r2 = 0
                r0.setSynchronized(r4, r2)     // Catch: java.lang.Throwable -> L66
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L66
                monitor-exit(r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r8.state = r0
                return
            L66:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
        }

        public final kotlinx.coroutines.scheduling.Task findTask(boolean r2) {
                r1 = this;
                boolean r0 = r1.tryAcquireCpuPermit()
                if (r0 == 0) goto Lb
                kotlinx.coroutines.scheduling.Task r2 = r1.findAnyTask(r2)
                return r2
            Lb:
                kotlinx.coroutines.scheduling.Task r2 = r1.findBlockingTask()
                return r2
        }

        public final int getIndexInArray() {
                r1 = this;
                int r0 = r1.indexInArray
                return r0
        }

        public final java.lang.Object getNextParkedWorker() {
                r1 = this;
                java.lang.Object r0 = r1.nextParkedWorker
                return r0
        }

        public final int nextInt(int r4) {
                r3 = this;
                int r0 = r3.rngState
                int r1 = r0 << 13
                r0 = r0 ^ r1
                int r1 = r0 >> 17
                r0 = r0 ^ r1
                int r1 = r0 << 5
                r0 = r0 ^ r1
                r3.rngState = r0
                int r1 = r4 + (-1)
                r2 = r1 & r4
                if (r2 != 0) goto L16
                r4 = r0 & r1
                return r4
            L16:
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0 = r0 & r1
                int r0 = r0 % r4
                return r0
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r0 = this;
                r0.runWorker()
                return
        }

        public final void setIndexInArray(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.this$0
                java.lang.String r1 = r1.schedulerName
                r0.append(r1)
                java.lang.String r1 = "-worker-"
                r0.append(r1)
                if (r3 != 0) goto L16
                java.lang.String r1 = "TERMINATED"
                goto L1a
            L16:
                java.lang.String r1 = java.lang.String.valueOf(r3)
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.setName(r0)
                r2.indexInArray = r3
                return
        }

        public final void setNextParkedWorker(java.lang.Object r1) {
                r0 = this;
                r0.nextParkedWorker = r1
                return
        }

        public final boolean tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState r7) {
                r6 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r6.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                if (r0 != r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                if (r1 == 0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r6.this$0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$FU$p()
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                r3.addAndGet(r2, r4)
            L19:
                if (r0 == r7) goto L1d
                r6.state = r7
            L1d:
                return r1
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public enum WorkerState extends java.lang.Enum<kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState> {
        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $VALUES = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState BLOCKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState CPU_ACQUIRED = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState DORMANT = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState PARKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState TERMINATED = null;

        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $values() {
                r0 = 5
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 0
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                r2 = 1
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r2 = 2
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r2 = 3
                r0[r2] = r1
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r2 = 4
                r0[r2] = r1
                return r0
        }

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "CPU_ACQUIRED"
                r2 = 0
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "BLOCKING"
                r2 = 1
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "PARKING"
                r2 = 2
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "DORMANT"
                r2 = 3
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "TERMINATED"
                r2 = 4
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = $values()
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES = r0
                return
        }

        WorkerState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState valueOf(java.lang.String r1) {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState) r1
                return r1
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] values() {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]) r0
                return r0
        }
    }

    static {
            kotlinx.coroutines.scheduling.CoroutineScheduler$Companion r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.Companion = r0
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.lang.String r1 = "parkedWorkersStack"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU = r0
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.lang.String r1 = "controlState"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU = r0
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.lang.String r1 = "_isTerminated"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$FU = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NOT_IN_STACK"
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK = r0
            return
    }

    public CoroutineScheduler(int r4, int r5, long r6, java.lang.String r8) {
            r3 = this;
            r3.<init>()
            r3.corePoolSize = r4
            r3.maxPoolSize = r5
            r3.idleWorkerKeepAliveNs = r6
            r3.schedulerName = r8
            r8 = 0
            r0 = 1
            if (r4 < r0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto Lb2
            if (r5 < r4) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.lang.String r2 = "Max pool size "
            if (r1 == 0) goto L91
            r1 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r5 > r1) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L73
            r1 = 0
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 <= 0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L53
            kotlinx.coroutines.scheduling.GlobalQueue r5 = new kotlinx.coroutines.scheduling.GlobalQueue
            r5.<init>()
            r3.globalCpuQueue = r5
            kotlinx.coroutines.scheduling.GlobalQueue r5 = new kotlinx.coroutines.scheduling.GlobalQueue
            r5.<init>()
            r3.globalBlockingQueue = r5
            kotlinx.coroutines.internal.ResizableAtomicArray r5 = new kotlinx.coroutines.internal.ResizableAtomicArray
            int r6 = r4 + 1
            int r6 = r6 * 2
            r5.<init>(r6)
            r3.workers = r5
            long r4 = (long) r4
            r6 = 42
            long r4 = r4 << r6
            r3.controlState = r4
            r3._isTerminated = r8
            return
        L53:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Idle worker keep alive time "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = " must be positive"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L73:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r5)
            java.lang.String r5 = " should not exceed maximal supported number of threads 2097150"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L91:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r5)
            java.lang.String r5 = " should be greater than or equals to core pool size "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        Lb2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Core pool size "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = " should be at least 1"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater access$getControlState$FU$p() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            return r0
    }

    private final boolean addToGlobalQueue(kotlinx.coroutines.scheduling.Task r3) {
            r2 = this;
            kotlinx.coroutines.scheduling.TaskContext r0 = r3.taskContext
            int r0 = r0.getTaskMode()
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L14
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r2.globalBlockingQueue
            boolean r3 = r0.addLast(r3)
            goto L1a
        L14:
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r2.globalCpuQueue
            boolean r3 = r0.addLast(r3)
        L1a:
            return r3
    }

    private final int createNewWorker() {
            r11 = this;
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r11.workers
            monitor-enter(r0)
            boolean r1 = r11.isTerminated()     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto Lc
            r1 = -1
            monitor-exit(r0)
            return r1
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU     // Catch: java.lang.Throwable -> L83
            long r2 = r1.get(r11)     // Catch: java.lang.Throwable -> L83
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r6 = r2 & r4
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L83
            r8 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r2 = r2 & r8
            r6 = 21
            long r2 = r2 >> r6
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L83
            int r2 = r7 - r3
            r3 = 0
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r3)     // Catch: java.lang.Throwable -> L83
            int r6 = r11.corePoolSize     // Catch: java.lang.Throwable -> L83
            if (r2 < r6) goto L2f
            monitor-exit(r0)
            return r3
        L2f:
            int r6 = r11.maxPoolSize     // Catch: java.lang.Throwable -> L83
            if (r7 < r6) goto L35
            monitor-exit(r0)
            return r3
        L35:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = access$getControlState$FU$p()     // Catch: java.lang.Throwable -> L83
            long r6 = r6.get(r11)     // Catch: java.lang.Throwable -> L83
            long r6 = r6 & r4
            int r7 = (int) r6     // Catch: java.lang.Throwable -> L83
            r6 = 1
            int r7 = r7 + r6
            if (r7 <= 0) goto L4d
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r8 = r11.workers     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L83
            if (r8 != 0) goto L4d
            r8 = 1
            goto L4e
        L4d:
            r8 = 0
        L4e:
            if (r8 == 0) goto L77
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r8 = new kotlinx.coroutines.scheduling.CoroutineScheduler$Worker     // Catch: java.lang.Throwable -> L83
            r8.<init>(r11, r7)     // Catch: java.lang.Throwable -> L83
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r9 = r11.workers     // Catch: java.lang.Throwable -> L83
            r9.setSynchronized(r7, r8)     // Catch: java.lang.Throwable -> L83
            long r9 = r1.incrementAndGet(r11)     // Catch: java.lang.Throwable -> L83
            long r4 = r4 & r9
            int r1 = (int) r4
            if (r7 != r1) goto L63
            r3 = 1
        L63:
            if (r3 == 0) goto L6b
            int r2 = r2 + r6
            monitor-exit(r0)
            r8.start()
            return r2
        L6b:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L83
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L83
            throw r2     // Catch: java.lang.Throwable -> L83
        L77:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L83
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L83
            throw r2     // Catch: java.lang.Throwable -> L83
        L83:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker currentWorker() {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1a
            kotlinx.coroutines.scheduling.CoroutineScheduler r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.access$getThis$0$p(r0)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L1a
            r2 = r0
        L1a:
            return r2
    }

    public static /* synthetic */ void dispatch$default(kotlinx.coroutines.scheduling.CoroutineScheduler r0, java.lang.Runnable r1, kotlinx.coroutines.scheduling.TaskContext r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            kotlinx.coroutines.scheduling.TaskContext r2 = kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.dispatch(r1, r2, r3)
            return
    }

    private final int parkedWorkersStackNextIndex(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r2) {
            r1 = this;
            java.lang.Object r2 = r2.getNextParkedWorker()
        L4:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            if (r2 != r0) goto La
            r2 = -1
            return r2
        La:
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r2 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r2
            int r0 = r2.getIndexInArray()
            if (r0 == 0) goto L17
            return r0
        L17:
            java.lang.Object r2 = r2.getNextParkedWorker()
            goto L4
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker parkedWorkersStackPop() {
            r10 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
        L2:
            long r3 = r0.get(r10)
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r2 = (int) r1
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r10.workers
            java.lang.Object r1 = r1.get(r2)
            r7 = r1
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r7 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r7
            if (r7 != 0) goto L18
            r0 = 0
            return r0
        L18:
            r1 = 2097152(0x200000, double:1.0361308E-317)
            long r1 = r1 + r3
            r5 = -2097152(0xffffffffffe00000, double:NaN)
            long r1 = r1 & r5
            int r5 = r10.parkedWorkersStackNextIndex(r7)
            if (r5 < 0) goto L2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r8 = (long) r5
            long r8 = r8 | r1
            r1 = r6
            r2 = r10
            r5 = r8
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            r7.setNextParkedWorker(r0)
            return r7
    }

    private final void signalBlockingWork(long r1, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L3
            return
        L3:
            boolean r3 = r0.tryUnpark()
            if (r3 == 0) goto La
            return
        La:
            boolean r1 = r0.tryCreateWorker(r1)
            if (r1 == 0) goto L11
            return
        L11:
            r0.tryUnpark()
            return
    }

    private final kotlinx.coroutines.scheduling.Task submitToLocalQueue(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r3, kotlinx.coroutines.scheduling.Task r4, boolean r5) {
            r2 = this;
            if (r3 != 0) goto L3
            return r4
        L3:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r0 != r1) goto La
            return r4
        La:
            kotlinx.coroutines.scheduling.TaskContext r0 = r4.taskContext
            int r0 = r0.getTaskMode()
            if (r0 != 0) goto L19
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
            if (r0 != r1) goto L19
            return r4
        L19:
            r0 = 1
            r3.mayHaveLocalTasks = r0
            kotlinx.coroutines.scheduling.WorkQueue r3 = r3.localQueue
            kotlinx.coroutines.scheduling.Task r3 = r3.add(r4, r5)
            return r3
    }

    private final boolean tryCreateWorker(long r5) {
            r4 = this;
            r0 = 2097151(0x1fffff, double:1.0361303E-317)
            long r0 = r0 & r5
            int r1 = (int) r0
            r2 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r5 = r5 & r2
            r0 = 21
            long r5 = r5 >> r0
            int r6 = (int) r5
            int r1 = r1 - r6
            r5 = 0
            int r6 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r5)
            int r0 = r4.corePoolSize
            if (r6 >= r0) goto L2a
            int r6 = r4.createNewWorker()
            r0 = 1
            if (r6 != r0) goto L27
            int r1 = r4.corePoolSize
            if (r1 <= r0) goto L27
            r4.createNewWorker()
        L27:
            if (r6 <= 0) goto L2a
            return r0
        L2a:
            return r5
    }

    static /* synthetic */ boolean tryCreateWorker$default(kotlinx.coroutines.scheduling.CoroutineScheduler r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            long r1 = r1.get(r0)
        La:
            boolean r0 = r0.tryCreateWorker(r1)
            return r0
    }

    private final boolean tryUnpark() {
            r4 = this;
        L0:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = r4.parkedWorkersStackPop()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.getWorkerCtl$FU()
            r3 = -1
            boolean r1 = r2.compareAndSet(r0, r3, r1)
            if (r1 == 0) goto L0
            java.util.concurrent.locks.LockSupport.unpark(r0)
            r0 = 1
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.shutdown(r0)
            return
    }

    public final kotlinx.coroutines.scheduling.Task createTask(java.lang.Runnable r4, kotlinx.coroutines.scheduling.TaskContext r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.SchedulerTimeSource r0 = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource
            long r0 = r0.nanoTime()
            boolean r2 = r4 instanceof kotlinx.coroutines.scheduling.Task
            if (r2 == 0) goto L11
            kotlinx.coroutines.scheduling.Task r4 = (kotlinx.coroutines.scheduling.Task) r4
            r4.submissionTime = r0
            r4.taskContext = r5
            return r4
        L11:
            kotlinx.coroutines.scheduling.TaskImpl r2 = new kotlinx.coroutines.scheduling.TaskImpl
            r2.<init>(r4, r0, r5)
            return r2
    }

    public final void dispatch(java.lang.Runnable r6, kotlinx.coroutines.scheduling.TaskContext r7, boolean r8) {
            r5 = this;
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            kotlinx.coroutines.scheduling.Task r6 = r5.createTask(r6, r7)
            kotlinx.coroutines.scheduling.TaskContext r7 = r6.taskContext
            int r7 = r7.getTaskMode()
            r0 = 0
            r1 = 1
            if (r7 != r1) goto L13
            r7 = 1
            goto L14
        L13:
            r7 = 0
        L14:
            if (r7 == 0) goto L20
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r3 = 2097152(0x200000, double:1.0361308E-317)
            long r2 = r2.addAndGet(r5, r3)
            goto L22
        L20:
            r2 = 0
        L22:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r4 = r5.currentWorker()
            kotlinx.coroutines.scheduling.Task r6 = r5.submitToLocalQueue(r4, r6, r8)
            if (r6 == 0) goto L4c
            boolean r6 = r5.addToGlobalQueue(r6)
            if (r6 == 0) goto L33
            goto L4c
        L33:
            java.util.concurrent.RejectedExecutionException r6 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.schedulerName
            r7.append(r8)
            java.lang.String r8 = " was terminated"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L4c:
            if (r8 == 0) goto L51
            if (r4 == 0) goto L51
            r0 = 1
        L51:
            if (r7 == 0) goto L57
            r5.signalBlockingWork(r2, r0)
            goto L5d
        L57:
            if (r0 == 0) goto L5a
            return
        L5a:
            r5.signalCpuWork()
        L5d:
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r6
            r1 = r7
            dispatch$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final boolean isTerminated() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$FU
            int r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean parkedWorkersStackPush(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r10) {
            r9 = this;
            java.lang.Object r0 = r10.getNextParkedWorker()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            if (r0 == r1) goto La
            r10 = 0
            return r10
        La:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
        Lc:
            long r3 = r0.get(r9)
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r2 = (int) r1
            r5 = 2097152(0x200000, double:1.0361308E-317)
            long r5 = r5 + r3
            r7 = -2097152(0xffffffffffe00000, double:NaN)
            long r5 = r5 & r7
            int r1 = r10.getIndexInArray()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r7 = r9.workers
            java.lang.Object r2 = r7.get(r2)
            r10.setNextParkedWorker(r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r7 = (long) r1
            long r5 = r5 | r7
            r1 = r2
            r2 = r9
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto Lc
            r10 = 1
            return r10
    }

    public final void parkedWorkersStackTopUpdate(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r10, int r11, int r12) {
            r9 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
        L2:
            long r3 = r0.get(r9)
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r2 = (int) r1
            r5 = 2097152(0x200000, double:1.0361308E-317)
            long r5 = r5 + r3
            r7 = -2097152(0xffffffffffe00000, double:NaN)
            long r5 = r5 & r7
            if (r2 != r11) goto L1d
            if (r12 != 0) goto L1c
            int r2 = r9.parkedWorkersStackNextIndex(r10)
            goto L1d
        L1c:
            r2 = r12
        L1d:
            if (r2 < 0) goto L2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            long r7 = (long) r2
            long r5 = r5 | r7
            r2 = r9
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            return
    }

    public final void runSafely(kotlinx.coroutines.scheduling.Task r3) {
            r2 = this;
            r3.run()     // Catch: java.lang.Throwable -> L7
        L3:
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            goto L14
        L7:
            r3 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L15
            java.lang.Thread$UncaughtExceptionHandler r1 = r0.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L15
            r1.uncaughtException(r0, r3)     // Catch: java.lang.Throwable -> L15
            goto L3
        L14:
            return
        L15:
            r3 = move-exception
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            throw r3
    }

    public final void shutdown(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$FU
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = r7.currentWorker()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r7.workers
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getControlState$FU$p()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L49
            r1 = 1
        L23:
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r3 = r7.workers
            java.lang.Object r3 = r3.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r3 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r3
            if (r3 == r0) goto L44
        L30:
            boolean r5 = r3.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r3)
            r3.join(r8)
            goto L30
        L3d:
            kotlinx.coroutines.scheduling.WorkQueue r3 = r3.localQueue
            kotlinx.coroutines.scheduling.GlobalQueue r5 = r7.globalBlockingQueue
            r3.offloadAllWorkTo(r5)
        L44:
            if (r1 == r4) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalBlockingQueue
            r8.close()
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalCpuQueue
            r8.close()
        L53:
            if (r0 == 0) goto L5b
            kotlinx.coroutines.scheduling.Task r8 = r0.findTask(r2)
            if (r8 != 0) goto L83
        L5b:
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalCpuQueue
            java.lang.Object r8 = r8.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r8 = (kotlinx.coroutines.scheduling.Task) r8
            if (r8 != 0) goto L83
            kotlinx.coroutines.scheduling.GlobalQueue r8 = r7.globalBlockingQueue
            java.lang.Object r8 = r8.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r8 = (kotlinx.coroutines.scheduling.Task) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.tryReleaseCpu(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$FU
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            r8.set(r7, r0)
            return
        L83:
            r7.runSafely(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
    }

    public final void signalCpuWork() {
            r4 = this;
            boolean r0 = r4.tryUnpark()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            r2 = 1
            r3 = 0
            boolean r0 = tryCreateWorker$default(r4, r0, r2, r3)
            if (r0 == 0) goto L12
            return
        L12:
            r4.tryUnpark()
            return
    }

    public java.lang.String toString() {
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r12.workers
            int r1 = r1.currentLength()
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
        L12:
            if (r8 >= r1) goto L8d
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r9 = r12.workers
            java.lang.Object r9 = r9.get(r8)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r9 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r9
            if (r9 != 0) goto L1f
            goto L8a
        L1f:
            kotlinx.coroutines.scheduling.WorkQueue r10 = r9.localQueue
            int r10 = r10.getSize$kotlinx_coroutines_core()
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r9 = r9.state
            int[] r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r11[r9]
            if (r9 == r3) goto L88
            r11 = 2
            if (r9 == r11) goto L71
            r11 = 3
            if (r9 == r11) goto L5a
            r11 = 4
            if (r9 == r11) goto L41
            r10 = 5
            if (r9 == r10) goto L3e
            goto L8a
        L3e:
            int r7 = r7 + 1
            goto L8a
        L41:
            int r6 = r6 + 1
            if (r10 <= 0) goto L8a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r10 = 100
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r0.add(r9)
            goto L8a
        L5a:
            int r2 = r2 + 1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r10 = 99
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r0.add(r9)
            goto L8a
        L71:
            int r4 = r4 + 1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r10 = 98
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r0.add(r9)
            goto L8a
        L88:
            int r5 = r5 + 1
        L8a:
            int r8 = r8 + 1
            goto L12
        L8d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$FU
            long r8 = r1.get(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r12.schedulerName
            r1.append(r3)
            r3 = 64
            r1.append(r3)
            java.lang.String r3 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r12)
            r1.append(r3)
            java.lang.String r3 = "[Pool Size {core = "
            r1.append(r3)
            int r3 = r12.corePoolSize
            r1.append(r3)
            java.lang.String r3 = ", max = "
            r1.append(r3)
            int r3 = r12.maxPoolSize
            r1.append(r3)
            java.lang.String r3 = "}, Worker States {CPU = "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = ", blocking = "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", parked = "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ", dormant = "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", terminated = "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = "}, running workers queues = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", global CPU queue size = "
            r1.append(r0)
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r12.globalCpuQueue
            int r0 = r0.getSize()
            r1.append(r0)
            java.lang.String r0 = ", global blocking queue size = "
            r1.append(r0)
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r12.globalBlockingQueue
            int r0 = r0.getSize()
            r1.append(r0)
            java.lang.String r0 = ", Control State {created workers= "
            r1.append(r0)
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r0 = (int) r2
            r1.append(r0)
            java.lang.String r0 = ", blocking tasks = "
            r1.append(r0)
            r2 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r2 = r2 & r8
            r0 = 21
            long r2 = r2 >> r0
            int r0 = (int) r2
            r1.append(r0)
            java.lang.String r0 = ", CPUs acquired = "
            r1.append(r0)
            int r0 = r12.corePoolSize
            r2 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r2 = r2 & r8
            r4 = 42
            long r2 = r2 >> r4
            int r3 = (int) r2
            int r0 = r0 - r3
            r1.append(r0)
            java.lang.String r0 = "}]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
