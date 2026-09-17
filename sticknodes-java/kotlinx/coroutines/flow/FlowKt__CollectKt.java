package kotlinx.coroutines.flow;

/* compiled from: Collect.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__CollectKt {
    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> r0, kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            kotlinx.coroutines.flow.FlowKt.ensureActive(r0)
            java.lang.Object r0 = r1.collect(r0, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Le
            return r0
        Le:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
