package kotlinx.coroutines;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlin.coroutines.ContinuationInterceptor {
    public static final kotlinx.coroutines.CoroutineDispatcher.Key Key = null;

    /* compiled from: CoroutineDispatcher.kt */
    public static final class Key extends kotlin.coroutines.AbstractCoroutineContextKey<kotlin.coroutines.ContinuationInterceptor, kotlinx.coroutines.CoroutineDispatcher> {


        private Key() {
                r2 = this;
                kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
                kotlinx.coroutines.CoroutineDispatcher$Key$1 r1 = kotlinx.coroutines.CoroutineDispatcher.Key.AnonymousClass1.INSTANCE
                r2.<init>(r0, r1)
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.CoroutineDispatcher$Key r0 = new kotlinx.coroutines.CoroutineDispatcher$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.CoroutineDispatcher.Key = r0
            return
    }

    public CoroutineDispatcher() {
            r1 = this;
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            r1.<init>(r0)
            return
    }

    /* renamed from: dispatch */
    public abstract void mo128dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2);

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext$Element r1 = kotlin.coroutines.ContinuationInterceptor.DefaultImpls.get(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> kotlin.coroutines.Continuation<T> interceptContinuation(kotlin.coroutines.Continuation<? super T> r2) {
            r1 = this;
            kotlinx.coroutines.internal.DispatchedContinuation r0 = new kotlinx.coroutines.internal.DispatchedContinuation
            r0.<init>(r1, r2)
            return r0
    }

    public boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            kotlinx.coroutines.internal.LimitedDispatcher r0 = new kotlinx.coroutines.internal.LimitedDispatcher
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.ContinuationInterceptor.DefaultImpls.minusKey(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            kotlinx.coroutines.internal.DispatchedContinuation r2 = (kotlinx.coroutines.internal.DispatchedContinuation) r2
            r2.release$kotlinx_coroutines_core()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
