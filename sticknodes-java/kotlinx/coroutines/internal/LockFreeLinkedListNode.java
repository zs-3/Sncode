package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes2.dex */
public class LockFreeLinkedListNode {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _removedRef$FU = null;
    private volatile java.lang.Object _next;
    private volatile java.lang.Object _prev;
    private volatile java.lang.Object _removedRef;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class CondAddOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.internal.LockFreeLinkedListNode> {
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode newNode;
        public kotlinx.coroutines.internal.LockFreeLinkedListNode oldNext;

        public CondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                r0.<init>()
                r0.newNode = r1
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ void complete(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                r0.complete2(r1, r2)
                return
        }

        /* renamed from: complete, reason: avoid collision after fix types in other method */
        public void complete2(kotlinx.coroutines.internal.LockFreeLinkedListNode r3, java.lang.Object r4) {
                r2 = this;
                if (r4 != 0) goto L4
                r4 = 1
                goto L5
            L4:
                r4 = 0
            L5:
                if (r4 == 0) goto La
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.newNode
                goto Lc
            La:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.oldNext
            Lc:
                if (r0 == 0) goto L24
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.access$get_next$FU$p()
                boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r2, r0)
                if (r3 == 0) goto L24
                if (r4 == 0) goto L24
                kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r2.newNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r2.oldNext
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$finishAdd(r3, r4)
            L24:
                return
        }
    }


    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.internal.LockFreeLinkedListNode> r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode.class
            java.lang.String r2 = "_next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU = r2
            java.lang.String r2 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU = r2
            java.lang.String r2 = "_removedRef"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._removedRef$FU = r0
            return
    }

    public LockFreeLinkedListNode() {
            r0 = this;
            r0.<init>()
            r0._next = r0
            r0._prev = r0
            return
    }

    public static final /* synthetic */ void access$finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode r0, kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
            r0.finishAdd(r1)
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$get_next$FU$p() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            return r0
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev(kotlinx.coroutines.internal.OpDescriptor r9) {
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.isRemoved()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r6 == 0) goto L34
            kotlinx.coroutines.internal.OpDescriptor r5 = (kotlinx.coroutines.internal.OpDescriptor) r5
            r5.perform(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.Removed
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            kotlinx.coroutines.internal.Removed r5 = (kotlinx.coroutines.internal.Removed) r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r5.ref
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r3)
            r3 = r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode findPrevNonRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L0:
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            java.lang.Object r2 = r0.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L0
    }

    private final void finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            java.lang.Object r2 = r3.getNext()
            if (r2 == r4) goto Lf
            return
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r1, r3)
            if (r1 == 0) goto L2
            boolean r0 = r3.isRemoved()
            if (r0 == 0) goto L21
            r0 = 0
            r4.correctPrev(r0)
        L21:
            return
    }

    private final kotlinx.coroutines.internal.Removed removed() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._removedRef$FU
            java.lang.Object r1 = r0.get(r2)
            kotlinx.coroutines.internal.Removed r1 = (kotlinx.coroutines.internal.Removed) r1
            if (r1 != 0) goto L12
            kotlinx.coroutines.internal.Removed r1 = new kotlinx.coroutines.internal.Removed
            r1.<init>(r2)
            r0.lazySet(r2, r1)
        L12:
            return r1
    }

    public final boolean addOneIfEmpty(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            r0.lazySet(r2, r1)
        La:
            java.lang.Object r0 = r1.getNext()
            if (r0 == r1) goto L12
            r2 = 0
            return r2
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r1, r2)
            if (r0 == 0) goto La
            r2.finishAdd(r1)
            r2 = 1
            return r2
    }

    public final java.lang.Object getNext() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
        L2:
            java.lang.Object r1 = r0.get(r3)
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r2 != 0) goto Lb
            return r1
        Lb:
            kotlinx.coroutines.internal.OpDescriptor r1 = (kotlinx.coroutines.internal.OpDescriptor) r1
            r1.perform(r3)
            goto L2
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getNextNode() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(r0)
            return r0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getPrevNode() {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.correctPrev(r0)
            if (r0 != 0) goto L13
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.findPrevNonRemoved(r0)
        L13:
            return r0
    }

    public boolean isRemoved() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.Removed
            return r0
    }

    public boolean remove() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.removeOrNext()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeOrNext() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.getNext()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.Removed
            if (r1 == 0) goto Ld
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.ref
            return r0
        Ld:
            if (r0 != r4) goto L12
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            return r0
        L12:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r1 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            kotlinx.coroutines.internal.Removed r2 = r1.removed()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r4, r0, r2)
            if (r0 == 0) goto L0
            r0 = 0
            r1.correctPrev(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1 r1 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            r1.<init>(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int tryCondAddNext(kotlinx.coroutines.internal.LockFreeLinkedListNode r2, kotlinx.coroutines.internal.LockFreeLinkedListNode r3, kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$FU
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU
            r0.lazySet(r2, r3)
            r4.oldNext = r3
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r3, r4)
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            java.lang.Object r2 = r4.perform(r1)
            if (r2 != 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 2
        L1d:
            return r2
    }
}
