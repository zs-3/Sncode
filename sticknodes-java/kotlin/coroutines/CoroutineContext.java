package kotlin.coroutines;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public interface CoroutineContext {

    /* compiled from: CoroutineContext.kt */
    public static final class DefaultImpls {
        public static kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r1, kotlin.coroutines.CoroutineContext r2) {
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                if (r2 != r0) goto La
                goto L12
            La:
                kotlin.coroutines.CoroutineContext$plus$1 r0 = kotlin.coroutines.CoroutineContext.AnonymousClass1.INSTANCE
                java.lang.Object r1 = r2.fold(r1, r0)
                kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            L12:
                return r1
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface Element extends kotlin.coroutines.CoroutineContext {

        /* compiled from: CoroutineContext.kt */
        public static final class DefaultImpls {
            public static <R> R fold(kotlin.coroutines.CoroutineContext.Element r1, R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
                    java.lang.String r0 = "operation"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.Object r1 = r3.invoke(r2, r1)
                    return r1
            }

            public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Element r1, kotlin.coroutines.CoroutineContext.Key<E> r2) {
                    java.lang.String r0 = "key"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L15
                    java.lang.String r2 = "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get"
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
                    goto L16
                L15:
                    r1 = 0
                L16:
                    return r1
            }

            public static kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Element r1, kotlin.coroutines.CoroutineContext.Key<?> r2) {
                    java.lang.String r0 = "key"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
                    boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                    if (r2 == 0) goto L11
                    kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                L11:
                    return r1
            }

            public static kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext.Element r1, kotlin.coroutines.CoroutineContext r2) {
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    kotlin.coroutines.CoroutineContext r1 = kotlin.coroutines.CoroutineContext.DefaultImpls.plus(r1, r2)
                    return r1
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r1);

        kotlin.coroutines.CoroutineContext.Key<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface Key<E extends kotlin.coroutines.CoroutineContext.Element> {
    }


    <R> R fold(R r1, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2);

    <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r1);

    kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r1);

    kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r1);
}
