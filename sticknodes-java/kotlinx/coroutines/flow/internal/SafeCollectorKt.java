package kotlinx.coroutines.flow.internal;

/* compiled from: SafeCollector.kt */
/* loaded from: classes2.dex */
public final class SafeCollectorKt {
    private static final kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<java.lang.Object>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> emitFun = null;

    static {
            kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1 r0 = kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1.INSTANCE
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r1 = 3
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r0, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.internal.SafeCollectorKt.emitFun = r0
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 access$getEmitFun$p() {
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<java.lang.Object>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = kotlinx.coroutines.flow.internal.SafeCollectorKt.emitFun
            return r0
    }
}
