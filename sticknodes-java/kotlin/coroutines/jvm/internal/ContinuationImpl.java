package kotlin.coroutines.jvm.internal;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes2.dex */
public abstract class ContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {
    private final kotlin.coroutines.CoroutineContext _context;
    private transient kotlin.coroutines.Continuation<java.lang.Object> intercepted;

    public ContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
    }

    public ContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> r1, kotlin.coroutines.CoroutineContext r2) {
            r0 = this;
            r0.<init>(r1)
            r0._context = r2
            return
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1._context
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    public final kotlin.coroutines.Continuation<java.lang.Object> intercepted() {
            r2 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r2.intercepted
            if (r0 != 0) goto L1b
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlin.coroutines.ContinuationInterceptor r0 = (kotlin.coroutines.ContinuationInterceptor) r0
            if (r0 == 0) goto L18
            kotlin.coroutines.Continuation r0 = r0.interceptContinuation(r2)
            if (r0 != 0) goto L19
        L18:
            r0 = r2
        L19:
            r2.intercepted = r0
        L1b:
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected void releaseIntercepted() {
            r3 = this;
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r3.intercepted
            if (r0 == 0) goto L18
            if (r0 == r3) goto L18
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.coroutines.ContinuationInterceptor r1 = (kotlin.coroutines.ContinuationInterceptor) r1
            r1.releaseInterceptedContinuation(r0)
        L18:
            kotlin.coroutines.jvm.internal.CompletedContinuation r0 = kotlin.coroutines.jvm.internal.CompletedContinuation.INSTANCE
            r3.intercepted = r0
            return
    }
}
