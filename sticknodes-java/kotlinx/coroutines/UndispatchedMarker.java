package kotlinx.coroutines;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
final class UndispatchedMarker implements kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.UndispatchedMarker> {
    public static final kotlinx.coroutines.UndispatchedMarker INSTANCE = null;

    static {
            kotlinx.coroutines.UndispatchedMarker r0 = new kotlinx.coroutines.UndispatchedMarker
            r0.<init>()
            kotlinx.coroutines.UndispatchedMarker.INSTANCE = r0
            return
    }

    private UndispatchedMarker() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r1, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(r0, r1, r2)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext$Element r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r0 = this;
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(r0, r1)
            return r1
    }
}
