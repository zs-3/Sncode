package kotlinx.coroutines;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
public final class DispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decision$FU = null;
    private volatile int _decision;

    static {
            java.lang.Class<kotlinx.coroutines.DispatchedCoroutine> r0 = kotlinx.coroutines.DispatchedCoroutine.class
            java.lang.String r1 = "_decision"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.DispatchedCoroutine._decision$FU = r0
            return
    }

    public DispatchedCoroutine(kotlin.coroutines.CoroutineContext r1, kotlin.coroutines.Continuation<? super T> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private final boolean tryResume() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.DispatchedCoroutine._decision$FU
        L2:
            int r1 = r0.get(r5)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 != r3) goto Ld
            return r2
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.DispatchedCoroutine._decision$FU
            r4 = 2
            boolean r1 = r1.compareAndSet(r5, r2, r4)
            if (r1 == 0) goto L2
            return r3
    }

    private final boolean trySuspend() {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.DispatchedCoroutine._decision$FU
        L2:
            int r1 = r0.get(r4)
            r2 = 0
            if (r1 == 0) goto L19
            r0 = 2
            if (r1 != r0) goto Ld
            return r2
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.DispatchedCoroutine._decision$FU
            r3 = 1
            boolean r1 = r1.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L2
            return r3
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object r1) {
            r0 = this;
            r0.afterResume(r1)
            return
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.tryResume()
            if (r0 == 0) goto L7
            return
        L7:
            kotlin.coroutines.Continuation<T> r0 = r3.uCont
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            kotlin.coroutines.Continuation<T> r1 = r3.uCont
            java.lang.Object r4 = kotlinx.coroutines.CompletionStateKt.recoverResult(r4, r1)
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(r0, r4, r2, r1, r2)
            return
    }

    public final java.lang.Object getResult$kotlinx_coroutines_core() {
            r2 = this;
            boolean r0 = r2.trySuspend()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        Lb:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L18
            return r0
        L18:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
    }
}
