package kotlinx.coroutines.flow;

/* compiled from: Builders.kt */
/* loaded from: classes2.dex */
final class SafeFlow<T> extends kotlinx.coroutines.flow.AbstractFlow<T> {
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> block;

    public SafeFlow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.block = r1
            return
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public java.lang.Object collectSafely(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r1.block
            java.lang.Object r2 = r0.invoke(r2, r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto Ld
            return r2
        Ld:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }
}
