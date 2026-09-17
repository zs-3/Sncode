package kotlinx.coroutines.channels;

/* compiled from: BufferedChannel.kt */
/* loaded from: classes2.dex */
public final class BufferedChannelKt {
    public static final kotlinx.coroutines.internal.Symbol BUFFERED = null;
    private static final kotlinx.coroutines.internal.Symbol CHANNEL_CLOSED = null;
    private static final kotlinx.coroutines.internal.Symbol CLOSE_HANDLER_CLOSED = null;
    private static final kotlinx.coroutines.internal.Symbol CLOSE_HANDLER_INVOKED = null;
    private static final kotlinx.coroutines.internal.Symbol DONE_RCV = null;
    private static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = 0;
    private static final kotlinx.coroutines.internal.Symbol FAILED = null;
    private static final kotlinx.coroutines.internal.Symbol INTERRUPTED_RCV = null;
    private static final kotlinx.coroutines.internal.Symbol INTERRUPTED_SEND = null;
    private static final kotlinx.coroutines.internal.Symbol IN_BUFFER = null;
    private static final kotlinx.coroutines.internal.Symbol NO_CLOSE_CAUSE = null;
    private static final kotlinx.coroutines.internal.Symbol NO_RECEIVE_RESULT = null;
    private static final kotlinx.coroutines.channels.ChannelSegment<java.lang.Object> NULL_SEGMENT = null;
    private static final kotlinx.coroutines.internal.Symbol POISONED = null;
    private static final kotlinx.coroutines.internal.Symbol RESUMING_BY_EB = null;
    private static final kotlinx.coroutines.internal.Symbol RESUMING_BY_RCV = null;
    public static final int SEGMENT_SIZE = 0;
    private static final kotlinx.coroutines.internal.Symbol SUSPEND = null;
    private static final kotlinx.coroutines.internal.Symbol SUSPEND_NO_WAITER = null;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: BufferedChannel.kt */
    /* renamed from: kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.channels.ChannelSegment<E>, kotlinx.coroutines.channels.ChannelSegment<E>> {
        public static final kotlinx.coroutines.channels.BufferedChannelKt.AnonymousClass1 INSTANCE = null;

        static {
                kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1 r0 = new kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1
                r0.<init>()
                kotlinx.coroutines.channels.BufferedChannelKt.AnonymousClass1.INSTANCE = r0
                return
        }

        AnonymousClass1() {
                r6 = this;
                java.lang.Class<kotlinx.coroutines.channels.BufferedChannelKt> r2 = kotlinx.coroutines.channels.BufferedChannelKt.class
                r1 = 2
                java.lang.String r3 = "createSegment"
                java.lang.String r4 = "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"
                r5 = 1
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Long r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                kotlinx.coroutines.channels.ChannelSegment r4 = (kotlinx.coroutines.channels.ChannelSegment) r4
                kotlinx.coroutines.channels.ChannelSegment r3 = r2.invoke(r0, r4)
                return r3
        }

        public final kotlinx.coroutines.channels.ChannelSegment<E> invoke(long r1, kotlinx.coroutines.channels.ChannelSegment<E> r3) {
                r0 = this;
                kotlinx.coroutines.channels.ChannelSegment r1 = kotlinx.coroutines.channels.BufferedChannelKt.access$createSegment(r1, r3)
                return r1
        }
    }

    static {
            kotlinx.coroutines.channels.ChannelSegment r6 = new kotlinx.coroutines.channels.ChannelSegment
            r1 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT = r6
            java.lang.String r7 = "kotlinx.coroutines.bufferedChannel.segmentSize"
            r8 = 32
            r9 = 0
            r10 = 0
            r11 = 12
            r12 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE = r0
            java.lang.String r1 = "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.channels.BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "BUFFERED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SHOULD_BUFFER"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "S_RESUMING_BY_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "RESUMING_BY_EB"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "POISONED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.POISONED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "DONE_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "INTERRUPTED_SEND"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "INTERRUPTED_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CHANNEL_CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.CHANNEL_CLOSED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SUSPEND"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "SUSPEND_NO_WAITER"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "FAILED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.FAILED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_RECEIVE_RESULT"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSE_HANDLER_CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSE_HANDLER_INVOKED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_CLOSE_CAUSE"
            r0.<init>(r1)
            kotlinx.coroutines.channels.BufferedChannelKt.NO_CLOSE_CAUSE = r0
            return
    }

    public static final /* synthetic */ long access$constructEBCompletedAndPauseFlag(long r0, boolean r2) {
            long r0 = constructEBCompletedAndPauseFlag(r0, r2)
            return r0
    }

    public static final /* synthetic */ long access$constructSendersAndCloseStatus(long r0, int r2) {
            long r0 = constructSendersAndCloseStatus(r0, r2)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$createSegment(long r0, kotlinx.coroutines.channels.ChannelSegment r2) {
            kotlinx.coroutines.channels.ChannelSegment r0 = createSegment(r0, r2)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSE_HANDLER_CLOSED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSE_HANDLER_INVOKED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getDONE_RCV$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV
            return r0
    }

    public static final /* synthetic */ int access$getEXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS$p() {
            int r0 = kotlinx.coroutines.channels.BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getFAILED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getINTERRUPTED_RCV$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getINTERRUPTED_SEND$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getIN_BUFFER$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNO_CLOSE_CAUSE$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.NO_CLOSE_CAUSE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.ChannelSegment access$getNULL_SEGMENT$p() {
            kotlinx.coroutines.channels.ChannelSegment<java.lang.Object> r0 = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getPOISONED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getRESUMING_BY_EB$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getRESUMING_BY_RCV$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSUSPEND$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getSUSPEND_NO_WAITER$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER
            return r0
    }

    public static final /* synthetic */ long access$initialBufferEnd(int r2) {
            long r0 = initialBufferEnd(r2)
            return r0
    }

    public static final /* synthetic */ boolean access$tryResume0(kotlinx.coroutines.CancellableContinuation r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2) {
            boolean r0 = tryResume0(r0, r1, r2)
            return r0
    }

    private static final long constructEBCompletedAndPauseFlag(long r2, boolean r4) {
            if (r4 == 0) goto L5
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L7
        L5:
            r0 = 0
        L7:
            long r0 = r0 + r2
            return r0
    }

    private static final long constructSendersAndCloseStatus(long r2, int r4) {
            long r0 = (long) r4
            r4 = 60
            long r0 = r0 << r4
            long r0 = r0 + r2
            return r0
    }

    private static final <E> kotlinx.coroutines.channels.ChannelSegment<E> createSegment(long r7, kotlinx.coroutines.channels.ChannelSegment<E> r9) {
            kotlinx.coroutines.channels.ChannelSegment r6 = new kotlinx.coroutines.channels.ChannelSegment
            kotlinx.coroutines.channels.BufferedChannel r4 = r9.getChannel()
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r0.<init>(r1, r3, r4, r5)
            return r6
    }

    public static final <E> kotlin.reflect.KFunction<kotlinx.coroutines.channels.ChannelSegment<E>> createSegmentFunction() {
            kotlinx.coroutines.channels.BufferedChannelKt$createSegmentFunction$1 r0 = kotlinx.coroutines.channels.BufferedChannelKt.AnonymousClass1.INSTANCE
            return r0
    }

    public static final kotlinx.coroutines.internal.Symbol getCHANNEL_CLOSED() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.BufferedChannelKt.CHANNEL_CLOSED
            return r0
    }

    private static final long initialBufferEnd(int r2) {
            if (r2 == 0) goto Lf
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L9
            long r0 = (long) r2
            goto L11
        L9:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L11
        Lf:
            r0 = 0
        L11:
            return r0
    }

    private static final <T> boolean tryResume0(kotlinx.coroutines.CancellableContinuation<? super T> r1, T r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r0 = 0
            java.lang.Object r2 = r1.tryResume(r2, r0, r3)
            if (r2 == 0) goto Lc
            r1.completeResume(r2)
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    static /* synthetic */ boolean tryResume0$default(kotlinx.coroutines.CancellableContinuation r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = tryResume0(r0, r1, r2)
            return r0
    }
}
