package kotlinx.coroutines;

/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public interface Job extends kotlin.coroutines.CoroutineContext.Element {
    public static final kotlinx.coroutines.Job.Key Key = null;

    /* compiled from: Job.kt */
    public static final class DefaultImpls {
        public static <R> R fold(kotlinx.coroutines.Job r0, R r1, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r2) {
                java.lang.Object r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(r0, r1, r2)
                return r0
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.Job r0, kotlin.coroutines.CoroutineContext.Key<E> r1) {
                kotlin.coroutines.CoroutineContext$Element r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(r0, r1)
                return r0
        }

        public static /* synthetic */ kotlinx.coroutines.DisposableHandle invokeOnCompletion$default(kotlinx.coroutines.Job r0, boolean r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
                if (r5 != 0) goto L11
                r5 = r4 & 1
                if (r5 == 0) goto L7
                r1 = 0
            L7:
                r4 = r4 & 2
                if (r4 == 0) goto Lc
                r2 = 1
            Lc:
                kotlinx.coroutines.DisposableHandle r0 = r0.invokeOnCompletion(r1, r2, r3)
                return r0
            L11:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: invokeOnCompletion"
                r0.<init>(r1)
                throw r0
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.Job r0, kotlin.coroutines.CoroutineContext.Key<?> r1) {
                kotlin.coroutines.CoroutineContext r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(r0, r1)
                return r0
        }

        public static kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.Job r0, kotlin.coroutines.CoroutineContext r1) {
                kotlin.coroutines.CoroutineContext r0 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(r0, r1)
                return r0
        }
    }

    /* compiled from: Job.kt */
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.Job> {
        static final /* synthetic */ kotlinx.coroutines.Job.Key $$INSTANCE = null;

        static {
                kotlinx.coroutines.Job$Key r0 = new kotlinx.coroutines.Job$Key
                r0.<init>()
                kotlinx.coroutines.Job.Key.$$INSTANCE = r0
                return
        }

        private Key() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key.$$INSTANCE
            kotlinx.coroutines.Job.Key = r0
            return
    }

    kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob r1);

    void cancel(java.util.concurrent.CancellationException r1);

    java.util.concurrent.CancellationException getCancellationException();

    kotlinx.coroutines.Job getParent();

    kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r1);

    kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean r1, boolean r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3);

    boolean isActive();

    boolean isCancelled();

    boolean start();
}
