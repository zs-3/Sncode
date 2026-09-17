package kotlinx.coroutines.internal;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes2.dex */
public final class DispatchedContinuation<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation<T> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _reusableCancellableContinuation$FU = null;
    private volatile java.lang.Object _reusableCancellableContinuation;
    public java.lang.Object _state;
    public final kotlin.coroutines.Continuation<T> continuation;
    public final java.lang.Object countOrElement;
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    static {
            java.lang.Class<kotlinx.coroutines.internal.DispatchedContinuation> r0 = kotlinx.coroutines.internal.DispatchedContinuation.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_reusableCancellableContinuation"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU = r0
            return
    }

    public DispatchedContinuation(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.dispatcher = r2
            r1.continuation = r3
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r1._state = r2
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r2)
            r1.countOrElement = r2
            return
    }

    private final kotlinx.coroutines.CancellableContinuationImpl<?> getReusableCancellableContinuation() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r1 == 0) goto Ld
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
        L2:
            java.lang.Object r1 = r0.get(r3)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r1 == r2) goto L2
            return
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedWithCancellation
            if (r0 == 0) goto Lb
            kotlinx.coroutines.CompletedWithCancellation r2 = (kotlinx.coroutines.CompletedWithCancellation) r2
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r2.onCancellation
            r2.invoke(r3)
        Lb:
            return
    }

    public final kotlinx.coroutines.CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
        L2:
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L11
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r0.set(r4, r1)
            r0 = 0
            return r0
        L11:
            boolean r2 = r1 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r2 == 0) goto L22
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r1, r3)
            if (r2 == 0) goto L2
            kotlinx.coroutines.CancellableContinuationImpl r1 = (kotlinx.coroutines.CancellableContinuationImpl) r1
            return r1
        L22:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r1 == r2) goto L2
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L2b
            goto L2
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Inconsistent state "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.continuation
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.continuation
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r0 = this;
            return r0
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(java.lang.Throwable r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
        L2:
            java.lang.Object r1 = r0.get(r5)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r4 = 1
            if (r3 == 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r5, r2, r6)
            if (r1 == 0) goto L2
            return r4
        L18:
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L1d
            return r4
        L1d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            r3 = 0
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r5, r1, r3)
            if (r1 == 0) goto L2
            r6 = 0
            return r6
    }

    public final void release$kotlinx_coroutines_core() {
            r1 = this;
            r1.awaitReusability$kotlinx_coroutines_core()
            kotlinx.coroutines.CancellableContinuationImpl r0 = r1.getReusableCancellableContinuation()
            if (r0 == 0) goto Lc
            r0.detachChild$kotlinx_coroutines_core()
        Lc:
            return
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r7) {
            r6 = this;
            kotlin.coroutines.Continuation<T> r0 = r6.continuation
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.CompletionStateKt.toState$default(r7, r1, r2, r1)
            kotlinx.coroutines.CoroutineDispatcher r4 = r6.dispatcher
            boolean r4 = r4.isDispatchNeeded(r0)
            r5 = 0
            if (r4 == 0) goto L1f
            r6._state = r3
            r6.resumeMode = r5
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            r7.mo128dispatch(r0, r6)
            goto L5d
        L1f:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r4 = r0.isUnconfinedLoopActive()
            if (r4 == 0) goto L33
            r6._state = r3
            r6.resumeMode = r5
            r0.dispatchUnconfined(r6)
            goto L5d
        L33:
            r0.incrementUseCount(r2)
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r6.countOrElement     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r4)     // Catch: java.lang.Throwable -> L56
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L51
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L51
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L51
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r4)     // Catch: java.lang.Throwable -> L56
        L4a:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L56
            if (r7 != 0) goto L4a
            goto L5a
        L51:
            r7 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r4)     // Catch: java.lang.Throwable -> L56
            throw r7     // Catch: java.lang.Throwable -> L56
        L56:
            r7 = move-exception
            r6.handleFatalException$kotlinx_coroutines_core(r7, r1)     // Catch: java.lang.Throwable -> L5e
        L5a:
            r0.decrementUseCount(r2)
        L5d:
            return
        L5e:
            r7 = move-exception
            r0.decrementUseCount(r2)
            throw r7
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2._state
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r2._state = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DispatchedContinuation["
            r0.append(r1)
            kotlinx.coroutines.CoroutineDispatcher r1 = r2.dispatcher
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.continuation
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(kotlinx.coroutines.CancellableContinuation<?> r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r3 = 0
            if (r1 != r2) goto L14
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r4, r2, r5)
            if (r1 == 0) goto L2
            return r3
        L14:
            boolean r5 = r1 instanceof java.lang.Throwable
            if (r5 == 0) goto L2f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            boolean r5 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r4, r1, r3)
            if (r5 == 0) goto L23
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L23:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Inconsistent state "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }
}
