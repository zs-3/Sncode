package kotlinx.coroutines.internal;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes2.dex */
public final class DispatchedContinuationKt {
    public static final kotlinx.coroutines.internal.Symbol REUSABLE_CLAIMED = null;
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNDEFINED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getUNDEFINED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED
            return r0
    }

    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> r6, java.lang.Object r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8) {
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto Lb6
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r8 = kotlinx.coroutines.CompletionStateKt.toState(r7, r8)
            kotlinx.coroutines.CoroutineDispatcher r0 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6._state = r8
            r6.resumeMode = r1
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.dispatcher
            kotlin.coroutines.CoroutineContext r8 = r6.getContext()
            r7.mo128dispatch(r8, r6)
            goto Lb9
        L26:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L3b
            r6._state = r8
            r6.resumeMode = r1
            r0.dispatchUnconfined(r6)
            goto Lb9
        L3b:
            r0.incrementUseCount(r1)
            r2 = 0
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch: java.lang.Throwable -> La9
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> La9
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)     // Catch: java.lang.Throwable -> La9
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> La9
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r3 = r3.getCancellationException()     // Catch: java.lang.Throwable -> La9
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r3)     // Catch: java.lang.Throwable -> La9
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La9
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Throwable -> La9
            java.lang.Object r8 = kotlin.Result.m72constructorimpl(r8)     // Catch: java.lang.Throwable -> La9
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> La9
            r8 = 1
            goto L6a
        L69:
            r8 = 0
        L6a:
            if (r8 != 0) goto La2
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> La9
            kotlin.coroutines.CoroutineContext r4 = r8.getContext()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> La9
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> La9
            if (r3 == r5) goto L81
            kotlinx.coroutines.UndispatchedCoroutine r8 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r8, r4, r3)     // Catch: java.lang.Throwable -> La9
            goto L82
        L81:
            r8 = r2
        L82:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L95
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L95
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L91
            boolean r7 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> La9
            if (r7 == 0) goto La2
        L91:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> La9
            goto La2
        L95:
            r7 = move-exception
            if (r8 == 0) goto L9e
            boolean r8 = r8.clearThreadContext()     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto La1
        L9e:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> La9
        La1:
            throw r7     // Catch: java.lang.Throwable -> La9
        La2:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> La9
            if (r7 != 0) goto La2
            goto Lad
        La9:
            r7 = move-exception
            r6.handleFatalException$kotlinx_coroutines_core(r7, r2)     // Catch: java.lang.Throwable -> Lb1
        Lad:
            r0.decrementUseCount(r1)
            goto Lb9
        Lb1:
            r6 = move-exception
            r0.decrementUseCount(r1)
            throw r6
        Lb6:
            r6.resumeWith(r7)
        Lb9:
            return
    }

    public static /* synthetic */ void resumeCancellableWith$default(kotlin.coroutines.Continuation r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            resumeCancellableWith(r0, r1, r2)
            return
    }
}
