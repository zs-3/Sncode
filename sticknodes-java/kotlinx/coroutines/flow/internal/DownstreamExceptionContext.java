package kotlinx.coroutines.flow.internal;

/* compiled from: SafeCollector.kt */
/* loaded from: classes2.dex */
public final class DownstreamExceptionContext implements kotlin.coroutines.CoroutineContext {
    private final /* synthetic */ kotlin.coroutines.CoroutineContext $$delegate_0;
    public final java.lang.Throwable e;

    public DownstreamExceptionContext(java.lang.Throwable r1, kotlin.coroutines.CoroutineContext r2) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r0.$$delegate_0 = r2
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.$$delegate_0
            java.lang.Object r2 = r0.fold(r2, r3)
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.$$delegate_0
            kotlin.coroutines.CoroutineContext$Element r2 = r0.get(r2)
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.$$delegate_0
            kotlin.coroutines.CoroutineContext r2 = r0.minusKey(r2)
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.$$delegate_0
            kotlin.coroutines.CoroutineContext r2 = r0.plus(r2)
            return r2
    }
}
