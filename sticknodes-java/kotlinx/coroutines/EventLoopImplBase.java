package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes2.dex */
public abstract class EventLoopImplBase extends kotlinx.coroutines.EventLoopImplPlatform implements kotlinx.coroutines.Delay {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _delayed$FU = null;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isCompleted$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _queue$FU = null;
    private volatile java.lang.Object _delayed;
    private volatile int _isCompleted;
    private volatile java.lang.Object _queue;

    /* compiled from: EventLoop.common.kt */
    public static abstract class DelayedTask implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.EventLoopImplBase.DelayedTask>, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.internal.ThreadSafeHeapNode {
        private volatile java.lang.Object _heap;
        private int index;
        public long nanoTime;

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(kotlinx.coroutines.EventLoopImplBase.DelayedTask r1) {
                r0 = this;
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        /* renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(kotlinx.coroutines.EventLoopImplBase.DelayedTask r5) {
                r4 = this;
                long r0 = r4.nanoTime
                long r2 = r5.nanoTime
                long r0 = r0 - r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto Ld
                r5 = 1
                goto L12
            Ld:
                if (r5 >= 0) goto L11
                r5 = -1
                goto L12
            L11:
                r5 = 0
            L12:
                return r5
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
                r2 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2._heap     // Catch: java.lang.Throwable -> L22
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L22
                if (r0 != r1) goto Lb
                monitor-exit(r2)
                return
            Lb:
                boolean r1 = r0 instanceof kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue     // Catch: java.lang.Throwable -> L22
                if (r1 == 0) goto L12
                kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0     // Catch: java.lang.Throwable -> L22
                goto L13
            L12:
                r0 = 0
            L13:
                if (r0 == 0) goto L18
                r0.remove(r2)     // Catch: java.lang.Throwable -> L22
            L18:
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L22
                r2._heap = r0     // Catch: java.lang.Throwable -> L22
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L22
                monitor-exit(r2)
                return
            L22:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
                r2 = this;
                java.lang.Object r0 = r2._heap
                boolean r1 = r0 instanceof kotlinx.coroutines.internal.ThreadSafeHeap
                if (r1 == 0) goto L9
                kotlinx.coroutines.internal.ThreadSafeHeap r0 = (kotlinx.coroutines.internal.ThreadSafeHeap) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        public final int scheduleTask(long r8, kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue r10, kotlinx.coroutines.EventLoopImplBase r11) {
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4d
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L4d
                if (r0 != r1) goto Lc
                r8 = 2
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4d
                kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r10.firstImpl()     // Catch: java.lang.Throwable -> L4a
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0     // Catch: java.lang.Throwable -> L4a
                boolean r11 = kotlinx.coroutines.EventLoopImplBase.access$isCompleted(r11)     // Catch: java.lang.Throwable -> L4a
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4d
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
                r10.timeNow = r8     // Catch: java.lang.Throwable -> L4a
                goto L38
            L24:
                long r3 = r0.nanoTime     // Catch: java.lang.Throwable -> L4a
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.timeNow     // Catch: java.lang.Throwable -> L4a
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L38
                r10.timeNow = r8     // Catch: java.lang.Throwable -> L4a
            L38:
                long r8 = r7.nanoTime     // Catch: java.lang.Throwable -> L4a
                long r3 = r10.timeNow     // Catch: java.lang.Throwable -> L4a
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L43
                r7.nanoTime = r3     // Catch: java.lang.Throwable -> L4a
            L43:
                r10.addImpl(r7)     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4d
                r8 = 0
                monitor-exit(r7)
                return r8
            L4a:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4d
                throw r8     // Catch: java.lang.Throwable -> L4d
            L4d:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(kotlinx.coroutines.internal.ThreadSafeHeap<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2._heap
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L10
                r2._heap = r3
                return
            L10:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }

        public final boolean timeToExecute(long r4) {
                r3 = this;
                long r0 = r3.nanoTime
                long r4 = r4 - r0
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto Lb
                r4 = 1
                goto Lc
            Lb:
                r4 = 0
            Lc:
                return r4
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Delayed[nanos="
                r0.append(r1)
                long r1 = r3.nanoTime
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class DelayedTaskQueue extends kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long r1) {
                r0 = this;
                r0.<init>()
                r0.timeNow = r1
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.EventLoopImplBase> r1 = kotlinx.coroutines.EventLoopImplBase.class
            java.lang.String r2 = "_queue"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.EventLoopImplBase._queue$FU = r2
            java.lang.String r2 = "_delayed"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.EventLoopImplBase._delayed$FU = r0
            java.lang.String r0 = "_isCompleted"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.EventLoopImplBase._isCompleted$FU = r0
            return
    }

    public EventLoopImplBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._isCompleted = r0
            return
    }

    public static final /* synthetic */ boolean access$isCompleted(kotlinx.coroutines.EventLoopImplBase r0) {
            boolean r0 = r0.isCompleted()
            return r0
    }

    private final void closeQueue() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$FU
        L2:
            java.lang.Object r1 = r0.get(r5)
            if (r1 != 0) goto L16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r2 = 0
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r5, r2, r3)
            if (r1 == 0) goto L2
            return
        L16:
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r2 == 0) goto L20
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            r1.close()
            return
        L20:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r1 != r2) goto L27
            return
        L27:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r3 = 8
            r4 = 1
            r2.<init>(r3, r4)
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.addLast(r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r5, r1, r2)
            if (r1 == 0) goto L2
            return
    }

    private final java.lang.Runnable dequeue() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$FU
        L2:
            java.lang.Object r1 = r0.get(r5)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r3 = r1 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r3 == 0) goto L2b
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            r2 = r1
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            java.lang.Object r3 = r2.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r3 == r4) goto L21
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            return r3
        L21:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = r2.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r5, r1, r2)
            goto L2
        L2b:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r1 != r3) goto L32
            return r2
        L32:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r5, r1, r2)
            if (r2 == 0) goto L2
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            return r1
    }

    private final boolean enqueueImpl(java.lang.Runnable r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$FU
        L2:
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r6.isCompleted()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            r2 = 1
            if (r1 != 0) goto L1b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r3 = 0
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r6, r3, r7)
            if (r1 == 0) goto L2
            return r2
        L1b:
            boolean r4 = r1 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r4 == 0) goto L3f
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            r4 = r1
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r4
            int r5 = r4.addLast(r7)
            if (r5 == 0) goto L3e
            if (r5 == r2) goto L34
            r1 = 2
            if (r5 == r1) goto L33
            goto L2
        L33:
            return r3
        L34:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r4.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r6, r1, r3)
            goto L2
        L3e:
            return r2
        L3f:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r1 != r4) goto L46
            return r3
        L46:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r4 = 8
            r3.<init>(r4, r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.addLast(r4)
            r3.addLast(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r6, r1, r3)
            if (r1 == 0) goto L2
            return r2
    }

    private final boolean isCompleted() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._isCompleted$FU
            int r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    private final void rescheduleAllDelayed() {
            r3 = this;
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            long r0 = java.lang.System.nanoTime()
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            java.lang.Object r2 = r2.get(r3)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r2 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r2
            if (r2 == 0) goto L1e
            kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = r2.removeFirstOrNull()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r2 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r2
            if (r2 != 0) goto L1a
            goto L1e
        L1a:
            r3.reschedule(r0, r2)
            goto L7
        L1e:
            return
    }

    private final int scheduleImpl(long r4, kotlinx.coroutines.EventLoopImplBase.DelayedTask r6) {
            r3 = this;
            boolean r0 = r3.isCompleted()
            if (r0 == 0) goto L8
            r4 = 1
            return r4
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            java.lang.Object r1 = r0.get(r3)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r1
            if (r1 != 0) goto L25
            r1 = 0
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r2 = new kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue
            r2.<init>(r4)
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r1
        L25:
            int r4 = r6.scheduleTask(r4, r1, r3)
            return r4
    }

    private final void setCompleted(boolean r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._isCompleted$FU
            r0.set(r1, r2)
            return
    }

    private final boolean shouldUnpark(kotlinx.coroutines.EventLoopImplBase.DelayedTask r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L11
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != r2) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public final void mo128dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2) {
            r0 = this;
            r0.enqueue(r2)
            return
    }

    public void enqueue(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.enqueueImpl(r2)
            if (r0 == 0) goto La
            r1.unpark()
            goto Lf
        La:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.enqueue(r2)
        Lf:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
            r6 = this;
            long r0 = super.getNextTime()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            return r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            java.lang.Object r0 = r0.get(r6)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L2d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r1 == 0) goto L25
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2d
            return r2
        L25:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r1) goto L2c
            return r4
        L2c:
            return r2
        L2d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            java.lang.Object r0 = r0.get(r6)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L4f
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
            if (r0 != 0) goto L40
            goto L4f
        L40:
            long r0 = r0.nanoTime
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            long r4 = java.lang.System.nanoTime()
            long r0 = r0 - r4
            long r0 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r2)
            return r0
        L4f:
            return r4
    }

    protected boolean isEmpty() {
            r4 = this;
            boolean r0 = r4.isUnconfinedQueueEmpty()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            java.lang.Object r0 = r0.get(r4)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L19
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L19
            return r1
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            java.lang.Object r0 = r0.get(r4)
            r2 = 1
            if (r0 != 0) goto L24
        L22:
            r1 = 1
            goto L36
        L24:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r3 == 0) goto L2f
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r1 = r0.isEmpty()
            goto L36
        L2f:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r3) goto L36
            goto L22
        L36:
            return r1
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
            r9 = this;
            boolean r0 = r9.processUnconfinedEvent()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            java.lang.Object r0 = r0.get(r9)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L49
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L49
            kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            long r3 = java.lang.System.nanoTime()
        L20:
            monitor-enter(r0)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r5 = r0.firstImpl()     // Catch: java.lang.Throwable -> L46
            r6 = 0
            if (r5 != 0) goto L2a
            monitor-exit(r0)
            goto L41
        L2a:
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r5 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r5     // Catch: java.lang.Throwable -> L46
            boolean r7 = r5.timeToExecute(r3)     // Catch: java.lang.Throwable -> L46
            r8 = 0
            if (r7 == 0) goto L38
            boolean r5 = r9.enqueueImpl(r5)     // Catch: java.lang.Throwable -> L46
            goto L39
        L38:
            r5 = 0
        L39:
            if (r5 == 0) goto L40
            kotlinx.coroutines.internal.ThreadSafeHeapNode r5 = r0.removeAtImpl(r8)     // Catch: java.lang.Throwable -> L46
            r6 = r5
        L40:
            monitor-exit(r0)
        L41:
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r6 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r6
            if (r6 != 0) goto L20
            goto L49
        L46:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L49:
            java.lang.Runnable r0 = r9.dequeue()
            if (r0 == 0) goto L53
            r0.run()
            return r1
        L53:
            long r0 = r9.getNextTime()
            return r0
    }

    protected final void resetAll() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r1 = 0
            r0.set(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            r0.set(r2, r1)
            return
    }

    public final void schedule(long r3, kotlinx.coroutines.EventLoopImplBase.DelayedTask r5) {
            r2 = this;
            int r0 = r2.scheduleImpl(r3, r5)
            if (r0 == 0) goto L1d
            r1 = 1
            if (r0 == r1) goto L19
            r3 = 2
            if (r0 != r3) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "unexpected result"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L19:
            r2.reschedule(r3, r5)
            goto L26
        L1d:
            boolean r3 = r2.shouldUnpark(r5)
            if (r3 == 0) goto L26
            r2.unpark()
        L26:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
            r5 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r0.resetEventLoop$kotlinx_coroutines_core()
            r0 = 1
            r5.setCompleted(r0)
            r5.closeQueue()
        Lc:
            long r0 = r5.processNextEvent()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lc
            r5.rescheduleAllDelayed()
            return
    }
}
