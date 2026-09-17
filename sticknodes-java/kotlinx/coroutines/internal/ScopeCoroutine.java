package kotlinx.coroutines.internal;

/* compiled from: Scopes.kt */
/* loaded from: classes2.dex */
public class ScopeCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    public final kotlin.coroutines.Continuation<T> uCont;

    public ScopeCoroutine(kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.uCont = r3
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object r4) {
            r3 = this;
            kotlin.coroutines.Continuation<T> r0 = r3.uCont
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            kotlin.coroutines.Continuation<T> r1 = r3.uCont
            java.lang.Object r4 = kotlinx.coroutines.CompletionStateKt.recoverResult(r4, r1)
            r1 = 0
            r2 = 2
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(r0, r4, r1, r2, r1)
            return
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object r2) {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.uCont
            java.lang.Object r2 = kotlinx.coroutines.CompletionStateKt.recoverResult(r2, r0)
            r0.resumeWith(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.uCont
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final boolean isScopedCoroutine() {
            r1 = this;
            r0 = 1
            return r0
    }
}
