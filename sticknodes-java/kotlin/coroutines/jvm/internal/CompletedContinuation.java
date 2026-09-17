package kotlin.coroutines.jvm.internal;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public final class CompletedContinuation implements kotlin.coroutines.Continuation<java.lang.Object> {
    public static final kotlin.coroutines.jvm.internal.CompletedContinuation INSTANCE = null;

    static {
            kotlin.coroutines.jvm.internal.CompletedContinuation r0 = new kotlin.coroutines.jvm.internal.CompletedContinuation
            r0.<init>()
            kotlin.coroutines.jvm.internal.CompletedContinuation.INSTANCE = r0
            return
    }

    private CompletedContinuation() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This continuation is already complete"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This continuation is already complete"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "This continuation is already complete"
            return r0
    }
}
