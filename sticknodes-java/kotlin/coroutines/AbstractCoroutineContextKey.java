package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext.Element;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public abstract class AbstractCoroutineContextKey<B extends kotlin.coroutines.CoroutineContext.Element, E extends B> implements kotlin.coroutines.CoroutineContext.Key<E> {
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext.Element, E> safeCast;
    private final kotlin.coroutines.CoroutineContext.Key<?> topmostKey;

    public AbstractCoroutineContextKey(kotlin.coroutines.CoroutineContext.Key<B> r2, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext.Element, ? extends E> r3) {
            r1 = this;
            java.lang.String r0 = "baseKey"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "safeCast"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.safeCast = r3
            boolean r3 = r2 instanceof kotlin.coroutines.AbstractCoroutineContextKey
            if (r3 == 0) goto L17
            kotlin.coroutines.AbstractCoroutineContextKey r2 = (kotlin.coroutines.AbstractCoroutineContextKey) r2
            kotlin.coroutines.CoroutineContext$Key<?> r2 = r2.topmostKey
        L17:
            r1.topmostKey = r2
            return
    }

    public final boolean isSubKey$kotlin_stdlib(kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r2 == r1) goto Le
            kotlin.coroutines.CoroutineContext$Key<?> r0 = r1.topmostKey
            if (r0 != r2) goto Lc
            goto Le
        Lc:
            r2 = 0
            goto Lf
        Le:
            r2 = 1
        Lf:
            return r2
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    public final kotlin.coroutines.CoroutineContext.Element tryCast$kotlin_stdlib(kotlin.coroutines.CoroutineContext.Element r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B> r0 = r1.safeCast
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.coroutines.CoroutineContext$Element r2 = (kotlin.coroutines.CoroutineContext.Element) r2
            return r2
    }
}
