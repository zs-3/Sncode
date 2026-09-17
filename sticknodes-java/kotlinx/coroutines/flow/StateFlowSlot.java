package kotlinx.coroutines.flow;

/* compiled from: StateFlow.kt */
/* loaded from: classes2.dex */
final class StateFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.StateFlowImpl<?>> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile java.lang.Object _state;

    static {
            java.lang.Class<kotlinx.coroutines.flow.StateFlowSlot> r0 = kotlinx.coroutines.flow.StateFlowSlot.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.flow.StateFlowSlot._state$FU = r0
            return
    }

    public StateFlowSlot() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$get_state$FU$p() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ boolean allocateLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowImpl r1 = (kotlinx.coroutines.flow.StateFlowImpl) r1
            boolean r1 = r0.allocateLocked2(r1)
            return r1
    }

    /* renamed from: allocateLocked, reason: avoid collision after fix types in other method */
    public boolean allocateLocked2(kotlinx.coroutines.flow.StateFlowImpl<?> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            r2.set(r1, r0)
            r2 = 1
            return r2
    }

    public final java.lang.Object awaitPending(kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r3 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$get_state$FU$p()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r2, r0)
            if (r1 != 0) goto L26
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = kotlin.Result.m72constructorimpl(r1)
            r0.resumeWith(r1)
        L26:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L33
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r4)
        L33:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r4) goto L3a
            return r0
        L3a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ kotlin.coroutines.Continuation[] freeLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowImpl r1 = (kotlinx.coroutines.flow.StateFlowImpl) r1
            kotlin.coroutines.Continuation[] r1 = r0.freeLocked2(r1)
            return r1
    }

    /* renamed from: freeLocked, reason: avoid collision after fix types in other method */
    public kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked2(kotlinx.coroutines.flow.StateFlowImpl<?> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            r0 = 0
            r2.set(r1, r0)
            kotlin.coroutines.Continuation<kotlin.Unit>[] r2 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r2
    }

    public final void makePending() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
        L2:
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L9
            return
        L9:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r1 != r2) goto L10
            return
        L10:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            if (r1 != r2) goto L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r1, r3)
            if (r1 == 0) goto L2
            return
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r1, r3)
            if (r2 == 0) goto L2
            kotlinx.coroutines.CancellableContinuationImpl r1 = (kotlinx.coroutines.CancellableContinuationImpl) r1
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
            r1.resumeWith(r0)
            return
    }

    public final boolean takePending() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r0 != r1) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }
}
