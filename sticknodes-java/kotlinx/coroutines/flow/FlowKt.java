package kotlinx.coroutines.flow;

/* loaded from: classes2.dex */
public final class FlowKt {
    /* renamed from: catch, reason: not valid java name */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m123catch(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.m124catch(r0, r1)
            return r0
    }

    public static final <T> java.lang.Object catchImpl(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<? super java.lang.Throwable> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ErrorsKt.catchImpl(r0, r1, r2)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> dropWhile(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r1) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.dropWhile(r0, r1)
            return r0
    }

    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> r0, kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__CollectKt.emitAll(r0, r1, r2)
            return r0
    }

    public static final void ensureActive(kotlinx.coroutines.flow.FlowCollector<?> r0) {
            kotlinx.coroutines.flow.FlowKt__EmittersKt.ensureActive(r0)
            return
    }

    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlin.coroutines.Continuation<? super T> r1) {
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ReduceKt.first(r0, r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r0) {
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt__BuildersKt.flow(r0)
            return r0
    }
}
