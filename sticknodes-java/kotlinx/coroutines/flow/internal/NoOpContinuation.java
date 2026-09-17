package kotlinx.coroutines.flow.internal;

/* compiled from: SafeCollector.kt */
/* loaded from: classes2.dex */
final class NoOpContinuation implements kotlin.coroutines.Continuation<java.lang.Object> {
    public static final kotlinx.coroutines.flow.internal.NoOpContinuation INSTANCE = null;
    private static final kotlin.coroutines.CoroutineContext context = null;

    static {
            kotlinx.coroutines.flow.internal.NoOpContinuation r0 = new kotlinx.coroutines.flow.internal.NoOpContinuation
            r0.<init>()
            kotlinx.coroutines.flow.internal.NoOpContinuation.INSTANCE = r0
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlinx.coroutines.flow.internal.NoOpContinuation.context = r0
            return
    }

    private NoOpContinuation() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.flow.internal.NoOpContinuation.context
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r1) {
            r0 = this;
            return
    }
}
