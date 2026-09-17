package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes2.dex */
public abstract class ConcurrentLinkedListNode<N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = null;
    private volatile java.lang.Object _next;
    private volatile java.lang.Object _prev;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.internal.ConcurrentLinkedListNode> r1 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.class
            java.lang.String r2 = "_next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU = r2
            java.lang.String r2 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU = r0
            return
    }

    public ConcurrentLinkedListNode(N r1) {
            r0 = this;
            r0.<init>()
            r0._prev = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$getNextOrClosed(kotlinx.coroutines.internal.ConcurrentLinkedListNode r0) {
            java.lang.Object r0 = r0.getNextOrClosed()
            return r0
    }

    private final N getAliveSegmentLeft() {
            r2 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getPrev()
        L4:
            if (r0 == 0) goto L15
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto L15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU
            java.lang.Object r0 = r1.get(r0)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            goto L4
        L15:
            return r0
    }

    private final N getAliveSegmentRight() {
            r2 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        L7:
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto L16
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r0.getNext()
            if (r1 != 0) goto L14
            return r0
        L14:
            r0 = r1
            goto L7
        L16:
            return r0
    }

    private final java.lang.Object getNextOrClosed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    public final void cleanPrev() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU
            r1 = 0
            r0.lazySet(r2, r1)
            return
    }

    public final N getNext() {
            r2 = this;
            java.lang.Object r0 = access$getNextOrClosed(r2)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            return r0
    }

    public final N getPrev() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            return r0
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
            r1 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r1.getNext()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean markAsClosed() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            r2 = 0
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r2, r1)
            return r0
    }

    public final void remove() {
            r5 = this;
            boolean r0 = r5.isTail()
            if (r0 == 0) goto L7
            return
        L7:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r5.getAliveSegmentLeft()
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r5.getAliveSegmentRight()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$FU
        L11:
            java.lang.Object r3 = r2.get(r1)
            r4 = r3
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r4 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r4
            if (r4 != 0) goto L1c
            r4 = 0
            goto L1d
        L1c:
            r4 = r0
        L1d:
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r1, r3, r4)
            if (r3 == 0) goto L11
            if (r0 == 0) goto L2a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU
            r2.set(r0, r1)
        L2a:
            boolean r2 = r1.isRemoved()
            if (r2 == 0) goto L36
            boolean r1 = r1.isTail()
            if (r1 == 0) goto L7
        L36:
            if (r0 == 0) goto L3e
            boolean r0 = r0.isRemoved()
            if (r0 != 0) goto L7
        L3e:
            return
    }

    public final boolean trySetNext(N r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$FU
            r1 = 0
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r1, r3)
            return r3
    }
}
