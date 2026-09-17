package kotlinx.coroutines;

/* compiled from: CompletableDeferred.kt */
/* loaded from: classes2.dex */
final class CompletableDeferredImpl<T> extends kotlinx.coroutines.JobSupport implements kotlinx.coroutines.CompletableDeferred<T> {
    public CompletableDeferredImpl(kotlinx.coroutines.Job r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.initParentJob(r2)
            return
    }

    @Override // kotlinx.coroutines.Deferred
    public java.lang.Object await(kotlin.coroutines.Continuation<? super T> r1) {
            r0 = this;
            java.lang.Object r1 = r0.awaitInternal(r1)
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r1
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean complete(T r1) {
            r0 = this;
            boolean r1 = r0.makeCompleting$kotlinx_coroutines_core(r1)
            return r1
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public boolean completeExceptionally(java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            boolean r5 = r4.makeCompleting$kotlinx_coroutines_core(r0)
            return r5
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.getCompletedInternal$kotlinx_coroutines_core()
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }
}
