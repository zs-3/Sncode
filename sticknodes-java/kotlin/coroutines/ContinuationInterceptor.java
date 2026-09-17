package kotlin.coroutines;

/* compiled from: ContinuationInterceptor.kt */
/* loaded from: classes2.dex */
public interface ContinuationInterceptor extends kotlin.coroutines.CoroutineContext.Element {
    public static final kotlin.coroutines.ContinuationInterceptor.Key Key = null;

    /* compiled from: ContinuationInterceptor.kt */
    public static final class DefaultImpls {
        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.ContinuationInterceptor r2, kotlin.coroutines.CoroutineContext.Key<E> r3) {
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                boolean r0 = r3 instanceof kotlin.coroutines.AbstractCoroutineContextKey
                r1 = 0
                if (r0 == 0) goto L20
                kotlin.coroutines.AbstractCoroutineContextKey r3 = (kotlin.coroutines.AbstractCoroutineContextKey) r3
                kotlin.coroutines.CoroutineContext$Key r0 = r2.getKey()
                boolean r0 = r3.isSubKey$kotlin_stdlib(r0)
                if (r0 == 0) goto L1f
                kotlin.coroutines.CoroutineContext$Element r2 = r3.tryCast$kotlin_stdlib(r2)
                boolean r3 = r2 instanceof kotlin.coroutines.CoroutineContext.Element
                if (r3 == 0) goto L1f
                r1 = r2
            L1f:
                return r1
            L20:
                kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
                if (r0 != r3) goto L2a
                java.lang.String r3 = "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
                goto L2b
            L2a:
                r2 = r1
            L2b:
                return r2
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.ContinuationInterceptor r1, kotlin.coroutines.CoroutineContext.Key<?> r2) {
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                boolean r0 = r2 instanceof kotlin.coroutines.AbstractCoroutineContextKey
                if (r0 == 0) goto L1e
                kotlin.coroutines.AbstractCoroutineContextKey r2 = (kotlin.coroutines.AbstractCoroutineContextKey) r2
                kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
                boolean r0 = r2.isSubKey$kotlin_stdlib(r0)
                if (r0 == 0) goto L1d
                kotlin.coroutines.CoroutineContext$Element r2 = r2.tryCast$kotlin_stdlib(r1)
                if (r2 == 0) goto L1d
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            L1d:
                return r1
            L1e:
                kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
                if (r0 != r2) goto L24
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            L24:
                return r1
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlin.coroutines.ContinuationInterceptor> {
        static final /* synthetic */ kotlin.coroutines.ContinuationInterceptor.Key $$INSTANCE = null;

        static {
                kotlin.coroutines.ContinuationInterceptor$Key r0 = new kotlin.coroutines.ContinuationInterceptor$Key
                r0.<init>()
                kotlin.coroutines.ContinuationInterceptor.Key.$$INSTANCE = r0
                return
        }

        private Key() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key.$$INSTANCE
            kotlin.coroutines.ContinuationInterceptor.Key = r0
            return
    }

    <T> kotlin.coroutines.Continuation<T> interceptContinuation(kotlin.coroutines.Continuation<? super T> r1);

    void releaseInterceptedContinuation(kotlin.coroutines.Continuation<?> r1);
}
