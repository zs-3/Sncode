package kotlinx.coroutines.sync;

/* compiled from: Semaphore.kt */
/* loaded from: classes2.dex */
public class SemaphoreImpl {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _availablePermits$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater deqIdx$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater enqIdx$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater head$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater tail$FU = null;
    private volatile int _availablePermits;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile java.lang.Object head;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellationRelease;
    private final int permits;
    private volatile java.lang.Object tail;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.sync.SemaphoreImpl> r1 = kotlinx.coroutines.sync.SemaphoreImpl.class
            java.lang.String r2 = "head"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.sync.SemaphoreImpl.head$FU = r2
            java.lang.String r2 = "deqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r2)
            kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU = r2
            java.lang.String r2 = "tail"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.sync.SemaphoreImpl.tail$FU = r0
            java.lang.String r0 = "enqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$FU = r0
            java.lang.String r0 = "_availablePermits"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU = r0
            return
    }

    public SemaphoreImpl(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r5.permits = r6
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L49
            if (r7 < 0) goto L13
            if (r7 > r6) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L2e
            kotlinx.coroutines.sync.SemaphoreSegment r0 = new kotlinx.coroutines.sync.SemaphoreSegment
            r1 = 0
            r3 = 0
            r4 = 2
            r0.<init>(r1, r3, r4)
            r5.head = r0
            r5.tail = r0
            int r6 = r6 - r7
            r5._availablePermits = r6
            kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1 r6 = new kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            r6.<init>(r5)
            r5.onCancellationRelease = r6
            return
        L2e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "The number of acquired permits should be in 0.."
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L49:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Semaphore should have at least 1 permit, but had "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    private final boolean addAcquireToQueue(kotlinx.coroutines.Waiter r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.sync.SemaphoreImpl.tail$FU
            java.lang.Object r3 = r2.get(r0)
            kotlinx.coroutines.sync.SemaphoreSegment r3 = (kotlinx.coroutines.sync.SemaphoreSegment) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$FU
            long r4 = r4.getAndIncrement(r0)
            kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1 r6 = kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE
            int r7 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r7 = (long) r7
            long r7 = r4 / r7
        L1b:
            java.lang.Object r9 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r3, r7, r6)
            boolean r10 = kotlinx.coroutines.internal.SegmentOrClosed.m131isClosedimpl(r9)
            if (r10 != 0) goto L5e
            kotlinx.coroutines.internal.Segment r10 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r9)
        L29:
            java.lang.Object r13 = r2.get(r0)
            kotlinx.coroutines.internal.Segment r13 = (kotlinx.coroutines.internal.Segment) r13
            long r14 = r13.id
            long r11 = r10.id
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L39
        L37:
            r10 = 1
            goto L51
        L39:
            boolean r11 = r10.tryIncPointers$kotlinx_coroutines_core()
            if (r11 != 0) goto L41
            r10 = 0
            goto L51
        L41:
            boolean r11 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r0, r13, r10)
            if (r11 == 0) goto L54
            boolean r10 = r13.decPointers$kotlinx_coroutines_core()
            if (r10 == 0) goto L37
            r13.remove()
            goto L37
        L51:
            if (r10 == 0) goto L1b
            goto L5e
        L54:
            boolean r11 = r10.decPointers$kotlinx_coroutines_core()
            if (r11 == 0) goto L29
            r10.remove()
            goto L29
        L5e:
            kotlinx.coroutines.internal.Segment r2 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r9)
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.getAcquirers()
            boolean r4 = r5.compareAndSet(r3, r4, r1)
            if (r4 == 0) goto L7b
            r1.invokeOnCancellation(r2, r3)
            r1 = 1
            return r1
        L7b:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.getAcquirers()
            boolean r2 = r2.compareAndSet(r3, r4, r5)
            if (r2 == 0) goto Lc9
            boolean r2 = r1 instanceof kotlinx.coroutines.CancellableContinuation
            if (r2 == 0) goto La1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r0.onCancellationRelease
            r1.resume(r2, r3)
        L9f:
            r1 = 1
            goto Lad
        La1:
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r2 == 0) goto Lae
            kotlinx.coroutines.selects.SelectInstance r1 = (kotlinx.coroutines.selects.SelectInstance) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r1.selectInRegistrationPhase(r2)
            goto L9f
        Lad:
            return r1
        Lae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lc9:
            r1 = 0
            return r1
    }

    private final void coerceAvailablePermitsAtMaximum() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r1 = r0.get(r3)
            int r2 = r3.permits
            if (r1 <= r2) goto L10
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
        L10:
            return
    }

    private final int decPermits() {
            r2 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r0 = r0.getAndDecrement(r2)
            int r1 = r2.permits
            if (r0 > r1) goto L0
            return r0
    }

    private final boolean tryResumeAcquire(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof kotlinx.coroutines.CancellableContinuation
            if (r0 == 0) goto L1d
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r1 = 0
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r3.onCancellationRelease
            java.lang.Object r0 = r4.tryResume(r0, r1, r2)
            if (r0 == 0) goto L1b
            r4.completeResume(r0)
            r4 = 1
            goto L29
        L1b:
            r4 = 0
            goto L29
        L1d:
            boolean r0 = r4 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r0 == 0) goto L2a
            kotlinx.coroutines.selects.SelectInstance r4 = (kotlinx.coroutines.selects.SelectInstance) r4
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            boolean r4 = r4.trySelect(r3, r0)
        L29:
            return r4
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final boolean tryResumeNextFromQueue() {
            r16 = this;
            r0 = r16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.SemaphoreImpl.head$FU
            java.lang.Object r2 = r1.get(r0)
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU
            long r3 = r3.getAndIncrement(r0)
            int r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r5
            long r5 = r3 / r5
            kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 r7 = kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE
        L19:
            java.lang.Object r8 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r2, r5, r7)
            boolean r9 = kotlinx.coroutines.internal.SegmentOrClosed.m131isClosedimpl(r8)
            if (r9 != 0) goto L5c
            kotlinx.coroutines.internal.Segment r9 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r8)
        L27:
            java.lang.Object r12 = r1.get(r0)
            kotlinx.coroutines.internal.Segment r12 = (kotlinx.coroutines.internal.Segment) r12
            long r13 = r12.id
            long r10 = r9.id
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 < 0) goto L37
        L35:
            r9 = 1
            goto L4f
        L37:
            boolean r10 = r9.tryIncPointers$kotlinx_coroutines_core()
            if (r10 != 0) goto L3f
            r9 = 0
            goto L4f
        L3f:
            boolean r10 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r0, r12, r9)
            if (r10 == 0) goto L52
            boolean r9 = r12.decPointers$kotlinx_coroutines_core()
            if (r9 == 0) goto L35
            r12.remove()
            goto L35
        L4f:
            if (r9 == 0) goto L19
            goto L5c
        L52:
            boolean r10 = r9.decPointers$kotlinx_coroutines_core()
            if (r10 == 0) goto L27
            r9.remove()
            goto L27
        L5c:
            kotlinx.coroutines.internal.Segment r1 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r8)
            kotlinx.coroutines.sync.SemaphoreSegment r1 = (kotlinx.coroutines.sync.SemaphoreSegment) r1
            r1.cleanPrev()
            long r7 = r1.id
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6d
            r2 = 0
            return r2
        L6d:
            int r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.getAcquirers()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto Lb0
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getMAX_SPIN_CYCLES$p()
            r10 = 0
        L87:
            if (r10 >= r3) goto L9d
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.getAcquirers()
            java.lang.Object r4 = r4.get(r2)
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            if (r4 != r5) goto L99
            r4 = 1
            return r4
        L99:
            r4 = 1
            int r10 = r10 + 1
            goto L87
        L9d:
            r4 = 1
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.getAcquirers()
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        Lb0:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            if (r3 != r1) goto Lb8
            r1 = 0
            return r1
        Lb8:
            boolean r1 = r0.tryResumeAcquire(r3)
            return r1
    }

    protected final void acquire(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r3) {
            r2 = this;
        L0:
            int r0 = r2.decPermits()
            if (r0 <= 0) goto Le
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r2.onCancellationRelease
            r3.resume(r0, r1)
            goto L1c
        Le:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            r0 = r3
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            boolean r0 = r2.addAcquireToQueue(r0)
            if (r0 == 0) goto L0
        L1c:
            return
    }

    public int getAvailablePermits() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r0 = r0.get(r2)
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public void release() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.permits
            if (r0 >= r1) goto L14
            if (r0 < 0) goto Ld
            return
        Ld:
            boolean r0 = r3.tryResumeNextFromQueue()
            if (r0 == 0) goto L0
            return
        L14:
            r3.coerceAvailablePermitsAtMaximum()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.permits
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean tryAcquire() {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r1 = r0.get(r3)
            int r2 = r3.permits
            if (r1 <= r2) goto Le
            r3.coerceAvailablePermitsAtMaximum()
            goto L0
        Le:
            if (r1 > 0) goto L12
            r0 = 0
            return r0
        L12:
            int r2 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            r0 = 1
            return r0
    }
}
