package kotlinx.coroutines.channels;

/* compiled from: ConflatedBufferedChannel.kt */
/* loaded from: classes2.dex */
public class ConflatedBufferedChannel<E> extends kotlinx.coroutines.channels.BufferedChannel<E> {
    private final int capacity;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;

    public ConflatedBufferedChannel(int r3, kotlinx.coroutines.channels.BufferOverflow r4, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r5) {
            r2 = this;
            r2.<init>(r3, r5)
            r2.capacity = r3
            r2.onBufferOverflow = r4
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r0 = 0
            r1 = 1
            if (r4 == r5) goto Lf
            r4 = 1
            goto L10
        Lf:
            r4 = 0
        L10:
            if (r4 == 0) goto L38
            if (r3 < r1) goto L15
            r0 = 1
        L15:
            if (r0 == 0) goto L18
            return
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Buffered channel capacity must be at least 1, but "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " was specified"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "This implementation does not support suspension for senders, use "
            r3.append(r4)
            java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r4 = kotlinx.coroutines.channels.BufferedChannel.class
            kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r4)
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r4 = " instead"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final java.lang.Object m120trySendDropLatestMj0NB7M(E r3, boolean r4) {
            r2 = this;
            java.lang.Object r0 = super.mo106trySendJP2dKIU(r3)
            boolean r1 = kotlinx.coroutines.channels.ChannelResult.m114isSuccessimpl(r0)
            if (r1 != 0) goto L2a
            boolean r1 = kotlinx.coroutines.channels.ChannelResult.m113isClosedimpl(r0)
            if (r1 == 0) goto L11
            goto L2a
        L11:
            if (r4 == 0) goto L21
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r2.onUndeliveredElement
            if (r4 == 0) goto L21
            r0 = 2
            r1 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r4, r3, r1, r0, r1)
            if (r3 != 0) goto L20
            goto L21
        L20:
            throw r3
        L21:
            kotlinx.coroutines.channels.ChannelResult$Companion r3 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r3.m119successJP2dKIU(r4)
            return r3
        L2a:
            return r0
    }

    /* renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    private final java.lang.Object m121trySendDropOldestJP2dKIU(E r17) {
            r16 = this;
            r8 = r16
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.access$getSendSegment$FU$p()
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.ChannelSegment r0 = (kotlinx.coroutines.channels.ChannelSegment) r0
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.access$getSendersAndCloseStatus$FU$p()
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r10 = r1 & r3
            boolean r12 = kotlinx.coroutines.channels.BufferedChannel.access$isClosedForSend0(r8, r1)
            int r13 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r1 = (long) r13
            long r1 = r10 / r1
            long r3 = (long) r13
            long r3 = r10 % r3
            int r14 = (int) r3
            long r3 = r0.id
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L45
            kotlinx.coroutines.channels.ChannelSegment r1 = kotlinx.coroutines.channels.BufferedChannel.access$findSegmentSend(r8, r1, r0)
            if (r1 != 0) goto L43
            if (r12 == 0) goto Le
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r1 = r16.getSendException()
            java.lang.Object r0 = r0.m117closedJP2dKIU(r1)
            return r0
        L43:
            r15 = r1
            goto L46
        L45:
            r15 = r0
        L46:
            r0 = r16
            r1 = r15
            r2 = r14
            r3 = r17
            r4 = r10
            r6 = r9
            r7 = r12
            int r0 = kotlinx.coroutines.channels.BufferedChannel.access$updateCellSend(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lc5
            r1 = 1
            if (r0 == r1) goto Lbc
            r1 = 2
            if (r0 == r1) goto L8c
            r1 = 3
            if (r0 == r1) goto L80
            r1 = 4
            if (r0 == r1) goto L6a
            r1 = 5
            if (r0 == r1) goto L65
            goto L68
        L65:
            r15.cleanPrev()
        L68:
            r0 = r15
            goto Le
        L6a:
            long r0 = r16.getReceiversCounter$kotlinx_coroutines_core()
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 >= 0) goto L75
            r15.cleanPrev()
        L75:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r1 = r16.getSendException()
            java.lang.Object r0 = r0.m117closedJP2dKIU(r1)
            return r0
        L80:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8c:
            if (r12 == 0) goto L9c
            r15.onSlotCleaned()
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r1 = r16.getSendException()
            java.lang.Object r0 = r0.m117closedJP2dKIU(r1)
            return r0
        L9c:
            boolean r0 = r9 instanceof kotlinx.coroutines.Waiter
            if (r0 == 0) goto La3
            kotlinx.coroutines.Waiter r9 = (kotlinx.coroutines.Waiter) r9
            goto La4
        La3:
            r9 = 0
        La4:
            if (r9 == 0) goto La9
            kotlinx.coroutines.channels.BufferedChannel.access$prepareSenderForSuspension(r8, r9, r15, r14)
        La9:
            long r0 = r15.id
            long r2 = (long) r13
            long r0 = r0 * r2
            long r2 = (long) r14
            long r0 = r0 + r2
            r8.dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(r0)
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.m119successJP2dKIU(r1)
            return r0
        Lbc:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.m119successJP2dKIU(r1)
            return r0
        Lc5:
            r15.cleanPrev()
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.m119successJP2dKIU(r1)
            return r0
    }

    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final java.lang.Object m122trySendImplMj0NB7M(E r3, boolean r4) {
            r2 = this;
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
            if (r0 != r1) goto Lb
            java.lang.Object r3 = r2.m120trySendDropLatestMj0NB7M(r3, r4)
            goto Lf
        Lb:
            java.lang.Object r3 = r2.m121trySendDropOldestJP2dKIU(r3)
        Lf:
            return r3
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean isConflatedDropOldest() {
            r2 = this;
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public java.lang.Object mo106trySendJP2dKIU(E r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.m122trySendImplMj0NB7M(r2, r0)
            return r2
    }
}
