package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.Segment;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes2.dex */
public abstract class Segment<S extends kotlinx.coroutines.internal.Segment<S>> extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<S> implements kotlinx.coroutines.NotCompleted {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater cleanedAndPointers$FU = null;
    private volatile int cleanedAndPointers;
    public final long id;

    static {
            java.lang.Class<kotlinx.coroutines.internal.Segment> r0 = kotlinx.coroutines.internal.Segment.class
            java.lang.String r1 = "cleanedAndPointers"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU = r0
            return
    }

    public Segment(long r1, S r3, int r4) {
            r0 = this;
            r0.<init>(r3)
            r0.id = r1
            int r1 = r4 << 16
            r0.cleanedAndPointers = r1
            return
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.getNumberOfSlots()
            if (r0 != r1) goto L16
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public abstract int getNumberOfSlots();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public boolean isRemoved() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            int r0 = r0.get(r2)
            int r1 = r2.getNumberOfSlots()
            if (r0 != r1) goto L14
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public abstract void onCancellation(int r1, java.lang.Throwable r2, kotlin.coroutines.CoroutineContext r3);

    public final void onSlotCleaned() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.getNumberOfSlots()
            if (r0 != r1) goto Lf
            r2.remove()
        Lf:
            return
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$FU
        L2:
            int r1 = r0.get(r5)
            int r2 = r5.getNumberOfSlots()
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L17
            boolean r2 = r5.isTail()
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            if (r2 != 0) goto L1b
            goto L25
        L1b:
            r2 = 65536(0x10000, float:9.18355E-41)
            int r2 = r2 + r1
            boolean r1 = r0.compareAndSet(r5, r1, r2)
            if (r1 == 0) goto L2
            r3 = 1
        L25:
            return r3
    }
}
