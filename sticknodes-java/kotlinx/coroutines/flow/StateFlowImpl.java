package kotlinx.coroutines.flow;

/* compiled from: StateFlow.kt */
/* loaded from: classes2.dex */
final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.StateFlowSlot> implements kotlinx.coroutines.flow.MutableStateFlow<T>, kotlinx.coroutines.flow.Flow {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile java.lang.Object _state;
    private int sequence;

    /* compiled from: StateFlow.kt */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.StateFlowImpl<T> this$0;

        AnonymousClass1(kotlinx.coroutines.flow.StateFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                kotlinx.coroutines.flow.StateFlowImpl<T> r2 = r1.this$0
                r0 = 0
                java.lang.Object r2 = r2.collect(r0, r1)
                return r2
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.flow.StateFlowImpl> r0 = kotlinx.coroutines.flow.StateFlowImpl.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.flow.StateFlowImpl._state$FU = r0
            return
    }

    public StateFlowImpl(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state = r1
            return
    }

    private final boolean updateState(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowImpl._state$FU     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            if (r7 == 0) goto L12
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)     // Catch: java.lang.Throwable -> L5e
            if (r7 != 0) goto L12
            monitor-exit(r6)
            return r2
        L12:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)     // Catch: java.lang.Throwable -> L5e
            r1 = 1
            if (r7 == 0) goto L1b
            monitor-exit(r6)
            return r1
        L1b:
            r0.set(r6, r8)     // Catch: java.lang.Throwable -> L5e
            int r7 = r6.sequence     // Catch: java.lang.Throwable -> L5e
            r8 = r7 & 1
            if (r8 != 0) goto L58
            int r7 = r7 + r1
            r6.sequence = r7     // Catch: java.lang.Throwable -> L5e
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r8 = r6.getSlots()     // Catch: java.lang.Throwable -> L5e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r6)
        L2e:
            kotlinx.coroutines.flow.StateFlowSlot[] r8 = (kotlinx.coroutines.flow.StateFlowSlot[]) r8
            if (r8 == 0) goto L40
            int r0 = r8.length
            r3 = 0
        L34:
            if (r3 >= r0) goto L40
            r4 = r8[r3]
            if (r4 == 0) goto L3d
            r4.makePending()
        L3d:
            int r3 = r3 + 1
            goto L34
        L40:
            monitor-enter(r6)
            int r8 = r6.sequence     // Catch: java.lang.Throwable -> L55
            if (r8 != r7) goto L4a
            int r7 = r7 + r1
            r6.sequence = r7     // Catch: java.lang.Throwable -> L55
            monitor-exit(r6)
            return r1
        L4a:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r7 = r6.getSlots()     // Catch: java.lang.Throwable -> L55
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L55
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L2e
        L55:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L58:
            int r7 = r7 + 2
            r6.sequence = r7     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r6)
            return r1
        L5e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L76
            if (r2 == r6) goto L61
            if (r2 == r5) goto L4a
            if (r2 != r4) goto L42
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L73
            goto La6
        L42:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4a:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L73
            goto Ld4
        L61:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L73
            goto L97
        L73:
            r11 = move-exception
            goto Lf0
        L76:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r12 = r10.allocateSlot()
            kotlinx.coroutines.flow.StateFlowSlot r12 = (kotlinx.coroutines.flow.StateFlowSlot) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> Led
            if (r2 == 0) goto L95
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch: java.lang.Throwable -> Led
            r0.L$0 = r10     // Catch: java.lang.Throwable -> Led
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Led
            r0.L$2 = r12     // Catch: java.lang.Throwable -> Led
            r0.label = r6     // Catch: java.lang.Throwable -> Led
            java.lang.Object r2 = r2.onSubscription(r0)     // Catch: java.lang.Throwable -> Led
            if (r2 != r1) goto L95
            return r1
        L95:
            r8 = r10
            r6 = r12
        L97:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch: java.lang.Throwable -> L73
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L73
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r2)     // Catch: java.lang.Throwable -> L73
            kotlinx.coroutines.Job r12 = (kotlinx.coroutines.Job) r12     // Catch: java.lang.Throwable -> L73
            r7 = r11
            r2 = r12
            r11 = r3
        La6:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = kotlinx.coroutines.flow.StateFlowImpl._state$FU     // Catch: java.lang.Throwable -> L73
            java.lang.Object r12 = r12.get(r8)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto Lb1
            kotlinx.coroutines.JobKt.ensureActive(r2)     // Catch: java.lang.Throwable -> L73
        Lb1:
            if (r11 == 0) goto Lb9
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)     // Catch: java.lang.Throwable -> L73
            if (r9 != 0) goto Ld4
        Lb9:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL     // Catch: java.lang.Throwable -> L73
            if (r12 != r11) goto Lbf
            r11 = r3
            goto Lc0
        Lbf:
            r11 = r12
        Lc0:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L73
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L73
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L73
            r0.L$4 = r12     // Catch: java.lang.Throwable -> L73
            r0.label = r5     // Catch: java.lang.Throwable -> L73
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch: java.lang.Throwable -> L73
            if (r11 != r1) goto Ld3
            return r1
        Ld3:
            r11 = r12
        Ld4:
            boolean r12 = r6.takePending()     // Catch: java.lang.Throwable -> L73
            if (r12 != 0) goto La6
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L73
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L73
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L73
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L73
            r0.L$4 = r11     // Catch: java.lang.Throwable -> L73
            r0.label = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r12 = r6.awaitPending(r0)     // Catch: java.lang.Throwable -> L73
            if (r12 != r1) goto La6
            return r1
        Led:
            r11 = move-exception
            r8 = r10
            r6 = r12
        Lf0:
            r8.freeSlot(r6)
            throw r11
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.StateFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = new kotlinx.coroutines.flow.StateFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = r1.createSlot()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.StateFlowSlot[] createSlotArray(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r1 = new kotlinx.coroutines.flow.StateFlowSlot[r1]
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r1 = r0.createSlotArray(r1)
            return r1
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            r0.setValue(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public T getValue() {
            r2 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.flow.StateFlowImpl._state$FU
            java.lang.Object r1 = r1.get(r2)
            if (r1 != r0) goto Lb
            r1 = 0
        Lb:
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L4:
            r0 = 0
            r1.updateState(r0, r2)
            return
    }
}
