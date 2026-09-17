package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class ChildContinuation extends kotlinx.coroutines.JobCancellingNode {
    public final kotlinx.coroutines.CancellableContinuationImpl<?> child;

    public ChildContinuation(kotlinx.coroutines.CancellableContinuationImpl<?> r1) {
            r0 = this;
            r0.<init>()
            r0.child = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.invoke2(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.CancellableContinuationImpl<?> r2 = r1.child
            kotlinx.coroutines.JobSupport r0 = r1.getJob()
            java.lang.Throwable r0 = r2.getContinuationCancellationCause(r0)
            r2.parentCancelled$kotlinx_coroutines_core(r0)
            return
    }
}
