package kotlinx.coroutines;

/* compiled from: Builders.common.kt */
/* loaded from: classes2.dex */
final class LazyStandaloneCoroutine extends kotlinx.coroutines.StandaloneCoroutine {
    private final kotlin.coroutines.Continuation<kotlin.Unit> continuation;

    public LazyStandaloneCoroutine(kotlin.coroutines.CoroutineContext r2, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(r3, r1, r1)
            r1.continuation = r2
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void onStart() {
            r1 = this;
            kotlin.coroutines.Continuation<kotlin.Unit> r0 = r1.continuation
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1)
            return
    }
}
