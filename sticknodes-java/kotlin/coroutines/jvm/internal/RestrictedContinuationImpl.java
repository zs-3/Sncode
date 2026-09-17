package kotlin.coroutines.jvm.internal;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class RestrictedContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {
    public RestrictedContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> r2) {
            r1 = this;
            r1.<init>(r2)
            if (r2 == 0) goto L1f
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r2 != r0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L13
            goto L1f
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L1f:
            return
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            return r0
    }
}
