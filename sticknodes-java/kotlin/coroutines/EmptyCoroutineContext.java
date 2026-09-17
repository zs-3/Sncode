package kotlin.coroutines;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public final class EmptyCoroutineContext implements kotlin.coroutines.CoroutineContext, java.io.Serializable {
    public static final kotlin.coroutines.EmptyCoroutineContext INSTANCE = null;

    static {
            kotlin.coroutines.EmptyCoroutineContext r0 = new kotlin.coroutines.EmptyCoroutineContext
            r0.<init>()
            kotlin.coroutines.EmptyCoroutineContext.INSTANCE = r0
            return
    }

    private EmptyCoroutineContext() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            return r2
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return r1
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "EmptyCoroutineContext"
            return r0
    }
}
