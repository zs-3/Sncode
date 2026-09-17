package kotlinx.coroutines.scheduling;

/* compiled from: WorkQueue.kt */
/* loaded from: classes2.dex */
public final class WorkQueue {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = null;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumerIndex$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater lastScheduledTask$FU = null;
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater producerIndex$FU = null;
    private volatile int blockingTasksInBuffer;
    private final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> buffer;
    private volatile int consumerIndex;
    private volatile java.lang.Object lastScheduledTask;
    private volatile int producerIndex;

    static {
            java.lang.Class<kotlinx.coroutines.scheduling.WorkQueue> r0 = kotlinx.coroutines.scheduling.WorkQueue.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "lastScheduledTask"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU = r1
            java.lang.String r1 = "producerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU = r1
            java.lang.String r1 = "consumerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU = r1
            java.lang.String r1 = "blockingTasksInBuffer"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU = r0
            return
    }

    public WorkQueue() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            r2.buffer = r0
            return
    }

    private final kotlinx.coroutines.scheduling.Task addLast(kotlinx.coroutines.scheduling.Task r4) {
            r3 = this;
            int r0 = r3.getBufferSize()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 != r1) goto L9
            return r4
        L9:
            kotlinx.coroutines.scheduling.TaskContext r0 = r4.taskContext
            int r0 = r0.getTaskMode()
            r2 = 1
            if (r0 != r2) goto L13
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L1b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            r0.incrementAndGet(r3)
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU
            int r0 = r0.get(r3)
            r0 = r0 & r1
        L22:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r1 = r3.buffer
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L2e
            java.lang.Thread.yield()
            goto L22
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r1 = r3.buffer
            r1.lazySet(r0, r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU
            r4.incrementAndGet(r3)
            r4 = 0
            return r4
    }

    private final void decrementIfBlocking(kotlinx.coroutines.scheduling.Task r2) {
            r1 = this;
            if (r2 == 0) goto L14
            kotlinx.coroutines.scheduling.TaskContext r2 = r2.taskContext
            int r2 = r2.getTaskMode()
            r0 = 1
            if (r2 != r0) goto Lc
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L14
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            r2.decrementAndGet(r1)
        L14:
            return
    }

    private final int getBufferSize() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU
            int r0 = r0.get(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU
            int r1 = r1.get(r2)
            int r0 = r0 - r1
            return r0
    }

    private final kotlinx.coroutines.scheduling.Task pollBuffer() {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU
            int r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU
            int r2 = r2.get(r5)
            int r2 = r1 - r2
            r3 = 0
            if (r2 != 0) goto L12
            return r3
        L12:
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r1 + 1
            boolean r0 = r0.compareAndSet(r5, r1, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r0 = r5.buffer
            java.lang.Object r0 = r0.getAndSet(r2, r3)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 != 0) goto L27
            goto L0
        L27:
            r5.decrementIfBlocking(r0)
            return r0
    }

    private final boolean pollTo(kotlinx.coroutines.scheduling.GlobalQueue r2) {
            r1 = this;
            kotlinx.coroutines.scheduling.Task r0 = r1.pollBuffer()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r2.addLast(r0)
            r2 = 1
            return r2
    }

    private final kotlinx.coroutines.scheduling.Task pollWithExclusiveMode(boolean r6) {
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            java.lang.Object r1 = r0.get(r5)
            kotlinx.coroutines.scheduling.Task r1 = (kotlinx.coroutines.scheduling.Task) r1
            r2 = 0
            if (r1 != 0) goto Lc
            goto L20
        Lc:
            kotlinx.coroutines.scheduling.TaskContext r3 = r1.taskContext
            int r3 = r3.getTaskMode()
            r4 = 1
            if (r3 != r4) goto L16
            goto L17
        L16:
            r4 = 0
        L17:
            if (r4 != r6) goto L20
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r5, r1, r2)
            if (r0 == 0) goto L0
            return r1
        L20:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU
            int r0 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU
            int r1 = r1.get(r5)
        L2c:
            if (r0 == r1) goto L42
            if (r6 == 0) goto L39
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            int r3 = r3.get(r5)
            if (r3 != 0) goto L39
            return r2
        L39:
            int r1 = r1 + (-1)
            kotlinx.coroutines.scheduling.Task r3 = r5.tryExtractFromTheMiddle(r1, r6)
            if (r3 == 0) goto L2c
            return r3
        L42:
            return r2
    }

    private final kotlinx.coroutines.scheduling.Task stealWithExclusiveMode(int r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU
            int r0 = r0.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU
            int r1 = r1.get(r4)
            r2 = 1
            if (r5 != r2) goto L10
            goto L11
        L10:
            r2 = 0
        L11:
            r5 = 0
            if (r0 == r1) goto L2a
            if (r2 == 0) goto L1f
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            int r3 = r3.get(r4)
            if (r3 != 0) goto L1f
            return r5
        L1f:
            int r5 = r0 + 1
            kotlinx.coroutines.scheduling.Task r0 = r4.tryExtractFromTheMiddle(r0, r2)
            if (r0 != 0) goto L29
            r0 = r5
            goto L11
        L29:
            return r0
        L2a:
            return r5
    }

    private final kotlinx.coroutines.scheduling.Task tryExtractFromTheMiddle(int r5, boolean r6) {
            r4 = this;
            r5 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r0 = r4.buffer
            java.lang.Object r0 = r0.get(r5)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            r1 = 0
            if (r0 == 0) goto L2a
            kotlinx.coroutines.scheduling.TaskContext r2 = r0.taskContext
            int r2 = r2.getTaskMode()
            r3 = 1
            if (r2 != r3) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 != r6) goto L2a
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r2 = r4.buffer
            boolean r5 = r2.compareAndSet(r5, r0, r1)
            if (r5 == 0) goto L2a
            if (r6 == 0) goto L29
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            r5.decrementAndGet(r4)
        L29:
            return r0
        L2a:
            return r1
    }

    private final long tryStealLastScheduled(int r8, kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.Task> r9) {
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            java.lang.Object r1 = r0.get(r7)
            kotlinx.coroutines.scheduling.Task r1 = (kotlinx.coroutines.scheduling.Task) r1
            r2 = -2
            if (r1 != 0) goto Ld
            return r2
        Ld:
            kotlinx.coroutines.scheduling.TaskContext r4 = r1.taskContext
            int r4 = r4.getTaskMode()
            r5 = 1
            if (r4 != r5) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r5 = 2
        L1d:
            r4 = r5 & r8
            if (r4 != 0) goto L22
            return r2
        L22:
            kotlinx.coroutines.scheduling.SchedulerTimeSource r2 = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource
            long r2 = r2.nanoTime()
            long r4 = r1.submissionTime
            long r2 = r2 - r4
            long r4 = kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L33
            long r4 = r4 - r2
            return r4
        L33:
            r2 = 0
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r7, r1, r2)
            if (r0 == 0) goto L0
            r9.element = r1
            r8 = -1
            return r8
    }

    public final kotlinx.coroutines.scheduling.Task add(kotlinx.coroutines.scheduling.Task r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            kotlinx.coroutines.scheduling.Task r1 = r0.addLast(r1)
            return r1
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            java.lang.Object r1 = r2.getAndSet(r0, r1)
            kotlinx.coroutines.scheduling.Task r1 = (kotlinx.coroutines.scheduling.Task) r1
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            kotlinx.coroutines.scheduling.Task r1 = r0.addLast(r1)
            return r1
    }

    public final int getSize$kotlinx_coroutines_core() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lf
            int r0 = r1.getBufferSize()
            int r0 = r0 + 1
            goto L13
        Lf:
            int r0 = r1.getBufferSize()
        L13:
            return r0
    }

    public final void offloadAllWorkTo(kotlinx.coroutines.scheduling.GlobalQueue r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 == 0) goto Le
            r3.addLast(r0)
        Le:
            boolean r0 = r2.pollTo(r3)
            if (r0 != 0) goto Le
            return
    }

    public final kotlinx.coroutines.scheduling.Task poll() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 != 0) goto Lf
            kotlinx.coroutines.scheduling.Task r0 = r2.pollBuffer()
        Lf:
            return r0
    }

    public final kotlinx.coroutines.scheduling.Task pollBlocking() {
            r1 = this;
            r0 = 1
            kotlinx.coroutines.scheduling.Task r0 = r1.pollWithExclusiveMode(r0)
            return r0
    }

    public final long trySteal(int r2, kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.Task> r3) {
            r1 = this;
            r0 = 3
            if (r2 != r0) goto L8
            kotlinx.coroutines.scheduling.Task r0 = r1.pollBuffer()
            goto Lc
        L8:
            kotlinx.coroutines.scheduling.Task r0 = r1.stealWithExclusiveMode(r2)
        Lc:
            if (r0 == 0) goto L13
            r3.element = r0
            r2 = -1
            return r2
        L13:
            long r2 = r1.tryStealLastScheduled(r2, r3)
            return r2
    }
}
