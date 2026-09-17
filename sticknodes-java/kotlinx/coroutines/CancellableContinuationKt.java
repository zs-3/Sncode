package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes2.dex */
public final class CancellableContinuationKt {
    public static final void disposeOnCancellation(kotlinx.coroutines.CancellableContinuation<?> r1, kotlinx.coroutines.DisposableHandle r2) {
            kotlinx.coroutines.DisposeOnCancel r0 = new kotlinx.coroutines.DisposeOnCancel
            r0.<init>(r2)
            r1.invokeOnCancellation(r0)
            return
    }

    public static final <T> kotlinx.coroutines.CancellableContinuationImpl<T> getOrCreateCancellableContinuation(kotlin.coroutines.Continuation<? super T> r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 != 0) goto Lb
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        Lb:
            r0 = r2
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0
            kotlinx.coroutines.CancellableContinuationImpl r0 = r0.claimReusableCancellableContinuation$kotlinx_coroutines_core()
            if (r0 == 0) goto L20
            boolean r1 = r0.resetStateReusable()
            if (r1 == 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L1f
            goto L20
        L1f:
            return r0
        L20:
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            r1 = 2
            r0.<init>(r2, r1)
            return r0
    }
}
