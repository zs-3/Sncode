package kotlinx.coroutines;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes2.dex */
public abstract class DispatchedTask<T> extends kotlinx.coroutines.scheduling.Task {
    public int resumeMode;

    public DispatchedTask(int r1) {
            r0 = this;
            r0.<init>()
            r0.resumeMode = r1
            return
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r1, java.lang.Throwable r2) {
            r0 = this;
            return
    }

    public abstract kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core();

    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Ld
            java.lang.Throwable r1 = r3.cause
        Ld:
            return r1
    }

    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    public final void handleFatalException$kotlinx_coroutines_core(java.lang.Throwable r3, java.lang.Throwable r4) {
            r2 = this;
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            return
        L5:
            if (r3 == 0) goto Lc
            if (r4 == 0) goto Lc
            kotlin.ExceptionsKt.addSuppressed(r3, r4)
        Lc:
            if (r3 != 0) goto Lf
            r3 = r4
        Lf:
            kotlinx.coroutines.CoroutinesInternalError r4 = new kotlinx.coroutines.CoroutinesInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fatal exception in coroutines machinery for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r4.<init>(r0, r3)
            kotlin.coroutines.Continuation r3 = r2.getDelegate$kotlinx_coroutines_core()
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r3, r4)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            kotlinx.coroutines.scheduling.TaskContext r0 = r10.taskContext
            kotlin.coroutines.Continuation r1 = r10.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            kotlinx.coroutines.internal.DispatchedContinuation r1 = (kotlinx.coroutines.internal.DispatchedContinuation) r1     // Catch: java.lang.Throwable -> Lb5
            kotlin.coroutines.Continuation<T> r2 = r1.continuation     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r1.countOrElement     // Catch: java.lang.Throwable -> Lb5
            kotlin.coroutines.CoroutineContext r3 = r2.getContext()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r1)     // Catch: java.lang.Throwable -> Lb5
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> Lb5
            r5 = 0
            if (r1 == r4) goto L23
            kotlinx.coroutines.UndispatchedCoroutine r4 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r2, r3, r1)     // Catch: java.lang.Throwable -> Lb5
            goto L24
        L23:
            r4 = r5
        L24:
            kotlin.coroutines.CoroutineContext r6 = r2.getContext()     // Catch: java.lang.Throwable -> La8
            java.lang.Object r7 = r10.takeState$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> La8
            java.lang.Throwable r8 = r10.getExceptionalResult$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> La8
            if (r8 != 0) goto L43
            int r9 = r10.resumeMode     // Catch: java.lang.Throwable -> La8
            boolean r9 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r9)     // Catch: java.lang.Throwable -> La8
            if (r9 == 0) goto L43
            kotlinx.coroutines.Job$Key r9 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> La8
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r9)     // Catch: java.lang.Throwable -> La8
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6     // Catch: java.lang.Throwable -> La8
            goto L44
        L43:
            r6 = r5
        L44:
            if (r6 == 0) goto L61
            boolean r9 = r6.isActive()     // Catch: java.lang.Throwable -> La8
            if (r9 != 0) goto L61
            java.util.concurrent.CancellationException r6 = r6.getCancellationException()     // Catch: java.lang.Throwable -> La8
            r10.cancelCompletedResult$kotlinx_coroutines_core(r7, r6)     // Catch: java.lang.Throwable -> La8
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = kotlin.Result.m72constructorimpl(r6)     // Catch: java.lang.Throwable -> La8
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La8
            goto L7e
        L61:
            if (r8 == 0) goto L71
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r8)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = kotlin.Result.m72constructorimpl(r6)     // Catch: java.lang.Throwable -> La8
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La8
            goto L7e
        L71:
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = r10.getSuccessfulResult$kotlinx_coroutines_core(r7)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = kotlin.Result.m72constructorimpl(r6)     // Catch: java.lang.Throwable -> La8
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> La8
        L7e:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L88
            boolean r4 = r4.clearThreadContext()     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto L8b
        L88:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r1)     // Catch: java.lang.Throwable -> Lb5
        L8b:
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L95
            r0.afterTask()     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r2)     // Catch: java.lang.Throwable -> L95
            goto La0
        L95:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
        La0:
            java.lang.Throwable r0 = kotlin.Result.m73exceptionOrNullimpl(r0)
            r10.handleFatalException$kotlinx_coroutines_core(r5, r0)
            goto Ld4
        La8:
            r2 = move-exception
            if (r4 == 0) goto Lb1
            boolean r4 = r4.clearThreadContext()     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto Lb4
        Lb1:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r1)     // Catch: java.lang.Throwable -> Lb5
        Lb4:
            throw r2     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lc2
            r0.afterTask()     // Catch: java.lang.Throwable -> Lc2
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)     // Catch: java.lang.Throwable -> Lc2
            goto Lcd
        Lc2:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m72constructorimpl(r0)
        Lcd:
            java.lang.Throwable r0 = kotlin.Result.m73exceptionOrNullimpl(r0)
            r10.handleFatalException$kotlinx_coroutines_core(r1, r0)
        Ld4:
            return
    }

    public abstract java.lang.Object takeState$kotlinx_coroutines_core();
}
