package kotlinx.coroutines.internal;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes2.dex */
public class LockFreeTaskQueue<E> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _cur$FU = null;
    private volatile java.lang.Object _cur;

    static {
            java.lang.Class<kotlinx.coroutines.internal.LockFreeTaskQueue> r0 = kotlinx.coroutines.internal.LockFreeTaskQueue.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_cur"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU = r0
            return
    }

    public LockFreeTaskQueue(boolean r3) {
            r2 = this;
            r2.<init>()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r1 = 8
            r0.<init>(r1, r3)
            r2._cur = r0
            return
    }

    public final boolean addLast(E r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            int r2 = r1.addLast(r5)
            r3 = 1
            if (r2 == 0) goto L21
            if (r2 == r3) goto L17
            r1 = 2
            if (r2 == r1) goto L15
            goto L2
        L15:
            r5 = 0
            return r5
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r1.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r1, r3)
            goto L2
        L21:
            return r3
    }

    public final void close() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            boolean r2 = r1.close()
            if (r2 == 0) goto Lf
            return
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r1.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r1, r3)
            goto L2
    }

    public final int getSize() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            int r0 = r0.getSize()
            return r0
    }

    public final E removeFirstOrNull() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            java.lang.Object r2 = r1.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r2 == r3) goto L11
            return r2
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r1.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r1, r3)
            goto L2
    }
}
