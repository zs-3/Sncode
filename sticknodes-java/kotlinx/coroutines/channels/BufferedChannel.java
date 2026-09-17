package kotlinx.coroutines.channels;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes2.dex */
public class BufferedChannel<E> implements kotlinx.coroutines.channels.Channel<E> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _closeCause$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater bufferEnd$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater bufferEndSegment$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater closeHandler$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater receiveSegment$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater receivers$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater sendSegment$FU = null;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater sendersAndCloseStatus$FU = null;
    private volatile java.lang.Object _closeCause;
    private volatile long bufferEnd;
    private volatile java.lang.Object bufferEndSegment;
    private final int capacity;
    private volatile java.lang.Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile java.lang.Object receiveSegment;
    private volatile long receivers;
    private volatile java.lang.Object sendSegment;
    private volatile long sendersAndCloseStatus;

    /* compiled from: BufferedChannel.kt */
    private final class BufferedChannelIterator implements kotlinx.coroutines.Waiter {
        private kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> continuation;
        private java.lang.Object receiveResult;
        final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> this$0;

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> r0 = r1.continuation
                if (r0 == 0) goto L7
                r0.invokeOnCancellation(r2, r3)
            L7:
                return
        }

        public final boolean tryResumeHasNext(E r5) {
                r4 = this;
                kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> r0 = r4.continuation
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                r4.continuation = r1
                r4.receiveResult = r5
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                kotlinx.coroutines.channels.BufferedChannel<E> r3 = r4.this$0
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r3 = r3.onUndeliveredElement
                if (r3 == 0) goto L1a
                kotlin.coroutines.CoroutineContext r1 = r0.getContext()
                kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r3, r5, r1)
            L1a:
                boolean r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0(r0, r2, r1)
                return r5
        }

        public final void tryResumeHasNextOnClosedChannel() {
                r3 = this;
                kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> r0 = r3.continuation
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                r3.continuation = r1
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
                r3.receiveResult = r1
                kotlinx.coroutines.channels.BufferedChannel<E> r1 = r3.this$0
                java.lang.Throwable r1 = r1.getCloseCause()
                if (r1 != 0) goto L22
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)
                r0.resumeWith(r1)
                goto L2f
            L22:
                kotlin.Result$Companion r2 = kotlin.Result.Companion
                java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
                java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)
                r0.resumeWith(r1)
            L2f:
                return
        }
    }

    /* compiled from: BufferedChannel.kt */
    private static final class SendBroadcast implements kotlinx.coroutines.Waiter {
        private final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl<java.lang.Boolean> $$delegate_0;
        private final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont;

        public final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> getCont() {
                r1 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r1.cont
                return r0
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r2, int r3) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuationImpl<java.lang.Boolean> r0 = r1.$$delegate_0
                r0.invokeOnCancellation(r2, r3)
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r1 = kotlinx.coroutines.channels.BufferedChannel.class
            java.lang.String r2 = "sendersAndCloseStatus"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r2)
            kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU = r2
            java.lang.String r2 = "receivers"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r2)
            kotlinx.coroutines.channels.BufferedChannel.receivers$FU = r2
            java.lang.String r2 = "bufferEnd"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r2)
            kotlinx.coroutines.channels.BufferedChannel.bufferEnd$FU = r2
            java.lang.String r2 = "completedExpandBuffersAndPauseFlag"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r2)
            kotlinx.coroutines.channels.BufferedChannel.completedExpandBuffersAndPauseFlag$FU = r2
            java.lang.String r2 = "sendSegment"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel.sendSegment$FU = r2
            java.lang.String r2 = "receiveSegment"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU = r2
            java.lang.String r2 = "bufferEndSegment"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$FU = r2
            java.lang.String r2 = "_closeCause"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel._closeCause$FU = r2
            java.lang.String r2 = "closeHandler"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.channels.BufferedChannel.closeHandler$FU = r0
            return
    }

    public BufferedChannel(int r9, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r10) {
            r8 = this;
            r8.<init>()
            r8.capacity = r9
            r8.onUndeliveredElement = r10
            if (r9 < 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L4c
            long r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$initialBufferEnd(r9)
            r8.bufferEnd = r0
            long r0 = r8.getBufferEndCounter()
            r8.completedExpandBuffersAndPauseFlag = r0
            kotlinx.coroutines.channels.ChannelSegment r9 = new kotlinx.coroutines.channels.ChannelSegment
            r3 = 0
            r5 = 0
            r7 = 3
            r2 = r9
            r6 = r8
            r2.<init>(r3, r5, r6, r7)
            r8.sendSegment = r9
            r8.receiveSegment = r9
            boolean r0 = r8.isRendezvousOrUnlimited()
            if (r0 == 0) goto L38
            kotlinx.coroutines.channels.ChannelSegment r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNULL_SEGMENT$p()
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9, r0)
        L38:
            r8.bufferEndSegment = r9
            if (r10 == 0) goto L42
            kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1 r9 = new kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
            r9.<init>(r8)
            goto L43
        L42:
            r9 = 0
        L43:
            r8.onUndeliveredElementReceiveCancellationConstructor = r9
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNO_CLOSE_CAUSE$p()
            r8._closeCause = r9
            return
        L4c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Invalid channel capacity: "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = ", should be >=0"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$findSegmentReceive(kotlinx.coroutines.channels.BufferedChannel r0, long r1, kotlinx.coroutines.channels.ChannelSegment r3) {
            kotlinx.coroutines.channels.ChannelSegment r0 = r0.findSegmentReceive(r1, r3)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$findSegmentSend(kotlinx.coroutines.channels.BufferedChannel r0, long r1, kotlinx.coroutines.channels.ChannelSegment r3) {
            kotlinx.coroutines.channels.ChannelSegment r0 = r0.findSegmentSend(r1, r3)
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$getReceiveSegment$FU$p() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater access$getReceivers$FU$p() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$getSendSegment$FU$p() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendSegment$FU
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater access$getSendersAndCloseStatus$FU$p() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            return r0
    }

    public static final /* synthetic */ boolean access$isClosedForSend0(kotlinx.coroutines.channels.BufferedChannel r0, long r1) {
            boolean r0 = r0.isClosedForSend0(r1)
            return r0
    }

    public static final /* synthetic */ void access$onClosedReceiveOnNoWaiterSuspend(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.CancellableContinuation r1) {
            r0.onClosedReceiveOnNoWaiterSuspend(r1)
            return
    }

    public static final /* synthetic */ void access$prepareReceiverForSuspension(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.Waiter r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3) {
            r0.prepareReceiverForSuspension(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$prepareSenderForSuspension(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.Waiter r1, kotlinx.coroutines.channels.ChannelSegment r2, int r3) {
            r0.prepareSenderForSuspension(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$updateCellReceive(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.channels.ChannelSegment r1, int r2, long r3, java.lang.Object r5) {
            java.lang.Object r0 = r0.updateCellReceive(r1, r2, r3, r5)
            return r0
    }

    public static final /* synthetic */ int access$updateCellSend(kotlinx.coroutines.channels.BufferedChannel r0, kotlinx.coroutines.channels.ChannelSegment r1, int r2, java.lang.Object r3, long r4, java.lang.Object r6, boolean r7) {
            int r0 = r0.updateCellSend(r1, r2, r3, r4, r6, r7)
            return r0
    }

    private final boolean bufferOrRendezvousSend(long r5) {
            r4 = this;
            long r0 = r4.getBufferEndCounter()
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L17
            long r0 = r4.getReceiversCounter$kotlinx_coroutines_core()
            int r2 = r4.capacity
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            goto L17
        L15:
            r5 = 0
            goto L18
        L17:
            r5 = 1
        L18:
            return r5
    }

    private final void cancelSuspendedReceiveRequests(kotlinx.coroutines.channels.ChannelSegment<E> r9, long r10) {
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m126constructorimpl$default(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L6f
            int r3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L68
            long r4 = r9.id
            int r6 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L6f
        L1b:
            java.lang.Object r4 = r9.getState$kotlinx_coroutines_core(r3)
            if (r4 == 0) goto L58
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r4 != r5) goto L28
            goto L58
        L28:
            boolean r5 = r4 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r5 == 0) goto L42
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r5 = r9.casState$kotlinx_coroutines_core(r3, r4, r5)
            if (r5 == 0) goto L1b
            kotlinx.coroutines.channels.WaiterEB r4 = (kotlinx.coroutines.channels.WaiterEB) r4
            kotlinx.coroutines.Waiter r4 = r4.waiter
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m127plusFjFbRPM(r0, r4)
            r9.onCancelledRequest(r3, r1)
            goto L65
        L42:
            boolean r5 = r4 instanceof kotlinx.coroutines.Waiter
            if (r5 == 0) goto L65
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r5 = r9.casState$kotlinx_coroutines_core(r3, r4, r5)
            if (r5 == 0) goto L1b
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m127plusFjFbRPM(r0, r4)
            r9.onCancelledRequest(r3, r1)
            goto L65
        L58:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r4 = r9.casState$kotlinx_coroutines_core(r3, r4, r5)
            if (r4 == 0) goto L1b
            r9.onSlotCleaned()
        L65:
            int r3 = r3 + (-1)
            goto Lc
        L68:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r9 = r9.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r9 = (kotlinx.coroutines.channels.ChannelSegment) r9
            goto L6
        L6f:
            if (r0 == 0) goto L95
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L7b
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            r8.resumeReceiverOnClosedChannel(r0)
            goto L95
        L7b:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L87:
            if (r2 >= r9) goto L95
            java.lang.Object r10 = r0.get(r9)
            kotlinx.coroutines.Waiter r10 = (kotlinx.coroutines.Waiter) r10
            r8.resumeReceiverOnClosedChannel(r10)
            int r9 = r9 + (-1)
            goto L87
        L95:
            return
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> closeLinkedList() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$FU
            java.lang.Object r0 = r0.get(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.sendSegment$FU
            java.lang.Object r1 = r1.get(r7)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            long r2 = r1.id
            r4 = r0
            kotlinx.coroutines.channels.ChannelSegment r4 = (kotlinx.coroutines.channels.ChannelSegment) r4
            long r4 = r4.id
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1a
            r0 = r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU
            java.lang.Object r1 = r1.get(r7)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            long r2 = r1.id
            r4 = r0
            kotlinx.coroutines.channels.ChannelSegment r4 = (kotlinx.coroutines.channels.ChannelSegment) r4
            long r4 = r4.id
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L2e
            r0 = r1
        L2e:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.close(r0)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            return r0
    }

    private final void completeCancel(long r1) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelSegment r1 = r0.completeClose(r1)
            r0.removeUnprocessedElements(r1)
            return
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> completeClose(long r7) {
            r6 = this;
            kotlinx.coroutines.channels.ChannelSegment r0 = r6.closeLinkedList()
            boolean r1 = r6.isConflatedDropOldest()
            if (r1 == 0) goto L17
            long r1 = r6.markAllEmptyCellsAsClosed(r0)
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L17
            r6.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(r1)
        L17:
            r6.cancelSuspendedReceiveRequests(r0, r7)
            return r0
    }

    private final void completeCloseOrCancel() {
            r0 = this;
            r0.isClosedForSend()
            return
    }

    private final void expandBuffer() {
            r14 = this;
            boolean r0 = r14.isRendezvousOrUnlimited()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$FU
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        Lf:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.bufferEnd$FU
            long r7 = r1.getAndIncrement(r14)
            int r9 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r1 = (long) r9
            long r2 = r7 / r1
            long r4 = r14.getSendersCounter$kotlinx_coroutines_core()
            r10 = 0
            r11 = 1
            r12 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 > 0) goto L39
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L35
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r0.getNext()
            if (r1 == 0) goto L35
            r14.moveSegmentBufferEndToSpecifiedOrLast(r2, r0)
        L35:
            incCompletedExpandBufferAttempts$default(r14, r12, r11, r10)
            return
        L39:
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4a
            r1 = r14
            r4 = r0
            r5 = r7
            kotlinx.coroutines.channels.ChannelSegment r1 = r1.findSegmentBufferEnd(r2, r4, r5)
            if (r1 != 0) goto L49
            goto Lf
        L49:
            r0 = r1
        L4a:
            long r1 = (long) r9
            long r1 = r7 % r1
            int r2 = (int) r1
            boolean r1 = r14.updateCellExpandBuffer(r0, r2, r7)
            if (r1 == 0) goto L58
            incCompletedExpandBufferAttempts$default(r14, r12, r11, r10)
            return
        L58:
            incCompletedExpandBufferAttempts$default(r14, r12, r11, r10)
            goto Lf
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentBufferEnd(long r16, kotlinx.coroutines.channels.ChannelSegment<E> r18, long r19) {
            r15 = this;
            r6 = r15
            r0 = r16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$FU
            kotlin.reflect.KFunction r3 = kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction()
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = r18
        Ld:
            java.lang.Object r5 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r4, r0, r3)
            boolean r7 = kotlinx.coroutines.internal.SegmentOrClosed.m131isClosedimpl(r5)
            r8 = 1
            if (r7 != 0) goto L51
            kotlinx.coroutines.internal.Segment r7 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r5)
        L1c:
            java.lang.Object r9 = r2.get(r15)
            kotlinx.coroutines.internal.Segment r9 = (kotlinx.coroutines.internal.Segment) r9
            long r10 = r9.id
            long r12 = r7.id
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L2c
        L2a:
            r7 = 1
            goto L44
        L2c:
            boolean r10 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r10 != 0) goto L34
            r7 = 0
            goto L44
        L34:
            boolean r10 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r15, r9, r7)
            if (r10 == 0) goto L47
            boolean r7 = r9.decPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto L2a
            r9.remove()
            goto L2a
        L44:
            if (r7 == 0) goto Ld
            goto L51
        L47:
            boolean r9 = r7.decPointers$kotlinx_coroutines_core()
            if (r9 == 0) goto L1c
            r7.remove()
            goto L1c
        L51:
            boolean r2 = kotlinx.coroutines.internal.SegmentOrClosed.m131isClosedimpl(r5)
            r9 = 0
            r7 = 0
            if (r2 == 0) goto L64
            r15.completeCloseOrCancel()
            r15.moveSegmentBufferEndToSpecifiedOrLast(r16, r18)
            incCompletedExpandBufferAttempts$default(r15, r9, r8, r7)
            goto L95
        L64:
            kotlinx.coroutines.internal.Segment r2 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r5)
            r11 = r2
            kotlinx.coroutines.channels.ChannelSegment r11 = (kotlinx.coroutines.channels.ChannelSegment) r11
            long r2 = r11.id
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L94
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.bufferEnd$FU
            r4 = 1
            long r4 = r19 + r4
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r13 = (long) r12
            long r13 = r13 * r2
            r1 = r15
            r2 = r4
            r4 = r13
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L90
            long r0 = r11.id
            long r2 = (long) r12
            long r0 = r0 * r2
            long r0 = r0 - r19
            r15.incCompletedExpandBufferAttempts(r0)
            goto L95
        L90:
            incCompletedExpandBufferAttempts$default(r15, r9, r8, r7)
            goto L95
        L94:
            r7 = r11
        L95:
            return r7
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive(long r12, kotlinx.coroutines.channels.ChannelSegment<E> r14) {
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU
            kotlin.reflect.KFunction r1 = kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
        L8:
            java.lang.Object r2 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r14, r12, r1)
            boolean r3 = kotlinx.coroutines.internal.SegmentOrClosed.m131isClosedimpl(r2)
            if (r3 != 0) goto L4a
            kotlinx.coroutines.internal.Segment r3 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r2)
        L16:
            java.lang.Object r4 = r0.get(r11)
            kotlinx.coroutines.internal.Segment r4 = (kotlinx.coroutines.internal.Segment) r4
            long r5 = r4.id
            long r7 = r3.id
            r9 = 1
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L26
            goto L3d
        L26:
            boolean r5 = r3.tryIncPointers$kotlinx_coroutines_core()
            if (r5 != 0) goto L2e
            r9 = 0
            goto L3d
        L2e:
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r11, r4, r3)
            if (r5 == 0) goto L40
            boolean r3 = r4.decPointers$kotlinx_coroutines_core()
            if (r3 == 0) goto L3d
            r4.remove()
        L3d:
            if (r9 == 0) goto L8
            goto L4a
        L40:
            boolean r4 = r3.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L16
            r3.remove()
            goto L16
        L4a:
            boolean r0 = kotlinx.coroutines.internal.SegmentOrClosed.m131isClosedimpl(r2)
            r1 = 0
            if (r0 == 0) goto L67
            r11.completeCloseOrCancel()
            long r12 = r14.id
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r0
            long r12 = r12 * r2
            long r2 = r11.getSendersCounter$kotlinx_coroutines_core()
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lcf
            r14.cleanPrev()
            goto Lcf
        L67:
            kotlinx.coroutines.internal.Segment r14 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r2)
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
            boolean r0 = r11.isRendezvousOrUnlimited()
            if (r0 != 0) goto Laf
            long r2 = r11.getBufferEndCounter()
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r4 = (long) r0
            long r2 = r2 / r4
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 > 0) goto Laf
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$FU
        L81:
            java.lang.Object r2 = r0.get(r11)
            kotlinx.coroutines.internal.Segment r2 = (kotlinx.coroutines.internal.Segment) r2
            long r3 = r2.id
            long r5 = r14.id
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto Laf
            boolean r3 = r14.tryIncPointers$kotlinx_coroutines_core()
            if (r3 == 0) goto Laf
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r11, r2, r14)
            if (r3 == 0) goto La5
            boolean r0 = r2.decPointers$kotlinx_coroutines_core()
            if (r0 == 0) goto Laf
            r2.remove()
            goto Laf
        La5:
            boolean r2 = r14.decPointers$kotlinx_coroutines_core()
            if (r2 == 0) goto L81
            r14.remove()
            goto L81
        Laf:
            long r2 = r14.id
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto Lce
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r4 = (long) r12
            long r2 = r2 * r4
            r11.updateReceiversCounterIfLower(r2)
            long r2 = r14.id
            long r12 = (long) r12
            long r2 = r2 * r12
            long r12 = r11.getSendersCounter$kotlinx_coroutines_core()
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto Lcf
            r14.cleanPrev()
            goto Lcf
        Lce:
            r1 = r14
        Lcf:
            return r1
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentSend(long r12, kotlinx.coroutines.channels.ChannelSegment<E> r14) {
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendSegment$FU
            kotlin.reflect.KFunction r1 = kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction()
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
        L8:
            java.lang.Object r2 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r14, r12, r1)
            boolean r3 = kotlinx.coroutines.internal.SegmentOrClosed.m131isClosedimpl(r2)
            if (r3 != 0) goto L4a
            kotlinx.coroutines.internal.Segment r3 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r2)
        L16:
            java.lang.Object r4 = r0.get(r11)
            kotlinx.coroutines.internal.Segment r4 = (kotlinx.coroutines.internal.Segment) r4
            long r5 = r4.id
            long r7 = r3.id
            r9 = 1
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L26
            goto L3d
        L26:
            boolean r5 = r3.tryIncPointers$kotlinx_coroutines_core()
            if (r5 != 0) goto L2e
            r9 = 0
            goto L3d
        L2e:
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r11, r4, r3)
            if (r5 == 0) goto L40
            boolean r3 = r4.decPointers$kotlinx_coroutines_core()
            if (r3 == 0) goto L3d
            r4.remove()
        L3d:
            if (r9 == 0) goto L8
            goto L4a
        L40:
            boolean r4 = r3.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L16
            r3.remove()
            goto L16
        L4a:
            boolean r0 = kotlinx.coroutines.internal.SegmentOrClosed.m131isClosedimpl(r2)
            r1 = 0
            if (r0 == 0) goto L67
            r11.completeCloseOrCancel()
            long r12 = r14.id
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r0
            long r12 = r12 * r2
            long r2 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 >= 0) goto L8d
            r14.cleanPrev()
            goto L8d
        L67:
            kotlinx.coroutines.internal.Segment r14 = kotlinx.coroutines.internal.SegmentOrClosed.m130getSegmentimpl(r2)
            kotlinx.coroutines.channels.ChannelSegment r14 = (kotlinx.coroutines.channels.ChannelSegment) r14
            long r2 = r14.id
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L8c
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r4 = (long) r12
            long r2 = r2 * r4
            r11.updateSendersCounterIfLower(r2)
            long r2 = r14.id
            long r12 = (long) r12
            long r2 = r2 * r12
            long r12 = r11.getReceiversCounter$kotlinx_coroutines_core()
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L8d
            r14.cleanPrev()
            goto L8d
        L8c:
            r1 = r14
        L8d:
            return r1
    }

    private final long getBufferEndCounter() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.bufferEnd$FU
            long r0 = r0.get(r2)
            return r0
    }

    private final java.lang.Throwable getReceiveException() {
            r2 = this;
            java.lang.Throwable r0 = r2.getCloseCause()
            if (r0 != 0) goto Ld
            kotlinx.coroutines.channels.ClosedReceiveChannelException r0 = new kotlinx.coroutines.channels.ClosedReceiveChannelException
            java.lang.String r1 = "Channel was closed"
            r0.<init>(r1)
        Ld:
            return r0
    }

    private final void incCompletedExpandBufferAttempts(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.completedExpandBuffersAndPauseFlag$FU
            long r8 = r0.addAndGet(r7, r8)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r8 = r8 & r0
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L13
            r8 = 1
            goto L14
        L13:
            r8 = 0
        L14:
            if (r8 == 0) goto L26
        L16:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.channels.BufferedChannel.completedExpandBuffersAndPauseFlag$FU
            long r8 = r8.get(r7)
            long r8 = r8 & r0
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L23
            r8 = 1
            goto L24
        L23:
            r8 = 0
        L24:
            if (r8 != 0) goto L16
        L26:
            return
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(kotlinx.coroutines.channels.BufferedChannel r0, long r1, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 1
        L8:
            r0.incCompletedExpandBufferAttempts(r1)
            return
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts"
            r0.<init>(r1)
            throw r0
    }

    private final void invokeCloseHandler() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.closeHandler$FU
        L2:
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto Ld
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getCLOSE_HANDLER_CLOSED$p()
            goto L11
        Ld:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getCLOSE_HANDLER_INVOKED$p()
        L11:
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            if (r2 == 0) goto L2
            if (r1 != 0) goto L1a
            return
        L1a:
            r0 = 1
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r1, r0)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Throwable r0 = r3.getCloseCause()
            r1.invoke(r0)
            return
    }

    private final boolean isCellNonEmpty(kotlinx.coroutines.channels.ChannelSegment<E> r5, int r6, long r7) {
            r4 = this;
        L0:
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core(r6)
            r1 = 0
            if (r0 == 0) goto L48
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r0 != r2) goto Le
            goto L48
        Le:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            r6 = 1
            if (r0 != r5) goto L14
            return r6
        L14:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r0 != r5) goto L1b
            return r1
        L1b:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r0 != r5) goto L22
            return r1
        L22:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r0 != r5) goto L29
            return r1
        L29:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            if (r0 != r5) goto L30
            return r1
        L30:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r0 != r5) goto L37
            return r6
        L37:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r0 != r5) goto L3e
            return r1
        L3e:
            long r2 = r4.getReceiversCounter$kotlinx_coroutines_core()
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 != 0) goto L47
            r1 = 1
        L47:
            return r1
        L48:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            boolean r0 = r5.casState$kotlinx_coroutines_core(r6, r0, r2)
            if (r0 == 0) goto L0
            r4.expandBuffer()
            return r1
    }

    private final boolean isClosed(long r7, boolean r9) {
            r6 = this;
            r0 = 60
            long r0 = r7 >> r0
            int r1 = (int) r0
            r0 = 0
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 == r2) goto L44
            r3 = 2
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r1 == r3) goto L37
            r9 = 3
            if (r1 != r9) goto L1c
            long r7 = r7 & r4
            r6.completeCancel(r7)
        L1a:
            r0 = 1
            goto L44
        L1c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "unexpected close status: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L37:
            long r7 = r7 & r4
            r6.completeClose(r7)
            if (r9 == 0) goto L1a
            boolean r7 = r6.hasElements$kotlinx_coroutines_core()
            if (r7 != 0) goto L44
            goto L1a
        L44:
            return r0
    }

    private final boolean isClosedForReceive0(long r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.isClosed(r2, r0)
            return r2
    }

    private final boolean isClosedForSend0(long r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.isClosed(r2, r0)
            return r2
    }

    private final boolean isRendezvousOrUnlimited() {
            r5 = this;
            long r0 = r5.getBufferEndCounter()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            return r0
    }

    private final long markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment<E> r9) {
            r8 = this;
        L0:
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3d
            long r3 = r9.id
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r8.getReceiversCounter$kotlinx_coroutines_core()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L1b
            return r1
        L1b:
            java.lang.Object r1 = r9.getState$kotlinx_coroutines_core(r0)
            if (r1 == 0) goto L2d
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r1 != r2) goto L28
            goto L2d
        L28:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r1 != r2) goto L3a
            return r3
        L2d:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r1 = r9.casState$kotlinx_coroutines_core(r0, r1, r2)
            if (r1 == 0) goto L1b
            r9.onSlotCleaned()
        L3a:
            int r0 = r0 + (-1)
            goto L4
        L3d:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r9 = r9.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r9 = (kotlinx.coroutines.channels.ChannelSegment) r9
            if (r9 != 0) goto L0
            return r1
    }

    private final void markCancellationStarted() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
        L2:
            long r2 = r6.get(r7)
            r0 = 60
            long r0 = r2 >> r0
            int r1 = (int) r0
            if (r1 != 0) goto L20
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r2
            r4 = 1
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r0, r4)
            r0 = r6
            r1 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2
        L20:
            return
    }

    private final void markCancelled() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
        L2:
            long r2 = r6.get(r7)
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r2
            r4 = 3
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r0, r4)
            r0 = r6
            r1 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2
            return
    }

    private final void markClosed() {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
        L2:
            long r2 = r6.get(r7)
            r0 = 60
            long r0 = r2 >> r0
            int r1 = (int) r0
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r1 == 0) goto L1e
            r0 = 1
            if (r1 == r0) goto L16
            return
        L16:
            long r0 = r2 & r4
            r4 = 3
            long r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r0, r4)
            goto L25
        L1e:
            long r0 = r2 & r4
            r4 = 2
            long r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r0, r4)
        L25:
            r4 = r0
            r0 = r6
            r1 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2
            return
    }

    private final void moveSegmentBufferEndToSpecifiedOrLast(long r7, kotlinx.coroutines.channels.ChannelSegment<E> r9) {
            r6 = this;
        L0:
            long r0 = r9.id
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L11
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r9.getNext()
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            boolean r7 = r9.isRemoved()
            if (r7 == 0) goto L22
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r7 = r9.getNext()
            kotlinx.coroutines.channels.ChannelSegment r7 = (kotlinx.coroutines.channels.ChannelSegment) r7
            if (r7 != 0) goto L20
            goto L22
        L20:
            r9 = r7
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$FU
        L24:
            java.lang.Object r8 = r7.get(r6)
            kotlinx.coroutines.internal.Segment r8 = (kotlinx.coroutines.internal.Segment) r8
            long r0 = r8.id
            long r2 = r9.id
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L34
            goto L4b
        L34:
            boolean r0 = r9.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L3c
            r4 = 0
            goto L4b
        L3c:
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r7, r6, r8, r9)
            if (r0 == 0) goto L4e
            boolean r7 = r8.decPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto L4b
            r8.remove()
        L4b:
            if (r4 == 0) goto L11
            return
        L4e:
            boolean r8 = r9.decPointers$kotlinx_coroutines_core()
            if (r8 == 0) goto L24
            r9.remove()
            goto L24
    }

    private final void onClosedReceiveOnNoWaiterSuspend(kotlinx.coroutines.CancellableContinuation<? super E> r2) {
            r1 = this;
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Throwable r0 = r1.getReceiveException()
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
            r2.resumeWith(r0)
            return
    }

    private final void prepareReceiverForSuspension(kotlinx.coroutines.Waiter r1, kotlinx.coroutines.channels.ChannelSegment<E> r2, int r3) {
            r0 = this;
            r0.onReceiveEnqueued()
            r1.invokeOnCancellation(r2, r3)
            return
    }

    private final void prepareSenderForSuspension(kotlinx.coroutines.Waiter r2, kotlinx.coroutines.channels.ChannelSegment<E> r3, int r4) {
            r1 = this;
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r4 = r4 + r0
            r2.invokeOnCancellation(r3, r4)
            return
    }

    static /* synthetic */ <E> java.lang.Object receive$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> r10, kotlin.coroutines.Continuation<? super E> r11) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getReceiveSegment$FU$p()
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        La:
            boolean r1 = r10.isClosedForReceive()
            if (r1 != 0) goto L70
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getReceivers$FU$p()
            long r8 = r1.getAndIncrement(r10)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r8 / r2
            long r4 = (long) r1
            long r4 = r8 % r4
            int r1 = (int) r4
            long r4 = r0.id
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L2f
            kotlinx.coroutines.channels.ChannelSegment r2 = access$findSegmentReceive(r10, r2, r0)
            if (r2 != 0) goto L2e
            goto La
        L2e:
            r0 = r2
        L2f:
            r7 = 0
            r2 = r10
            r3 = r0
            r4 = r1
            r5 = r8
            java.lang.Object r2 = access$updateCellReceive(r2, r3, r4, r5, r7)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r2 == r3) goto L64
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r2 != r3) goto L50
            long r1 = r10.getSendersCounter$kotlinx_coroutines_core()
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto La
            r0.cleanPrev()
            goto La
        L50:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r2 != r3) goto L60
            r2 = r10
            r3 = r0
            r4 = r1
            r5 = r8
            r7 = r11
            java.lang.Object r10 = r2.receiveOnNoWaiterSuspend(r3, r4, r5, r7)
            return r10
        L60:
            r0.cleanPrev()
            return r2
        L64:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "unexpected"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L70:
            java.lang.Throwable r10 = r10.getReceiveException()
            java.lang.Throwable r10 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r10)
            throw r10
    }

    private final java.lang.Object receiveOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> r9, int r10, long r11, kotlin.coroutines.Continuation<? super E> r13) {
            r8 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r13)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = access$updateCellReceive(r1, r2, r3, r4, r6)     // Catch: java.lang.Throwable -> Ld1
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()     // Catch: java.lang.Throwable -> Ld1
            if (r1 != r2) goto L1c
            access$prepareReceiverForSuspension(r8, r0, r9, r10)     // Catch: java.lang.Throwable -> Ld1
            goto Lc3
        L1c:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()     // Catch: java.lang.Throwable -> Ld1
            r7 = 0
            if (r1 != r10) goto Lb3
            long r1 = r8.getSendersCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> Ld1
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L2e
            r9.cleanPrev()     // Catch: java.lang.Throwable -> Ld1
        L2e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = access$getReceiveSegment$FU$p()     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r9 = r9.get(r8)     // Catch: java.lang.Throwable -> Ld1
            kotlinx.coroutines.channels.ChannelSegment r9 = (kotlinx.coroutines.channels.ChannelSegment) r9     // Catch: java.lang.Throwable -> Ld1
        L38:
            boolean r10 = r8.isClosedForReceive()     // Catch: java.lang.Throwable -> Ld1
            if (r10 == 0) goto L43
            access$onClosedReceiveOnNoWaiterSuspend(r8, r0)     // Catch: java.lang.Throwable -> Ld1
            goto Lc3
        L43:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = access$getReceivers$FU$p()     // Catch: java.lang.Throwable -> Ld1
            long r10 = r10.getAndIncrement(r8)     // Catch: java.lang.Throwable -> Ld1
            int r12 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE     // Catch: java.lang.Throwable -> Ld1
            long r1 = (long) r12     // Catch: java.lang.Throwable -> Ld1
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch: java.lang.Throwable -> Ld1
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch: java.lang.Throwable -> Ld1
            long r3 = r9.id     // Catch: java.lang.Throwable -> Ld1
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L62
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentReceive(r8, r1, r9)     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto L61
            goto L38
        L61:
            r9 = r1
        L62:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = access$updateCellReceive(r1, r2, r3, r4, r6)     // Catch: java.lang.Throwable -> Ld1
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()     // Catch: java.lang.Throwable -> Ld1
            if (r1 != r2) goto L7c
            boolean r10 = r0 instanceof kotlinx.coroutines.Waiter     // Catch: java.lang.Throwable -> Ld1
            if (r10 == 0) goto L76
            r7 = r0
        L76:
            if (r7 == 0) goto Lc3
            access$prepareReceiverForSuspension(r8, r7, r9, r12)     // Catch: java.lang.Throwable -> Ld1
            goto Lc3
        L7c:
            kotlinx.coroutines.internal.Symbol r12 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()     // Catch: java.lang.Throwable -> Ld1
            if (r1 != r12) goto L8e
            long r1 = r8.getSendersCounter$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> Ld1
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L38
            r9.cleanPrev()     // Catch: java.lang.Throwable -> Ld1
            goto L38
        L8e:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()     // Catch: java.lang.Throwable -> Ld1
            if (r1 == r10) goto La7
            r9.cleanPrev()     // Catch: java.lang.Throwable -> Ld1
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r9 = r8.onUndeliveredElement     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto La3
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()     // Catch: java.lang.Throwable -> Ld1
            kotlin.jvm.functions.Function1 r7 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r9, r1, r10)     // Catch: java.lang.Throwable -> Ld1
        La3:
            r0.resume(r1, r7)     // Catch: java.lang.Throwable -> Ld1
            goto Lc3
        La7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r10 = "unexpected"
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Ld1
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Ld1
            throw r9     // Catch: java.lang.Throwable -> Ld1
        Lb3:
            r9.cleanPrev()     // Catch: java.lang.Throwable -> Ld1
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r9 = r8.onUndeliveredElement     // Catch: java.lang.Throwable -> Ld1
            if (r9 == 0) goto La3
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()     // Catch: java.lang.Throwable -> Ld1
            kotlin.jvm.functions.Function1 r7 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r9, r1, r10)     // Catch: java.lang.Throwable -> Ld1
            goto La3
        Lc3:
            java.lang.Object r9 = r0.getResult()
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r10) goto Ld0
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r13)
        Ld0:
            return r9
        Ld1:
            r9 = move-exception
            r0.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r9
    }

    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment<E> r13) {
            r12 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r12.onUndeliveredElement
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m126constructorimpl$default(r1, r2, r1)
        L8:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb4
            long r6 = r13.id
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L17:
            java.lang.Object r8 = r13.getState$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r8 == r9) goto Lbc
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r8 != r9) goto L49
            long r9 = r12.getReceiversCounter$kotlinx_coroutines_core()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r13.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L41
            java.lang.Object r5 = r13.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L41:
            r13.cleanElement$kotlinx_coroutines_core(r4)
            r13.onSlotCleaned()
            goto Lb0
        L49:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r8 == r9) goto La3
            if (r8 != 0) goto L52
            goto La3
        L52:
            boolean r9 = r8 instanceof kotlinx.coroutines.Waiter
            if (r9 != 0) goto L6f
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L5b
            goto L6f
        L5b:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto Lbc
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r8 != r9) goto L68
            goto Lbc
        L68:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r8 == r9) goto L17
            goto Lb0
        L6f:
            long r9 = r12.getReceiversCounter$kotlinx_coroutines_core()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto Lbc
            boolean r9 = r8 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L81
            r9 = r8
            kotlinx.coroutines.channels.WaiterEB r9 = (kotlinx.coroutines.channels.WaiterEB) r9
            kotlinx.coroutines.Waiter r9 = r9.waiter
            goto L84
        L81:
            r9 = r8
            kotlinx.coroutines.Waiter r9 = (kotlinx.coroutines.Waiter) r9
        L84:
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r13.casState$kotlinx_coroutines_core(r4, r8, r10)
            if (r8 == 0) goto L17
            if (r0 == 0) goto L98
            java.lang.Object r5 = r13.getElement$kotlinx_coroutines_core(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r5, r1)
        L98:
            java.lang.Object r3 = kotlinx.coroutines.internal.InlineList.m127plusFjFbRPM(r3, r9)
            r13.cleanElement$kotlinx_coroutines_core(r4)
            r13.onSlotCleaned()
            goto Lb0
        La3:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r8 = r13.casState$kotlinx_coroutines_core(r4, r8, r9)
            if (r8 == 0) goto L17
            r13.onSlotCleaned()
        Lb0:
            int r4 = r4 + (-1)
            goto Lb
        Lb4:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r13 = r13.getPrev()
            kotlinx.coroutines.channels.ChannelSegment r13 = (kotlinx.coroutines.channels.ChannelSegment) r13
            if (r13 != 0) goto L8
        Lbc:
            if (r3 == 0) goto Le2
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto Lc8
            kotlinx.coroutines.Waiter r3 = (kotlinx.coroutines.Waiter) r3
            r12.resumeSenderOnCancelledChannel(r3)
            goto Le2
        Lc8:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        Ld4:
            if (r5 >= r13) goto Le2
            java.lang.Object r0 = r3.get(r13)
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            r12.resumeSenderOnCancelledChannel(r0)
            int r13 = r13 + (-1)
            goto Ld4
        Le2:
            if (r1 != 0) goto Le5
            return
        Le5:
            throw r1
    }

    private final void resumeReceiverOnClosedChannel(kotlinx.coroutines.Waiter r2) {
            r1 = this;
            r0 = 1
            r1.resumeWaiterOnClosedChannel(r2, r0)
            return
    }

    private final void resumeSenderOnCancelledChannel(kotlinx.coroutines.Waiter r2) {
            r1 = this;
            r0 = 0
            r1.resumeWaiterOnClosedChannel(r2, r0)
            return
    }

    private final void resumeWaiterOnClosedChannel(kotlinx.coroutines.Waiter r3, boolean r4) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast
            if (r0 == 0) goto L16
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r3 = (kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) r3
            kotlinx.coroutines.CancellableContinuation r3 = r3.getCont()
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r4 = kotlin.Result.m72constructorimpl(r4)
            r3.resumeWith(r4)
            goto L6c
        L16:
            boolean r0 = r3 instanceof kotlinx.coroutines.CancellableContinuation
            if (r0 == 0) goto L35
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            if (r4 == 0) goto L25
            java.lang.Throwable r4 = r2.getReceiveException()
            goto L29
        L25:
            java.lang.Throwable r4 = r2.getSendException()
        L29:
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)
            java.lang.Object r4 = kotlin.Result.m72constructorimpl(r4)
            r3.resumeWith(r4)
            goto L6c
        L35:
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.ReceiveCatching
            if (r4 == 0) goto L55
            kotlinx.coroutines.channels.ReceiveCatching r3 = (kotlinx.coroutines.channels.ReceiveCatching) r3
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> r3 = r3.cont
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlinx.coroutines.channels.ChannelResult$Companion r4 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r0 = r2.getCloseCause()
            java.lang.Object r4 = r4.m117closedJP2dKIU(r0)
            kotlinx.coroutines.channels.ChannelResult r4 = kotlinx.coroutines.channels.ChannelResult.m107boximpl(r4)
            java.lang.Object r4 = kotlin.Result.m72constructorimpl(r4)
            r3.resumeWith(r4)
            goto L6c
        L55:
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator
            if (r4 == 0) goto L5f
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r3 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r3
            r3.tryResumeHasNextOnClosedChannel()
            goto L6c
        L5f:
            boolean r4 = r3 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r4 == 0) goto L6d
            kotlinx.coroutines.selects.SelectInstance r3 = (kotlinx.coroutines.selects.SelectInstance) r3
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            r3.trySelect(r2, r4)
        L6c:
            return
        L6d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected waiter: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    private final boolean shouldSendSuspend(long r3) {
            r2 = this;
            boolean r0 = r2.isClosedForSend0(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r0
            boolean r3 = r2.bufferOrRendezvousSend(r3)
            r3 = r3 ^ 1
            return r3
    }

    private final boolean tryResumeReceiver(java.lang.Object r5, E r6) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r0 == 0) goto Lb
            kotlinx.coroutines.selects.SelectInstance r5 = (kotlinx.coroutines.selects.SelectInstance) r5
            boolean r5 = r5.trySelect(r4, r6)
            goto L61
        Lb:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ReceiveCatching
            r1 = 0
            if (r0 == 0) goto L36
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            kotlinx.coroutines.channels.ReceiveCatching r5 = (kotlinx.coroutines.channels.ReceiveCatching) r5
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> r0 = r5.cont
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r2 = r2.m119successJP2dKIU(r6)
            kotlinx.coroutines.channels.ChannelResult r2 = kotlinx.coroutines.channels.ChannelResult.m107boximpl(r2)
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r3 = r4.onUndeliveredElement
            if (r3 == 0) goto L31
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> r5 = r5.cont
            kotlin.coroutines.CoroutineContext r5 = r5.getContext()
            kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r3, r6, r5)
        L31:
            boolean r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0(r0, r2, r1)
            goto L61
        L36:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator
            if (r0 == 0) goto L46
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r5 = (kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) r5
            boolean r5 = r5.tryResumeHasNext(r6)
            goto L61
        L46:
            boolean r0 = r5 instanceof kotlinx.coroutines.CancellableContinuation
            if (r0 == 0) goto L62
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            kotlinx.coroutines.CancellableContinuation r5 = (kotlinx.coroutines.CancellableContinuation) r5
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r4.onUndeliveredElement
            if (r0 == 0) goto L5d
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            kotlin.jvm.functions.Function1 r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r6, r1)
        L5d:
            boolean r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$tryResume0(r5, r6, r1)
        L61:
            return r5
        L62:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected receiver type: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    private final boolean tryResumeSender(java.lang.Object r4, kotlinx.coroutines.channels.ChannelSegment<E> r5, int r6) {
            r3 = this;
            boolean r0 = r4 instanceof kotlinx.coroutines.CancellableContinuation
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L14
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            boolean r4 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0$default(r4, r5, r2, r1, r2)
            goto L44
        L14:
            boolean r0 = r4 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r0 == 0) goto L34
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            kotlinx.coroutines.selects.SelectImplementation r4 = (kotlinx.coroutines.selects.SelectImplementation) r4
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.selects.TrySelectDetailedResult r4 = r4.trySelectDetailed(r3, r0)
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER
            if (r4 != r0) goto L2c
            r5.cleanElement$kotlinx_coroutines_core(r6)
        L2c:
            kotlinx.coroutines.selects.TrySelectDetailedResult r5 = kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL
            if (r4 != r5) goto L32
            r4 = 1
            goto L44
        L32:
            r4 = 0
            goto L44
        L34:
            boolean r5 = r4 instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast
            if (r5 == 0) goto L45
            kotlinx.coroutines.channels.BufferedChannel$SendBroadcast r4 = (kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) r4
            kotlinx.coroutines.CancellableContinuation r4 = r4.getCont()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0$default(r4, r5, r2, r1, r2)
        L44:
            return r4
        L45:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Unexpected waiter: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    private final boolean updateCellExpandBuffer(kotlinx.coroutines.channels.ChannelSegment<E> r5, int r6, long r7) {
            r4 = this;
            java.lang.Object r0 = r5.getState$kotlinx_coroutines_core(r6)
            boolean r1 = r0 instanceof kotlinx.coroutines.Waiter
            if (r1 == 0) goto L35
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
            long r1 = r1.get(r4)
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 < 0) goto L35
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            boolean r1 = r5.casState$kotlinx_coroutines_core(r6, r0, r1)
            if (r1 == 0) goto L35
            boolean r7 = r4.tryResumeSender(r0, r5, r6)
            r8 = 0
            if (r7 == 0) goto L2a
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            r5.setState$kotlinx_coroutines_core(r6, r7)
            r8 = 1
            goto L34
        L2a:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            r5.setState$kotlinx_coroutines_core(r6, r7)
            r5.onCancelledRequest(r6, r8)
        L34:
            return r8
        L35:
            boolean r5 = r4.updateCellExpandBufferSlow(r5, r6, r7)
            return r5
    }

    private final boolean updateCellExpandBufferSlow(kotlinx.coroutines.channels.ChannelSegment<E> r7, int r8, long r9) {
            r6 = this;
        L0:
            java.lang.Object r0 = r7.getState$kotlinx_coroutines_core(r8)
            boolean r1 = r0 instanceof kotlinx.coroutines.Waiter
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L45
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
            long r4 = r1.get(r6)
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 >= 0) goto L23
            kotlinx.coroutines.channels.WaiterEB r1 = new kotlinx.coroutines.channels.WaiterEB
            r2 = r0
            kotlinx.coroutines.Waiter r2 = (kotlinx.coroutines.Waiter) r2
            r1.<init>(r2)
            boolean r0 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L23:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            boolean r1 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r1 == 0) goto L0
            boolean r9 = r6.tryResumeSender(r0, r7, r8)
            if (r9 == 0) goto L3a
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            r7.setState$kotlinx_coroutines_core(r8, r9)
            r2 = 1
            goto L44
        L3a:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            r7.setState$kotlinx_coroutines_core(r8, r9)
            r7.onCancelledRequest(r8, r2)
        L44:
            return r2
        L45:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r0 != r1) goto L4c
            return r2
        L4c:
            if (r0 != 0) goto L59
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            boolean r0 = r7.casState$kotlinx_coroutines_core(r8, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L59:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r0 != r1) goto L5e
            return r3
        L5e:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            if (r0 == r1) goto L9a
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r0 == r1) goto L9a
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r0 != r1) goto L71
            goto L9a
        L71:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r0 != r1) goto L78
            return r3
        L78:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r0 != r1) goto L7f
            goto L0
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unexpected cell state: "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L9a:
            return r3
    }

    private final java.lang.Object updateCellReceive(kotlinx.coroutines.channels.ChannelSegment<E> r6, int r7, long r8, java.lang.Object r10) {
            r5 = this;
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core(r7)
            if (r0 != 0) goto L2b
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r1 = r1.get(r5)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r3
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 < 0) goto L41
            if (r10 != 0) goto L1d
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            return r6
        L1d:
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r0, r10)
            if (r0 == 0) goto L41
            r5.expandBuffer()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            return r6
        L2b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r0 != r1) goto L41
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r0, r1)
            if (r0 == 0) goto L41
            r5.expandBuffer()
            java.lang.Object r6 = r6.retrieveElement$kotlinx_coroutines_core(r7)
            return r6
        L41:
            java.lang.Object r6 = r5.updateCellReceiveSlow(r6, r7, r8, r10)
            return r6
    }

    private final java.lang.Object updateCellReceiveSlow(kotlinx.coroutines.channels.ChannelSegment<E> r6, int r7, long r8, java.lang.Object r10) {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core(r7)
            if (r0 == 0) goto L8a
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r0 != r1) goto Le
            goto L8a
        Le:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r0 != r1) goto L24
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r0, r1)
            if (r0 == 0) goto L0
            r5.expandBuffer()
            java.lang.Object r6 = r6.retrieveElement$kotlinx_coroutines_core(r7)
            return r6
        L24:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r0 != r1) goto L2f
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            return r6
        L2f:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            if (r0 != r1) goto L3a
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            return r6
        L3a:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r0 != r1) goto L48
            r5.expandBuffer()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            return r6
        L48:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r0 == r1) goto L0
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            boolean r1 = r6.casState$kotlinx_coroutines_core(r7, r0, r1)
            if (r1 == 0) goto L0
            boolean r8 = r0 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r8 == 0) goto L60
            kotlinx.coroutines.channels.WaiterEB r0 = (kotlinx.coroutines.channels.WaiterEB) r0
            kotlinx.coroutines.Waiter r0 = r0.waiter
        L60:
            boolean r9 = r5.tryResumeSender(r0, r6, r7)
            if (r9 == 0) goto L75
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            r6.setState$kotlinx_coroutines_core(r7, r8)
            r5.expandBuffer()
            java.lang.Object r6 = r6.retrieveElement$kotlinx_coroutines_core(r7)
            goto L89
        L75:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            r6.setState$kotlinx_coroutines_core(r7, r9)
            r9 = 0
            r6.onCancelledRequest(r7, r9)
            if (r8 == 0) goto L85
            r5.expandBuffer()
        L85:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
        L89:
            return r6
        L8a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r1 = r1.get(r5)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r3
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto Lac
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r0, r1)
            if (r0 == 0) goto L0
            r5.expandBuffer()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            return r6
        Lac:
            if (r10 != 0) goto Lb3
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            return r6
        Lb3:
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r0, r10)
            if (r0 == 0) goto L0
            r5.expandBuffer()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            return r6
    }

    private final int updateCellSend(kotlinx.coroutines.channels.ChannelSegment<E> r4, int r5, E r6, long r7, java.lang.Object r9, boolean r10) {
            r3 = this;
            r4.storeElement$kotlinx_coroutines_core(r5, r6)
            if (r10 == 0) goto La
            int r4 = r3.updateCellSendSlow(r4, r5, r6, r7, r9, r10)
            return r4
        La:
            java.lang.Object r0 = r4.getState$kotlinx_coroutines_core(r5)
            r1 = 1
            if (r0 != 0) goto L2d
            boolean r0 = r3.bufferOrRendezvousSend(r7)
            r2 = 0
            if (r0 == 0) goto L21
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            boolean r0 = r4.casState$kotlinx_coroutines_core(r5, r2, r0)
            if (r0 == 0) goto L59
            return r1
        L21:
            if (r9 != 0) goto L25
            r4 = 3
            return r4
        L25:
            boolean r0 = r4.casState$kotlinx_coroutines_core(r5, r2, r9)
            if (r0 == 0) goto L59
            r4 = 2
            return r4
        L2d:
            boolean r2 = r0 instanceof kotlinx.coroutines.Waiter
            if (r2 == 0) goto L59
            r4.cleanElement$kotlinx_coroutines_core(r5)
            boolean r6 = r3.tryResumeReceiver(r0, r6)
            if (r6 == 0) goto L46
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            r4.setState$kotlinx_coroutines_core(r5, r6)
            r3.onReceiveDequeued()
            r4 = 0
            goto L58
        L46:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            java.lang.Object r6 = r4.getAndSetState$kotlinx_coroutines_core(r5, r6)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r6 == r7) goto L57
            r4.onCancelledRequest(r5, r1)
        L57:
            r4 = 5
        L58:
            return r4
        L59:
            int r4 = r3.updateCellSendSlow(r4, r5, r6, r7, r9, r10)
            return r4
    }

    private final int updateCellSendSlow(kotlinx.coroutines.channels.ChannelSegment<E> r6, int r7, E r8, long r9, java.lang.Object r11, boolean r12) {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L37
            boolean r0 = r5.bufferOrRendezvousSend(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L1b
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 == 0) goto L2b
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.onCancelledRequest(r7, r2)
            return r1
        L2b:
            if (r11 != 0) goto L2f
            r6 = 3
            return r6
        L2f:
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r4, r11)
            if (r0 == 0) goto L0
            r6 = 2
            return r6
        L37:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            if (r0 != r4) goto L46
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            boolean r0 = r6.casState$kotlinx_coroutines_core(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L46:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            r10 = 5
            if (r0 != r9) goto L51
            r6.cleanElement$kotlinx_coroutines_core(r7)
            return r10
        L51:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            if (r0 != r9) goto L5b
            r6.cleanElement$kotlinx_coroutines_core(r7)
            return r10
        L5b:
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r0 != r9) goto L68
            r6.cleanElement$kotlinx_coroutines_core(r7)
            r5.completeCloseOrCancel()
            return r1
        L68:
            r6.cleanElement$kotlinx_coroutines_core(r7)
            boolean r9 = r0 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r9 == 0) goto L73
            kotlinx.coroutines.channels.WaiterEB r0 = (kotlinx.coroutines.channels.WaiterEB) r0
            kotlinx.coroutines.Waiter r0 = r0.waiter
        L73:
            boolean r8 = r5.tryResumeReceiver(r0, r8)
            if (r8 == 0) goto L84
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            r6.setState$kotlinx_coroutines_core(r7, r8)
            r5.onReceiveDequeued()
            goto L96
        L84:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            java.lang.Object r8 = r6.getAndSetState$kotlinx_coroutines_core(r7, r8)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r8 == r9) goto L95
            r6.onCancelledRequest(r7, r3)
        L95:
            r2 = 5
        L96:
            return r2
    }

    private final void updateReceiversCounterIfLower(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
        L2:
            long r3 = r0.get(r7)
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 < 0) goto Lb
            return
        Lb:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
            r2 = r7
            r5 = r8
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            return
    }

    private final void updateSendersCounterIfLower(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
        L2:
            long r3 = r0.get(r7)
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r1 = r1 & r3
            int r5 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r5 < 0) goto L11
            return
        L11:
            r5 = 60
            long r5 = r3 >> r5
            int r6 = (int) r5
            long r5 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructSendersAndCloseStatus(r1, r6)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            r2 = r7
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.closeOrCancelImpl(r2, r0)
            return r2
    }

    protected boolean closeOrCancelImpl(java.lang.Throwable r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L5
            r2.markCancellationStarted()
        L5:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel._closeCause$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNO_CLOSE_CAUSE$p()
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r1, r3)
            if (r4 == 0) goto L15
            r2.markCancelled()
            goto L18
        L15:
            r2.markClosed()
        L18:
            r2.completeCloseOrCancel()
            r2.onClosedIdempotent()
            if (r3 == 0) goto L23
            r2.invokeCloseHandler()
        L23:
            return r3
    }

    protected final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long r11) {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU
            java.lang.Object r0 = r0.get(r10)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L8:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
            long r8 = r1.get(r10)
            int r2 = r10.capacity
            long r2 = (long) r2
            long r2 = r2 + r8
            long r4 = r10.getBufferEndCounter()
            long r2 = java.lang.Math.max(r2, r4)
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1f
            return
        L1f:
            r2 = 1
            long r5 = r8 + r2
            r2 = r10
            r3 = r8
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L8
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r8 / r2
            long r4 = (long) r1
            long r4 = r8 % r4
            int r4 = (int) r4
            long r5 = r0.id
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L42
            kotlinx.coroutines.channels.ChannelSegment r1 = r10.findSegmentReceive(r2, r0)
            if (r1 != 0) goto L41
            goto L8
        L41:
            r0 = r1
        L42:
            r7 = 0
            r2 = r10
            r3 = r0
            r5 = r8
            java.lang.Object r1 = r2.updateCellReceive(r3, r4, r5, r7)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r1 != r2) goto L5c
            long r1 = r10.getSendersCounter$kotlinx_coroutines_core()
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 >= 0) goto L8
            r0.cleanPrev()
            goto L8
        L5c:
            r0.cleanPrev()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r10.onUndeliveredElement
            if (r2 == 0) goto L8
            r3 = 2
            r4 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r2, r1, r4, r3, r4)
            if (r1 != 0) goto L6c
            goto L8
        L6c:
            throw r1
    }

    protected final java.lang.Throwable getCloseCause() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel._closeCause$FU
            java.lang.Object r0 = r0.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
            long r0 = r0.get(r2)
            return r0
    }

    protected final java.lang.Throwable getSendException() {
            r2 = this;
            java.lang.Throwable r0 = r2.getCloseCause()
            if (r0 != 0) goto Ld
            kotlinx.coroutines.channels.ClosedSendChannelException r0 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r1 = "Channel was closed"
            r0.<init>(r1)
        Ld:
            return r0
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r0 = r0.get(r4)
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r0 = r0 & r2
            return r0
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
            r11 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU
            java.lang.Object r1 = r0.get(r11)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
            long r4 = r11.getReceiversCounter$kotlinx_coroutines_core()
            long r2 = r11.getSendersCounter$kotlinx_coroutines_core()
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L16
            return r6
        L16:
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r2
            long r7 = r4 / r7
            long r9 = r1.id
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            kotlinx.coroutines.channels.ChannelSegment r1 = r11.findSegmentReceive(r7, r1)
            if (r1 != 0) goto L34
            java.lang.Object r0 = r0.get(r11)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
            long r0 = r0.id
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L0
            return r6
        L34:
            r1.cleanPrev()
            long r2 = (long) r2
            long r2 = r4 % r2
            int r0 = (int) r2
            boolean r0 = r11.isCellNonEmpty(r1, r0, r4)
            if (r0 == 0) goto L43
            r0 = 1
            return r0
        L43:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
            r0 = 1
            long r6 = r4 + r0
            r3 = r11
            r2.compareAndSet(r3, r4, r6)
            goto L0
    }

    public boolean isClosedForReceive() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r0 = r0.get(r2)
            boolean r0 = r2.isClosedForReceive0(r0)
            return r0
    }

    public boolean isClosedForSend() {
            r2 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r0 = r0.get(r2)
            boolean r0 = r2.isClosedForSend0(r0)
            return r0
    }

    protected boolean isConflatedDropOldest() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected void onClosedIdempotent() {
            r0 = this;
            return
    }

    protected void onReceiveDequeued() {
            r0 = this;
            return
    }

    protected void onReceiveEnqueued() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public java.lang.Object receive(kotlin.coroutines.Continuation<? super E> r1) {
            r0 = this;
            java.lang.Object r1 = receive$suspendImpl(r0, r1)
            return r1
    }

    public java.lang.String toString() {
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r3 = (int) r2
            r2 = 3
            r4 = 2
            if (r3 == r4) goto L1e
            if (r3 == r2) goto L18
            goto L23
        L18:
            java.lang.String r3 = "cancelled,"
            r1.append(r3)
            goto L23
        L1e:
            java.lang.String r3 = "closed,"
            r1.append(r3)
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "capacity="
            r3.append(r5)
            int r5 = r0.capacity
            r3.append(r5)
            r5 = 44
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = "data=["
            r1.append(r3)
            kotlinx.coroutines.channels.ChannelSegment[] r2 = new kotlinx.coroutines.channels.ChannelSegment[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.channels.BufferedChannel.sendSegment$FU
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.channels.BufferedChannel.bufferEndSegment$FU
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L6c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L88
            java.lang.Object r4 = r2.next()
            r8 = r4
            kotlinx.coroutines.channels.ChannelSegment r8 = (kotlinx.coroutines.channels.ChannelSegment) r8
            kotlinx.coroutines.channels.ChannelSegment r9 = kotlinx.coroutines.channels.BufferedChannelKt.access$getNULL_SEGMENT$p()
            if (r8 == r9) goto L81
            r8 = 1
            goto L82
        L81:
            r8 = 0
        L82:
            if (r8 == 0) goto L6c
            r3.add(r4)
            goto L6c
        L88:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L20c
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L9d
            goto Lb7
        L9d:
            r4 = r3
            kotlinx.coroutines.channels.ChannelSegment r4 = (kotlinx.coroutines.channels.ChannelSegment) r4
            long r8 = r4.id
        La2:
            java.lang.Object r4 = r2.next()
            r10 = r4
            kotlinx.coroutines.channels.ChannelSegment r10 = (kotlinx.coroutines.channels.ChannelSegment) r10
            long r10 = r10.id
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto Lb1
            r3 = r4
            r8 = r10
        Lb1:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto La2
        Lb7:
            kotlinx.coroutines.channels.ChannelSegment r3 = (kotlinx.coroutines.channels.ChannelSegment) r3
            long r10 = r16.getReceiversCounter$kotlinx_coroutines_core()
            long r12 = r16.getSendersCounter$kotlinx_coroutines_core()
        Lc1:
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            r4 = 0
        Lc4:
            if (r4 >= r2) goto L1e0
            long r8 = r3.id
            int r14 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto Ld7
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L1e9
        Ld7:
            java.lang.Object r15 = r3.getState$kotlinx_coroutines_core(r4)
            java.lang.Object r6 = r3.getElement$kotlinx_coroutines_core(r4)
            boolean r7 = r15 instanceof kotlinx.coroutines.CancellableContinuation
            if (r7 == 0) goto Lf9
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto Led
            if (r14 < 0) goto Led
            java.lang.String r7 = "receive"
            goto L1a6
        Led:
            if (r14 >= 0) goto Lf5
            if (r7 < 0) goto Lf5
            java.lang.String r7 = "send"
            goto L1a6
        Lf5:
            java.lang.String r7 = "cont"
            goto L1a6
        Lf9:
            boolean r7 = r15 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r7 == 0) goto L113
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L107
            if (r14 < 0) goto L107
            java.lang.String r7 = "onReceive"
            goto L1a6
        L107:
            if (r14 >= 0) goto L10f
            if (r7 < 0) goto L10f
            java.lang.String r7 = "onSend"
            goto L1a6
        L10f:
            java.lang.String r7 = "select"
            goto L1a6
        L113:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.ReceiveCatching
            if (r7 == 0) goto L11b
            java.lang.String r7 = "receiveCatching"
            goto L1a6
        L11b:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast
            if (r7 == 0) goto L123
            java.lang.String r7 = "sendBroadcast"
            goto L1a6
        L123:
            boolean r7 = r15 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r7 == 0) goto L13f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L1a6
        L13f:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r7)
            if (r7 == 0) goto L14b
            r7 = 1
            goto L153
        L14b:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r7)
        L153:
            if (r7 == 0) goto L158
            java.lang.String r7 = "resuming_sender"
            goto L1a6
        L158:
            if (r15 != 0) goto L15c
            r7 = 1
            goto L164
        L15c:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getIN_BUFFER$p()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r7)
        L164:
            if (r7 == 0) goto L168
            r7 = 1
            goto L170
        L168:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r7)
        L170:
            if (r7 == 0) goto L174
            r7 = 1
            goto L17c
        L174:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getPOISONED$p()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r7)
        L17c:
            if (r7 == 0) goto L180
            r7 = 1
            goto L188
        L180:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r7)
        L188:
            if (r7 == 0) goto L18c
            r7 = 1
            goto L194
        L18c:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r7)
        L194:
            if (r7 == 0) goto L198
            r7 = 1
            goto L1a0
        L198:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r7)
        L1a0:
            if (r7 != 0) goto L1da
            java.lang.String r7 = r15.toString()
        L1a6:
            if (r6 == 0) goto L1c8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L1da
        L1c8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L1da:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto Lc4
        L1e0:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r2 = r3.getNext()
            r3 = r2
            kotlinx.coroutines.channels.ChannelSegment r3 = (kotlinx.coroutines.channels.ChannelSegment) r3
            if (r3 != 0) goto L208
        L1e9:
            char r2 = kotlin.text.StringsKt.last(r1)
            if (r2 != r5) goto L1fe
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L1fe:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L208:
            r6 = 0
            r7 = 1
            goto Lc1
        L20c:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public java.lang.Object mo105tryReceivePtdJZtk() {
            r11 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.receivers$FU
            long r0 = r0.get(r11)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r2 = r2.get(r11)
            boolean r4 = r11.isClosedForReceive0(r2)
            if (r4 == 0) goto L1d
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r1 = r11.getCloseCause()
            java.lang.Object r0 = r0.m117closedJP2dKIU(r1)
            return r0
        L1d:
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L2e
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m118failurePtdJZtk()
            return r0
        L2e:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getReceiveSegment$FU$p()
            java.lang.Object r1 = r1.get(r11)
            kotlinx.coroutines.channels.ChannelSegment r1 = (kotlinx.coroutines.channels.ChannelSegment) r1
        L3c:
            boolean r2 = r11.isClosedForReceive()
            if (r2 == 0) goto L4e
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r1 = r11.getCloseCause()
            java.lang.Object r0 = r0.m117closedJP2dKIU(r1)
            goto Lba
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = access$getReceivers$FU$p()
            long r7 = r2.getAndIncrement(r11)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r3 = (long) r2
            long r3 = r7 / r3
            long r5 = (long) r2
            long r5 = r7 % r5
            int r9 = (int) r5
            long r5 = r1.id
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L6e
            kotlinx.coroutines.channels.ChannelSegment r2 = access$findSegmentReceive(r11, r3, r1)
            if (r2 != 0) goto L6c
            goto L3c
        L6c:
            r10 = r2
            goto L6f
        L6e:
            r10 = r1
        L6f:
            r1 = r11
            r2 = r10
            r3 = r9
            r4 = r7
            r6 = r0
            java.lang.Object r1 = access$updateCellReceive(r1, r2, r3, r4, r6)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND$p()
            if (r1 != r2) goto L98
            boolean r1 = r0 instanceof kotlinx.coroutines.Waiter
            if (r1 == 0) goto L85
            kotlinx.coroutines.Waiter r0 = (kotlinx.coroutines.Waiter) r0
            goto L86
        L85:
            r0 = 0
        L86:
            if (r0 == 0) goto L8b
            access$prepareReceiverForSuspension(r11, r0, r10, r9)
        L8b:
            r11.waitExpandBufferCompletion$kotlinx_coroutines_core(r7)
            r10.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m118failurePtdJZtk()
            goto Lba
        L98:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getFAILED$p()
            if (r1 != r2) goto Lab
            long r1 = r11.getSendersCounter$kotlinx_coroutines_core()
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 >= 0) goto La9
            r10.cleanPrev()
        La9:
            r1 = r10
            goto L3c
        Lab:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getSUSPEND_NO_WAITER$p()
            if (r1 == r0) goto Lbb
            r10.cleanPrev()
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m119successJP2dKIU(r1)
        Lba:
            return r0
        Lbb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    public java.lang.Object mo106trySendJP2dKIU(E r15) {
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.sendersAndCloseStatus$FU
            long r0 = r0.get(r14)
            boolean r0 = r14.shouldSendSuspend(r0)
            if (r0 == 0) goto L13
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r15 = r15.m118failurePtdJZtk()
            return r15
        L13:
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r14)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = access$isClosedForSend0(r14, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.id
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L4e
            kotlinx.coroutines.channels.ChannelSegment r1 = access$findSegmentSend(r14, r2, r0)
            if (r1 != 0) goto L4c
            if (r11 == 0) goto L21
            goto L8e
        L4c:
            r13 = r1
            goto L4f
        L4e:
            r13 = r0
        L4f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb0
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L89
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 4
            if (r0 == r1) goto L71
            r1 = 5
            if (r0 == r1) goto L6c
            goto L6f
        L6c:
            r13.cleanPrev()
        L6f:
            r0 = r13
            goto L21
        L71:
            long r0 = r14.getReceiversCounter$kotlinx_coroutines_core()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L8e
            r13.cleanPrev()
            goto L8e
        L7d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L89:
            if (r11 == 0) goto L99
            r13.onSlotCleaned()
        L8e:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r0 = r14.getSendException()
            java.lang.Object r15 = r15.m117closedJP2dKIU(r0)
            goto Lbb
        L99:
            boolean r15 = r8 instanceof kotlinx.coroutines.Waiter
            if (r15 == 0) goto La0
            kotlinx.coroutines.Waiter r8 = (kotlinx.coroutines.Waiter) r8
            goto La1
        La0:
            r8 = 0
        La1:
            if (r8 == 0) goto La6
            access$prepareSenderForSuspension(r14, r8, r13, r12)
        La6:
            r13.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r15 = r15.m118failurePtdJZtk()
            goto Lbb
        Lb0:
            r13.cleanPrev()
        Lb3:
            kotlinx.coroutines.channels.ChannelResult$Companion r15 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r15 = r15.m119successJP2dKIU(r0)
        Lbb:
            return r15
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long r18) {
            r17 = this;
            r6 = r17
            boolean r0 = r17.isRendezvousOrUnlimited()
            if (r0 == 0) goto L9
            return
        L9:
            long r0 = r17.getBufferEndCounter()
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L9
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p()
            r7 = 0
            r1 = 0
        L17:
            r8 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r1 >= r0) goto L39
            long r2 = r17.getBufferEndCounter()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.channels.BufferedChannel.completedExpandBuffersAndPauseFlag$FU
            long r4 = r4.get(r6)
            long r4 = r4 & r8
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L36
            long r4 = r17.getBufferEndCounter()
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L36
            return
        L36:
            int r1 = r1 + 1
            goto L17
        L39:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = kotlinx.coroutines.channels.BufferedChannel.completedExpandBuffersAndPauseFlag$FU
        L3b:
            long r2 = r10.get(r6)
            long r0 = r2 & r8
            r11 = 1
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(r0, r11)
            r0 = r10
            r1 = r17
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L3b
        L4f:
            long r0 = r17.getBufferEndCounter()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = kotlinx.coroutines.channels.BufferedChannel.completedExpandBuffersAndPauseFlag$FU
            long r2 = r10.get(r6)
            long r4 = r2 & r8
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r12 = r12 & r2
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L66
            r12 = 1
            goto L67
        L66:
            r12 = 0
        L67:
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 != 0) goto L87
            long r13 = r17.getBufferEndCounter()
            int r15 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r15 != 0) goto L87
        L73:
            long r2 = r10.get(r6)
            long r0 = r2 & r8
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(r0, r7)
            r0 = r10
            r1 = r17
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L73
            return
        L87:
            if (r12 != 0) goto L4f
            long r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$constructEBCompletedAndPauseFlag(r4, r11)
            r0 = r10
            r1 = r17
            r0.compareAndSet(r1, r2, r4)
            goto L4f
    }
}
