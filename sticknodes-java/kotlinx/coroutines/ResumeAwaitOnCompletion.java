package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
final class ResumeAwaitOnCompletion<T> extends kotlinx.coroutines.JobNode {
    private final kotlinx.coroutines.CancellableContinuationImpl<T> continuation;

    public ResumeAwaitOnCompletion(kotlinx.coroutines.CancellableContinuationImpl<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.continuation = r1
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
    public void invoke2(java.lang.Throwable r3) {
            r2 = this;
            kotlinx.coroutines.JobSupport r3 = r2.getJob()
            java.lang.Object r3 = r3.getState$kotlinx_coroutines_core()
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L20
            kotlinx.coroutines.CancellableContinuationImpl<T> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
            java.lang.Throwable r3 = r3.cause
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m72constructorimpl(r3)
            r0.resumeWith(r3)
            goto L2f
        L20:
            kotlinx.coroutines.CancellableContinuationImpl<T> r0 = r2.continuation
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlinx.coroutines.JobSupportKt.unboxState(r3)
            java.lang.Object r3 = kotlin.Result.m72constructorimpl(r3)
            r0.resumeWith(r3)
        L2f:
            return
    }
}
