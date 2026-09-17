package kotlinx.coroutines.internal;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes2.dex */
public final class LockFreeTaskQueueCore<E> {
    public static final kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion Companion = null;
    public static final kotlinx.coroutines.internal.Symbol REMOVE_FROZEN = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater _state$FU = null;
    private volatile java.lang.Object _next;
    private volatile long _state;
    private final java.util.concurrent.atomic.AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* compiled from: LockFreeTaskQueue.kt */
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

        public final int addFailReason(long r4) {
                r3 = this;
                r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
                long r4 = r4 & r0
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 == 0) goto Lb
                r4 = 2
                goto Lc
            Lb:
                r4 = 1
            Lc:
                return r4
        }

        public final long updateHead(long r3, int r5) {
                r2 = this;
                r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r3 = r2.wo(r3, r0)
                long r0 = (long) r5
                r5 = 0
                long r0 = r0 << r5
                long r3 = r3 | r0
                return r3
        }

        public final long updateTail(long r3, int r5) {
                r2 = this;
                r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r3 = r2.wo(r3, r0)
                long r0 = (long) r5
                r5 = 30
                long r0 = r0 << r5
                long r3 = r3 | r0
                return r3
        }

        public final long wo(long r1, long r3) {
                r0 = this;
                long r3 = ~r3
                long r1 = r1 & r3
                return r1
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    public static final class Placeholder {
        public final int index;

        public Placeholder(int r1) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                return
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.internal.LockFreeTaskQueueCore> r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.class
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r1 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion
            r2 = 0
            r1.<init>(r2)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$FU = r1
            java.lang.String r1 = "_state"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REMOVE_FROZEN"
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN = r0
            return
    }

    public LockFreeTaskQueueCore(int r5, boolean r6) {
            r4 = this;
            r4.<init>()
            r4.capacity = r5
            r4.singleConsumer = r6
            int r6 = r5 + (-1)
            r4.mask = r6
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r0.<init>(r5)
            r4.array = r0
            r0 = 0
            r1 = 1
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            if (r6 > r2) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            java.lang.String r3 = "Check failed."
            if (r2 == 0) goto L31
            r5 = r5 & r6
            if (r5 != 0) goto L24
            r0 = 1
        L24:
            if (r0 == 0) goto L27
            return
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r3.toString()
            r5.<init>(r6)
            throw r5
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r3.toString()
            r5.<init>(r6)
            throw r5
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateNextCopy(long r7) {
            r6 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            int r1 = r6.capacity
            int r1 = r1 * 2
            boolean r2 = r6.singleConsumer
            r0.<init>(r1, r2)
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r7
            r3 = 0
            long r1 = r1 >> r3
            int r2 = (int) r1
            r3 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r7
            r1 = 30
            long r3 = r3 >> r1
            int r1 = (int) r3
        L1c:
            int r3 = r6.mask
            r4 = r2 & r3
            r5 = r1 & r3
            if (r4 == r5) goto L3d
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r6.array
            r3 = r3 & r2
            java.lang.Object r3 = r4.get(r3)
            if (r3 != 0) goto L32
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r3 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder
            r3.<init>(r2)
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r0.array
            int r5 = r0.mask
            r5 = r5 & r2
            r4.set(r5, r3)
            int r2 = r2 + 1
            goto L1c
        L3d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r7 = r2.wo(r7, r3)
            r1.set(r0, r7)
            return r0
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$FU
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$FU
            r2 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r4.allocateNextCopy(r5)
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r4, r2, r3)
            goto L2
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> fillPlaceholder(int r3, E r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.array
            int r1 = r2.mask
            r1 = r1 & r3
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r1 == 0) goto L1c
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) r0
            int r0 = r0.index
            if (r0 != r3) goto L1c
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.array
            int r1 = r2.mask
            r3 = r3 & r1
            r0.set(r3, r4)
            return r2
        L1c:
            r3 = 0
            return r3
    }

    private final long markFrozen() {
            r10 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
        L2:
            long r2 = r6.get(r10)
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L11
            return r2
        L11:
            long r7 = r2 | r0
            r0 = r6
            r1 = r10
            r4 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2
            return r7
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> removeSlowPath(int r10, int r11) {
            r9 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
        L2:
            long r2 = r10.get(r9)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r1 = 0
            long r4 = r4 >> r1
            int r6 = (int) r4
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r2
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L1d
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r10 = r9.next()
            return r10
        L1d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r4 = r0.updateHead(r2, r11)
            r0 = r1
            r1 = r9
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r9.array
            int r11 = r9.mask
            r11 = r11 & r6
            r0 = 0
            r10.set(r11, r0)
            return r0
    }

    public final int addLast(E r15) {
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
        L2:
            long r3 = r0.get(r14)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L16
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r15 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            int r15 = r15.addFailReason(r3)
            return r15
        L16:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            r9 = 0
            long r5 = r5 >> r9
            int r2 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r10 = 30
            long r5 = r5 >> r10
            int r10 = (int) r5
            int r11 = r14.mask
            int r5 = r10 + 2
            r5 = r5 & r11
            r6 = r2 & r11
            r12 = 1
            if (r5 != r6) goto L34
            return r12
        L34:
            boolean r5 = r14.singleConsumer
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r14.array
            r13 = r10 & r11
            java.lang.Object r5 = r5.get(r13)
            if (r5 == 0) goto L53
            int r1 = r14.capacity
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L52
            int r10 = r10 - r2
            r2 = r10 & r6
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L52:
            return r12
        L53:
            int r2 = r10 + 1
            r2 = r2 & r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r12 = r1.updateTail(r3, r2)
            r1 = r5
            r2 = r14
            r5 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.array
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L84
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.next()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.fillPlaceholder(r10, r15)
            if (r0 != 0) goto L6d
        L84:
            return r9
    }

    public final boolean close() {
            r11 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
        L2:
            long r2 = r6.get(r11)
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r4 = r2 & r0
            r7 = 1
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L12
            return r7
        L12:
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r2
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L1b
            r0 = 0
            return r0
        L1b:
            long r4 = r2 | r0
            r0 = r6
            r1 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2
            return r7
    }

    public final int getSize() {
            r6 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r0 = r0.get(r6)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            r4 = 0
            long r2 = r2 >> r4
            int r3 = (int) r2
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r4
            r2 = 30
            long r0 = r0 >> r2
            int r1 = (int) r0
            int r1 = r1 - r3
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            return r0
    }

    public final boolean isEmpty() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r0 = r0.get(r7)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            r4 = 0
            long r2 = r2 >> r4
            int r3 = (int) r2
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r5
            r2 = 30
            long r0 = r0 >> r2
            int r1 = (int) r0
            if (r3 != r1) goto L1a
            r4 = 1
        L1a:
            return r4
    }

    public final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> next() {
            r2 = this;
            long r0 = r2.markFrozen()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r2.allocateOrGetNextCopy(r0)
            return r0
    }

    public final java.lang.Object removeFirstOrNull() {
            r11 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
        L2:
            long r3 = r0.get(r11)
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L12
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            return r0
        L12:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            r2 = 0
            long r5 = r5 >> r2
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r2 = (int) r5
            int r5 = r11.mask
            r2 = r2 & r5
            r6 = r7 & r5
            r8 = 0
            if (r2 != r6) goto L2e
            return r8
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r11.array
            r5 = r5 & r7
            java.lang.Object r9 = r2.get(r5)
            if (r9 != 0) goto L3c
            boolean r1 = r11.singleConsumer
            if (r1 == 0) goto L2
            return r8
        L3c:
            boolean r2 = r9 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r2 == 0) goto L41
            return r8
        L41:
            int r2 = r7 + 1
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r2 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$FU
            long r5 = r1.updateHead(r3, r10)
            r1 = r2
            r2 = r11
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L5f
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r11.array
            int r1 = r11.mask
            r1 = r1 & r7
            r0.set(r1, r8)
            return r9
        L5f:
            boolean r1 = r11.singleConsumer
            if (r1 == 0) goto L2
            r0 = r11
        L64:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r0.removeSlowPath(r7, r10)
            if (r0 != 0) goto L64
            return r9
    }
}
