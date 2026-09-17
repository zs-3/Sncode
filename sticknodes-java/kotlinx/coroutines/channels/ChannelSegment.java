package kotlinx.coroutines.channels;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes2.dex */
public final class ChannelSegment<E> extends kotlinx.coroutines.internal.Segment<kotlinx.coroutines.channels.ChannelSegment<E>> {
    private final kotlinx.coroutines.channels.BufferedChannel<E> _channel;
    private final java.util.concurrent.atomic.AtomicReferenceArray data;

    public ChannelSegment(long r1, kotlinx.coroutines.channels.ChannelSegment<E> r3, kotlinx.coroutines.channels.BufferedChannel<E> r4, int r5) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            r0._channel = r4
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r2 = r2 * 2
            r1.<init>(r2)
            r0.data = r1
            return
    }

    private final void setElementLazy(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.data
            int r2 = r2 * 2
            r0.lazySet(r2, r3)
            return
    }

    public final boolean casState$kotlinx_coroutines_core(int r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.data
            int r2 = r2 * 2
            int r2 = r2 + 1
            boolean r2 = r0.compareAndSet(r2, r3, r4)
            return r2
    }

    public final void cleanElement$kotlinx_coroutines_core(int r2) {
            r1 = this;
            r0 = 0
            r1.setElementLazy(r2, r0)
            return
    }

    public final java.lang.Object getAndSetState$kotlinx_coroutines_core(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.data
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Object r2 = r0.getAndSet(r2, r3)
            return r2
    }

    public final kotlinx.coroutines.channels.BufferedChannel<E> getChannel() {
            r1 = this;
            kotlinx.coroutines.channels.BufferedChannel<E> r0 = r1._channel
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    public final E getElement$kotlinx_coroutines_core(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.data
            int r2 = r2 * 2
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
            r1 = this;
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            return r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.data
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int r4, java.lang.Throwable r5, kotlin.coroutines.CoroutineContext r6) {
            r3 = this;
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.getElement$kotlinx_coroutines_core(r4)
        Le:
            java.lang.Object r1 = r3.getState$kotlinx_coroutines_core(r4)
            boolean r2 = r1 instanceof kotlinx.coroutines.Waiter
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.WaiterEB
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            if (r1 == r2) goto L63
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
            if (r1 != r2) goto L28
            goto L63
        L28:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_EB$p()
            if (r1 == r2) goto Le
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getRESUMING_BY_RCV$p()
            if (r1 != r2) goto L35
            goto Le
        L35:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.access$getDONE_RCV$p()
            if (r1 == r4) goto L62
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r1 != r4) goto L40
            goto L62
        L40:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.cleanElement$kotlinx_coroutines_core(r4)
            if (r0 == 0) goto L73
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.getChannel()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r4.onUndeliveredElement
            if (r4 == 0) goto L73
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_SEND$p()
            goto L7f
        L7b:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.BufferedChannelKt.access$getINTERRUPTED_RCV$p()
        L7f:
            boolean r1 = r3.casState$kotlinx_coroutines_core(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.cleanElement$kotlinx_coroutines_core(r4)
            r1 = r0 ^ 1
            r3.onCancelledRequest(r4, r1)
            if (r0 == 0) goto L9a
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.getChannel()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r4.onUndeliveredElement
            if (r4 == 0) goto L9a
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r4, r5, r6)
        L9a:
            return
    }

    public final void onCancelledRequest(int r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L12
            kotlinx.coroutines.channels.BufferedChannel r6 = r4.getChannel()
            long r0 = r4.id
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r2 = (long) r2
            long r0 = r0 * r2
            long r2 = (long) r5
            long r0 = r0 + r2
            r6.waitExpandBufferCompletion$kotlinx_coroutines_core(r0)
        L12:
            r4.onSlotCleaned()
            return
    }

    public final E retrieveElement$kotlinx_coroutines_core(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.getElement$kotlinx_coroutines_core(r2)
            r1.cleanElement$kotlinx_coroutines_core(r2)
            return r0
    }

    public final void setState$kotlinx_coroutines_core(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.data
            int r2 = r2 * 2
            int r2 = r2 + 1
            r0.set(r2, r3)
            return
    }

    public final void storeElement$kotlinx_coroutines_core(int r1, E r2) {
            r0 = this;
            r0.setElementLazy(r1, r2)
            return
    }
}
