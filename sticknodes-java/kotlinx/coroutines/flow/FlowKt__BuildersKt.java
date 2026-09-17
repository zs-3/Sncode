package kotlinx.coroutines.flow;

/* compiled from: Builders.kt */
/* loaded from: classes2.dex */
final /* synthetic */ class FlowKt__BuildersKt {
    public static final <T> kotlinx.coroutines.flow.Flow<T> flow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.SafeFlow r0 = new kotlinx.coroutines.flow.SafeFlow
            r0.<init>(r1)
            return r0
    }
}
