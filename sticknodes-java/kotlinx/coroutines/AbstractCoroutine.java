package kotlinx.coroutines;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes2.dex */
public abstract class AbstractCoroutine<T> extends kotlinx.coroutines.JobSupport implements kotlin.coroutines.Continuation<T>, kotlinx.coroutines.CoroutineScope {
    private final kotlin.coroutines.CoroutineContext context;

    public AbstractCoroutine(kotlin.coroutines.CoroutineContext r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>(r3)
            if (r2 == 0) goto L10
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r2)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r0.initParentJob(r2)
        L10:
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r0)
            r0.context = r1
            return
    }

    protected void afterResume(java.lang.Object r1) {
            r0 = this;
            r0.afterCompletion(r1)
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected java.lang.String cancellationExceptionMessage() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            java.lang.String r1 = " was cancelled"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public final kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public java.lang.String nameString$kotlinx_coroutines_core() {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.context
            java.lang.String r0 = kotlinx.coroutines.CoroutineContextKt.getCoroutineName(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = super.nameString$kotlinx_coroutines_core()
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 34
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\":"
            r1.append(r0)
            java.lang.String r0 = super.nameString$kotlinx_coroutines_core()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    protected void onCancelled(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            return
    }

    protected void onCompleted(T r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final void onCompletionInternal(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L10
            kotlinx.coroutines.CompletedExceptionally r2 = (kotlinx.coroutines.CompletedExceptionally) r2
            java.lang.Throwable r0 = r2.cause
            boolean r2 = r2.getHandled()
            r1.onCancelled(r0, r2)
            goto L13
        L10:
            r1.onCompleted(r2)
        L13:
            return
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r3 = kotlinx.coroutines.CompletionStateKt.toState$default(r3, r0, r1, r0)
            java.lang.Object r3 = r2.makeCompletingOnce$kotlinx_coroutines_core(r3)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r3 != r0) goto Lf
            return
        Lf:
            r2.afterResume(r3)
            return
    }

    public final <R> void start(kotlinx.coroutines.CoroutineStart r1, R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r3) {
            r0 = this;
            r1.invoke(r3, r2, r0)
            return
    }
}
