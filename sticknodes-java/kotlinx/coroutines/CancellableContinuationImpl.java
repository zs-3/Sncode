package kotlinx.coroutines;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.Waiter {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decisionAndIndex$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _parentHandle$FU = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile int _decisionAndIndex;
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.Continuation<T> delegate;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class<kotlinx.coroutines.CancellableContinuationImpl> r1 = kotlinx.coroutines.CancellableContinuationImpl.class
            java.lang.String r2 = "_decisionAndIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r2)
            kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$FU = r1
            java.lang.Class<kotlinx.coroutines.CancellableContinuationImpl> r1 = kotlinx.coroutines.CancellableContinuationImpl.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.CancellableContinuationImpl._state$FU = r1
            java.lang.Class<kotlinx.coroutines.CancellableContinuationImpl> r1 = kotlinx.coroutines.CancellableContinuationImpl.class
            java.lang.String r2 = "_parentHandle"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.CancellableContinuationImpl._parentHandle$FU = r0
            return
    }

    public CancellableContinuationImpl(kotlin.coroutines.Continuation<? super T> r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            r0.delegate = r1
            kotlin.coroutines.CoroutineContext r1 = r1.getContext()
            r0.context = r1
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0._decisionAndIndex = r1
            kotlinx.coroutines.Active r1 = kotlinx.coroutines.Active.INSTANCE
            r0._state = r1
            return
    }

    private final java.lang.Void alreadyResumedError(java.lang.Object r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Already resumed, but proposed with update "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void callSegmentOnCancellation(kotlinx.coroutines.internal.Segment<?> r4, java.lang.Throwable r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$FU
            int r0 = r0.get(r3)
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0 = r0 & r1
            if (r0 == r1) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L38
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()     // Catch: java.lang.Throwable -> L19
            r4.onCancellation(r0, r5, r1)     // Catch: java.lang.Throwable -> L19
            goto L37
        L19:
            r4 = move-exception
            kotlin.coroutines.CoroutineContext r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r5, r0)
        L37:
            return
        L38:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "The index for Segment.onCancellation(..) is broken"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private final boolean cancelLater(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.isReusable()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r3 = r0.postponeCancellation$kotlinx_coroutines_core(r3)
            return r3
    }

    private final void detachChildIfNonResuable() {
            r1 = this;
            boolean r0 = r1.isReusable()
            if (r0 != 0) goto L9
            r1.detachChild$kotlinx_coroutines_core()
        L9:
            return
    }

    private final void dispatchResume(int r2) {
            r1 = this;
            boolean r0 = r1.tryResume()
            if (r0 == 0) goto L7
            return
        L7:
            kotlinx.coroutines.DispatchedTaskKt.dispatch(r1, r2)
            return
    }

    private final kotlinx.coroutines.DisposableHandle getParentHandle() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._parentHandle$FU
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
    }

    private final java.lang.String getStateDebugRepresentation() {
            r2 = this;
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.NotCompleted
            if (r1 == 0) goto Lb
            java.lang.String r0 = "Active"
            goto L14
        Lb:
            boolean r0 = r0 instanceof kotlinx.coroutines.CancelledContinuation
            if (r0 == 0) goto L12
            java.lang.String r0 = "Cancelled"
            goto L14
        L12:
            java.lang.String r0 = "Completed"
        L14:
            return r0
    }

    private final kotlinx.coroutines.DisposableHandle installParentHandle() {
            r7 = this;
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            r0 = 0
            if (r1 != 0) goto L11
            return r0
        L11:
            r2 = 1
            r3 = 0
            kotlinx.coroutines.ChildContinuation r4 = new kotlinx.coroutines.ChildContinuation
            r4.<init>(r7)
            r5 = 2
            r6 = 0
            kotlinx.coroutines.DisposableHandle r1 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._parentHandle$FU
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r7, r0, r1)
            return r1
    }

    private final void invokeOnCancellationImpl(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L6:
            java.lang.Object r11 = r2.get(r0)
            boolean r3 = r11 instanceof kotlinx.coroutines.Active
            if (r3 == 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r0, r11, r1)
            if (r3 == 0) goto L6
            return
        L17:
            boolean r3 = r11 instanceof kotlinx.coroutines.CancelHandler
            if (r3 == 0) goto L1d
            r3 = 1
            goto L1f
        L1d:
            boolean r3 = r11 instanceof kotlinx.coroutines.internal.Segment
        L1f:
            if (r3 == 0) goto L25
            r0.multipleHandlersError(r1, r11)
            goto L6
        L25:
            boolean r3 = r11 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r3 == 0) goto L57
            r2 = r11
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            boolean r4 = r2.makeHandled()
            if (r4 != 0) goto L35
            r0.multipleHandlersError(r1, r11)
        L35:
            boolean r4 = r11 instanceof kotlinx.coroutines.CancelledContinuation
            if (r4 == 0) goto L56
            r4 = 0
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            r2 = r4
        L3e:
            if (r2 == 0) goto L42
            java.lang.Throwable r4 = r2.cause
        L42:
            boolean r2 = r1 instanceof kotlinx.coroutines.CancelHandler
            if (r2 == 0) goto L4c
            kotlinx.coroutines.CancelHandler r1 = (kotlinx.coroutines.CancelHandler) r1
            r0.callCancelHandler(r1, r4)
            goto L56
        L4c:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            kotlinx.coroutines.internal.Segment r1 = (kotlinx.coroutines.internal.Segment) r1
            r0.callSegmentOnCancellation(r1, r4)
        L56:
            return
        L57:
            boolean r3 = r11 instanceof kotlinx.coroutines.CompletedContinuation
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r3 == 0) goto L95
            r12 = r11
            kotlinx.coroutines.CompletedContinuation r12 = (kotlinx.coroutines.CompletedContinuation) r12
            kotlinx.coroutines.CancelHandler r3 = r12.cancelHandler
            if (r3 == 0) goto L67
            r0.multipleHandlersError(r1, r11)
        L67:
            boolean r3 = r1 instanceof kotlinx.coroutines.internal.Segment
            if (r3 == 0) goto L6c
            return
        L6c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            r14 = r1
            kotlinx.coroutines.CancelHandler r14 = (kotlinx.coroutines.CancelHandler) r14
            boolean r3 = r12.getCancelled()
            if (r3 == 0) goto L7e
            java.lang.Throwable r1 = r12.cancelCause
            r0.callCancelHandler(r14, r1)
            return
        L7e:
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 29
            r19 = 0
            kotlinx.coroutines.CompletedContinuation r3 = kotlinx.coroutines.CompletedContinuation.copy$default(r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r0, r11, r3)
            if (r3 == 0) goto L6
            return
        L95:
            boolean r3 = r1 instanceof kotlinx.coroutines.internal.Segment
            if (r3 == 0) goto L9a
            return
        L9a:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            r5 = r1
            kotlinx.coroutines.CancelHandler r5 = (kotlinx.coroutines.CancelHandler) r5
            kotlinx.coroutines.CompletedContinuation r12 = new kotlinx.coroutines.CompletedContinuation
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 28
            r10 = 0
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r0, r11, r12)
            if (r3 == 0) goto L6
            return
    }

    private final boolean isReusable() {
            r2 = this;
            int r0 = r2.resumeMode
            boolean r0 = kotlinx.coroutines.DispatchedTaskKt.isReusableMode(r0)
            if (r0 == 0) goto L19
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            boolean r0 = r0.isReusable$kotlinx_coroutines_core()
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    private final kotlinx.coroutines.CancelHandler makeCancelHandler(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L7
            kotlinx.coroutines.CancelHandler r2 = (kotlinx.coroutines.CancelHandler) r2
            goto Ld
        L7:
            kotlinx.coroutines.InvokeOnCancel r0 = new kotlinx.coroutines.InvokeOnCancel
            r0.<init>(r2)
            r2 = r0
        Ld:
            return r2
    }

    private final void multipleHandlersError(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", already has "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void resumeImpl(java.lang.Object r10, int r11, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r12) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L2:
            java.lang.Object r1 = r0.get(r9)
            boolean r2 = r1 instanceof kotlinx.coroutines.NotCompleted
            if (r2 == 0) goto L25
            r4 = r1
            kotlinx.coroutines.NotCompleted r4 = (kotlinx.coroutines.NotCompleted) r4
            r8 = 0
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.Object r2 = r3.resumedState(r4, r5, r6, r7, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r9, r1, r2)
            if (r1 == 0) goto L2
            r9.detachChildIfNonResuable()
            r9.dispatchResume(r11)
            return
        L25:
            boolean r11 = r1 instanceof kotlinx.coroutines.CancelledContinuation
            if (r11 == 0) goto L39
            kotlinx.coroutines.CancelledContinuation r1 = (kotlinx.coroutines.CancelledContinuation) r1
            boolean r11 = r1.makeResumed()
            if (r11 == 0) goto L39
            if (r12 == 0) goto L38
            java.lang.Throwable r10 = r1.cause
            r9.callOnCancellation(r12, r10)
        L38:
            return
        L39:
            r9.alreadyResumedError(r10)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
    }

    static /* synthetic */ void resumeImpl$default(kotlinx.coroutines.CancellableContinuationImpl r0, java.lang.Object r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto Lb
            r4 = r4 & 4
            if (r4 == 0) goto L7
            r3 = 0
        L7:
            r0.resumeImpl(r1, r2, r3)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: resumeImpl"
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.Object resumedState(kotlinx.coroutines.NotCompleted r9, java.lang.Object r10, int r11, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r12, java.lang.Object r13) {
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L5
            goto L2d
        L5:
            boolean r11 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r11)
            if (r11 != 0) goto Le
            if (r13 != 0) goto Le
            goto L2d
        Le:
            if (r12 != 0) goto L16
            boolean r11 = r9 instanceof kotlinx.coroutines.CancelHandler
            if (r11 != 0) goto L16
            if (r13 == 0) goto L2d
        L16:
            kotlinx.coroutines.CompletedContinuation r11 = new kotlinx.coroutines.CompletedContinuation
            boolean r0 = r9 instanceof kotlinx.coroutines.CancelHandler
            if (r0 == 0) goto L1f
            kotlinx.coroutines.CancelHandler r9 = (kotlinx.coroutines.CancelHandler) r9
            goto L20
        L1f:
            r9 = 0
        L20:
            r2 = r9
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r11
            r1 = r10
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = r11
        L2d:
            return r10
    }

    private final boolean tryResume() {
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$FU
        L2:
            int r1 = r0.get(r6)
            int r2 = r1 >> 29
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto Lf
            r0 = 0
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$FU
            r4 = 536870911(0x1fffffff, float:1.0842021E-19)
            r4 = r4 & r1
            r5 = 1073741824(0x40000000, float:2.0)
            int r5 = r5 + r4
            boolean r1 = r2.compareAndSet(r6, r1, r5)
            if (r1 == 0) goto L2
            return r3
    }

    private final kotlinx.coroutines.internal.Symbol tryResumeImpl(java.lang.Object r10, java.lang.Object r11, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r12) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L2:
            java.lang.Object r1 = r0.get(r9)
            boolean r2 = r1 instanceof kotlinx.coroutines.NotCompleted
            if (r2 == 0) goto L25
            r4 = r1
            kotlinx.coroutines.NotCompleted r4 = (kotlinx.coroutines.NotCompleted) r4
            int r6 = r9.resumeMode
            r3 = r9
            r5 = r10
            r7 = r12
            r8 = r11
            java.lang.Object r2 = r3.resumedState(r4, r5, r6, r7, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r9, r1, r2)
            if (r1 == 0) goto L2
            r9.detachChildIfNonResuable()
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r10
        L25:
            boolean r10 = r1 instanceof kotlinx.coroutines.CompletedContinuation
            r12 = 0
            if (r10 == 0) goto L34
            if (r11 == 0) goto L34
            kotlinx.coroutines.CompletedContinuation r1 = (kotlinx.coroutines.CompletedContinuation) r1
            java.lang.Object r10 = r1.idempotentResume
            if (r10 != r11) goto L34
            kotlinx.coroutines.internal.Symbol r12 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
        L34:
            return r12
    }

    private final boolean trySuspend() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$FU
        L2:
            int r1 = r0.get(r5)
            int r2 = r1 >> 29
            if (r2 == 0) goto L1b
            r0 = 2
            if (r2 != r0) goto Lf
            r0 = 0
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$FU
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r1
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            int r4 = r4 + r3
            boolean r1 = r2.compareAndSet(r5, r1, r4)
            if (r1 == 0) goto L2
            r0 = 1
            return r0
    }

    public final void callCancelHandler(kotlinx.coroutines.CancelHandler r4, java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r4 = move-exception
            kotlin.coroutines.CoroutineContext r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r5, r0)
        L22:
            return
    }

    public final void callOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4, java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            goto L22
        L4:
            r4 = move-exception
            kotlin.coroutines.CoroutineContext r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in resume onCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r5, r0)
        L22:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(java.lang.Throwable r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L2:
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof kotlinx.coroutines.NotCompleted
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            kotlinx.coroutines.CancelledContinuation r2 = new kotlinx.coroutines.CancelledContinuation
            boolean r4 = r1 instanceof kotlinx.coroutines.CancelHandler
            r5 = 1
            if (r4 != 0) goto L17
            boolean r4 = r1 instanceof kotlinx.coroutines.internal.Segment
            if (r4 == 0) goto L18
        L17:
            r3 = 1
        L18:
            r2.<init>(r6, r7, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r6, r1, r2)
            if (r2 == 0) goto L2
            r0 = r1
            kotlinx.coroutines.NotCompleted r0 = (kotlinx.coroutines.NotCompleted) r0
            boolean r2 = r0 instanceof kotlinx.coroutines.CancelHandler
            if (r2 == 0) goto L30
            kotlinx.coroutines.CancelHandler r1 = (kotlinx.coroutines.CancelHandler) r1
            r6.callCancelHandler(r1, r7)
            goto L39
        L30:
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.Segment
            if (r0 == 0) goto L39
            kotlinx.coroutines.internal.Segment r1 = (kotlinx.coroutines.internal.Segment) r1
            r6.callSegmentOnCancellation(r1, r7)
        L39:
            r6.detachChildIfNonResuable()
            int r7 = r6.resumeMode
            r6.dispatchResume(r7)
            return r5
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r20, java.lang.Throwable r21) {
            r19 = this;
            r0 = r19
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
        L4:
            java.lang.Object r10 = r1.get(r0)
            boolean r2 = r10 instanceof kotlinx.coroutines.NotCompleted
            if (r2 != 0) goto L63
            boolean r2 = r10 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r2 == 0) goto L11
            return
        L11:
            boolean r2 = r10 instanceof kotlinx.coroutines.CompletedContinuation
            if (r2 == 0) goto L49
            r2 = r10
            kotlinx.coroutines.CompletedContinuation r2 = (kotlinx.coroutines.CompletedContinuation) r2
            boolean r3 = r2.getCancelled()
            r3 = r3 ^ 1
            if (r3 == 0) goto L3d
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 15
            r18 = 0
            r11 = r2
            r16 = r21
            kotlinx.coroutines.CompletedContinuation r3 = kotlinx.coroutines.CompletedContinuation.copy$default(r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r0, r10, r3)
            r11 = r21
            if (r3 == 0) goto L4
            r2.invokeHandlers(r0, r11)
            return
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Must be called at most once"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L49:
            r11 = r21
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            kotlinx.coroutines.CompletedContinuation r13 = new kotlinx.coroutines.CompletedContinuation
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 14
            r9 = 0
            r2 = r13
            r3 = r10
            r7 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r12, r0, r10, r13)
            if (r2 == 0) goto L4
            return
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Not completed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.resumeMode
            r0.dispatchResume(r1)
            return
    }

    public final void detachChild$kotlinx_coroutines_core() {
            r2 = this;
            kotlinx.coroutines.DisposableHandle r0 = r2.getParentHandle()
            if (r0 != 0) goto L7
            return
        L7:
            r0.dispose()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._parentHandle$FU
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r0.set(r2, r1)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
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
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job r1) {
            r0 = this;
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            return r1
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.delegate
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = super.getExceptionalResult$kotlinx_coroutines_core(r1)
            if (r1 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    public final java.lang.Object getResult() {
            r3 = this;
            boolean r0 = r3.isReusable()
            boolean r1 = r3.trySuspend()
            if (r1 == 0) goto L1d
            kotlinx.coroutines.DisposableHandle r1 = r3.getParentHandle()
            if (r1 != 0) goto L13
            r3.installParentHandle()
        L13:
            if (r0 == 0) goto L18
            r3.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
        L18:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        L1d:
            if (r0 == 0) goto L22
            r3.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
        L22:
            java.lang.Object r0 = r3.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L54
            int r1 = r3.resumeMode
            boolean r1 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r1)
            if (r1 == 0) goto L4f
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto L4f
            boolean r2 = r1.isActive()
            if (r2 == 0) goto L47
            goto L4f
        L47:
            java.util.concurrent.CancellationException r1 = r1.getCancellationException()
            r3.cancelCompletedResult$kotlinx_coroutines_core(r0, r1)
            throw r1
        L4f:
            java.lang.Object r0 = r3.getSuccessfulResult$kotlinx_coroutines_core(r0)
            return r0
        L54:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedContinuation
            if (r0 == 0) goto L8
            kotlinx.coroutines.CompletedContinuation r2 = (kotlinx.coroutines.CompletedContinuation) r2
            java.lang.Object r2 = r2.result
        L8:
            return r2
    }

    public void initCancellability() {
            r2 = this;
            kotlinx.coroutines.DisposableHandle r0 = r2.installParentHandle()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r2.isCompleted()
            if (r1 == 0) goto L17
            r0.dispose()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._parentHandle$FU
            kotlinx.coroutines.NonDisposableHandle r1 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r0.set(r2, r1)
        L17:
            return
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r1) {
            r0 = this;
            kotlinx.coroutines.CancelHandler r1 = r0.makeCancelHandler(r1)
            r0.invokeOnCancellationImpl(r1)
            return
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> r5, int r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$FU
        L2:
            int r1 = r0.get(r4)
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r1 & r2
            if (r3 != r2) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L21
            int r2 = r1 >> 29
            int r2 = r2 << 29
            int r2 = r2 + r6
            boolean r1 = r0.compareAndSet(r4, r1, r2)
            if (r1 == 0) goto L2
            r4.invokeOnCancellationImpl(r5)
            return
        L21:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "invokeOnCancellation should be called at most once"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            boolean r0 = r0 instanceof kotlinx.coroutines.NotCompleted
            r0 = r0 ^ 1
            return r0
    }

    protected java.lang.String nameString() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    public final void parentCancelled$kotlinx_coroutines_core(java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.cancelLater(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.cancel(r2)
            r1.detachChildIfNonResuable()
            return
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.delegate
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L9
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L19
            java.lang.Throwable r0 = r0.tryReleaseClaimedContinuation$kotlinx_coroutines_core(r2)
            if (r0 != 0) goto L13
            goto L19
        L13:
            r2.detachChild$kotlinx_coroutines_core()
            r2.cancel(r0)
        L19:
            return
    }

    public final boolean resetStateReusable() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.CancellableContinuationImpl._state$FU
            java.lang.Object r1 = r0.get(r3)
            boolean r2 = r1 instanceof kotlinx.coroutines.CompletedContinuation
            if (r2 == 0) goto L15
            kotlinx.coroutines.CompletedContinuation r1 = (kotlinx.coroutines.CompletedContinuation) r1
            java.lang.Object r1 = r1.idempotentResume
            if (r1 == 0) goto L15
            r3.detachChild$kotlinx_coroutines_core()
            r0 = 0
            return r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.CancellableContinuationImpl._decisionAndIndex$FU
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.set(r3, r2)
            kotlinx.coroutines.Active r1 = kotlinx.coroutines.Active.INSTANCE
            r0.set(r3, r1)
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r1 = this;
            int r0 = r1.resumeMode
            r1.resumeImpl(r2, r0, r3)
            return
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r1 = kotlinx.coroutines.CompletionStateKt.toState(r7, r6)
            int r2 = r6.resumeMode
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r6
            resumeImpl$default(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1.getState$kotlinx_coroutines_core()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.nameString()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.delegate
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.lang.String r1 = r2.getStateDebugRepresentation()
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T r1, java.lang.Object r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeImpl(r1, r2, r3)
            return r1
    }
}
