package kotlinx.coroutines;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes2.dex */
public final class DispatchedTaskKt {
    public static final <T> void dispatch(kotlinx.coroutines.DispatchedTask<? super T> r3, int r4) {
            kotlin.coroutines.Continuation r0 = r3.getDelegate$kotlinx_coroutines_core()
            r1 = 4
            if (r4 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 != 0) goto L33
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r2 == 0) goto L33
            boolean r4 = isCancellableMode(r4)
            int r2 = r3.resumeMode
            boolean r2 = isCancellableMode(r2)
            if (r4 != r2) goto L33
            r4 = r0
            kotlinx.coroutines.internal.DispatchedContinuation r4 = (kotlinx.coroutines.internal.DispatchedContinuation) r4
            kotlinx.coroutines.CoroutineDispatcher r4 = r4.dispatcher
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            boolean r1 = r4.isDispatchNeeded(r0)
            if (r1 == 0) goto L2f
            r4.mo128dispatch(r0, r3)
            goto L36
        L2f:
            resumeUnconfined(r3)
            goto L36
        L33:
            resume(r3, r0, r1)
        L36:
            return
    }

    public static final boolean isCancellableMode(int r2) {
            r0 = 1
            if (r2 == r0) goto L8
            r1 = 2
            if (r2 != r1) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static final boolean isReusableMode(int r1) {
            r0 = 2
            if (r1 != r0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    public static final <T> void resume(kotlinx.coroutines.DispatchedTask<? super T> r3, kotlin.coroutines.Continuation<? super T> r4, boolean r5) {
            java.lang.Object r0 = r3.takeState$kotlinx_coroutines_core()
            java.lang.Throwable r1 = r3.getExceptionalResult$kotlinx_coroutines_core(r0)
            if (r1 == 0) goto L11
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r1)
            goto L17
        L11:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = r3.getSuccessfulResult$kotlinx_coroutines_core(r0)
        L17:
            java.lang.Object r3 = kotlin.Result.m72constructorimpl(r3)
            if (r5 == 0) goto L5a
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
            kotlinx.coroutines.internal.DispatchedContinuation r4 = (kotlinx.coroutines.internal.DispatchedContinuation) r4
            kotlin.coroutines.Continuation<T> r5 = r4.continuation
            java.lang.Object r0 = r4.countOrElement
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r1, r0)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r0 == r2) goto L39
            kotlinx.coroutines.UndispatchedCoroutine r5 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r5, r1, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            kotlin.coroutines.Continuation<T> r4 = r4.continuation     // Catch: java.lang.Throwable -> L4d
            r4.resumeWith(r3)     // Catch: java.lang.Throwable -> L4d
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L49
            boolean r3 = r5.clearThreadContext()
            if (r3 == 0) goto L5d
        L49:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r0)
            goto L5d
        L4d:
            r3 = move-exception
            if (r5 == 0) goto L56
            boolean r4 = r5.clearThreadContext()
            if (r4 == 0) goto L59
        L56:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r1, r0)
        L59:
            throw r3
        L5a:
            r4.resumeWith(r3)
        L5d:
            return
    }

    private static final void resumeUnconfined(kotlinx.coroutines.DispatchedTask<?> r4) {
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r1 = r0.isUnconfinedLoopActive()
            if (r1 == 0) goto L10
            r0.dispatchUnconfined(r4)
            goto L2a
        L10:
            r1 = 1
            r0.incrementUseCount(r1)
            kotlin.coroutines.Continuation r2 = r4.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L22
            resume(r4, r2, r1)     // Catch: java.lang.Throwable -> L22
        L1b:
            boolean r2 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1b
            goto L27
        L22:
            r2 = move-exception
            r3 = 0
            r4.handleFatalException$kotlinx_coroutines_core(r2, r3)     // Catch: java.lang.Throwable -> L2b
        L27:
            r0.decrementUseCount(r1)
        L2a:
            return
        L2b:
            r4 = move-exception
            r0.decrementUseCount(r1)
            throw r4
    }
}
